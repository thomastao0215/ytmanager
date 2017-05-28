package com.ytmanager;

/**
 * Created by jiachen215 on 2017/5/26.
 */
import org.springframework.data.repository.CrudRepository;

import javax.sql.rowset.CachedRowSet;

public interface UserRepository extends CrudRepository<User,Long> {}
