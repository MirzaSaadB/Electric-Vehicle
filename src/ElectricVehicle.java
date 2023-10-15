import java.util.Scanner;

public class ElectricVehicle
{
    static
    {
        System.out.println("|-------------------------------------|");
        System.out.println("|          {---Welcome To---}         |");
        System.out.println("|         {---Ev Filtration---}       |");
        System.out.println("|-------------------------------------|");
        System.out.println();
    }
    public static void main(String[] args)
    {
//        System.out.println("Press 1 for Signup");
//        System.out.println("Press 2 for Login");
//        System.out.println("Press 3 for Exit");
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("->");
//
//        int n = sc.nextInt();
//
//        Registration registration = new Regi();
//
//        switch (n)
//        {
//            case 1: registration.Signup();
//                break;
//
//            case 2: registration.Login();
//                break;
//
//            case 3: System.out.println("     {---Thank You For Visiting---}     ");
//                System.exit(0);
//                break;
//
//            default: System.out.println("Please enter the correct input");
//                main(null);
//                break;
//        }

        Menu menu = new Menu();
        menu.menu();
    }
}

interface Registration
{
    void Login();
    void Signup();
}

class Regi implements Registration
{
    private String name ;
    private long contact = 8652016818L;
    private String email ;
    String address;
    private String password = "admin";



    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public long getContact()
    {
        return contact;
    }

    public void setContact()// Method Recursion
    {
         Scanner sc = new Scanner(System.in);
 		 System.out.print("Enter Your Contact no: ");
 		 contact = sc.nextLong();
 		 if (contact > 999999999L && contact < 100000000000L)
          {
 		    System.out.println("Contact Number Valid");
 		  }
 		  else
           {
 		        System.out.println("Please enter 10 digits");
 		        setContact();
           }
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void Login()
    {
//        System.out.println("|---------------------------------------|");
        System.out.println("              {----Login-----}           ");
//        System.out.println("|---------------------------------------|");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Contact Number: ");
        System.out.print("->");
        long contact = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Your Password: ");
        System.out.print("->");
        String password = sc.nextLine();

        if ((this.contact==contact) && (this.password.equals(password)) && (contact > 999999999L) && (contact < 100000000000L))
        {
//            System.out.println("|-----------------------------------------------|");
            System.out.println("           {----Login Successfully-----}         ");
//            System.out.println("|-----------------------------------------------|");
            System.out.println(" ");
        }
        else
        {
            System.out.println("Please Enter Valid Contact No And Password");
            Login();
        }

    }

    public void Signup()
    {
//      System.out.println("|---------------------------------------|");
        System.out.println("          {----Signup Hear-----}         ");
//      System.out.println("|---------------------------------------|");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        System.out.print("->");
        name = sc.nextLine();

        setContact();

        System.out.print("Enter Your Email: ");
        System.out.print("->");
        email = sc.nextLine();

        System.out.print("Enter Your Address: ");
        System.out.print("->");
        address = sc.nextLine();

        System.out.print("Enter Your Password: ");
        System.out.print("->");
        password = sc.nextLine();
//      System.out.println("|---------------------------------------|");

//        System.out.println("|---------------------------------------|");
        System.out.println("      {----Signup Successfully-----}     ");
//        System.out.println("|---------------------------------------|");
        System.out.println(" ");
        Login();
    }
}

class Menu
{
    public void menu()
    {
        EvCars evCars = new EvCars();
        EvBikes evBikes = new EvBikes();
        EvScooter evScooter = new EvScooter();
        EvCycle evCycle = new EvCycle();
        System.out.println("|-------------------------------------|");
        System.out.println("|-------------------------------------|");
        System.out.println("|           Press 1 EvCars            |");
        System.out.println("|-------------------------------------|");

        System.out.println("|-------------------------------------|");
        System.out.println("|           Press 2 EvBikes           |");
        System.out.println("|-------------------------------------|");

        System.out.println("|-------------------------------------|");
        System.out.println("|           Press 3 EvScooters        |");
        System.out.println("|-------------------------------------|");

        System.out.println("|-------------------------------------|");
        System.out.println("|           Press 4 EvCycle           |");
        System.out.println("|-------------------------------------|");

        System.out.println("|-------------------------------------|");
        System.out.println("|           Press 5 To Exit           |");
        System.out.println("|-------------------------------------|");

        System.out.println("|-------------------------------------|");
        System.out.println("| Enter The Number From The Following |");
        System.out.println("|-------------------------------------|");
        System.out.println("|-------------------------------------|");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.print("->");

        int choose = sc.nextInt();

        switch (choose)
        {
            case 1 :
                System.out.println("|-------------------------------------|");
                System.out.println("|       WelCome To The Ev Car Zon     |");
                System.out.println("|-------------------------------------|");
                evCars.Cars();
                break;

            case 2 :
                break;

            case 3:
                break;

            case 4:
                break;
            case 5:
                System.out.println("|-------------------------------------|");
                System.out.println("|        Thank You For Visiting       |");
                System.out.println("|-------------------------------------|");
                System.exit(0);
                break;
            default:
                System.out.println("|-------------------------------------|");
                System.out.println("|        Please Give Valid Value      |");
                System.out.println("|-------------------------------------|");
                menu();
                break;

        }
    }
}

class EvCars extends Electrics
{
//    Electrics electrics = new Electrics();

