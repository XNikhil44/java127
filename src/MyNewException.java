public class MyNewException {
    public static void main(String[] args) {
        UserDefineException udf=new UserDefineException();
        try {
            udf.validate(34);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }



    }
}
