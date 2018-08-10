public class Lesson7 {
    public static void main(String args[]){
        //Nested if statements
        //When to use them (why?)
        //if sales > x -> bonus = sales*y
        //Car mpg < 30

        String make = "Toyota";
        double mpg = 40;
        String model = "hatchback";

        if(make.equalsIgnoreCase("tOyOta")){
            if (mpg < 30){
                if(model.equals("hatchback")){
                    System.out.println("Your car needs to come in for a recall");
                }
                System.out.println("Even if a recall isn't necessary, it seems as though your vehicle is getting poor fuel economy and should be looked at. ");
            }
            System.out.println("We apologize for any inconvenience -- Toyota");
        }

        //Homework suggestion
        //Look up on google -- how to determine if someone has an ear infection
        //Create a program using nested if statements to detemine if someone has one.


    }
}
