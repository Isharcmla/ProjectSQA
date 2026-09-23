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

public class SimplexTableau_getConstraintTypeCounts_110645959037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4001;
     Object enum83;
     Object term33182;
     Object enum84;

    public SimplexTableau_getConstraintTypeCounts_110645959037() {
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
        Class<? extends Object> term33192 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term33191 = ((Class) term33192).getDeclaredField((String) "EQ");
        ((Field) term33191).setAccessible(true);
        enum83 = ((Field) term33191).get((Object) null);
        ArrayList term33184 = new ArrayList();
        term33182 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term33183 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term33183, term33183.getClass(), "coefficients", null);
        setDoubleField(term33183, term33183.getClass(), "constantTerm", 0.3587267442738795);
        setField(term33182, term33182.getClass(), "f", term33183);
        setField(term33182, term33182.getClass(), "constraints", term33184);
        setBooleanField(term33182, term33182.getClass(), "restrictToNonNegative", true);
        setField(term33182, term33182.getClass(), "tableau", null);
        setIntField(term33182, term33182.getClass(), "numDecisionVariables", 1134449235);
        setIntField(term33182, term33182.getClass(), "numSlackVariables", -883034806);
        setIntField(term33182, term33182.getClass(), "numArtificialVariables", 1585847225);
        setDoubleField(term33182, term33182.getClass(), "epsilon", 0.07802449704920456);
        Class<? extends Object> term33485 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term33484 = ((Class) term33485).getDeclaredField((String) "EQ");
        ((Field) term33484).setAccessible(true);
        enum84 = ((Field) term33484).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.Relationship");
        Object[] args = new Object[1];
        args[0] = enum83;
        Object retValue = callMethod(klass, "getConstraintTypeCounts", argTypes, term4001, args);
        assertTrue(recursiveEquals(term4001, term33182));
        assertTrue(recursiveEquals(enum83, enum84));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


