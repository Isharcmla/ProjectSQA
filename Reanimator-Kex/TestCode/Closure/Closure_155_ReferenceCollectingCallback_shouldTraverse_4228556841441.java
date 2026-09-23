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

public class ReferenceCollectingCallback_shouldTraverse_4228556841441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421678;
     Object term421818;
     Object term421910;
     Object term423895;
     Object term423899;
     Object term423900;

    public ReferenceCollectingCallback_shouldTraverse_4228556841441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term421732 = new ArrayDeque();
        term421678 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term421678, term421678.getClass(), "blockStack", term421732);
        term421818 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term421818, term421818.getClass(), "type", 111);
        term421910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term421910, term421910.getClass(), "type", 0);
        ArrayDeque term423896 = new ArrayDeque();
        term423895 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term423895, term423895.getClass(), "referenceMap", null);
        setField(term423895, term423895.getClass(), "blockStack", term423896);
        setField(term423895, term423895.getClass(), "behavior", null);
        setField(term423895, term423895.getClass(), "compiler", null);
        setField(term423895, term423895.getClass(), "varFilter", null);
        term423899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term423899, term423899.getClass(), "str", null);
        setIntField(term423899, term423899.getClass(), "type", 0);
        setField(term423899, term423899.getClass(), "next", null);
        setField(term423899, term423899.getClass(), "first", null);
        setField(term423899, term423899.getClass(), "last", null);
        setField(term423899, term423899.getClass(), "propListHead", null);
        setIntField(term423899, term423899.getClass(), "sourcePosition", 0);
        setField(term423899, term423899.getClass(), "jsType", null);
        setField(term423899, term423899.getClass(), "parent", null);
        term423900 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term423900, term423900.getClass(), "functionName", null);
        setBooleanField(term423900, term423900.getClass(), "itsNeedsActivation", false);
        setIntField(term423900, term423900.getClass(), "itsFunctionType", 0);
        setBooleanField(term423900, term423900.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423900, term423900.getClass(), "encodedSourceStart", 0);
        setIntField(term423900, term423900.getClass(), "encodedSourceEnd", 0);
        setField(term423900, term423900.getClass(), "sourceName", null);
        setIntField(term423900, term423900.getClass(), "baseLineno", 0);
        setIntField(term423900, term423900.getClass(), "endLineno", 0);
        setField(term423900, term423900.getClass(), "functions", null);
        setField(term423900, term423900.getClass(), "regexps", null);
        setField(term423900, term423900.getClass(), "itsVariables", null);
        setField(term423900, term423900.getClass(), "itsConst", null);
        setField(term423900, term423900.getClass(), "itsVariableNames", null);
        setIntField(term423900, term423900.getClass(), "varStart", 0);
        setField(term423900, term423900.getClass(), "compilerData", null);
        setIntField(term423900, term423900.getClass(), "type", 111);
        setField(term423900, term423900.getClass(), "next", null);
        setField(term423900, term423900.getClass(), "first", null);
        setField(term423900, term423900.getClass(), "last", null);
        setField(term423900, term423900.getClass(), "propListHead", null);
        setIntField(term423900, term423900.getClass(), "sourcePosition", 0);
        setField(term423900, term423900.getClass(), "jsType", null);
        setField(term423900, term423900.getClass(), "parent", null);
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
        args[1] = term421818;
        args[2] = term421910;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term421678, args);
        assertTrue(recursiveEquals(term421678, term423895));
        assertTrue(recursiveEquals(term421818, term423900));
        assertTrue(recursiveEquals(term421910, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


