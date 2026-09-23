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

public class PeepholeFoldConstants_tryFoldComparison_8484431792382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661547;
     Object term661639;
     Object term661731;
     Object term661823;
     Object term661867;
     Object term661868;
     Object term661869;
     Object term661870;
     Object term661846;

    public PeepholeFoldConstants_tryFoldComparison_8484431792382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term661547 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term661639 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term661639, term661639.getClass(), "type", 14);
        term661731 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term661731, term661731.getClass(), "type", 14);
        term661823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term661867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term661867, term661867.getClass(), "currentTraversal", null);
        term661868 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term661868, term661868.getClass(), "number", 0.0);
        setIntField(term661868, term661868.getClass(), "type", 14);
        setField(term661868, term661868.getClass(), "next", null);
        setField(term661868, term661868.getClass(), "first", null);
        setField(term661868, term661868.getClass(), "last", null);
        setField(term661868, term661868.getClass(), "propListHead", null);
        setIntField(term661868, term661868.getClass(), "sourcePosition", 0);
        setField(term661868, term661868.getClass(), "jsType", null);
        setField(term661868, term661868.getClass(), "parent", null);
        term661869 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term661869, term661869.getClass(), "number", 0.0);
        setIntField(term661869, term661869.getClass(), "type", 14);
        setField(term661869, term661869.getClass(), "next", null);
        setField(term661869, term661869.getClass(), "first", null);
        setField(term661869, term661869.getClass(), "last", null);
        setField(term661869, term661869.getClass(), "propListHead", null);
        setIntField(term661869, term661869.getClass(), "sourcePosition", 0);
        setField(term661869, term661869.getClass(), "jsType", null);
        setField(term661869, term661869.getClass(), "parent", null);
        term661870 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term661870, term661870.getClass(), "str", null);
        setIntField(term661870, term661870.getClass(), "type", 0);
        setField(term661870, term661870.getClass(), "next", null);
        setField(term661870, term661870.getClass(), "first", null);
        setField(term661870, term661870.getClass(), "last", null);
        setField(term661870, term661870.getClass(), "propListHead", null);
        setIntField(term661870, term661870.getClass(), "sourcePosition", 0);
        setField(term661870, term661870.getClass(), "jsType", null);
        setField(term661870, term661870.getClass(), "parent", null);
        term661846 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term661846, term661846.getClass(), "number", 0.0);
        setIntField(term661846, term661846.getClass(), "type", 14);
        setField(term661846, term661846.getClass(), "next", null);
        setField(term661846, term661846.getClass(), "first", null);
        setField(term661846, term661846.getClass(), "last", null);
        setField(term661846, term661846.getClass(), "propListHead", null);
        setIntField(term661846, term661846.getClass(), "sourcePosition", 0);
        setField(term661846, term661846.getClass(), "jsType", null);
        setField(term661846, term661846.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term661639;
        args[1] = term661731;
        args[2] = term661823;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term661547, args);
        assertTrue(recursiveEquals(term661547, term661867));
        assertTrue(recursiveEquals(term661639, term661868));
        assertTrue(recursiveEquals(term661731, term661869));
        assertTrue(recursiveEquals(term661823, term661870));
        assertTrue(recursiveEquals(retValue, term661846));
    }

};


