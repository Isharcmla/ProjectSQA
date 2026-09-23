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

public class ReferenceCollectingCallback_isBlockBoundary_684698721676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178932;
     Object term179024;
     Object term179037;
     Object term179038;

    public ReferenceCollectingCallback_isBlockBoundary_684698721676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178932 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term179024 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term179024, term179024.getClass(), "type", 12);
        term179037 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term179037, term179037.getClass(), "number", 0.0);
        setIntField(term179037, term179037.getClass(), "type", 12);
        setField(term179037, term179037.getClass(), "next", null);
        setField(term179037, term179037.getClass(), "first", null);
        setField(term179037, term179037.getClass(), "last", null);
        setField(term179037, term179037.getClass(), "propListHead", null);
        setIntField(term179037, term179037.getClass(), "sourcePosition", 0);
        setField(term179037, term179037.getClass(), "jsType", null);
        setField(term179037, term179037.getClass(), "parent", null);
        term179038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term179038, term179038.getClass(), "str", null);
        setIntField(term179038, term179038.getClass(), "type", 0);
        setField(term179038, term179038.getClass(), "next", null);
        setField(term179038, term179038.getClass(), "first", null);
        setField(term179038, term179038.getClass(), "last", null);
        setField(term179038, term179038.getClass(), "propListHead", null);
        setIntField(term179038, term179038.getClass(), "sourcePosition", 0);
        setField(term179038, term179038.getClass(), "jsType", null);
        setField(term179038, term179038.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term178932;
        args[1] = term179024;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term178932, term179037));
        assertTrue(recursiveEquals(term179024, term179038));
        assertTrue(recursiveEquals(retValue, false));
    }

};


