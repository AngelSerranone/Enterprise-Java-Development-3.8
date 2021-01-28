package com.ironhack.Lab3_8.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Exposition extends Event {

    public Exposition() {
    }

    public Exposition(Date date, double duration, String location, String title) {
        super(date, duration, location, title);
    }

}
