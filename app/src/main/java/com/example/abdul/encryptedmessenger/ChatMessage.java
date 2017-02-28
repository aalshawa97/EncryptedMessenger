package com.example.abdul.encryptedmessenger;

import java.util.Date;

/**
 * Created by abdul on 2/25/2017.
 */

public class ChatMessage
{
    //Declare variables
    private String messageText = " ";
    private String messageUser = " ";
    private long messageTime = 0;

    //Class constructor
    public ChatMessage(String messageText,String messageUser)
    {
        this.messageText = messageText;
        this.messageUser = messageUser;
        messageTime = new Date().getTime();
    }

    public  ChatMessage()
    {

    }

    //Getters and setters

    public String getMessageText()
    {
        return messageText;
    }

    public String getMessageUser()
    {
        return messageUser;
    }

    public long getMessageTime()
    {
        return messageTime;
    }

    public void setMessageText(String messageText)
    {
        this.messageText = messageText;
    }

    public void setMessageUser(String messageUser)
    {
        this.messageUser = messageUser;
    }

    public void setMessageTime(long messageTime)
    {
        this.messageTime = messageTime;
    }
}
