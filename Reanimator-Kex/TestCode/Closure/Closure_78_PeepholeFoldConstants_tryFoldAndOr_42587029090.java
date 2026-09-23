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

public class PeepholeFoldConstants_tryFoldAndOr_42587029090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15374;
     Object term15460;
     Object term15546;
     Object term15801;
     Object term15802;
     Object term15803;
     Object term15763;

    public PeepholeFoldConstants_tryFoldAndOr_42587029090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15374 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term15460 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term15460, term15460.getClass(), "parent", null);
        setIntField(term15460, term15460.getClass(), "type", 0);
        term15546 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term15801 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term15801, term15801.getClass(), "currentTraversal", null);
        term15802 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term15802, term15802.getClass(), "functionName", null);
        setBooleanField(term15802, term15802.getClass(), "itsNeedsActivation", false);
        setIntField(term15802, term15802.getClass(), "itsFunctionType", 0);
        setBooleanField(term15802, term15802.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term15802, term15802.getClass(), "encodedSourceStart", 0);
        setIntField(term15802, term15802.getClass(), "encodedSourceEnd", 0);
        setField(term15802, term15802.getClass(), "sourceName", null);
        setIntField(term15802, term15802.getClass(), "baseLineno", 0);
        setIntField(term15802, term15802.getClass(), "endLineno", 0);
        setField(term15802, term15802.getClass(), "functions", null);
        setField(term15802, term15802.getClass(), "regexps", null);
        setField(term15802, term15802.getClass(), "itsVariables", null);
        setField(term15802, term15802.getClass(), "itsConst", null);
        setField(term15802, term15802.getClass(), "itsVariableNames", null);
        setIntField(term15802, term15802.getClass(), "varStart", 0);
        setField(term15802, term15802.getClass(), "compilerData", null);
        setIntField(term15802, term15802.getClass(), "type", 0);
        setField(term15802, term15802.getClass(), "next", null);
        setField(term15802, term15802.getClass(), "first", null);
        setField(term15802, term15802.getClass(), "last", null);
        setField(term15802, term15802.getClass(), "propListHead", null);
        setIntField(term15802, term15802.getClass(), "sourcePosition", 0);
        setField(term15802, term15802.getClass(), "jsType", null);
        setField(term15802, term15802.getClass(), "parent", null);
        term15803 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term15803, term15803.getClass(), "functionName", null);
        setBooleanField(term15803, term15803.getClass(), "itsNeedsActivation", false);
        setIntField(term15803, term15803.getClass(), "itsFunctionType", 0);
        setBooleanField(term15803, term15803.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term15803, term15803.getClass(), "encodedSourceStart", 0);
        setIntField(term15803, term15803.getClass(), "encodedSourceEnd", 0);
        setField(term15803, term15803.getClass(), "sourceName", null);
        setIntField(term15803, term15803.getClass(), "baseLineno", 0);
        setIntField(term15803, term15803.getClass(), "endLineno", 0);
        setField(term15803, term15803.getClass(), "functions", null);
        setField(term15803, term15803.getClass(), "regexps", null);
        setField(term15803, term15803.getClass(), "itsVariables", null);
        setField(term15803, term15803.getClass(), "itsConst", null);
        setField(term15803, term15803.getClass(), "itsVariableNames", null);
        setIntField(term15803, term15803.getClass(), "varStart", 0);
        setField(term15803, term15803.getClass(), "compilerData", null);
        setIntField(term15803, term15803.getClass(), "type", 0);
        setField(term15803, term15803.getClass(), "next", null);
        setField(term15803, term15803.getClass(), "first", null);
        setField(term15803, term15803.getClass(), "last", null);
        setField(term15803, term15803.getClass(), "propListHead", null);
        setIntField(term15803, term15803.getClass(), "sourcePosition", 0);
        setField(term15803, term15803.getClass(), "jsType", null);
        setField(term15803, term15803.getClass(), "parent", null);
        term15763 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term15763, term15763.getClass(), "functionName", null);
        setBooleanField(term15763, term15763.getClass(), "itsNeedsActivation", false);
        setIntField(term15763, term15763.getClass(), "itsFunctionType", 0);
        setBooleanField(term15763, term15763.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term15763, term15763.getClass(), "encodedSourceStart", 0);
        setIntField(term15763, term15763.getClass(), "encodedSourceEnd", 0);
        setField(term15763, term15763.getClass(), "sourceName", null);
        setIntField(term15763, term15763.getClass(), "baseLineno", 0);
        setIntField(term15763, term15763.getClass(), "endLineno", 0);
        setField(term15763, term15763.getClass(), "functions", null);
        setField(term15763, term15763.getClass(), "regexps", null);
        setField(term15763, term15763.getClass(), "itsVariables", null);
        setField(term15763, term15763.getClass(), "itsConst", null);
        setField(term15763, term15763.getClass(), "itsVariableNames", null);
        setIntField(term15763, term15763.getClass(), "varStart", 0);
        setField(term15763, term15763.getClass(), "compilerData", null);
        setIntField(term15763, term15763.getClass(), "type", 0);
        setField(term15763, term15763.getClass(), "next", null);
        setField(term15763, term15763.getClass(), "first", null);
        setField(term15763, term15763.getClass(), "last", null);
        setField(term15763, term15763.getClass(), "propListHead", null);
        setIntField(term15763, term15763.getClass(), "sourcePosition", 0);
        setField(term15763, term15763.getClass(), "jsType", null);
        setField(term15763, term15763.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term15460;
        args[1] = term15546;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term15374, args);
        assertTrue(recursiveEquals(term15374, term15801));
        assertTrue(recursiveEquals(term15460, term15802));
        assertTrue(recursiveEquals(term15546, term15803));
        assertTrue(recursiveEquals(retValue, term15763));
    }

};


