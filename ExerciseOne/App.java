public class App {
    
    static boolean iWillReview  = true;
    static boolean iWillNotFail = true;
    public static void main(String[] args) throws Exception {

        App myApp = new App();

        //precondition (before the exam)
        assert iWillReview == true: "didn't review";
         //assert iWillReview == true (promise to review before the exam)
        //"didn't review" message if the promise is unfulfilled 
       
        myApp.exam();

        //postcondition (after the exam)
        assert iWillNotFail == true: "low score";
         //assert iWillNotFail == true (promise to not fail after the exam)
        // "low score" message if the promise is unfulfilled after the exam
    }

    void exam() {
        
        iWillNotFail = false;

    }

}
