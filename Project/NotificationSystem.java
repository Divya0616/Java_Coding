package Project;

import java.util.*;

// Notification Class
class Notification {
    String type;
    String recipient;
    String message;
    int priority; // lower number = higher priority

    public Notification(String type, String recipient, String message, int priority) {
        this.type = type;
        this.recipient = recipient;
        this.message = message;
        this.priority = priority;
    }
}

// Main System Class
public class NotificationSystem {

    // Priority Queue (based on priority)
    private PriorityQueue<Notification> queue = new PriorityQueue<>(
        (a, b) -> a.priority - b.priority
    );

    // Producer: Add notification to queue
    public void addNotification(String type, String to, String msg, int priority) {
        Notification n = new Notification(type, to, msg, priority);
        queue.offer(n);
        System.out.println("Added to queue: " + msg + " (Priority " + priority + ")");
    }

    // Consumer: Worker Thread
    public void startWorker() {
        new Thread(() -> {
            while (true) {
                if (!queue.isEmpty()) {
                    Notification n = queue.poll();

                    sendNotification(n);
                }
            }
        }).start();
    }

    // Simulated Sending with Retry Mechanism
    private void sendNotification(Notification n) {
        int retries = 0;
        boolean sent = false;

        while (retries < 3 && !sent) {
            try {
                System.out.println("\nSending " + n.type + " to " + n.recipient);
                System.out.println("Message: " + n.message);

                // Simulate random failure
                if (Math.random() < 0.3) {
                    throw new Exception("Failed to send!");
                }

                System.out.println("✅ Sent successfully!");
                sent = true;

                Thread.sleep(2000); // simulate delay

            } catch (Exception e) {
                retries++;
                System.out.println("⚠ Retry " + retries + " for " + n.recipient);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }

        if (!sent) {
            System.out.println("❌ Failed after 3 retries: " + n.recipient);
        }
    }

    // Main Method
    public static void main(String[] args) {

        NotificationSystem system = new NotificationSystem();

        // Start background worker
        system.startWorker();

        // Add notifications
        system.addNotification("Email", "user1@gmail.com", "Scam detected!", 1);
        system.addNotification("SMS", "9876543210", "Urgent alert!", 1);
        system.addNotification("Push", "UserApp", "Check your account", 2);
        system.addNotification("Email", "user2@gmail.com", "Weekly report", 3);

        // Keep main thread alive
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nSystem shutting down...");
    }
}
