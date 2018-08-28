package com.xingyun.sharehomeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xingyun.sharehomeapp.model.HomeInfo;

import java.util.List;

@Repository
public interface HomeInfoRepository extends JpaRepository<HomeInfo,Long>{

	//自定义接口
	List<HomeInfo> findByHomeInfoMoneyByOneMonth(String homeInfoMoneyByOneMonth);

	
}
