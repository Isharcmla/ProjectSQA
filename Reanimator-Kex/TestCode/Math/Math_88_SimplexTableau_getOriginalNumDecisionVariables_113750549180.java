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

public class SimplexTableau_getOriginalNumDecisionVariables_113750549180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62228;
     Object term62237;

    public SimplexTableau_getOriginalNumDecisionVariables_113750549180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62228 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term62228, term62228.getClass(), "restrictToNonNegative", false);
        term62237 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term62237, term62237.getClass(), "f", null);
        setField(term62237, term62237.getClass(), "constraints", null);
        setBooleanField(term62237, term62237.getClass(), "restrictToNonNegative", false);
        setField(term62237, term62237.getClass(), "tableau", null);
        setIntField(term62237, term62237.getClass(), "numDecisionVariables", 0);
        setIntField(term62237, term62237.getClass(), "numSlackVariables", 0);
        setIntField(term62237, term62237.getClass(), "numArtificialVariables", 0);
        setDoubleField(term62237, term62237.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOriginalNumDecisionVariables", argTypes, term62228, args);
        assertTrue(recursiveEquals(term62228, term62237));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


