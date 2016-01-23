package newcreature;

public class FishMaster {
    public static void main(String[] args){
        //String fishReaction;
        Fish myFish = new Fish();
        myFish.dive(2);
        myFish.dive(97);
        myFish.dive(3);
        //fishReaction = myFish.say("Привет!");
        //System.out.println(fishReaction);
        System.out.println(myFish.say("Привет!"));
        myFish.sleep();
    }
}