    Car car = new Car();

    Menu menu = new Menu();
    public void Cars()
    {
        System.out.println("|-------------------------------------|");
        System.out.println("|       Press 1 For Ev Cars Name      |");
        System.out.println("|-------------------------------------|");
        System.out.println("|-------------------------------------|");
        System.out.println("|       Press 2 For Back To Menu      |");
        System.out.println("|-------------------------------------|");

        Scanner sc = new Scanner(System.in);
        System.out.print("->");
        int choose = sc.nextInt();

        switch (choose)
        {
            case 1 :CarList();
                break;

            case 2 :
                menu.menu();
                break;
            default:
                System.out.println("Plz Enter The Valid Input");
                Cars();
                break;
        }



    }

    public void CarList()
    {
        System.out.println("|-------------------------------------|");
        System.out.println("|         Press 1 For Nexon Ev        |");
        System.out.println("|-------------------------------------|");
        System.out.println("|         Press 2 For Comet Ev        |");
        System.out.println("|-------------------------------------|");
        System.out.println("|         Press 3 For Tiago Ev        |");
        System.out.println("|-------------------------------------|");
        System.out.println("|        Press 4 For XUV400 EV        |");
        System.out.println("|-------------------------------------|");
        System.out.println("|      Press 0 For Back To Car Zon    |");
        System.out.println("|-------------------------------------|");

        Scanner sc = new Scanner(System.in);
        System.out.print("->");

        int enter = sc.nextInt();

        switch (enter)
        {
            case 1 : car.Nexon();
                break;

            case 2 : car.Comet();
                break;

            case 3 : car.Tiago();
                break;

            case 4 : car.XUV400();
                break;
            case 0 : Cars();
                break;

        }
    }
}

class Car extends Electrics
{
    public void Nexon()
    {
        Menu menu = new Menu();
        EvCars evCars = new EvCars();

        System.out.println("|-------------------------------------|");
        System.out.println("|         Press 1 For Details         |");
        System.out.println("|-------------------------------------|");
        System.out.println("|       Press 2 For Specifications    |");
        System.out.println("|-------------------------------------|");
        System.out.println("|       Press 0 For Back Car List     |");
        System.out.println("|-------------------------------------|");

        System.out.println("-------------------------------------");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("->");

        int choose = scanner.nextInt();


         switch (choose)
         {
             case 1 :
                 System.out.println("-------------------------------------");
                 System.out.println(" ");

                 Details("TATA", "NEXON EV", "17.14 LAKHS", "WHITE", "Creative Plus");
                 System.out.println("Brand Name: " + BrandName);
                 System.out.println("Car Name: " + ModelName);
                 System.out.println("Car Price: " + Price);
                 System.out.println("Car Color: " + Color);
                 System.out.println("Car Variant: " + Variant);

                 System.out.println(" ");
                 System.out.println("-------------------------------------");
                 System.out.println(" ");

                 System.out.println("|-------------------------------------|");
                 System.out.println("|       Press 0 For Back To Nexon     |");
                 System.out.println("|-------------------------------------|");

                 Scanner sc = new Scanner(System.in);
                 System.out.print("->");

                 int enter =sc.nextInt();

                 switch (enter)
                 {
                     case 0 : Nexon();

                     break;
                 }
                 break;

             case 2 :
                Specifications("Electric(Battery)","465 Km","40.5 kWh","15 HOURS",
                        "YES","Automatic","YES","Yes","215Nm",
                        "142.68BHP","142.68BHP","","0 - 100 in 8.9 Seconds",
                        "Disc","Disc","Electric","5.3",
                        "215 /60 R16","Low Rolling Resistance","Yes");
                System.out.println("FUEL TYPE : " +FuelType );
                System.out.println("RANGE : " +Range );
                System.out.println("BATTERY CAPACITY : " +BatteryCapacity );
                System.out.println("CHARGING TIME : " +ChargingTime );
                System.out.println("TRANSMISSION : " +Transmission );
                System.out.println("FAST CHARGING : " +FastCharging );
                System.out.println("ABS : " +ABS );
                System.out.println("MAX TORQUE : " +MaxTorque );
                System.out.println("MAX POWER : " +MaxPower );
                System.out.println("MOTOR POWER : " +MotorPower );
                System.out.println("SPEED : " +Speed );
                System.out.println("FRONT BREAKS : " +FrontBreaks );
                System.out.println("REAL BREAKS : " +RealBreaks );
                System.out.println("STEERING TYPE: " +SteeringType );
                System.out.println("MIN TURNING RADIUS : " +MinTurningRadius );
                System.out.println("TYRE SIZE : " +TyreSize );
                System.out.println("TYRE TYPE : " +TyreType );
                 System.out.println("CruiseControl : " + CruiseControl);
                System.out.println("-------------------------------------");

                 System.out.println("|-------------------------------------|");
                 System.out.println("|      Press 0 For Back To Nexon      |");
                 System.out.println("|-------------------------------------|");

                 Scanner sc2 = new Scanner(System.in);
                 System.out.print("->");

                 int value =sc2.nextInt();

                 switch (value)
                 {
                     case 0 : Nexon();

                         break;
                 }
                 break;

             case 0 : evCars.CarList();

             case 3 : menu.menu();
                 break;
         }

    }

