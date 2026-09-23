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

public class SimplexTableau_equals_145006127995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68537;
     Object term71388;

    public SimplexTableau_equals_145006127995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68537 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        term71388 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term71388, term71388.getClass(), "f", null);
        setField(term71388, term71388.getClass(), "constraints", null);
        setBooleanField(term71388, term71388.getClass(), "restrictToNonNegative", false);
        setField(term71388, term71388.getClass(), "tableau", null);
        setIntField(term71388, term71388.getClass(), "numDecisionVariables", 0);
        setIntField(term71388, term71388.getClass(), "numSlackVariables", 0);
        setIntField(term71388, term71388.getClass(), "numArtificialVariables", 0);
        setDoubleField(term71388, term71388.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "equals", argTypes, term68537, args);
        assertTrue(recursiveEquals(term68537, term71388));
        assertTrue(recursiveEquals(retValue, false));
    }

};


