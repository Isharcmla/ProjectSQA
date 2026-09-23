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

public class ReferenceCollectingCallback_isBlockBoundary_684698721551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168274;
     Object term168344;
     Object term168431;
     Object term168433;

    public ReferenceCollectingCallback_isBlockBoundary_684698721551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term168344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term168344, term168344.getClass(), "type", 98);
        setField(term168344, term168344.getClass(), "first", term168414);
        term168431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term168431, term168431.getClass(), "type", 98);
        setField(term168431, term168431.getClass(), "next", null);
        setIntField(term168432, term168432.getClass(), "type", 0);
        setField(term168432, term168432.getClass(), "next", null);
        setField(term168432, term168432.getClass(), "first", null);
        setField(term168432, term168432.getClass(), "last", null);
        setField(term168432, term168432.getClass(), "propListHead", null);
        setIntField(term168432, term168432.getClass(), "sourcePosition", 0);
        setField(term168432, term168432.getClass(), "jsType", null);
        setField(term168432, term168432.getClass(), "parent", null);
        setField(term168431, term168431.getClass(), "first", term168432);
        setField(term168431, term168431.getClass(), "last", null);
        setField(term168431, term168431.getClass(), "propListHead", null);
        setIntField(term168431, term168431.getClass(), "sourcePosition", 0);
        setField(term168431, term168431.getClass(), "jsType", null);
        setField(term168431, term168431.getClass(), "parent", null);
        term168433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term168433, term168433.getClass(), "type", 0);
        setField(term168433, term168433.getClass(), "next", null);
        setField(term168433, term168433.getClass(), "first", null);
        setField(term168433, term168433.getClass(), "last", null);
        setField(term168433, term168433.getClass(), "propListHead", null);
        setIntField(term168433, term168433.getClass(), "sourcePosition", 0);
        setField(term168433, term168433.getClass(), "jsType", null);
        setField(term168433, term168433.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term168274;
        args[1] = term168344;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term168274, term168431));
        assertTrue(recursiveEquals(term168344, term168433));
        assertTrue(recursiveEquals(retValue, true));
    }

};


