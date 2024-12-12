package net.zagzag.paginations.services.implementation;

import net.zagzag.paginations.models.User;
import net.zagzag.paginations.repostitories.UserRepository;
import net.zagzag.paginations.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import static org.springframework.data.domain.PageRequest.of;

/**
 * @author Get Arrays (<a href="https://www.getarrays.io/">...</a>)
 * @version 1.0
 * @since 6/26/2022
 */

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Page<User> getUsers(String name, int page, int size) {
        log.info("Fetching users for page {} of size {}", page, size);
        return userRepository.findByNameContaining(name, of(page, size));
    }
}
