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

public class SimplexTableau_getData_17006643057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15113;

    public SimplexTableau_getData_17006643057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52492 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term52491 = ((Class) term52492).getDeclaredField((String) "GEQ");
        ((Field) term52491).setAccessible(true);
        Object enum134 = ((Field) term52491).get((Object) null);
        Object term15118 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15118, term15118.getClass(), "coefficients", null);
        setField(term15118, term15118.getClass(), "relationship", enum134);
        setDoubleField(term15118, term15118.getClass(), "value", 0.9165240441138934);
        Object term15122 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15122, term15122.getClass(), "coefficients", null);
        setField(term15122, term15122.getClass(), "relationship", enum134);
        setDoubleField(term15122, term15122.getClass(), "value", 0.22227423914231126);
        Class<? extends Object> term52788 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term52787 = ((Class) term52788).getDeclaredField((String) "LEQ");
        ((Field) term52787).setAccessible(true);
        Object enum135 = ((Field) term52787).get((Object) null);
        Object term15124 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15124, term15124.getClass(), "coefficients", null);
        setField(term15124, term15124.getClass(), "relationship", enum135);
        setDoubleField(term15124, term15124.getClass(), "value", 0.06480976831423468);
        ArrayList term15116 = new ArrayList();
        ((ArrayList) term15116).add(term15118);
        ((ArrayList) term15116).add(term15122);
        ((ArrayList) term15116).add(term15124);
        term15113 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term15114 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term15114, term15114.getClass(), "coefficients", null);
        setDoubleField(term15114, term15114.getClass(), "constantTerm", 0.6054109236809134);
        setField(term15113, term15113.getClass(), "f", term15114);
        setField(term15113, term15113.getClass(), "constraints", term15116);
        setBooleanField(term15113, term15113.getClass(), "restrictToNonNegative", false);
        setField(term15113, term15113.getClass(), "tableau", null);
        setIntField(term15113, term15113.getClass(), "numDecisionVariables", 1540719661);
        setIntField(term15113, term15113.getClass(), "numSlackVariables", 1265463001);
        setIntField(term15113, term15113.getClass(), "numArtificialVariables", 335112684);
        setDoubleField(term15113, term15113.getClass(), "epsilon", 0.8490790645379176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getData", argTypes, term15113, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


