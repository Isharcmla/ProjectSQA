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

public class ReferenceCollectingCallback_isBlockBoundary_684698721722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190959;
     Object term191045;
     Object term191298;
     Object term191299;

    public ReferenceCollectingCallback_isBlockBoundary_684698721722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190959 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term191045 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term191045, term191045.getClass(), "type", 12);
        term191298 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term191298, term191298.getClass(), "functionName", null);
        setBooleanField(term191298, term191298.getClass(), "itsNeedsActivation", false);
        setIntField(term191298, term191298.getClass(), "itsFunctionType", 0);
        setBooleanField(term191298, term191298.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term191298, term191298.getClass(), "encodedSourceStart", 0);
        setIntField(term191298, term191298.getClass(), "encodedSourceEnd", 0);
        setField(term191298, term191298.getClass(), "sourceName", null);
        setIntField(term191298, term191298.getClass(), "baseLineno", 0);
        setIntField(term191298, term191298.getClass(), "endLineno", 0);
        setField(term191298, term191298.getClass(), "functions", null);
        setField(term191298, term191298.getClass(), "regexps", null);
        setField(term191298, term191298.getClass(), "itsVariables", null);
        setField(term191298, term191298.getClass(), "itsConst", null);
        setField(term191298, term191298.getClass(), "itsVariableNames", null);
        setIntField(term191298, term191298.getClass(), "varStart", 0);
        setField(term191298, term191298.getClass(), "compilerData", null);
        setIntField(term191298, term191298.getClass(), "type", 12);
        setField(term191298, term191298.getClass(), "next", null);
        setField(term191298, term191298.getClass(), "first", null);
        setField(term191298, term191298.getClass(), "last", null);
        setField(term191298, term191298.getClass(), "propListHead", null);
        setIntField(term191298, term191298.getClass(), "sourcePosition", 0);
        setField(term191298, term191298.getClass(), "jsType", null);
        setField(term191298, term191298.getClass(), "parent", null);
        term191299 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term191299, term191299.getClass(), "functionName", null);
        setBooleanField(term191299, term191299.getClass(), "itsNeedsActivation", false);
        setIntField(term191299, term191299.getClass(), "itsFunctionType", 0);
        setBooleanField(term191299, term191299.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term191299, term191299.getClass(), "encodedSourceStart", 0);
        setIntField(term191299, term191299.getClass(), "encodedSourceEnd", 0);
        setField(term191299, term191299.getClass(), "sourceName", null);
        setIntField(term191299, term191299.getClass(), "baseLineno", 0);
        setIntField(term191299, term191299.getClass(), "endLineno", 0);
        setField(term191299, term191299.getClass(), "functions", null);
        setField(term191299, term191299.getClass(), "regexps", null);
        setField(term191299, term191299.getClass(), "itsVariables", null);
        setField(term191299, term191299.getClass(), "itsConst", null);
        setField(term191299, term191299.getClass(), "itsVariableNames", null);
        setIntField(term191299, term191299.getClass(), "varStart", 0);
        setField(term191299, term191299.getClass(), "compilerData", null);
        setIntField(term191299, term191299.getClass(), "type", 0);
        setField(term191299, term191299.getClass(), "next", null);
        setField(term191299, term191299.getClass(), "first", null);
        setField(term191299, term191299.getClass(), "last", null);
        setField(term191299, term191299.getClass(), "propListHead", null);
        setIntField(term191299, term191299.getClass(), "sourcePosition", 0);
        setField(term191299, term191299.getClass(), "jsType", null);
        setField(term191299, term191299.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term190959;
        args[1] = term191045;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term190959, term191298));
        assertTrue(recursiveEquals(term191045, term191299));
        assertTrue(recursiveEquals(retValue, false));
    }

};