    public void Comet()
    {
        Menu menu = new Menu();
        EvCars evCars = new EvCars();
        System.out.println("|-------------------------------------|");
        System.out.println("|         Press 1 For Details         |");
        System.out.println("|-------------------------------------|");
        System.out.println("|      Press 2 For Specifications     |");
        System.out.println("|-------------------------------------|");
        System.out.println("|      Press 0 For Back Car List      |");
        System.out.println("|-------------------------------------|");


        Scanner scanner = new Scanner(System.in);
        System.out.print("->");

        int choose = scanner.nextInt();


        switch (choose)
        {
            case 1 :
                Details("MG", "COMET EV", "9.98 LAKHS", "GREEN", "TOP MODEL");

                System.out.println("Brand Name: " + BrandName);
                System.out.println("Car Name: " + ModelName);
                System.out.println("Car Price: " + Price);
                System.out.println("Car Color: " + Color);
                System.out.println("Car Variant: " + Variant);
                System.out.println("-------------------------------------");

                System.out.println("|-------------------------------------|");
                System.out.println("|      Press 0 For Back To Comet      |");
                System.out.println("|-------------------------------------|");

                Scanner sc = new Scanner(System.in);
                System.out.print("->");

                int enter =sc.nextInt();

                switch (enter)
                {
                    case 0 : Comet();

                        break;
                }
                break;

            case 2 :
            Specifications("Electronic(Battery)","230 KM","17.3 KWH","17 HOURS",
                        "YES","AUTOMATIC","YES","215NM","142.68BHP",
                        "142.68","0-100 KM IN 0.9SEC","DISC","DISC",
                        "Electronic","5.3","215 /60 R16","Low Rolling Resistance",
                    "0.57","Tubeless,Radial","No");
                System.out.println("FUEL TYPE : " + FuelType );
                System.out.println("RANGE : " + Range );
                System.out.println("BATTERY CAPACITY : " + BatteryCapacity );
                System.out.println("CHARGING TIME : " + ChargingTime );
                System.out.println("TRANSMISSION : " + Transmission );
                System.out.println("FAST CHARGING : " + FastCharging );
                System.out.println("ABS : " + ABS );
                System.out.println("MAX TORQUE : " + MaxTorque );
                System.out.println("MAX POWER : " + MaxPower );
                System.out.println("MOTOR POWER : " + MotorPower );
                System.out.println("DriveType : " + DriveType);
                System.out.println("SPEED : " + Speed );
                System.out.println("FRONT BREAKS : " + FrontBreaks );
                System.out.println("REAL BREAKS : " + RealBreaks );
                System.out.println("STEERING TYPE: " + SteeringType );
                System.out.println("MIN TURNING RADIUS : " + MinTurningRadius );
                System.out.println("TYRE SIZE : " + TyreSize );
                System.out.println("TYRE TYPE : " + TyreType );
                System.out.println("CruiseControl : " + CruiseControl);
                System.out.println("-------------------------------------");

                System.out.println("|-------------------------------------|");
                System.out.println("|       Press 0 For Back To Comet     |");
                System.out.println("|-------------------------------------|");

                Scanner sc2 = new Scanner(System.in);
                System.out.print("->");

                int value =sc2.nextInt();

                switch (value)
                {
                    case 0 : Comet();

                        break;
                }
                break;

            case 0 : evCars.CarList();

            case 3 : menu.menu();
                break;
        }

    }

