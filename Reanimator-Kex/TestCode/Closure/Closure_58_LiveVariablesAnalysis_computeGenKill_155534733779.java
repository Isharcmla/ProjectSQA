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

public class LiveVariablesAnalysis_computeGenKill_155534733779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12910;
     Object term12980;
     Object term17705;
     Object term17706;

    public LiveVariablesAnalysis_computeGenKill_155534733779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12910 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term12980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12980, term12980.getClass(), "type", -344842608);
        setIntField(term13050, term13050.getClass(), "type", 113);
        setField(term13050, term13050.getClass(), "first", term13120);
        setField(term12980, term12980.getClass(), "first", term13050);
        term17705 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term17705, term17705.getClass(), "jsScope", null);
        setField(term17705, term17705.getClass(), "escaped", null);
        setField(term17705, term17705.getClass(), "cfg", null);
        setField(term17705, term17705.getClass(), "joinOp", null);
        setField(term17705, term17705.getClass(), "orderedWorkSet", null);
        term17706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17706, term17706.getClass(), "type", -344842608);
        setField(term17706, term17706.getClass(), "next", null);
        setIntField(term17707, term17707.getClass(), "type", 113);
        setField(term17707, term17707.getClass(), "next", null);
        setIntField(term17708, term17708.getClass(), "type", 0);
        setField(term17708, term17708.getClass(), "next", null);
        setField(term17708, term17708.getClass(), "first", null);
        setField(term17708, term17708.getClass(), "last", null);
        setField(term17708, term17708.getClass(), "propListHead", null);
        setIntField(term17708, term17708.getClass(), "sourcePosition", 0);
        setField(term17708, term17708.getClass(), "jsType", null);
        setField(term17708, term17708.getClass(), "parent", null);
        setField(term17707, term17707.getClass(), "first", term17708);
        setField(term17707, term17707.getClass(), "last", null);
        setField(term17707, term17707.getClass(), "propListHead", null);
        setIntField(term17707, term17707.getClass(), "sourcePosition", 0);
        setField(term17707, term17707.getClass(), "jsType", null);
        setField(term17707, term17707.getClass(), "parent", null);
        setField(term17706, term17706.getClass(), "first", term17707);
        setField(term17706, term17706.getClass(), "last", null);
        setField(term17706, term17706.getClass(), "propListHead", null);
        setIntField(term17706, term17706.getClass(), "sourcePosition", 0);
        setField(term17706, term17706.getClass(), "jsType", null);
        setField(term17706, term17706.getClass(), "parent", null);
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
        args[0] = term12980;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term12910, args);
        assertTrue(recursiveEquals(term12910, term17705));
        assertTrue(recursiveEquals(term12980, term17706));
    }

};


