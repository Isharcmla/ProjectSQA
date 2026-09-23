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

public class ReferenceCollectingCallback_isBlockBoundary_684698721334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76767;
     Object term76853;
     Object term77071;
     Object term77072;

    public ReferenceCollectingCallback_isBlockBoundary_684698721334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76767 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term76853 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term76853, term76853.getClass(), "type", 12);
        term77071 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term77071, term77071.getClass(), "functionName", null);
        setBooleanField(term77071, term77071.getClass(), "itsNeedsActivation", false);
        setIntField(term77071, term77071.getClass(), "itsFunctionType", 0);
        setBooleanField(term77071, term77071.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77071, term77071.getClass(), "encodedSourceStart", 0);
        setIntField(term77071, term77071.getClass(), "encodedSourceEnd", 0);
        setField(term77071, term77071.getClass(), "sourceName", null);
        setIntField(term77071, term77071.getClass(), "baseLineno", 0);
        setIntField(term77071, term77071.getClass(), "endLineno", 0);
        setField(term77071, term77071.getClass(), "functions", null);
        setField(term77071, term77071.getClass(), "regexps", null);
        setField(term77071, term77071.getClass(), "itsVariables", null);
        setField(term77071, term77071.getClass(), "itsConst", null);
        setField(term77071, term77071.getClass(), "itsVariableNames", null);
        setIntField(term77071, term77071.getClass(), "varStart", 0);
        setField(term77071, term77071.getClass(), "compilerData", null);
        setIntField(term77071, term77071.getClass(), "type", 12);
        setField(term77071, term77071.getClass(), "next", null);
        setField(term77071, term77071.getClass(), "first", null);
        setField(term77071, term77071.getClass(), "last", null);
        setField(term77071, term77071.getClass(), "propListHead", null);
        setIntField(term77071, term77071.getClass(), "sourcePosition", 0);
        setField(term77071, term77071.getClass(), "jsType", null);
        setField(term77071, term77071.getClass(), "parent", null);
        term77072 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term77072, term77072.getClass(), "functionName", null);
        setBooleanField(term77072, term77072.getClass(), "itsNeedsActivation", false);
        setIntField(term77072, term77072.getClass(), "itsFunctionType", 0);
        setBooleanField(term77072, term77072.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77072, term77072.getClass(), "encodedSourceStart", 0);
        setIntField(term77072, term77072.getClass(), "encodedSourceEnd", 0);
        setField(term77072, term77072.getClass(), "sourceName", null);
        setIntField(term77072, term77072.getClass(), "baseLineno", 0);
        setIntField(term77072, term77072.getClass(), "endLineno", 0);
        setField(term77072, term77072.getClass(), "functions", null);
        setField(term77072, term77072.getClass(), "regexps", null);
        setField(term77072, term77072.getClass(), "itsVariables", null);
        setField(term77072, term77072.getClass(), "itsConst", null);
        setField(term77072, term77072.getClass(), "itsVariableNames", null);
        setIntField(term77072, term77072.getClass(), "varStart", 0);
        setField(term77072, term77072.getClass(), "compilerData", null);
        setIntField(term77072, term77072.getClass(), "type", 0);
        setField(term77072, term77072.getClass(), "next", null);
        setField(term77072, term77072.getClass(), "first", null);
        setField(term77072, term77072.getClass(), "last", null);
        setField(term77072, term77072.getClass(), "propListHead", null);
        setIntField(term77072, term77072.getClass(), "sourcePosition", 0);
        setField(term77072, term77072.getClass(), "jsType", null);
        setField(term77072, term77072.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term76767;
        args[1] = term76853;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term76767, term77071));
        assertTrue(recursiveEquals(term76853, term77072));
        assertTrue(recursiveEquals(retValue, false));
    }

};


