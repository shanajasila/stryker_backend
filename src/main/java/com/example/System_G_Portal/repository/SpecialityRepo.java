package com.example.System_G_Portal.repository;

import com.example.System_G_Portal.model.dao.SpecialityAttachments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpecialityRepo extends JpaRepository<SpecialityAttachments,Integer> {
  @Query(value = "SELECT `id`, `order_id`, `item_name`, `qty`, `size`, `serial_no`, `status`, `ticket_id` FROM `speciality_attachments`",nativeQuery = true)
  List<SpecialityAttachments>viewSpecialityById();
}
