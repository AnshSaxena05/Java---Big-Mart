import java .util.*; import java.io.*; public class BigMart
{



String[] Ar = new String[30]; long Br[ ]=new long[30];
int Cr[ ]=new int[30]; long Dr[ ]=new long[30]; long Totalcost=0;
long TotalValue=0; long cost=0;
int j=0;

int Quantity=0; int b =0; double Dis;
double NetAmt;

Scanner br=new Scanner (System .in);



public void Main_Menu()

{



System.out.println("Welcome to BIG MART"); System.out.println (" Aao khushya bate"); System.out.println (" Press 1 for Fresh fruits"); System.out.println (" Press 2 for Fresh vegetables"); System.out.println (" Press 3 for Bakery");

 
System.out.println (" Press 4 for Beverages"); System.out.println (" Make choice from above list"); Scanner br=new Scanner (System .in);
int opt =br.nextInt(); switch(opt)
{

case 1: System.out.println(" Fresh fruit section"); FreshFruit();
break;

case 2: System.out.println("Fresh vegetable section"); FreshVegetable();
break;

case 3: System.out.println("Bakery section "); Bakery();
break;

case 4: System.out.println("Beverages sction"); Beverages();
break;

default:System.out.println("Wrong choice"); Main_Menu();
break;



}

}

public void FreshFruit()//to be checked

{

System.out.println("Press 1 for Apple");


 
System.out.println("Press 2 for Pomegranate"); System.out.println("Press 3 for Kivi"); System.out.println("Press 4 for Banana"); System.out.println(" Make choice from above list"); int opt2 =br.nextInt();


switch(opt2)

{

case 1: System.out.println("Apple");

cost =250;

Ar[j ]="Apple	"; Br[j ]=250;


System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Totalcost=cost*Quantity+Totalcost; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

System.out.println("cost per kg = 250"); System.out.println("Total cost = "+TotalValue); break;
case 2: System.out.println("Pomogranate "); cost =100;
Ar[j ]="Pomogranate ";


 
Br[j ]=100;



System.out.println("Enter Quantity"); Quantity=br.nextInt(); Totalcost=cost*Quantity+Totalcost; TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

Totalcost=cost*Quantity +Totalcost; System.out.println("cost per kg = 100"); System.out.println("Total cost = "+TotalValue); break;
case 3: System.out.println("Green Kivi"); long cost = 150;
Ar[j ]= "Green Kivi "; Br[j ]=150;


System.out.println("Enter Quantity"); int Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

Totalcost=cost*Quantity +Totalcost;


 
System.out.println("cost per kg = 150"); System.out.println("Total cost = "+TotalValue); break;
case 4: System .out .println("Banana"); cost = 80;
Ar[j ]="Banana"; Br[j ]=80;


System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;


Dr[j]=+TotalValue; j++;
b++;

Totalcost=cost*Quantity +Totalcost; System.out.println("cost per kg = 80"); System.out.println("Total cost = "+TotalValue); break;
case 5: System .out .println("Banana"); cost = 110;
Ar[j ]="Banana	"; Br[j ]=110;


System.out.println("Enter Quantity"); Quantity=br.nextInt();

 
TotalValue=cost*Quantity; Cr[j]=Quantity; Dr[j]=TotalValue;
j++; b++;
Totalcost=cost*Quantity +Totalcost; System.out.println(" cost per kg = 110"); System.out.println("Total cost = "+TotalValue); break;
default: System .out.println("Wrong choice"); break;
}

System.out.println("Press 1 for continue shopping in Fresh Fruit Section"); System.out.println("Press 2 to go to main menu"); System.out.println("Press 3 to exit");
int choice=br.nextInt(); switch(choice)
{

case 1:FreshFruit(); break;
case 2: Main_Menu(); break;
case 3: Billing(); break;
default:System.out.println("Wrong choice"); FreshFruit();
break;


 
}

}

public void FreshVegetable()

{

System.out.println("Press 1 for Onion"); System.out.println("Press 2 for Potato"); System.out.println("Press 3 for Tomato"); System.out.println("Press 4 for Cauliflower"); System.out.println("Make choice from above list"); int opt2 =br.nextInt();
switch(opt2)

{

case 1: System.out.println("Onion");

long cost =29;

Ar[j ]="Onion	"; Br[j ]=29;


System.out.println("Enter Quantity"); int Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost; System.out.println("cost per kg = 29"); System.out.println("Total cost = "+TotalValue);

 
break;

case 2: System.out.println("Potato");

cost =38;

Ar[j ]="Potato	"; Br[j ]=38;
System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

Totalcost=cost*Quantity +Totalcost; System.out.println("cost per kg = 38"); System.out.println("Total cost = "+TotalValue); break;
case 3: System.out.println("Tomato");

cost = 20;

Ar[j ]="Tomato	"; Br[j ]=20;


System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;

 
b++;

Totalcost=cost*Quantity +Totalcost; System.out.println("cost per kg = 20"); System.out.println("Total cost =" +TotalValue); break;
case 4: System .out .println("Cauliflower"); cost = 80;
Ar[j ]="Cauliflower "; Br[j ]=80;


System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

Totalcost=cost*Quantity +Totalcost; System.out.println("cost per kg = 80"); System.out.println("Total cost =" +TotalValue); break;
default: System .out.println("Wrong choice"); break;
}

System.out.println("Press 1 for continue shopping in Fresh Vegetable Section"); System.out.println("Press 2 to go to main menu");
System.out.println("Press 3 to exit");


 
int choice=br.nextInt(); switch(choice)
{

case 1 : FreshVegetable(); break;
case 2: Main_Menu(); break;
case 3: Billing(); break;
default:System.out.println("Wrong Choice"); FreshFruit();
break;

}

}

public void Bakery()

{

System.out.println("Press 1 for Garlic Bread"); System.out.println("Press 2 for Rusk"); System.out.println("Press 3 for Pastries"); System.out.println("Press 4 for Cakes"); System.out.println("Make choice from above list"); int opt20 =br.nextInt();


switch(opt20)

{

case 1: System.out.println("Garlic Bread Section"); System.out.println("Press 1 for Garlic Bread");

 
System.out.println("Press 2 for Golden Bread"); System.out.println("Press 3 for Milky Br ead"); System.out.println("Press 4 for Mari Gold Bread"); System.out.println("Make choice from above list");
System.out.println("Give the company’s name from which you want"); int opt3=br.nextInt();
switch(opt3)

{

case 1 : System .out.println("Garlic Bread"); long cost=35;
Ar[j ]="Garlic_Bread "; Br[j ]=35;


System.out.println("Cost per pack = 35"); System.out.println("Enter Quantity");
int Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity; Dr[j]=+TotalValue;
j++; b++;
Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 2: System .out.println(" Golden_Bread"); cost=38;
Ar[j ]="Golden_Bread ";


 
Br[j ]=38;



System .out.println("Cost per pack=38"); System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 3 : System.out.println("Milky Bread"); cost = 35;
System.out.println("Cost per pack= 35"); Ar[j ]="Milky_Bread ";
Br[j ]=35;



System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost;


 
System.out.println("Total cost =" +TotalValue); break;
case 4 : System .out.println("Mari Gold bread"); cost= 40;
System.out.println("Cost per pack= 40"); Ar[j ]="MariGold_Bread";
Br[j ]=40;



System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
default: System .out.println("Wrong choice"); break;
}

break;




case 2: System.out.println("Rusk Section"); System.out.println(" Press 1 for Golden rusk"); System.out.println(" Press 2 for Mari gold rusk");

 
System.out.println(" Press 3 for Neslay rusk"); System.out.println(" Press 4 for Sweet rusk"); System.out.println("Make choice from above list"); int opt5=br.nextInt();
switch(opt5)

{

case 1: System.out.println("Golden Rusk"); long cost=38;
Ar[j ]="Golden_Rusk "; Br[j ]=38;


System .out.println("Cost per pack=38"); System.out.println("Enter Quantity"); int Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 2:System.out.println("Mari gold rusk"); cost=48;
Ar[j ]="Mari_Gold_Rusk"; Br[j ]=48;



 
System .out.println("Cost per pack=48"); System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; TotalValue=cost*Quantity; Cr[j]=+Quantity; Dr[j]=+TotalValue;
j++; b++;
Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 3:System.out.println("Neslay Bread"); cost=58;
Ar[j ]="Neslay_Rusk "; Br[j ]=58;


System .out.println("Cost per pack=58"); System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;


 
Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 4: System.out.println("Sweet Rusk"); cost=68;
Ar[j ]="Sweet_Rusk "; Br[j ]=68;


System .out.println("Cost per pack=68"); System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
default: System .out.println("Wrong choice"); break;
}

break;

case 3: System.out.println("Pastries"); System.out.println("Press 1 for Red Velvet Pastry"); System.out.println("Press 2 for Black Chocolate Pastry"); System.out.println("Press 3 for Pineapple Pastry");

 
System.out.println("Press 4 for Black Forest Pastry"); System.out.println("Make choice from above list"); int opt6=br.nextInt();
switch(opt6)

{

case 1: System.out.println("Red Velvet Pastry"); cost=98;
Ar[j ]="Red_Velvet "; Br[j ]=98;


System .out.println("Cost per piece=98"); System.out.println("Enter Quantity");
int Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity; Dr[j]=+TotalValue;
j++; b++;
Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 2 : System.out.println("Black Chocolate Pastry"); long cost=100;
Ar[j ]="Black_Chocolate"; Br[j ]=100;


System .out.println("Cost per piece= 100");


 
System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 3 : System.out.println("Pineapple Pastry"); cost=88;
Ar[j ]="Pineapple	"; Br[j ]=88;


System .out.println("Cost per piece=88"); System.out.println("Enter Quantity"); Quantity=br.nextInt(); Totalcost=cost*Quantity+Totalcost; TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

System.out.println("Total cost = "+TotalValue); break;
case 4 : System .out.println("Black Forest Pastry");


 
cost=120;

Ar[j ]="Black_Forest "; Br[j ]=120;


System .out.println("Cost per piece=120"); System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=+Quantity;
Dr[j]=+TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost; TotalValue=cost*Quantity; System.out.println("Total cost = "+TotalValue); break;
default :System.out.println ("Wrong choice"); break;
}

break;



case 4: System .out .println("Cakes"); System.out.println("Press 1 for Chocolate cake"); System.out.println("Press 2 for Death by chocolate cake"); System.out.println("Press 3 for Apple Cake"); System.out.println("Press 4 for Fruit Cake"); System.out.println("Make choice from above list");

 
int opt7=br.nextInt(); switch(opt7)
{

case 1: System.out.println( "Chocolate Cake "); long cost=750;
Ar[j ]="Chocolate"; Br[j ]= 750;


System .out.println("Cost per 500g =750"); System.out.println("Enter Quantity");
int Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=Quantity; Dr[j]=TotalValue;
j++; b++;
Totalcost=cost*Quantity+Totalcost; TotalValue=cost*Quantity; System.out.println("Total cost = "+TotalValue ); break;
case 2 : System.out.println("Death by chocolate cake"); cost=900;
Ar[j ]="Death_Chocolate"; Br[j ]=900;
System .out.println("Cost per 500g =900"); System.out.println("Enter Quantity"); Quantity=br.nextInt();

 
TotalValue=cost*Quantity; Cr[j]=Quantity; Dr[j]=TotalValue;
j++; b++;
Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 3: System.out.println("Apple cake"); cost=550;
Ar[j ]="Apple_Cake "; Br[j ]=550;


System .out.println("Cost per 500g =550"); System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity;
Cr[j]=Quantity; Dr[j]=TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 4 :System.out.println("Fruit cake"); cost=650;
Ar[j ]= "Fruit_cake ";


 
Br[j ]=650;



System .out.println("Cost per pack=650"); System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=Quantity;
Dr[j]=TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
default: System.out.println("Wrong choice"); break;
}

}

System.out.println("Press 1 for continue shopping in Bakery Section"); System.out.println("Press 2 to go to main menu"); System.out.println("Press 3 to exit");
int choice=br.nextInt(); switch(choice)
{

case 1 : Bakery(); break;
case 2: Main_Menu(); break;

 
case 3: Billing(); break;
default:System.out.println("Wrong choice"); Bakery();
break;



}

}

public void Beverages()

{

System.out.println("Press 1 for Tea"); System.out.println("Press 2 for Coffee"); System.out.println("Press 3 for Juices"); System.out.println("Press 4 for Soft drink"); System.out.println("Make choice from above list"); int opt8=br.nextInt();
switch(opt8)

{

case 1 : System.out.println("Tea"); System.out.println("Press 1 for Taj Tea"); System.out.println("Press 2 for Red label Tea"); System.out.println("Press 3 for Society Tea"); System.out.println("Press 4 for Taza Tea"); System.out.println("Make choice from above list"); int opt9=br.nextInt();
switch(opt9)

{


 
case 1 :System.out.println("Taj Tea"); long cost=225;
Ar[j ]="Taj_Tea	"; Br[j ]=225;


System .out.println("Cost per pack=225"); System.out.println("Enter Quantity");
int Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=Quantity; Dr[j]=TotalValue;
j++; b++;


Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 2 : System.out.println("Red label tea"); cost= 210;
Ar[j ]= "Red_label_tea "; Br[j ]=210;
System .out.println("Cost per pack=210"); System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=Quantity;
Dr[j]=TotalValue;


 
j++; b++;
Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 3 : System.out.println("Society"); cost=220;
Ar[j ]="Society	"; Br[j ]=220;
System .out.println("Cost per pack=220"); System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=Quantity;
Dr[j]=TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 4: System.out.println("Taza tea"); cost=200;
Ar[j ]="Taza_tea	"; Br[j ]=200;
System .out.println("Cost per pack=200"); System.out.println("Enter Quantity"); Quantity=br.nextInt();

 
Cr[j]=Quantity; TotalValue=cost*Quantity; Dr[j]=TotalValue;
j++; b++;


Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
default: System.out.println("Wrong choice"); break;
}

break;

case 2 : System.out.println("Coffee"); System.out.println("Press 1 for Nescafe"); System.out.println("Press 2 for Bru"); System.out.println("Press 3 for Ready Brew"); System.out.println("Press 4 for French Vanilla "); System.out.println("Make choice from above list"); int opt21=br.nextInt();
switch(opt21)

{

case 1 : System.out.println("Nescafe"); long cost= 560;
Ar[j ]= "Nescafe	"; Br[j ]=560;



 
System .out.println("Cost per pack=560"); System.out.println("Enter Quantity");
int Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=Quantity; Dr[j]=TotalValue;
j++; b++;
Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 2 : System.out.println("Bru Coffee"); cost= 245;
Ar[j ]= "Bru_Coffee	"; Br[j ]=245;


System .out.println("Cost per pack=245"); System.out.println("Enter Quantity"); Quantity=br.nextInt();
Cr[j]=Quantity; TotalValue=cost*Quantity; Dr[j]=TotalValue;
j++; b++;
Totalcost=cost*Quantity+Totalcost;



System.out.println("Total cost = "+TotalValue);


 
break;

case 3 : System.out.println("Ready Breew Coffee"); cost= 500;
Ar[j ]= "Ready_Breew "; Br[j ]=500;


System .out.println("Cost per pack=500"); System.out.println("Enter Quantity"); Quantity=br.nextInt();
Cr[j]=Quantity; TotalValue=cost*Quantity; Dr[j]=TotalValue;
j++; b++;
Totalcost=cost*Quantity+Totalcost;



System.out.println("Total cost = "+TotalValue); break;
case 4 : System.out.println("French Vanilla Coffee"); cost= 900;
Ar[j ]= "French_vanilla"; Br[j ]=900;


System .out.println("Cost per pack=900"); System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity;

 
Cr[j]=Quantity; TotalValue=cost*Quantity; Dr[j]=TotalValue;
j++; b++;
Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
default: System.out.println("Wrong choice"); break;
}

break;

case 3:System.out.println("Fruit Juice"); System.out.println("Press 1 for Tropicana mix Fruits"); System.out.println("Press 2 for Real Mix Fruit"); System.out.println("Press 3 for Natural Mix Fruits"); System.out.println("Press 4 Minute Made Mix Fruit"); System.out.println("Make Choice from above list");
int opt11=br.nextInt(); switch(opt11)
{

case 1 : System.out.println("Tropicana Mix Fruit Juice"); long cost= 130;
Ar[j ]= "Tropicana	"; Br[j ]=130;
System .out.println("Cost per pack=130"); System.out.println("Enter Quantity");

 
int Quantity=br.nextInt(); Cr[j]=Quantity; TotalValue=cost*Quantity; Dr[j]=TotalValue;
j++; b++;
Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost =" +TotalValue); break;
case 2 :System.out.println("Real Mix Fruit Juice "); cost= 145;
Ar[j ]= "Real_Mix_Fruits"; Br[j ]=145;
System .out.println("Cost per pack=145"); System.out.println("Enter Quantity"); Quantity=br.nextInt();
Cr[j]=Quantity; TotalValue=cost*Quantity; Dr[j]=TotalValue;
j++; b++;
TotalValue=cost*Quantity; Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 3 : System.out.println("Natural Mix Fruit Juice"); cost= 150;

 
Ar[j ]= "Natural_Mix "; Br[j ]=150;
System .out.println("Cost per pack=150"); System.out.println("Enter Quantity"); Quantity=br.nextInt();
Cr[j]=Quantity; TotalValue=cost*Quantity; Dr[j]=TotalValue;
j++; b++;
TotalValue=cost*Quantity; Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 4 : System.out.println("Minute Made Mix Fruit Juice"); cost= 120;
Ar[j ]= "Minute_Made "; Br[j ]=120;
System .out.println("Cost per pack=120"); System.out.println("Enter Quantity"); Quantity=br.nextInt(); TotalValue=cost*Quantity; Cr[j]=Quantity;
Dr[j]=TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost;


 
System.out.println("Total cost = "+TotalValue); break;
default: System.out.println("Wrong choice"); break;
}

break;

case 4: System.out.println("Soft Drink"); System.out.println("Press 1 for Appy Fizz"); System.out.println("Press 2 for Coca Cola"); System.out.println("Press 3 for Pepsi"); System.out.println("Press 4 for Sprite"); System.out.println("Make choice from above list"); int opt12=br.nextInt();
switch(opt12)

{

case 1 : System.out.println("Appy Fizz"); long cost= 80;
Ar[j]= "Appy_Fizz	"; Br[j]=80;
System.out.println("Cost per pack=80"); System.out.println("Enter Quantity"); int Quantity=br.nextInt(); Cr[j]=Quantity; TotalValue=cost*Quantity; Dr[j]=TotalValue;
j++; b++;

 
Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 2 : System.out.println("Coca Cola"); cost= 55;
Ar[j ]= "Coca_Cola	"; Br[j ]=55;
System .out.println("Cost per pack=55"); System.out.println("Enter Quantity"); Quantity=br.nextInt();
Cr[j]=Quantity; TotalValue=cost*Quantity; Dr[j]=TotalValue;
j++; b++;
Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 3: System.out.println("Pepsi"); cost=50;
Ar[j ]= "Pepsi	"; Br[j ]=50;
System.out.println("Cost per pack = 50"); System.out.println("Enter Quantity"); Quantity=br.nextInt();
Cr[j]=Quantity; TotalValue=cost*Quantity;

 
Dr[j]=TotalValue; j++;
b++;

Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
case 4: System.out.println("Sprite"); cost=48;
Ar[j]= "Sprite	"; Br[j]= 48;
System .out.println("Cost per pack= 48"); System.out.println("Enter Quantity"); Quantity=br.nextInt();
Cr[j]=Quantity; TotalValue=cost*Quantity; Dr[j]=TotalValue;
j++; b++;
TotalValue=cost*Quantity; Totalcost=cost*Quantity+Totalcost; System.out.println("Total cost = "+TotalValue); break;
default:System.out.println("Wrong choice"); break;
}

}

System.out.println("Press 1 for continue shoping in Beverages Section");


 
System.out.println("Press 2 to go to main menu"); System.out.println("Press 3 to exit");
int choice=br.nextInt(); switch(choice)
{

case 1: Beverages(); break;
case 2: Main_Menu(); break;
case 3: Billing(); break;
default:System.out.println("Wrong Choice"); Beverages();
break;

}

}

public void Billing()

{

System.out.println("Customer Name"); Scanner br=new Scanner (System .in); String Name = br.nextLine();
System.out.println("Customer phone number"); long num= br.nextLong();
System.out.println("******************** Welcome to BIG MART ********************"); System.out.println("	Aao Khushya Bate	");
System.out.println("		Shop number 10,11,12,13 Eternia, "); System.out.println("	Sector 10 Roadpali Pincode 410218 Tel.9327864562");

 
System.out.println(" "); System.out.println("Customer Name :"+Name);
System.out.println("Customer phone number :"+num); Date date = new Date();
System.out.println("Bill date = "+date); System.out.println("Bill number = 555 777 222");
System.out.println(" 				"); System.out.println(" | Items	Quantity	Cost	TotalCost |"); System.out.println(" 				"); System.out.println(" ");
for(int i=0;i<b;i++)

{

System.out.println(" |"+Ar[i]+"\t\t"+Cr[i]+"\t\t"+Br[i]+"\t\t"+Dr[i]+"\t\t"+	"|");

}

System.out.println(" 	"); System.out.println(" Total bill ="+Totalcost);
if(Totalcost>=0 && Totalcost<=200)

{

System.out.println("The discount = 5%"); Double Dis = Totalcost*0.05; System.out.println("The discount given = "+Dis); double NetAmt=Totalcost - Dis;
System.out.println("Total Bill to be paid = "+NetAmt);

}

else if (Totalcost>=201 && Totalcost<=500)

{

System.out.println("The discount = 10%");


 
Double Dis = Totalcost*0.10; System.out.println("The discount given = "+Dis); double NetAmt=Totalcost - Dis; System.out.println("Total Bill to be paid ="+NetAmt);
}

else

{

System.out.println("The discount = 15%"); Double Dis = Totalcost*0.15; System.out.println("The discount given = "+Dis); double NetAmt=Totalcost - Dis;
System.out.println("Total Bill to be paid = "+NetAmt);

}

System.out.println(" ");

System.out.println(" 	"); System.out.println("******************** Thank you for shoping ********************"); System.out.println(" ");
System.out.println("	Have a nice day");

System.out.println("	VISIT AGAIN");

System.out.println(" 	");



}

}

