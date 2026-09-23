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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388398;
     Object term388484;
     Object term388522;
     Object term388523;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term388398 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term388484 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term388484, term388484.getClass(), "type", 12);
        term388522 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term388522, term388522.getClass(), "functionName", null);
        setBooleanField(term388522, term388522.getClass(), "itsNeedsActivation", false);
        setIntField(term388522, term388522.getClass(), "itsFunctionType", 0);
        setBooleanField(term388522, term388522.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term388522, term388522.getClass(), "encodedSourceStart", 0);
        setIntField(term388522, term388522.getClass(), "encodedSourceEnd", 0);
        setField(term388522, term388522.getClass(), "sourceName", null);
        setIntField(term388522, term388522.getClass(), "baseLineno", 0);
        setIntField(term388522, term388522.getClass(), "endLineno", 0);
        setField(term388522, term388522.getClass(), "functions", null);
        setField(term388522, term388522.getClass(), "regexps", null);
        setField(term388522, term388522.getClass(), "itsVariables", null);
        setField(term388522, term388522.getClass(), "itsConst", null);
        setField(term388522, term388522.getClass(), "itsVariableNames", null);
        setIntField(term388522, term388522.getClass(), "varStart", 0);
        setField(term388522, term388522.getClass(), "compilerData", null);
        setIntField(term388522, term388522.getClass(), "type", 12);
        setField(term388522, term388522.getClass(), "next", null);
        setField(term388522, term388522.getClass(), "first", null);
        setField(term388522, term388522.getClass(), "last", null);
        setField(term388522, term388522.getClass(), "propListHead", null);
        setIntField(term388522, term388522.getClass(), "sourcePosition", 0);
        setField(term388522, term388522.getClass(), "jsType", null);
        setField(term388522, term388522.getClass(), "parent", null);
        term388523 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term388523, term388523.getClass(), "functionName", null);
        setBooleanField(term388523, term388523.getClass(), "itsNeedsActivation", false);
        setIntField(term388523, term388523.getClass(), "itsFunctionType", 0);
        setBooleanField(term388523, term388523.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term388523, term388523.getClass(), "encodedSourceStart", 0);
        setIntField(term388523, term388523.getClass(), "encodedSourceEnd", 0);
        setField(term388523, term388523.getClass(), "sourceName", null);
        setIntField(term388523, term388523.getClass(), "baseLineno", 0);
        setIntField(term388523, term388523.getClass(), "endLineno", 0);
        setField(term388523, term388523.getClass(), "functions", null);
        setField(term388523, term388523.getClass(), "regexps", null);
        setField(term388523, term388523.getClass(), "itsVariables", null);
        setField(term388523, term388523.getClass(), "itsConst", null);
        setField(term388523, term388523.getClass(), "itsVariableNames", null);
        setIntField(term388523, term388523.getClass(), "varStart", 0);
        setField(term388523, term388523.getClass(), "compilerData", null);
        setIntField(term388523, term388523.getClass(), "type", 0);
        setField(term388523, term388523.getClass(), "next", null);
        setField(term388523, term388523.getClass(), "first", null);
        setField(term388523, term388523.getClass(), "last", null);
        setField(term388523, term388523.getClass(), "propListHead", null);
        setIntField(term388523, term388523.getClass(), "sourcePosition", 0);
        setField(term388523, term388523.getClass(), "jsType", null);
        setField(term388523, term388523.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term388398;
        args[1] = term388484;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term388398, term388522));
        assertTrue(recursiveEquals(term388484, term388523));
        assertTrue(recursiveEquals(retValue, false));
    }

};


