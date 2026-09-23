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

public class ReferenceCollectingCallback_isBlockBoundary_684698721325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75297;
     Object term75383;
     Object term75413;
     Object term75414;

    public ReferenceCollectingCallback_isBlockBoundary_684698721325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75297 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term75383 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term75383, term75383.getClass(), "type", 12);
        term75413 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term75413, term75413.getClass(), "functionName", null);
        setBooleanField(term75413, term75413.getClass(), "itsNeedsActivation", false);
        setIntField(term75413, term75413.getClass(), "itsFunctionType", 0);
        setBooleanField(term75413, term75413.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term75413, term75413.getClass(), "encodedSourceStart", 0);
        setIntField(term75413, term75413.getClass(), "encodedSourceEnd", 0);
        setField(term75413, term75413.getClass(), "sourceName", null);
        setIntField(term75413, term75413.getClass(), "baseLineno", 0);
        setIntField(term75413, term75413.getClass(), "endLineno", 0);
        setField(term75413, term75413.getClass(), "functions", null);
        setField(term75413, term75413.getClass(), "regexps", null);
        setField(term75413, term75413.getClass(), "itsVariables", null);
        setField(term75413, term75413.getClass(), "itsConst", null);
        setField(term75413, term75413.getClass(), "itsVariableNames", null);
        setIntField(term75413, term75413.getClass(), "varStart", 0);
        setField(term75413, term75413.getClass(), "compilerData", null);
        setIntField(term75413, term75413.getClass(), "type", 12);
        setField(term75413, term75413.getClass(), "next", null);
        setField(term75413, term75413.getClass(), "first", null);
        setField(term75413, term75413.getClass(), "last", null);
        setField(term75413, term75413.getClass(), "propListHead", null);
        setIntField(term75413, term75413.getClass(), "sourcePosition", 0);
        setField(term75413, term75413.getClass(), "jsType", null);
        setField(term75413, term75413.getClass(), "parent", null);
        term75414 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term75414, term75414.getClass(), "functionName", null);
        setBooleanField(term75414, term75414.getClass(), "itsNeedsActivation", false);
        setIntField(term75414, term75414.getClass(), "itsFunctionType", 0);
        setBooleanField(term75414, term75414.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term75414, term75414.getClass(), "encodedSourceStart", 0);
        setIntField(term75414, term75414.getClass(), "encodedSourceEnd", 0);
        setField(term75414, term75414.getClass(), "sourceName", null);
        setIntField(term75414, term75414.getClass(), "baseLineno", 0);
        setIntField(term75414, term75414.getClass(), "endLineno", 0);
        setField(term75414, term75414.getClass(), "functions", null);
        setField(term75414, term75414.getClass(), "regexps", null);
        setField(term75414, term75414.getClass(), "itsVariables", null);
        setField(term75414, term75414.getClass(), "itsConst", null);
        setField(term75414, term75414.getClass(), "itsVariableNames", null);
        setIntField(term75414, term75414.getClass(), "varStart", 0);
        setField(term75414, term75414.getClass(), "compilerData", null);
        setIntField(term75414, term75414.getClass(), "type", 0);
        setField(term75414, term75414.getClass(), "next", null);
        setField(term75414, term75414.getClass(), "first", null);
        setField(term75414, term75414.getClass(), "last", null);
        setField(term75414, term75414.getClass(), "propListHead", null);
        setIntField(term75414, term75414.getClass(), "sourcePosition", 0);
        setField(term75414, term75414.getClass(), "jsType", null);
        setField(term75414, term75414.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term75297;
        args[1] = term75383;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term75297, term75413));
        assertTrue(recursiveEquals(term75383, term75414));
        assertTrue(recursiveEquals(retValue, false));
    }

};


