public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("Omar");
        User user2 = new User("Ali");
        User user3 = new User("Mohammed");

        chatRoom.addObserver(user1);
        chatRoom.addObserver(user2);

        chatRoom.notifyObservers("Hello everyone!");

        chatRoom.addObserver(user3);

        chatRoom.notifyObservers(" Mohammed has joined the chat.");
    }
}