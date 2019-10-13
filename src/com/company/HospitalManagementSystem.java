package com.company;
import java.io.*;
import java.util.*;
import java.util.Calendar;

public class HospitalManagementSystem {

    class staff {
        String sid,sname,desg,sex;
        int salary;
        void new_staff()
        {
            Scanner input=new Scanner(System.in);
            System.out.print("id:-");sid=input.nextLine();
            System.out.print("name:-");sname=input.nextLine();
            System.out.print("designation:-");desg=input.nextLine();
            System.out.print("sex:-");sex=input.nextLine();
            System.out.print("salary:-");salary=input.nextInt();
        }
        void staff_info()
        {
            System.out.println(sid+"\t"+sname+"\t"+sex+"\t"+salary);
        }
    }


    class doctor
    {
        String did,dname,specialisation,hours,doc_qual;
        int droom;
        void new_doctor()
        {
            Scanner input=new Scanner(System.in);
            System.out.print("id:-");did=input.nextLine();
            System.out.print("name:-");dname=input.nextLine();
            System.out.print("specialisation:-");specialisation=input.nextLine();
            System.out.print("work time:-");hours=input.nextLine();
            System.out.print("qualification:-");doc_qual=input.nextLine();
            System.out.print("room no.:-");droom=input.nextInt();
        }
        void doctor_info() { System.out.println(did+"\t"+dname+"  \t"+specialisation+"     \t"+hours+"    \t"+doc_qual+"       \t"+droom); }
    }


    class patient
    {
        String pid,pname,disease,sex,admit_status;
        int age;
        void new_patient()
        {
            Scanner input=new Scanner(System.in);
            System.out.print("id:-");pid=input.nextLine();
            System.out.print("name:-");pname=input.nextLine();
            System.out.print("disease:-");disease=input.nextLine();
            System.out.print("sex:-");sex=input.nextLine();
            System.out.print("admit_status:-");admit_status=input.nextLine();
            System.out.print("age:-");age=input.nextInt();
        }
        void patient_info()  {System.out.println(pid+"\t"+pname+" \t"+disease+"     \t"+sex+"      \t"+admit_status+"\t"+age); }
    }


    class medical
    {
        String med_name,med_comp,exp_date;
        int med_cost,count;
        void new_medi()
        {
            Scanner input=new Scanner(System.in);
            System.out.print("name:-");med_name=input.nextLine();
            System.out.print("comp:-");med_comp=input.nextLine();
            System.out.print("exp_date:-");exp_date=input.nextLine();
            System.out.print("cost:-");med_cost=input.nextInt();
            System.out.print("no of unit:-");count=input.nextInt();
        }
        void find_medi()
        {
            System.out.println(med_name+"  \t"+med_comp+"    \t"+exp_date+"     \t"+med_cost);
        }
    }

    class lab
    {
        String facility;
        int lab_cost;

        void new_faci()
        {
            Scanner input=new Scanner(System.in);
            System.out.print("facility:-");facility=input.nextLine();
            System.out.print("cost:-");lab_cost=input.nextInt();
        }
        void faci_list()
        {
            System.out.println(facility+"\t\t"+lab_cost);
        }
    }


    class facility
    {
        String fac_name;
        void add_faci()
        {
            Scanner input=new Scanner(System.in);
            System.out.print("facility:-");fac_name=input.nextLine();
        }
        void show_faci()
        {
            System.out.println(fac_name);
        }
    }


