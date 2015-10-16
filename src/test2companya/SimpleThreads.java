
package test2companya;


public class SimpleThreads extends Thread {
    public boolean finished=false;
  
    public void run(){
        for(int x=1;x<100;x++){
            if(finished) break;
            System.out.println(x);
        }
    }
           public static void main (String[] args){
               SimpleThreads sample=new SimpleThreads();
               sample.start();
               try{Thread.sleep(500);}
               catch(Exception ex){}
               sample.finished=true;
           }
}
