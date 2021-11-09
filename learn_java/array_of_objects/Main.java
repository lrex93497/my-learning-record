/* array of objects*/
class Main{

    public static void main(String[] args){
        //data_name[] data_n = new data_name[3];  

        data_name data1 =new data_name("d_1");
        data_name data2 =new data_name("d_2");
        data_name data3 =new data_name("d_3");
        data_name[] data_n = {data1, data2, data3};
       
        //data_n[0] = data1;
        //data_n[1] = data2;
        //data_n[2] = data3;

        System.out.println(data_n[0].name);
        System.out.println(data_n[2].name);
    }
}