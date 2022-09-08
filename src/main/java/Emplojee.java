public class Emplojee {
    private int id ;
    private static int nextid = 0;
    private String name;
    private String surname;
    private double salary;

    public Emplojee(String name, String surname, double salary)  throws FieldLengthLimitException , IncorrectSalaryException{
        this.id = nextid++;

        if(name.length() > 15){
            throw new FieldLengthLimitException("Too much symbols in name!");
        }
        else{
            this.name = name;
        }

        if(surname.length() > 15){
            throw new FieldLengthLimitException("Too much symbols in surname!");
        }
        else{
            this.surname = name;
        }

        if (salary < 0 ){
            throw new IncorrectSalaryException("Salary < 0");
        }
        else{
            this.salary = salary;
        }

    }

    void printEmployee(){
        System.out.println("ID:" + id + " name: " + name + " surname: " + surname + " salary " + salary);
    }
}
