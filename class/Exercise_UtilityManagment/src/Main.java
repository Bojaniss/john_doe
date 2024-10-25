public class Main {
    public static void main(String[] args) {
        Utility[] utilityList = new Utility[3];

        utilityList[0] = new Utility(name:"Electricity", price:100.0);
        utilityList[1] = new Utility(name:"Water", price:30.0);
        utilityList[2] = new Utility(name:"Parno", price:15.0);

        Utility tempUtility = utilityList[0];

        for(Utility utility: utilityList){
}