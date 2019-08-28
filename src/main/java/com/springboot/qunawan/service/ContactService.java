package com.springboot.qunawan.service;

import com.springboot.qunawan.pojo.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> selectAll(int userid);
    public int addcontact(Contact contact);
    public int deletecontact(int id);
    public Contact getcontact(int id);
    public int altercontact(Contact contact);

}
