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

public class InlineFunctions_findCalledFunctions_1759326424103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16099;
     Object term16191;
     Object term16331;
     Object term34965;
     Object term34966;
     Object term34968;

    public InlineFunctions_findCalledFunctions_1759326424103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16099 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term16191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term16283 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term16191, term16191.getClass(), "type", -38);
        setField(term16191, term16191.getClass(), "first", term16283);
        term16331 = new HashSet();
        term34965 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term34965, term34965.getClass(), "fns", null);
        setField(term34965, term34965.getClass(), "anonFns", null);
        setField(term34965, term34965.getClass(), "compiler", null);
        setField(term34965, term34965.getClass(), "injector", null);
        setBooleanField(term34965, term34965.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term34965, term34965.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term34965, term34965.getClass(), "inlineLocalFunctions", false);
        setField(term34965, term34965.getClass(), "specializationState", null);
        term34966 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term34967 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term34966, term34966.getClass(), "number", 0.0);
        setIntField(term34966, term34966.getClass(), "type", -38);
        setField(term34966, term34966.getClass(), "next", null);
        setDoubleField(term34967, term34967.getClass(), "number", 0.0);
        setIntField(term34967, term34967.getClass(), "type", 0);
        setField(term34967, term34967.getClass(), "next", null);
        setField(term34967, term34967.getClass(), "first", null);
        setField(term34967, term34967.getClass(), "last", null);
        setField(term34967, term34967.getClass(), "propListHead", null);
        setIntField(term34967, term34967.getClass(), "sourcePosition", 0);
        setField(term34967, term34967.getClass(), "jsType", null);
        setField(term34967, term34967.getClass(), "parent", null);
        setField(term34966, term34966.getClass(), "first", term34967);
        setField(term34966, term34966.getClass(), "last", null);
        setField(term34966, term34966.getClass(), "propListHead", null);
        setIntField(term34966, term34966.getClass(), "sourcePosition", 0);
        setField(term34966, term34966.getClass(), "jsType", null);
        setField(term34966, term34966.getClass(), "parent", null);
        HashMap term34969 = new HashMap();
        Set<Object> term34970 =  ((Map) term34969).keySet();
        term34968 = new HashSet((Collection<? extends Object>) term34970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term16191;
        args[1] = term16331;
        callMethod(klass, "findCalledFunctions", argTypes, term16099, args);
        assertTrue(recursiveEquals(term16099, term34965));
        assertTrue(recursiveEquals(term16191, term34966));
        assertTrue(recursiveEquals(term16331, term34968));
    }

};


