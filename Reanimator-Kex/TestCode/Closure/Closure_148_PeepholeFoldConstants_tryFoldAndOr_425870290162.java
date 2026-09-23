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

public class PeepholeFoldConstants_tryFoldAndOr_425870290162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29500;
     Object term29586;
     Object term29678;
     Object term29764;
     Object term30104;
     Object term30105;
     Object term30106;
     Object term30107;
     Object term30050;

    public PeepholeFoldConstants_tryFoldAndOr_425870290162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29500 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term29586 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term29586, term29586.getClass(), "parent", null);
        setIntField(term29586, term29586.getClass(), "type", 0);
        term29678 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term29678, term29678.getClass(), "type", 0);
        term29764 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term30104 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term30104, term30104.getClass(), "currentTraversal", null);
        term30105 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term30105, term30105.getClass(), "functionName", null);
        setBooleanField(term30105, term30105.getClass(), "itsNeedsActivation", false);
        setIntField(term30105, term30105.getClass(), "itsFunctionType", 0);
        setBooleanField(term30105, term30105.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term30105, term30105.getClass(), "encodedSourceStart", 0);
        setIntField(term30105, term30105.getClass(), "encodedSourceEnd", 0);
        setField(term30105, term30105.getClass(), "sourceName", null);
        setIntField(term30105, term30105.getClass(), "baseLineno", 0);
        setIntField(term30105, term30105.getClass(), "endLineno", 0);
        setField(term30105, term30105.getClass(), "functions", null);
        setField(term30105, term30105.getClass(), "regexps", null);
        setField(term30105, term30105.getClass(), "itsVariables", null);
        setField(term30105, term30105.getClass(), "itsConst", null);
        setField(term30105, term30105.getClass(), "itsVariableNames", null);
        setIntField(term30105, term30105.getClass(), "varStart", 0);
        setField(term30105, term30105.getClass(), "compilerData", null);
        setIntField(term30105, term30105.getClass(), "type", 0);
        setField(term30105, term30105.getClass(), "next", null);
        setField(term30105, term30105.getClass(), "first", null);
        setField(term30105, term30105.getClass(), "last", null);
        setField(term30105, term30105.getClass(), "propListHead", null);
        setIntField(term30105, term30105.getClass(), "sourcePosition", 0);
        setField(term30105, term30105.getClass(), "jsType", null);
        setField(term30105, term30105.getClass(), "parent", null);
        term30106 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term30106, term30106.getClass(), "str", null);
        setIntField(term30106, term30106.getClass(), "type", 0);
        setField(term30106, term30106.getClass(), "next", null);
        setField(term30106, term30106.getClass(), "first", null);
        setField(term30106, term30106.getClass(), "last", null);
        setField(term30106, term30106.getClass(), "propListHead", null);
        setIntField(term30106, term30106.getClass(), "sourcePosition", 0);
        setField(term30106, term30106.getClass(), "jsType", null);
        setField(term30106, term30106.getClass(), "parent", null);
        term30107 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term30107, term30107.getClass(), "functionName", null);
        setBooleanField(term30107, term30107.getClass(), "itsNeedsActivation", false);
        setIntField(term30107, term30107.getClass(), "itsFunctionType", 0);
        setBooleanField(term30107, term30107.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term30107, term30107.getClass(), "encodedSourceStart", 0);
        setIntField(term30107, term30107.getClass(), "encodedSourceEnd", 0);
        setField(term30107, term30107.getClass(), "sourceName", null);
        setIntField(term30107, term30107.getClass(), "baseLineno", 0);
        setIntField(term30107, term30107.getClass(), "endLineno", 0);
        setField(term30107, term30107.getClass(), "functions", null);
        setField(term30107, term30107.getClass(), "regexps", null);
        setField(term30107, term30107.getClass(), "itsVariables", null);
        setField(term30107, term30107.getClass(), "itsConst", null);
        setField(term30107, term30107.getClass(), "itsVariableNames", null);
        setIntField(term30107, term30107.getClass(), "varStart", 0);
        setField(term30107, term30107.getClass(), "compilerData", null);
        setIntField(term30107, term30107.getClass(), "type", 0);
        setField(term30107, term30107.getClass(), "next", null);
        setField(term30107, term30107.getClass(), "first", null);
        setField(term30107, term30107.getClass(), "last", null);
        setField(term30107, term30107.getClass(), "propListHead", null);
        setIntField(term30107, term30107.getClass(), "sourcePosition", 0);
        setField(term30107, term30107.getClass(), "jsType", null);
        setField(term30107, term30107.getClass(), "parent", null);
        term30050 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term30050, term30050.getClass(), "functionName", null);
        setBooleanField(term30050, term30050.getClass(), "itsNeedsActivation", false);
        setIntField(term30050, term30050.getClass(), "itsFunctionType", 0);
        setBooleanField(term30050, term30050.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term30050, term30050.getClass(), "encodedSourceStart", 0);
        setIntField(term30050, term30050.getClass(), "encodedSourceEnd", 0);
        setField(term30050, term30050.getClass(), "sourceName", null);
        setIntField(term30050, term30050.getClass(), "baseLineno", 0);
        setIntField(term30050, term30050.getClass(), "endLineno", 0);
        setField(term30050, term30050.getClass(), "functions", null);
        setField(term30050, term30050.getClass(), "regexps", null);
        setField(term30050, term30050.getClass(), "itsVariables", null);
        setField(term30050, term30050.getClass(), "itsConst", null);
        setField(term30050, term30050.getClass(), "itsVariableNames", null);
        setIntField(term30050, term30050.getClass(), "varStart", 0);
        setField(term30050, term30050.getClass(), "compilerData", null);
        setIntField(term30050, term30050.getClass(), "type", 0);
        setField(term30050, term30050.getClass(), "next", null);
        setField(term30050, term30050.getClass(), "first", null);
        setField(term30050, term30050.getClass(), "last", null);
        setField(term30050, term30050.getClass(), "propListHead", null);
        setIntField(term30050, term30050.getClass(), "sourcePosition", 0);
        setField(term30050, term30050.getClass(), "jsType", null);
        setField(term30050, term30050.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term29586;
        args[1] = term29678;
        args[2] = term29764;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term29500, args);
        assertTrue(recursiveEquals(term29500, term30104));
        assertTrue(recursiveEquals(term29586, term30105));
        assertTrue(recursiveEquals(term29678, term30106));
        assertTrue(recursiveEquals(term29764, term30107));
        assertTrue(recursiveEquals(retValue, term30050));
    }

};


