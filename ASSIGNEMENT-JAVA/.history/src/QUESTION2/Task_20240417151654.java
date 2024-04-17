package QUESTION2;

public class Task {

    private String taskName;
    private int taskId;
    private int taskWage;

    public Task(String taskName, int taskId, int taskWage) {
        this.taskName = taskName;
        this.taskId = taskId;
        this.taskWage = taskWage;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public int getTaskWage() {
        return taskWage;
    }

    @Override
    public String toString() {
        return "Task Name: " + taskName + ", Task ID: " + taskId + ", Task Wage: " + taskWage;
    }

    public String detailedString() {
        return toString() + " - This task is essential for company operations.";
    }
}
