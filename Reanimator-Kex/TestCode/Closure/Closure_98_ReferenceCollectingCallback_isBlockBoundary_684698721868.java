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

public class ReferenceCollectingCallback_isBlockBoundary_684698721868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229513;
     Object term229599;
     Object term230057;
     Object term230059;

    public ReferenceCollectingCallback_isBlockBoundary_684698721868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229513 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term229599 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term229685 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term229599, term229599.getClass(), "type", 101);
        setField(term229599, term229599.getClass(), "first", term229685);
        term230057 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term230058 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term230057, term230057.getClass(), "functionName", null);
        setBooleanField(term230057, term230057.getClass(), "itsNeedsActivation", false);
        setIntField(term230057, term230057.getClass(), "itsFunctionType", 0);
        setBooleanField(term230057, term230057.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term230057, term230057.getClass(), "encodedSourceStart", 0);
        setIntField(term230057, term230057.getClass(), "encodedSourceEnd", 0);
        setField(term230057, term230057.getClass(), "sourceName", null);
        setIntField(term230057, term230057.getClass(), "baseLineno", 0);
        setIntField(term230057, term230057.getClass(), "endLineno", 0);
        setField(term230057, term230057.getClass(), "functions", null);
        setField(term230057, term230057.getClass(), "regexps", null);
        setField(term230057, term230057.getClass(), "itsVariables", null);
        setField(term230057, term230057.getClass(), "itsConst", null);
        setField(term230057, term230057.getClass(), "itsVariableNames", null);
        setIntField(term230057, term230057.getClass(), "varStart", 0);
        setField(term230057, term230057.getClass(), "compilerData", null);
        setIntField(term230057, term230057.getClass(), "type", 101);
        setField(term230057, term230057.getClass(), "next", null);
        setField(term230058, term230058.getClass(), "functionName", null);
        setBooleanField(term230058, term230058.getClass(), "itsNeedsActivation", false);
        setIntField(term230058, term230058.getClass(), "itsFunctionType", 0);
        setBooleanField(term230058, term230058.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term230058, term230058.getClass(), "encodedSourceStart", 0);
        setIntField(term230058, term230058.getClass(), "encodedSourceEnd", 0);
        setField(term230058, term230058.getClass(), "sourceName", null);
        setIntField(term230058, term230058.getClass(), "baseLineno", 0);
        setIntField(term230058, term230058.getClass(), "endLineno", 0);
        setField(term230058, term230058.getClass(), "functions", null);
        setField(term230058, term230058.getClass(), "regexps", null);
        setField(term230058, term230058.getClass(), "itsVariables", null);
        setField(term230058, term230058.getClass(), "itsConst", null);
        setField(term230058, term230058.getClass(), "itsVariableNames", null);
        setIntField(term230058, term230058.getClass(), "varStart", 0);
        setField(term230058, term230058.getClass(), "compilerData", null);
        setIntField(term230058, term230058.getClass(), "type", 0);
        setField(term230058, term230058.getClass(), "next", null);
        setField(term230058, term230058.getClass(), "first", null);
        setField(term230058, term230058.getClass(), "last", null);
        setField(term230058, term230058.getClass(), "propListHead", null);
        setIntField(term230058, term230058.getClass(), "sourcePosition", 0);
        setField(term230058, term230058.getClass(), "jsType", null);
        setField(term230058, term230058.getClass(), "parent", null);
        setField(term230057, term230057.getClass(), "first", term230058);
        setField(term230057, term230057.getClass(), "last", null);
        setField(term230057, term230057.getClass(), "propListHead", null);
        setIntField(term230057, term230057.getClass(), "sourcePosition", 0);
        setField(term230057, term230057.getClass(), "jsType", null);
        setField(term230057, term230057.getClass(), "parent", null);
        term230059 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term230059, term230059.getClass(), "functionName", null);
        setBooleanField(term230059, term230059.getClass(), "itsNeedsActivation", false);
        setIntField(term230059, term230059.getClass(), "itsFunctionType", 0);
        setBooleanField(term230059, term230059.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term230059, term230059.getClass(), "encodedSourceStart", 0);
        setIntField(term230059, term230059.getClass(), "encodedSourceEnd", 0);
        setField(term230059, term230059.getClass(), "sourceName", null);
        setIntField(term230059, term230059.getClass(), "baseLineno", 0);
        setIntField(term230059, term230059.getClass(), "endLineno", 0);
        setField(term230059, term230059.getClass(), "functions", null);
        setField(term230059, term230059.getClass(), "regexps", null);
        setField(term230059, term230059.getClass(), "itsVariables", null);
        setField(term230059, term230059.getClass(), "itsConst", null);
        setField(term230059, term230059.getClass(), "itsVariableNames", null);
        setIntField(term230059, term230059.getClass(), "varStart", 0);
        setField(term230059, term230059.getClass(), "compilerData", null);
        setIntField(term230059, term230059.getClass(), "type", 0);
        setField(term230059, term230059.getClass(), "next", null);
        setField(term230059, term230059.getClass(), "first", null);
        setField(term230059, term230059.getClass(), "last", null);
        setField(term230059, term230059.getClass(), "propListHead", null);
        setIntField(term230059, term230059.getClass(), "sourcePosition", 0);
        setField(term230059, term230059.getClass(), "jsType", null);
        setField(term230059, term230059.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term229513;
        args[1] = term229599;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term229513, term230057));
        assertTrue(recursiveEquals(term229599, term230059));
        assertTrue(recursiveEquals(retValue, true));
    }

};


