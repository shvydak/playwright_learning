package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class PracticeFormModel {
    private String firstName;
    private String lastName;
    private String email;
    private boolean genderMale;
    private String mobileNumber;
    private boolean hobieSport;
    private boolean hobieReading;
    private boolean hobieMusic;
    private String picture;
    private String currentAddress;
    private String state;
    private String city;
}
