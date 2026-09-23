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

public class ReferenceCollectingCallback_isBlockBoundary_684698721279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66079;
     Object term66149;
     Object term66461;
     Object term66463;

    public ReferenceCollectingCallback_isBlockBoundary_684698721279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term66149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66149, term66149.getClass(), "type", 108);
        setField(term66149, term66149.getClass(), "first", term66219);
        term66461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66461, term66461.getClass(), "type", 108);
        setField(term66461, term66461.getClass(), "next", null);
        setIntField(term66462, term66462.getClass(), "type", 0);
        setField(term66462, term66462.getClass(), "next", null);
        setField(term66462, term66462.getClass(), "first", null);
        setField(term66462, term66462.getClass(), "last", null);
        setField(term66462, term66462.getClass(), "propListHead", null);
        setIntField(term66462, term66462.getClass(), "sourcePosition", 0);
        setField(term66462, term66462.getClass(), "jsType", null);
        setField(term66462, term66462.getClass(), "parent", null);
        setField(term66461, term66461.getClass(), "first", term66462);
        setField(term66461, term66461.getClass(), "last", null);
        setField(term66461, term66461.getClass(), "propListHead", null);
        setIntField(term66461, term66461.getClass(), "sourcePosition", 0);
        setField(term66461, term66461.getClass(), "jsType", null);
        setField(term66461, term66461.getClass(), "parent", null);
        term66463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66463, term66463.getClass(), "type", 0);
        setField(term66463, term66463.getClass(), "next", null);
        setField(term66463, term66463.getClass(), "first", null);
        setField(term66463, term66463.getClass(), "last", null);
        setField(term66463, term66463.getClass(), "propListHead", null);
        setIntField(term66463, term66463.getClass(), "sourcePosition", 0);
        setField(term66463, term66463.getClass(), "jsType", null);
        setField(term66463, term66463.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term66079;
        args[1] = term66149;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term66079, term66461));
        assertTrue(recursiveEquals(term66149, term66463));
        assertTrue(recursiveEquals(retValue, true));
    }

};


