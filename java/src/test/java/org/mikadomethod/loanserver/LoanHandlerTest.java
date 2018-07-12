package org.mikadomethod.loanserver;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("LoanHandler unitTest")
public class LoanHandlerTest
{
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

    @Test
    @DisplayName("Next TicketId should be equal 31")
    void nextTicketIdShouldBeEqual31()
    {
        assertEquals(31, LoanHandler.getNextId(), "Next TicketId should be equal 31");
    }
}
