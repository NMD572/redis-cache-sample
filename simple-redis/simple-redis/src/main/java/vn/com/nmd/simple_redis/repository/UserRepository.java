package vn.com.nmd.simple_redis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.com.nmd.simple_redis.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {

}
