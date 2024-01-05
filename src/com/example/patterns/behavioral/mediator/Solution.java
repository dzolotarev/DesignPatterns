package com.example.patterns.behavioral.mediator;

/* 
Приветики в этом чате
*/

public class Solution {
    public static void main(String[] args) {
        UserDB db = new UserDB();
        Chat chat = new Chat(db);
        User user1 = new User(chat,1, "Леша");
        User user2 = new User(chat,2, "Боря");
        User user3 = new User(chat,3, "Чингиз");
        User user4 = new User(chat,4, "David");

        chat.register(user1);
        chat.register(user2);
        chat.register(user3);
        chat.register(user4);

        user1.send("Добрый день, Борис Алексеевич", 2);
        user2.send("Приветствую! Алексей Борисович", 1);
    }
}
