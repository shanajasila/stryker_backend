package com.example.System_G_Portal.repository;

import com.example.System_G_Portal.model.dao.TicketInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TicketInfoRepo extends JpaRepository<TicketInfo,Integer> {
    @Query(value = "SELECT `id`, `ticket_id`, `surgery_name`, `date`, `time`, `doctor_name`, `hospital_name`, `priority`, `status`, `item_count`, `assigned_agent` FROM `ticket_info_card` WHERE `ticket_id`= :ticket_id",nativeQuery = true)
    List<TicketInfo>viewTicketById(@Param("ticket_id")String ticket_id);

}
