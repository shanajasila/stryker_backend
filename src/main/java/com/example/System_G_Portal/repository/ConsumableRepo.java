package com.example.System_G_Portal.repository;

import com.example.System_G_Portal.model.dao.Consumables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ConsumableRepo extends JpaRepository<Consumables,Integer> {
  @Query(value = "SELECT `id`, `ticket_id`, `order_id`, `item_name`, `qty`, `size`, `serial_no`, `status` FROM `consumables` ",nativeQuery = true)
  List<Consumables>viewConsumablesById();
}
