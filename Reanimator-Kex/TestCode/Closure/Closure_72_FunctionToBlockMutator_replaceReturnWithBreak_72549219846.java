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
import java.lang.Object;

public class FunctionToBlockMutator_replaceReturnWithBreak_72549219846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5435;
     Object term14630;
     Object term14596;

    public FunctionToBlockMutator_replaceReturnWithBreak_72549219846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5527 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term5435, term5435.getClass(), "type", 0);
        setField(term5435, term5435.getClass(), "first", term5527);
        term14630 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term14631 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term14630, term14630.getClass(), "number", 0.0);
        setIntField(term14630, term14630.getClass(), "type", 0);
        setField(term14630, term14630.getClass(), "next", null);
        setDoubleField(term14631, term14631.getClass(), "number", 0.0);
        setIntField(term14631, term14631.getClass(), "type", 0);
        setField(term14631, term14631.getClass(), "next", null);
        setField(term14631, term14631.getClass(), "first", null);
        setField(term14631, term14631.getClass(), "last", null);
        setField(term14631, term14631.getClass(), "propListHead", null);
        setIntField(term14631, term14631.getClass(), "sourcePosition", 0);
        setField(term14631, term14631.getClass(), "jsType", null);
        setField(term14631, term14631.getClass(), "parent", null);
        setField(term14630, term14630.getClass(), "first", term14631);
        setField(term14630, term14630.getClass(), "last", null);
        setField(term14630, term14630.getClass(), "propListHead", null);
        setIntField(term14630, term14630.getClass(), "sourcePosition", 0);
        setField(term14630, term14630.getClass(), "jsType", null);
        setField(term14630, term14630.getClass(), "parent", null);
        term14596 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term14599 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term14596, term14596.getClass(), "number", 0.0);
        setIntField(term14596, term14596.getClass(), "type", 0);
        setField(term14596, term14596.getClass(), "next", null);
        setDoubleField(term14599, term14599.getClass(), "number", 0.0);
        setIntField(term14599, term14599.getClass(), "type", 0);
        setField(term14599, term14599.getClass(), "next", null);
        setField(term14599, term14599.getClass(), "first", null);
        setField(term14599, term14599.getClass(), "last", null);
        setField(term14599, term14599.getClass(), "propListHead", null);
        setIntField(term14599, term14599.getClass(), "sourcePosition", 0);
        setField(term14599, term14599.getClass(), "jsType", null);
        setField(term14599, term14599.getClass(), "parent", null);
        setField(term14596, term14596.getClass(), "first", term14599);
        setField(term14596, term14596.getClass(), "last", null);
        setField(term14596, term14596.getClass(), "propListHead", null);
        setIntField(term14596, term14596.getClass(), "sourcePosition", 0);
        setField(term14596, term14596.getClass(), "jsType", null);
        setField(term14596, term14596.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term5435;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object retValue = callMethod(klass, "replaceReturnWithBreak", argTypes, null, args);
        assertTrue(recursiveEquals(term5435, term14630));
        assertTrue(recursiveEquals(retValue, term14596));
    }

};


