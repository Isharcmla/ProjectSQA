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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412266;
     Object term412358;
     Object term412450;
     Object term412542;
     Object term412880;
     Object term412881;
     Object term412882;
     Object term412883;
     Object term412842;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412266 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term412358 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term412358, term412358.getClass(), "parent", null);
        setIntField(term412358, term412358.getClass(), "type", 0);
        term412450 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term412450, term412450.getClass(), "type", 0);
        term412542 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term412880 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term412880, term412880.getClass(), "currentTraversal", null);
        term412881 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term412881, term412881.getClass(), "str", null);
        setIntField(term412881, term412881.getClass(), "type", 0);
        setField(term412881, term412881.getClass(), "next", null);
        setField(term412881, term412881.getClass(), "first", null);
        setField(term412881, term412881.getClass(), "last", null);
        setField(term412881, term412881.getClass(), "propListHead", null);
        setIntField(term412881, term412881.getClass(), "sourcePosition", 0);
        setField(term412881, term412881.getClass(), "jsType", null);
        setField(term412881, term412881.getClass(), "parent", null);
        term412882 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term412882, term412882.getClass(), "str", null);
        setIntField(term412882, term412882.getClass(), "type", 0);
        setField(term412882, term412882.getClass(), "next", null);
        setField(term412882, term412882.getClass(), "first", null);
        setField(term412882, term412882.getClass(), "last", null);
        setField(term412882, term412882.getClass(), "propListHead", null);
        setIntField(term412882, term412882.getClass(), "sourcePosition", 0);
        setField(term412882, term412882.getClass(), "jsType", null);
        setField(term412882, term412882.getClass(), "parent", null);
        term412883 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term412883, term412883.getClass(), "str", null);
        setIntField(term412883, term412883.getClass(), "type", 0);
        setField(term412883, term412883.getClass(), "next", null);
        setField(term412883, term412883.getClass(), "first", null);
        setField(term412883, term412883.getClass(), "last", null);
        setField(term412883, term412883.getClass(), "propListHead", null);
        setIntField(term412883, term412883.getClass(), "sourcePosition", 0);
        setField(term412883, term412883.getClass(), "jsType", null);
        setField(term412883, term412883.getClass(), "parent", null);
        term412842 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term412842, term412842.getClass(), "str", null);
        setIntField(term412842, term412842.getClass(), "type", 0);
        setField(term412842, term412842.getClass(), "next", null);
        setField(term412842, term412842.getClass(), "first", null);
        setField(term412842, term412842.getClass(), "last", null);
        setField(term412842, term412842.getClass(), "propListHead", null);
        setIntField(term412842, term412842.getClass(), "sourcePosition", 0);
        setField(term412842, term412842.getClass(), "jsType", null);
        setField(term412842, term412842.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term412358;
        args[1] = term412450;
        args[2] = term412542;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term412266, args);
        assertTrue(recursiveEquals(term412266, term412880));
        assertTrue(recursiveEquals(term412358, term412881));
        assertTrue(recursiveEquals(term412450, term412882));
        assertTrue(recursiveEquals(term412542, term412883));
        assertTrue(recursiveEquals(retValue, term412842));
    }

};


