class finally_block{
    public static void main(String args[]){
        int a = 10;
        try{
            int b = a/0;
            System.out.println(b);
        }
        catch(Exception e){
            System.out.println("Caught exception");
        }
        finally{
            System.out.println("finally block called");
        }
    }
}