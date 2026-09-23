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

public class InlineFunctions_findCalledFunctions_175932642445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5931;
     Object term6001;
     Object term6189;
     Object term6244;
     Object term6245;
     Object term6248;

    public InlineFunctions_findCalledFunctions_175932642445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5931 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term6001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6001, term6001.getClass(), "type", 0);
        setIntField(term6071, term6071.getClass(), "type", 0);
        setField(term6071, term6071.getClass(), "first", null);
        setField(term6071, term6071.getClass(), "next", term6141);
        setField(term6001, term6001.getClass(), "first", term6071);
        term6189 = new HashSet();
        term6244 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term6244, term6244.getClass(), "fns", null);
        setField(term6244, term6244.getClass(), "anonFns", null);
        setField(term6244, term6244.getClass(), "compiler", null);
        setField(term6244, term6244.getClass(), "injector", null);
        setBooleanField(term6244, term6244.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term6244, term6244.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term6244, term6244.getClass(), "inlineLocalFunctions", false);
        setField(term6244, term6244.getClass(), "specializationState", null);
        term6245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6245, term6245.getClass(), "type", 0);
        setField(term6245, term6245.getClass(), "next", null);
        setIntField(term6246, term6246.getClass(), "type", 0);
        setIntField(term6247, term6247.getClass(), "type", 0);
        setField(term6247, term6247.getClass(), "next", null);
        setField(term6247, term6247.getClass(), "first", null);
        setField(term6247, term6247.getClass(), "last", null);
        setField(term6247, term6247.getClass(), "propListHead", null);
        setIntField(term6247, term6247.getClass(), "sourcePosition", 0);
        setField(term6247, term6247.getClass(), "jsType", null);
        setField(term6247, term6247.getClass(), "parent", null);
        setField(term6246, term6246.getClass(), "next", term6247);
        setField(term6246, term6246.getClass(), "first", null);
        setField(term6246, term6246.getClass(), "last", null);
        setField(term6246, term6246.getClass(), "propListHead", null);
        setIntField(term6246, term6246.getClass(), "sourcePosition", 0);
        setField(term6246, term6246.getClass(), "jsType", null);
        setField(term6246, term6246.getClass(), "parent", null);
        setField(term6245, term6245.getClass(), "first", term6246);
        setField(term6245, term6245.getClass(), "last", null);
        setField(term6245, term6245.getClass(), "propListHead", null);
        setIntField(term6245, term6245.getClass(), "sourcePosition", 0);
        setField(term6245, term6245.getClass(), "jsType", null);
        setField(term6245, term6245.getClass(), "parent", null);
        HashMap term6249 = new HashMap();
        Set<Object> term6250 =  ((Map) term6249).keySet();
        term6248 = new HashSet((Collection<? extends Object>) term6250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term6001;
        args[1] = term6189;
        callMethod(klass, "findCalledFunctions", argTypes, term5931, args);
        assertTrue(recursiveEquals(term5931, term6244));
        assertTrue(recursiveEquals(term6001, term6245));
        assertTrue(recursiveEquals(term6189, term6248));
    }

};


