
public class Game{

    public String[] stCard = {"A","2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private String[] card = new String[52];
    
    //カードを混ぜる
    public void mazemaze(){

         // A(1)からK(13)までを4回繰り返す
         int index = 0;
         for (int i = 0; i < 4; i++) {
             for (String st : stCard) {
                 card[index++] = st;
             }
         }
    }

    public void tStart(){
        
         // ランダムにカードを1枚引く
         int pullCardIndex = (int) (Math.random() * 52);
         String pullCard = card[pullCardIndex];

         Judge judge = new Judge();
         judge.DrawResult(pullCard);
    }
}