package org.example.seriliatition;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.people.BaseHuman;
import org.example.people.seriliazition.AccountOwnerSeriliaze;
import org.example.people.seriliazition.AccountOwnerSeriliazeFactory;



public class AccountOwnerXMLSeriliazeService implements Serializetion {
    AccountOwnerSeriliazeFactory factory = new AccountOwnerSeriliazeFactory();
    private final XmlMapper xmlMapper = new XmlMapper();

    @Override
    public String serialize(Object accountOwner){
        if (!(accountOwner instanceof BaseHuman)){
            throw new IllegalArgumentException("Account owner type is not AccountOwner");
        }

        AccountOwnerSeriliaze accountOwnerSeriliaze = factory.createAccountOwnerSeriliaze((BaseHuman)accountOwner);
        try {
            return xmlMapper.writeValueAsString(accountOwnerSeriliaze);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    @Override
    public String deserialize(String accountOwner)
    {


        return "";
    }
}
 /*StringBuilder builder = new StringBuilder();
        builder.append("<AccountOwner>");
        builder.append("<uuid>").append(accountOwnerSeriliaze.uuid).append("</uuid>");
        builder.append("<lastName>").append(accountOwnerSeriliaze.lastName).append("</lastName>");
        builder.append("<firstName>").append(accountOwnerSeriliaze.firstName).append("</firstName>");
        builder.append("</AccountOwner>");
        return builder.toString();*/