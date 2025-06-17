
using System;

namespace Assignment2
{
    internal class Program
    {
        static void Main()
        {
            Employee o1 = new Employee("Amol", 123465, 10);
            Employee o2 = new Employee("Amol", 123465);
            Employee o3 = new Employee("Amol");
            Employee o4 = new Employee();

            Console.WriteLine(o1.EmpNo);
            Console.WriteLine(o2.EmpNo);
            Console.WriteLine(o3.EmpNo);
            Console.WriteLine(o4.EmpNo);

            Console.WriteLine(o3.EmpNo);
            Console.WriteLine(o2.EmpNo);
            Console.WriteLine(o1.EmpNo);

            Console.WriteLine(o1);
            Console.WriteLine(o2);
            Console.WriteLine(o3);
            Console.WriteLine(o4);
        }
    }

    public class Employee
    {
        private static int lastEmpNo = 0;

        private int empNo;
        public int EmpNo { get { return empNo; } }
        private string name;
        private decimal basic;
        private short deptNo;

        public string Name
        {
            get { return name; }
            set
            {
                if (string.IsNullOrWhiteSpace(value))
                    Console.WriteLine("Name cannot be blank.");
                else
                    name = value;
            }
        }
        public decimal Basic
        {
            get { return basic; }
            set
            {
                if (value < 10000 || value > 100000)
                    Console.WriteLine("Basic Salary must be between 10,000 and 1,00,000.");
                else
                    basic = value;
            }
        }
        public short DeptNo
        {
            get { return deptNo; }
            set
            {
                if (value <= 0)
                    Console.WriteLine("DeptNo must be greater than 0.");
                else
                    deptNo = value;
            }
        }
        public decimal GetNetSalary()
        {
            return Basic + 21;
        }
        public Employee(string name = "Unknown Emp", decimal basic = 20000, short deptNo = 1)
        {
            lastEmpNo++;
            empNo = lastEmpNo;

            Name = name;
            Basic = basic;
            DeptNo = deptNo;
        }

        public override string ToString()
        {
            return $"EmpNo: {EmpNo}, Name: {Name}, Basic: {Basic}, DeptNo: {DeptNo}, NetSalary: {GetNetSalary()}";
        }
    }
}
