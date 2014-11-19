package by.epam.stringtask.main;

import by.epam.stringtask.logic.StringTask;

public class Main {

    public static void main(String[] args) {
        String text = "меня.зовут.николай.doc$%";
        text = StringTask.translationChars(text);
        text = StringTask.lastDot(text);
        System.out.println(StringTask.controlLength(text));

    }
}
