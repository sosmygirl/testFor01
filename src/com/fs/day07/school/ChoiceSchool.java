package com.fs.day07.school;

public class ChoiceSchool {
    public static void main(String[] args) {
/*        School school01;
        school01 = new School();
        school01.name = "成都理工大学";
        school01.location = "成都市成华区";
        school01.area = 1500;
        school01.number = 20000;
        school01.contact  = 12345667L;*/
        School school = new School();
//        School school1 = new School("四川大学");
//        school1.getName();
        //set
        school.setName("成都理工大学");
        school.setLocation("成都市成华区");
        school.setArea(1500);
        school.setNumber(2000);
        school.setContact(1234567L);
        System.out.println("你选择的学校的名字:" + school.getName());
    }

}
