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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169876;
     Object term170916;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169876 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169962 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term170054 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170178 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term170264 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term169876, term169876.getClass(), "type", 33);
        setIntField(term169962, term169962.getClass(), "type", 33);
        setField(term170054, term170054.getClass(), "str", "prototype");
        setField(term169962, term169962.getClass(), "last", term170054);
        setIntField(term170178, term170178.getClass(), "type", 33);
        setField(term170178, term170178.getClass(), "first", term170264);
        setField(term169962, term169962.getClass(), "first", term170178);
        setField(term169876, term169876.getClass(), "first", term169962);
        term170916 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term170917 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term170918 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term170919 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term170920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term170916, term170916.getClass(), "functionName", null);
        setBooleanField(term170916, term170916.getClass(), "itsNeedsActivation", false);
        setIntField(term170916, term170916.getClass(), "itsFunctionType", 0);
        setBooleanField(term170916, term170916.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term170916, term170916.getClass(), "encodedSourceStart", 0);
        setIntField(term170916, term170916.getClass(), "encodedSourceEnd", 0);
        setField(term170916, term170916.getClass(), "sourceName", null);
        setIntField(term170916, term170916.getClass(), "baseLineno", 0);
        setIntField(term170916, term170916.getClass(), "endLineno", 0);
        setField(term170916, term170916.getClass(), "functions", null);
        setField(term170916, term170916.getClass(), "regexps", null);
        setField(term170916, term170916.getClass(), "itsVariables", null);
        setField(term170916, term170916.getClass(), "itsConst", null);
        setField(term170916, term170916.getClass(), "itsVariableNames", null);
        setIntField(term170916, term170916.getClass(), "varStart", 0);
        setField(term170916, term170916.getClass(), "compilerData", null);
        setIntField(term170916, term170916.getClass(), "type", 33);
        setField(term170916, term170916.getClass(), "next", null);
        setField(term170917, term170917.getClass(), "functionName", null);
        setBooleanField(term170917, term170917.getClass(), "itsNeedsActivation", false);
        setIntField(term170917, term170917.getClass(), "itsFunctionType", 0);
        setBooleanField(term170917, term170917.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term170917, term170917.getClass(), "encodedSourceStart", 0);
        setIntField(term170917, term170917.getClass(), "encodedSourceEnd", 0);
        setField(term170917, term170917.getClass(), "sourceName", null);
        setIntField(term170917, term170917.getClass(), "baseLineno", 0);
        setIntField(term170917, term170917.getClass(), "endLineno", 0);
        setField(term170917, term170917.getClass(), "functions", null);
        setField(term170917, term170917.getClass(), "regexps", null);
        setField(term170917, term170917.getClass(), "itsVariables", null);
        setField(term170917, term170917.getClass(), "itsConst", null);
        setField(term170917, term170917.getClass(), "itsVariableNames", null);
        setIntField(term170917, term170917.getClass(), "varStart", 0);
        setField(term170917, term170917.getClass(), "compilerData", null);
        setIntField(term170917, term170917.getClass(), "type", 33);
        setField(term170917, term170917.getClass(), "next", null);
        setField(term170918, term170918.getClass(), "functionName", null);
        setBooleanField(term170918, term170918.getClass(), "itsNeedsActivation", false);
        setIntField(term170918, term170918.getClass(), "itsFunctionType", 0);
        setBooleanField(term170918, term170918.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term170918, term170918.getClass(), "encodedSourceStart", 0);
        setIntField(term170918, term170918.getClass(), "encodedSourceEnd", 0);
        setField(term170918, term170918.getClass(), "sourceName", null);
        setIntField(term170918, term170918.getClass(), "baseLineno", 0);
        setIntField(term170918, term170918.getClass(), "endLineno", 0);
        setField(term170918, term170918.getClass(), "functions", null);
        setField(term170918, term170918.getClass(), "regexps", null);
        setField(term170918, term170918.getClass(), "itsVariables", null);
        setField(term170918, term170918.getClass(), "itsConst", null);
        setField(term170918, term170918.getClass(), "itsVariableNames", null);
        setIntField(term170918, term170918.getClass(), "varStart", 0);
        setField(term170918, term170918.getClass(), "compilerData", null);
        setIntField(term170918, term170918.getClass(), "type", 33);
        setField(term170918, term170918.getClass(), "next", null);
        setField(term170919, term170919.getClass(), "functionName", null);
        setBooleanField(term170919, term170919.getClass(), "itsNeedsActivation", false);
        setIntField(term170919, term170919.getClass(), "itsFunctionType", 0);
        setBooleanField(term170919, term170919.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term170919, term170919.getClass(), "encodedSourceStart", 0);
        setIntField(term170919, term170919.getClass(), "encodedSourceEnd", 0);
        setField(term170919, term170919.getClass(), "sourceName", null);
        setIntField(term170919, term170919.getClass(), "baseLineno", 0);
        setIntField(term170919, term170919.getClass(), "endLineno", 0);
        setField(term170919, term170919.getClass(), "functions", null);
        setField(term170919, term170919.getClass(), "regexps", null);
        setField(term170919, term170919.getClass(), "itsVariables", null);
        setField(term170919, term170919.getClass(), "itsConst", null);
        setField(term170919, term170919.getClass(), "itsVariableNames", null);
        setIntField(term170919, term170919.getClass(), "varStart", 0);
        setField(term170919, term170919.getClass(), "compilerData", null);
        setIntField(term170919, term170919.getClass(), "type", 0);
        setField(term170919, term170919.getClass(), "next", null);
        setField(term170919, term170919.getClass(), "first", null);
        setField(term170919, term170919.getClass(), "last", null);
        setField(term170919, term170919.getClass(), "propListHead", null);
        setIntField(term170919, term170919.getClass(), "sourcePosition", 0);
        setField(term170919, term170919.getClass(), "jsType", null);
        setField(term170919, term170919.getClass(), "parent", null);
        setField(term170918, term170918.getClass(), "first", term170919);
        setField(term170918, term170918.getClass(), "last", null);
        setField(term170918, term170918.getClass(), "propListHead", null);
        setIntField(term170918, term170918.getClass(), "sourcePosition", 0);
        setField(term170918, term170918.getClass(), "jsType", null);
        setField(term170918, term170918.getClass(), "parent", null);
        setField(term170917, term170917.getClass(), "first", term170918);
        setField(term170920, term170920.getClass(), "str", "prototype");
        setIntField(term170920, term170920.getClass(), "type", 0);
        setField(term170920, term170920.getClass(), "next", null);
        setField(term170920, term170920.getClass(), "first", null);
        setField(term170920, term170920.getClass(), "last", null);
        setField(term170920, term170920.getClass(), "propListHead", null);
        setIntField(term170920, term170920.getClass(), "sourcePosition", 0);
        setField(term170920, term170920.getClass(), "jsType", null);
        setField(term170920, term170920.getClass(), "parent", null);
        setField(term170917, term170917.getClass(), "last", term170920);
        setField(term170917, term170917.getClass(), "propListHead", null);
        setIntField(term170917, term170917.getClass(), "sourcePosition", 0);
        setField(term170917, term170917.getClass(), "jsType", null);
        setField(term170917, term170917.getClass(), "parent", null);
        setField(term170916, term170916.getClass(), "first", term170917);
        setField(term170916, term170916.getClass(), "last", null);
        setField(term170916, term170916.getClass(), "propListHead", null);
        setIntField(term170916, term170916.getClass(), "sourcePosition", 0);
        setField(term170916, term170916.getClass(), "jsType", null);
        setField(term170916, term170916.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term169876;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term169876, term170916));
        assertTrue(recursiveEquals(retValue, null));
    }

};


