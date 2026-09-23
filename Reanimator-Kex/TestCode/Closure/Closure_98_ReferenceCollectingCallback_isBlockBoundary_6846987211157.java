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
import java.lang.Object;

public class ReferenceCollectingCallback_isBlockBoundary_6846987211157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341180;
     Object term341266;
     Object term341411;
     Object term341413;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341180 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term341266 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term341352 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term341266, term341266.getClass(), "type", 98);
        setField(term341266, term341266.getClass(), "first", term341352);
        term341411 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term341412 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term341411, term341411.getClass(), "functionName", null);
        setBooleanField(term341411, term341411.getClass(), "itsNeedsActivation", false);
        setIntField(term341411, term341411.getClass(), "itsFunctionType", 0);
        setBooleanField(term341411, term341411.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term341411, term341411.getClass(), "encodedSourceStart", 0);
        setIntField(term341411, term341411.getClass(), "encodedSourceEnd", 0);
        setField(term341411, term341411.getClass(), "sourceName", null);
        setIntField(term341411, term341411.getClass(), "baseLineno", 0);
        setIntField(term341411, term341411.getClass(), "endLineno", 0);
        setField(term341411, term341411.getClass(), "functions", null);
        setField(term341411, term341411.getClass(), "regexps", null);
        setField(term341411, term341411.getClass(), "itsVariables", null);
        setField(term341411, term341411.getClass(), "itsConst", null);
        setField(term341411, term341411.getClass(), "itsVariableNames", null);
        setIntField(term341411, term341411.getClass(), "varStart", 0);
        setField(term341411, term341411.getClass(), "compilerData", null);
        setIntField(term341411, term341411.getClass(), "type", 98);
        setField(term341411, term341411.getClass(), "next", null);
        setField(term341412, term341412.getClass(), "functionName", null);
        setBooleanField(term341412, term341412.getClass(), "itsNeedsActivation", false);
        setIntField(term341412, term341412.getClass(), "itsFunctionType", 0);
        setBooleanField(term341412, term341412.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term341412, term341412.getClass(), "encodedSourceStart", 0);
        setIntField(term341412, term341412.getClass(), "encodedSourceEnd", 0);
        setField(term341412, term341412.getClass(), "sourceName", null);
        setIntField(term341412, term341412.getClass(), "baseLineno", 0);
        setIntField(term341412, term341412.getClass(), "endLineno", 0);
        setField(term341412, term341412.getClass(), "functions", null);
        setField(term341412, term341412.getClass(), "regexps", null);
        setField(term341412, term341412.getClass(), "itsVariables", null);
        setField(term341412, term341412.getClass(), "itsConst", null);
        setField(term341412, term341412.getClass(), "itsVariableNames", null);
        setIntField(term341412, term341412.getClass(), "varStart", 0);
        setField(term341412, term341412.getClass(), "compilerData", null);
        setIntField(term341412, term341412.getClass(), "type", 0);
        setField(term341412, term341412.getClass(), "next", null);
        setField(term341412, term341412.getClass(), "first", null);
        setField(term341412, term341412.getClass(), "last", null);
        setField(term341412, term341412.getClass(), "propListHead", null);
        setIntField(term341412, term341412.getClass(), "sourcePosition", 0);
        setField(term341412, term341412.getClass(), "jsType", null);
        setField(term341412, term341412.getClass(), "parent", null);
        setField(term341411, term341411.getClass(), "first", term341412);
        setField(term341411, term341411.getClass(), "last", null);
        setField(term341411, term341411.getClass(), "propListHead", null);
        setIntField(term341411, term341411.getClass(), "sourcePosition", 0);
        setField(term341411, term341411.getClass(), "jsType", null);
        setField(term341411, term341411.getClass(), "parent", null);
        term341413 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term341413, term341413.getClass(), "functionName", null);
        setBooleanField(term341413, term341413.getClass(), "itsNeedsActivation", false);
        setIntField(term341413, term341413.getClass(), "itsFunctionType", 0);
        setBooleanField(term341413, term341413.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term341413, term341413.getClass(), "encodedSourceStart", 0);
        setIntField(term341413, term341413.getClass(), "encodedSourceEnd", 0);
        setField(term341413, term341413.getClass(), "sourceName", null);
        setIntField(term341413, term341413.getClass(), "baseLineno", 0);
        setIntField(term341413, term341413.getClass(), "endLineno", 0);
        setField(term341413, term341413.getClass(), "functions", null);
        setField(term341413, term341413.getClass(), "regexps", null);
        setField(term341413, term341413.getClass(), "itsVariables", null);
        setField(term341413, term341413.getClass(), "itsConst", null);
        setField(term341413, term341413.getClass(), "itsVariableNames", null);
        setIntField(term341413, term341413.getClass(), "varStart", 0);
        setField(term341413, term341413.getClass(), "compilerData", null);
        setIntField(term341413, term341413.getClass(), "type", 0);
        setField(term341413, term341413.getClass(), "next", null);
        setField(term341413, term341413.getClass(), "first", null);
        setField(term341413, term341413.getClass(), "last", null);
        setField(term341413, term341413.getClass(), "propListHead", null);
        setIntField(term341413, term341413.getClass(), "sourcePosition", 0);
        setField(term341413, term341413.getClass(), "jsType", null);
        setField(term341413, term341413.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term341180;
        args[1] = term341266;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term341180, term341411));
        assertTrue(recursiveEquals(term341266, term341413));
        assertTrue(recursiveEquals(retValue, true));
    }

};


