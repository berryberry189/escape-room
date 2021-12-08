package com.escape.room.dto;

import com.escape.room.entity.Store;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class StoreResponse {

    private Long id;
    private String name;
    private List<BranchInfo> branchList;

    public StoreResponse(Store entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }

}
