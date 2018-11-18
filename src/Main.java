public class Main {

        static int fact ( int n){
            if (n == 0)
                return 1;

            else {
                final int i = n * fact(n - 1);
                return i;
            }
        }

        public static void main (String[]args){


            System.out.println(fact(6));
        }

}
class Class1 {
    int age;
    String name;
 public Class1(int age,String name) {

     this.age = age;
     this.name = name;
 }
    int Age () {

        return this.age;
    }

    String Name () {
        return this.name;
    }


 public static void main(String[]args) {
       Class1 properties = new Class1(4, "Vrdo");

     System.out.println(properties.Name()+" is "+ properties.Age()+" years old");
   }



}

class Class2 {
boolean sleep;
double d;
    public Class2(boolean sleep, double d) {
        this.sleep = sleep;
        this.d = d;
    }
        int get(){
            if (sleep == true) {
                return 1;
            } else {
                return 0;

            }
        }

        String difference () {
            if (this.d < 10) {
                return "The number " + this.d + " is less than 10";
            }
            return null;
        }
    }

