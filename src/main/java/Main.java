public class Main {
    public static void main(String[] args) {
        try{
            Emplojee A = new Emplojee("Arina", "Arina", -700.0);
            A.printEmployee();
        }catch(FieldLengthLimitException ex){
            System.out.println(ex.getMessage());
        }
        catch (IncorrectSalaryException ex){
            System.out.println(ex.getMessage());
        }
    }
}
