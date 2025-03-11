package Main.java;

import java.util.Scanner;
public class VendingMachine {
public static void main(String[] args){
  Scanner t = new Scanner(System.in);

  //Variable
  double insertedcoins = 0.00;
  double balance = 0.00;
  double foodprice = 0.00;
  double result = 0.00;
  double result1 = 0.00;
  double result2 = 0.00;
  double result3 = 0.00;
  double subtotals = 0.00;
  String Chicken = "";
  String Seafood = "";
  String Drinks = "";
  String Dessert = "";
  String Pizza = "";

  int machine = 0;
  while (machine < 2){
    machine++;
  
  System.out.println("");
  System.out.println("");
  System.out.println("NOTE: SUGGEST BALANCE: 100PLUS");
  System.out.println("");
  System.out.println("              WELCOME");
  System.out.println("---------------------------------");
  System.out.println("    ==FOOD  VENDING MACHINE==");
  System.out.println("---------------------------------");
  System.out.println("     |INSERT COIN FIRST| {}");
  System.out.println("---------------------------------");
  System.out.print("Insert here: ");
  double insert = t.nextDouble();
  insertedcoins = balance += insert;
  System.out.println("");
  //Check point 
  if(insert <= 90 || insert <= 0){
    System.out.println("[MACHINE]:  Insert more coins");
  }
  if(insert >= 100){
  System.out.println("");
  System.out.println("");
  System.out.println("-------{ WELCOME TO FOOD MACHINE }-------");
  System.out.println("");
  System.out.println("");
  System.out.println("              |<CHICKENS>|");
  System.out.println("-----------------------------------------");
  System.out.println("{~~~~~~~~~~~~~~~~}"+"            "+"{~~~~~~~~~~~~~~~~}");
  System.out.println(" |1 FOOD MENU|"+"                      "+"|PRICE|");
  System.out.println("{~~~~~~~~~~~~~~~~}"+"            "+"{~~~~~~~~~~~~~~~~}");
  System.out.println("    (STARTERS)");
  System.out.println("1. Chicken (lollipop)"+"               "+"130 PHP");
  System.out.println("2. Chicken (Fingers)"+"                "+"110 PHP");
  System.out.println("3. Chicken (Wings) "+"                 "+"150 PHP");
  System.out.println("4. Chicken (Chilli) "+"                "+"125 PHP");
  System.out.println("5. Chicken (Papper) "+"                "+"115 PHP");
  System.out.println("{~~~~~~~~~~~~~~~~}"+"            "+"{~~~~~~~~~~~~~~~~}");
  System.out.println("-----------------------------------------");
  }
  if(insert >= 100){
  System.out.println("•Current Balance: "+balance+" PHP");
  System.out.println("Do you want to order Chicken(Starters)? 1. Yes <|> 2. No ");
  System.out.print("Enter here: ");
  int order1 = t.nextInt();
  
  if(order1 >= 3 || order1 <= 0){
  System.out.println("");
    System.out.println("[MACHINE]: Invalid choice!! please try again");
  }
  
  
  
  if(order1 == 1){ 
    System.out.print("Enter your choice: ");
    int chic1 = t.nextInt();
    System.out.print("Enter quantitiy: ");
    int chic2 = t.nextInt();
    System.out.println("");
    
    switch(chic1){
    
    case 1:
    Chicken = (chic2 + " Chicken (Lollipop)");
    foodprice = 130;
    break;
    
    case 2:
    Chicken = (chic2 + " Chicken (Fingers)");
    foodprice = 110;
    break;
    
    case 3:
    Chicken = (chic2 + " Chicken (Wings)");
    foodprice = 150;
    break;
    
    case 4:
    Chicken = (chic2 + " Chicken (Chilli)");
    foodprice = 125;
    break;
    
    case 5:
    Chicken = (chic2 + " Chicken (Papper)");
    foodprice = 115;
    break;
    }
    
    if(chic1 >= 6 || chic1 <= 0){

                    System.out.println("[MACHINE]: Invalid choice, please try again");
                }else if(chic2 >= 11 || chic2 <= 0){

                    System.out.println("[MACHINE]: You have exceeded to the next limit please try again");
                }else if(balance >= foodprice){
                    result = chic2*foodprice;

                    if(result > balance){
                        System.out.println("[MACHINE]: You have exceeded to the next limit please try again");
                    }if(balance >= result){

                        balance -= result;
                System.out.println("[MACHINE]: Food has been Dispensed, Thank you!!");
                System.out.println("|-----------------------------------------------------|");
                System.out.println("|-ORDER:  "+Chicken+ "  "+result+"PHP  |");
                System.out.println("|-----------------------------------------------------|");
                System.out.println("Current balance: "+balance);
                    }
                }else{

                    System.out.println("[MACHINE]: Insufficient Balance");
                }
                
  }
  
  if(order1 >= 3 || order1 <= 0){
    System.out.println("ERROR");
  }else if(order1 <= 2){
  System.out.println("");
  System.out.println("");
  System.out.println("               |<SEA FOOD>|");
  System.out.println("-----------------------------------------");
  System.out.println("{~~~~~~~~~~~~~~~~}"+"          "+"{~~~~~~~~~~~~~~~~}");
  System.out.println("   |2 FOOD MENU|"+"                 "+"|PRICE|");
  System.out.println("{~~~~~~~~~~~~~~~~}"+"          "+"{~~~~~~~~~~~~~~~~}");
  System.out.println("(STARTERS SEA FOOD)");
  System.out.println("1. Fish (FRY)"+"                     "+"150 PHP");
  System.out.println("2. Prawn (Chilli)"+"                 "+"160 PHP");
  System.out.println("3. Fish (Tawa) "+"                   "+"150 PHP");
  System.out.println("4. kanava (65) "+"                   "+"150 PHP");
  System.out.println("5. Prawn (65) "+"                    "+"180 PHP");
  System.out.println("{~~~~~~~~~~~~~~~~}"+"           "+"{~~~~~~~~~~~~~~~~}");
  System.out.println("-----------------------------------------");
  }
  if(order1 <= 2){
  System.out.println("Do you want to order Sea Food(Starters)? 1. Yes <|> 2. No ");
  System.out.print("Enter here: ");
  int order2 = t.nextInt();
  
  if(order2 >= 3 || order2 <= 0){
  System.out.println("");
    System.out.println("[MACHINE]: Invalid choice!! please try again");
  }
  
  if(order2 == 1){ 
    System.out.print("Enter your choice: ");
    int sea1 = t.nextInt();
    System.out.print("Enter quantitiy: ");
    int sea2 = t.nextInt();
    System.out.println("");
    
    switch(sea1){
    
    case 1:
    Seafood = (sea2 + " Fish (FRY)");
    foodprice = 150;
    break;
    
    case 2:
    Seafood = (sea2 + " Prawn (Chilli)");
    foodprice = 160;
    break;
    
    case 3:
    Seafood = (sea2 + " Fish (Tawa)");
    foodprice = 150;
    break;
    
    case 4:
    Seafood = (sea2 + " Kanava (69)");
    foodprice = 150;
    break;
    
    case 5:
    Seafood = (sea2 + " Prawn (65)");
    foodprice = 180;
    break;
    }
    
    if(sea1 >= 6 || sea1 <= 0){

                    System.out.println("[MACHINE]: Invalid choice, please try again");
                }else if(sea2 >= 11 || sea2 <= 0){

                    System.out.println("[MACHINE]: You have exceeded to the next limit please try again");
                }else if(balance >= foodprice){
                    result1 = sea2*foodprice;

                    if(result1 > balance){
                        System.out.println("[MACHINE]: You have exceeded to the next limit please try again");
                    }if(balance >= result1){

                        balance -= result1;
                System.out.println("[MACHINE]: Food has been Dispensed, Thank you!!");
                System.out.println("|-----------------------------------------------------|");
                System.out.println("|-ORDER:  "+Seafood+ "  "+result1+"PHP  |");
                System.out.println("|-----------------------------------------------------|");
                System.out.println("Current balance: "+balance);
                    }
                }else{

                    System.out.println("[MACHINE]: Insufficient Balance");
                }
              
  }
  
  if(order2 >= 3 || order2 <= 0){
    System.out.println("ERROR");
  }else if(order2 <= 2){
  System.out.println("");
  System.out.println("");
  System.out.println("                |<DRINKS>|");
  System.out.println("-----------------------------------------");
  System.out.println("{~~~~~~~~~~~~~~~~}"+"            "+"{~~~~~~~~~~~~~~~~}");
  System.out.println("     |DRINKS|"+"                       "+"|PRICE|");
  System.out.println("{~~~~~~~~~~~~~~~~}"+"            "+"{~~~~~~~~~~~~~~~~}");
  System.out.println("     (DRINKS)");
  System.out.println("1. Coke "+"                             "+"12 PHP");
  System.out.println("2. Sprite"+"                            "+"12 PHP");
  System.out.println("3. Royal "+"                            "+"12 PHP");
  System.out.println("4. Rc "+"                               "+"11 PHP");
  System.out.println("5. Water "+"                            "+"10 PHP");
  System.out.println("{~~~~~~~~~~~~~~~~}"+"            "+"{~~~~~~~~~~~~~~~~}");
  System.out.println("-----------------------------------------");
  }
  if(order2 >= 3 || order2 <= 0){
  System.out.print("");
  }else if (order1 <= 2){
  System.out.println("Do you want to order DRINKS? 1 .Yes <|> 2. No ");
  System.out.print("Enter here: ");
  int order3 = t.nextInt();
  
  if(order3 >= 3 || order2 <= 0){
  System.out.println("");
    System.out.println("[MACHINE]: Invalid choice!! please try again");
  }
  
  if(order3 == 1){ 
    System.out.print("Enter your choice: ");
    int drink1 = t.nextInt();
    System.out.print("Enter quantitiy: ");
    int drink2 = t.nextInt();
    System.out.println("");
    
    
    switch(drink1){
    
    case 1:
    Drinks = (drink2 + " Coke");
    foodprice = 12;
    break;
    
    case 2:
    Drinks = (drink2 + " Sprite");
    foodprice = 12;
    break;
    
    case 3:
    Drinks = (drink2 + " Royal");
    foodprice = 12;
    break;
    
    case 4:
    Drinks = (drink2 + " Rc");
    foodprice = 11;
    break;
    
    case 5:
    Drinks = (drink2 + " Water");
    foodprice = 10;
    break;
    }
    
    if(drink1 >= 6 || drink1 <= 0){

                    System.out.println("[MACHINE]: Invalid choice, please try again");
                }else if(drink2 >= 11 || drink2 <= 0){

                    System.out.println("[MACHINE]: You have exceeded to the next limit please try {}again");
                }else if(balance >= foodprice){
                    result2 = drink2*foodprice;

                    if(result2 > balance){
                        System.out.println("[MACHINE]: You have exceeded to the next limit please try again");
                    }if(balance >= result2){

                        balance -= result2;
                System.out.println("[MACHINE]: Drinks has been Dispensed, Thank you!!");
                System.out.println("|-----------------------------------------------------|");
                System.out.println("|-ORDER:  "+Drinks+ "  "+result2+"PHP  |");
                System.out.println("|-----------------------------------------------------|");
                System.out.println("Current balance: "+balance);
                    }
                }else{

                    System.out.println("[MACHINE]: Insufficient Balance");
                }
                
                System.out.println("");
                System.out.println("Do you want desserts? 1. Yes <|> 2. No ");
    System.out.print("Enter here: ");
    int want = t.nextInt();
                
    if(want == 1){
      System.out.println("");
      System.out.println("");
      System.out.println("          |<DESSERTS>|");
  System.out.println("-----------------------------------------");
  System.out.println("{~~~~~~~~~~~~~~~~}"+"            "+"{~~~~~~~~~~~~~~~~}");
  System.out.println("    |DESSERTS|"+"                      "+"|PRICE|");
  System.out.println("{~~~~~~~~~~~~~~~~}"+"            "+"{~~~~~~~~~~~~~~~~}");
  System.out.println("    (DESSERTS)");
  System.out.println("1. Coppa Catalana "+"                  "+"98 PHP");
  System.out.println("2. Lattice Apple Pie"+"                "+"75 PHP");
  System.out.println("3. Caramel Crunch "+"                  "+"110 PHP");
  System.out.println("4. Tripple Chocolate "+"               "+"55 PHP");
  System.out.println("5. Tiramisu "+"                        "+"76PHP");
  System.out.println("{~~~~~~~~~~~~~~~~}"+"            "+"{~~~~~~~~~~~~~~~~}");
  System.out.println("-----------------------------------------");
  System.out.print("Enter your choice: ");
  int des1 = t.nextInt();
  System.out.print("Enter quantitiy: ");
  int des2 = t.nextInt();
  
  switch(des1){
    
    case 1:
    Dessert = (des2 + " Coppa Catalana");
    foodprice = 98;
    break;
    
    case 2:
    Dessert = (des2 + " Lattice Apple pie");
    foodprice = 75;
    break;
    
    case 3:
    Dessert = (des2 + " Caramel Crunch");
    foodprice = 110;
    break;
    
    case 4:
    Dessert = (des2 + " Tripple Chocolate");
    foodprice = 55;
    break;
    
    case 5:
    Dessert = (des2 + " Tiramisu");
    foodprice = 76;
    break;
    }
  
  if(des1 >= 6 || des1 <= 0){

                    System.out.println("[MACHINE]: Invalid choice, please try again");
                }else if(des2 >= 11 || des2 <= 0){

                    System.out.println("[MACHINE]: You have exceeded to the next limit please try again");
                }else if(balance >= foodprice){
                    result3 = des2*foodprice;

                    if(result3 > balance){
                        System.out.println("[MACHINE]: You have exceeded to the next limit please try again");
                    }if(balance >= result3){

                        balance -= result3;
                        System.out.println("[MACHINE]: Dessert has been Dispensed, Thank you!!");
                    }
                }else{

                    System.out.println("[MACHINE]: Insufficient Balance");
                }

    }else{
      
    }
  }

  }
    }
  }
  
  subtotals = ((((result)+result1)+result2)+result3);
  
  if(subtotals >insertedcoins){
    System.out.println("[MACHINE]: ERROR DETECTED");
  }else if(balance < insertedcoins){
    System.out.println("");
    System.out.println("Christian's Food Vending Machine");
    System.out.println("{------------------------------------------------------------}");
    System.out.println("                   ==FOOD VENDING MACHINE==");
    System.out.println("                          -RECEIPT-");
    System.out.println("{------------------------------------------------------------}");
    System.out.println("• ORDER LIST: "+"                         "+" •PRICE: ");
    System.out.println(""+ Chicken+"                              "+result+" PHP");
    System.out.println(""+Seafood+"                               "+result1+" PHP");
    System.out.println(""+Drinks+"                                "+result2+" PHP");
    System.out.println(""+Dessert+"                               "+result3+" PHP");
    System.out.println("{------------------------------------------------------------}");
    System.out.println("• TOTAL: "+"                              "+subtotals+" PHP");
    System.out.println("• CASH: "+"                               "+insertedcoins+" PHP");
    System.out.println("{------------------------------------------------------------}");
    System.out.println("• CHANGE:"+"                              "+balance+" PHP");
    
  }
  
  balance -= balance = balance;
  
  }
  
  
}
}
