public class NodeScHunt {
    String question;
    String answer;
    NodeScHunt next;

    public NodeScHunt(String question, String answer){
        this.question = question;
        this.answer = answer;
        this.next = null;
    }

    public NodeScHunt getNext(){
        return next;
    }

    public void setNext(NodeScHunt next){
        this.next = next;
    }
}