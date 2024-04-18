class Test {
    public static void main(String[] args) {
        try {
            Date validDate = new Date(12, 11);
            System.out.println("Valid date: " + validDate.getDay() + "/" + validDate.getMonth());
            
            Date invalidDate = new Date(35, 2);
        } catch (DException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}