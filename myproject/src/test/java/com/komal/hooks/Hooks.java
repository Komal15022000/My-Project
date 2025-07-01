package com.komal.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.komal.utils.DriverManager;

public class Hooks extends BaseTest
{
    private DriverManager driverManager;

    public Hooks(DriverManager driverManager)
    {
        this.driverManager = driverManager;

    }



    @Before
    public void beforeScenario()
    {
        setUp();
        driverManager.setDriver(getDriver());

    }


    @After
    public void afterScenario()
    {
        tearDown();

    }



}