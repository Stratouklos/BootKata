package com.stratouklos.service;

import com.stratouklos.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "accounts", path = "accounts")
interface AccountRepository extends CrudRepository<Account, String> {

}
