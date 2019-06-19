package com.springboot.qunawan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.qunawan.pojo.Contact;
import com.springboot.qunawan.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
@Controller
@RequestMapping("/user")
public class ContactAction {
    @Autowired
    ContactService contactService;
    @RequestMapping("/queryAllByPage.action")
    @ResponseBody
    public Map<String,Object> get_by_page(@RequestParam(value = "pn") int pn,@RequestParam(value = "id") int id){
        System.out.println("分页"+pn);
        PageHelper.startPage(pn, 5);
        PageInfo pageInfo=new PageInfo(contactService.selectAll(id),5);
        for(Object e:pageInfo.getList()){
            System.out.println(e);
        }
        Map<String,Object> mp=new HashMap<String,Object>();
        mp.put("pageInfo",pageInfo);
        return mp;
    }

    @RequestMapping("/addcontact.action")
    @ResponseBody
    public int insert_contact(Contact contact)
    {
        System.out.println(contact);
        return contactService.addcontact(contact);
    }

    @RequestMapping("/deletecontact.action")
    @ResponseBody
    public int delete_contact(@RequestParam(value="eid") int id)
    {
        return contactService.deletecontact(id);
    }

    @RequestMapping("/getonecontact.action")
    @ResponseBody
    public Contact get_contact(@RequestParam(value="eid") int id)
    {
        return contactService.getcontact(id);
    }

    @RequestMapping("/altercontact.action")
    @ResponseBody
    public int alter_contact(Contact contact)
    {
        return contactService.altercontact(contact);
    }
}
