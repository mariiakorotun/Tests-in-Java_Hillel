package org.example.app;

import org.example.app.service.BonusServiceTest;
import org.example.app.utils.RounderTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BonusServiceTest.class,
        RounderTest.class
})
public class GeneralServiceTestTest {

}