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

public class ReferenceCollectingCallback_isBlockBoundary_684698721409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97069;
     Object term97161;
     Object term97310;
     Object term97312;

    public ReferenceCollectingCallback_isBlockBoundary_684698721409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97069 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term97161 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97253 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term97161, term97161.getClass(), "type", 108);
        setField(term97161, term97161.getClass(), "first", term97253);
        term97310 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97311 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term97310, term97310.getClass(), "number", 0.0);
        setIntField(term97310, term97310.getClass(), "type", 108);
        setField(term97310, term97310.getClass(), "next", null);
        setDoubleField(term97311, term97311.getClass(), "number", 0.0);
        setIntField(term97311, term97311.getClass(), "type", 0);
        setField(term97311, term97311.getClass(), "next", null);
        setField(term97311, term97311.getClass(), "first", null);
        setField(term97311, term97311.getClass(), "last", null);
        setField(term97311, term97311.getClass(), "propListHead", null);
        setIntField(term97311, term97311.getClass(), "sourcePosition", 0);
        setField(term97311, term97311.getClass(), "jsType", null);
        setField(term97311, term97311.getClass(), "parent", null);
        setField(term97310, term97310.getClass(), "first", term97311);
        setField(term97310, term97310.getClass(), "last", null);
        setField(term97310, term97310.getClass(), "propListHead", null);
        setIntField(term97310, term97310.getClass(), "sourcePosition", 0);
        setField(term97310, term97310.getClass(), "jsType", null);
        setField(term97310, term97310.getClass(), "parent", null);
        term97312 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term97312, term97312.getClass(), "number", 0.0);
        setIntField(term97312, term97312.getClass(), "type", 0);
        setField(term97312, term97312.getClass(), "next", null);
        setField(term97312, term97312.getClass(), "first", null);
        setField(term97312, term97312.getClass(), "last", null);
        setField(term97312, term97312.getClass(), "propListHead", null);
        setIntField(term97312, term97312.getClass(), "sourcePosition", 0);
        setField(term97312, term97312.getClass(), "jsType", null);
        setField(term97312, term97312.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term97069;
        args[1] = term97161;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term97069, term97310));
        assertTrue(recursiveEquals(term97161, term97312));
        assertTrue(recursiveEquals(retValue, true));
    }

};


