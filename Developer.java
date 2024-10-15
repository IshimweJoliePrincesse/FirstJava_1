
class Developer {
    private String computerType;

 
    public Developer(String computerType) {
        this.computerType = computerType;
    }

   
    public void runCode() {
        System.out.println("The developer is using a " + computerType + " to run code.");
    }

    
    public static void main(String[] args) {
        
        Developer john = new Developer("laptop ");
        john.runCode(); 
        
        Developer jane = new Developer("desktop");
        jane.runCode();
}

}