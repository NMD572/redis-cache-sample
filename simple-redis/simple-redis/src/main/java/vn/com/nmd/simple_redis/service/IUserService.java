package vn.com.nmd.simple_redis.service;

import vn.com.nmd.simple_redis.entity.User;

public interface IUserService {
	public User getUserById(Long id);
	public User saveUser(User user);
	public void deleteUser(Long id);
}
