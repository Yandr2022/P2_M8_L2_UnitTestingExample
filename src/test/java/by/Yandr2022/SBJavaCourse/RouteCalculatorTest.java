package by.Yandr2022.SBJavaCourse;

import by.Yandr2022.SBJavaCourse.core.Line;
import by.Yandr2022.SBJavaCourse.core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {

    List<Station> route;

    @Override
    protected void setUp() throws Exception {//init

        Line line1 = new Line(1, "First");
        Line line2 = new Line(2, "Second");

        route = new ArrayList<>() {{
            add(new Station("AAA", line1));
            add(new Station("BBB", line1));
            add(new Station("CCC", line2));
            add(new Station("DDD", line2));
        }};
    }

    public void testCalculateDuration(){
        double expected = 8.5;
        double actual = RouteCalculator.calculateDuration(route);
        assertEquals(expected,actual);
    }

    @Override
    protected void tearDown() throws Exception {//remove temp Data

    }
}
