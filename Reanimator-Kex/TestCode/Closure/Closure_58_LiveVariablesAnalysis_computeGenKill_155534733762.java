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

public class LiveVariablesAnalysis_computeGenKill_155534733762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10379;
     Object term10449;
     Object term11373;
     Object term11374;

    public LiveVariablesAnalysis_computeGenKill_155534733762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10379 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term10449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10449, term10449.getClass(), "type", -344842608);
        setIntField(term10519, term10519.getClass(), "type", 105);
        setField(term10449, term10449.getClass(), "first", term10519);
        term11373 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term11373, term11373.getClass(), "jsScope", null);
        setField(term11373, term11373.getClass(), "escaped", null);
        setField(term11373, term11373.getClass(), "cfg", null);
        setField(term11373, term11373.getClass(), "joinOp", null);
        setField(term11373, term11373.getClass(), "orderedWorkSet", null);
        term11374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11374, term11374.getClass(), "type", -344842608);
        setField(term11374, term11374.getClass(), "next", null);
        setIntField(term11375, term11375.getClass(), "type", 105);
        setField(term11375, term11375.getClass(), "next", null);
        setField(term11375, term11375.getClass(), "first", null);
        setField(term11375, term11375.getClass(), "last", null);
        setField(term11375, term11375.getClass(), "propListHead", null);
        setIntField(term11375, term11375.getClass(), "sourcePosition", 0);
        setField(term11375, term11375.getClass(), "jsType", null);
        setField(term11375, term11375.getClass(), "parent", null);
        setField(term11374, term11374.getClass(), "first", term11375);
        setField(term11374, term11374.getClass(), "last", null);
        setField(term11374, term11374.getClass(), "propListHead", null);
        setIntField(term11374, term11374.getClass(), "sourcePosition", 0);
        setField(term11374, term11374.getClass(), "jsType", null);
        setField(term11374, term11374.getClass(), "parent", null);
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
        args[0] = term10449;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term10379, args);
        assertTrue(recursiveEquals(term10379, term11373));
        assertTrue(recursiveEquals(term10449, term11374));
    }

};


