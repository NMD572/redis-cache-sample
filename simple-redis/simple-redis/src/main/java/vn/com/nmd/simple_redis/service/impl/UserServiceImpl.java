package vn.com.nmd.simple_redis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.nmd.simple_redis.entity.User;
import vn.com.nmd.simple_redis.repository.UserRepository;
import vn.com.nmd.simple_redis.service.IUserService;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements IUserService {
	
	@Autowired
    private UserRepository userRepository;

	// key can only use input value 
	@Override
    @Cacheable(value = "users", key = "#id")		// get user from cache by key = id
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }


	// key can only use input value 
	@Override
    @Transactional(rollbackFor = Exception.class)
    @CachePut(value = "users", key = "#userResult.id")	// add information to cache when create / update information to cache when update
    public User saveUser(User user) {
		return userRepository.save(user);
    }

	// key can only use input value 
	@Override
    @Transactional(rollbackFor = Exception.class)
    @CacheEvict(value = "users", key = "#id")		// remove from cache when delete user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
