package com.arturmolla.producer.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "message")
public class MessageRequest extends AbstractBaseEntity{

    private String header;
    private String message;
    private Long number;
}
