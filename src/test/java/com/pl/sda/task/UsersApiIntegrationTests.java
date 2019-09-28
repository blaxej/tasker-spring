package com.pl.sda.task;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc

public class UsersApiIntegrationTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("When invike get on /api/users then return 2000 status")
    public void test() throws Exception {
        //whem
        mockMvc.perform(get("/api/users"))

                //them
        .andExpect(status().isOk());
    }
}
