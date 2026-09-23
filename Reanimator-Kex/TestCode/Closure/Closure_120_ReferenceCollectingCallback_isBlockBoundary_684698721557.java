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

public class ReferenceCollectingCallback_isBlockBoundary_684698721557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169759;
     Object term170032;

    public ReferenceCollectingCallback_isBlockBoundary_684698721557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169759 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term169759, term169759.getClass(), "type", 100);
        term170032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term170032, term170032.getClass(), "str", null);
        setIntField(term170032, term170032.getClass(), "type", 100);
        setField(term170032, term170032.getClass(), "next", null);
        setField(term170032, term170032.getClass(), "first", null);
        setField(term170032, term170032.getClass(), "last", null);
        setField(term170032, term170032.getClass(), "propListHead", null);
        setIntField(term170032, term170032.getClass(), "sourcePosition", 0);
        setField(term170032, term170032.getClass(), "jsType", null);
        setField(term170032, term170032.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term169759;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term169759, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


