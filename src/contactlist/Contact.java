package src.contactlist;/*Welcome to my show !

@author: NgKhanh
Date: 4/26/2022
Time: 7:51 AM

ProjectName: JavaBasic2*/

public class Contact {
        private String phone;
        private String name;
        private int number;
        public Contact(int number, String phone, String name){
            this.phone = phone;
            this.name = name;
            this.number = number;
        }

        public int getNumber(){
            return number;
        }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
