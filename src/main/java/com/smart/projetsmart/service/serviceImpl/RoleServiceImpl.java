package com.smart.projetsmart.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.projetsmart.repostory.RoleRepository;
import com.smart.projetsmart.entity.Role;
import com.smart.projetsmart.service.RoleServices;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleServices {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(long id) {
        Optional<Role> optionalRole = roleRepository.findById(id);
        if (optionalRole.isPresent()) {
            Role role = optionalRole.get();
            return role;
        } else {
            throw new IllegalArgumentException("Role with ID " + id + " not found");
        }
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role updateRole(Role updatedRole) {
        return roleRepository.save(updatedRole);
    }

    @Override
    public void deleteRole(long id) {
        Optional<Role> optionalRole = roleRepository.findById(id);
        if (optionalRole.isPresent()) {
            Role role = optionalRole.get();
            roleRepository.delete(role);
        } else {
            throw new IllegalArgumentException("Role with ID " + id + " not found");
        }
    }
}
