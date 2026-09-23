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

public class SimplexTableau_equals_619292072147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82208;
     Object term82332;
     Object term82399;
     Object term82400;

    public SimplexTableau_equals_619292072147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82208 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term82208, term82208.getClass(), "restrictToNonNegative", false);
        setIntField(term82208, term82208.getClass(), "numDecisionVariables", 0);
        setIntField(term82208, term82208.getClass(), "numSlackVariables", -1);
        term82332 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term82332, term82332.getClass(), "restrictToNonNegative", false);
        setIntField(term82332, term82332.getClass(), "numDecisionVariables", 0);
        setIntField(term82332, term82332.getClass(), "numSlackVariables", 0);
        term82399 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term82399, term82399.getClass(), "f", null);
        setField(term82399, term82399.getClass(), "constraints", null);
        setBooleanField(term82399, term82399.getClass(), "restrictToNonNegative", false);
        setField(term82399, term82399.getClass(), "columnLabels", null);
        setField(term82399, term82399.getClass(), "tableau", null);
        setIntField(term82399, term82399.getClass(), "numDecisionVariables", 0);
        setIntField(term82399, term82399.getClass(), "numSlackVariables", -1);
        setIntField(term82399, term82399.getClass(), "numArtificialVariables", 0);
        setDoubleField(term82399, term82399.getClass(), "epsilon", 0.0);
        setIntField(term82399, term82399.getClass(), "maxUlps", 0);
        term82400 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term82400, term82400.getClass(), "f", null);
        setField(term82400, term82400.getClass(), "constraints", null);
        setBooleanField(term82400, term82400.getClass(), "restrictToNonNegative", false);
        setField(term82400, term82400.getClass(), "columnLabels", null);
        setField(term82400, term82400.getClass(), "tableau", null);
        setIntField(term82400, term82400.getClass(), "numDecisionVariables", 0);
        setIntField(term82400, term82400.getClass(), "numSlackVariables", 0);
        setIntField(term82400, term82400.getClass(), "numArtificialVariables", 0);
        setDoubleField(term82400, term82400.getClass(), "epsilon", 0.0);
        setIntField(term82400, term82400.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term82332;
        Object retValue = callMethod(klass, "equals", argTypes, term82208, args);
        assertTrue(recursiveEquals(term82208, term82399));
        assertTrue(recursiveEquals(term82332, term82400));
        assertTrue(recursiveEquals(retValue, false));
    }

};


