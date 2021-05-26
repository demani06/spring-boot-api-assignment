package com.deepak.springbootapimongodb.repository;

import com.deepak.springbootapimongodb.model.NACEDetail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.deepak.springbootapimongodb.utils.DataUtils.getTestNACEDetail;
import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
@ExtendWith(SpringExtension.class)
public class NACEDetailRepositoryTest {

    @Autowired
    private NACEDetailRepository naceDetailRepository;


    @Test
    public void testSavingNACEDetailIfWorkedSuccessfully() {

        NACEDetail naceDetail = getTestNACEDetail();

        naceDetailRepository.save(naceDetail);

        //final NACEDetail byOrder = naceDetailRepository.findByOrder(naceDetail.getOrder()).get();
        final NACEDetail byOrder = naceDetailRepository.findById(naceDetail.getOrder()).get();

        assertThat(byOrder).isNotNull();
        assertThat(byOrder.getOrder()).isEqualTo(naceDetail.getOrder());
        assertThat(byOrder.getCode()).isEqualTo(naceDetail.getCode());
    }


}
