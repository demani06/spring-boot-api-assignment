package com.deepak.springbootapimongodb.service;

import com.deepak.springbootapimongodb.model.NACEDetail;
import com.deepak.springbootapimongodb.repository.NACEDetailRepository;
import com.deepak.springbootapimongodb.request.NACERequestDetail;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class NACEService {

    @Autowired
    private NACEDetailRepository naceDetailRepository;

    public Optional<NACEDetail> getNACEDetails(String order) {
        final var byOrder = naceDetailRepository.findById(order);
        log.info("got NACEDetails {}", byOrder);
        return byOrder;
    }

    public NACEDetail putNACEDetails(NACERequestDetail naceRequestDetail) {

        NACEDetail naceDetail = getNACEDetailModelFromRequest(naceRequestDetail);
        log.info("creating NACEDetails {}", naceDetail);
        return naceDetailRepository.save(naceDetail);
    }

    private NACEDetail getNACEDetailModelFromRequest(NACERequestDetail naceRequestDetail) {
        NACEDetail naceDetail = new NACEDetail();
        //TODO full mapping
        naceDetail.setOrder(naceRequestDetail.getOrder());
        naceDetail.setLevel(naceRequestDetail.getLevel());
        naceDetail.setCode(naceRequestDetail.getCode());
        naceDetail.setParent(naceRequestDetail.getParent());

        return naceDetail;
    }
}
