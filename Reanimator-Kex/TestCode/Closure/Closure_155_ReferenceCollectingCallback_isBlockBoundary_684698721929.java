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

public class ReferenceCollectingCallback_isBlockBoundary_684698721929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236851;
     Object term236943;
     Object term236965;
     Object term236966;

    public ReferenceCollectingCallback_isBlockBoundary_684698721929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236851 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term236851, term236851.getClass(), "type", 111);
        term236943 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term236943, term236943.getClass(), "type", 12);
        term236965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term236965, term236965.getClass(), "str", null);
        setIntField(term236965, term236965.getClass(), "type", 12);
        setField(term236965, term236965.getClass(), "next", null);
        setField(term236965, term236965.getClass(), "first", null);
        setField(term236965, term236965.getClass(), "last", null);
        setField(term236965, term236965.getClass(), "propListHead", null);
        setIntField(term236965, term236965.getClass(), "sourcePosition", 0);
        setField(term236965, term236965.getClass(), "jsType", null);
        setField(term236965, term236965.getClass(), "parent", null);
        term236966 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term236966, term236966.getClass(), "functionName", null);
        setBooleanField(term236966, term236966.getClass(), "itsNeedsActivation", false);
        setIntField(term236966, term236966.getClass(), "itsFunctionType", 0);
        setBooleanField(term236966, term236966.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term236966, term236966.getClass(), "encodedSourceStart", 0);
        setIntField(term236966, term236966.getClass(), "encodedSourceEnd", 0);
        setField(term236966, term236966.getClass(), "sourceName", null);
        setIntField(term236966, term236966.getClass(), "baseLineno", 0);
        setIntField(term236966, term236966.getClass(), "endLineno", 0);
        setField(term236966, term236966.getClass(), "functions", null);
        setField(term236966, term236966.getClass(), "regexps", null);
        setField(term236966, term236966.getClass(), "itsVariables", null);
        setField(term236966, term236966.getClass(), "itsConst", null);
        setField(term236966, term236966.getClass(), "itsVariableNames", null);
        setIntField(term236966, term236966.getClass(), "varStart", 0);
        setField(term236966, term236966.getClass(), "compilerData", null);
        setIntField(term236966, term236966.getClass(), "type", 111);
        setField(term236966, term236966.getClass(), "next", null);
        setField(term236966, term236966.getClass(), "first", null);
        setField(term236966, term236966.getClass(), "last", null);
        setField(term236966, term236966.getClass(), "propListHead", null);
        setIntField(term236966, term236966.getClass(), "sourcePosition", 0);
        setField(term236966, term236966.getClass(), "jsType", null);
        setField(term236966, term236966.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term236851;
        args[1] = term236943;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term236851, term236965));
        assertTrue(recursiveEquals(term236943, term236966));
        assertTrue(recursiveEquals(retValue, true));
    }

};


