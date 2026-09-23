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
import java.lang.String;
import java.lang.Object;

public class DeadAssignmentsElimination_isVariableReadBeforeKill_177530494146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9042;
     Object term9134;
     Object term9645;
     Object term9646;
     Object enum2;

    public DeadAssignmentsElimination_isVariableReadBeforeKill_177530494146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9042 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term9134 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term9645 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        setField(term9645, term9645.getClass(), "compiler", null);
        setField(term9645, term9645.getClass(), "liveness", null);
        term9646 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term9646, term9646.getClass(), "number", 0.0);
        setIntField(term9646, term9646.getClass(), "type", 0);
        setField(term9646, term9646.getClass(), "next", null);
        setField(term9646, term9646.getClass(), "first", null);
        setField(term9646, term9646.getClass(), "last", null);
        setField(term9646, term9646.getClass(), "propListHead", null);
        setIntField(term9646, term9646.getClass(), "sourcePosition", 0);
        setField(term9646, term9646.getClass(), "jsType", null);
        setField(term9646, term9646.getClass(), "parent", null);
        Class<? extends Object> term9648 = Class.forName((String) "com.google.javascript.jscomp.DeadAssignmentsElimination$VariableLiveness");
        Field term9647 = ((Class) term9648).getDeclaredField((String) "MAYBE_LIVE");
        ((Field) term9647).setAccessible(true);
        enum2 = ((Field) term9647).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term9134;
        args[1] = null;
        Object retValue = callMethod(klass, "isVariableReadBeforeKill", argTypes, term9042, args);
        assertTrue(recursiveEquals(term9042, term9645));
        assertTrue(recursiveEquals(term9134, term9646));
        assertTrue(recursiveEquals(retValue, enum2));
    }

};


