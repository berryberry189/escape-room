package com.escape.room.dto;

import com.escape.room.entity.Branch;
import com.escape.room.enums.Area;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BranchInfo {

    private Long id;
    private String name;
    private Area area;

    @JsonIgnore
    private Long storeId;

    public BranchInfo(Branch entity){
        this.id = entity.getId();
        this.storeId = entity.getStore().getId();
        this.name = entity.getName();
        this.area = entity.getArea();
    }

}
