package com.escape.room.service;

import com.escape.room.parser.ParserHandler;
import com.escape.room.dto.BranchInfo;
import com.escape.room.dto.ProgramInfo;
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
    private final ParserHandler parserHandler;

    /**
     * 전체 가게 & 지점 목록
     *
     * @return
     */
    public List<StoreResponse> getStoreList(){

        List<StoreResponse> storeList = storeRepository.findAll().stream()
                .map(StoreResponse::new)
                .collect(Collectors.toList());

        Map<Long, List<BranchInfo>> branchListMap = getBranchListMap();

        storeList.forEach(s -> s.setBranchList(branchListMap.get(s.getId())));

        return storeList;
    }

    private Map<Long, List<BranchInfo>> getBranchListMap() {
        List<BranchInfo> branchList = branchRepository.findAll().stream()
                .map(BranchInfo::new)
                .collect(Collectors.toList());

        Map<Long, List<BranchInfo>> branchListMap = branchList.stream()
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
    public List<ProgramInfo> getProgramList(Long storeId, Long branchId){

        Branch branch = branchRepository.findById(branchId)
                .orElseThrow(()-> new IllegalArgumentException("지점이 존재하지 않습니다."));

        return parserHandler.getCrawlingData(storeId, branch.getUrl());
    }


}
