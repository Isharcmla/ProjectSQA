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

public class PeepholeFoldConstants_tryFoldComparison_8484431791396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343239;
     Object term343331;
     Object term343423;
     Object term343515;
     Object term343972;
     Object term343973;
     Object term343974;
     Object term343975;
     Object term343949;

    public PeepholeFoldConstants_tryFoldComparison_8484431791396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343239 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term343331 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term343331, term343331.getClass(), "type", 16);
        term343423 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term343423, term343423.getClass(), "type", 42);
        term343515 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term343515, term343515.getClass(), "type", 16);
        term343972 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term343972, term343972.getClass(), "currentTraversal", null);
        term343973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term343973, term343973.getClass(), "str", null);
        setIntField(term343973, term343973.getClass(), "type", 42);
        setField(term343973, term343973.getClass(), "next", null);
        setField(term343973, term343973.getClass(), "first", null);
        setField(term343973, term343973.getClass(), "last", null);
        setField(term343973, term343973.getClass(), "propListHead", null);
        setIntField(term343973, term343973.getClass(), "sourcePosition", 0);
        setField(term343973, term343973.getClass(), "jsType", null);
        setField(term343973, term343973.getClass(), "parent", null);
        term343974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term343974, term343974.getClass(), "str", null);
        setIntField(term343974, term343974.getClass(), "type", 16);
        setField(term343974, term343974.getClass(), "next", null);
        setField(term343974, term343974.getClass(), "first", null);
        setField(term343974, term343974.getClass(), "last", null);
        setField(term343974, term343974.getClass(), "propListHead", null);
        setIntField(term343974, term343974.getClass(), "sourcePosition", 0);
        setField(term343974, term343974.getClass(), "jsType", null);
        setField(term343974, term343974.getClass(), "parent", null);
        term343975 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term343975, term343975.getClass(), "str", null);
        setIntField(term343975, term343975.getClass(), "type", 16);
        setField(term343975, term343975.getClass(), "next", null);
        setField(term343975, term343975.getClass(), "first", null);
        setField(term343975, term343975.getClass(), "last", null);
        setField(term343975, term343975.getClass(), "propListHead", null);
        setIntField(term343975, term343975.getClass(), "sourcePosition", 0);
        setField(term343975, term343975.getClass(), "jsType", null);
        setField(term343975, term343975.getClass(), "parent", null);
        term343949 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term343949, term343949.getClass(), "str", null);
        setIntField(term343949, term343949.getClass(), "type", 16);
        setField(term343949, term343949.getClass(), "next", null);
        setField(term343949, term343949.getClass(), "first", null);
        setField(term343949, term343949.getClass(), "last", null);
        setField(term343949, term343949.getClass(), "propListHead", null);
        setIntField(term343949, term343949.getClass(), "sourcePosition", 0);
        setField(term343949, term343949.getClass(), "jsType", null);
        setField(term343949, term343949.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term343331;
        args[1] = term343423;
        args[2] = term343515;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term343239, args);
        assertTrue(recursiveEquals(term343239, term343972));
        assertTrue(recursiveEquals(term343331, term343973));
        assertTrue(recursiveEquals(term343423, term343974));
        assertTrue(recursiveEquals(term343515, term343975));
        assertTrue(recursiveEquals(retValue, term343949));
    }

};


