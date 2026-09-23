package org.apache.commons.math3.optimization.linear;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.linear.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_dropPhase1Objective_111527097842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3827;
     Object term35404;

    public SimplexTableau_dropPhase1Objective_111527097842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35426 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term35425 = ((Class) term35426).getDeclaredField((String) "GEQ");
        ((Field) term35425).setAccessible(true);
        Object enum74 = ((Field) term35425).get((Object) null);
        Object term3832 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3832, term3832.getClass(), "coefficients", null);
        setField(term3832, term3832.getClass(), "relationship", enum74);
        setDoubleField(term3832, term3832.getClass(), "value", 0.6588948704887806);
        Object term3836 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3836, term3836.getClass(), "coefficients", null);
        setField(term3836, term3836.getClass(), "relationship", enum74);
        setDoubleField(term3836, term3836.getClass(), "value", 0.6397214730945112);
        Class<? extends Object> term35727 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term35726 = ((Class) term35727).getDeclaredField((String) "EQ");
        ((Field) term35726).setAccessible(true);
        Object enum75 = ((Field) term35726).get((Object) null);
        Object term3838 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3838, term3838.getClass(), "coefficients", null);
        setField(term3838, term3838.getClass(), "relationship", enum75);
        setDoubleField(term3838, term3838.getClass(), "value", 0.25937345430928016);
        Class<? extends Object> term36025 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term36024 = ((Class) term36025).getDeclaredField((String) "GEQ");
        ((Field) term36024).setAccessible(true);
        Object enum76 = ((Field) term36024).get((Object) null);
        Object term3842 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3842, term3842.getClass(), "coefficients", null);
        setField(term3842, term3842.getClass(), "relationship", enum76);
        setDoubleField(term3842, term3842.getClass(), "value", 0.5873228247510078);
        Object term3846 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3846, term3846.getClass(), "coefficients", null);
        setField(term3846, term3846.getClass(), "relationship", enum76);
        setDoubleField(term3846, term3846.getClass(), "value", 0.8823181080774973);
        ArrayList term3830 = new ArrayList();
        ((ArrayList) term3830).add(term3832);
        ((ArrayList) term3830).add(term3836);
        ((ArrayList) term3830).add(term3838);
        ((ArrayList) term3830).add(term3842);
        ((ArrayList) term3830).add(term3846);
        ArrayList term3851 = new ArrayList();
        ((ArrayList) term3851).add("RkybSrpybU");
        ((ArrayList) term3851).add("xOEqzGAmDU");
        ((ArrayList) term3851).add("eZFUvlxvGV");
        ((ArrayList) term3851).add("BYqFIqCKAV");
        term3827 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term3828 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term3828, term3828.getClass(), "coefficients", null);
        setDoubleField(term3828, term3828.getClass(), "constantTerm", 0.8878841294187743);
        setField(term3827, term3827.getClass(), "f", term3828);
        setField(term3827, term3827.getClass(), "constraints", term3830);
        setBooleanField(term3827, term3827.getClass(), "restrictToNonNegative", false);
        setField(term3827, term3827.getClass(), "columnLabels", term3851);
        setField(term3827, term3827.getClass(), "tableau", null);
        setIntField(term3827, term3827.getClass(), "numDecisionVariables", -244121226);
        setIntField(term3827, term3827.getClass(), "numSlackVariables", -203030934);
        setIntField(term3827, term3827.getClass(), "numArtificialVariables", -1179120542);
        setDoubleField(term3827, term3827.getClass(), "epsilon", 0.2192450926212024);
        setIntField(term3827, term3827.getClass(), "maxUlps", -73683645);
        Class<? extends Object> term36366 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term36365 = ((Class) term36366).getDeclaredField((String) "GEQ");
        ((Field) term36365).setAccessible(true);
        Object enum77 = ((Field) term36365).get((Object) null);
        Object term35408 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term35408, term35408.getClass(), "coefficients", null);
        setField(term35408, term35408.getClass(), "relationship", enum77);
        setDoubleField(term35408, term35408.getClass(), "value", 0.6588948704887806);
        Object term35410 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term35410, term35410.getClass(), "coefficients", null);
        setField(term35410, term35410.getClass(), "relationship", enum77);
        setDoubleField(term35410, term35410.getClass(), "value", 0.6397214730945112);
        Class<? extends Object> term36667 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term36666 = ((Class) term36667).getDeclaredField((String) "GEQ");
        ((Field) term36666).setAccessible(true);
        Object enum78 = ((Field) term36666).get((Object) null);
        Object term35411 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term35411, term35411.getClass(), "coefficients", null);
        setField(term35411, term35411.getClass(), "relationship", enum78);
        setDoubleField(term35411, term35411.getClass(), "value", 0.25937345430928016);
        Object term35413 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term35413, term35413.getClass(), "coefficients", null);
        setField(term35413, term35413.getClass(), "relationship", enum78);
        setDoubleField(term35413, term35413.getClass(), "value", 0.5873228247510078);
        Object term35414 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term35414, term35414.getClass(), "coefficients", null);
        setField(term35414, term35414.getClass(), "relationship", enum78);
        setDoubleField(term35414, term35414.getClass(), "value", 0.8823181080774973);
        ArrayList term35406 = new ArrayList();
        ((ArrayList) term35406).add(term35408);
        ((ArrayList) term35406).add(term35410);
        ((ArrayList) term35406).add(term35411);
        ((ArrayList) term35406).add(term35413);
        ((ArrayList) term35406).add(term35414);
        ArrayList term35415 = new ArrayList();
        ((ArrayList) term35415).add("RkybSrpybU");
        ((ArrayList) term35415).add("xOEqzGAmDU");
        ((ArrayList) term35415).add("eZFUvlxvGV");
        ((ArrayList) term35415).add("BYqFIqCKAV");
        term35404 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term35405 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term35405, term35405.getClass(), "coefficients", null);
        setDoubleField(term35405, term35405.getClass(), "constantTerm", 0.8878841294187743);
        setField(term35404, term35404.getClass(), "f", term35405);
        setField(term35404, term35404.getClass(), "constraints", term35406);
        setBooleanField(term35404, term35404.getClass(), "restrictToNonNegative", false);
        setField(term35404, term35404.getClass(), "columnLabels", term35415);
        setField(term35404, term35404.getClass(), "tableau", null);
        setIntField(term35404, term35404.getClass(), "numDecisionVariables", -244121226);
        setIntField(term35404, term35404.getClass(), "numSlackVariables", -203030934);
        setIntField(term35404, term35404.getClass(), "numArtificialVariables", -1179120542);
        setDoubleField(term35404, term35404.getClass(), "epsilon", 0.2192450926212024);
        setIntField(term35404, term35404.getClass(), "maxUlps", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dropPhase1Objective", argTypes, term3827, args);
        assertTrue(recursiveEquals(term3827, term35404));
    }

};


