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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297628;
     Object term297714;
     Object term297837;
     Object term297838;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297628 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term297714 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term297714, term297714.getClass(), "type", 12);
        term297837 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term297837, term297837.getClass(), "functionName", null);
        setBooleanField(term297837, term297837.getClass(), "itsNeedsActivation", false);
        setIntField(term297837, term297837.getClass(), "itsFunctionType", 0);
        setBooleanField(term297837, term297837.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term297837, term297837.getClass(), "encodedSourceStart", 0);
        setIntField(term297837, term297837.getClass(), "encodedSourceEnd", 0);
        setField(term297837, term297837.getClass(), "sourceName", null);
        setIntField(term297837, term297837.getClass(), "baseLineno", 0);
        setIntField(term297837, term297837.getClass(), "endLineno", 0);
        setField(term297837, term297837.getClass(), "functions", null);
        setField(term297837, term297837.getClass(), "regexps", null);
        setField(term297837, term297837.getClass(), "itsVariables", null);
        setField(term297837, term297837.getClass(), "itsConst", null);
        setField(term297837, term297837.getClass(), "itsVariableNames", null);
        setIntField(term297837, term297837.getClass(), "varStart", 0);
        setField(term297837, term297837.getClass(), "compilerData", null);
        setIntField(term297837, term297837.getClass(), "type", 12);
        setField(term297837, term297837.getClass(), "next", null);
        setField(term297837, term297837.getClass(), "first", null);
        setField(term297837, term297837.getClass(), "last", null);
        setField(term297837, term297837.getClass(), "propListHead", null);
        setIntField(term297837, term297837.getClass(), "sourcePosition", 0);
        setField(term297837, term297837.getClass(), "jsType", null);
        setField(term297837, term297837.getClass(), "parent", null);
        term297838 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term297838, term297838.getClass(), "functionName", null);
        setBooleanField(term297838, term297838.getClass(), "itsNeedsActivation", false);
        setIntField(term297838, term297838.getClass(), "itsFunctionType", 0);
        setBooleanField(term297838, term297838.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term297838, term297838.getClass(), "encodedSourceStart", 0);
        setIntField(term297838, term297838.getClass(), "encodedSourceEnd", 0);
        setField(term297838, term297838.getClass(), "sourceName", null);
        setIntField(term297838, term297838.getClass(), "baseLineno", 0);
        setIntField(term297838, term297838.getClass(), "endLineno", 0);
        setField(term297838, term297838.getClass(), "functions", null);
        setField(term297838, term297838.getClass(), "regexps", null);
        setField(term297838, term297838.getClass(), "itsVariables", null);
        setField(term297838, term297838.getClass(), "itsConst", null);
        setField(term297838, term297838.getClass(), "itsVariableNames", null);
        setIntField(term297838, term297838.getClass(), "varStart", 0);
        setField(term297838, term297838.getClass(), "compilerData", null);
        setIntField(term297838, term297838.getClass(), "type", 0);
        setField(term297838, term297838.getClass(), "next", null);
        setField(term297838, term297838.getClass(), "first", null);
        setField(term297838, term297838.getClass(), "last", null);
        setField(term297838, term297838.getClass(), "propListHead", null);
        setIntField(term297838, term297838.getClass(), "sourcePosition", 0);
        setField(term297838, term297838.getClass(), "jsType", null);
        setField(term297838, term297838.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term297628;
        args[1] = term297714;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term297628, term297837));
        assertTrue(recursiveEquals(term297714, term297838));
        assertTrue(recursiveEquals(retValue, false));
    }

};


