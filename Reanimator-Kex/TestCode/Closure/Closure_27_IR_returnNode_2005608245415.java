package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_returnNode_2005608245415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59235;
     Object term59573;
     Object term59497;

    public IR_returnNode_2005608245415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59235, term59235.getClass(), "type", 92);
        term59573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59573, term59573.getClass(), "type", 92);
        setField(term59573, term59573.getClass(), "next", null);
        setField(term59573, term59573.getClass(), "first", null);
        setField(term59573, term59573.getClass(), "last", null);
        setField(term59573, term59573.getClass(), "propListHead", null);
        setIntField(term59573, term59573.getClass(), "sourcePosition", 0);
        setField(term59573, term59573.getClass(), "jsType", null);
        setIntField(term59574, term59574.getClass(), "type", 4);
        setField(term59574, term59574.getClass(), "next", null);
        setField(term59574, term59574.getClass(), "first", term59573);
        setField(term59574, term59574.getClass(), "last", term59573);
        setField(term59574, term59574.getClass(), "propListHead", null);
        setIntField(term59574, term59574.getClass(), "sourcePosition", -1);
        setField(term59574, term59574.getClass(), "jsType", null);
        setField(term59574, term59574.getClass(), "parent", null);
        setField(term59573, term59573.getClass(), "parent", term59574);
        term59497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59497, term59497.getClass(), "type", 4);
        setField(term59497, term59497.getClass(), "next", null);
        setIntField(term59494, term59494.getClass(), "type", 92);
        setField(term59494, term59494.getClass(), "next", null);
        setField(term59494, term59494.getClass(), "first", null);
        setField(term59494, term59494.getClass(), "last", null);
        setField(term59494, term59494.getClass(), "propListHead", null);
        setIntField(term59494, term59494.getClass(), "sourcePosition", 0);
        setField(term59494, term59494.getClass(), "jsType", null);
        setField(term59494, term59494.getClass(), "parent", term59497);
        setField(term59497, term59497.getClass(), "first", term59494);
        setField(term59497, term59497.getClass(), "last", term59494);
        setField(term59497, term59497.getClass(), "propListHead", null);
        setIntField(term59497, term59497.getClass(), "sourcePosition", -1);
        setField(term59497, term59497.getClass(), "jsType", null);
        setField(term59497, term59497.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term59235;
        Object retValue = callMethod(klass, "returnNode", argTypes, null, args);
        assertTrue(recursiveEquals(term59235, term59573));
        assertTrue(recursiveEquals(retValue, term59497));
    }

};


