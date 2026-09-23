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

public class LiveVariablesAnalysis_computeGenKill_155534733742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5756;
     Object term5826;
     Object term6289;
     Object term6290;

    public LiveVariablesAnalysis_computeGenKill_155534733742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5756 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term5826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5826, term5826.getClass(), "type", 118);
        term6289 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term6289, term6289.getClass(), "jsScope", null);
        setField(term6289, term6289.getClass(), "escaped", null);
        setField(term6289, term6289.getClass(), "cfg", null);
        setField(term6289, term6289.getClass(), "joinOp", null);
        setField(term6289, term6289.getClass(), "orderedWorkSet", null);
        term6290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6290, term6290.getClass(), "type", 118);
        setField(term6290, term6290.getClass(), "next", null);
        setField(term6290, term6290.getClass(), "first", null);
        setField(term6290, term6290.getClass(), "last", null);
        setField(term6290, term6290.getClass(), "propListHead", null);
        setIntField(term6290, term6290.getClass(), "sourcePosition", 0);
        setField(term6290, term6290.getClass(), "jsType", null);
        setField(term6290, term6290.getClass(), "parent", null);
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
        args[0] = term5826;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term5756, args);
        assertTrue(recursiveEquals(term5756, term6289));
        assertTrue(recursiveEquals(term5826, term6290));
    }

};


