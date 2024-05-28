public class ScavengerHuntGame {
    NodeScHunt startPoint;
    NodeScHunt currentPoint;

    public ScavengerHuntGame(){
        startPoint = null;
        currentPoint = null;
    }

    public void addNodeScHunt(String question, String answer){
        NodeScHunt newPoint = new NodeScHunt(question, answer);
        if (startPoint == null){
            startPoint = newPoint;
            currentPoint = newPoint;
        } else {
            currentPoint.setNext(newPoint);
            currentPoint = newPoint;
        }
    }

    public boolean checkAnswer(String answer){
        if (currentPoint != null && answer.equalsIgnoreCase(currentPoint.answer)){
            currentPoint = currentPoint.getNext();
            return true;
        }
        return false;
    }

    public String getCurrentQuestion(){
        if (currentPoint != null){
            return currentPoint.question;
        }
        return null;
    }

    public void resetCurrentPoint(){
        currentPoint = startPoint;
    }
}