    public class HOSPITALMGT
    {
        public void main(String args[])
        {
            String months[] = {
                    "Jan", "Feb", "Mar", "Apr",
                    "May", "Jun", "Jul", "Aug",
                    "Sep", "Oct", "Nov", "Dec"};
            Calendar calendar = Calendar.getInstance();
//System.out.println("--------------------------------------------------------------------------------");
            int count1=4,count2=4,count3=4,count4=4,count5=4,count6=4;

            System.out.println("________________________________________________________________________________");
            System.out.println("                          ~~~HOSPITAL MANAGEMENT SYSTEM~~~");
            System.out.println("________________________________________________________________________________");
            System.out.print("Date: "+months[calendar.get(Calendar.MONTH)]+" " + calendar.get(Calendar.DATE) + " "+calendar.get(Calendar.YEAR));
            System.out.println("\t\t\t\t\t\tTime: "+calendar.get(Calendar.HOUR) + ":"+calendar.get(Calendar.MINUTE) + ":"+calendar.get(Calendar.SECOND));

            doctor[] d=new doctor[25];
            patient[] p=new patient[100];
            lab[] l=new lab[20];
            facility[] f=new facility[20];
            medical[] m=new medical[100];
            staff[] s=new staff[100];
            int i;
            for(i=0;i<25;i++)
                d[i]=new doctor();
            for(i=0;i<100;i++)
                p[i]=new patient();
            for(i=0;i<20;i++)
                l[i]=new lab();
            for(i=0;i<20;i++)
                f[i]=new facility();
            for(i=0;i<100;i++)
                m[i]=new medical();
            for(i=0;i<100;i++)
                s[i]=new staff();

            d[0].did="21"; d[0].dname="Dr.Marzouq"; d[0].specialisation="ENT"; d[0].hours="10-4"; d[0].doc_qual="mbbs,Md"; d[0].droom=17;
            d[1].did="32"; d[1].dname="Dr.Fawibe"; d[1].specialisation="medi."; d[1].hours="10-4"; d[1].doc_qual="mbbs,md"; d[1].droom=45;
            d[2].did="17"; d[2].dname="Dr.Diran"; d[2].specialisation="Child spl"; d[2].hours="10-4"; d[2].doc_qual="bdm"; d[2].droom=8;
            d[3].did="33"; d[3].dname="Dr.Lawoyin"; d[3].specialisation="Artho"; d[3].hours="10-4"; d[3].doc_qual="mbbs,ms"; d[3].droom=40;

            p[0].pid="12"; p[0].pname="Adeolu"; p[0].disease="cancer"; p[0].sex="male"; p[0].admit_status="y"; p[0].age=30;
            p[1].pid="13"; p[1].pname="Bukola"; p[1].disease="cold"; p[1].sex="male"; p[1].admit_status="y"; p[1].age=23;
            p[2].pid="14"; p[2].pname="Peterson"; p[2].disease="malaria"; p[2].sex="male"; p[2].admit_status="y"; p[2].age=45;
            p[3].pid="15"; p[3].pname="Sanmi"; p[3].disease="sugar"; p[3].sex="male"; p[3].admit_status="y"; p[3].age=25;

            m[0].med_name="Paracetamol"; m[0].med_comp="mzor"; m[0].exp_date="9-5-20"; m[0].med_cost=55; m[0].count=8;
            m[1].med_name="Ampicillin"; m[1].med_comp="donport"; m[1].exp_date="10-1-21"; m[1].med_cost=500; m[1].count=5;
            m[2].med_name="Septrin"; m[2].med_comp="bioraj"; m[2].exp_date="12-7-20"; m[2].med_cost=50; m[2].count=56;
            m[3].med_name="Combisunate"; m[3].med_comp="ajanta"; m[3].exp_date="12-4-19"; m[3].med_cost=1100; m[3].count=100;

            l[0].facility="x-ray      "; l[0].lab_cost=800;
            l[1].facility="ct scan   "; l[1].lab_cost=1200;
            l[2].facility="or scan   "; l[2].lab_cost=500;
            l[3].facility="blood bank"; l[3].lab_cost=50;

            f[0].fac_name="ambulance";
            f[1].fac_name="admision facility";
            f[2].fac_name="generator";
            f[3].fac_name="live  support machine";
            f[4].fac_name="fire alarm";

            s[0].sid="22"; s[0].sname="Daramola"; s[0].desg="worker"; s[0].sex="male"; s[0].salary=5000;
            s[1].sid="23"; s[1].sname="Opemipo"; s[1].desg="nurse"; s[1].sex="female"; s[1].salary=2000;
            s[2].sid="24"; s[2].sname="Abdul"; s[2].desg="worker"; s[2].sex="male"; s[2].salary=5000;
            s[3].sid="25"; s[3].sname="Grace"; s[3].desg="nurse"; s[3].sex="female"; s[3].salary=20000;

            Scanner input=new Scanner(System.in);

            int choice,j,c1,status=1,s1=1,s2=1,s3=1,s4=1,s5=1,s6=1;
            while(status==1)
            {
                System.out.println("\n                                    MAIN MENU");
                System.out.println("________________________________________________________________________________");
                System.out.println("1.DOCTOR  2. PATIENT  3.MEDICAL  4.LAB  5. FACILITY  6.STAFF 7.EXIT");
                System.out.println("________________________________________________________________________________");

                choice=input.nextInt();
                switch(choice)
                {
                    case 1:
                    {
                        System.out.println("________________________________________________________________________________");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("________________________________________________________________________________");
                        s1=1;
                        while(s1==1)
                        {
                            System.out.println("1.new entry\n2.doctor list");
                            c1=input.nextInt();
                            switch(c1)
                            {
                                case 1:
                                {
                                    d[count1].new_doctor();count1++;
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println("________________________________________________________________________________");
                                    System.out.println("id \t name\t specialist \t working hours \11t qualification \t room no");
                                    System.out.println("________________________________________________________________________________");
                                    for(j=0;j<count1;j++)
                                    {
                                        d[j].doctor_info();
                                    }
                                    break;
                                }
                            }

                            System.out.println("RETURN BACK press (1/0) for more");
                            s1=input.nextInt();
                        }
                        break;
                    }
                    case 2:
                    {
                        System.out.println("________________________________________________________________________________");
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println("________________________________________________________________________________");
                        s2=1;
                        while(s2==1)
                        {
                            System.out.println("1.new entry\n2.patient list");
                            c1=input.nextInt();
                            switch(c1)
                            {
                                case 1:{p[count2].new_patient();count2++;break;}
                                case 2:
                                {
                                    System.out.println("________________________________________________________________________________");
                                    System.out.println("id \t name \t disease \t sex \t admit_status \t age");
                                    System.out.println("________________________________________________________________________________");
                                    for(j=0;j<count2;j++){p[j].patient_info();}break;}
                            }
                            System.out.println("RETURN BACK press (1/0) for more");
                            s2=input.nextInt();
                        }
                        break;
                    }
                    case 3:
                    {
                        s3=1;
                        System.out.println("________________________________________________________________________________");
                        System.out.println("                     **MEDICAL SECTION**");
                        System.out.println("________________________________________________________________________________");
                        while(s3==1)
                        {
                            System.out.println("1.new entry\n2.medicine list");
                            c1=input.nextInt();
                            switch(c1)
                            {
                                case 1:{m[count3].new_medi();count3++;break;}
                                case 2:
                                {
                                    System.out.println("________________________________________________________________________________");
                                    System.out.println("name \t company \t expiry date \t cost");
                                    System.out.println("________________________________________________________________________________");
                                    for(j=0;j<count3;j++){m[j].find_medi();}break;}
                            }
                            System.out.println("RETURN BACK press (1/0) for more");
                            s3=input.nextInt();
                        }
                        break;
                    }
                    case 4:
                    {
                        s4=1;
                        System.out.println("________________________________________________________________________________");
                        System.out.println("                    **LABORATORY SECTION**");
                        System.out.println("________________________________________________________________________________");
                        while(s4==1)
                        {
                            System.out.println("1.new entry \n2.lab list");
                            c1=input.nextInt();
                            switch(c1)
                            {
                                case 1:{l[count4].new_faci();count4++;break;}
                                case 2:
                                {
                                    System.out.println("________________________________________________________________________________");
                                    System.out.println("facility\t\tcost");
                                    System.out.println("________________________________________________________________________________");
                                    for(j=0;j<count4;j++){l[j].faci_list();
                                    }
                                    break;
                                }
                            }
                            System.out.println("RETURN BACK press (1/0) for more");
                            s4=input.nextInt();
                        }
                        break;
                    }
                    case 5:
                    {
                        s5=1;
                        System.out.println("________________________________________________________________________________");
                        System.out.println("          **HOSPITAL FACILITY SECTION**");
                        System.out.println("________________________________________________________________________________");
                        while(s5==1)
                        {
                            System.out.println("1.new entry\n2.facility list");
                            c1=input.nextInt();
                            switch(c1)
                            {
                                case 1:{f[count5].add_faci();count5++;break;}
                                case 2:{
                                    System.out.println("________________________________________________________________________________");
                                    System.out.println("Hospital facility are:-");
                                    System.out.println("________________________________________________________________________________");
                                    for(j=0;j<count5;j++){f[j].show_faci();}break;}
                            }
                            System.out.println("RETURN BACK press (1/0) for more");
                            s5=input.nextInt();
                        }
                        break;
                    }
                    case 6:
                    {
                        s6=1;
                        System.out.println("________________________________________________________________________________");
                        System.out.println("                       **STAFF SECTION**");
                        System.out.println("________________________________________________________________________________");
                        while(s6==1)
                        {

                            String a="nurse",b="worker",c="security";
                            System.out.println("1.new entry\n2.nurse list\n3.worker list \n4.securuty list");
                            c1=input.nextInt();
                            switch(c1)
                            {
                                case 1:{s[count6].new_staff();count6++;break;}
                                case 2:
                                {
                                    System.out.println("________________________________________________________________________________");
                                    System.out.println("id \t name \t sex \t salary");
                                    System.out.println("________________________________________________________________________________");
                                    for(j=0;j<count6;j++)
                                    {
                                        if(a.equals(s[j].desg))
                                            s[j].staff_info();
                                    }
                                    break;
                                }
                                case 3:
                                {
                                    System.out.println("________________________________________________________________________________");
                                    System.out.println("id \t name \t sex \t salary");
                                    System.out.println("________________________________________________________________________________");
                                    for(j=0;j<count6;j++)
                                    {
                                        if(b.equals(s[j].desg))
                                            s[j].staff_info();
                                    }
                                    break;
                                }
                                case 4:
                                {
                                    System.out.println("________________________________________________________________________________");
                                    System.out.println("id \t name \t sex \t salary");
                                    System.out.println("________________________________________________________________________________");
                                    for(j=0;j<count6;j++)
                                    {
                                        if(c.equals(s[j].desg))
                                            s[j].staff_info();
                                    }
                                    break;
                                }
                            }
                            System.out.println("RETURN BACK press (1/0) for more");
                            s6=input.nextInt();
                        }
                        break;
                    }
                    case 7:
                    {
                        break;
                    }
                    default:
                    {
                        System.out.println("enter wrong choice!");
                    }
                }
                System.out.println("RETURN MAIN MENU press (1/0) for more");
                status=input.nextInt();
            }
        }
    }
}

