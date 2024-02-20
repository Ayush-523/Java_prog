class Sport {
    String[] sportsno;
    int jerseyno;
    Sport(String[] sportsno,int jerseyno) {
        this.sportsno=sportsno;
        this.jerseyno=jerseyno;
    }

    void favoriteSports() {
        System.out.print("Favorite sports are: ");
        for (int i = 0; i < sportsno.length; i++) {
            System.out.print(sportsno[i] + " ");
        }
        System.out.println();
    }
}

class Person1 extends Sport {
    String name;

    Person1(String[] sportsno,int jerseyno, String name) {
        super(sportsno,jerseyno);
        this.name=name;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        favoriteSports();
    }
}

class Person2 {
    public static void main(String[] args) {
        String[] sportsno = {"Football", "Basketball", "Tennis"};
        Person1 person1 = new Person1(sportsno,1,"John");
        person1.displayInfo();
    }
}