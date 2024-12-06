public class YourLanguageParser extends LR0Parser {

    public YourLanguageParser() {
        super(); // calls the constructor for LR0Parser

        // TODO: Encode the grammar assigned to you (based on your student id number)
        // here, making use of the style of encoding shown in Language1Parser.java

        addRule("R1", "Z", "A#");   // Z -> A#
        addRule("R2", "A", "aA");   // A -> aA
        addRule("R3", "A", "b");    // A -> b

        // state 1
        addAction("1", "a", "S2");
        addAction("1", "b", "S4");
        addAction("1", "A", "G5");

        // state 2
        addAction("2", "a", "S2");
        addAction("2", "b", "S4");
        addAction("2", "A", "G3");

        // state 3
        addAction("3", "a", "R2");
        addAction("3", "b", "R2");
        addAction("3", "#", "R2");

        // state 4
        addAction("4", "a", "R3");
        addAction("4", "b", "R3");
        addAction("4", "#", "R3");

        // state 5
        addAction("5", "#", "Accept");

    }

    public String parse(String word) {
        String remainingInput = word;
        stack.push("1");
        int lengthOfWord = remainingInput.length();

        while (remainingInput.length() > 0) {
            currentState = stack.peek();
            currentSymbol = "" + remainingInput.charAt(0);
            String action = getAction(currentState, currentSymbol);

            System.out.println("State: " + currentState + ", Symbol: " + currentSymbol + ", Action: " + action);

            if (action.equals("Blank")) {
                return getError();
            } else if (action.equals("Accept")) {
                remainingInput = remainingInput.substring(1);
                derivation.push("R1"); // Add the initial rule for the derivation
                return getDerivation();
            } else if (action.charAt(0) == 'S') {
                stack.push(currentSymbol);
                stack.push(action.substring(1));
                remainingInput = remainingInput.substring(1);
            } else if (action.charAt(0) == 'R') {
                String ruleLHS = getRuleLHS(action);
                String ruleRHS = getRuleRHS(action);
                int countToPop = ruleRHS.length() * 2;
                for (int i = 0; i < countToPop; i++) {
                    stack.pop();
                }
                String previousState = stack.peek();
                stack.push(ruleLHS);
                derivation.push(action);
                String gotoAction = getAction(previousState, ruleLHS);
                String newState = gotoAction.substring(1);
                stack.push(newState);
                currentState = newState;
            }
        }
        return "";
    }

}
