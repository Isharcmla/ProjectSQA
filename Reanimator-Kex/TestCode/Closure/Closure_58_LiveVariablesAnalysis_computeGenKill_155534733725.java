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

public class LiveVariablesAnalysis_computeGenKill_155534733725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2445;
     Object term2515;
     Object term3068;
     Object term3069;

    public LiveVariablesAnalysis_computeGenKill_155534733725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2445 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term2515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2515, term2515.getClass(), "type", -344842608);
        setIntField(term2585, term2585.getClass(), "type", 125);
        setField(term2515, term2515.getClass(), "first", term2585);
        term3068 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term3068, term3068.getClass(), "jsScope", null);
        setField(term3068, term3068.getClass(), "escaped", null);
        setField(term3068, term3068.getClass(), "cfg", null);
        setField(term3068, term3068.getClass(), "joinOp", null);
        setField(term3068, term3068.getClass(), "orderedWorkSet", null);
        term3069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3069, term3069.getClass(), "type", -344842608);
        setField(term3069, term3069.getClass(), "next", null);
        setIntField(term3070, term3070.getClass(), "type", 125);
        setField(term3070, term3070.getClass(), "next", null);
        setField(term3070, term3070.getClass(), "first", null);
        setField(term3070, term3070.getClass(), "last", null);
        setField(term3070, term3070.getClass(), "propListHead", null);
        setIntField(term3070, term3070.getClass(), "sourcePosition", 0);
        setField(term3070, term3070.getClass(), "jsType", null);
        setField(term3070, term3070.getClass(), "parent", null);
        setField(term3069, term3069.getClass(), "first", term3070);
        setField(term3069, term3069.getClass(), "last", null);
        setField(term3069, term3069.getClass(), "propListHead", null);
        setIntField(term3069, term3069.getClass(), "sourcePosition", 0);
        setField(term3069, term3069.getClass(), "jsType", null);
        setField(term3069, term3069.getClass(), "parent", null);
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
        args[0] = term2515;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term2445, args);
        assertTrue(recursiveEquals(term2445, term3068));
        assertTrue(recursiveEquals(term2515, term3069));
    }

};


