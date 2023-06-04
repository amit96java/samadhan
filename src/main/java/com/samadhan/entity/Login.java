package com.samadhan.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Login {
    @Id
    private String mobile;
    @Column
    private String otp;
}
