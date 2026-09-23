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

public class SimplexTableau_getConstraintTypeCounts_110645959040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4001;
     Object enum90;
     Object term36626;
     Object enum91;

    public SimplexTableau_getConstraintTypeCounts_110645959040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4004 = new ArrayList();
        term4001 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term4002 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term4002, term4002.getClass(), "coefficients", null);
        setDoubleField(term4002, term4002.getClass(), "constantTerm", 0.3587267442738795);
        setField(term4001, term4001.getClass(), "f", term4002);
        setField(term4001, term4001.getClass(), "constraints", term4004);
        setBooleanField(term4001, term4001.getClass(), "restrictToNonNegative", true);
        setField(term4001, term4001.getClass(), "tableau", null);
        setIntField(term4001, term4001.getClass(), "numDecisionVariables", 1134449235);
        setIntField(term4001, term4001.getClass(), "numSlackVariables", -883034806);
        setIntField(term4001, term4001.getClass(), "numArtificialVariables", 1585847225);
        setDoubleField(term4001, term4001.getClass(), "epsilon", 0.07802449704920456);
        Class<? extends Object> term36636 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term36635 = ((Class) term36636).getDeclaredField((String) "EQ");
        ((Field) term36635).setAccessible(true);
        enum90 = ((Field) term36635).get((Object) null);
        ArrayList term36628 = new ArrayList();
        term36626 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term36627 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term36627, term36627.getClass(), "coefficients", null);
        setDoubleField(term36627, term36627.getClass(), "constantTerm", 0.3587267442738795);
        setField(term36626, term36626.getClass(), "f", term36627);
        setField(term36626, term36626.getClass(), "constraints", term36628);
        setBooleanField(term36626, term36626.getClass(), "restrictToNonNegative", true);
        setField(term36626, term36626.getClass(), "tableau", null);
        setIntField(term36626, term36626.getClass(), "numDecisionVariables", 1134449235);
        setIntField(term36626, term36626.getClass(), "numSlackVariables", -883034806);
        setIntField(term36626, term36626.getClass(), "numArtificialVariables", 1585847225);
        setDoubleField(term36626, term36626.getClass(), "epsilon", 0.07802449704920456);
        Class<? extends Object> term36929 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term36928 = ((Class) term36929).getDeclaredField((String) "EQ");
        ((Field) term36928).setAccessible(true);
        enum91 = ((Field) term36928).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.Relationship");
        Object[] args = new Object[1];
        args[0] = enum90;
        Object retValue = callMethod(klass, "getConstraintTypeCounts", argTypes, term4001, args);
        assertTrue(recursiveEquals(term4001, term36626));
        assertTrue(recursiveEquals(enum90, enum91));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


