package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class DeadAssignmentsElimination_isVariableStillLiveWithinExpression_172036382740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8113;
     Object term8218;
     Object term8429;
     Object term8430;
     Object term8431;

    public DeadAssignmentsElimination_isVariableStillLiveWithinExpression_172036382740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8113 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term8218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term8429 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        setField(term8429, term8429.getClass(), "compiler", null);
        setField(term8429, term8429.getClass(), "liveness", null);
        term8430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8430, term8430.getClass(), "type", 0);
        setField(term8430, term8430.getClass(), "next", null);
        setField(term8430, term8430.getClass(), "first", null);
        setField(term8430, term8430.getClass(), "last", null);
        setField(term8430, term8430.getClass(), "propListHead", null);
        setIntField(term8430, term8430.getClass(), "sourcePosition", 0);
        setField(term8430, term8430.getClass(), "jsType", null);
        setField(term8430, term8430.getClass(), "parent", null);
        term8431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8431, term8431.getClass(), "type", 0);
        setField(term8431, term8431.getClass(), "next", null);
        setField(term8431, term8431.getClass(), "first", null);
        setField(term8431, term8431.getClass(), "last", null);
        setField(term8431, term8431.getClass(), "propListHead", null);
        setIntField(term8431, term8431.getClass(), "sourcePosition", 0);
        setField(term8431, term8431.getClass(), "jsType", null);
        setField(term8431, term8431.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term8218;
        args[1] = term8218;
        args[2] = null;
        Object retValue = callMethod(klass, "isVariableStillLiveWithinExpression", argTypes, term8113, args);
        assertTrue(recursiveEquals(term8113, term8429));
        assertTrue(recursiveEquals(term8218, term8430));
        assertTrue(recursiveEquals(term8218, term8431));
        assertTrue(recursiveEquals(retValue, false));
    }

};


