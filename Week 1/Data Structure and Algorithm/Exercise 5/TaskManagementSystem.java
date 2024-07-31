package Exercise_5;

class Node {
    Task task;
    Node next;

    Node(Task task) {
        this.task = task;
        this.next = null;
    }
}
public class TaskManagementSystem {
    private Node head;

    
    public TaskManagementSystem() {
        this.head = null;
    }

    
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    
    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getTaskId() == taskId) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null; 
    }

    
    public void traverseTasks() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.task.getTaskId() != taskId) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Task not found.");
        } else {
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        Task task1 = new Task(1, "Design", "Pending");
        Task task2 = new Task(2, "Development", "In Progress");
        Task task3 = new Task(3, "Testing", "Pending");

        tms.addTask(task1);
        tms.addTask(task2);
        tms.addTask(task3);

        System.out.println("All Tasks:");
        tms.traverseTasks();

        System.out.println("Search Task with ID 2:");
        System.out.println(tms.searchTask(2));

        System.out.println("Deleting Task with ID 1");
        tms.deleteTask(1);

        System.out.println("All Tasks after deletion:");
        tms.traverseTasks();
    }
}
