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

public class PeepholeFoldConstants_tryFoldAndOr_425870290289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55581;
     Object term55667;
     Object term55759;
     Object term55845;
     Object term56345;
     Object term56346;
     Object term56347;
     Object term56348;
     Object term56290;

    public PeepholeFoldConstants_tryFoldAndOr_425870290289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55581 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term55667 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term55667, term55667.getClass(), "parent", null);
        setIntField(term55667, term55667.getClass(), "type", 0);
        term55759 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term55759, term55759.getClass(), "type", 0);
        term55845 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term56345 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term56345, term56345.getClass(), "currentTraversal", null);
        term56346 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term56346, term56346.getClass(), "functionName", null);
        setBooleanField(term56346, term56346.getClass(), "itsNeedsActivation", false);
        setIntField(term56346, term56346.getClass(), "itsFunctionType", 0);
        setBooleanField(term56346, term56346.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term56346, term56346.getClass(), "encodedSourceStart", 0);
        setIntField(term56346, term56346.getClass(), "encodedSourceEnd", 0);
        setField(term56346, term56346.getClass(), "sourceName", null);
        setIntField(term56346, term56346.getClass(), "baseLineno", 0);
        setIntField(term56346, term56346.getClass(), "endLineno", 0);
        setField(term56346, term56346.getClass(), "functions", null);
        setField(term56346, term56346.getClass(), "regexps", null);
        setField(term56346, term56346.getClass(), "itsVariables", null);
        setField(term56346, term56346.getClass(), "itsConst", null);
        setField(term56346, term56346.getClass(), "itsVariableNames", null);
        setIntField(term56346, term56346.getClass(), "varStart", 0);
        setField(term56346, term56346.getClass(), "compilerData", null);
        setIntField(term56346, term56346.getClass(), "type", 0);
        setField(term56346, term56346.getClass(), "next", null);
        setField(term56346, term56346.getClass(), "first", null);
        setField(term56346, term56346.getClass(), "last", null);
        setField(term56346, term56346.getClass(), "propListHead", null);
        setIntField(term56346, term56346.getClass(), "sourcePosition", 0);
        setField(term56346, term56346.getClass(), "jsType", null);
        setField(term56346, term56346.getClass(), "parent", null);
        term56347 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term56347, term56347.getClass(), "number", 0.0);
        setIntField(term56347, term56347.getClass(), "type", 0);
        setField(term56347, term56347.getClass(), "next", null);
        setField(term56347, term56347.getClass(), "first", null);
        setField(term56347, term56347.getClass(), "last", null);
        setField(term56347, term56347.getClass(), "propListHead", null);
        setIntField(term56347, term56347.getClass(), "sourcePosition", 0);
        setField(term56347, term56347.getClass(), "jsType", null);
        setField(term56347, term56347.getClass(), "parent", null);
        term56348 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term56348, term56348.getClass(), "functionName", null);
        setBooleanField(term56348, term56348.getClass(), "itsNeedsActivation", false);
        setIntField(term56348, term56348.getClass(), "itsFunctionType", 0);
        setBooleanField(term56348, term56348.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term56348, term56348.getClass(), "encodedSourceStart", 0);
        setIntField(term56348, term56348.getClass(), "encodedSourceEnd", 0);
        setField(term56348, term56348.getClass(), "sourceName", null);
        setIntField(term56348, term56348.getClass(), "baseLineno", 0);
        setIntField(term56348, term56348.getClass(), "endLineno", 0);
        setField(term56348, term56348.getClass(), "functions", null);
        setField(term56348, term56348.getClass(), "regexps", null);
        setField(term56348, term56348.getClass(), "itsVariables", null);
        setField(term56348, term56348.getClass(), "itsConst", null);
        setField(term56348, term56348.getClass(), "itsVariableNames", null);
        setIntField(term56348, term56348.getClass(), "varStart", 0);
        setField(term56348, term56348.getClass(), "compilerData", null);
        setIntField(term56348, term56348.getClass(), "type", 0);
        setField(term56348, term56348.getClass(), "next", null);
        setField(term56348, term56348.getClass(), "first", null);
        setField(term56348, term56348.getClass(), "last", null);
        setField(term56348, term56348.getClass(), "propListHead", null);
        setIntField(term56348, term56348.getClass(), "sourcePosition", 0);
        setField(term56348, term56348.getClass(), "jsType", null);
        setField(term56348, term56348.getClass(), "parent", null);
        term56290 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term56290, term56290.getClass(), "functionName", null);
        setBooleanField(term56290, term56290.getClass(), "itsNeedsActivation", false);
        setIntField(term56290, term56290.getClass(), "itsFunctionType", 0);
        setBooleanField(term56290, term56290.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term56290, term56290.getClass(), "encodedSourceStart", 0);
        setIntField(term56290, term56290.getClass(), "encodedSourceEnd", 0);
        setField(term56290, term56290.getClass(), "sourceName", null);
        setIntField(term56290, term56290.getClass(), "baseLineno", 0);
        setIntField(term56290, term56290.getClass(), "endLineno", 0);
        setField(term56290, term56290.getClass(), "functions", null);
        setField(term56290, term56290.getClass(), "regexps", null);
        setField(term56290, term56290.getClass(), "itsVariables", null);
        setField(term56290, term56290.getClass(), "itsConst", null);
        setField(term56290, term56290.getClass(), "itsVariableNames", null);
        setIntField(term56290, term56290.getClass(), "varStart", 0);
        setField(term56290, term56290.getClass(), "compilerData", null);
        setIntField(term56290, term56290.getClass(), "type", 0);
        setField(term56290, term56290.getClass(), "next", null);
        setField(term56290, term56290.getClass(), "first", null);
        setField(term56290, term56290.getClass(), "last", null);
        setField(term56290, term56290.getClass(), "propListHead", null);
        setIntField(term56290, term56290.getClass(), "sourcePosition", 0);
        setField(term56290, term56290.getClass(), "jsType", null);
        setField(term56290, term56290.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term55667;
        args[1] = term55759;
        args[2] = term55845;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term55581, args);
        assertTrue(recursiveEquals(term55581, term56345));
        assertTrue(recursiveEquals(term55667, term56346));
        assertTrue(recursiveEquals(term55759, term56347));
        assertTrue(recursiveEquals(term55845, term56348));
        assertTrue(recursiveEquals(retValue, term56290));
    }

};


