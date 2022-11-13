package org.example.encap;

import org.example.Poly.PerformanceTeam;
import org.example.inherit.IdolDancer;
import org.example.inherit.StreetDancer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DancerTest {

        @Test
        void danceTest() {
//            Dancer dancer = new Dancer("서울짱크루", Grade.HIGH, "춤신춤왕");
//            dancer.dance();
//            dancer.setHeight(999);
//            System.out.println("dancer = " + dancer);
        }

        @Test
        void idolTest(){

            IdolDancer jungguk = new IdolDancer("BTS",Grade.HIGH, "정국");
            jungguk.dance();

            StreetDancer park = new StreetDancer("을지로크루", Grade.HIGH, "박춤꾼");
            park.dance();

            System.out.println("jungguk = " + jungguk);
        }

        @Test
        void teamTest(){
            PerformanceTeam team = new PerformanceTeam();

            Dancer kim = new IdolDancer("동방신기", Grade.HIGH, "영웅재중");

            Dancer mokma = new StreetDancer("말발굽", Grade.HIGH, "김목마");

            team.addDancer(kim);
            team.addDancer(mokma);

        }
}