package com.example.System_G_Portal.model.dao;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "speciality_attachments")
public class SpecialityAttachments {
        @Id
        @GeneratedValue
        private int id;
        private String order_id;
        private String item_name;
        private int qty;
        private int size;
        private String serial_no;
        private String status;

        public SpecialityAttachments() {
        }

        public SpecialityAttachments(int id, String order_id, String item_name, int qty, int size, String serial_no, String status) {
            this.id = id;
            this.order_id = order_id;
            this.item_name = item_name;
            this.qty = qty;
            this.size = size;
            this.serial_no = serial_no;
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }

        public String getItem_name() {
            return item_name;
        }

        public void setItem_name(String item_name) {
            this.item_name = item_name;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getSerial_no() {
            return serial_no;
        }

        public void setSerial_no(String serial_no) {
            this.serial_no = serial_no;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
}
