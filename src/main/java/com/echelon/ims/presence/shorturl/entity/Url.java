package com.echelon.ims.presence.shorturl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Url
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String hash;
    private String longUrl;

    protected Url() {}

    public Url(String hash, String longUrl)
    {
        this.hash = hash;
        this.longUrl = longUrl;
    }

    @Override
    public String toString()
    {
        return String.format("Url[id=%d, hash='%s', longUrl='%s']", id, hash, longUrl);
    }
    
    public String getLongUrl()
    {
        return longUrl;
    }
}