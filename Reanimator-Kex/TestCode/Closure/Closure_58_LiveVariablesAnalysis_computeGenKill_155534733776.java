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
import java.lang.Object;

public class LiveVariablesAnalysis_computeGenKill_155534733776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11953;
     Object term12023;
     Object term17341;
     Object term17342;

    public LiveVariablesAnalysis_computeGenKill_155534733776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11953 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term12023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12023, term12023.getClass(), "type", -344842608);
        setIntField(term12093, term12093.getClass(), "type", 118);
        setField(term12023, term12023.getClass(), "first", term12093);
        term17341 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term17341, term17341.getClass(), "jsScope", null);
        setField(term17341, term17341.getClass(), "escaped", null);
        setField(term17341, term17341.getClass(), "cfg", null);
        setField(term17341, term17341.getClass(), "joinOp", null);
        setField(term17341, term17341.getClass(), "orderedWorkSet", null);
        term17342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17342, term17342.getClass(), "type", -344842608);
        setField(term17342, term17342.getClass(), "next", null);
        setIntField(term17343, term17343.getClass(), "type", 118);
        setField(term17343, term17343.getClass(), "next", null);
        setField(term17343, term17343.getClass(), "first", null);
        setField(term17343, term17343.getClass(), "last", null);
        setField(term17343, term17343.getClass(), "propListHead", null);
        setIntField(term17343, term17343.getClass(), "sourcePosition", 0);
        setField(term17343, term17343.getClass(), "jsType", null);
        setField(term17343, term17343.getClass(), "parent", null);
        setField(term17342, term17342.getClass(), "first", term17343);
        setField(term17342, term17342.getClass(), "last", null);
        setField(term17342, term17342.getClass(), "propListHead", null);
        setIntField(term17342, term17342.getClass(), "sourcePosition", 0);
        setField(term17342, term17342.getClass(), "jsType", null);
        setField(term17342, term17342.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.BitSet");
        argTypes[2] = Class.forName("java.util.BitSet");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term12023;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term11953, args);
        assertTrue(recursiveEquals(term11953, term17341));
        assertTrue(recursiveEquals(term12023, term17342));
    }

};


