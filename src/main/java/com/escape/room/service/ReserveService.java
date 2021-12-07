package com.escape.room.service;

import com.escape.room.crawling.CrawlingHandler;
import com.escape.room.dto.BranchInfoDto;
import com.escape.room.dto.ProgramResponse;
import com.escape.room.dto.StoreResponse;
import com.escape.room.entity.Branch;
import com.escape.room.repository.BranchRepository;
import com.escape.room.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ReserveService {

    private final StoreRepository storeRepository;
    private final BranchRepository branchRepository;
    private final CrawlingHandler crawlingHandler;

    /**
     * 전체 가게 & 지점 목록
     *
     * @return
     */
    public List<StoreResponse> getStoreList(){

        List<StoreResponse> storeList = storeRepository.findAll().stream()
                .map(StoreResponse::new)
                .collect(Collectors.toList());

        Map<Long, List<BranchInfoDto>> branchListMap = getBranchListMap();

        storeList.forEach(s -> s.setBranchList(branchListMap.get(s.getId())));

        return storeList;
    }

    private Map<Long, List<BranchInfoDto>> getBranchListMap() {
        List<BranchInfoDto> branchList = branchRepository.findAll().stream()
                .map(BranchInfoDto::new)
                .collect(Collectors.toList());

        Map<Long, List<BranchInfoDto>> branchListMap = branchList.stream()
                .collect(Collectors.groupingBy(b -> b.getStoreId()));

        return branchListMap;
    }

    /**
     * 지점의 프로그램 & 예약 가능 시간대 목록
     *
     * @param storeId
     * @param branchId
     * @return
     */
    public List<ProgramResponse> getProgramList(Long storeId, Long branchId){

        Branch branch = branchRepository.findById(branchId)
                .orElseThrow(()-> new IllegalArgumentException("지점이 존재하지 않습니다."));

        return crawlingHandler.getCrawlingData(storeId, branch.getUrl());
    }


}
