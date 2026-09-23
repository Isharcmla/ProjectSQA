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
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class InlineFunctions_findCalledFunctions_175932642450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6848;
     Object term6918;
     Object term7106;
     Object term7350;
     Object term7351;
     Object term7354;

    public InlineFunctions_findCalledFunctions_175932642450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6848 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term6918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6918, term6918.getClass(), "type", 0);
        setIntField(term6988, term6988.getClass(), "type", 0);
        setField(term6988, term6988.getClass(), "first", term7058);
        setField(term6918, term6918.getClass(), "first", term6988);
        term7106 = new HashSet();
        term7350 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term7350, term7350.getClass(), "fns", null);
        setField(term7350, term7350.getClass(), "anonFns", null);
        setField(term7350, term7350.getClass(), "compiler", null);
        setField(term7350, term7350.getClass(), "injector", null);
        setBooleanField(term7350, term7350.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term7350, term7350.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term7350, term7350.getClass(), "inlineLocalFunctions", false);
        setField(term7350, term7350.getClass(), "specializationState", null);
        term7351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7351, term7351.getClass(), "type", 0);
        setField(term7351, term7351.getClass(), "next", null);
        setIntField(term7352, term7352.getClass(), "type", 0);
        setField(term7352, term7352.getClass(), "next", null);
        setIntField(term7353, term7353.getClass(), "type", 0);
        setField(term7353, term7353.getClass(), "next", null);
        setField(term7353, term7353.getClass(), "first", null);
        setField(term7353, term7353.getClass(), "last", null);
        setField(term7353, term7353.getClass(), "propListHead", null);
        setIntField(term7353, term7353.getClass(), "sourcePosition", 0);
        setField(term7353, term7353.getClass(), "jsType", null);
        setField(term7353, term7353.getClass(), "parent", null);
        setField(term7352, term7352.getClass(), "first", term7353);
        setField(term7352, term7352.getClass(), "last", null);
        setField(term7352, term7352.getClass(), "propListHead", null);
        setIntField(term7352, term7352.getClass(), "sourcePosition", 0);
        setField(term7352, term7352.getClass(), "jsType", null);
        setField(term7352, term7352.getClass(), "parent", null);
        setField(term7351, term7351.getClass(), "first", term7352);
        setField(term7351, term7351.getClass(), "last", null);
        setField(term7351, term7351.getClass(), "propListHead", null);
        setIntField(term7351, term7351.getClass(), "sourcePosition", 0);
        setField(term7351, term7351.getClass(), "jsType", null);
        setField(term7351, term7351.getClass(), "parent", null);
        HashMap term7355 = new HashMap();
        Set<Object> term7356 =  ((Map) term7355).keySet();
        term7354 = new HashSet((Collection<? extends Object>) term7356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term6918;
        args[1] = term7106;
        callMethod(klass, "findCalledFunctions", argTypes, term6848, args);
        assertTrue(recursiveEquals(term6848, term7350));
        assertTrue(recursiveEquals(term6918, term7351));
        assertTrue(recursiveEquals(term7106, term7354));
    }

};


