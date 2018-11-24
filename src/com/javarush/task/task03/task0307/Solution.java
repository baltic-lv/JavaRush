package com.javarush.task.task03.task0307;
/*Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name="Zerg01";
        Zerg zerg2 = new Zerg();
        zerg2.name="Zerg02";
        Zerg zerg3 = new Zerg();
        zerg3.name="Zerg031";
        Zerg zerg4 = new Zerg();
        zerg4.name="Zerg04";
        Zerg zerg5 = new Zerg();
        zerg5.name="Zerg05";

        Protoss protoss1=new Protoss();
        protoss1.name="Protoss01";
        Protoss protoss2=new Protoss();
        protoss2.name="Protoss02";
        Protoss protoss3=new Protoss();
        protoss3.name="Protoss03";

        Terran terran1 = new Terran();
        terran1.name="Terran01";
        Terran terran2 = new Terran();
        terran2.name="Terran02";
        Terran terran3 = new Terran();
        terran3.name="Terran03";
        Terran terran4 = new Terran();
        terran4.name="Terran04";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}