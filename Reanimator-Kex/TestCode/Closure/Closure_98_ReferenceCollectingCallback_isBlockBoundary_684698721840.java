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

public class ReferenceCollectingCallback_isBlockBoundary_684698721840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221816;
     Object term221908;
     Object term221920;
     Object term221921;

    public ReferenceCollectingCallback_isBlockBoundary_684698721840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221816 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term221816, term221816.getClass(), "type", 111);
        term221908 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term221908, term221908.getClass(), "type", 12);
        term221920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term221920, term221920.getClass(), "str", null);
        setIntField(term221920, term221920.getClass(), "type", 12);
        setField(term221920, term221920.getClass(), "next", null);
        setField(term221920, term221920.getClass(), "first", null);
        setField(term221920, term221920.getClass(), "last", null);
        setField(term221920, term221920.getClass(), "propListHead", null);
        setIntField(term221920, term221920.getClass(), "sourcePosition", 0);
        setField(term221920, term221920.getClass(), "jsType", null);
        setField(term221920, term221920.getClass(), "parent", null);
        term221921 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term221921, term221921.getClass(), "str", null);
        setIntField(term221921, term221921.getClass(), "type", 111);
        setField(term221921, term221921.getClass(), "next", null);
        setField(term221921, term221921.getClass(), "first", null);
        setField(term221921, term221921.getClass(), "last", null);
        setField(term221921, term221921.getClass(), "propListHead", null);
        setIntField(term221921, term221921.getClass(), "sourcePosition", 0);
        setField(term221921, term221921.getClass(), "jsType", null);
        setField(term221921, term221921.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term221816;
        args[1] = term221908;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term221816, term221920));
        assertTrue(recursiveEquals(term221908, term221921));
        assertTrue(recursiveEquals(retValue, true));
    }

};


