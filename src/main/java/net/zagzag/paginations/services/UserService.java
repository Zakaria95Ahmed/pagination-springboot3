package net.zagzag.paginations.services;

import net.zagzag.paginations.models.User;
import org.springframework.data.domain.Page;

/**
 * @author Get Arrays (<a href="https://www.getarrays.io/">...</a>)
 * @version 1.0
 * @since 6/26/2022
 */

public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}
