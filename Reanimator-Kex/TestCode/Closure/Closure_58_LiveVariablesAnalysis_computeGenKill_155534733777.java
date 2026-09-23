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

public class LiveVariablesAnalysis_computeGenKill_155534733777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12229;
     Object term12299;
     Object term17390;
     Object term17391;

    public LiveVariablesAnalysis_computeGenKill_155534733777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12229 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term12299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12299, term12299.getClass(), "type", -344842608);
        setIntField(term12369, term12369.getClass(), "type", 0);
        setField(term12369, term12369.getClass(), "first", term12439);
        setField(term12299, term12299.getClass(), "first", term12369);
        term17390 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term17390, term17390.getClass(), "jsScope", null);
        setField(term17390, term17390.getClass(), "escaped", null);
        setField(term17390, term17390.getClass(), "cfg", null);
        setField(term17390, term17390.getClass(), "joinOp", null);
        setField(term17390, term17390.getClass(), "orderedWorkSet", null);
        term17391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17391, term17391.getClass(), "type", -344842608);
        setField(term17391, term17391.getClass(), "next", null);
        setIntField(term17392, term17392.getClass(), "type", 0);
        setField(term17392, term17392.getClass(), "next", null);
        setIntField(term17393, term17393.getClass(), "type", 0);
        setField(term17393, term17393.getClass(), "next", null);
        setField(term17393, term17393.getClass(), "first", null);
        setField(term17393, term17393.getClass(), "last", null);
        setField(term17393, term17393.getClass(), "propListHead", null);
        setIntField(term17393, term17393.getClass(), "sourcePosition", 0);
        setField(term17393, term17393.getClass(), "jsType", null);
        setField(term17393, term17393.getClass(), "parent", null);
        setField(term17392, term17392.getClass(), "first", term17393);
        setField(term17392, term17392.getClass(), "last", null);
        setField(term17392, term17392.getClass(), "propListHead", null);
        setIntField(term17392, term17392.getClass(), "sourcePosition", 0);
        setField(term17392, term17392.getClass(), "jsType", null);
        setField(term17392, term17392.getClass(), "parent", null);
        setField(term17391, term17391.getClass(), "first", term17392);
        setField(term17391, term17391.getClass(), "last", null);
        setField(term17391, term17391.getClass(), "propListHead", null);
        setIntField(term17391, term17391.getClass(), "sourcePosition", 0);
        setField(term17391, term17391.getClass(), "jsType", null);
        setField(term17391, term17391.getClass(), "parent", null);
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
        args[0] = term12299;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term12229, args);
        assertTrue(recursiveEquals(term12229, term17390));
        assertTrue(recursiveEquals(term12299, term17391));
    }

};


