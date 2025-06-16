/*
    Create a Class Employee with the following specifications

Properties
----------
string Name -> no blank names should be allowed
int EmpNo -> must be greater than 0
decimal Basic -> must be between some range
short DeptNo -> must be > 0

Methods
-------
decimal GetNetSalary() -> returns calculated net salary (Use any formula to get net salary based on Basic salary)

Create constructors to accept initial values for Employee obj
eg
Employee o1 = new Employee(1,"Amol",123465, 10);
Employee o2 = new Employee(1,"Amol",123465);
Employee o3 = new Employee(1,"Amol");
Employee o4 = new Employee(1);
Employee o5 = new Employee(); 
*/

using System;

namespace Assignment1
{
    internal class Program
    {
        static void Main()
        {
            Employee o1 = new Employee(1, "Amol", 123465, 10);
            Employee o2 = new Employee(1, "Amol", 123465);
            Employee o3 = new Employee(1, "Amol");
            Employee o4 = new Employee(1);
            Employee o5 = new Employee();

            Console.WriteLine(o1);
            Console.WriteLine(o2);
            Console.WriteLine(o3);
            Console.WriteLine(o4);
            Console.WriteLine(o5);
        }
    }

    public class Employee
    {
        private string name;
        private int empNo;
        private decimal basic;
        private short deptNo;

        public string Name   // property 
        {
            get { return name; }
            set
            {
                if (string.IsNullOrWhiteSpace(value))
                    Console.WriteLine("Name cannot be blank.");
                name = value;

            }
        }

        public int EmpNo
        {
            get { return empNo; }
            set
            {
                if (value <= 0)
                    Console.WriteLine("EmpNo must be greater than 0.");
                empNo = value;
            }
        }

        public decimal Basic
        {
            get { return basic; }
            set
            {
                if (value < 10000 || value > 100000)
                    Console.WriteLine("Basic Salary must be between 10,000 and 1,00,000.");
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
                deptNo = value;
            }
        }

        public decimal GetNetSalary()
        {
            return Basic + 21; 
        }

        public Employee(int empNo, string name, decimal basic, short deptNo)
        {
            EmpNo = empNo;
            Name = name;
            Basic = basic;
            DeptNo = deptNo;
        }

        public Employee(int empNo, string name, decimal basic) : this(empNo, name, basic, 1) { }

        public Employee(int empNo, string name) : this(empNo, name, 20000, 1) { }

        public Employee(int empNo) : this(empNo, "Unknown Emp", 20000, 1) { }

        public Employee() : this(21, "Unknown Emp", 20000, 1){ }

        public override string ToString()
        {
            return $"EmpNo: {EmpNo}, Name: {Name}, Basic: {Basic}, DeptNo: {DeptNo}, Net Salary: {GetNetSalary()}";      
        }
    }
}
