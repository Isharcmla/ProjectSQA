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

public class ReferenceCollectingCallback_isBlockBoundary_684698721792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210739;
     Object term210809;
     Object term211211;
     Object term211213;

    public ReferenceCollectingCallback_isBlockBoundary_684698721792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term210809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term210809, term210809.getClass(), "type", 98);
        setField(term210809, term210809.getClass(), "first", term210879);
        term211211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term211211, term211211.getClass(), "type", 98);
        setField(term211211, term211211.getClass(), "next", null);
        setIntField(term211212, term211212.getClass(), "type", 0);
        setField(term211212, term211212.getClass(), "next", null);
        setField(term211212, term211212.getClass(), "first", null);
        setField(term211212, term211212.getClass(), "last", null);
        setField(term211212, term211212.getClass(), "propListHead", null);
        setIntField(term211212, term211212.getClass(), "sourcePosition", 0);
        setField(term211212, term211212.getClass(), "jsType", null);
        setField(term211212, term211212.getClass(), "parent", null);
        setField(term211211, term211211.getClass(), "first", term211212);
        setField(term211211, term211211.getClass(), "last", null);
        setField(term211211, term211211.getClass(), "propListHead", null);
        setIntField(term211211, term211211.getClass(), "sourcePosition", 0);
        setField(term211211, term211211.getClass(), "jsType", null);
        setField(term211211, term211211.getClass(), "parent", null);
        term211213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term211213, term211213.getClass(), "type", 0);
        setField(term211213, term211213.getClass(), "next", null);
        setField(term211213, term211213.getClass(), "first", null);
        setField(term211213, term211213.getClass(), "last", null);
        setField(term211213, term211213.getClass(), "propListHead", null);
        setIntField(term211213, term211213.getClass(), "sourcePosition", 0);
        setField(term211213, term211213.getClass(), "jsType", null);
        setField(term211213, term211213.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term210739;
        args[1] = term210809;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term210739, term211211));
        assertTrue(recursiveEquals(term210809, term211213));
        assertTrue(recursiveEquals(retValue, true));
    }

};


