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

public class SimplexTableau_initialize_40233656538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4315;
     Object term33795;

    public SimplexTableau_initialize_40233656538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33802 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term33801 = ((Class) term33802).getDeclaredField((String) "LEQ");
        ((Field) term33801).setAccessible(true);
        Object enum85 = ((Field) term33801).get((Object) null);
        Object term4320 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term4320, term4320.getClass(), "coefficients", null);
        setField(term4320, term4320.getClass(), "relationship", enum85);
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
        Class<? extends Object> term34098 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term34097 = ((Class) term34098).getDeclaredField((String) "GEQ");
        ((Field) term34097).setAccessible(true);
        Object enum86 = ((Field) term34097).get((Object) null);
        Object term33799 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term33799, term33799.getClass(), "coefficients", null);
        setField(term33799, term33799.getClass(), "relationship", enum86);
        setDoubleField(term33799, term33799.getClass(), "value", 0.3202192021706908);
        ArrayList term33797 = new ArrayList();
        ((ArrayList) term33797).add(term33799);
        term33795 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term33796 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term33796, term33796.getClass(), "coefficients", null);
        setDoubleField(term33796, term33796.getClass(), "constantTerm", 0.5279279537140873);
        setField(term33795, term33795.getClass(), "f", term33796);
        setField(term33795, term33795.getClass(), "constraints", term33797);
        setBooleanField(term33795, term33795.getClass(), "restrictToNonNegative", true);
        setField(term33795, term33795.getClass(), "tableau", null);
        setIntField(term33795, term33795.getClass(), "numDecisionVariables", 597278769);
        setIntField(term33795, term33795.getClass(), "numSlackVariables", -1685132342);
        setIntField(term33795, term33795.getClass(), "numArtificialVariables", -1456670397);
        setDoubleField(term33795, term33795.getClass(), "epsilon", 0.22651340641904605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initialize", argTypes, term4315, args);
        assertTrue(recursiveEquals(term4315, term33795));
    }

};


