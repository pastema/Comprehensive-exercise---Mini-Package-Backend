package MiniPackage.core;

import javax.persistence.*;

@Entity
public class WarehouseIn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long PackageNumber;

    private String Receiver;

    private String Phonenumber;

    private String Weight;

    private String Status;

    private String BookingTime;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getBookingTime() {
        return BookingTime;
    }

    public void setBookingTime(String bookingTime) {
        BookingTime = bookingTime;
    }

    public Long getPackageNumber() {
        return PackageNumber;
    }

    public void setPackageNumber(Long packageNumber) {
        PackageNumber = packageNumber;
    }

    public String getReceiver() {
        return Receiver;
    }

    public void setReceiver(String receiver) {
        Receiver = receiver;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }
}
