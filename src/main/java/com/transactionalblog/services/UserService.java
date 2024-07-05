package com.transactionalblog.services;

import com.transactionalblog.domain.CustomException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Transactional
    public void saveUser() {
        // code to save user
    }

    @Transactional(readOnly = true)
    public void fetchUser() {
        // code to fetch user
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void newTransaction() {
        // code to execute in a new transaction
    }

    @Transactional(rollbackFor = {CustomException.class})
    public void performWithRollback() {
        // risky code that may throw CustomException
    }
}
