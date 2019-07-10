import java.util.ArrayList;
import java.util.List;

public class Node {
    private int noOfBones;
    private boolean isMaxPlayer;
    private int score;
    private List<Node> children;

    public Node(int noOfBones, boolean isMaxPlayer) {
        this.noOfBones = noOfBones;
        this.isMaxPlayer = isMaxPlayer;
        children = new ArrayList<>(); //not on site
    }

    int getNoOfBones() {
        return noOfBones;
    }

    boolean getIsMaxPlayer() {
        return isMaxPlayer;
    }

    int getScore() {
        return score;
    }

    void setScore(int score) {
        this.score = score;
    }

    List<Node> getChildren() {
        return children;
    }

    void addChild(Node newNode) {
        children.add(newNode);
    }

    //    void setNoOfBones(int newNoOfBones) {
//        noOfBones = newNoOfBones;
//    }

//    void setMaxPlayer(boolean newIsMaxPlayer) {
//        isMaxPlayer = newIsMaxPlayer;
//    }
}
