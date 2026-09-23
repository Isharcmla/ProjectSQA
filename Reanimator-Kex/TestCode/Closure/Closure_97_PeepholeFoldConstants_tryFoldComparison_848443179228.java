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

public class PeepholeFoldConstants_tryFoldComparison_848443179228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44941;
     Object term45033;
     Object term45125;
     Object term45217;
     Object term45333;
     Object term45334;
     Object term45335;
     Object term45336;
     Object term45311;

    public PeepholeFoldConstants_tryFoldComparison_848443179228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44941 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term45033 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term45033, term45033.getClass(), "type", 16);
        term45125 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term45125, term45125.getClass(), "type", 42);
        term45217 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term45217, term45217.getClass(), "type", 42);
        term45333 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term45333, term45333.getClass(), "currentTraversal", null);
        term45334 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term45334, term45334.getClass(), "number", 0.0);
        setIntField(term45334, term45334.getClass(), "type", 42);
        setField(term45334, term45334.getClass(), "next", null);
        setField(term45334, term45334.getClass(), "first", null);
        setField(term45334, term45334.getClass(), "last", null);
        setField(term45334, term45334.getClass(), "propListHead", null);
        setIntField(term45334, term45334.getClass(), "sourcePosition", 0);
        setField(term45334, term45334.getClass(), "jsType", null);
        setField(term45334, term45334.getClass(), "parent", null);
        term45335 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term45335, term45335.getClass(), "number", 0.0);
        setIntField(term45335, term45335.getClass(), "type", 16);
        setField(term45335, term45335.getClass(), "next", null);
        setField(term45335, term45335.getClass(), "first", null);
        setField(term45335, term45335.getClass(), "last", null);
        setField(term45335, term45335.getClass(), "propListHead", null);
        setIntField(term45335, term45335.getClass(), "sourcePosition", 0);
        setField(term45335, term45335.getClass(), "jsType", null);
        setField(term45335, term45335.getClass(), "parent", null);
        term45336 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term45336, term45336.getClass(), "number", 0.0);
        setIntField(term45336, term45336.getClass(), "type", 42);
        setField(term45336, term45336.getClass(), "next", null);
        setField(term45336, term45336.getClass(), "first", null);
        setField(term45336, term45336.getClass(), "last", null);
        setField(term45336, term45336.getClass(), "propListHead", null);
        setIntField(term45336, term45336.getClass(), "sourcePosition", 0);
        setField(term45336, term45336.getClass(), "jsType", null);
        setField(term45336, term45336.getClass(), "parent", null);
        term45311 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term45311, term45311.getClass(), "number", 0.0);
        setIntField(term45311, term45311.getClass(), "type", 16);
        setField(term45311, term45311.getClass(), "next", null);
        setField(term45311, term45311.getClass(), "first", null);
        setField(term45311, term45311.getClass(), "last", null);
        setField(term45311, term45311.getClass(), "propListHead", null);
        setIntField(term45311, term45311.getClass(), "sourcePosition", 0);
        setField(term45311, term45311.getClass(), "jsType", null);
        setField(term45311, term45311.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term45033;
        args[1] = term45125;
        args[2] = term45217;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term44941, args);
        assertTrue(recursiveEquals(term44941, term45333));
        assertTrue(recursiveEquals(term45033, term45334));
        assertTrue(recursiveEquals(term45125, term45335));
        assertTrue(recursiveEquals(term45217, term45336));
        assertTrue(recursiveEquals(retValue, term45311));
    }

};


