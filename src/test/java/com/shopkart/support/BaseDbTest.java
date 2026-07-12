package com.shopkart.support;

import com.shopkart.data.db.MySqlSupport;
import io.cucumber.java.BeforeAll;

public final class BaseDbTest {
    @BeforeAll
    public static void setupDatabase() {
        // Start Testcontainers MySQL and run Flyway migrations
        MySqlSupport.start();
    }
}
