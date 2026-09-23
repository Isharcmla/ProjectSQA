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

public class ReferenceCollectingCallback_isBlockBoundary_684698721901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241604;
     Object term241637;

    public ReferenceCollectingCallback_isBlockBoundary_684698721901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241604 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term241604, term241604.getClass(), "type", 115);
        term241637 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term241637, term241637.getClass(), "functionName", null);
        setBooleanField(term241637, term241637.getClass(), "itsNeedsActivation", false);
        setIntField(term241637, term241637.getClass(), "itsFunctionType", 0);
        setBooleanField(term241637, term241637.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term241637, term241637.getClass(), "encodedSourceStart", 0);
        setIntField(term241637, term241637.getClass(), "encodedSourceEnd", 0);
        setField(term241637, term241637.getClass(), "sourceName", null);
        setIntField(term241637, term241637.getClass(), "baseLineno", 0);
        setIntField(term241637, term241637.getClass(), "endLineno", 0);
        setField(term241637, term241637.getClass(), "functions", null);
        setField(term241637, term241637.getClass(), "regexps", null);
        setField(term241637, term241637.getClass(), "itsVariables", null);
        setField(term241637, term241637.getClass(), "itsConst", null);
        setField(term241637, term241637.getClass(), "itsVariableNames", null);
        setIntField(term241637, term241637.getClass(), "varStart", 0);
        setField(term241637, term241637.getClass(), "compilerData", null);
        setIntField(term241637, term241637.getClass(), "type", 115);
        setField(term241637, term241637.getClass(), "next", null);
        setField(term241637, term241637.getClass(), "first", null);
        setField(term241637, term241637.getClass(), "last", null);
        setField(term241637, term241637.getClass(), "propListHead", null);
        setIntField(term241637, term241637.getClass(), "sourcePosition", 0);
        setField(term241637, term241637.getClass(), "jsType", null);
        setField(term241637, term241637.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term241604;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term241604, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


