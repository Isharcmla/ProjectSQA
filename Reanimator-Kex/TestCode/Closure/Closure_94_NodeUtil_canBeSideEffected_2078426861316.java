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

public class NodeUtil_canBeSideEffected_2078426861316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27730;
     Object term27949;

    public NodeUtil_canBeSideEffected_2078426861316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27730 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term27816 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term27730, term27730.getClass(), "type", 4);
        setField(term27730, term27730.getClass(), "first", term27816);
        term27949 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term27950 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term27949, term27949.getClass(), "functionName", null);
        setBooleanField(term27949, term27949.getClass(), "itsNeedsActivation", false);
        setIntField(term27949, term27949.getClass(), "itsFunctionType", 0);
        setBooleanField(term27949, term27949.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term27949, term27949.getClass(), "encodedSourceStart", 0);
        setIntField(term27949, term27949.getClass(), "encodedSourceEnd", 0);
        setField(term27949, term27949.getClass(), "sourceName", null);
        setIntField(term27949, term27949.getClass(), "baseLineno", 0);
        setIntField(term27949, term27949.getClass(), "endLineno", 0);
        setField(term27949, term27949.getClass(), "functions", null);
        setField(term27949, term27949.getClass(), "regexps", null);
        setField(term27949, term27949.getClass(), "itsVariables", null);
        setField(term27949, term27949.getClass(), "itsConst", null);
        setField(term27949, term27949.getClass(), "itsVariableNames", null);
        setIntField(term27949, term27949.getClass(), "varStart", 0);
        setField(term27949, term27949.getClass(), "compilerData", null);
        setIntField(term27949, term27949.getClass(), "type", 4);
        setField(term27949, term27949.getClass(), "next", null);
        setField(term27950, term27950.getClass(), "functionName", null);
        setBooleanField(term27950, term27950.getClass(), "itsNeedsActivation", false);
        setIntField(term27950, term27950.getClass(), "itsFunctionType", 0);
        setBooleanField(term27950, term27950.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term27950, term27950.getClass(), "encodedSourceStart", 0);
        setIntField(term27950, term27950.getClass(), "encodedSourceEnd", 0);
        setField(term27950, term27950.getClass(), "sourceName", null);
        setIntField(term27950, term27950.getClass(), "baseLineno", 0);
        setIntField(term27950, term27950.getClass(), "endLineno", 0);
        setField(term27950, term27950.getClass(), "functions", null);
        setField(term27950, term27950.getClass(), "regexps", null);
        setField(term27950, term27950.getClass(), "itsVariables", null);
        setField(term27950, term27950.getClass(), "itsConst", null);
        setField(term27950, term27950.getClass(), "itsVariableNames", null);
        setIntField(term27950, term27950.getClass(), "varStart", 0);
        setField(term27950, term27950.getClass(), "compilerData", null);
        setIntField(term27950, term27950.getClass(), "type", 0);
        setField(term27950, term27950.getClass(), "next", null);
        setField(term27950, term27950.getClass(), "first", null);
        setField(term27950, term27950.getClass(), "last", null);
        setField(term27950, term27950.getClass(), "propListHead", null);
        setIntField(term27950, term27950.getClass(), "sourcePosition", 0);
        setField(term27950, term27950.getClass(), "jsType", null);
        setField(term27950, term27950.getClass(), "parent", null);
        setField(term27949, term27949.getClass(), "first", term27950);
        setField(term27949, term27949.getClass(), "last", null);
        setField(term27949, term27949.getClass(), "propListHead", null);
        setIntField(term27949, term27949.getClass(), "sourcePosition", 0);
        setField(term27949, term27949.getClass(), "jsType", null);
        setField(term27949, term27949.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term27730;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term27730, term27949));
        assertTrue(recursiveEquals(retValue, false));
    }

};


