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

public class ReferenceCollectingCallback_isBlockBoundary_684698721867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224916;
     Object term225002;
     Object term225285;
     Object term225286;

    public ReferenceCollectingCallback_isBlockBoundary_684698721867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224916 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term224916, term224916.getClass(), "type", 111);
        term225002 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term225002, term225002.getClass(), "type", 12);
        term225285 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term225285, term225285.getClass(), "functionName", null);
        setBooleanField(term225285, term225285.getClass(), "itsNeedsActivation", false);
        setIntField(term225285, term225285.getClass(), "itsFunctionType", 0);
        setBooleanField(term225285, term225285.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term225285, term225285.getClass(), "encodedSourceStart", 0);
        setIntField(term225285, term225285.getClass(), "encodedSourceEnd", 0);
        setField(term225285, term225285.getClass(), "sourceName", null);
        setIntField(term225285, term225285.getClass(), "baseLineno", 0);
        setIntField(term225285, term225285.getClass(), "endLineno", 0);
        setField(term225285, term225285.getClass(), "functions", null);
        setField(term225285, term225285.getClass(), "regexps", null);
        setField(term225285, term225285.getClass(), "itsVariables", null);
        setField(term225285, term225285.getClass(), "itsConst", null);
        setField(term225285, term225285.getClass(), "itsVariableNames", null);
        setIntField(term225285, term225285.getClass(), "varStart", 0);
        setField(term225285, term225285.getClass(), "compilerData", null);
        setIntField(term225285, term225285.getClass(), "type", 12);
        setField(term225285, term225285.getClass(), "next", null);
        setField(term225285, term225285.getClass(), "first", null);
        setField(term225285, term225285.getClass(), "last", null);
        setField(term225285, term225285.getClass(), "propListHead", null);
        setIntField(term225285, term225285.getClass(), "sourcePosition", 0);
        setField(term225285, term225285.getClass(), "jsType", null);
        setField(term225285, term225285.getClass(), "parent", null);
        term225286 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term225286, term225286.getClass(), "str", null);
        setIntField(term225286, term225286.getClass(), "type", 111);
        setField(term225286, term225286.getClass(), "next", null);
        setField(term225286, term225286.getClass(), "first", null);
        setField(term225286, term225286.getClass(), "last", null);
        setField(term225286, term225286.getClass(), "propListHead", null);
        setIntField(term225286, term225286.getClass(), "sourcePosition", 0);
        setField(term225286, term225286.getClass(), "jsType", null);
        setField(term225286, term225286.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term224916;
        args[1] = term225002;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term224916, term225285));
        assertTrue(recursiveEquals(term225002, term225286));
        assertTrue(recursiveEquals(retValue, true));
    }

};


