package chapter02;

public class AvoidEncoding {


    public class UserRecord {
        private String m_sUsername;
        private int m_iLevel;
    }

    public class User {
        private String username;
        private int level;

        public void setLevel(int level) {
            this.level = level;
        }
    }
}