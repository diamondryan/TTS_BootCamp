
public class CreatingANewMethod {
    public void printShirtSize(char variableName) {

        String msg = "";
        switch (variableName) {
            case 's':
                msg = "Shirt is small";
                break;

            case 'm':
                msg = "Shirt is medium";
                break;

            case 'l':
                msg = "Shirt is large";
                break;

            case 'x':
                msg = "Shirt is extra large";
                break;

            default:
                msg = "Sorry, we couldn't find that size";
                break;
        }
        System.out.println(msg);
    }
}
