/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tutoria.Interface;

import tutoria.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {
    
}
