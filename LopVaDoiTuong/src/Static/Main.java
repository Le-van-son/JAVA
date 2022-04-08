package Static;

public class Main {
        public static void main(String args[]) {
            Static s =new Static(5,"ngao");
            s.change(); //calling change method

            //creating objects
            Static s1 = new Static(111, "Hoang");
            Static s2 = new Static(222, "Khanh");
            Static s3 = new Static(333, "Nam");

            //calling display method
            s1.display();
            s2.display();
            s3.display();
        }
    }

