package com.tong.stud;

public class Graduatestudent extends Student {



        int thesis;

        public Graduatestudent(String id, String name, int english, int math, int thesis) {
            super(id, name, english, math);
            this.thesis = thesis;
        }

        public void mail() {
        }
    }
