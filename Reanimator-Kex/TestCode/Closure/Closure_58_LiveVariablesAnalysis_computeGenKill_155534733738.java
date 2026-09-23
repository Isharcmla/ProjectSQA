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

public class LiveVariablesAnalysis_computeGenKill_155534733738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5021;
     Object term5091;
     Object term5635;
     Object term5636;

    public LiveVariablesAnalysis_computeGenKill_155534733738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5021 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term5091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5091, term5091.getClass(), "type", 132);
        term5635 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term5635, term5635.getClass(), "jsScope", null);
        setField(term5635, term5635.getClass(), "escaped", null);
        setField(term5635, term5635.getClass(), "cfg", null);
        setField(term5635, term5635.getClass(), "joinOp", null);
        setField(term5635, term5635.getClass(), "orderedWorkSet", null);
        term5636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5636, term5636.getClass(), "type", 132);
        setField(term5636, term5636.getClass(), "next", null);
        setField(term5636, term5636.getClass(), "first", null);
        setField(term5636, term5636.getClass(), "last", null);
        setField(term5636, term5636.getClass(), "propListHead", null);
        setIntField(term5636, term5636.getClass(), "sourcePosition", 0);
        setField(term5636, term5636.getClass(), "jsType", null);
        setField(term5636, term5636.getClass(), "parent", null);
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
        args[0] = term5091;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term5021, args);
        assertTrue(recursiveEquals(term5021, term5635));
        assertTrue(recursiveEquals(term5091, term5636));
    }

};


