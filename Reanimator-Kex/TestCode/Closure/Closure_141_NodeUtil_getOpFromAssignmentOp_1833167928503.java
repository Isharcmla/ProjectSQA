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

public class NodeUtil_getOpFromAssignmentOp_1833167928503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42023;
     Object term42029;

    public NodeUtil_getOpFromAssignmentOp_1833167928503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42023, term42023.getClass(), "type", 94);
        term42029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42029, term42029.getClass(), "type", 94);
        setField(term42029, term42029.getClass(), "next", null);
        setField(term42029, term42029.getClass(), "first", null);
        setField(term42029, term42029.getClass(), "last", null);
        setField(term42029, term42029.getClass(), "propListHead", null);
        setIntField(term42029, term42029.getClass(), "sourcePosition", 0);
        setField(term42029, term42029.getClass(), "jsType", null);
        setField(term42029, term42029.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42023;
        Object retValue = callMethod(klass, "getOpFromAssignmentOp", argTypes, null, args);
        assertTrue(recursiveEquals(term42023, term42029));
        assertTrue(recursiveEquals(retValue, 22));
    }

};


