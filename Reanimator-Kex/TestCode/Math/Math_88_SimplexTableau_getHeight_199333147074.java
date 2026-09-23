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

public class SimplexTableau_getHeight_199333147074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58074;
     Object term58851;

    public SimplexTableau_getHeight_199333147074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58074 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term58170 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term58074, term58074.getClass(), "tableau", term58170);
        term58851 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term58852 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term58851, term58851.getClass(), "f", null);
        setField(term58851, term58851.getClass(), "constraints", null);
        setBooleanField(term58851, term58851.getClass(), "restrictToNonNegative", false);
        setField(term58852, term58852.getClass(), "data", null);
        setField(term58852, term58852.getClass(), "lu", null);
        setField(term58851, term58851.getClass(), "tableau", term58852);
        setIntField(term58851, term58851.getClass(), "numDecisionVariables", 0);
        setIntField(term58851, term58851.getClass(), "numSlackVariables", 0);
        setIntField(term58851, term58851.getClass(), "numArtificialVariables", 0);
        setDoubleField(term58851, term58851.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeight", argTypes, term58074, args);
        assertTrue(recursiveEquals(term58074, term58851));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


