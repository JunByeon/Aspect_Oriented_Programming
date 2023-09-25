package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO{

    @Override
    public boolean addSillyMember() {
        System.out.println(getClass() + ": Doing MY DB Work: " +
                "Adding an Membership Account");
        return true;
    }

    @Override
    public void goToSleep() {
        System.out.println(getClass() + "I'm going to sleep now ...");

    }
}
