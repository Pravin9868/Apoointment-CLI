package com.user.regis;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class NewAppoint {
    private String topic;
    private Date date;

    public NewAppoint(String topic, Date date) {
        this.topic = topic;
        this.date = date;
    }

    public String gettopic() {
        return topic;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return "topic: " + topic + ", Date: " + dateFormat.format(date);
    }
}

class NewAppointSchedule {
    private ArrayList<NewAppoint> NewAppoints;

    public NewAppointSchedule() {
        this.NewAppoints = new ArrayList<>();
    }

    public void addNewAppoint(NewAppoint NewAppoint) {
        NewAppoints.add(NewAppoint);
        System.out.println("NewAppoint added successfully.");
    }

    public void viewNewAppoints() {
        if (NewAppoints.isEmpty()) {
            System.out.println("No NewAppoints available.");
        } else {
            System.out.println("NewAppoints:");
            for (NewAppoint NewAppoint : NewAppoints) {
                System.out.println(NewAppoint);
            }
        }
    }
}

 class Ap {
    public static void main(String[] args) {
        NewAppointSchedule schedule = new NewAppointSchedule();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Appointment");
            System.out.println("2. View Appointment");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int ch = sc.nextInt();
            sc.nextLine(); // it is used because we have to input the Character in New Line.

            switch (ch) {
                case 1:
                    System.out.print("Enter NewAppoint topic: ");
                    String topic = sc.nextLine();

                    System.out.print("Enter Appointment date and time (yyyy-MM-dd HH:mm): ");
                    String dateString = sc.nextLine();

                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                        Date date = dateFormat.parse(dateString);
                        NewAppoint np = new NewAppoint(topic, date);
                        schedule.addNewAppoint(np);
                    } catch (Exception e) {
                        System.out.println("Invalid date format. Please use yyyy-MM-dd HH:mm.");
                    }
                    break;
                case 2:
                    schedule.viewNewAppoints();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}

