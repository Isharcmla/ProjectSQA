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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566570;
     Object term566656;
     Object term566748;
     Object term566834;
     Object term567005;
     Object term567006;
     Object term567007;
     Object term567008;
     Object term566951;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566570 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term566656 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term566656, term566656.getClass(), "parent", null);
        setIntField(term566656, term566656.getClass(), "type", 0);
        term566748 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term566748, term566748.getClass(), "type", 0);
        term566834 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term567005 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term567005, term567005.getClass(), "currentTraversal", null);
        term567006 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term567006, term567006.getClass(), "functionName", null);
        setBooleanField(term567006, term567006.getClass(), "itsNeedsActivation", false);
        setIntField(term567006, term567006.getClass(), "itsFunctionType", 0);
        setBooleanField(term567006, term567006.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term567006, term567006.getClass(), "encodedSourceStart", 0);
        setIntField(term567006, term567006.getClass(), "encodedSourceEnd", 0);
        setField(term567006, term567006.getClass(), "sourceName", null);
        setIntField(term567006, term567006.getClass(), "baseLineno", 0);
        setIntField(term567006, term567006.getClass(), "endLineno", 0);
        setField(term567006, term567006.getClass(), "functions", null);
        setField(term567006, term567006.getClass(), "regexps", null);
        setField(term567006, term567006.getClass(), "itsVariables", null);
        setField(term567006, term567006.getClass(), "itsConst", null);
        setField(term567006, term567006.getClass(), "itsVariableNames", null);
        setIntField(term567006, term567006.getClass(), "varStart", 0);
        setField(term567006, term567006.getClass(), "compilerData", null);
        setIntField(term567006, term567006.getClass(), "type", 0);
        setField(term567006, term567006.getClass(), "next", null);
        setField(term567006, term567006.getClass(), "first", null);
        setField(term567006, term567006.getClass(), "last", null);
        setField(term567006, term567006.getClass(), "propListHead", null);
        setIntField(term567006, term567006.getClass(), "sourcePosition", 0);
        setField(term567006, term567006.getClass(), "jsType", null);
        setField(term567006, term567006.getClass(), "parent", null);
        term567007 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term567007, term567007.getClass(), "str", null);
        setIntField(term567007, term567007.getClass(), "type", 0);
        setField(term567007, term567007.getClass(), "next", null);
        setField(term567007, term567007.getClass(), "first", null);
        setField(term567007, term567007.getClass(), "last", null);
        setField(term567007, term567007.getClass(), "propListHead", null);
        setIntField(term567007, term567007.getClass(), "sourcePosition", 0);
        setField(term567007, term567007.getClass(), "jsType", null);
        setField(term567007, term567007.getClass(), "parent", null);
        term567008 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term567008, term567008.getClass(), "functionName", null);
        setBooleanField(term567008, term567008.getClass(), "itsNeedsActivation", false);
        setIntField(term567008, term567008.getClass(), "itsFunctionType", 0);
        setBooleanField(term567008, term567008.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term567008, term567008.getClass(), "encodedSourceStart", 0);
        setIntField(term567008, term567008.getClass(), "encodedSourceEnd", 0);
        setField(term567008, term567008.getClass(), "sourceName", null);
        setIntField(term567008, term567008.getClass(), "baseLineno", 0);
        setIntField(term567008, term567008.getClass(), "endLineno", 0);
        setField(term567008, term567008.getClass(), "functions", null);
        setField(term567008, term567008.getClass(), "regexps", null);
        setField(term567008, term567008.getClass(), "itsVariables", null);
        setField(term567008, term567008.getClass(), "itsConst", null);
        setField(term567008, term567008.getClass(), "itsVariableNames", null);
        setIntField(term567008, term567008.getClass(), "varStart", 0);
        setField(term567008, term567008.getClass(), "compilerData", null);
        setIntField(term567008, term567008.getClass(), "type", 0);
        setField(term567008, term567008.getClass(), "next", null);
        setField(term567008, term567008.getClass(), "first", null);
        setField(term567008, term567008.getClass(), "last", null);
        setField(term567008, term567008.getClass(), "propListHead", null);
        setIntField(term567008, term567008.getClass(), "sourcePosition", 0);
        setField(term567008, term567008.getClass(), "jsType", null);
        setField(term567008, term567008.getClass(), "parent", null);
        term566951 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term566951, term566951.getClass(), "functionName", null);
        setBooleanField(term566951, term566951.getClass(), "itsNeedsActivation", false);
        setIntField(term566951, term566951.getClass(), "itsFunctionType", 0);
        setBooleanField(term566951, term566951.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term566951, term566951.getClass(), "encodedSourceStart", 0);
        setIntField(term566951, term566951.getClass(), "encodedSourceEnd", 0);
        setField(term566951, term566951.getClass(), "sourceName", null);
        setIntField(term566951, term566951.getClass(), "baseLineno", 0);
        setIntField(term566951, term566951.getClass(), "endLineno", 0);
        setField(term566951, term566951.getClass(), "functions", null);
        setField(term566951, term566951.getClass(), "regexps", null);
        setField(term566951, term566951.getClass(), "itsVariables", null);
        setField(term566951, term566951.getClass(), "itsConst", null);
        setField(term566951, term566951.getClass(), "itsVariableNames", null);
        setIntField(term566951, term566951.getClass(), "varStart", 0);
        setField(term566951, term566951.getClass(), "compilerData", null);
        setIntField(term566951, term566951.getClass(), "type", 0);
        setField(term566951, term566951.getClass(), "next", null);
        setField(term566951, term566951.getClass(), "first", null);
        setField(term566951, term566951.getClass(), "last", null);
        setField(term566951, term566951.getClass(), "propListHead", null);
        setIntField(term566951, term566951.getClass(), "sourcePosition", 0);
        setField(term566951, term566951.getClass(), "jsType", null);
        setField(term566951, term566951.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term566656;
        args[1] = term566748;
        args[2] = term566834;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term566570, args);
        assertTrue(recursiveEquals(term566570, term567005));
        assertTrue(recursiveEquals(term566656, term567006));
        assertTrue(recursiveEquals(term566748, term567007));
        assertTrue(recursiveEquals(term566834, term567008));
        assertTrue(recursiveEquals(retValue, term566951));
    }

};


