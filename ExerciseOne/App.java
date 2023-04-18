public class App {
    
    static boolean iWillReview  = true;
    static boolean iWillNotFail = true;
    public static void main(String[] args) throws Exception {

        App myApp = new App();

        assert iWillReview == true: "didn't review";
       
        myApp.exam();

        assert iWillNotFail == true: "low score";
              
    }

    void exam() {
        
        iWillNotFail = false;

    }

}