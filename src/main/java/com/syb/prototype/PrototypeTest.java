package com.syb.prototype;

public class PrototypeTest {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("haha");
        user1.setPassword("123456");
        user1.setAge(123);

        User clone = (User)user1.clone();

        System.out.println(clone == user1);

        System.out.println(user1.getUsername()+":"+clone.getUsername());

    }
}
