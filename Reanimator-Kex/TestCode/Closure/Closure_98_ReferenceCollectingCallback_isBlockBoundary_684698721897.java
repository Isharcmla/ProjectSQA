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

public class ReferenceCollectingCallback_isBlockBoundary_684698721897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240789;
     Object term240875;
     Object term241183;
     Object term241184;

    public ReferenceCollectingCallback_isBlockBoundary_684698721897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240789 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term240875 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term240875, term240875.getClass(), "type", 12);
        term241183 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term241183, term241183.getClass(), "functionName", null);
        setBooleanField(term241183, term241183.getClass(), "itsNeedsActivation", false);
        setIntField(term241183, term241183.getClass(), "itsFunctionType", 0);
        setBooleanField(term241183, term241183.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241183, term241183.getClass(), "encodedSourceStart", 0);
        setIntField(term241183, term241183.getClass(), "encodedSourceEnd", 0);
        setField(term241183, term241183.getClass(), "sourceName", null);
        setIntField(term241183, term241183.getClass(), "baseLineno", 0);
        setIntField(term241183, term241183.getClass(), "endLineno", 0);
        setField(term241183, term241183.getClass(), "functions", null);
        setField(term241183, term241183.getClass(), "regexps", null);
        setField(term241183, term241183.getClass(), "itsVariables", null);
        setField(term241183, term241183.getClass(), "itsConst", null);
        setField(term241183, term241183.getClass(), "itsVariableNames", null);
        setIntField(term241183, term241183.getClass(), "varStart", 0);
        setField(term241183, term241183.getClass(), "compilerData", null);
        setIntField(term241183, term241183.getClass(), "type", 12);
        setField(term241183, term241183.getClass(), "next", null);
        setField(term241183, term241183.getClass(), "first", null);
        setField(term241183, term241183.getClass(), "last", null);
        setField(term241183, term241183.getClass(), "propListHead", null);
        setIntField(term241183, term241183.getClass(), "sourcePosition", 0);
        setField(term241183, term241183.getClass(), "jsType", null);
        setField(term241183, term241183.getClass(), "parent", null);
        term241184 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term241184, term241184.getClass(), "functionName", null);
        setBooleanField(term241184, term241184.getClass(), "itsNeedsActivation", false);
        setIntField(term241184, term241184.getClass(), "itsFunctionType", 0);
        setBooleanField(term241184, term241184.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241184, term241184.getClass(), "encodedSourceStart", 0);
        setIntField(term241184, term241184.getClass(), "encodedSourceEnd", 0);
        setField(term241184, term241184.getClass(), "sourceName", null);
        setIntField(term241184, term241184.getClass(), "baseLineno", 0);
        setIntField(term241184, term241184.getClass(), "endLineno", 0);
        setField(term241184, term241184.getClass(), "functions", null);
        setField(term241184, term241184.getClass(), "regexps", null);
        setField(term241184, term241184.getClass(), "itsVariables", null);
        setField(term241184, term241184.getClass(), "itsConst", null);
        setField(term241184, term241184.getClass(), "itsVariableNames", null);
        setIntField(term241184, term241184.getClass(), "varStart", 0);
        setField(term241184, term241184.getClass(), "compilerData", null);
        setIntField(term241184, term241184.getClass(), "type", 0);
        setField(term241184, term241184.getClass(), "next", null);
        setField(term241184, term241184.getClass(), "first", null);
        setField(term241184, term241184.getClass(), "last", null);
        setField(term241184, term241184.getClass(), "propListHead", null);
        setIntField(term241184, term241184.getClass(), "sourcePosition", 0);
        setField(term241184, term241184.getClass(), "jsType", null);
        setField(term241184, term241184.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term240789;
        args[1] = term240875;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term240789, term241183));
        assertTrue(recursiveEquals(term240875, term241184));
        assertTrue(recursiveEquals(retValue, false));
    }

};


