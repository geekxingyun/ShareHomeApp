package com.xingyun.sharehomeapp.repository;

import com.xingyun.sharehomeapp.model.db.HomeInfoDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeInfoDeviceRepository extends JpaRepository<HomeInfoDevice,Long> {
}
