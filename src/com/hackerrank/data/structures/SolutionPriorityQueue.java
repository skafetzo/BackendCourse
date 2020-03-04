package com.hackerrank.data.structures;

import java.util.*;

/*Solves the Priority Queue  problem of Data Structures */


public class SolutionPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

            List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }


   static class Priorities {

        List<Student> getStudents(List<String> events){


            PriorityQueue < Student > studentsQueue = new PriorityQueue(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getId));



            for (String event : events){
                if (event.startsWith("ENTER")){
                    String[] parts= event.split(" ");
                    studentsQueue.add(new Student(parts[1], Integer.parseInt(parts[3]), Double.parseDouble(parts[2])));
                }else if (event.startsWith("SERVED")){
                  studentsQueue.poll();
                }
            }

            while(studentsQueue.size()>1)
            {
                System.out.println(studentsQueue.poll().getName());
            }
            List < Student > students = new ArrayList(studentsQueue);
            return students;
        }

    }

   static class Student {

        private String name;
        private int id;
        private double cgpa;

        public Student(String name, int id, double cgpa) {
            this.name = name;
            this.id = id;
            this.cgpa = cgpa;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getCgpa() {
            return cgpa;
        }

        public void setCgpa(double cgpa) {
            this.cgpa = cgpa;
        }
    }
}


