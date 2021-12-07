package com.escape.room.dto;

import com.escape.room.entity.Store;
import com.escape.room.repository.StoreRepository;
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
    private List<BranchInfoDto> branchList;

    public StoreResponse(Store entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }

}
