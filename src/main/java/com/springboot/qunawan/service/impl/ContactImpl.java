package com.springboot.qunawan.service.impl;

import com.springboot.qunawan.dao.ContactMapper;
import com.springboot.qunawan.pojo.Contact;
import com.springboot.qunawan.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactImpl implements ContactService {
    @Autowired
    ContactMapper contactMapper;

    @Override
    public List<Contact> selectAll(int id) {
        return contactMapper.selectAll(id);
    }

    @Override
    public int addcontact(Contact contact) {
        return contactMapper.insert(contact);
    }

    @Override
    public int deletecontact(int id) {
        return contactMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Contact getcontact(int id) {
        return contactMapper.selectByPrimaryKey(id);
    }

    @Override
    public int altercontact(Contact contact) {
        return contactMapper.updateByPrimaryKey(contact);
    }
}
