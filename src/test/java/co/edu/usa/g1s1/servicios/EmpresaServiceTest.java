/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.g1s1.servicios;

import co.edu.usa.g1s1.modelo.Empresa;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author juvinao
 */
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class EmpresaServiceTest {
    
    @Autowired
    private EmpresaService service;
    
    public EmpresaServiceTest() {
    }
    

    /**
     * Test of getAll method, of class EmpresaService.
     */
    @Test
    public void testGetAll() {
        System.out.println("Testing getAll Service Method");
        List<Empresa> result = service.getAll();
        assertEquals(0, result.size());
    }

    
}
