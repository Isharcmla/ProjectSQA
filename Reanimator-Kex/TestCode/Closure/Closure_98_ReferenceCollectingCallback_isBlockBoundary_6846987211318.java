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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400942;
     Object term401034;
     Object term401695;
     Object term401696;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400942 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term401034 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term401034, term401034.getClass(), "type", 12);
        term401695 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term401695, term401695.getClass(), "str", null);
        setIntField(term401695, term401695.getClass(), "type", 12);
        setField(term401695, term401695.getClass(), "next", null);
        setField(term401695, term401695.getClass(), "first", null);
        setField(term401695, term401695.getClass(), "last", null);
        setField(term401695, term401695.getClass(), "propListHead", null);
        setIntField(term401695, term401695.getClass(), "sourcePosition", 0);
        setField(term401695, term401695.getClass(), "jsType", null);
        setField(term401695, term401695.getClass(), "parent", null);
        term401696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term401696, term401696.getClass(), "functionName", null);
        setBooleanField(term401696, term401696.getClass(), "itsNeedsActivation", false);
        setIntField(term401696, term401696.getClass(), "itsFunctionType", 0);
        setBooleanField(term401696, term401696.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term401696, term401696.getClass(), "encodedSourceStart", 0);
        setIntField(term401696, term401696.getClass(), "encodedSourceEnd", 0);
        setField(term401696, term401696.getClass(), "sourceName", null);
        setIntField(term401696, term401696.getClass(), "baseLineno", 0);
        setIntField(term401696, term401696.getClass(), "endLineno", 0);
        setField(term401696, term401696.getClass(), "functions", null);
        setField(term401696, term401696.getClass(), "regexps", null);
        setField(term401696, term401696.getClass(), "itsVariables", null);
        setField(term401696, term401696.getClass(), "itsConst", null);
        setField(term401696, term401696.getClass(), "itsVariableNames", null);
        setIntField(term401696, term401696.getClass(), "varStart", 0);
        setField(term401696, term401696.getClass(), "compilerData", null);
        setIntField(term401696, term401696.getClass(), "type", 0);
        setField(term401696, term401696.getClass(), "next", null);
        setField(term401696, term401696.getClass(), "first", null);
        setField(term401696, term401696.getClass(), "last", null);
        setField(term401696, term401696.getClass(), "propListHead", null);
        setIntField(term401696, term401696.getClass(), "sourcePosition", 0);
        setField(term401696, term401696.getClass(), "jsType", null);
        setField(term401696, term401696.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term400942;
        args[1] = term401034;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term400942, term401695));
        assertTrue(recursiveEquals(term401034, term401696));
        assertTrue(recursiveEquals(retValue, false));
    }

};


