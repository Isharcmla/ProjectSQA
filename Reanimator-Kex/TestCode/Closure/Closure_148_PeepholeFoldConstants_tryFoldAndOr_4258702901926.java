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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511946;
     Object term512032;
     Object term512188;
     Object term512274;
     Object term512369;
     Object term512370;
     Object term512372;
     Object term512373;
     Object term512278;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term511946 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term512032 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term512102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term512102, term512102.getClass(), "type", 108);
        setField(term512032, term512032.getClass(), "parent", term512102);
        setIntField(term512032, term512032.getClass(), "type", 0);
        term512188 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term512188, term512188.getClass(), "type", 57);
        term512274 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term512274, term512274.getClass(), "type", 63);
        term512369 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term512369, term512369.getClass(), "currentTraversal", null);
        term512370 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term512371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term512370, term512370.getClass(), "functionName", null);
        setBooleanField(term512370, term512370.getClass(), "itsNeedsActivation", false);
        setIntField(term512370, term512370.getClass(), "itsFunctionType", 0);
        setBooleanField(term512370, term512370.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term512370, term512370.getClass(), "encodedSourceStart", 0);
        setIntField(term512370, term512370.getClass(), "encodedSourceEnd", 0);
        setField(term512370, term512370.getClass(), "sourceName", null);
        setIntField(term512370, term512370.getClass(), "baseLineno", 0);
        setIntField(term512370, term512370.getClass(), "endLineno", 0);
        setField(term512370, term512370.getClass(), "functions", null);
        setField(term512370, term512370.getClass(), "regexps", null);
        setField(term512370, term512370.getClass(), "itsVariables", null);
        setField(term512370, term512370.getClass(), "itsConst", null);
        setField(term512370, term512370.getClass(), "itsVariableNames", null);
        setIntField(term512370, term512370.getClass(), "varStart", 0);
        setField(term512370, term512370.getClass(), "compilerData", null);
        setIntField(term512370, term512370.getClass(), "type", 0);
        setField(term512370, term512370.getClass(), "next", null);
        setField(term512370, term512370.getClass(), "first", null);
        setField(term512370, term512370.getClass(), "last", null);
        setField(term512370, term512370.getClass(), "propListHead", null);
        setIntField(term512370, term512370.getClass(), "sourcePosition", 0);
        setField(term512370, term512370.getClass(), "jsType", null);
        setIntField(term512371, term512371.getClass(), "type", 108);
        setField(term512371, term512371.getClass(), "next", null);
        setField(term512371, term512371.getClass(), "first", null);
        setField(term512371, term512371.getClass(), "last", null);
        setField(term512371, term512371.getClass(), "propListHead", null);
        setIntField(term512371, term512371.getClass(), "sourcePosition", 0);
        setField(term512371, term512371.getClass(), "jsType", null);
        setField(term512371, term512371.getClass(), "parent", null);
        setField(term512370, term512370.getClass(), "parent", term512371);
        term512372 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term512372, term512372.getClass(), "functionName", null);
        setBooleanField(term512372, term512372.getClass(), "itsNeedsActivation", false);
        setIntField(term512372, term512372.getClass(), "itsFunctionType", 0);
        setBooleanField(term512372, term512372.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term512372, term512372.getClass(), "encodedSourceStart", 0);
        setIntField(term512372, term512372.getClass(), "encodedSourceEnd", 0);
        setField(term512372, term512372.getClass(), "sourceName", null);
        setIntField(term512372, term512372.getClass(), "baseLineno", 0);
        setIntField(term512372, term512372.getClass(), "endLineno", 0);
        setField(term512372, term512372.getClass(), "functions", null);
        setField(term512372, term512372.getClass(), "regexps", null);
        setField(term512372, term512372.getClass(), "itsVariables", null);
        setField(term512372, term512372.getClass(), "itsConst", null);
        setField(term512372, term512372.getClass(), "itsVariableNames", null);
        setIntField(term512372, term512372.getClass(), "varStart", 0);
        setField(term512372, term512372.getClass(), "compilerData", null);
        setIntField(term512372, term512372.getClass(), "type", 57);
        setField(term512372, term512372.getClass(), "next", null);
        setField(term512372, term512372.getClass(), "first", null);
        setField(term512372, term512372.getClass(), "last", null);
        setField(term512372, term512372.getClass(), "propListHead", null);
        setIntField(term512372, term512372.getClass(), "sourcePosition", 0);
        setField(term512372, term512372.getClass(), "jsType", null);
        setField(term512372, term512372.getClass(), "parent", null);
        term512373 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term512373, term512373.getClass(), "functionName", null);
        setBooleanField(term512373, term512373.getClass(), "itsNeedsActivation", false);
        setIntField(term512373, term512373.getClass(), "itsFunctionType", 0);
        setBooleanField(term512373, term512373.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term512373, term512373.getClass(), "encodedSourceStart", 0);
        setIntField(term512373, term512373.getClass(), "encodedSourceEnd", 0);
        setField(term512373, term512373.getClass(), "sourceName", null);
        setIntField(term512373, term512373.getClass(), "baseLineno", 0);
        setIntField(term512373, term512373.getClass(), "endLineno", 0);
        setField(term512373, term512373.getClass(), "functions", null);
        setField(term512373, term512373.getClass(), "regexps", null);
        setField(term512373, term512373.getClass(), "itsVariables", null);
        setField(term512373, term512373.getClass(), "itsConst", null);
        setField(term512373, term512373.getClass(), "itsVariableNames", null);
        setIntField(term512373, term512373.getClass(), "varStart", 0);
        setField(term512373, term512373.getClass(), "compilerData", null);
        setIntField(term512373, term512373.getClass(), "type", 63);
        setField(term512373, term512373.getClass(), "next", null);
        setField(term512373, term512373.getClass(), "first", null);
        setField(term512373, term512373.getClass(), "last", null);
        setField(term512373, term512373.getClass(), "propListHead", null);
        setIntField(term512373, term512373.getClass(), "sourcePosition", 0);
        setField(term512373, term512373.getClass(), "jsType", null);
        setField(term512373, term512373.getClass(), "parent", null);
        term512278 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term512289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term512278, term512278.getClass(), "functionName", null);
        setBooleanField(term512278, term512278.getClass(), "itsNeedsActivation", false);
        setIntField(term512278, term512278.getClass(), "itsFunctionType", 0);
        setBooleanField(term512278, term512278.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term512278, term512278.getClass(), "encodedSourceStart", 0);
        setIntField(term512278, term512278.getClass(), "encodedSourceEnd", 0);
        setField(term512278, term512278.getClass(), "sourceName", null);
        setIntField(term512278, term512278.getClass(), "baseLineno", 0);
        setIntField(term512278, term512278.getClass(), "endLineno", 0);
        setField(term512278, term512278.getClass(), "functions", null);
        setField(term512278, term512278.getClass(), "regexps", null);
        setField(term512278, term512278.getClass(), "itsVariables", null);
        setField(term512278, term512278.getClass(), "itsConst", null);
        setField(term512278, term512278.getClass(), "itsVariableNames", null);
        setIntField(term512278, term512278.getClass(), "varStart", 0);
        setField(term512278, term512278.getClass(), "compilerData", null);
        setIntField(term512278, term512278.getClass(), "type", 0);
        setField(term512278, term512278.getClass(), "next", null);
        setField(term512278, term512278.getClass(), "first", null);
        setField(term512278, term512278.getClass(), "last", null);
        setField(term512278, term512278.getClass(), "propListHead", null);
        setIntField(term512278, term512278.getClass(), "sourcePosition", 0);
        setField(term512278, term512278.getClass(), "jsType", null);
        setIntField(term512289, term512289.getClass(), "type", 108);
        setField(term512289, term512289.getClass(), "next", null);
        setField(term512289, term512289.getClass(), "first", null);
        setField(term512289, term512289.getClass(), "last", null);
        setField(term512289, term512289.getClass(), "propListHead", null);
        setIntField(term512289, term512289.getClass(), "sourcePosition", 0);
        setField(term512289, term512289.getClass(), "jsType", null);
        setField(term512289, term512289.getClass(), "parent", null);
        setField(term512278, term512278.getClass(), "parent", term512289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term512032;
        args[1] = term512188;
        args[2] = term512274;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term511946, args);
        assertTrue(recursiveEquals(term511946, term512369));
        assertTrue(recursiveEquals(term512032, term512370));
        assertTrue(recursiveEquals(term512188, term512372));
        assertTrue(recursiveEquals(term512274, term512373));
        assertTrue(recursiveEquals(retValue, term512278));
    }

};


