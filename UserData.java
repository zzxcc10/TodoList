import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
public class UserData {
   private Color themeColor;
   private List<String> tasks;
   private List<String> reflections;
   private int points;
   private List<String> availableRewards;
   private int completedTasks;
   private boolean themeUnlocked;
  
   public UserData() {
       this.themeColor = Color.WHITE;
       this.tasks = new ArrayList<>();
       this.reflections = new ArrayList<>();
       this.points = 0;
       this.availableRewards = new ArrayList<>();
       // Rewards that the user can purchase initially
       availableRewards.add("Custom Theme (100 points)");
       availableRewards.add("Iphone 16 Pro Max (1000000000 points)");
       this.themeUnlocked = false;
   }
   // Theme color
   public Color getThemeColor() {
       return themeColor;
   }
   public void setThemeColor(Color themeColor) {
       this.themeColor = themeColor;
   }
   // Tasks
   public List<String> getTasks() {
       return tasks;
   }
   public void setTasks(List<String> tasks) {
       this.tasks = tasks;
   }
  
   public int getCompletedTasks() {
       return completedTasks;
   }
  
   public void incrementCompletedTasks() {
       completedTasks++;
   }
  
   // Reflections
   public List<String> getReflections() {
       return reflections;
   }
   public void setReflections(List<String> reflections) {
       this.reflections = reflections;
   }
  
   // Rewards system
   public int getPoints() {
       return points;
   }
  
   public List<String> getAvailableRewards() {
       return availableRewards;
   }
  
   public void purchaseReward(String reward, int cost) {
       this.points -= cost;
       availableRewards.remove(reward); // Remove the reward from the list of available rewards
   }
  
   public void addPoints(int points) {
       this.points += points;
   }
  
   public void addReward(String reward) {
       availableRewards.add(reward);  
   }
  
   // Theme
   public boolean isThemeUnlocked() {
       return this.themeUnlocked;
   }
  
   public void unlockTheme() {
       this.themeUnlocked = true;
   }
}