    public void Tiago()
    {
        Menu menu = new Menu();
        EvCars evCars = new EvCars();
        System.out.println("|-------------------------------------|");
        System.out.println("|         Press 1 For Details         |");
        System.out.println("|-------------------------------------|");
        System.out.println("|      Press 2 For Specifications     |");
        System.out.println("|-------------------------------------|");
        System.out.println("|      Press 0 For Back Car List      |");
        System.out.println("|-------------------------------------|");


        Scanner scanner = new Scanner(System.in);
        System.out.print("->");

        int choose = scanner.nextInt();


        switch (choose)
        {
            case 1 :
                Details("TATA", "TIAGO EV", "12.03 LAKHS", "Daytona Grey", "TOP MODEL");

                System.out.println("Brand Name: " + BrandName);
                System.out.println("Car Name: " + ModelName);
                System.out.println("Car Price: " + Price);
                System.out.println("Car Color: " + Color);
                System.out.println("Car Variant: " + Variant);
                System.out.println("-------------------------------------");

                System.out.println("|-------------------------------------|");
                System.out.println("|      Press 0 For Back To Tiago      |");
                System.out.println("|-------------------------------------|");

                Scanner sc = new Scanner(System.in);
                System.out.print("->");

                int enter =sc.nextInt();

                switch (enter)
                {
                    case 0 : Tiago();

                        break;
                }
                break;

            case 2 :
                Specifications("Electronic(Battery)","315 km","24 KWh","58 Min(10-80%)",
                        "Driver and Passenger","AUTOMATIC","YES","YES","114Nm",
                        "73.75bhp","73.75bhp","Front Wheel Drive (FWD)","0 - 100 in 13.43 Seconds",
                        "DISC","DISC","Electric","5.1",
                        "175/65 R14","Tubeless,Radial","Yes");
                System.out.println("FUEL TYPE : " + FuelType );
                System.out.println("RANGE : " + Range );
                System.out.println("BATTERY CAPACITY : " + BatteryCapacity );
                System.out.println("CHARGING TIME : " + ChargingTime );
                System.out.println("TRANSMISSION : " + Transmission );
                System.out.println("FAST CHARGING : " + FastCharging );
                System.out.println("ABS : " + ABS );
                System.out.println("MAX TORQUE : " + MaxTorque );
                System.out.println("MAX POWER : " + MaxPower );
                System.out.println("MOTOR POWER : " + MotorPower );
                System.out.println("DriveType : " + DriveType);
                System.out.println("SPEED : " + Speed );
                System.out.println("FRONT BREAKS : " + FrontBreaks );
                System.out.println("REAL BREAKS : " + RealBreaks );
                System.out.println("STEERING TYPE: " + SteeringType );
                System.out.println("MIN TURNING RADIUS : " + MinTurningRadius );
                System.out.println("TYRE SIZE : " + TyreSize );
                System.out.println("TYRE TYPE : " + TyreType );
                System.out.println("CruiseControl : " + CruiseControl);
                System.out.println("-------------------------------------");

                System.out.println("|-------------------------------------|");
                System.out.println("|       Press 0 For Back To Tiago     |");
                System.out.println("|-------------------------------------|");

                Scanner sc2 = new Scanner(System.in);
                System.out.print("->");

                int value =sc2.nextInt();

                switch (value)
                {
                    case 0 : Tiago();

                        break;
                }
                break;

            case 0 : evCars.CarList();

            case 3 : menu.menu();
                break;
        }

    }

