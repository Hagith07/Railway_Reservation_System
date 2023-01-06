import java.util.Scanner;

public class Booking {
    int book_id;
    String name;
    int age;
    char birth_given;
    char preferred_birth;
    String status;

    public Booking(int book_id, String name, int age, char birth_preference, String status) {
        this.book_id = book_id;
        this.name = name;
        this.age = age;
        this.birth_given = birth_preference;
        this.status = status;
    }

    static Booking book[] = new Booking[100];
    static int book_index = 0;

    public static void ticket_booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter Your Age: ");
        int Age = sc.nextInt();
        System.out.println("Enter Your Berth Preference: ");
        char berth = sc.next().charAt(0);
        switch (berth) {
            case 'L':
                if (Main.lower != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, berth, "Booked");
                    Main.lower--;
                    System.out.println("Ticket Booked Sucessfully");
                    System.out.println("Your Berth was " + berth);
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else if (Main.middle != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, 'M', "Booked");
                    book[book_index - 1].preferred_birth = berth;
                    Main.middle--;
                    System.out.println("Ticket Booked Sucessfully");
                    System.out.println("Your Berth was not available it was given as " + 'M');
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else if (Main.upper != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, 'U', "Booked");
                    book[book_index - 1].preferred_birth = berth;
                    Main.upper--;
                    System.out.println("Ticket Booked Sucessfully");
                    System.out.println("Your Berth was not available it was given as " + 'U');
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else if (Main.rac != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, 'R', "Booked");
                    book[book_index - 1].preferred_birth = berth;
                    Main.rac--;
                    System.out.println("Ticket Booked Sucessfully");
                    System.out.println("Your Berth was under RAC");
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else if (Main.waiting_list != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, 'W', "Booked");
                    book[book_index - 1].preferred_birth = berth;
                    Main.waiting_list--;
                    System.out.println("Ticket was under waiting list number: " + (10 - Main.waiting_list));
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else {
                    System.out.println("No Tickets Available");
                    break;
                }
            case 'M':
                if (Main.middle != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, berth, "Booked");
                    Main.middle--;
                    System.out.println("Ticket Booked Sucessfully");
                    System.out.println("Your Berth was " + berth);
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else if (Main.lower != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, 'L', "Booked");
                    book[book_index - 1].preferred_birth = berth;
                    Main.lower--;
                    System.out.println("Ticket Booked Sucessfully");
                    System.out.println("Your Berth was not available it was given as" + 'L');
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else if (Main.upper != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, 'U', "Booked");
                    book[book_index - 1].preferred_birth = berth;
                    Main.upper--;
                    System.out.println("Ticket Booked Successfully");
                    System.out.println("Your Berth was not available it was given as" + 'U');
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else if (Main.rac != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, 'R', "Booked");
                    book[book_index - 1].preferred_birth = berth;
                    Main.rac--;
                    System.out.println("Ticket Booked Sucessfully");
                    System.out.println("Your Berth was under RAC");
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else if (Main.waiting_list != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, 'W', "Booked");
                    book[book_index - 1].preferred_birth = berth;
                    Main.waiting_list--;
                    System.out.println("Ticket was under waiting list number: " + (10 - Main.waiting_list));
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else {
                    System.out.println("No Tickets Available");
                    break;
                }
            case 'U':
                if (Main.upper != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, berth, "Booked");
                    Main.upper--;
                    System.out.println("Ticket Booked Sucessfully");
                    System.out.println("Your Berth was " + berth);
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else if (Main.lower != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, 'L', "Booked");
                    book[book_index - 1].preferred_birth = berth;
                    Main.lower--;
                    System.out.println("Ticket Booked Sucessfully");
                    System.out.println("Your Berth was not available it was given as " + 'L');
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else if (Main.middle != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, 'M', "Booked");
                    book[book_index - 1].preferred_birth = berth;
                    Main.middle--;
                    System.out.println("Ticket Booked Sucessfully");
                    System.out.println("Your Berth was not available it was given as " + 'M');
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else if (Main.rac != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, 'R', "Booked");
                    book[book_index - 1].preferred_birth = berth;
                    Main.rac--;
                    System.out.println("Ticket Booked Sucessfully");
                    System.out.println("Your Berth was under RAC");
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else if (Main.waiting_list != 0) {
                    book[book_index] = new Booking(book_index++, Name, Age, 'W', "Booked");
                    book[book_index - 1].preferred_birth = berth;
                    Main.waiting_list--;
                    System.out.println("Ticket was under waiting list number: " + (10 - Main.waiting_list));
                    System.out.println("Your Booking ID was: " + book_index);
                    break;
                } else {
                    System.out.println("No Tickets Available");
                    break;
                }
        }
    }

    public static void ticket_cancelling() {
        System.out.println("Enter your booking ID: ");
        int id = Main.sc.nextInt();
        if (id <= book_index) {
            book[id - 1].status = "Cancelled";
            System.out.println("Your Ticket was Cancelled Sucessfully");
            boolean count = false;
            for (int i = 0; i < book_index; i++) {
                if (book[id - 1].birth_given == book[i].preferred_birth) {
                    count = true;
                    if (book[i].birth_given != 'R') {
                        boolean count1 = false;
                        for (int j = 0; j < book_index; j++) {
                            if (book[i].birth_given == book[j].preferred_birth) {
                                count1 = true;
                                if (book[j].birth_given != 'R') {
                                    //boolean count = false;
                                    for (int k = 0; k < book_index; k++) {
                                        if (book[j].preferred_birth == book[k].preferred_birth) {
                                            if (Main.rac < 18) {
                                                for (int l = 0; l < book_index; l++) {
                                                    if (book[l].birth_given == 'R') {
                                                        book[l].birth_given = book[k].birth_given;
                                                        if (Main.waiting_list < 10) {
                                                            for (int m = 0; m < book_index; m++) {
                                                                if (book[m].birth_given == 'W') {
                                                                    book[m].birth_given = 'R';
                                                                    Main.waiting_list++;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            Main.rac++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (book[k].birth_given == 'L') {
                                                    Main.lower++;
                                                } else if (book[k].birth_given == 'M') {
                                                    Main.middle++;
                                                } else {
                                                    Main.upper++;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    book[j].birth_given = book[i].birth_given;
                                    if (Main.waiting_list < 10) {
                                        for (int m = 0; m < book_index; m++) {
                                            if (book[m].birth_given == 'W') {
                                                book[m].birth_given = 'R';
                                                Main.waiting_list++;
                                                break;
                                            }
                                        }
                                    } else {
                                        Main.rac++;
                                    }
                                }
                                book[j].birth_given = book[j].preferred_birth;
                                book[j].preferred_birth ='N';
                                break;
                            }
                        }
                        if (count1 == false) {
                            if (book[i].birth_given == 'L') {
                                Main.lower++;
                            } else if (book[i].birth_given == 'M') {
                                Main.middle++;
                            } else {
                                Main.upper++;
                            }
                        }
                    } else {
                        book[i].birth_given = book[id - 1].birth_given;
                        if (Main.waiting_list < 10) {
                            for (int m = 0; m < book_index; m++) {
                                if (book[m].birth_given == 'W') {
                                    book[m].birth_given = 'R';
                                    Main.waiting_list++;
                                    break;
                                }
                            }
                        } else {
                            Main.rac++;
                        }

                    }
                    book[i].birth_given = book[i].preferred_birth;
                    book[i].preferred_birth ='N';
                    break;
                }
            }
            if (count == false) {
                if (book[id - 1].birth_given == 'L') {
                    Main.lower++;
                } else if (book[id - 1].birth_given == 'M') {
                    Main.middle++;
                } else {
                    Main.upper++;
                }
            }
        }
    }
        public static void available_tickets ()
        {
            System.out.println("Lower Berth: " + Main.lower + "\nMiddle Berth: " + Main.middle + "\nUpper Berth: " + Main.upper + "\nRAC: " + Main.rac + "\nWaiting List: " + Main.waiting_list);
        }
        public static void booked_tickets()
        {
            for (int i = 0; i < book_index; i++) {
                if (book[i].status != "Cancelled") {
                    System.out.println("ID: " + book[i].book_id + "Name: " + book[i].name + "Age: " + book[i].age + "Berth: " + book[i].birth_given);
                }
            }
        }
    }

