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

public class SimplexTableau_equals_1450061279150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96192;
     Object term96314;
     Object term96333;
     Object term96334;

    public SimplexTableau_equals_1450061279150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96192 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term96192, term96192.getClass(), "restrictToNonNegative", false);
        setIntField(term96192, term96192.getClass(), "numDecisionVariables", 0);
        setIntField(term96192, term96192.getClass(), "numSlackVariables", 497361705);
        term96314 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term96314, term96314.getClass(), "restrictToNonNegative", false);
        setIntField(term96314, term96314.getClass(), "numDecisionVariables", 0);
        setIntField(term96314, term96314.getClass(), "numSlackVariables", -2147483518);
        term96333 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term96333, term96333.getClass(), "f", null);
        setField(term96333, term96333.getClass(), "constraints", null);
        setBooleanField(term96333, term96333.getClass(), "restrictToNonNegative", false);
        setField(term96333, term96333.getClass(), "tableau", null);
        setIntField(term96333, term96333.getClass(), "numDecisionVariables", 0);
        setIntField(term96333, term96333.getClass(), "numSlackVariables", 497361705);
        setIntField(term96333, term96333.getClass(), "numArtificialVariables", 0);
        setDoubleField(term96333, term96333.getClass(), "epsilon", 0.0);
        term96334 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term96334, term96334.getClass(), "f", null);
        setField(term96334, term96334.getClass(), "constraints", null);
        setBooleanField(term96334, term96334.getClass(), "restrictToNonNegative", false);
        setField(term96334, term96334.getClass(), "tableau", null);
        setIntField(term96334, term96334.getClass(), "numDecisionVariables", 0);
        setIntField(term96334, term96334.getClass(), "numSlackVariables", -2147483518);
        setIntField(term96334, term96334.getClass(), "numArtificialVariables", 0);
        setDoubleField(term96334, term96334.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term96314;
        Object retValue = callMethod(klass, "equals", argTypes, term96192, args);
        assertTrue(recursiveEquals(term96192, term96333));
        assertTrue(recursiveEquals(term96314, term96334));
        assertTrue(recursiveEquals(retValue, false));
    }

};


