package address;

/****************************************************************************
*
* Created on : 20 Dec. 2017
* Created for : ICS3UR
* Daily Assignment - Unit 5-04
* This program 
*
****************************************************************************/

import java.util.Scanner;

public class mailingAddressEnumerate 
{
    public static enum StreetTypeList
         {
              ST, DR, AVE, CRES, GRV;
          }

     public static enum ProvinceList
         {
              ON, QC, NL, PE, NS, NB, MB, SK, AB, BC, YT, NT, NU;
          }   
     
    public static void main(String[] args)
    {              
         String lastName="", firstName="", unitNumber="", civicNumber="", streetName="",
        		 streetType="", municipality="", province="", postalCode="";
         Scanner input = new Scanner(System.in);
         System.out.println("What is the addressee's last name?");
         lastName = input.nextLine();
         System.out.println("What is the addressee's first name? ");
         firstName = input.nextLine();
         System.out.println("What is their unit number? ");
         unitNumber = input.nextLine();
         System.out.println("What is their civic number? ");
         civicNumber = input.nextLine();
         System.out.println("What is the name of the street? ");
         streetName = input.nextLine();

        // streetType = streetType.toUpperCase();

         
         Boolean matchingStreetTypeFound = false;
         
         while (!matchingStreetTypeFound)
         {
             System.out.println("What is their street type? ");     
             streetType = input.nextLine();
             
             for (StreetTypeList StreetT: StreetTypeList.values()) 
             {
                   if (StreetT.name().equalsIgnoreCase(streetType)) 
                   {
                	   matchingStreetTypeFound = true;
                	   break;
                    }
              }
         }

         System.out.println("Which municipality is the letter being sent to? ");                   
         municipality = input.nextLine();
         //province = province.toUpperCase();        

         Boolean matchingProvinceFound = false;
         
         while (!matchingProvinceFound)
         {
             System.out.println("Which province is the letter being sent to? ");     
             province = input.nextLine();
             
             for (ProvinceList P: ProvinceList.values()) 
             {
                   if (P.name().equalsIgnoreCase(province)) 
                   {
                	   matchingProvinceFound = true;
                	   break;
                    }
              }
         }                                      
         System.out.println("What is their postal code?");
         postalCode = input.nextLine();  

         mailingAddress address = new mailingAddress();      
         address.firstName = firstName;
         address.lastName = lastName;      
         address.unitNumber = unitNumber;
         address.civicNumber = civicNumber;
         address.streetName = streetName;
         address.streetType = streetType;
         address.municipality = municipality;
         address.province = province;
         address.postalCode = postalCode;
      
         System.out.println(address.firstName + ' ' + address.lastName);
         System.out.println(address.unitNumber + '-' +  address.civicNumber + ' ' + address.streetName + ' ' + address.streetType);
         System.out.println(address.municipality + ' ' + address.province + ' ' + address.postalCode);        
    }
}

class mailingAddress

{   
    String firstName;
    String lastName;
    String civicNumber;
    String unitNumber;     
    String streetName;
    String streetType;
    String municipality;
    String province;
    String postalCode;     
}
