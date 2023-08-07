package com.example.sw_final;
import java.util.ArrayList;
import java.util.List;

public class Sakanat {
    public static   int ww=0;

    public static   int M=0;

    protected static final List<HouseClass> house1 = new ArrayList<>();
    protected   static final List<AdminClass> admin1 = new ArrayList<>();
    protected   static final List<OwnerClass> owner1 = new ArrayList<>();
    protected   static final List<TenantClas> tenant1 = new ArrayList<>();

    public Sakanat()
    {
        addadmin();
        addhouse();
        addowner();
        addtenant();
    }
public static void addhouse()
{
    HouseClass h1=new HouseClass();
    h1.setPicture("C:\\Users\\hp\\Desktop\\summer2023\\SW\\houses_picture\\house1.jpg");
    h1.setServices("electricy,water");
    h1.setLocation("rafidia");
    h1.setPrice(Integer.parseInt("650"));
    h1.setBalcony(Integer.parseInt("3"));
    h1.setBedroom(Integer.parseInt("3"));
    h1.setBathroom(Integer.parseInt("3"));
    h1.setNumberhouse(Integer.parseInt("1102230"));
    h1.setaccepted(true);
    house1.add(h1);

    HouseClass h2=new HouseClass();
    h2.setPicture("C:\\Users\\hp\\Desktop\\summer2023\\SW\\houses_picture\\house2.jpg");
    h2.setServices("electricy,water,WIFI");
    h2.setLocation("najah_street");
    h2.setPrice(Integer.parseInt("700"));
    h2.setBalcony(Integer.parseInt("1"));
    h2.setBedroom(Integer.parseInt("4"));
    h2.setBathroom(Integer.parseInt("4"));
    h2.setNumberhouse(Integer.parseInt("1101180"));
    h2.setaccepted(true);
    house1.add(h2);
}


    public void addowner()
    {
        OwnerClass h1=new OwnerClass();
       h1.setid(408895811);
       h1.setAddress("Nabluse");
       h1.setPassword("12345**");
       h1.setPhonenumber(595861031);
       h1.setUsername("Abdullah Hussain");
        owner1.add(h1);

        OwnerClass h2=new OwnerClass();
        h2.setid(428678901);
        h2.setAddress("Jenen");
        h2.setPassword("987654");
        h2.setPhonenumber(597257511);
        h2.setUsername("Bader ibrahem");
        owner1.add(h2);
    }

    public void addadmin()
    {

        AdminClass h1=new AdminClass();
        h1.setPassword("123456**");
        h1.setUsername("Raia Ishtayeh");
        admin1.add(h1);

        AdminClass h2=new AdminClass();
        h2.setPassword("654321**");
        h2.setUsername("Rayhan Mahmoud");
        admin1.add(h2);
    }
    public void addtenant()
    {
        TenantClas h1=new TenantClas();
        h1.setAge(20);
        h1.setid(425968711);
        h1.setGender("female");
        h1.setPhonenumber(593646472);
        h1.setPassword("98765**");
        h1.setUniversityMajors("CE");
        h1.setUsername("Salma abdullah");
        tenant1.add(h1);

        TenantClas h2=new TenantClas();
        h2.setAge(30);
        h2.setid(745895644);
        h2.setGender("male");
        h2.setPhonenumber(595761287);
        h2.setPassword("145236**");
        h2.setUniversityMajors("medicin");
        h2.setUsername("Ghaith abdullah");
        tenant1.add(h2);
    }


}
