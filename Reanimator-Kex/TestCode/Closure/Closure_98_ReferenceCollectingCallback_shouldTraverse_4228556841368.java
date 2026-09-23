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

public class ReferenceCollectingCallback_shouldTraverse_4228556841368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427423;
     Object term427563;
     Object term427655;
     Object term428875;
     Object term428879;
     Object term428880;

    public ReferenceCollectingCallback_shouldTraverse_4228556841368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term427477 = new ArrayDeque();
        term427423 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term427423, term427423.getClass(), "blockStack", term427477);
        term427563 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term427563, term427563.getClass(), "type", 111);
        term427655 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term427655, term427655.getClass(), "type", 0);
        ArrayDeque term428876 = new ArrayDeque();
        term428875 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term428875, term428875.getClass(), "referenceMap", null);
        setField(term428875, term428875.getClass(), "blockStack", term428876);
        setField(term428875, term428875.getClass(), "behavior", null);
        setField(term428875, term428875.getClass(), "compiler", null);
        setField(term428875, term428875.getClass(), "varFilter", null);
        term428879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term428879, term428879.getClass(), "number", 0.0);
        setIntField(term428879, term428879.getClass(), "type", 0);
        setField(term428879, term428879.getClass(), "next", null);
        setField(term428879, term428879.getClass(), "first", null);
        setField(term428879, term428879.getClass(), "last", null);
        setField(term428879, term428879.getClass(), "propListHead", null);
        setIntField(term428879, term428879.getClass(), "sourcePosition", 0);
        setField(term428879, term428879.getClass(), "jsType", null);
        setField(term428879, term428879.getClass(), "parent", null);
        term428880 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term428880, term428880.getClass(), "functionName", null);
        setBooleanField(term428880, term428880.getClass(), "itsNeedsActivation", false);
        setIntField(term428880, term428880.getClass(), "itsFunctionType", 0);
        setBooleanField(term428880, term428880.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term428880, term428880.getClass(), "encodedSourceStart", 0);
        setIntField(term428880, term428880.getClass(), "encodedSourceEnd", 0);
        setField(term428880, term428880.getClass(), "sourceName", null);
        setIntField(term428880, term428880.getClass(), "baseLineno", 0);
        setIntField(term428880, term428880.getClass(), "endLineno", 0);
        setField(term428880, term428880.getClass(), "functions", null);
        setField(term428880, term428880.getClass(), "regexps", null);
        setField(term428880, term428880.getClass(), "itsVariables", null);
        setField(term428880, term428880.getClass(), "itsConst", null);
        setField(term428880, term428880.getClass(), "itsVariableNames", null);
        setIntField(term428880, term428880.getClass(), "varStart", 0);
        setField(term428880, term428880.getClass(), "compilerData", null);
        setIntField(term428880, term428880.getClass(), "type", 111);
        setField(term428880, term428880.getClass(), "next", null);
        setField(term428880, term428880.getClass(), "first", null);
        setField(term428880, term428880.getClass(), "last", null);
        setField(term428880, term428880.getClass(), "propListHead", null);
        setIntField(term428880, term428880.getClass(), "sourcePosition", 0);
        setField(term428880, term428880.getClass(), "jsType", null);
        setField(term428880, term428880.getClass(), "parent", null);
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
        args[1] = term427563;
        args[2] = term427655;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term427423, args);
        assertTrue(recursiveEquals(term427423, term428875));
        assertTrue(recursiveEquals(term427563, term428880));
        assertTrue(recursiveEquals(term427655, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


