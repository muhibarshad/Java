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
    
    void inputData(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter name : ");
    name = in.nextLine();
    System.out.println("Enter weight :  ");
    weight = in.nextDouble();
    System.out.println("Enter height : ");
    height = in.nextDouble();
    this.BMI = weight / height;
}

	public String toString()
	{
		return "Health info  name = " + name + " weight = " + weight + "Height = " + height + " BMI = " + BMI ; 
	}	
	
}	

class NegativeArraySizeException extends Exception
{
	public static void errorMessage(){
	System.out.println("Error : You entered the negative number : ");
	}
};
class indexOccupiedException extends Exception
{
	public static void errorMessage(){
	System.out.println("Error : Index is already occupied : ");
	}
	
};

class indexException extends Exception
{
	public static void errorMessage(){
	System.out.println("Error : Such index does'nt exist : ");
	}
};

class DriverHealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          try{
        int option;
        boolean flag = false;
        int size;
      
         System.out.println("Enter the size of the array: ");
         size = in.nextInt();
         if(size < 1){
         throw new NegativeArraySizeException();
         }

       
        Health[] arr = new Health[size];
        do {
            System.out.println("Enter 1 to Add value in the array: ");
            System.out.println("Enter 2 to Retrieve and print the information of specific user at index n. : ");
            System.out.println("Enter 3 to exit : ");
            option = in.nextInt();
            switch (option) {
                case 1: {
           for (int i = 0; i < size; i++) {
            System.out.println("Enter the record of " + i + 1 + " : ");
          	
            
        }
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
        catch(NegativeArraySizeException e)
        {
        	e.errorMessage();
        }
        catch(indexOccupiedException e){
        	e.message();
        }
        catch(indexException e){
        	e.message();
        }
    }

    public static void save(int size) {
       
    }
}
