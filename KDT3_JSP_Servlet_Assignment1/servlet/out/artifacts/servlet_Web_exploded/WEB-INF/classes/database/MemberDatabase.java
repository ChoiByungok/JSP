package database;

import member.Member;

import java.util.HashMap;
import java.util.Map;

public class MemberDatabase {
    private Map<String, Member> data = new HashMap<>();

    private static MemberDatabase database;

    public static MemberDatabase getInstance() {
        if (database == null) {
            database = new MemberDatabase();
            database.initialize();
        }
        return database;
    }

    private MemberDatabase() {}

    private void initialize() {
        data.put("a", new Member("a1234", "qweqwe@naver.com"));
        data.put("b", new Member("b1234", "b1sad@gmail.com"));
        data.put("c", new Member("c1234", "ccasq@gmail.com"));
        data.put("d", new Member("d1234", "basdya@yahoo.com"));
        data.put("e", new Member("e1234", "eeadwe@gmail.com"));
        data.put("abcd1234", new Member("abcd1234","qweqwe@naver.com")); //확인용
    }

    public Member select(String key) {
        if (data.containsKey(key)) {
            return data.get(key);
        } else {
            return null;
        }
    }
    public void put(String key, Member member){ //데이터 베이스에 저장하기 위해 만든 메서드
        data.put(key,member);
    }

    public Map<String, Member> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "MemberDatabase{" +
                "data=" + data +
                '}';
    }
}
