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

public class TypeCheck_shouldTraverse_435604074203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94302;
     Object term94388;
     Object term94830;
     Object term94831;

    public TypeCheck_shouldTraverse_435604074203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94302 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term94388 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term94830 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term94830, term94830.getClass(), "compiler", null);
        setField(term94830, term94830.getClass(), "validator", null);
        setField(term94830, term94830.getClass(), "reverseInterpreter", null);
        setField(term94830, term94830.getClass(), "typeRegistry", null);
        setField(term94830, term94830.getClass(), "topScope", null);
        setField(term94830, term94830.getClass(), "scopeCreator", null);
        setField(term94830, term94830.getClass(), "reportMissingOverride", null);
        setField(term94830, term94830.getClass(), "reportUnknownTypes", null);
        setBooleanField(term94830, term94830.getClass(), "reportMissingProperties", false);
        setField(term94830, term94830.getClass(), "inferJSDocInfo", null);
        setIntField(term94830, term94830.getClass(), "typedCount", 0);
        setIntField(term94830, term94830.getClass(), "nullCount", 0);
        setIntField(term94830, term94830.getClass(), "unknownCount", 0);
        setBooleanField(term94830, term94830.getClass(), "inExterns", false);
        setIntField(term94830, term94830.getClass(), "noTypeCheckSection", 0);
        term94831 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term94831, term94831.getClass(), "functionName", null);
        setBooleanField(term94831, term94831.getClass(), "itsNeedsActivation", false);
        setIntField(term94831, term94831.getClass(), "itsFunctionType", 0);
        setBooleanField(term94831, term94831.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term94831, term94831.getClass(), "encodedSourceStart", 0);
        setIntField(term94831, term94831.getClass(), "encodedSourceEnd", 0);
        setField(term94831, term94831.getClass(), "sourceName", null);
        setIntField(term94831, term94831.getClass(), "baseLineno", 0);
        setIntField(term94831, term94831.getClass(), "endLineno", 0);
        setField(term94831, term94831.getClass(), "functions", null);
        setField(term94831, term94831.getClass(), "regexps", null);
        setField(term94831, term94831.getClass(), "itsVariables", null);
        setField(term94831, term94831.getClass(), "itsConst", null);
        setField(term94831, term94831.getClass(), "itsVariableNames", null);
        setIntField(term94831, term94831.getClass(), "varStart", 0);
        setField(term94831, term94831.getClass(), "compilerData", null);
        setIntField(term94831, term94831.getClass(), "type", 0);
        setField(term94831, term94831.getClass(), "next", null);
        setField(term94831, term94831.getClass(), "first", null);
        setField(term94831, term94831.getClass(), "last", null);
        setField(term94831, term94831.getClass(), "propListHead", null);
        setIntField(term94831, term94831.getClass(), "sourcePosition", 0);
        setField(term94831, term94831.getClass(), "jsType", null);
        setField(term94831, term94831.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term94388;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term94302, args);
        assertTrue(recursiveEquals(term94302, term94830));
        assertTrue(recursiveEquals(term94388, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


