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
    private String address;
    private String phone;
    private String url;

    private String storeName;

    @JsonIgnore
    private Long storeId;

    public BranchInfo(Branch entity){
        this.id = entity.getId();
        this.storeId = entity.getStore().getId();
        this.name = entity.getName();
        this.area = entity.getArea();
        this.storeName = entity.getStore().getName();
        this.address = entity.getAddress();
        this.phone = entity.getPhone();
        this.url = entity.getUrl();
    }

}
