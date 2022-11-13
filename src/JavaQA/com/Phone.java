package JavaQA.com;

public class Phone {
           private int number;
           private String model;
           private double weight;

      public Phone(String model, int number, double weight) {
          this.model = model;
          this.number = number;
          this.weight = weight;
      }

      public void receiveCall (String name){
           System.out.println("call from "+ name);
      }

      public int getNumber (){
           return number;
      }

      public void show(){
          System.out.println(model + " " + number + " " + weight);
      }


}
