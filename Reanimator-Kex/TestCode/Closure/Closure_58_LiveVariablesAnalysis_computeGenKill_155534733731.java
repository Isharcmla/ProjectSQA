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

public class LiveVariablesAnalysis_computeGenKill_155534733731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3464;
     Object term3534;
     Object term4002;
     Object term4003;

    public LiveVariablesAnalysis_computeGenKill_155534733731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3464 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term3534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3534, term3534.getClass(), "type", 105);
        term4002 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term4002, term4002.getClass(), "jsScope", null);
        setField(term4002, term4002.getClass(), "escaped", null);
        setField(term4002, term4002.getClass(), "cfg", null);
        setField(term4002, term4002.getClass(), "joinOp", null);
        setField(term4002, term4002.getClass(), "orderedWorkSet", null);
        term4003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4003, term4003.getClass(), "type", 105);
        setField(term4003, term4003.getClass(), "next", null);
        setField(term4003, term4003.getClass(), "first", null);
        setField(term4003, term4003.getClass(), "last", null);
        setField(term4003, term4003.getClass(), "propListHead", null);
        setIntField(term4003, term4003.getClass(), "sourcePosition", 0);
        setField(term4003, term4003.getClass(), "jsType", null);
        setField(term4003, term4003.getClass(), "parent", null);
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
        args[0] = term3534;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term3464, args);
        assertTrue(recursiveEquals(term3464, term4002));
        assertTrue(recursiveEquals(term3534, term4003));
    }

};


