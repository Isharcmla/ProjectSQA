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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379854;
     Object term379940;
     Object term380596;
     Object term380597;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379854 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term379854, term379854.getClass(), "type", 111);
        term379940 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term379940, term379940.getClass(), "type", 12);
        term380596 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term380596, term380596.getClass(), "functionName", null);
        setBooleanField(term380596, term380596.getClass(), "itsNeedsActivation", false);
        setIntField(term380596, term380596.getClass(), "itsFunctionType", 0);
        setBooleanField(term380596, term380596.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term380596, term380596.getClass(), "encodedSourceStart", 0);
        setIntField(term380596, term380596.getClass(), "encodedSourceEnd", 0);
        setField(term380596, term380596.getClass(), "sourceName", null);
        setIntField(term380596, term380596.getClass(), "baseLineno", 0);
        setIntField(term380596, term380596.getClass(), "endLineno", 0);
        setField(term380596, term380596.getClass(), "functions", null);
        setField(term380596, term380596.getClass(), "regexps", null);
        setField(term380596, term380596.getClass(), "itsVariables", null);
        setField(term380596, term380596.getClass(), "itsConst", null);
        setField(term380596, term380596.getClass(), "itsVariableNames", null);
        setIntField(term380596, term380596.getClass(), "varStart", 0);
        setField(term380596, term380596.getClass(), "compilerData", null);
        setIntField(term380596, term380596.getClass(), "type", 12);
        setField(term380596, term380596.getClass(), "next", null);
        setField(term380596, term380596.getClass(), "first", null);
        setField(term380596, term380596.getClass(), "last", null);
        setField(term380596, term380596.getClass(), "propListHead", null);
        setIntField(term380596, term380596.getClass(), "sourcePosition", 0);
        setField(term380596, term380596.getClass(), "jsType", null);
        setField(term380596, term380596.getClass(), "parent", null);
        term380597 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term380597, term380597.getClass(), "str", null);
        setIntField(term380597, term380597.getClass(), "type", 111);
        setField(term380597, term380597.getClass(), "next", null);
        setField(term380597, term380597.getClass(), "first", null);
        setField(term380597, term380597.getClass(), "last", null);
        setField(term380597, term380597.getClass(), "propListHead", null);
        setIntField(term380597, term380597.getClass(), "sourcePosition", 0);
        setField(term380597, term380597.getClass(), "jsType", null);
        setField(term380597, term380597.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term379854;
        args[1] = term379940;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term379854, term380596));
        assertTrue(recursiveEquals(term379940, term380597));
        assertTrue(recursiveEquals(retValue, true));
    }

};


