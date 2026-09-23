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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453159;
     Object term455523;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453159 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term453159, term453159.getClass(), "type", 100);
        term455523 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term455523, term455523.getClass(), "functionName", null);
        setBooleanField(term455523, term455523.getClass(), "itsNeedsActivation", false);
        setIntField(term455523, term455523.getClass(), "itsFunctionType", 0);
        setBooleanField(term455523, term455523.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term455523, term455523.getClass(), "encodedSourceStart", 0);
        setIntField(term455523, term455523.getClass(), "encodedSourceEnd", 0);
        setField(term455523, term455523.getClass(), "sourceName", null);
        setIntField(term455523, term455523.getClass(), "baseLineno", 0);
        setIntField(term455523, term455523.getClass(), "endLineno", 0);
        setField(term455523, term455523.getClass(), "functions", null);
        setField(term455523, term455523.getClass(), "regexps", null);
        setField(term455523, term455523.getClass(), "itsVariables", null);
        setField(term455523, term455523.getClass(), "itsConst", null);
        setField(term455523, term455523.getClass(), "itsVariableNames", null);
        setIntField(term455523, term455523.getClass(), "varStart", 0);
        setField(term455523, term455523.getClass(), "compilerData", null);
        setIntField(term455523, term455523.getClass(), "type", 100);
        setField(term455523, term455523.getClass(), "next", null);
        setField(term455523, term455523.getClass(), "first", null);
        setField(term455523, term455523.getClass(), "last", null);
        setField(term455523, term455523.getClass(), "propListHead", null);
        setIntField(term455523, term455523.getClass(), "sourcePosition", 0);
        setField(term455523, term455523.getClass(), "jsType", null);
        setField(term455523, term455523.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term453159;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term453159, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


