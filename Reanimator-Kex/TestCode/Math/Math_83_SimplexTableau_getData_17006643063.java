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

public class SimplexTableau_getData_17006643063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16338;

    public SimplexTableau_getData_17006643063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57947 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term57946 = ((Class) term57947).getDeclaredField((String) "GEQ");
        ((Field) term57946).setAccessible(true);
        Object enum148 = ((Field) term57946).get((Object) null);
        Object term16343 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term16343, term16343.getClass(), "coefficients", null);
        setField(term16343, term16343.getClass(), "relationship", enum148);
        setDoubleField(term16343, term16343.getClass(), "value", 0.9485929668765458);
        Class<? extends Object> term58243 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term58242 = ((Class) term58243).getDeclaredField((String) "EQ");
        ((Field) term58242).setAccessible(true);
        Object enum149 = ((Field) term58242).get((Object) null);
        Object term16347 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term16347, term16347.getClass(), "coefficients", null);
        setField(term16347, term16347.getClass(), "relationship", enum149);
        setDoubleField(term16347, term16347.getClass(), "value", 0.5179319342588155);
        ArrayList term16341 = new ArrayList();
        ((ArrayList) term16341).add(term16343);
        ((ArrayList) term16341).add(term16347);
        term16338 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term16339 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term16339, term16339.getClass(), "coefficients", null);
        setDoubleField(term16339, term16339.getClass(), "constantTerm", 0.5407563152320285);
        setField(term16338, term16338.getClass(), "f", term16339);
        setField(term16338, term16338.getClass(), "constraints", term16341);
        setBooleanField(term16338, term16338.getClass(), "restrictToNonNegative", true);
        setField(term16338, term16338.getClass(), "tableau", null);
        setIntField(term16338, term16338.getClass(), "numDecisionVariables", 1240914516);
        setIntField(term16338, term16338.getClass(), "numSlackVariables", -1465035361);
        setIntField(term16338, term16338.getClass(), "numArtificialVariables", 1090617576);
        setDoubleField(term16338, term16338.getClass(), "epsilon", 0.25025774487844066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getData", argTypes, term16338, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


