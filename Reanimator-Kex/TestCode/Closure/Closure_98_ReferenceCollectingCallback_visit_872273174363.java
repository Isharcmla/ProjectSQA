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

public class ReferenceCollectingCallback_visit_872273174363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94455;
     Object term94670;
     Object term94627;
     Object term95093;
     Object term95094;
     Object term95095;

    public ReferenceCollectingCallback_visit_872273174363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94455 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term94670 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term94670, term94670.getClass(), "type", 98);
        term94627 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term94627, term94627.getClass(), "type", 98);
        setField(term94627, term94627.getClass(), "first", term94670);
        term95093 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term95093, term95093.getClass(), "referenceMap", null);
        setField(term95093, term95093.getClass(), "blockStack", null);
        setField(term95093, term95093.getClass(), "behavior", null);
        setField(term95093, term95093.getClass(), "compiler", null);
        setField(term95093, term95093.getClass(), "varFilter", null);
        term95094 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term95094, term95094.getClass(), "functionName", null);
        setBooleanField(term95094, term95094.getClass(), "itsNeedsActivation", false);
        setIntField(term95094, term95094.getClass(), "itsFunctionType", 0);
        setBooleanField(term95094, term95094.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term95094, term95094.getClass(), "encodedSourceStart", 0);
        setIntField(term95094, term95094.getClass(), "encodedSourceEnd", 0);
        setField(term95094, term95094.getClass(), "sourceName", null);
        setIntField(term95094, term95094.getClass(), "baseLineno", 0);
        setIntField(term95094, term95094.getClass(), "endLineno", 0);
        setField(term95094, term95094.getClass(), "functions", null);
        setField(term95094, term95094.getClass(), "regexps", null);
        setField(term95094, term95094.getClass(), "itsVariables", null);
        setField(term95094, term95094.getClass(), "itsConst", null);
        setField(term95094, term95094.getClass(), "itsVariableNames", null);
        setIntField(term95094, term95094.getClass(), "varStart", 0);
        setField(term95094, term95094.getClass(), "compilerData", null);
        setIntField(term95094, term95094.getClass(), "type", 98);
        setField(term95094, term95094.getClass(), "next", null);
        setField(term95094, term95094.getClass(), "first", null);
        setField(term95094, term95094.getClass(), "last", null);
        setField(term95094, term95094.getClass(), "propListHead", null);
        setIntField(term95094, term95094.getClass(), "sourcePosition", 0);
        setField(term95094, term95094.getClass(), "jsType", null);
        setField(term95094, term95094.getClass(), "parent", null);
        term95095 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term95096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term95095, term95095.getClass(), "functionName", null);
        setBooleanField(term95095, term95095.getClass(), "itsNeedsActivation", false);
        setIntField(term95095, term95095.getClass(), "itsFunctionType", 0);
        setBooleanField(term95095, term95095.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term95095, term95095.getClass(), "encodedSourceStart", 0);
        setIntField(term95095, term95095.getClass(), "encodedSourceEnd", 0);
        setField(term95095, term95095.getClass(), "sourceName", null);
        setIntField(term95095, term95095.getClass(), "baseLineno", 0);
        setIntField(term95095, term95095.getClass(), "endLineno", 0);
        setField(term95095, term95095.getClass(), "functions", null);
        setField(term95095, term95095.getClass(), "regexps", null);
        setField(term95095, term95095.getClass(), "itsVariables", null);
        setField(term95095, term95095.getClass(), "itsConst", null);
        setField(term95095, term95095.getClass(), "itsVariableNames", null);
        setIntField(term95095, term95095.getClass(), "varStart", 0);
        setField(term95095, term95095.getClass(), "compilerData", null);
        setIntField(term95095, term95095.getClass(), "type", 98);
        setField(term95095, term95095.getClass(), "next", null);
        setField(term95096, term95096.getClass(), "functionName", null);
        setBooleanField(term95096, term95096.getClass(), "itsNeedsActivation", false);
        setIntField(term95096, term95096.getClass(), "itsFunctionType", 0);
        setBooleanField(term95096, term95096.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term95096, term95096.getClass(), "encodedSourceStart", 0);
        setIntField(term95096, term95096.getClass(), "encodedSourceEnd", 0);
        setField(term95096, term95096.getClass(), "sourceName", null);
        setIntField(term95096, term95096.getClass(), "baseLineno", 0);
        setIntField(term95096, term95096.getClass(), "endLineno", 0);
        setField(term95096, term95096.getClass(), "functions", null);
        setField(term95096, term95096.getClass(), "regexps", null);
        setField(term95096, term95096.getClass(), "itsVariables", null);
        setField(term95096, term95096.getClass(), "itsConst", null);
        setField(term95096, term95096.getClass(), "itsVariableNames", null);
        setIntField(term95096, term95096.getClass(), "varStart", 0);
        setField(term95096, term95096.getClass(), "compilerData", null);
        setIntField(term95096, term95096.getClass(), "type", 98);
        setField(term95096, term95096.getClass(), "next", null);
        setField(term95096, term95096.getClass(), "first", null);
        setField(term95096, term95096.getClass(), "last", null);
        setField(term95096, term95096.getClass(), "propListHead", null);
        setIntField(term95096, term95096.getClass(), "sourcePosition", 0);
        setField(term95096, term95096.getClass(), "jsType", null);
        setField(term95096, term95096.getClass(), "parent", null);
        setField(term95095, term95095.getClass(), "first", term95096);
        setField(term95095, term95095.getClass(), "last", null);
        setField(term95095, term95095.getClass(), "propListHead", null);
        setIntField(term95095, term95095.getClass(), "sourcePosition", 0);
        setField(term95095, term95095.getClass(), "jsType", null);
        setField(term95095, term95095.getClass(), "parent", null);
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
        args[1] = term94670;
        args[2] = term94627;
        callMethod(klass, "visit", argTypes, term94455, args);
        assertTrue(recursiveEquals(term94455, term95093));
        assertTrue(recursiveEquals(term94670, term95095));
        assertTrue(recursiveEquals(term94627, null));
    }

};


