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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450831;
     Object term450923;
     Object term453049;
     Object term453050;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term450831 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term450923 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term450923, term450923.getClass(), "type", 12);
        term453049 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term453049, term453049.getClass(), "number", 0.0);
        setIntField(term453049, term453049.getClass(), "type", 12);
        setField(term453049, term453049.getClass(), "next", null);
        setField(term453049, term453049.getClass(), "first", null);
        setField(term453049, term453049.getClass(), "last", null);
        setField(term453049, term453049.getClass(), "propListHead", null);
        setIntField(term453049, term453049.getClass(), "sourcePosition", 0);
        setField(term453049, term453049.getClass(), "jsType", null);
        setField(term453049, term453049.getClass(), "parent", null);
        term453050 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term453050, term453050.getClass(), "functionName", null);
        setBooleanField(term453050, term453050.getClass(), "itsNeedsActivation", false);
        setIntField(term453050, term453050.getClass(), "itsFunctionType", 0);
        setBooleanField(term453050, term453050.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term453050, term453050.getClass(), "encodedSourceStart", 0);
        setIntField(term453050, term453050.getClass(), "encodedSourceEnd", 0);
        setField(term453050, term453050.getClass(), "sourceName", null);
        setIntField(term453050, term453050.getClass(), "baseLineno", 0);
        setIntField(term453050, term453050.getClass(), "endLineno", 0);
        setField(term453050, term453050.getClass(), "functions", null);
        setField(term453050, term453050.getClass(), "regexps", null);
        setField(term453050, term453050.getClass(), "itsVariables", null);
        setField(term453050, term453050.getClass(), "itsConst", null);
        setField(term453050, term453050.getClass(), "itsVariableNames", null);
        setIntField(term453050, term453050.getClass(), "varStart", 0);
        setField(term453050, term453050.getClass(), "compilerData", null);
        setIntField(term453050, term453050.getClass(), "type", 0);
        setField(term453050, term453050.getClass(), "next", null);
        setField(term453050, term453050.getClass(), "first", null);
        setField(term453050, term453050.getClass(), "last", null);
        setField(term453050, term453050.getClass(), "propListHead", null);
        setIntField(term453050, term453050.getClass(), "sourcePosition", 0);
        setField(term453050, term453050.getClass(), "jsType", null);
        setField(term453050, term453050.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term450831;
        args[1] = term450923;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term450831, term453049));
        assertTrue(recursiveEquals(term450923, term453050));
        assertTrue(recursiveEquals(retValue, false));
    }

};


