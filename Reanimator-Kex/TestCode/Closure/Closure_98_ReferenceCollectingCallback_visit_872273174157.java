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

public class ReferenceCollectingCallback_visit_872273174157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37614;
     Object term37700;
     Object term37786;
     Object term38412;
     Object term38413;
     Object term38414;

    public ReferenceCollectingCallback_visit_872273174157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37614 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term37700 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term37700, term37700.getClass(), "type", -39);
        term37786 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term38412 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term38412, term38412.getClass(), "referenceMap", null);
        setField(term38412, term38412.getClass(), "blockStack", null);
        setField(term38412, term38412.getClass(), "behavior", null);
        setField(term38412, term38412.getClass(), "compiler", null);
        setField(term38412, term38412.getClass(), "varFilter", null);
        term38413 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term38413, term38413.getClass(), "functionName", null);
        setBooleanField(term38413, term38413.getClass(), "itsNeedsActivation", false);
        setIntField(term38413, term38413.getClass(), "itsFunctionType", 0);
        setBooleanField(term38413, term38413.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term38413, term38413.getClass(), "encodedSourceStart", 0);
        setIntField(term38413, term38413.getClass(), "encodedSourceEnd", 0);
        setField(term38413, term38413.getClass(), "sourceName", null);
        setIntField(term38413, term38413.getClass(), "baseLineno", 0);
        setIntField(term38413, term38413.getClass(), "endLineno", 0);
        setField(term38413, term38413.getClass(), "functions", null);
        setField(term38413, term38413.getClass(), "regexps", null);
        setField(term38413, term38413.getClass(), "itsVariables", null);
        setField(term38413, term38413.getClass(), "itsConst", null);
        setField(term38413, term38413.getClass(), "itsVariableNames", null);
        setIntField(term38413, term38413.getClass(), "varStart", 0);
        setField(term38413, term38413.getClass(), "compilerData", null);
        setIntField(term38413, term38413.getClass(), "type", -39);
        setField(term38413, term38413.getClass(), "next", null);
        setField(term38413, term38413.getClass(), "first", null);
        setField(term38413, term38413.getClass(), "last", null);
        setField(term38413, term38413.getClass(), "propListHead", null);
        setIntField(term38413, term38413.getClass(), "sourcePosition", 0);
        setField(term38413, term38413.getClass(), "jsType", null);
        setField(term38413, term38413.getClass(), "parent", null);
        term38414 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term38414, term38414.getClass(), "functionName", null);
        setBooleanField(term38414, term38414.getClass(), "itsNeedsActivation", false);
        setIntField(term38414, term38414.getClass(), "itsFunctionType", 0);
        setBooleanField(term38414, term38414.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term38414, term38414.getClass(), "encodedSourceStart", 0);
        setIntField(term38414, term38414.getClass(), "encodedSourceEnd", 0);
        setField(term38414, term38414.getClass(), "sourceName", null);
        setIntField(term38414, term38414.getClass(), "baseLineno", 0);
        setIntField(term38414, term38414.getClass(), "endLineno", 0);
        setField(term38414, term38414.getClass(), "functions", null);
        setField(term38414, term38414.getClass(), "regexps", null);
        setField(term38414, term38414.getClass(), "itsVariables", null);
        setField(term38414, term38414.getClass(), "itsConst", null);
        setField(term38414, term38414.getClass(), "itsVariableNames", null);
        setIntField(term38414, term38414.getClass(), "varStart", 0);
        setField(term38414, term38414.getClass(), "compilerData", null);
        setIntField(term38414, term38414.getClass(), "type", 0);
        setField(term38414, term38414.getClass(), "next", null);
        setField(term38414, term38414.getClass(), "first", null);
        setField(term38414, term38414.getClass(), "last", null);
        setField(term38414, term38414.getClass(), "propListHead", null);
        setIntField(term38414, term38414.getClass(), "sourcePosition", 0);
        setField(term38414, term38414.getClass(), "jsType", null);
        setField(term38414, term38414.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term37700;
        args[2] = term37786;
        callMethod(klass, "visit", argTypes, term37614, args);
        assertTrue(recursiveEquals(term37614, term38412));
        assertTrue(recursiveEquals(term37700, term38414));
        assertTrue(recursiveEquals(term37786, null));
    }

};


