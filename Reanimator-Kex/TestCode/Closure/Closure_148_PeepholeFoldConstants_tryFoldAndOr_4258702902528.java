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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term712213;
     Object term712305;
     Object term712397;
     Object term712898;
     Object term712899;
     Object term712900;
     Object term712866;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term712213 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term712305 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term712305, term712305.getClass(), "parent", null);
        setIntField(term712305, term712305.getClass(), "type", 47);
        term712397 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term712397, term712397.getClass(), "type", 47);
        term712898 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term712898, term712898.getClass(), "currentTraversal", null);
        term712899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term712899, term712899.getClass(), "str", null);
        setIntField(term712899, term712899.getClass(), "type", 47);
        setField(term712899, term712899.getClass(), "next", null);
        setField(term712899, term712899.getClass(), "first", null);
        setField(term712899, term712899.getClass(), "last", null);
        setField(term712899, term712899.getClass(), "propListHead", null);
        setIntField(term712899, term712899.getClass(), "sourcePosition", 0);
        setField(term712899, term712899.getClass(), "jsType", null);
        setField(term712899, term712899.getClass(), "parent", null);
        term712900 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term712900, term712900.getClass(), "number", 0.0);
        setIntField(term712900, term712900.getClass(), "type", 47);
        setField(term712900, term712900.getClass(), "next", null);
        setField(term712900, term712900.getClass(), "first", null);
        setField(term712900, term712900.getClass(), "last", null);
        setField(term712900, term712900.getClass(), "propListHead", null);
        setIntField(term712900, term712900.getClass(), "sourcePosition", 0);
        setField(term712900, term712900.getClass(), "jsType", null);
        setField(term712900, term712900.getClass(), "parent", null);
        term712866 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term712866, term712866.getClass(), "str", null);
        setIntField(term712866, term712866.getClass(), "type", 47);
        setField(term712866, term712866.getClass(), "next", null);
        setField(term712866, term712866.getClass(), "first", null);
        setField(term712866, term712866.getClass(), "last", null);
        setField(term712866, term712866.getClass(), "propListHead", null);
        setIntField(term712866, term712866.getClass(), "sourcePosition", 0);
        setField(term712866, term712866.getClass(), "jsType", null);
        setField(term712866, term712866.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term712305;
        args[1] = term712397;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term712213, args);
        assertTrue(recursiveEquals(term712213, term712898));
        assertTrue(recursiveEquals(term712305, term712899));
        assertTrue(recursiveEquals(term712397, term712900));
        assertTrue(recursiveEquals(retValue, term712866));
    }

};


