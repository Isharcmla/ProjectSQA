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

public class ReferenceCollectingCallback_isBlockBoundary_684698721807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213826;
     Object term213918;
     Object term213938;
     Object term213939;

    public ReferenceCollectingCallback_isBlockBoundary_684698721807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213826 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term213918 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term213918, term213918.getClass(), "type", 12);
        term213938 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term213938, term213938.getClass(), "str", null);
        setIntField(term213938, term213938.getClass(), "type", 12);
        setField(term213938, term213938.getClass(), "next", null);
        setField(term213938, term213938.getClass(), "first", null);
        setField(term213938, term213938.getClass(), "last", null);
        setField(term213938, term213938.getClass(), "propListHead", null);
        setIntField(term213938, term213938.getClass(), "sourcePosition", 0);
        setField(term213938, term213938.getClass(), "jsType", null);
        setField(term213938, term213938.getClass(), "parent", null);
        term213939 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term213939, term213939.getClass(), "functionName", null);
        setBooleanField(term213939, term213939.getClass(), "itsNeedsActivation", false);
        setIntField(term213939, term213939.getClass(), "itsFunctionType", 0);
        setBooleanField(term213939, term213939.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term213939, term213939.getClass(), "encodedSourceStart", 0);
        setIntField(term213939, term213939.getClass(), "encodedSourceEnd", 0);
        setField(term213939, term213939.getClass(), "sourceName", null);
        setIntField(term213939, term213939.getClass(), "baseLineno", 0);
        setIntField(term213939, term213939.getClass(), "endLineno", 0);
        setField(term213939, term213939.getClass(), "functions", null);
        setField(term213939, term213939.getClass(), "regexps", null);
        setField(term213939, term213939.getClass(), "itsVariables", null);
        setField(term213939, term213939.getClass(), "itsConst", null);
        setField(term213939, term213939.getClass(), "itsVariableNames", null);
        setIntField(term213939, term213939.getClass(), "varStart", 0);
        setField(term213939, term213939.getClass(), "compilerData", null);
        setIntField(term213939, term213939.getClass(), "type", 0);
        setField(term213939, term213939.getClass(), "next", null);
        setField(term213939, term213939.getClass(), "first", null);
        setField(term213939, term213939.getClass(), "last", null);
        setField(term213939, term213939.getClass(), "propListHead", null);
        setIntField(term213939, term213939.getClass(), "sourcePosition", 0);
        setField(term213939, term213939.getClass(), "jsType", null);
        setField(term213939, term213939.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term213826;
        args[1] = term213918;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term213826, term213938));
        assertTrue(recursiveEquals(term213918, term213939));
        assertTrue(recursiveEquals(retValue, false));
    }

};


