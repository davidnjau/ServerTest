package com.example.servertest;

import org.springframework.stereotype.Service;

@Service
public class Lookup {


    public String getData(){
        DbFormatter dbFormatter = new DbFormatter();
        return dbFormatter.getData();
    }

}
