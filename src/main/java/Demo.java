public class Demo {

    public Demo() {
        super();
    }

    public String giveHello() {
        return "Hello";
    }

    public String giveWorld() {
        return "World";
    }

    public String addExclamation(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append(text).append(" !");
        return sb.toString();
    }

    public String addSpace(String text1, String text2) {
        StringBuilder sb = new StringBuilder();
        sb.append(text1).append(" ").append(text2);
        return sb.toString();
    }

    public String sayHelloWorld() {
        return (this.addExclamation(this.addSpace(this.giveHello(),this.giveWorld())));
    }

}