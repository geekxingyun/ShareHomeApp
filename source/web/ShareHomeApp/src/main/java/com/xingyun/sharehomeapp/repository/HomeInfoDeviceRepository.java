package com.xingyun.sharehomeapp.repository;

import com.xingyun.sharehomeapp.model.db.HomeInfoDevice;
import com.xingyun.sharehomeapp.model.db.HomeInfoPic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeInfoDeviceRepository extends JpaRepository<HomeInfoDevice,Long> {

    List<HomeInfoDevice> findAllByHomeInfoDeviceId(Long homeInfoDeviceId);

    void deleteAllByHomeInfoDeviceId(Long homeInfoDeviceId);
}
