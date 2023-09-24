package models;

public class TextBoxData {
    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;


    public TextBoxData setFullName(String name) {
        this.fullName = name;
        return this;
    }

    public TextBoxData setEmail(String email) {
        this.email = email;
        return this;
    }

    public TextBoxData setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
        return this;
    }

    public TextBoxData setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }
}
