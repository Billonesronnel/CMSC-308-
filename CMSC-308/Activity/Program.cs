using System;

namespace Program
{
    class Program
    {
        static void Main(string[] args)
        {

            string[] Email = {"ronnel.billones@gwapo.com", 
                              "ronnel.billones@pogi.com" ,
                              "ronnel.billones@handsome.com" };
            string[] Username = {"ronnelgwapo",
                                 "ronnelpogi" ,
                                 "ronnelhandsome"};
            string[] Password = {"ronnelgwapo123",
                                 "ronnelpogi456",
                                 "ronnelhandsome789"};

            Console.Write("Index : ");
            int Index = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Email : " + Email[Index]);
            Console.WriteLine("Username : " + Username[Index]);
            Console.WriteLine("Password : " + Password[Index]);


        }
    }
}