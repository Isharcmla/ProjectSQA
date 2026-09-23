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

public class PeepholeFoldConstants_optimizeSubtree_1606506993149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24324;
     Object term24394;
     Object term24417;
     Object term24418;
     Object term24408;

    public PeepholeFoldConstants_optimizeSubtree_1606506993149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24324 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term24394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24394, term24394.getClass(), "type", 50);
        term24417 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term24417, term24417.getClass(), "currentTraversal", null);
        term24418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24418, term24418.getClass(), "type", 50);
        setField(term24418, term24418.getClass(), "next", null);
        setField(term24418, term24418.getClass(), "first", null);
        setField(term24418, term24418.getClass(), "last", null);
        setField(term24418, term24418.getClass(), "propListHead", null);
        setIntField(term24418, term24418.getClass(), "sourcePosition", 0);
        setField(term24418, term24418.getClass(), "jsType", null);
        setField(term24418, term24418.getClass(), "parent", null);
        term24408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24408, term24408.getClass(), "type", 50);
        setField(term24408, term24408.getClass(), "next", null);
        setField(term24408, term24408.getClass(), "first", null);
        setField(term24408, term24408.getClass(), "last", null);
        setField(term24408, term24408.getClass(), "propListHead", null);
        setIntField(term24408, term24408.getClass(), "sourcePosition", 0);
        setField(term24408, term24408.getClass(), "jsType", null);
        setField(term24408, term24408.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24394;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term24324, args);
        assertTrue(recursiveEquals(term24324, term24417));
        assertTrue(recursiveEquals(term24394, term24418));
        assertTrue(recursiveEquals(retValue, term24408));
    }

};


