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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_shouldTraverse_4228556841110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316345;
     Object term316491;
     Object term316577;
     Object term317898;
     Object term317902;
     Object term317903;

    public ReferenceCollectingCallback_shouldTraverse_4228556841110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term316399 = new ArrayDeque();
        term316345 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term316345, term316345.getClass(), "blockStack", term316399);
        term316491 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term316491, term316491.getClass(), "type", 111);
        term316577 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term316577, term316577.getClass(), "type", 0);
        ArrayDeque term317899 = new ArrayDeque();
        term317898 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term317898, term317898.getClass(), "referenceMap", null);
        setField(term317898, term317898.getClass(), "blockStack", term317899);
        setField(term317898, term317898.getClass(), "behavior", null);
        setField(term317898, term317898.getClass(), "compiler", null);
        setField(term317898, term317898.getClass(), "varFilter", null);
        term317902 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term317902, term317902.getClass(), "functionName", null);
        setBooleanField(term317902, term317902.getClass(), "itsNeedsActivation", false);
        setIntField(term317902, term317902.getClass(), "itsFunctionType", 0);
        setBooleanField(term317902, term317902.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term317902, term317902.getClass(), "encodedSourceStart", 0);
        setIntField(term317902, term317902.getClass(), "encodedSourceEnd", 0);
        setField(term317902, term317902.getClass(), "sourceName", null);
        setIntField(term317902, term317902.getClass(), "baseLineno", 0);
        setIntField(term317902, term317902.getClass(), "endLineno", 0);
        setField(term317902, term317902.getClass(), "functions", null);
        setField(term317902, term317902.getClass(), "regexps", null);
        setField(term317902, term317902.getClass(), "itsVariables", null);
        setField(term317902, term317902.getClass(), "itsConst", null);
        setField(term317902, term317902.getClass(), "itsVariableNames", null);
        setIntField(term317902, term317902.getClass(), "varStart", 0);
        setField(term317902, term317902.getClass(), "compilerData", null);
        setIntField(term317902, term317902.getClass(), "type", 0);
        setField(term317902, term317902.getClass(), "next", null);
        setField(term317902, term317902.getClass(), "first", null);
        setField(term317902, term317902.getClass(), "last", null);
        setField(term317902, term317902.getClass(), "propListHead", null);
        setIntField(term317902, term317902.getClass(), "sourcePosition", 0);
        setField(term317902, term317902.getClass(), "jsType", null);
        setField(term317902, term317902.getClass(), "parent", null);
        term317903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term317903, term317903.getClass(), "str", null);
        setIntField(term317903, term317903.getClass(), "type", 111);
        setField(term317903, term317903.getClass(), "next", null);
        setField(term317903, term317903.getClass(), "first", null);
        setField(term317903, term317903.getClass(), "last", null);
        setField(term317903, term317903.getClass(), "propListHead", null);
        setIntField(term317903, term317903.getClass(), "sourcePosition", 0);
        setField(term317903, term317903.getClass(), "jsType", null);
        setField(term317903, term317903.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term316491;
        args[2] = term316577;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term316345, args);
        assertTrue(recursiveEquals(term316345, term317898));
        assertTrue(recursiveEquals(term316491, term317903));
        assertTrue(recursiveEquals(term316577, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


