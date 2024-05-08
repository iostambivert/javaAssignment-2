package assignment2.organizations.party;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Party extends Organization implements Contactable {
    String mission;

    String email, address, phoneNumber;

    List<Election> elections = new ArrayList<>();

    public Party(String name, String mission) {
        // TODO finish this method (0.25 points)
        this.mission = mission;
        super.setName(name);
    }

    public void addElection(Election e) {
        // TODO finish this method (0.25 points)
        elections.add(e);
    }

    public boolean removeElection(Election e) {
        boolean removed = false;
        // TODO finish this method (0.25 points)
        // Iterate through the list of elections
        Iterator<Election> iterator = elections.iterator();
        while (((Iterator<?>) iterator).hasNext()) {
            Election current = iterator.next();
            // Check if the current election matches the provided election
            if (current.equals(e)) {
                // If found, remove it from the list and set removed to true
                iterator.remove();
                removed = true;
                break; // Exit the loop since we found and removed the election
            }
        }

        return removed;
    }

    public List<Election> getFairElections() {
        List<Election> fairElections = new ArrayList<>();
        // TODO finish this method (0.25 points)
        for (Election e : elections) {
            // Check if the election is marked as fair
            if (e.isFair()) {
                // If it is, add it to the list of fair elections
                fairElections.add(e);
            }
        }



        return fairElections;
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
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