    public void XUV400()
    {
        Menu menu = new Menu();
        EvCars evCars = new EvCars();
        System.out.println("|-------------------------------------|");
        System.out.println("|         Press 1 For Details         |");
        System.out.println("|-------------------------------------|");
        System.out.println("|      Press 2 For Specifications     |");
        System.out.println("|-------------------------------------|");
        System.out.println("|      Press 0 For Back Car List      |");
        System.out.println("|-------------------------------------|");


        Scanner scanner = new Scanner(System.in);
        System.out.print("->");

        int choose = scanner.nextInt();


        switch (choose)
        {
            case 1 :
                Details("Mahindra", "XUV400 EV", "19.39  LAKHS", "Napoli Black Dualtone", "TOP MODEL");

                System.out.println("Brand Name: " + BrandName);
                System.out.println("Car Name: " + ModelName);
                System.out.println("Car Price: " + Price);
                System.out.println("Car Color: " + Color);
                System.out.println("Car Variant: " + Variant);
                System.out.println("-------------------------------------");

                System.out.println("|-------------------------------------|");
                System.out.println("|      Press 0 For Back To XUV 400      |");
                System.out.println("|-------------------------------------|");

                Scanner sc = new Scanner(System.in);
                System.out.print("->");

                int enter =sc.nextInt();

                switch (enter)
                {
                    case 0 : XUV400();

                        break;
                }
                break;

            case 2 :
                Specifications("Electronic(Battery)","456 km","39.4 KWh","50 Min(10-80%)",
                        "6 airbags","AUTOMATIC","YES","YES","310Nm",
                        "147.51 BHP","147.51","Front Wheel Drive (FWD)","0 - 100 in 8.3 Seconds",
                        "DISC","DISC","Electric","4.2",
                        "205/65 R16","Tubeless,Radial","Yes");
                System.out.println("FUEL TYPE : " + FuelType );
                System.out.println("RANGE : " + Range );
                System.out.println("BATTERY CAPACITY : " + BatteryCapacity );
                System.out.println("CHARGING TIME : " + ChargingTime );
                System.out.println("TRANSMISSION : " + Transmission );
                System.out.println("FAST CHARGING : " + FastCharging );
                System.out.println("ABS : " + ABS );
                System.out.println("MAX TORQUE : " + MaxTorque );
                System.out.println("MAX POWER : " + MaxPower );
                System.out.println("MOTOR POWER : " + MotorPower );
                System.out.println("DriveType : " + DriveType);
                System.out.println("SPEED : " + Speed );
                System.out.println("FRONT BREAKS : " + FrontBreaks );
                System.out.println("REAL BREAKS : " + RealBreaks );
                System.out.println("STEERING TYPE: " + SteeringType );
                System.out.println("MIN TURNING RADIUS : " + MinTurningRadius );
                System.out.println("TYRE SIZE : " + TyreSize );
                System.out.println("TYRE TYPE : " + TyreType );
                System.out.println("CruiseControl : " + CruiseControl);
                System.out.println("-------------------------------------");

                System.out.println("|-------------------------------------|");
                System.out.println("|       Press 0 For Back To XUV 400     |");
                System.out.println("|-------------------------------------|");

                Scanner sc2 = new Scanner(System.in);
                System.out.print("->");

                int value =sc2.nextInt();

                switch (value)
                {
                    case 0 : XUV400();

                        break;
                }
                break;

            case 0 : evCars.CarList();

            case 3 : menu.menu();
                break;
        }

    }
}

class EvBikes extends Electrics
{

}

class EvScooter extends Electrics
{

}

class EvCycle extends Electrics
{

}

class Electrics
{

