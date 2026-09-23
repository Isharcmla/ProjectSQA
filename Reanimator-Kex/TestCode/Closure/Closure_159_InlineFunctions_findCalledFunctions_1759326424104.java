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

public class InlineFunctions_findCalledFunctions_1759326424104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16470;
     Object term16540;
     Object term16798;
     Object term35341;
     Object term35342;
     Object term35346;

    public InlineFunctions_findCalledFunctions_1759326424104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16470 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term16540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16540, term16540.getClass(), "type", 0);
        setIntField(term16610, term16610.getClass(), "type", 0);
        setField(term16610, term16610.getClass(), "first", null);
        setIntField(term16680, term16680.getClass(), "type", 0);
        setField(term16680, term16680.getClass(), "first", null);
        setField(term16680, term16680.getClass(), "next", term16750);
        setField(term16610, term16610.getClass(), "next", term16680);
        setField(term16540, term16540.getClass(), "first", term16610);
        term16798 = new HashSet();
        term35341 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term35341, term35341.getClass(), "fns", null);
        setField(term35341, term35341.getClass(), "anonFns", null);
        setField(term35341, term35341.getClass(), "compiler", null);
        setField(term35341, term35341.getClass(), "injector", null);
        setBooleanField(term35341, term35341.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term35341, term35341.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term35341, term35341.getClass(), "inlineLocalFunctions", false);
        setField(term35341, term35341.getClass(), "specializationState", null);
        term35342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35342, term35342.getClass(), "type", 0);
        setField(term35342, term35342.getClass(), "next", null);
        setIntField(term35343, term35343.getClass(), "type", 0);
        setIntField(term35344, term35344.getClass(), "type", 0);
        setIntField(term35345, term35345.getClass(), "type", 0);
        setField(term35345, term35345.getClass(), "next", null);
        setField(term35345, term35345.getClass(), "first", null);
        setField(term35345, term35345.getClass(), "last", null);
        setField(term35345, term35345.getClass(), "propListHead", null);
        setIntField(term35345, term35345.getClass(), "sourcePosition", 0);
        setField(term35345, term35345.getClass(), "jsType", null);
        setField(term35345, term35345.getClass(), "parent", null);
        setField(term35344, term35344.getClass(), "next", term35345);
        setField(term35344, term35344.getClass(), "first", null);
        setField(term35344, term35344.getClass(), "last", null);
        setField(term35344, term35344.getClass(), "propListHead", null);
        setIntField(term35344, term35344.getClass(), "sourcePosition", 0);
        setField(term35344, term35344.getClass(), "jsType", null);
        setField(term35344, term35344.getClass(), "parent", null);
        setField(term35343, term35343.getClass(), "next", term35344);
        setField(term35343, term35343.getClass(), "first", null);
        setField(term35343, term35343.getClass(), "last", null);
        setField(term35343, term35343.getClass(), "propListHead", null);
        setIntField(term35343, term35343.getClass(), "sourcePosition", 0);
        setField(term35343, term35343.getClass(), "jsType", null);
        setField(term35343, term35343.getClass(), "parent", null);
        setField(term35342, term35342.getClass(), "first", term35343);
        setField(term35342, term35342.getClass(), "last", null);
        setField(term35342, term35342.getClass(), "propListHead", null);
        setIntField(term35342, term35342.getClass(), "sourcePosition", 0);
        setField(term35342, term35342.getClass(), "jsType", null);
        setField(term35342, term35342.getClass(), "parent", null);
        HashMap term35347 = new HashMap();
        Set<Object> term35348 =  ((Map) term35347).keySet();
        term35346 = new HashSet((Collection<? extends Object>) term35348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term16540;
        args[1] = term16798;
        callMethod(klass, "findCalledFunctions", argTypes, term16470, args);
        assertTrue(recursiveEquals(term16470, term35341));
        assertTrue(recursiveEquals(term16540, term35342));
        assertTrue(recursiveEquals(term16798, term35346));
    }

};


