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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441280;
     Object term441372;
     Object term441753;
     Object term441754;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term441280 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term441372 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term441372, term441372.getClass(), "type", 12);
        term441753 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term441753, term441753.getClass(), "number", 0.0);
        setIntField(term441753, term441753.getClass(), "type", 12);
        setField(term441753, term441753.getClass(), "next", null);
        setField(term441753, term441753.getClass(), "first", null);
        setField(term441753, term441753.getClass(), "last", null);
        setField(term441753, term441753.getClass(), "propListHead", null);
        setIntField(term441753, term441753.getClass(), "sourcePosition", 0);
        setField(term441753, term441753.getClass(), "jsType", null);
        setField(term441753, term441753.getClass(), "parent", null);
        term441754 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term441754, term441754.getClass(), "functionName", null);
        setBooleanField(term441754, term441754.getClass(), "itsNeedsActivation", false);
        setIntField(term441754, term441754.getClass(), "itsFunctionType", 0);
        setBooleanField(term441754, term441754.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term441754, term441754.getClass(), "encodedSourceStart", 0);
        setIntField(term441754, term441754.getClass(), "encodedSourceEnd", 0);
        setField(term441754, term441754.getClass(), "sourceName", null);
        setIntField(term441754, term441754.getClass(), "baseLineno", 0);
        setIntField(term441754, term441754.getClass(), "endLineno", 0);
        setField(term441754, term441754.getClass(), "functions", null);
        setField(term441754, term441754.getClass(), "regexps", null);
        setField(term441754, term441754.getClass(), "itsVariables", null);
        setField(term441754, term441754.getClass(), "itsConst", null);
        setField(term441754, term441754.getClass(), "itsVariableNames", null);
        setIntField(term441754, term441754.getClass(), "varStart", 0);
        setField(term441754, term441754.getClass(), "compilerData", null);
        setIntField(term441754, term441754.getClass(), "type", 0);
        setField(term441754, term441754.getClass(), "next", null);
        setField(term441754, term441754.getClass(), "first", null);
        setField(term441754, term441754.getClass(), "last", null);
        setField(term441754, term441754.getClass(), "propListHead", null);
        setIntField(term441754, term441754.getClass(), "sourcePosition", 0);
        setField(term441754, term441754.getClass(), "jsType", null);
        setField(term441754, term441754.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term441280;
        args[1] = term441372;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term441280, term441753));
        assertTrue(recursiveEquals(term441372, term441754));
        assertTrue(recursiveEquals(retValue, false));
    }

};


