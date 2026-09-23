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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378461;
     Object term378665;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378461 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term378665 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term378665, term378665.getClass(), "functionName", null);
        setBooleanField(term378665, term378665.getClass(), "itsNeedsActivation", false);
        setIntField(term378665, term378665.getClass(), "itsFunctionType", 0);
        setBooleanField(term378665, term378665.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term378665, term378665.getClass(), "encodedSourceStart", 0);
        setIntField(term378665, term378665.getClass(), "encodedSourceEnd", 0);
        setField(term378665, term378665.getClass(), "sourceName", null);
        setIntField(term378665, term378665.getClass(), "baseLineno", 0);
        setIntField(term378665, term378665.getClass(), "endLineno", 0);
        setField(term378665, term378665.getClass(), "functions", null);
        setField(term378665, term378665.getClass(), "regexps", null);
        setField(term378665, term378665.getClass(), "itsVariables", null);
        setField(term378665, term378665.getClass(), "itsConst", null);
        setField(term378665, term378665.getClass(), "itsVariableNames", null);
        setIntField(term378665, term378665.getClass(), "varStart", 0);
        setField(term378665, term378665.getClass(), "compilerData", null);
        setIntField(term378665, term378665.getClass(), "type", 0);
        setField(term378665, term378665.getClass(), "next", null);
        setField(term378665, term378665.getClass(), "first", null);
        setField(term378665, term378665.getClass(), "last", null);
        setField(term378665, term378665.getClass(), "propListHead", null);
        setIntField(term378665, term378665.getClass(), "sourcePosition", 0);
        setField(term378665, term378665.getClass(), "jsType", null);
        setField(term378665, term378665.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term378461;
        args[1] = null;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term378461, term378665));
        assertTrue(recursiveEquals(retValue, false));
    }

};


