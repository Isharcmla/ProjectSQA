package org.apache.commons.math.optimization.linear;

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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getNumVariables_166278949633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term951;

    public SimplexTableau_getNumVariables_166278949633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26807 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term26806 = ((Class) term26807).getDeclaredField((String) "LEQ");
        ((Field) term26806).setAccessible(true);
        Object enum63 = ((Field) term26806).get((Object) null);
        Object term956 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term956, term956.getClass(), "coefficients", null);
        setField(term956, term956.getClass(), "relationship", enum63);
        setDoubleField(term956, term956.getClass(), "value", 0.37773193782763337);
        Class<? extends Object> term27103 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term27102 = ((Class) term27103).getDeclaredField((String) "EQ");
        ((Field) term27102).setAccessible(true);
        Object enum64 = ((Field) term27102).get((Object) null);
        Object term960 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term960, term960.getClass(), "coefficients", null);
        setField(term960, term960.getClass(), "relationship", enum64);
        setDoubleField(term960, term960.getClass(), "value", 0.8474802076607362);
        Class<? extends Object> term27396 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term27395 = ((Class) term27396).getDeclaredField((String) "LEQ");
        ((Field) term27395).setAccessible(true);
        Object enum65 = ((Field) term27395).get((Object) null);
        Object term964 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term964, term964.getClass(), "coefficients", null);
        setField(term964, term964.getClass(), "relationship", enum65);
        setDoubleField(term964, term964.getClass(), "value", 0.5183269973490326);
        Object term968 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term968, term968.getClass(), "coefficients", null);
        setField(term968, term968.getClass(), "relationship", enum65);
        setDoubleField(term968, term968.getClass(), "value", 0.7655020693602768);
        ArrayList term954 = new ArrayList();
        ((ArrayList) term954).add(term956);
        ((ArrayList) term954).add(term960);
        ((ArrayList) term954).add(term964);
        ((ArrayList) term954).add(term968);
        term951 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term952 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term952, term952.getClass(), "coefficients", null);
        setDoubleField(term952, term952.getClass(), "constantTerm", 0.6076495596892013);
        setField(term951, term951.getClass(), "f", term952);
        setField(term951, term951.getClass(), "constraints", term954);
        setBooleanField(term951, term951.getClass(), "restrictToNonNegative", false);
        setField(term951, term951.getClass(), "tableau", null);
        setIntField(term951, term951.getClass(), "numDecisionVariables", 391863371);
        setIntField(term951, term951.getClass(), "numSlackVariables", -1922583790);
        setIntField(term951, term951.getClass(), "numArtificialVariables", -616727354);
        setDoubleField(term951, term951.getClass(), "epsilon", 0.1374549299694151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNumVariables", argTypes, term951, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


