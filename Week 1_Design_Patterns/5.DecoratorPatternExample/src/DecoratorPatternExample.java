// DecoratorPatternExample.java
public class DecoratorPatternExample {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        Notifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);

        Notifier emailAndSMSAndSlackNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);

        System.out.println("Sending notifications using Email and SMS:");
        emailAndSMSNotifier.send("Hello World!");

        System.out.println("\nSending notifications using Email, SMS, and Slack:");
        emailAndSMSAndSlackNotifier.send("Hello World!");
    }
}
