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
import java.util.HashMap;

public class FunctionRewriter_process_186135004119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63215;
     Object term63285;
     Object term64469;
     Object term64470;
     Object term64471;

    public FunctionRewriter_process_186135004119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63215 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionRewriter"));
        setField(term63215, term63215.getClass(), "compiler", null);
        term63285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63285, term63285.getClass(), "type", 0);
        setField(term63285, term63285.getClass(), "parent", null);
        term64469 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionRewriter"));
        setField(term64469, term64469.getClass(), "compiler", null);
        term64470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64470, term64470.getClass(), "type", 0);
        setField(term64470, term64470.getClass(), "next", null);
        setField(term64470, term64470.getClass(), "first", null);
        setField(term64470, term64470.getClass(), "last", null);
        setField(term64470, term64470.getClass(), "propListHead", null);
        setIntField(term64470, term64470.getClass(), "sourcePosition", 0);
        setField(term64470, term64470.getClass(), "jsType", null);
        setField(term64470, term64470.getClass(), "parent", null);
        HashMap term64472 = new HashMap();
        term64471 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setIntField(term64471, term64471.getClass(), "expectedValuesPerKey", 8);
        setField(term64471, term64471.getClass(), "map", term64472);
        setIntField(term64471, term64471.getClass(), "totalSize", 0);
        setField(term64471, term64471.getClass(), "keySet", null);
        setField(term64471, term64471.getClass(), "multiset", null);
        setField(term64471, term64471.getClass(), "valuesCollection", null);
        setField(term64471, term64471.getClass(), "entries", null);
        setField(term64471, term64471.getClass(), "asMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term63285;
        callMethod(klass, "process", argTypes, term63215, args);
        assertTrue(recursiveEquals(term63215, term64469));
        assertTrue(recursiveEquals(term63285, term64471));
    }

};


