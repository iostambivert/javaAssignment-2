package assignment2.organizations.party.PublishingCompany;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;
import assignment2.organizations.party.Election;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PublishingCompany extends Organization implements Contactable {

    String mission;
    String email, address, phoneNumber;
    List<Publication> publications = new ArrayList<Publication>();


    public PublishingCompany(String name, String mission) {
        this.mission = mission;
        super.setName(name);

    }

    public void addPublication(Publication p) {

        publications.add(p);
    }

    public boolean removePublication(String title) {
        Iterator<Publication> iterator = publications.iterator();
        while (((Iterator<?>) iterator).hasNext()) {
            Publication publication = iterator.next();
            if (publication.getTitle().equals(title)) {
                iterator.remove();
                return true; // Publication found and removed
            }
        }
        return false; // if Publication not found
    }


    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    @Override
    public String getEmail() {
            return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;

    }
}
