package net.zagzag.paginations.repostitories;

import net.zagzag.paginations.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Get Arrays (<a href="https://www.getarrays.io/">...</a>)
 * @version 1.0
 * @since 6/26/2022
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Page<User> findByNameContaining(String name, Pageable pageable);
}
