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

public class SimplexTableau_getConstraintTypeCounts_130659585239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2801;
     Object enum70;
     Object term33563;
     Object enum71;

    public SimplexTableau_getConstraintTypeCounts_130659585239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2804 = new ArrayList();
        ArrayList term2809 = new ArrayList();
        ((ArrayList) term2809).add("HyxfbSQYBe");
        ((ArrayList) term2809).add("pCTimMblYc");
        term2801 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term2802 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term2802, term2802.getClass(), "coefficients", null);
        setDoubleField(term2802, term2802.getClass(), "constantTerm", 0.37161417339133307);
        setField(term2801, term2801.getClass(), "f", term2802);
        setField(term2801, term2801.getClass(), "constraints", term2804);
        setBooleanField(term2801, term2801.getClass(), "restrictToNonNegative", true);
        setField(term2801, term2801.getClass(), "columnLabels", term2809);
        setField(term2801, term2801.getClass(), "tableau", null);
        setIntField(term2801, term2801.getClass(), "numDecisionVariables", -655067527);
        setIntField(term2801, term2801.getClass(), "numSlackVariables", -6029667);
        setIntField(term2801, term2801.getClass(), "numArtificialVariables", -2068769794);
        setDoubleField(term2801, term2801.getClass(), "epsilon", 0.6805867182029153);
        setIntField(term2801, term2801.getClass(), "maxUlps", -117576464);
        Class<? extends Object> term33599 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term33598 = ((Class) term33599).getDeclaredField((String) "EQ");
        ((Field) term33598).setAccessible(true);
        enum70 = ((Field) term33598).get((Object) null);
        ArrayList term33565 = new ArrayList();
        ArrayList term33567 = new ArrayList();
        ((ArrayList) term33567).add("HyxfbSQYBe");
        ((ArrayList) term33567).add("pCTimMblYc");
        term33563 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term33564 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term33564, term33564.getClass(), "coefficients", null);
        setDoubleField(term33564, term33564.getClass(), "constantTerm", 0.37161417339133307);
        setField(term33563, term33563.getClass(), "f", term33564);
        setField(term33563, term33563.getClass(), "constraints", term33565);
        setBooleanField(term33563, term33563.getClass(), "restrictToNonNegative", true);
        setField(term33563, term33563.getClass(), "columnLabels", term33567);
        setField(term33563, term33563.getClass(), "tableau", null);
        setIntField(term33563, term33563.getClass(), "numDecisionVariables", -655067527);
        setIntField(term33563, term33563.getClass(), "numSlackVariables", -6029667);
        setIntField(term33563, term33563.getClass(), "numArtificialVariables", -2068769794);
        setDoubleField(term33563, term33563.getClass(), "epsilon", 0.6805867182029153);
        setIntField(term33563, term33563.getClass(), "maxUlps", -117576464);
        Class<? extends Object> term33917 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term33916 = ((Class) term33917).getDeclaredField((String) "EQ");
        ((Field) term33916).setAccessible(true);
        enum71 = ((Field) term33916).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.Relationship");
        Object[] args = new Object[1];
        args[0] = enum70;
        Object retValue = callMethod(klass, "getConstraintTypeCounts", argTypes, term2801, args);
        assertTrue(recursiveEquals(term2801, term33563));
        assertTrue(recursiveEquals(enum70, enum71));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


