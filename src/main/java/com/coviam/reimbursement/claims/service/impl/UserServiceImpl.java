package com.coviam.reimbursement.claims.service.impl;

import com.coviam.reimbursement.claims.repository.UserRepository;
import com.coviam.reimbursement.claims.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Foram Shah on 23/06/18
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;
}
