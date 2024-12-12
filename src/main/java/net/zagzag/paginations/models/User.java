package net.zagzag.paginations.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * @author Get Arrays (<a href="https://www.getarrays.io/">...</a>)
 * @version 1.0
 * @since 6/26/2022
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter @Setter
@JsonInclude(NON_DEFAULT)
@Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String status;
    private String address;
    private String phone;
    private String imageUrl;
}
