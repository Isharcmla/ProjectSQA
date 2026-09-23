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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295377;
     Object term295463;
     Object term295965;
     Object term295966;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295377 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term295463 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term295463, term295463.getClass(), "type", 12);
        term295965 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term295965, term295965.getClass(), "functionName", null);
        setBooleanField(term295965, term295965.getClass(), "itsNeedsActivation", false);
        setIntField(term295965, term295965.getClass(), "itsFunctionType", 0);
        setBooleanField(term295965, term295965.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term295965, term295965.getClass(), "encodedSourceStart", 0);
        setIntField(term295965, term295965.getClass(), "encodedSourceEnd", 0);
        setField(term295965, term295965.getClass(), "sourceName", null);
        setIntField(term295965, term295965.getClass(), "baseLineno", 0);
        setIntField(term295965, term295965.getClass(), "endLineno", 0);
        setField(term295965, term295965.getClass(), "functions", null);
        setField(term295965, term295965.getClass(), "regexps", null);
        setField(term295965, term295965.getClass(), "itsVariables", null);
        setField(term295965, term295965.getClass(), "itsConst", null);
        setField(term295965, term295965.getClass(), "itsVariableNames", null);
        setIntField(term295965, term295965.getClass(), "varStart", 0);
        setField(term295965, term295965.getClass(), "compilerData", null);
        setIntField(term295965, term295965.getClass(), "type", 12);
        setField(term295965, term295965.getClass(), "next", null);
        setField(term295965, term295965.getClass(), "first", null);
        setField(term295965, term295965.getClass(), "last", null);
        setField(term295965, term295965.getClass(), "propListHead", null);
        setIntField(term295965, term295965.getClass(), "sourcePosition", 0);
        setField(term295965, term295965.getClass(), "jsType", null);
        setField(term295965, term295965.getClass(), "parent", null);
        term295966 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term295966, term295966.getClass(), "functionName", null);
        setBooleanField(term295966, term295966.getClass(), "itsNeedsActivation", false);
        setIntField(term295966, term295966.getClass(), "itsFunctionType", 0);
        setBooleanField(term295966, term295966.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term295966, term295966.getClass(), "encodedSourceStart", 0);
        setIntField(term295966, term295966.getClass(), "encodedSourceEnd", 0);
        setField(term295966, term295966.getClass(), "sourceName", null);
        setIntField(term295966, term295966.getClass(), "baseLineno", 0);
        setIntField(term295966, term295966.getClass(), "endLineno", 0);
        setField(term295966, term295966.getClass(), "functions", null);
        setField(term295966, term295966.getClass(), "regexps", null);
        setField(term295966, term295966.getClass(), "itsVariables", null);
        setField(term295966, term295966.getClass(), "itsConst", null);
        setField(term295966, term295966.getClass(), "itsVariableNames", null);
        setIntField(term295966, term295966.getClass(), "varStart", 0);
        setField(term295966, term295966.getClass(), "compilerData", null);
        setIntField(term295966, term295966.getClass(), "type", 0);
        setField(term295966, term295966.getClass(), "next", null);
        setField(term295966, term295966.getClass(), "first", null);
        setField(term295966, term295966.getClass(), "last", null);
        setField(term295966, term295966.getClass(), "propListHead", null);
        setIntField(term295966, term295966.getClass(), "sourcePosition", 0);
        setField(term295966, term295966.getClass(), "jsType", null);
        setField(term295966, term295966.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term295377;
        args[1] = term295463;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term295377, term295965));
        assertTrue(recursiveEquals(term295463, term295966));
        assertTrue(recursiveEquals(retValue, false));
    }

};


