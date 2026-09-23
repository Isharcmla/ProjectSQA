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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_initialize_40233656541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4315;
     Object term37238;

    public SimplexTableau_initialize_40233656541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37245 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term37244 = ((Class) term37245).getDeclaredField((String) "EQ");
        ((Field) term37244).setAccessible(true);
        Object enum92 = ((Field) term37244).get((Object) null);
        Object term4320 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term4320, term4320.getClass(), "coefficients", null);
        setField(term4320, term4320.getClass(), "relationship", enum92);
        setDoubleField(term4320, term4320.getClass(), "value", 0.3202192021706908);
        ArrayList term4318 = new ArrayList();
        ((ArrayList) term4318).add(term4320);
        term4315 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term4316 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term4316, term4316.getClass(), "coefficients", null);
        setDoubleField(term4316, term4316.getClass(), "constantTerm", 0.5279279537140873);
        setField(term4315, term4315.getClass(), "f", term4316);
        setField(term4315, term4315.getClass(), "constraints", term4318);
        setBooleanField(term4315, term4315.getClass(), "restrictToNonNegative", true);
        setField(term4315, term4315.getClass(), "tableau", null);
        setIntField(term4315, term4315.getClass(), "numDecisionVariables", 597278769);
        setIntField(term4315, term4315.getClass(), "numSlackVariables", -1685132342);
        setIntField(term4315, term4315.getClass(), "numArtificialVariables", -1456670397);
        setDoubleField(term4315, term4315.getClass(), "epsilon", 0.22651340641904605);
        Class<? extends Object> term37538 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term37537 = ((Class) term37538).getDeclaredField((String) "EQ");
        ((Field) term37537).setAccessible(true);
        Object enum93 = ((Field) term37537).get((Object) null);
        Object term37242 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term37242, term37242.getClass(), "coefficients", null);
        setField(term37242, term37242.getClass(), "relationship", enum93);
        setDoubleField(term37242, term37242.getClass(), "value", 0.3202192021706908);
        ArrayList term37240 = new ArrayList();
        ((ArrayList) term37240).add(term37242);
        term37238 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term37239 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term37239, term37239.getClass(), "coefficients", null);
        setDoubleField(term37239, term37239.getClass(), "constantTerm", 0.5279279537140873);
        setField(term37238, term37238.getClass(), "f", term37239);
        setField(term37238, term37238.getClass(), "constraints", term37240);
        setBooleanField(term37238, term37238.getClass(), "restrictToNonNegative", true);
        setField(term37238, term37238.getClass(), "tableau", null);
        setIntField(term37238, term37238.getClass(), "numDecisionVariables", 597278769);
        setIntField(term37238, term37238.getClass(), "numSlackVariables", -1685132342);
        setIntField(term37238, term37238.getClass(), "numArtificialVariables", -1456670397);
        setDoubleField(term37238, term37238.getClass(), "epsilon", 0.22651340641904605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initialize", argTypes, term4315, args);
        assertTrue(recursiveEquals(term4315, term37238));
    }

};


