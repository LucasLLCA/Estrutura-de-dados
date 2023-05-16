import java.util.Stack;

public class NoteManager {
    private Stack<String> noteStack;

    public NoteManager() {
        this.noteStack = new Stack<>();
    }

    public void addNote(String note) {
        noteStack.push(note);
    }

    public String getNextNote() {
        if (noteStack.isEmpty()) {
            return "Nenhuma nota disponível.";
        }
        return noteStack.pop();
    }

    public Stack<String> getNoteStack() {
        return noteStack;
    }

    public void setNoteStack(Stack<String> noteStack) {
        this.noteStack = noteStack;
    }
}
