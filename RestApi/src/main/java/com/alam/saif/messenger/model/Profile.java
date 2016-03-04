package com.alam.saif.messenger.model;

import java.util.Date;

/**
 * Created by BS102-Saif on 3/4/2016.
 */
public class Profile {
    private long id;
    private String profileName;
    private String firstName;
    private String lastName;
    private Date created;

    public Profile() {
    }

    public Profile(long id, String profileName, String firstName, String lastName, Date created) {
        this.id = id;
        this.profileName = profileName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.created = created;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
