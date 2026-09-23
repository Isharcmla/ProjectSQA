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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445264;
     Object term445402;
     Object term445432;
     Object term445433;
     Object term445434;
     Object term445403;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term445264 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term445402 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term445402, term445402.getClass(), "parent", null);
        setIntField(term445402, term445402.getClass(), "type", 63);
        term445432 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term445432, term445432.getClass(), "currentTraversal", null);
        term445433 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term445433, term445433.getClass(), "number", 0.0);
        setIntField(term445433, term445433.getClass(), "type", 63);
        setField(term445433, term445433.getClass(), "next", null);
        setField(term445433, term445433.getClass(), "first", null);
        setField(term445433, term445433.getClass(), "last", null);
        setField(term445433, term445433.getClass(), "propListHead", null);
        setIntField(term445433, term445433.getClass(), "sourcePosition", 0);
        setField(term445433, term445433.getClass(), "jsType", null);
        setField(term445433, term445433.getClass(), "parent", null);
        term445434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term445434, term445434.getClass(), "number", 0.0);
        setIntField(term445434, term445434.getClass(), "type", 63);
        setField(term445434, term445434.getClass(), "next", null);
        setField(term445434, term445434.getClass(), "first", null);
        setField(term445434, term445434.getClass(), "last", null);
        setField(term445434, term445434.getClass(), "propListHead", null);
        setIntField(term445434, term445434.getClass(), "sourcePosition", 0);
        setField(term445434, term445434.getClass(), "jsType", null);
        setField(term445434, term445434.getClass(), "parent", null);
        term445403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term445403, term445403.getClass(), "number", 0.0);
        setIntField(term445403, term445403.getClass(), "type", 63);
        setField(term445403, term445403.getClass(), "next", null);
        setField(term445403, term445403.getClass(), "first", null);
        setField(term445403, term445403.getClass(), "last", null);
        setField(term445403, term445403.getClass(), "propListHead", null);
        setIntField(term445403, term445403.getClass(), "sourcePosition", 0);
        setField(term445403, term445403.getClass(), "jsType", null);
        setField(term445403, term445403.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term445402;
        args[1] = term445402;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term445264, args);
        assertTrue(recursiveEquals(term445264, term445432));
        assertTrue(recursiveEquals(term445402, term445433));
        assertTrue(recursiveEquals(term445402, term445434));
        assertTrue(recursiveEquals(retValue, term445403));
    }

};