    // details
    String BrandName;
    String ModelName;
    String Price;
    String Color;
    String Variant;

    // Specifications
    String FuelType;
    String Range;
    String BatteryCapacity;
    String ChargingTime;
    String AirBag;
    String Transmission;
    String FastCharging;
    String ABS;
    String MaxTorque;
    String MaxPower;
    String MotorPower;
    String DriveType;
    String Speed;
    String FrontBreaks;
    String RealBreaks;
    String SteeringType;
    String MinTurningRadius;
    String TyreSize;
    String TyreType;
    String CruiseControl ;

    public void Details(String BrandName, String ModelName, String Price, String Color, String Variant)
    {
        this.BrandName = BrandName;
        this.ModelName = ModelName;
        this.Price = Price;
        this.Color = Color;
        this.Variant = Variant;
    }

    public void Specifications( String FuelType,
                                String Range,
                                String BatteryCapacity,
                                String ChargingTime,
                                String AirBag,
                                String Transmission,
                                String FastCharging,
                                String ABS,
                                String MaxTorque,
                                String MaxPower,
                                String MotorPower,
                                String DriveType,
                                String Speed,
                                String FrontBreaks,
                                String RealBreaks,
                                String SteeringType,
                                String MinTurningRadius,
                                String TyreSize,
                                String TyreType,
                                String CruiseControl)
    {
        this.FuelType = FuelType;
        this.Range = Range;
        this.BatteryCapacity = BatteryCapacity;
        this.ChargingTime = ChargingTime;
        this.AirBag = AirBag;
        this.Transmission = Transmission;
        this.FastCharging = FastCharging;
        this.ABS = ABS;
        this.MaxTorque = MaxTorque;
        this.MaxPower = MaxPower;
        this.MotorPower = MotorPower;
        this.DriveType = DriveType;
        this.Speed = Speed;
        this.FrontBreaks = FrontBreaks;
        this.RealBreaks = RealBreaks;
        this.SteeringType = SteeringType;
        this.MinTurningRadius = MinTurningRadius;
        this.TyreSize = TyreSize;
        this.TyreType = TyreType;
        this.CruiseControl= CruiseControl;


    }
}

