package com.backend.api;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.backend.api.controller.CategorieController;
import com.backend.api.service.CategorieService;

@WebMvcTest( controllers = CategorieController.class)
public class CategoriecontrollerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CategorieService categorieService;

    @Test
    public void testGetCategories() throws Exception{
        mockMvc.perform(get("/Categories")).andExpect(status().isOk());
    }
}
