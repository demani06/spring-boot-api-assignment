package com.deepak.springbootapimongodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "NACEDetails")
@Document(collection = "collection3")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class NACEDetail {

    @Id
    private String order;
    private String level;
    private String code;
    private String parent;
    private String description;
    //TODO add other fields
    private String rulings;
    private String referenceToISICRev;


}
