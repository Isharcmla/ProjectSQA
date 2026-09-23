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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380454;
     Object term380668;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380454 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term380454, term380454.getClass(), "type", 77);
        term380668 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term380668, term380668.getClass(), "functionName", null);
        setBooleanField(term380668, term380668.getClass(), "itsNeedsActivation", false);
        setIntField(term380668, term380668.getClass(), "itsFunctionType", 0);
        setBooleanField(term380668, term380668.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term380668, term380668.getClass(), "encodedSourceStart", 0);
        setIntField(term380668, term380668.getClass(), "encodedSourceEnd", 0);
        setField(term380668, term380668.getClass(), "sourceName", null);
        setIntField(term380668, term380668.getClass(), "baseLineno", 0);
        setIntField(term380668, term380668.getClass(), "endLineno", 0);
        setField(term380668, term380668.getClass(), "functions", null);
        setField(term380668, term380668.getClass(), "regexps", null);
        setField(term380668, term380668.getClass(), "itsVariables", null);
        setField(term380668, term380668.getClass(), "itsConst", null);
        setField(term380668, term380668.getClass(), "itsVariableNames", null);
        setIntField(term380668, term380668.getClass(), "varStart", 0);
        setField(term380668, term380668.getClass(), "compilerData", null);
        setIntField(term380668, term380668.getClass(), "type", 77);
        setField(term380668, term380668.getClass(), "next", null);
        setField(term380668, term380668.getClass(), "first", null);
        setField(term380668, term380668.getClass(), "last", null);
        setField(term380668, term380668.getClass(), "propListHead", null);
        setIntField(term380668, term380668.getClass(), "sourcePosition", 0);
        setField(term380668, term380668.getClass(), "jsType", null);
        setField(term380668, term380668.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term380454;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term380454, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


