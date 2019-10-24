
//Frankie Ribas

package car.shopping;

import java.util.Scanner;

public class CarShopping
{
    
   private static Scanner kb = new Scanner(System.in);

   public static void main(String[] args)
   {
      int totalCost = 0;
      totalCost += base();
      totalCost += automaticWindows();
      totalCost += remoteKey();
      totalCost += onStar();
      totalCost += antiLock();
      totalCost += telescope();
      totalCost += sunroof();
      totalCost += coldWeather();
      totalCost += gps();
      totalCost += wifi();
      totalCost += autoPark();
      totalCost += tv();
      System.out.println("\n***** CAR TOTAL $" + totalCost + " *****");
   }
    
   public static int base()
   {
      System.out.println("Our inventory:");
      System.out.println("Model 1 - $15,000");
      System.out.println("Model 2 - $24,000");
      System.out.println("Model 3 - $40,000");
      System.out.print("Which base model did the customer choose? (enter full model name ex. Model 1) > ");
      String model = kb.nextLine();
      if(model.equalsIgnoreCase("Model 1")) {
         return 15000;
      } else if(model.equalsIgnoreCase("Model 2")) {
         return 24000;
      } else {
         return 40000;
      }
   }
   
    public static int automaticWindows() {
        System.out.print("Automatic Windows for $500? (y/n) > ");
        String autoWindow = kb.nextLine();
        if (autoWindow.equals("y")) {
            return 500;
        } else {
            return 0;
        }
    }
    
    public static int remoteKey() {
        System.out.print("Remote Keyless Entry for $1000? (y/n) > ");
        String remoteKey = kb.nextLine();
        if (remoteKey.equals("y")) {
            return 1000;
        } else {
            return 0;
        }
    }
    
    public static int onStar() {
        System.out.print("OnStar System for $1000? (y/n) > ");
        String onStar = kb.nextLine();
        if (onStar.equals("y")) {
            return 1000;
        } else {
            return 0;
        }
    }
    
    public static int antiLock() {
        System.out.print("Anti-lock Brakes (ABS) for $500? (y/n) > ");
        String antiLock = kb.nextLine();
        if (antiLock.equals("y")) {
            return 500;
        } else {
            return 0;
        }
    }
    
    public static int telescope() {
        System.out.print("Telescope Steering Wheel / Adjustable Pedals for $1000? (y/n) > ");
        String tele = kb.nextLine();
        if (tele.equals("y")) {
            return 1000;
        } else {
            return 0;
        }
    }
    
    public static int sunroof() {
        System.out.print("Sunroof for $800? (y/n) > ");
        String sunroof = kb.nextLine();
        if (sunroof.equals("y")) {
            return 800;
        } else {
            return 0;
        }
    }
    
    public static int coldWeather() {
        System.out.print("Cold Weather Package (Heated Seats / Windshield Heater) for $1500? (y/n) > ");
        String coldPack = kb.nextLine();
        if (coldPack.equals("y")) {
            return 1500;
        } else {
            return 0;
        }
    }
    
    public static int gps() {
        System.out.print("GPS Navigation System for $750? (y/n) > ");
        String gps = kb.nextLine();
        if (gps.equals("y")) {
            return 750;
        } else {
            return 0;
        }
    }
    
    public static int wifi() {
        System.out.print("Wi-fi Hotspot for $200? (y/n) > ");
        String wifi = kb.nextLine();
        if (wifi.equals("y")) {
            return 200;
        } else {
            return 0;
        }
    }
    
    public static int autoPark() {
        System.out.print("Autopark Safety System for $800? (y/n) > ");
        String auto = kb.nextLine();
        if (auto.equals("y")) {
            return 800;
        } else {
            return 0;
        }
    }
    
    public static int tv() {
        System.out.print("TV Screens for $750? (y/n) > ");
        String tv = kb.nextLine();
        if (tv.equals("y")) {
            return 750;
        } else {
            return 0;
        }
    }
}