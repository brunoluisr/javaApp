package repro.com;

public class Record {
    // Instance variables
    private String name;
    private int idNumber;
    private int contactNumber;
    private String email;
    private String nationality;
    private String position;

    // Default Constructor
    public Record() {}

    // Parameterized Constructor
    // @param name
    // @param idNumber
    // @param contactNumber
    public Record(String name, int idNumber,
                  int contactNumber, String email, String nationality, String position)
    {

        // this keyword refers to current instance itself
        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
        this.email = email;
        this.nationality = nationality;
        this.position = position;
    }

    // Getting the value of contactNumber
    // @return the value of contactNumber
    public int getContactNumber() { return contactNumber; }

    // Set the value of contactNumber
    // @param contactNumber new value of contactNumber
    public void setContactNumber(int contactNumber)
    {

        this.contactNumber = contactNumber;
    }

    // Getting the value of idNumber
    // @return the value of idNumber
    public int getIdNumber() { return idNumber; }

    // Setting the value of idNumber
    // @param idNumber new value of idNumber
    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }

    // Getting the value of name
    // @return the value of name
    public String getName() { return name; }

    // Setting the value of name
    // @param name new value of name
    public void setName(String name) { this.name = name; }

    // toString() Method
    // @return
    @Override public String toString()
    {

        // Returning the record
        return "Records{"
                + "name=" + name + ", idNumber=" + idNumber
                + ", contactNumber=" + contactNumber + '}';
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

