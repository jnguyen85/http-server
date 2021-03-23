public class Canvas {
    private Tool currentTool;
    
    public void mouseUp() {
        this.currentTool.mouseUp();
    }

    public void mouseDown() {
        this.currentTool.mouseDown();
    }

    public Tool getCurrentTool() {
        return this.currentTool;
    }
    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
