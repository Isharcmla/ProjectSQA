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

public class PeepholeFoldConstants_tryFoldLeftChildAdd_1163340824109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19005;
     Object term19075;
     Object term19274;
     Object term19275;

    public PeepholeFoldConstants_tryFoldLeftChildAdd_1163340824109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19005 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term19075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term19274 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term19274, term19274.getClass(), "currentTraversal", null);
        term19275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19275, term19275.getClass(), "type", 0);
        setField(term19275, term19275.getClass(), "next", null);
        setField(term19275, term19275.getClass(), "first", null);
        setField(term19275, term19275.getClass(), "last", null);
        setField(term19275, term19275.getClass(), "propListHead", null);
        setIntField(term19275, term19275.getClass(), "sourcePosition", 0);
        setField(term19275, term19275.getClass(), "jsType", null);
        setField(term19275, term19275.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term19075;
        Object retValue = callMethod(klass, "tryFoldLeftChildAdd", argTypes, term19005, args);
        assertTrue(recursiveEquals(term19005, term19274));
        assertTrue(recursiveEquals(term19075, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


