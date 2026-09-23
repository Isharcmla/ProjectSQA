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

public class LiveVariablesAnalysis_computeGenKill_155534733726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2705;
     Object term2775;
     Object term3077;
     Object term3078;

    public LiveVariablesAnalysis_computeGenKill_155534733726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2705 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term2775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2775, term2775.getClass(), "type", 125);
        term3077 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term3077, term3077.getClass(), "jsScope", null);
        setField(term3077, term3077.getClass(), "escaped", null);
        setField(term3077, term3077.getClass(), "cfg", null);
        setField(term3077, term3077.getClass(), "joinOp", null);
        setField(term3077, term3077.getClass(), "orderedWorkSet", null);
        term3078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3078, term3078.getClass(), "type", 125);
        setField(term3078, term3078.getClass(), "next", null);
        setField(term3078, term3078.getClass(), "first", null);
        setField(term3078, term3078.getClass(), "last", null);
        setField(term3078, term3078.getClass(), "propListHead", null);
        setIntField(term3078, term3078.getClass(), "sourcePosition", 0);
        setField(term3078, term3078.getClass(), "jsType", null);
        setField(term3078, term3078.getClass(), "parent", null);
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
        args[0] = term2775;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term2705, args);
        assertTrue(recursiveEquals(term2705, term3077));
        assertTrue(recursiveEquals(term2775, term3078));
    }

};


