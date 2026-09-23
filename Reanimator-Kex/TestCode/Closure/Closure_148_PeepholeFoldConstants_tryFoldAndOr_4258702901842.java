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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483614;
     Object term483700;
     Object term483878;
     Object term483970;
     Object term484077;
     Object term484078;
     Object term484080;
     Object term484081;
     Object term483982;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term483614 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term483700 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term483786 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term483786, term483786.getClass(), "type", 114);
        setField(term483700, term483700.getClass(), "parent", term483786);
        setIntField(term483700, term483700.getClass(), "type", 63);
        term483878 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term483878, term483878.getClass(), "type", 0);
        term483970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term483970, term483970.getClass(), "type", 63);
        term484077 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term484077, term484077.getClass(), "currentTraversal", null);
        term484078 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term484079 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term484078, term484078.getClass(), "functionName", null);
        setBooleanField(term484078, term484078.getClass(), "itsNeedsActivation", false);
        setIntField(term484078, term484078.getClass(), "itsFunctionType", 0);
        setBooleanField(term484078, term484078.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term484078, term484078.getClass(), "encodedSourceStart", 0);
        setIntField(term484078, term484078.getClass(), "encodedSourceEnd", 0);
        setField(term484078, term484078.getClass(), "sourceName", null);
        setIntField(term484078, term484078.getClass(), "baseLineno", 0);
        setIntField(term484078, term484078.getClass(), "endLineno", 0);
        setField(term484078, term484078.getClass(), "functions", null);
        setField(term484078, term484078.getClass(), "regexps", null);
        setField(term484078, term484078.getClass(), "itsVariables", null);
        setField(term484078, term484078.getClass(), "itsConst", null);
        setField(term484078, term484078.getClass(), "itsVariableNames", null);
        setIntField(term484078, term484078.getClass(), "varStart", 0);
        setField(term484078, term484078.getClass(), "compilerData", null);
        setIntField(term484078, term484078.getClass(), "type", 63);
        setField(term484078, term484078.getClass(), "next", null);
        setField(term484078, term484078.getClass(), "first", null);
        setField(term484078, term484078.getClass(), "last", null);
        setField(term484078, term484078.getClass(), "propListHead", null);
        setIntField(term484078, term484078.getClass(), "sourcePosition", 0);
        setField(term484078, term484078.getClass(), "jsType", null);
        setField(term484079, term484079.getClass(), "functionName", null);
        setBooleanField(term484079, term484079.getClass(), "itsNeedsActivation", false);
        setIntField(term484079, term484079.getClass(), "itsFunctionType", 0);
        setBooleanField(term484079, term484079.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term484079, term484079.getClass(), "encodedSourceStart", 0);
        setIntField(term484079, term484079.getClass(), "encodedSourceEnd", 0);
        setField(term484079, term484079.getClass(), "sourceName", null);
        setIntField(term484079, term484079.getClass(), "baseLineno", 0);
        setIntField(term484079, term484079.getClass(), "endLineno", 0);
        setField(term484079, term484079.getClass(), "functions", null);
        setField(term484079, term484079.getClass(), "regexps", null);
        setField(term484079, term484079.getClass(), "itsVariables", null);
        setField(term484079, term484079.getClass(), "itsConst", null);
        setField(term484079, term484079.getClass(), "itsVariableNames", null);
        setIntField(term484079, term484079.getClass(), "varStart", 0);
        setField(term484079, term484079.getClass(), "compilerData", null);
        setIntField(term484079, term484079.getClass(), "type", 114);
        setField(term484079, term484079.getClass(), "next", null);
        setField(term484079, term484079.getClass(), "first", null);
        setField(term484079, term484079.getClass(), "last", null);
        setField(term484079, term484079.getClass(), "propListHead", null);
        setIntField(term484079, term484079.getClass(), "sourcePosition", 0);
        setField(term484079, term484079.getClass(), "jsType", null);
        setField(term484079, term484079.getClass(), "parent", null);
        setField(term484078, term484078.getClass(), "parent", term484079);
        term484080 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term484080, term484080.getClass(), "number", 0.0);
        setIntField(term484080, term484080.getClass(), "type", 0);
        setField(term484080, term484080.getClass(), "next", null);
        setField(term484080, term484080.getClass(), "first", null);
        setField(term484080, term484080.getClass(), "last", null);
        setField(term484080, term484080.getClass(), "propListHead", null);
        setIntField(term484080, term484080.getClass(), "sourcePosition", 0);
        setField(term484080, term484080.getClass(), "jsType", null);
        setField(term484080, term484080.getClass(), "parent", null);
        term484081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term484081, term484081.getClass(), "number", 0.0);
        setIntField(term484081, term484081.getClass(), "type", 63);
        setField(term484081, term484081.getClass(), "next", null);
        setField(term484081, term484081.getClass(), "first", null);
        setField(term484081, term484081.getClass(), "last", null);
        setField(term484081, term484081.getClass(), "propListHead", null);
        setIntField(term484081, term484081.getClass(), "sourcePosition", 0);
        setField(term484081, term484081.getClass(), "jsType", null);
        setField(term484081, term484081.getClass(), "parent", null);
        term483982 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term483993 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term483982, term483982.getClass(), "functionName", null);
        setBooleanField(term483982, term483982.getClass(), "itsNeedsActivation", false);
        setIntField(term483982, term483982.getClass(), "itsFunctionType", 0);
        setBooleanField(term483982, term483982.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term483982, term483982.getClass(), "encodedSourceStart", 0);
        setIntField(term483982, term483982.getClass(), "encodedSourceEnd", 0);
        setField(term483982, term483982.getClass(), "sourceName", null);
        setIntField(term483982, term483982.getClass(), "baseLineno", 0);
        setIntField(term483982, term483982.getClass(), "endLineno", 0);
        setField(term483982, term483982.getClass(), "functions", null);
        setField(term483982, term483982.getClass(), "regexps", null);
        setField(term483982, term483982.getClass(), "itsVariables", null);
        setField(term483982, term483982.getClass(), "itsConst", null);
        setField(term483982, term483982.getClass(), "itsVariableNames", null);
        setIntField(term483982, term483982.getClass(), "varStart", 0);
        setField(term483982, term483982.getClass(), "compilerData", null);
        setIntField(term483982, term483982.getClass(), "type", 63);
        setField(term483982, term483982.getClass(), "next", null);
        setField(term483982, term483982.getClass(), "first", null);
        setField(term483982, term483982.getClass(), "last", null);
        setField(term483982, term483982.getClass(), "propListHead", null);
        setIntField(term483982, term483982.getClass(), "sourcePosition", 0);
        setField(term483982, term483982.getClass(), "jsType", null);
        setField(term483993, term483993.getClass(), "functionName", null);
        setBooleanField(term483993, term483993.getClass(), "itsNeedsActivation", false);
        setIntField(term483993, term483993.getClass(), "itsFunctionType", 0);
        setBooleanField(term483993, term483993.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term483993, term483993.getClass(), "encodedSourceStart", 0);
        setIntField(term483993, term483993.getClass(), "encodedSourceEnd", 0);
        setField(term483993, term483993.getClass(), "sourceName", null);
        setIntField(term483993, term483993.getClass(), "baseLineno", 0);
        setIntField(term483993, term483993.getClass(), "endLineno", 0);
        setField(term483993, term483993.getClass(), "functions", null);
        setField(term483993, term483993.getClass(), "regexps", null);
        setField(term483993, term483993.getClass(), "itsVariables", null);
        setField(term483993, term483993.getClass(), "itsConst", null);
        setField(term483993, term483993.getClass(), "itsVariableNames", null);
        setIntField(term483993, term483993.getClass(), "varStart", 0);
        setField(term483993, term483993.getClass(), "compilerData", null);
        setIntField(term483993, term483993.getClass(), "type", 114);
        setField(term483993, term483993.getClass(), "next", null);
        setField(term483993, term483993.getClass(), "first", null);
        setField(term483993, term483993.getClass(), "last", null);
        setField(term483993, term483993.getClass(), "propListHead", null);
        setIntField(term483993, term483993.getClass(), "sourcePosition", 0);
        setField(term483993, term483993.getClass(), "jsType", null);
        setField(term483993, term483993.getClass(), "parent", null);
        setField(term483982, term483982.getClass(), "parent", term483993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term483700;
        args[1] = term483878;
        args[2] = term483970;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term483614, args);
        assertTrue(recursiveEquals(term483614, term484077));
        assertTrue(recursiveEquals(term483700, term484078));
        assertTrue(recursiveEquals(term483878, term484080));
        assertTrue(recursiveEquals(term483970, term484081));
        assertTrue(recursiveEquals(retValue, term483982));
    }

};


