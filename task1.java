import java.lang.util*;

public class Level {
  public boolean goalReached() 
  public int getPoints() 
}
public class Game{
  private Level levelOne 
  private Level levelTwo 
  private Level levelThree 
  public Game()
  public boolean isBonus() 
  public void play() 
  public int getScore() {
    int score = 0
    if(levelOne.goalReached()==true){
      score+=levelOne.getPoints();
        if(levelTwo.goalReached()==true){
        score+=levelTwo.getPoints();
          if(levelThree.goalReached()==true){
          score+=levelThree.getPoints();
        }
      }
    }
    if(isBonus()==true) score*=3;
    return score;
  }
  public int playManyTimes(int num){
    int max = 0;
    for(int i = 1; i<=num; i++){
      play();
      if (max <= getScore()) max = getScore();
    }
    return max;
  }

}
