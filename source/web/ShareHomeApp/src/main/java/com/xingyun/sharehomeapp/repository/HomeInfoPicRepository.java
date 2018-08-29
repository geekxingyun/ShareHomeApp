package com.xingyun.sharehomeapp.repository;

import com.xingyun.sharehomeapp.model.db.HomeInfoPic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeInfoPicRepository extends JpaRepository<HomeInfoPic,Long> {
}
