public class encapsulation_and_get_encapsulated_value{

    private String test_string;             //get this private value in main

    encapsulation_and_get_encapsulated_value(String test_string){
        this.settest_string(test_string);
    }
    encapsulation_and_get_encapsulated_value(encapsulation_and_get_encapsulated_value x){
        this.copy(x);
    }
    public String gettest_string(){
        return test_string;
    }
    
    public void settest_string(String test_string){
        this.test_string = test_string;
    }

    public void copy(encapsulation_and_get_encapsulated_value x){    //copy method
    
        this.settest_string(x.gettest_string());

    }


}