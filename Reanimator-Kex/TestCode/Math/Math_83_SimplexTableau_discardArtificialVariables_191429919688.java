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

public class SimplexTableau_discardArtificialVariables_191429919688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68915;
     Object term68923;

    public SimplexTableau_discardArtificialVariables_191429919688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68915 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setIntField(term68915, term68915.getClass(), "numArtificialVariables", 0);
        term68923 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term68923, term68923.getClass(), "f", null);
        setField(term68923, term68923.getClass(), "constraints", null);
        setBooleanField(term68923, term68923.getClass(), "restrictToNonNegative", false);
        setField(term68923, term68923.getClass(), "tableau", null);
        setIntField(term68923, term68923.getClass(), "numDecisionVariables", 0);
        setIntField(term68923, term68923.getClass(), "numSlackVariables", 0);
        setIntField(term68923, term68923.getClass(), "numArtificialVariables", 0);
        setDoubleField(term68923, term68923.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "discardArtificialVariables", argTypes, term68915, args);
        assertTrue(recursiveEquals(term68915, term68923));
    }

};


