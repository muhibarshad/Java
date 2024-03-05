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

    void inputData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = in.nextLine();
        System.out.println("Enter weight :  ");
        weight = in.nextDouble();
        System.out.println("Enter height : ");
        height = in.nextDouble();
        this.BMI = weight / height;
    }

    public String toString() {
        return "Health info  name = " + name + " weight = " + weight + " Height = " + height + " BMI = " + BMI;
    }

}

class NegativeArraySizeException extends Exception {
    public void errorMessage() {
        System.out.println("Error: You entered a negative number.");
    }
}

class IndexOccupiedException extends Exception {
    public void errorMessage() {
        System.out.println("Error: Index is already occupied.");
    }
}

class IndexException extends Exception {
    public void errorMessage() {
        System.out.println("Error: Index does not exist.");
    }
}

class DriverHealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int option;
            boolean flag = false;
            int size;

            System.out.println("Enter the size of the array: ");
            size = in.nextInt();
            if (size < 1) {
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
                        System.out.println("Enter the index to save the record: ");
                        int index = in.nextInt();
                        save(arr, index);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter the index to retrieve the record: ");
                        int index = in.nextInt();
                        retrieve(arr, index);
                        break;
                    }
                    case 3: {
                        flag = true;
                        break;
                    }
                    default: {
                        System.out.println("Enter a valid input.");
                        break;
                    }
                }
            } while (!flag);
        } catch (NegativeArraySizeException e) {
            e.errorMessage();
        } catch (IndexOccupiedException e) {
            e.errorMessage();
        } catch (IndexException e) {
            e.errorMessage();
        }
    }

    public static void save(Health[] arr, int index) throws IndexOccupiedException {
        Scanner in = new Scanner(System.in);
        if (index >= arr.length || index < 0)
            throw new IndexOccupiedException();
        if (arr[index] != null) {
            throw new IndexOccupiedException();
        }
        System.out.println("Enter name : ");
        String name = in.nextLine();
        System.out.println("Enter weight :  ");
        double weight = in.nextDouble();
        System.out.println("Enter height : ");
        double height = in.nextDouble();
        arr[index] = new Health(name, weight, height);
    }

    public static void retrieve(Health[] arr, int index) throws IndexException {
        if (index >= arr.length || index < 0 || arr[index] == null) {
            throw new IndexException();
        }
        System.out.println(arr[index]);
    }
}
