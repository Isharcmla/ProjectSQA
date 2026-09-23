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

public class ReferenceCollectingCallback_isBlockBoundary_684698721850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223809;
     Object term223895;
     Object term223915;
     Object term223916;

    public ReferenceCollectingCallback_isBlockBoundary_684698721850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223809 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term223895 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term223895, term223895.getClass(), "type", 12);
        term223915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term223915, term223915.getClass(), "functionName", null);
        setBooleanField(term223915, term223915.getClass(), "itsNeedsActivation", false);
        setIntField(term223915, term223915.getClass(), "itsFunctionType", 0);
        setBooleanField(term223915, term223915.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term223915, term223915.getClass(), "encodedSourceStart", 0);
        setIntField(term223915, term223915.getClass(), "encodedSourceEnd", 0);
        setField(term223915, term223915.getClass(), "sourceName", null);
        setIntField(term223915, term223915.getClass(), "baseLineno", 0);
        setIntField(term223915, term223915.getClass(), "endLineno", 0);
        setField(term223915, term223915.getClass(), "functions", null);
        setField(term223915, term223915.getClass(), "regexps", null);
        setField(term223915, term223915.getClass(), "itsVariables", null);
        setField(term223915, term223915.getClass(), "itsConst", null);
        setField(term223915, term223915.getClass(), "itsVariableNames", null);
        setIntField(term223915, term223915.getClass(), "varStart", 0);
        setField(term223915, term223915.getClass(), "compilerData", null);
        setIntField(term223915, term223915.getClass(), "type", 12);
        setField(term223915, term223915.getClass(), "next", null);
        setField(term223915, term223915.getClass(), "first", null);
        setField(term223915, term223915.getClass(), "last", null);
        setField(term223915, term223915.getClass(), "propListHead", null);
        setIntField(term223915, term223915.getClass(), "sourcePosition", 0);
        setField(term223915, term223915.getClass(), "jsType", null);
        setField(term223915, term223915.getClass(), "parent", null);
        term223916 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term223916, term223916.getClass(), "str", null);
        setIntField(term223916, term223916.getClass(), "type", 0);
        setField(term223916, term223916.getClass(), "next", null);
        setField(term223916, term223916.getClass(), "first", null);
        setField(term223916, term223916.getClass(), "last", null);
        setField(term223916, term223916.getClass(), "propListHead", null);
        setIntField(term223916, term223916.getClass(), "sourcePosition", 0);
        setField(term223916, term223916.getClass(), "jsType", null);
        setField(term223916, term223916.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term223809;
        args[1] = term223895;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term223809, term223915));
        assertTrue(recursiveEquals(term223895, term223916));
        assertTrue(recursiveEquals(retValue, false));
    }

};


