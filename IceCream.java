package lab4;
import java.util.Scanner;
public class IceCream {
    String flavors[] = {"chocolate","vanilla","strawberry","mango","tutti fruit","almond crunch","coffee"};
   public String flavor;
   public int number_of_scoops;
   public String cone_type;
   public int price_fields;

    public IceCream(){

        this.flavor= "vanilla";
        number_of_scoops=1;
        this.cone_type = "sugar";
    }

    public IceCream(String flavor,int number_of_scoops,String cone_type ){

        this.flavor =flavor;
        this.number_of_scoops =number_of_scoops;
        this.cone_type = cone_type;
        if (cone_type == "waffle cone"){
            price_fields= (number_of_scoops*75)+40;
            System.out.println(price_fields);
        }
        else{
            price_fields=number_of_scoops*75;
            System.out.println(price_fields);
        }

    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Enter the number for your order : ");
        System.out.println("1:FLAVOR");
        System.out.println("NUMBER OF SCOOPS");
        System.out.println("CONE TYPE");
        String number;
        number = input.nextLine();



        switch (number) {
            case "1" :
                String flavors[] = {"chocolate","vanilla","strawberry","mango","tutti fruit","almond crunch","coffee"};
                for (int i=0; i<flavors.length;i++){
                    System.out.println(flavors[i]);
                }

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter which flavor you want :  ");
                String flavor = sc.nextLine();


                Scanner s = new Scanner(System.in);
                System.out.println("how many scoops : ");
                int number_of_scoops = s.nextInt();


                Scanner sc1  = new Scanner(System.in);
                System.out.println("which cone type sugar cone or waffle cone: ");
                String cone_type = sc1.nextLine();

                IceCream obj = new IceCream(flavor,number_of_scoops,cone_type);

        }



    }
}
