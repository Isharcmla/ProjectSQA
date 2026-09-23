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

public class SimplexTableau_equals_1450061279160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98278;
     Object term98400;
     Object term98418;
     Object term98419;

    public SimplexTableau_equals_1450061279160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98278 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term98278, term98278.getClass(), "restrictToNonNegative", false);
        setIntField(term98278, term98278.getClass(), "numDecisionVariables", 497361705);
        term98400 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term98400, term98400.getClass(), "restrictToNonNegative", false);
        setIntField(term98400, term98400.getClass(), "numDecisionVariables", -2147483518);
        term98418 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term98418, term98418.getClass(), "f", null);
        setField(term98418, term98418.getClass(), "constraints", null);
        setBooleanField(term98418, term98418.getClass(), "restrictToNonNegative", false);
        setField(term98418, term98418.getClass(), "tableau", null);
        setIntField(term98418, term98418.getClass(), "numDecisionVariables", 497361705);
        setIntField(term98418, term98418.getClass(), "numSlackVariables", 0);
        setIntField(term98418, term98418.getClass(), "numArtificialVariables", 0);
        setDoubleField(term98418, term98418.getClass(), "epsilon", 0.0);
        term98419 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term98419, term98419.getClass(), "f", null);
        setField(term98419, term98419.getClass(), "constraints", null);
        setBooleanField(term98419, term98419.getClass(), "restrictToNonNegative", false);
        setField(term98419, term98419.getClass(), "tableau", null);
        setIntField(term98419, term98419.getClass(), "numDecisionVariables", -2147483518);
        setIntField(term98419, term98419.getClass(), "numSlackVariables", 0);
        setIntField(term98419, term98419.getClass(), "numArtificialVariables", 0);
        setDoubleField(term98419, term98419.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term98400;
        Object retValue = callMethod(klass, "equals", argTypes, term98278, args);
        assertTrue(recursiveEquals(term98278, term98418));
        assertTrue(recursiveEquals(term98400, term98419));
        assertTrue(recursiveEquals(retValue, false));
    }

};


