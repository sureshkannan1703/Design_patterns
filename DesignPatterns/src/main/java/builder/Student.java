package builder;

public class Student {
    private Student(){}
    String firstName;
    int age;

    static class Builder{

        public static  Builder getBuilder(){
            return new Builder();
        }
        String firstName;

        int age;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build(){
            Student st = new Student();
            st.firstName = this.firstName;
            st.age = this.age;
            if(st.firstName == null || st.firstName.isEmpty())
                throw new IllegalArgumentException("First name should be a necessary param for the object.");
            return st;
        }
    }
}
