package org.example.seriliatition;
import org.example.people.AccountOwner;
import org.example.people.BaseHuman;
import org.example.people.seriliazition.AccountOwnerSeriliaze;
import org.example.people.seriliazition.AccountOwnerSeriliazeFactory;
import org.example.seriliatition.Serializetion;

import java.util.logging.XMLFormatter;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;


public class AccountOwnerXMLSeriliazeService implements Serializetion {
    AccountOwnerSeriliazeFactory factory = new AccountOwnerSeriliazeFactory();

    @Override
    public String serialize(Object accountOwner){
        if (!(accountOwner instanceof BaseHuman)){
            throw new IllegalArgumentException("Account owner type is not AccountOwner");
        }
        AccountOwnerSeriliaze accountOwnerSeriliaze = factory.createAccountOwnerSeriliaze((BaseHuman)accountOwner);
        AccountOwnerSeriliaze accountOwnerSeriliaze = factory.createAccountOwnerSeriliaze((BaseHuman) accountOwner);
        JAXBContext context = JAXBContext.newInstance(AccountOwnerSeriliaze.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter writer = new StringWriter();
        marshaller.marshal(accountOwnerSeriliaze, writer);
        return writer.toString();

        /*StringBuilder builder = new StringBuilder();
        builder.append("<AccountOwner>");
        builder.append("<uuid>").append(accountOwnerSeriliaze.uuid).append("</uuid>");
        builder.append("<lastName>").append(accountOwnerSeriliaze.lastName).append("</lastName>");
        builder.append("<firstName>").append(accountOwnerSeriliaze.firstName).append("</firstName>");
        builder.append("</AccountOwner>");
        return builder.toString();*/
    }
    @Override
    public String deserialize(String accountOwner)
    {


        return "";
    }
}
