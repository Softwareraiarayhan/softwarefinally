package com.example.sw_final;

import javax.swing.*;

public class TESTLOGIN {
    public  static int typeuser;
    public static   void fun(int x)
    {
        typeuser=x;
    }
private static   String x="user not found";
private    static  String y="incorrect";
    private TESTLOGIN()
    {

    }
private   static boolean flag=true;
    public static boolean userNametest(String string2) {
if(typeuser==1)
{
    if(Sakanat.admin1.get(0).getUsername().trim().equals(string2.trim()))
        return true;

  else if(Sakanat.admin1.get(1).getUsername().trim().equals(string2.trim()))
        return true;
  else    JOptionPane.showMessageDialog(null, x, y, JOptionPane.ERROR_MESSAGE);


}
else if (typeuser==2)
{
    for (int i=0;i<Sakanat.owner1.size();i++)
    {
        if(Sakanat.owner1.get(i).getUsername().trim().equals(string2.trim()))
            return true;
        else   flag=false;
    }
if(flag==false){JOptionPane.showMessageDialog(null, x, y, JOptionPane.ERROR_MESSAGE);flag=true;}
}
else if(typeuser==3)
{
    for (int i=0;i<Sakanat.tenant1.size();i++)
    {
        if(Sakanat.tenant1.get(i).getUsername().trim().equals(string2.trim()))
            return true;
        else   flag=false;
    }
    if(flag==false) {
        JOptionPane.showMessageDialog(null, x, y, JOptionPane.ERROR_MESSAGE);
   flag=true; }
}

return false;
    }

    public static boolean passWordtest(String string2)

    {
        if(typeuser==1)
        {
            if(Sakanat.admin1.get(0).getPassword().trim().equals(string2.trim()))
                return true;

            if(Sakanat.admin1.get(1).getPassword().trim().equals(string2.trim()))
                return true;
        }
        else if (typeuser==2)
        {
            for (int i=0;i<Sakanat.owner1.size();i++)
            {
                if(Sakanat.owner1.get(i).getPassword().trim().equals(string2.trim()))
                    return true;
                else   flag=false;
            }
            if(flag==false)
            {
                JOptionPane.showMessageDialog(null, x, y, JOptionPane.ERROR_MESSAGE);
                flag=true;
            }


        }
        else if(typeuser==3)
        {
            for (int i=0;i<Sakanat.tenant1.size();i++)
            {
                if(Sakanat.tenant1.get(i).getPassword().trim().equals(string2.trim()))
                    return true;
                else  flag=false;

            }
            if(flag==false)
            {
                JOptionPane .showMessageDialog(null, x, y, JOptionPane.ERROR_MESSAGE);
flag=true;
            }

        }
        return false;
    }

}
