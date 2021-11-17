package interpreter;

/**
 *  <command list> ::= <command>* end
 */

import java.util.Vector;

public class CommandListNode extends Node {

    private Vector list= new Vector();

    @Override
    public void parse(Context context) throws ParseException {
        while (true){
            if (context.getCurrentToken() == null){
                throw new ParseException("Missing end");
            }
            else if (context.getCurrentToken().equals("end")){
                context.skipToken("end");
                break;
            }
            else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }

        }
    }

    @Override
    public String toString() {
        return "" + list;
    }
}
