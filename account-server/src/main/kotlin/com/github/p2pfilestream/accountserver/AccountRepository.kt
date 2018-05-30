package com.github.p2pfilestream.accountserver

import com.github.p2pfilestream.Account
import org.springframework.data.repository.CrudRepository

interface AccountRepository : CrudRepository<Account, Long> {
    fun findByUsername(username: String): Account?
}