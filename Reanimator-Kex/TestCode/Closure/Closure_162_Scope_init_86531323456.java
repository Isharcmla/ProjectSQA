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
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Scope_init_86531323456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5274;
     Object term5360;
     Object term5498;
     Object term5502;
     Object term5503;

    public Scope_init_86531323456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5056 = new HashMap();
        Object term5008 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term5130 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term5200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5008, term5008.getClass(), "vars", term5056);
        setField(term5008, term5008.getClass(), "parent", term5130);
        setField(term5008, term5008.getClass(), "rootNode", term5200);
        term5274 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term5274, term5274.getClass(), "rootNode", null);
        term5360 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        LinkedHashMap term5499 = new LinkedHashMap();
        term5498 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term5500 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term5501 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term5498, term5498.getClass(), "vars", term5499);
        setField(term5500, term5500.getClass(), "vars", null);
        setField(term5500, term5500.getClass(), "parent", null);
        setIntField(term5500, term5500.getClass(), "depth", 0);
        setField(term5500, term5500.getClass(), "rootNode", null);
        setField(term5500, term5500.getClass(), "thisType", null);
        setBooleanField(term5500, term5500.getClass(), "isBottom", false);
        setField(term5500, term5500.getClass(), "arguments", null);
        setField(term5498, term5498.getClass(), "parent", term5500);
        setIntField(term5498, term5498.getClass(), "depth", 1);
        setField(term5501, term5501.getClass(), "functionName", null);
        setBooleanField(term5501, term5501.getClass(), "itsNeedsActivation", false);
        setIntField(term5501, term5501.getClass(), "itsFunctionType", 0);
        setBooleanField(term5501, term5501.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term5501, term5501.getClass(), "encodedSourceStart", 0);
        setIntField(term5501, term5501.getClass(), "encodedSourceEnd", 0);
        setField(term5501, term5501.getClass(), "sourceName", null);
        setIntField(term5501, term5501.getClass(), "baseLineno", 0);
        setIntField(term5501, term5501.getClass(), "endLineno", 0);
        setField(term5501, term5501.getClass(), "functions", null);
        setField(term5501, term5501.getClass(), "regexps", null);
        setField(term5501, term5501.getClass(), "itsVariables", null);
        setField(term5501, term5501.getClass(), "itsConst", null);
        setField(term5501, term5501.getClass(), "itsVariableNames", null);
        setIntField(term5501, term5501.getClass(), "varStart", 0);
        setField(term5501, term5501.getClass(), "compilerData", null);
        setIntField(term5501, term5501.getClass(), "type", 0);
        setField(term5501, term5501.getClass(), "next", null);
        setField(term5501, term5501.getClass(), "first", null);
        setField(term5501, term5501.getClass(), "last", null);
        setField(term5501, term5501.getClass(), "propListHead", null);
        setIntField(term5501, term5501.getClass(), "sourcePosition", 0);
        setField(term5501, term5501.getClass(), "jsType", null);
        setField(term5501, term5501.getClass(), "parent", null);
        setField(term5498, term5498.getClass(), "rootNode", term5501);
        setField(term5498, term5498.getClass(), "thisType", null);
        setBooleanField(term5498, term5498.getClass(), "isBottom", false);
        setField(term5498, term5498.getClass(), "arguments", null);
        term5502 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term5502, term5502.getClass(), "vars", null);
        setField(term5502, term5502.getClass(), "parent", null);
        setIntField(term5502, term5502.getClass(), "depth", 0);
        setField(term5502, term5502.getClass(), "rootNode", null);
        setField(term5502, term5502.getClass(), "thisType", null);
        setBooleanField(term5502, term5502.getClass(), "isBottom", false);
        setField(term5502, term5502.getClass(), "arguments", null);
        term5503 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term5503, term5503.getClass(), "functionName", null);
        setBooleanField(term5503, term5503.getClass(), "itsNeedsActivation", false);
        setIntField(term5503, term5503.getClass(), "itsFunctionType", 0);
        setBooleanField(term5503, term5503.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term5503, term5503.getClass(), "encodedSourceStart", 0);
        setIntField(term5503, term5503.getClass(), "encodedSourceEnd", 0);
        setField(term5503, term5503.getClass(), "sourceName", null);
        setIntField(term5503, term5503.getClass(), "baseLineno", 0);
        setIntField(term5503, term5503.getClass(), "endLineno", 0);
        setField(term5503, term5503.getClass(), "functions", null);
        setField(term5503, term5503.getClass(), "regexps", null);
        setField(term5503, term5503.getClass(), "itsVariables", null);
        setField(term5503, term5503.getClass(), "itsConst", null);
        setField(term5503, term5503.getClass(), "itsVariableNames", null);
        setIntField(term5503, term5503.getClass(), "varStart", 0);
        setField(term5503, term5503.getClass(), "compilerData", null);
        setIntField(term5503, term5503.getClass(), "type", 0);
        setField(term5503, term5503.getClass(), "next", null);
        setField(term5503, term5503.getClass(), "first", null);
        setField(term5503, term5503.getClass(), "last", null);
        setField(term5503, term5503.getClass(), "propListHead", null);
        setIntField(term5503, term5503.getClass(), "sourcePosition", 0);
        setField(term5503, term5503.getClass(), "jsType", null);
        setField(term5503, term5503.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term5274;
        args[1] = term5360;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5498));
        assertTrue(recursiveEquals(term5274, term5502));
        assertTrue(recursiveEquals(term5360, term5503));
    }

};


