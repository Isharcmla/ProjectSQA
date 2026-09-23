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

public class SimplexTableau_getConstraintTypeCounts_110645959039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2761;
     Object enum72;
     Object term31915;
     Object enum73;

    public SimplexTableau_getConstraintTypeCounts_110645959039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2764 = new ArrayList();
        ArrayList term2769 = new ArrayList();
        ((ArrayList) term2769).add("HyxfbSQYBe");
        ((ArrayList) term2769).add("pCTimMblYc");
        term2761 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term2762 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term2762, term2762.getClass(), "coefficients", null);
        setDoubleField(term2762, term2762.getClass(), "constantTerm", 0.37161417339133307);
        setField(term2761, term2761.getClass(), "f", term2762);
        setField(term2761, term2761.getClass(), "constraints", term2764);
        setBooleanField(term2761, term2761.getClass(), "restrictToNonNegative", true);
        setField(term2761, term2761.getClass(), "columnLabels", term2769);
        setField(term2761, term2761.getClass(), "tableau", null);
        setIntField(term2761, term2761.getClass(), "numDecisionVariables", -655067527);
        setIntField(term2761, term2761.getClass(), "numSlackVariables", -6029667);
        setIntField(term2761, term2761.getClass(), "numArtificialVariables", -2068769794);
        setDoubleField(term2761, term2761.getClass(), "epsilon", 0.6805867182029153);
        setIntField(term2761, term2761.getClass(), "maxUlps", -117576464);
        Class<? extends Object> term31951 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term31950 = ((Class) term31951).getDeclaredField((String) "EQ");
        ((Field) term31950).setAccessible(true);
        enum72 = ((Field) term31950).get((Object) null);
        ArrayList term31917 = new ArrayList();
        ArrayList term31919 = new ArrayList();
        ((ArrayList) term31919).add("HyxfbSQYBe");
        ((ArrayList) term31919).add("pCTimMblYc");
        term31915 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term31916 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term31916, term31916.getClass(), "coefficients", null);
        setDoubleField(term31916, term31916.getClass(), "constantTerm", 0.37161417339133307);
        setField(term31915, term31915.getClass(), "f", term31916);
        setField(term31915, term31915.getClass(), "constraints", term31917);
        setBooleanField(term31915, term31915.getClass(), "restrictToNonNegative", true);
        setField(term31915, term31915.getClass(), "columnLabels", term31919);
        setField(term31915, term31915.getClass(), "tableau", null);
        setIntField(term31915, term31915.getClass(), "numDecisionVariables", -655067527);
        setIntField(term31915, term31915.getClass(), "numSlackVariables", -6029667);
        setIntField(term31915, term31915.getClass(), "numArtificialVariables", -2068769794);
        setDoubleField(term31915, term31915.getClass(), "epsilon", 0.6805867182029153);
        setIntField(term31915, term31915.getClass(), "maxUlps", -117576464);
        Class<? extends Object> term32264 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term32263 = ((Class) term32264).getDeclaredField((String) "EQ");
        ((Field) term32263).setAccessible(true);
        enum73 = ((Field) term32263).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.Relationship");
        Object[] args = new Object[1];
        args[0] = enum72;
        Object retValue = callMethod(klass, "getConstraintTypeCounts", argTypes, term2761, args);
        assertTrue(recursiveEquals(term2761, term31915));
        assertTrue(recursiveEquals(enum72, enum73));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


