import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoApp extends JFrame {

    private JTextField taskField;
    private DefaultListModel<String> taskModel;
    private JList<String> taskList;
    private JButton addButton;
    private JButton deleteButton;

    public ToDoApp() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("To-Do List Application");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        taskField = new JTextField(20);

        addButton = new JButton("Add Task");
        deleteButton = new JButton("Delete Task");

        taskModel = new DefaultListModel<>();
        taskList = new JList<>(taskModel);

        JPanel topPanel = new JPanel();
        topPanel.add(taskField);
        topPanel.add(addButton);

        JScrollPane scrollPane = new JScrollPane(taskList);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(deleteButton);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // Event Handling
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTask();
            }
        });
    }

    // Business Logic
    public String validateTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Task cannot be empty.");
        }
        return task.trim();
    }

    private void addTask() {
        try {
            String task = validateTask(taskField.getText());
            taskModel.addElement(task);
            taskField.setText("");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Unexpected Error: " + ex.getMessage(),
                    "System Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteTask() {
        try {
            int selectedIndex = taskList.getSelectedIndex();

            if (selectedIndex == -1) {
                throw new Exception("Please select a task to delete.");
            }

            taskModel.remove(selectedIndex);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Delete Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ToDoApp().setVisible(true);
        });
    }
}