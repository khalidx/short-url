package com.echelon.ims.presence.shorturl.entity;

import org.springframework.data.repository.CrudRepository;

public interface UrlRepository extends CrudRepository<Url, Long>
{
    public Url findOneByHash(String hash);
}