package com.xqh.data_structure.hashmap_research;

import java.util.HashMap;

public class Test {
    public static void main(String[] args){
        HashMap<String, User> map = new HashMap<String, User>();
        User u;

        u = new User(1L, "xqh", "123...", true, 4598.45);
        map.put(u.username, u);

        u = new User(1L, "xqh", "密码000", true, 888.77);
        map.put(u.username, u);

        u = new User(1L, "xqh", "密码333", true, 1111.11);
        map.put(new String(u.username), u);

        u = new User(2L, "cgl", "passs...", false, 666.79);
        map.put(u.username, u);

        u = new User(3L, "zhangsan", "cccc...", false, 666.79);
        map.put(u.username, u);

        u = new User(4L, "王五", "cccc...", false, 666.79);
        map.put(u.username, u);

        u = new User(5L, "毛主席", "cccc...", false, 666.79);
        map.put(u.username, u);

        u = new User(6L, "周总理", "cccc...", false, 666.79);
        map.put(u.username, u);

        u = new User(7L, "李白", "cccc...", false, 666.79);
        map.put(u.username, u);

        u = new User(8L, "李贤", "cccc...", false, 666.79);
        map.put(u.username, u);

        User x = map.get("xqh");

        boolean debug = true;
    }
}
