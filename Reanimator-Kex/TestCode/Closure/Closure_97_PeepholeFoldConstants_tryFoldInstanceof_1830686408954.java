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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282602;
     Object term282694;
     Object term282786;
     Object term304434;
     Object term304435;
     Object term304436;
     Object term304413;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282602 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term282694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term282694, term282694.getClass(), "type", 52);
        term282786 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term304434 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term304434, term304434.getClass(), "currentTraversal", null);
        term304435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term304435, term304435.getClass(), "number", 0.0);
        setIntField(term304435, term304435.getClass(), "type", 52);
        setField(term304435, term304435.getClass(), "next", null);
        setField(term304435, term304435.getClass(), "first", null);
        setField(term304435, term304435.getClass(), "last", null);
        setField(term304435, term304435.getClass(), "propListHead", null);
        setIntField(term304435, term304435.getClass(), "sourcePosition", 0);
        setField(term304435, term304435.getClass(), "jsType", null);
        setField(term304435, term304435.getClass(), "parent", null);
        term304436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term304436, term304436.getClass(), "number", 0.0);
        setIntField(term304436, term304436.getClass(), "type", 0);
        setField(term304436, term304436.getClass(), "next", null);
        setField(term304436, term304436.getClass(), "first", null);
        setField(term304436, term304436.getClass(), "last", null);
        setField(term304436, term304436.getClass(), "propListHead", null);
        setIntField(term304436, term304436.getClass(), "sourcePosition", 0);
        setField(term304436, term304436.getClass(), "jsType", null);
        setField(term304436, term304436.getClass(), "parent", null);
        term304413 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term304413, term304413.getClass(), "number", 0.0);
        setIntField(term304413, term304413.getClass(), "type", 52);
        setField(term304413, term304413.getClass(), "next", null);
        setField(term304413, term304413.getClass(), "first", null);
        setField(term304413, term304413.getClass(), "last", null);
        setField(term304413, term304413.getClass(), "propListHead", null);
        setIntField(term304413, term304413.getClass(), "sourcePosition", 0);
        setField(term304413, term304413.getClass(), "jsType", null);
        setField(term304413, term304413.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term282694;
        args[1] = term282786;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term282602, args);
        assertTrue(recursiveEquals(term282602, term304434));
        assertTrue(recursiveEquals(term282694, term304435));
        assertTrue(recursiveEquals(term282786, term304436));
        assertTrue(recursiveEquals(retValue, term304413));
    }

};


