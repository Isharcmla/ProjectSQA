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

public class PeepholeFoldConstants_tryFoldAndOr_42587029066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11420;
     Object term11558;
     Object term11650;
     Object term11710;
     Object term11711;
     Object term11712;
     Object term11713;
     Object term11675;

    public PeepholeFoldConstants_tryFoldAndOr_42587029066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11420 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term11558 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11558, term11558.getClass(), "parent", null);
        setIntField(term11558, term11558.getClass(), "type", 0);
        term11650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term11710 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term11710, term11710.getClass(), "currentTraversal", null);
        term11711 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11711, term11711.getClass(), "str", null);
        setIntField(term11711, term11711.getClass(), "type", 0);
        setField(term11711, term11711.getClass(), "next", null);
        setField(term11711, term11711.getClass(), "first", null);
        setField(term11711, term11711.getClass(), "last", null);
        setField(term11711, term11711.getClass(), "propListHead", null);
        setIntField(term11711, term11711.getClass(), "sourcePosition", 0);
        setField(term11711, term11711.getClass(), "jsType", null);
        setField(term11711, term11711.getClass(), "parent", null);
        term11712 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11712, term11712.getClass(), "str", null);
        setIntField(term11712, term11712.getClass(), "type", 0);
        setField(term11712, term11712.getClass(), "next", null);
        setField(term11712, term11712.getClass(), "first", null);
        setField(term11712, term11712.getClass(), "last", null);
        setField(term11712, term11712.getClass(), "propListHead", null);
        setIntField(term11712, term11712.getClass(), "sourcePosition", 0);
        setField(term11712, term11712.getClass(), "jsType", null);
        setField(term11712, term11712.getClass(), "parent", null);
        term11713 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11713, term11713.getClass(), "str", null);
        setIntField(term11713, term11713.getClass(), "type", 0);
        setField(term11713, term11713.getClass(), "next", null);
        setField(term11713, term11713.getClass(), "first", null);
        setField(term11713, term11713.getClass(), "last", null);
        setField(term11713, term11713.getClass(), "propListHead", null);
        setIntField(term11713, term11713.getClass(), "sourcePosition", 0);
        setField(term11713, term11713.getClass(), "jsType", null);
        setField(term11713, term11713.getClass(), "parent", null);
        term11675 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11675, term11675.getClass(), "str", null);
        setIntField(term11675, term11675.getClass(), "type", 0);
        setField(term11675, term11675.getClass(), "next", null);
        setField(term11675, term11675.getClass(), "first", null);
        setField(term11675, term11675.getClass(), "last", null);
        setField(term11675, term11675.getClass(), "propListHead", null);
        setIntField(term11675, term11675.getClass(), "sourcePosition", 0);
        setField(term11675, term11675.getClass(), "jsType", null);
        setField(term11675, term11675.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term11558;
        args[1] = term11558;
        args[2] = term11650;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term11420, args);
        assertTrue(recursiveEquals(term11420, term11710));
        assertTrue(recursiveEquals(term11558, term11711));
        assertTrue(recursiveEquals(term11558, term11712));
        assertTrue(recursiveEquals(term11650, term11713));
        assertTrue(recursiveEquals(retValue, term11675));
    }

};


