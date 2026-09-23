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

public class NodeUtil_canBeSideEffected_2078426861542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43345;
     Object term60181;

    public NodeUtil_canBeSideEffected_2078426861542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43345 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term43437 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term43345, term43345.getClass(), "type", 4);
        setField(term43345, term43345.getClass(), "first", term43437);
        term60181 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term60182 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term60181, term60181.getClass(), "functionName", null);
        setBooleanField(term60181, term60181.getClass(), "itsNeedsActivation", false);
        setIntField(term60181, term60181.getClass(), "itsFunctionType", 0);
        setBooleanField(term60181, term60181.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term60181, term60181.getClass(), "encodedSourceStart", 0);
        setIntField(term60181, term60181.getClass(), "encodedSourceEnd", 0);
        setField(term60181, term60181.getClass(), "sourceName", null);
        setIntField(term60181, term60181.getClass(), "baseLineno", 0);
        setIntField(term60181, term60181.getClass(), "endLineno", 0);
        setField(term60181, term60181.getClass(), "functions", null);
        setField(term60181, term60181.getClass(), "regexps", null);
        setField(term60181, term60181.getClass(), "itsVariables", null);
        setField(term60181, term60181.getClass(), "itsConst", null);
        setField(term60181, term60181.getClass(), "itsVariableNames", null);
        setIntField(term60181, term60181.getClass(), "varStart", 0);
        setField(term60181, term60181.getClass(), "compilerData", null);
        setIntField(term60181, term60181.getClass(), "type", 4);
        setField(term60181, term60181.getClass(), "next", null);
        setDoubleField(term60182, term60182.getClass(), "number", 0.0);
        setIntField(term60182, term60182.getClass(), "type", 0);
        setField(term60182, term60182.getClass(), "next", null);
        setField(term60182, term60182.getClass(), "first", null);
        setField(term60182, term60182.getClass(), "last", null);
        setField(term60182, term60182.getClass(), "propListHead", null);
        setIntField(term60182, term60182.getClass(), "sourcePosition", 0);
        setField(term60182, term60182.getClass(), "jsType", null);
        setField(term60182, term60182.getClass(), "parent", null);
        setField(term60181, term60181.getClass(), "first", term60182);
        setField(term60181, term60181.getClass(), "last", null);
        setField(term60181, term60181.getClass(), "propListHead", null);
        setIntField(term60181, term60181.getClass(), "sourcePosition", 0);
        setField(term60181, term60181.getClass(), "jsType", null);
        setField(term60181, term60181.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term43345;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term43345, term60181));
        assertTrue(recursiveEquals(retValue, false));
    }

};


