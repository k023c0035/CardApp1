
public class Judge{

    // A,J,Q,K,を数値に変換
   public int getRankValue(String stCard){
       switch (stCard) {
           case "J": return 11;
           case "Q": return 12;
           case "K": return 13;
           case "A": return 1;
           default: return Integer.parseInt(stCard); 
       }
   }
   //結果を表示
   public void DrawResult(String num){
       
       System.out.println("yourカード: " + num);
       if (getRankValue(num) >= 10) 
           System.out.println("勝ち");
        else 
           System.out.println("残念,無念,また来年");
       
   }
}
