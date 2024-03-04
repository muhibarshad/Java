import java.util.Scanner;

class Health {
    String name;
    double weight;
    double height;
    double BMI;

    Health() {

    }

    Health(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.BMI = weight / height;
    }
}

class NegativeArraySizeException{
	public static void errorMessage(){
	System.out.println("Error : You entered the negative number : ");
	}
};
class indexOccupiedException{
	public static void errorMessage(){
	System.out.println("Error : Index is already occupied : ");
	}
	
};

class indexException{
	public static void errorMessage(){
	System.out.println("Error : Such index does'nt exist : ");
	}
};

class DriverHealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        boolean flag = false;
        int size;
        System.out.println("Enter the size of the array: ");
        size = in.nextInt();
        Health[] arr = new Health[size];
        do {
            System.out.println("Enter 1 to Add value in the array: ");
            System.out.println("Enter 2 to Retrieve and print the information of specific user at index n. : ");
            System.out.println("Enter 3 to exit : ");
            option = in.nextInt();
            switch (option) {
                case 1: {

                    break;
                }
                case 2: {

                    break;
                }
                case 3: {
                    flag = true;
                    break;
                }
                default: {
                    System.out.println("Enter the valid input :");
                    break;
                }
            }
        } while (flag != true);
    }

    public static void save(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the record of " + i + 1 + " : ");
            
    
            
        }
    }
}
