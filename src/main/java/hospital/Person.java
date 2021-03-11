package hospital;

import hospital.exception.RemoveException;

/**
 * The type Person.
 */
public abstract class Person {


    //Fields
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;


    /**
     * Instantiates a new Person.
     * Will not create a new person if any parameters is blank. (Throws exception)
     *
     * @param firstName            the first name of the person
     * @param lastName             the last name of the person
     * @param socialSecurityNumber the social security number of the person
     */
    public Person(String firstName, String lastName, String socialSecurityNumber) {
        try {
            if (firstName.isBlank() || lastName.isBlank() || socialSecurityNumber.isBlank()){
                throw new IllegalArgumentException("Some of the parameters inserted is blank when they can't be blank");
            }
            else {
                this.firstName = firstName;
                this.lastName = lastName;
                this.socialSecurityNumber = socialSecurityNumber;
            }
        }
        catch (IllegalArgumentException illegalArgumentException){

                    illegalArgumentException.getMessage();

        }
    }




    //Setter and getters.
    // Note; 'getFullName' uses first and last name + space

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets full name.
     *
     * @return the full name
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }


    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets social security number.
     *
     * @return the social security number
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets social security number.
     *
     * @param socialSecurityNumber the social security number
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
