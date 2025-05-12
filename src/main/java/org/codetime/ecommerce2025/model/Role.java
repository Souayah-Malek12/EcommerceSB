package org.codetime.ecommerce2025.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="tables")
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    private Long roleId;
    private String roleName;
}
