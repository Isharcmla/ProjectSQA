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

public class PeepholeFoldConstants_tryFoldComparison_848443179990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231580;
     Object term231672;
     Object term231764;
     Object term231856;
     Object term231889;
     Object term231890;
     Object term231891;
     Object term231892;
     Object term231867;

    public PeepholeFoldConstants_tryFoldComparison_848443179990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231580 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term231672 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term231672, term231672.getClass(), "type", 14);
        term231764 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term231764, term231764.getClass(), "type", 14);
        term231856 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term231889 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term231889, term231889.getClass(), "currentTraversal", null);
        term231890 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term231890, term231890.getClass(), "number", 0.0);
        setIntField(term231890, term231890.getClass(), "type", 14);
        setField(term231890, term231890.getClass(), "next", null);
        setField(term231890, term231890.getClass(), "first", null);
        setField(term231890, term231890.getClass(), "last", null);
        setField(term231890, term231890.getClass(), "propListHead", null);
        setIntField(term231890, term231890.getClass(), "sourcePosition", 0);
        setField(term231890, term231890.getClass(), "jsType", null);
        setField(term231890, term231890.getClass(), "parent", null);
        term231891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term231891, term231891.getClass(), "number", 0.0);
        setIntField(term231891, term231891.getClass(), "type", 14);
        setField(term231891, term231891.getClass(), "next", null);
        setField(term231891, term231891.getClass(), "first", null);
        setField(term231891, term231891.getClass(), "last", null);
        setField(term231891, term231891.getClass(), "propListHead", null);
        setIntField(term231891, term231891.getClass(), "sourcePosition", 0);
        setField(term231891, term231891.getClass(), "jsType", null);
        setField(term231891, term231891.getClass(), "parent", null);
        term231892 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term231892, term231892.getClass(), "number", 0.0);
        setIntField(term231892, term231892.getClass(), "type", 0);
        setField(term231892, term231892.getClass(), "next", null);
        setField(term231892, term231892.getClass(), "first", null);
        setField(term231892, term231892.getClass(), "last", null);
        setField(term231892, term231892.getClass(), "propListHead", null);
        setIntField(term231892, term231892.getClass(), "sourcePosition", 0);
        setField(term231892, term231892.getClass(), "jsType", null);
        setField(term231892, term231892.getClass(), "parent", null);
        term231867 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term231867, term231867.getClass(), "number", 0.0);
        setIntField(term231867, term231867.getClass(), "type", 14);
        setField(term231867, term231867.getClass(), "next", null);
        setField(term231867, term231867.getClass(), "first", null);
        setField(term231867, term231867.getClass(), "last", null);
        setField(term231867, term231867.getClass(), "propListHead", null);
        setIntField(term231867, term231867.getClass(), "sourcePosition", 0);
        setField(term231867, term231867.getClass(), "jsType", null);
        setField(term231867, term231867.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term231672;
        args[1] = term231764;
        args[2] = term231856;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term231580, args);
        assertTrue(recursiveEquals(term231580, term231889));
        assertTrue(recursiveEquals(term231672, term231890));
        assertTrue(recursiveEquals(term231764, term231891));
        assertTrue(recursiveEquals(term231856, term231892));
        assertTrue(recursiveEquals(retValue, term231867));
    }

};


