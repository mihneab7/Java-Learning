class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName == null) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName == null) {
            this.lastName = "";
        } else {
            this.lastName = lastName;
        }
    }

    public String getFullName() {

        String fullName = null;
        if (firstName.equals("") && lastName.equals("")) {
            return "Unknown";
        } else if (firstName.equals("")) {
            fullName = lastName;
        } else if (lastName.equals("")) {
            fullName = firstName;
        } else {
            fullName = firstName + " " + lastName;
        }
        return fullName;
    }
}