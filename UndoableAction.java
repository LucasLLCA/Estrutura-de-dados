public interface UndoableAction {
    void execute();
    void undo();
    void redo();
}
