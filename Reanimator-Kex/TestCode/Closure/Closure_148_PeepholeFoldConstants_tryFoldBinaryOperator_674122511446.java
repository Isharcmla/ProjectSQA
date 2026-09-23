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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91557;
     Object term91649;
     Object term91915;
     Object term91916;
     Object term91843;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91557 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term91649 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91741 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91827 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term91741, term91741.getClass(), "next", term91827);
        setIntField(term91741, term91741.getClass(), "type", 14);
        setField(term91649, term91649.getClass(), "first", term91741);
        setIntField(term91649, term91649.getClass(), "type", 14);
        term91915 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term91915, term91915.getClass(), "currentTraversal", null);
        term91916 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91917 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91918 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term91916, term91916.getClass(), "number", 0.0);
        setIntField(term91916, term91916.getClass(), "type", 14);
        setField(term91916, term91916.getClass(), "next", null);
        setDoubleField(term91917, term91917.getClass(), "number", 0.0);
        setIntField(term91917, term91917.getClass(), "type", 14);
        setField(term91918, term91918.getClass(), "functionName", null);
        setBooleanField(term91918, term91918.getClass(), "itsNeedsActivation", false);
        setIntField(term91918, term91918.getClass(), "itsFunctionType", 0);
        setBooleanField(term91918, term91918.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term91918, term91918.getClass(), "encodedSourceStart", 0);
        setIntField(term91918, term91918.getClass(), "encodedSourceEnd", 0);
        setField(term91918, term91918.getClass(), "sourceName", null);
        setIntField(term91918, term91918.getClass(), "baseLineno", 0);
        setIntField(term91918, term91918.getClass(), "endLineno", 0);
        setField(term91918, term91918.getClass(), "functions", null);
        setField(term91918, term91918.getClass(), "regexps", null);
        setField(term91918, term91918.getClass(), "itsVariables", null);
        setField(term91918, term91918.getClass(), "itsConst", null);
        setField(term91918, term91918.getClass(), "itsVariableNames", null);
        setIntField(term91918, term91918.getClass(), "varStart", 0);
        setField(term91918, term91918.getClass(), "compilerData", null);
        setIntField(term91918, term91918.getClass(), "type", 0);
        setField(term91918, term91918.getClass(), "next", null);
        setField(term91918, term91918.getClass(), "first", null);
        setField(term91918, term91918.getClass(), "last", null);
        setField(term91918, term91918.getClass(), "propListHead", null);
        setIntField(term91918, term91918.getClass(), "sourcePosition", 0);
        setField(term91918, term91918.getClass(), "jsType", null);
        setField(term91918, term91918.getClass(), "parent", null);
        setField(term91917, term91917.getClass(), "next", term91918);
        setField(term91917, term91917.getClass(), "first", null);
        setField(term91917, term91917.getClass(), "last", null);
        setField(term91917, term91917.getClass(), "propListHead", null);
        setIntField(term91917, term91917.getClass(), "sourcePosition", 0);
        setField(term91917, term91917.getClass(), "jsType", null);
        setField(term91917, term91917.getClass(), "parent", null);
        setField(term91916, term91916.getClass(), "first", term91917);
        setField(term91916, term91916.getClass(), "last", null);
        setField(term91916, term91916.getClass(), "propListHead", null);
        setIntField(term91916, term91916.getClass(), "sourcePosition", 0);
        setField(term91916, term91916.getClass(), "jsType", null);
        setField(term91916, term91916.getClass(), "parent", null);
        term91843 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91846 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91849 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term91843, term91843.getClass(), "number", 0.0);
        setIntField(term91843, term91843.getClass(), "type", 14);
        setField(term91843, term91843.getClass(), "next", null);
        setDoubleField(term91846, term91846.getClass(), "number", 0.0);
        setIntField(term91846, term91846.getClass(), "type", 14);
        setField(term91849, term91849.getClass(), "functionName", null);
        setBooleanField(term91849, term91849.getClass(), "itsNeedsActivation", false);
        setIntField(term91849, term91849.getClass(), "itsFunctionType", 0);
        setBooleanField(term91849, term91849.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term91849, term91849.getClass(), "encodedSourceStart", 0);
        setIntField(term91849, term91849.getClass(), "encodedSourceEnd", 0);
        setField(term91849, term91849.getClass(), "sourceName", null);
        setIntField(term91849, term91849.getClass(), "baseLineno", 0);
        setIntField(term91849, term91849.getClass(), "endLineno", 0);
        setField(term91849, term91849.getClass(), "functions", null);
        setField(term91849, term91849.getClass(), "regexps", null);
        setField(term91849, term91849.getClass(), "itsVariables", null);
        setField(term91849, term91849.getClass(), "itsConst", null);
        setField(term91849, term91849.getClass(), "itsVariableNames", null);
        setIntField(term91849, term91849.getClass(), "varStart", 0);
        setField(term91849, term91849.getClass(), "compilerData", null);
        setIntField(term91849, term91849.getClass(), "type", 0);
        setField(term91849, term91849.getClass(), "next", null);
        setField(term91849, term91849.getClass(), "first", null);
        setField(term91849, term91849.getClass(), "last", null);
        setField(term91849, term91849.getClass(), "propListHead", null);
        setIntField(term91849, term91849.getClass(), "sourcePosition", 0);
        setField(term91849, term91849.getClass(), "jsType", null);
        setField(term91849, term91849.getClass(), "parent", null);
        setField(term91846, term91846.getClass(), "next", term91849);
        setField(term91846, term91846.getClass(), "first", null);
        setField(term91846, term91846.getClass(), "last", null);
        setField(term91846, term91846.getClass(), "propListHead", null);
        setIntField(term91846, term91846.getClass(), "sourcePosition", 0);
        setField(term91846, term91846.getClass(), "jsType", null);
        setField(term91846, term91846.getClass(), "parent", null);
        setField(term91843, term91843.getClass(), "first", term91846);
        setField(term91843, term91843.getClass(), "last", null);
        setField(term91843, term91843.getClass(), "propListHead", null);
        setIntField(term91843, term91843.getClass(), "sourcePosition", 0);
        setField(term91843, term91843.getClass(), "jsType", null);
        setField(term91843, term91843.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term91649;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term91557, args);
        assertTrue(recursiveEquals(term91557, term91915));
        assertTrue(recursiveEquals(term91649, term91916));
        assertTrue(recursiveEquals(retValue, term91843));
    }

};


