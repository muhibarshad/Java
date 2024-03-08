import java.util.*;
import java.io.*;


class noAccountAvailbaleException extends Exception{
	void errorMessage(){
	System.out.println("Such Account does not exist : Try Again");
	}
	}

class Bank{
    String name;
    String  accNum;
    double amount;
    Bank(){
    }

    Bank(String name, String accNum, double amount){
    this.name = name;
    this.accNum = accNum;
    this.amount = amount;
    }

    void setName(String name){
    this.name = name;
    }

     void setAccNum(String accNum){
     this.accNum = accNum;
    }

    void setAmount(double amount){
    this.amount = amount;
    }

    String getName(){
    return name;
    }

    String getAccNum(){
    return accNum;
    }

    double getAmount(){
    return amount;
    }
    
    void setData() {
     Scanner in = new Scanner(System.in);
	name = in.nextLine();
	accNum = in.nextLine();
	amount = 1000;
}

 
}

class Accounts{
	ArrayList persons;
	public Accounts ( ) {
		persons = new ArrayList();
	}
	public void savePersons ( ){
   try {
  	Bank p;
 	String line;
	FileWriter fw = new FileWriter("persons.txt");
	PrintWriter pw = new PrintWriter(fw);
	for(int i=0; i<persons.size(); i++)
	{
		p = (Bank)persons.get(i);
		line = p.name +","+ p.accNum +","+ p.amount;
		pw.println(line);
	}
	pw.flush();
	pw.close();
	fw.close();
	
	}catch(IOException ioEx){ 
		System.out.println(ioEx);
	}
}

	public void addPerson(){
	Bank p = new Bank();
	p.setData();
	persons.add(p);
	savePersons();
	}
	
	public boolean searchPerson (String n) {
	for (int i=0; i< persons.size(); i++) {
		Bank p = (Bank)persons.get(i);
		if ( n.equals(p.accNum) ) {
		return true;
		}
	}
	return false;
	}
	public Bank searchPersonObj (String n) {
	for (int i=0; i< persons.size(); i++) {
		Bank p = (Bank)persons.get(i);
		if ( n.equals(p.accNum) ) {
		return p;
		}
	}
	return null;
	}
	
	public void transfer(){
	 try{
	 Scanner in = new Scanner(System.in);
	 String accNum;
	 double amount ;
	double cur;
	 boolean exist= false;
	System.out.print("Enter the accNum of a recepient :\n");
	accNum= in.nextLine();
	exist=  searchPerson(accNum);
	if(exist == false)
		throw new noAccountAvailbaleException();
	System.out.print("Enter the amount you want to send\n");
	amount = in.nextDouble();
	Bank transferedAcc = searchPersonObj(accNum);
	 
	cur=transferedAcc.getAmount();
	cur+=amount;
	transferedAcc.setAmount(cur);
	savePersons ( );
	}catch(noAccountAvailbaleException e){
		e.errorMessage();
	}
	
}
}


class Lab06{
    public static void main(String [] args){
    Accounts ac = new Accounts();
    int n;
    boolean flag = false;
    Scanner in = new Scanner(System.in);
     do{ 
        System.out.println("Enter 1 to add new Account");
        System.out.println("Enter 2 to transfer in a account");
        System.out.println("Enter -1 to exit");
        n = in.nextInt();
        switch(n){
        case 1:{
    	ac.addPerson();
        break;
        }
        case 2:{
        ac.transfer();
        break;
        }
        case -1 :{
         flag = true;
        break;
        }
        }
    }while(flag!=true);
}
	
}


