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

public class SimplexTableau_equals_1450061279134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81088;
     Object term81210;
     Object term81227;
     Object term81228;

    public SimplexTableau_equals_1450061279134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81088 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term81088, term81088.getClass(), "restrictToNonNegative", false);
        term81210 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term81210, term81210.getClass(), "restrictToNonNegative", true);
        term81227 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term81227, term81227.getClass(), "f", null);
        setField(term81227, term81227.getClass(), "constraints", null);
        setBooleanField(term81227, term81227.getClass(), "restrictToNonNegative", false);
        setField(term81227, term81227.getClass(), "tableau", null);
        setIntField(term81227, term81227.getClass(), "numDecisionVariables", 0);
        setIntField(term81227, term81227.getClass(), "numSlackVariables", 0);
        setIntField(term81227, term81227.getClass(), "numArtificialVariables", 0);
        setDoubleField(term81227, term81227.getClass(), "epsilon", 0.0);
        term81228 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term81228, term81228.getClass(), "f", null);
        setField(term81228, term81228.getClass(), "constraints", null);
        setBooleanField(term81228, term81228.getClass(), "restrictToNonNegative", true);
        setField(term81228, term81228.getClass(), "tableau", null);
        setIntField(term81228, term81228.getClass(), "numDecisionVariables", 0);
        setIntField(term81228, term81228.getClass(), "numSlackVariables", 0);
        setIntField(term81228, term81228.getClass(), "numArtificialVariables", 0);
        setDoubleField(term81228, term81228.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term81210;
        Object retValue = callMethod(klass, "equals", argTypes, term81088, args);
        assertTrue(recursiveEquals(term81088, term81227));
        assertTrue(recursiveEquals(term81210, term81228));
        assertTrue(recursiveEquals(retValue, false));
    }

};


