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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281771;
     Object term281857;
     Object term282268;
     Object term282270;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281771 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term281857 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term281943 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term281857, term281857.getClass(), "type", 98);
        setField(term281857, term281857.getClass(), "first", term281943);
        term282268 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term282269 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term282268, term282268.getClass(), "functionName", null);
        setBooleanField(term282268, term282268.getClass(), "itsNeedsActivation", false);
        setIntField(term282268, term282268.getClass(), "itsFunctionType", 0);
        setBooleanField(term282268, term282268.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term282268, term282268.getClass(), "encodedSourceStart", 0);
        setIntField(term282268, term282268.getClass(), "encodedSourceEnd", 0);
        setField(term282268, term282268.getClass(), "sourceName", null);
        setIntField(term282268, term282268.getClass(), "baseLineno", 0);
        setIntField(term282268, term282268.getClass(), "endLineno", 0);
        setField(term282268, term282268.getClass(), "functions", null);
        setField(term282268, term282268.getClass(), "regexps", null);
        setField(term282268, term282268.getClass(), "itsVariables", null);
        setField(term282268, term282268.getClass(), "itsConst", null);
        setField(term282268, term282268.getClass(), "itsVariableNames", null);
        setIntField(term282268, term282268.getClass(), "varStart", 0);
        setField(term282268, term282268.getClass(), "compilerData", null);
        setIntField(term282268, term282268.getClass(), "type", 98);
        setField(term282268, term282268.getClass(), "next", null);
        setField(term282269, term282269.getClass(), "functionName", null);
        setBooleanField(term282269, term282269.getClass(), "itsNeedsActivation", false);
        setIntField(term282269, term282269.getClass(), "itsFunctionType", 0);
        setBooleanField(term282269, term282269.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term282269, term282269.getClass(), "encodedSourceStart", 0);
        setIntField(term282269, term282269.getClass(), "encodedSourceEnd", 0);
        setField(term282269, term282269.getClass(), "sourceName", null);
        setIntField(term282269, term282269.getClass(), "baseLineno", 0);
        setIntField(term282269, term282269.getClass(), "endLineno", 0);
        setField(term282269, term282269.getClass(), "functions", null);
        setField(term282269, term282269.getClass(), "regexps", null);
        setField(term282269, term282269.getClass(), "itsVariables", null);
        setField(term282269, term282269.getClass(), "itsConst", null);
        setField(term282269, term282269.getClass(), "itsVariableNames", null);
        setIntField(term282269, term282269.getClass(), "varStart", 0);
        setField(term282269, term282269.getClass(), "compilerData", null);
        setIntField(term282269, term282269.getClass(), "type", 0);
        setField(term282269, term282269.getClass(), "next", null);
        setField(term282269, term282269.getClass(), "first", null);
        setField(term282269, term282269.getClass(), "last", null);
        setField(term282269, term282269.getClass(), "propListHead", null);
        setIntField(term282269, term282269.getClass(), "sourcePosition", 0);
        setField(term282269, term282269.getClass(), "jsType", null);
        setField(term282269, term282269.getClass(), "parent", null);
        setField(term282268, term282268.getClass(), "first", term282269);
        setField(term282268, term282268.getClass(), "last", null);
        setField(term282268, term282268.getClass(), "propListHead", null);
        setIntField(term282268, term282268.getClass(), "sourcePosition", 0);
        setField(term282268, term282268.getClass(), "jsType", null);
        setField(term282268, term282268.getClass(), "parent", null);
        term282270 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term282270, term282270.getClass(), "functionName", null);
        setBooleanField(term282270, term282270.getClass(), "itsNeedsActivation", false);
        setIntField(term282270, term282270.getClass(), "itsFunctionType", 0);
        setBooleanField(term282270, term282270.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term282270, term282270.getClass(), "encodedSourceStart", 0);
        setIntField(term282270, term282270.getClass(), "encodedSourceEnd", 0);
        setField(term282270, term282270.getClass(), "sourceName", null);
        setIntField(term282270, term282270.getClass(), "baseLineno", 0);
        setIntField(term282270, term282270.getClass(), "endLineno", 0);
        setField(term282270, term282270.getClass(), "functions", null);
        setField(term282270, term282270.getClass(), "regexps", null);
        setField(term282270, term282270.getClass(), "itsVariables", null);
        setField(term282270, term282270.getClass(), "itsConst", null);
        setField(term282270, term282270.getClass(), "itsVariableNames", null);
        setIntField(term282270, term282270.getClass(), "varStart", 0);
        setField(term282270, term282270.getClass(), "compilerData", null);
        setIntField(term282270, term282270.getClass(), "type", 0);
        setField(term282270, term282270.getClass(), "next", null);
        setField(term282270, term282270.getClass(), "first", null);
        setField(term282270, term282270.getClass(), "last", null);
        setField(term282270, term282270.getClass(), "propListHead", null);
        setIntField(term282270, term282270.getClass(), "sourcePosition", 0);
        setField(term282270, term282270.getClass(), "jsType", null);
        setField(term282270, term282270.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term281771;
        args[1] = term281857;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term281771, term282268));
        assertTrue(recursiveEquals(term281857, term282270));
        assertTrue(recursiveEquals(retValue, true));
    }

};


