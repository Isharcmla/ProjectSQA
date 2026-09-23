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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425156;
     Object term425242;
     Object term425914;
     Object term425916;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term425156 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term425242 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term425328 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term425242, term425242.getClass(), "type", 100);
        setField(term425242, term425242.getClass(), "first", term425328);
        term425914 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term425915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term425914, term425914.getClass(), "functionName", null);
        setBooleanField(term425914, term425914.getClass(), "itsNeedsActivation", false);
        setIntField(term425914, term425914.getClass(), "itsFunctionType", 0);
        setBooleanField(term425914, term425914.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term425914, term425914.getClass(), "encodedSourceStart", 0);
        setIntField(term425914, term425914.getClass(), "encodedSourceEnd", 0);
        setField(term425914, term425914.getClass(), "sourceName", null);
        setIntField(term425914, term425914.getClass(), "baseLineno", 0);
        setIntField(term425914, term425914.getClass(), "endLineno", 0);
        setField(term425914, term425914.getClass(), "functions", null);
        setField(term425914, term425914.getClass(), "regexps", null);
        setField(term425914, term425914.getClass(), "itsVariables", null);
        setField(term425914, term425914.getClass(), "itsConst", null);
        setField(term425914, term425914.getClass(), "itsVariableNames", null);
        setIntField(term425914, term425914.getClass(), "varStart", 0);
        setField(term425914, term425914.getClass(), "compilerData", null);
        setIntField(term425914, term425914.getClass(), "type", 100);
        setField(term425914, term425914.getClass(), "next", null);
        setField(term425915, term425915.getClass(), "functionName", null);
        setBooleanField(term425915, term425915.getClass(), "itsNeedsActivation", false);
        setIntField(term425915, term425915.getClass(), "itsFunctionType", 0);
        setBooleanField(term425915, term425915.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term425915, term425915.getClass(), "encodedSourceStart", 0);
        setIntField(term425915, term425915.getClass(), "encodedSourceEnd", 0);
        setField(term425915, term425915.getClass(), "sourceName", null);
        setIntField(term425915, term425915.getClass(), "baseLineno", 0);
        setIntField(term425915, term425915.getClass(), "endLineno", 0);
        setField(term425915, term425915.getClass(), "functions", null);
        setField(term425915, term425915.getClass(), "regexps", null);
        setField(term425915, term425915.getClass(), "itsVariables", null);
        setField(term425915, term425915.getClass(), "itsConst", null);
        setField(term425915, term425915.getClass(), "itsVariableNames", null);
        setIntField(term425915, term425915.getClass(), "varStart", 0);
        setField(term425915, term425915.getClass(), "compilerData", null);
        setIntField(term425915, term425915.getClass(), "type", 0);
        setField(term425915, term425915.getClass(), "next", null);
        setField(term425915, term425915.getClass(), "first", null);
        setField(term425915, term425915.getClass(), "last", null);
        setField(term425915, term425915.getClass(), "propListHead", null);
        setIntField(term425915, term425915.getClass(), "sourcePosition", 0);
        setField(term425915, term425915.getClass(), "jsType", null);
        setField(term425915, term425915.getClass(), "parent", null);
        setField(term425914, term425914.getClass(), "first", term425915);
        setField(term425914, term425914.getClass(), "last", null);
        setField(term425914, term425914.getClass(), "propListHead", null);
        setIntField(term425914, term425914.getClass(), "sourcePosition", 0);
        setField(term425914, term425914.getClass(), "jsType", null);
        setField(term425914, term425914.getClass(), "parent", null);
        term425916 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term425916, term425916.getClass(), "functionName", null);
        setBooleanField(term425916, term425916.getClass(), "itsNeedsActivation", false);
        setIntField(term425916, term425916.getClass(), "itsFunctionType", 0);
        setBooleanField(term425916, term425916.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term425916, term425916.getClass(), "encodedSourceStart", 0);
        setIntField(term425916, term425916.getClass(), "encodedSourceEnd", 0);
        setField(term425916, term425916.getClass(), "sourceName", null);
        setIntField(term425916, term425916.getClass(), "baseLineno", 0);
        setIntField(term425916, term425916.getClass(), "endLineno", 0);
        setField(term425916, term425916.getClass(), "functions", null);
        setField(term425916, term425916.getClass(), "regexps", null);
        setField(term425916, term425916.getClass(), "itsVariables", null);
        setField(term425916, term425916.getClass(), "itsConst", null);
        setField(term425916, term425916.getClass(), "itsVariableNames", null);
        setIntField(term425916, term425916.getClass(), "varStart", 0);
        setField(term425916, term425916.getClass(), "compilerData", null);
        setIntField(term425916, term425916.getClass(), "type", 0);
        setField(term425916, term425916.getClass(), "next", null);
        setField(term425916, term425916.getClass(), "first", null);
        setField(term425916, term425916.getClass(), "last", null);
        setField(term425916, term425916.getClass(), "propListHead", null);
        setIntField(term425916, term425916.getClass(), "sourcePosition", 0);
        setField(term425916, term425916.getClass(), "jsType", null);
        setField(term425916, term425916.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term425156;
        args[1] = term425242;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term425156, term425914));
        assertTrue(recursiveEquals(term425242, term425916));
        assertTrue(recursiveEquals(retValue, true));
    }

};


