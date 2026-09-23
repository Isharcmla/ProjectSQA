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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422986;
     Object term423072;
     Object term423228;
     Object term423314;
     Object term423409;
     Object term423410;
     Object term423412;
     Object term423413;
     Object term423318;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422986 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term423072 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term423142, term423142.getClass(), "type", 108);
        setField(term423072, term423072.getClass(), "parent", term423142);
        setIntField(term423072, term423072.getClass(), "type", 0);
        term423228 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term423228, term423228.getClass(), "type", 75);
        term423314 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term423314, term423314.getClass(), "type", 63);
        term423409 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term423409, term423409.getClass(), "currentTraversal", null);
        term423410 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term423410, term423410.getClass(), "functionName", null);
        setBooleanField(term423410, term423410.getClass(), "itsNeedsActivation", false);
        setIntField(term423410, term423410.getClass(), "itsFunctionType", 0);
        setBooleanField(term423410, term423410.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423410, term423410.getClass(), "encodedSourceStart", 0);
        setIntField(term423410, term423410.getClass(), "encodedSourceEnd", 0);
        setField(term423410, term423410.getClass(), "sourceName", null);
        setIntField(term423410, term423410.getClass(), "baseLineno", 0);
        setIntField(term423410, term423410.getClass(), "endLineno", 0);
        setField(term423410, term423410.getClass(), "functions", null);
        setField(term423410, term423410.getClass(), "regexps", null);
        setField(term423410, term423410.getClass(), "itsVariables", null);
        setField(term423410, term423410.getClass(), "itsConst", null);
        setField(term423410, term423410.getClass(), "itsVariableNames", null);
        setIntField(term423410, term423410.getClass(), "varStart", 0);
        setField(term423410, term423410.getClass(), "compilerData", null);
        setIntField(term423410, term423410.getClass(), "type", 0);
        setField(term423410, term423410.getClass(), "next", null);
        setField(term423410, term423410.getClass(), "first", null);
        setField(term423410, term423410.getClass(), "last", null);
        setField(term423410, term423410.getClass(), "propListHead", null);
        setIntField(term423410, term423410.getClass(), "sourcePosition", 0);
        setField(term423410, term423410.getClass(), "jsType", null);
        setIntField(term423411, term423411.getClass(), "type", 108);
        setField(term423411, term423411.getClass(), "next", null);
        setField(term423411, term423411.getClass(), "first", null);
        setField(term423411, term423411.getClass(), "last", null);
        setField(term423411, term423411.getClass(), "propListHead", null);
        setIntField(term423411, term423411.getClass(), "sourcePosition", 0);
        setField(term423411, term423411.getClass(), "jsType", null);
        setField(term423411, term423411.getClass(), "parent", null);
        setField(term423410, term423410.getClass(), "parent", term423411);
        term423412 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term423412, term423412.getClass(), "functionName", null);
        setBooleanField(term423412, term423412.getClass(), "itsNeedsActivation", false);
        setIntField(term423412, term423412.getClass(), "itsFunctionType", 0);
        setBooleanField(term423412, term423412.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423412, term423412.getClass(), "encodedSourceStart", 0);
        setIntField(term423412, term423412.getClass(), "encodedSourceEnd", 0);
        setField(term423412, term423412.getClass(), "sourceName", null);
        setIntField(term423412, term423412.getClass(), "baseLineno", 0);
        setIntField(term423412, term423412.getClass(), "endLineno", 0);
        setField(term423412, term423412.getClass(), "functions", null);
        setField(term423412, term423412.getClass(), "regexps", null);
        setField(term423412, term423412.getClass(), "itsVariables", null);
        setField(term423412, term423412.getClass(), "itsConst", null);
        setField(term423412, term423412.getClass(), "itsVariableNames", null);
        setIntField(term423412, term423412.getClass(), "varStart", 0);
        setField(term423412, term423412.getClass(), "compilerData", null);
        setIntField(term423412, term423412.getClass(), "type", 75);
        setField(term423412, term423412.getClass(), "next", null);
        setField(term423412, term423412.getClass(), "first", null);
        setField(term423412, term423412.getClass(), "last", null);
        setField(term423412, term423412.getClass(), "propListHead", null);
        setIntField(term423412, term423412.getClass(), "sourcePosition", 0);
        setField(term423412, term423412.getClass(), "jsType", null);
        setField(term423412, term423412.getClass(), "parent", null);
        term423413 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term423413, term423413.getClass(), "functionName", null);
        setBooleanField(term423413, term423413.getClass(), "itsNeedsActivation", false);
        setIntField(term423413, term423413.getClass(), "itsFunctionType", 0);
        setBooleanField(term423413, term423413.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423413, term423413.getClass(), "encodedSourceStart", 0);
        setIntField(term423413, term423413.getClass(), "encodedSourceEnd", 0);
        setField(term423413, term423413.getClass(), "sourceName", null);
        setIntField(term423413, term423413.getClass(), "baseLineno", 0);
        setIntField(term423413, term423413.getClass(), "endLineno", 0);
        setField(term423413, term423413.getClass(), "functions", null);
        setField(term423413, term423413.getClass(), "regexps", null);
        setField(term423413, term423413.getClass(), "itsVariables", null);
        setField(term423413, term423413.getClass(), "itsConst", null);
        setField(term423413, term423413.getClass(), "itsVariableNames", null);
        setIntField(term423413, term423413.getClass(), "varStart", 0);
        setField(term423413, term423413.getClass(), "compilerData", null);
        setIntField(term423413, term423413.getClass(), "type", 63);
        setField(term423413, term423413.getClass(), "next", null);
        setField(term423413, term423413.getClass(), "first", null);
        setField(term423413, term423413.getClass(), "last", null);
        setField(term423413, term423413.getClass(), "propListHead", null);
        setIntField(term423413, term423413.getClass(), "sourcePosition", 0);
        setField(term423413, term423413.getClass(), "jsType", null);
        setField(term423413, term423413.getClass(), "parent", null);
        term423318 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term423329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term423318, term423318.getClass(), "functionName", null);
        setBooleanField(term423318, term423318.getClass(), "itsNeedsActivation", false);
        setIntField(term423318, term423318.getClass(), "itsFunctionType", 0);
        setBooleanField(term423318, term423318.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term423318, term423318.getClass(), "encodedSourceStart", 0);
        setIntField(term423318, term423318.getClass(), "encodedSourceEnd", 0);
        setField(term423318, term423318.getClass(), "sourceName", null);
        setIntField(term423318, term423318.getClass(), "baseLineno", 0);
        setIntField(term423318, term423318.getClass(), "endLineno", 0);
        setField(term423318, term423318.getClass(), "functions", null);
        setField(term423318, term423318.getClass(), "regexps", null);
        setField(term423318, term423318.getClass(), "itsVariables", null);
        setField(term423318, term423318.getClass(), "itsConst", null);
        setField(term423318, term423318.getClass(), "itsVariableNames", null);
        setIntField(term423318, term423318.getClass(), "varStart", 0);
        setField(term423318, term423318.getClass(), "compilerData", null);
        setIntField(term423318, term423318.getClass(), "type", 0);
        setField(term423318, term423318.getClass(), "next", null);
        setField(term423318, term423318.getClass(), "first", null);
        setField(term423318, term423318.getClass(), "last", null);
        setField(term423318, term423318.getClass(), "propListHead", null);
        setIntField(term423318, term423318.getClass(), "sourcePosition", 0);
        setField(term423318, term423318.getClass(), "jsType", null);
        setIntField(term423329, term423329.getClass(), "type", 108);
        setField(term423329, term423329.getClass(), "next", null);
        setField(term423329, term423329.getClass(), "first", null);
        setField(term423329, term423329.getClass(), "last", null);
        setField(term423329, term423329.getClass(), "propListHead", null);
        setIntField(term423329, term423329.getClass(), "sourcePosition", 0);
        setField(term423329, term423329.getClass(), "jsType", null);
        setField(term423329, term423329.getClass(), "parent", null);
        setField(term423318, term423318.getClass(), "parent", term423329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term423072;
        args[1] = term423228;
        args[2] = term423314;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term422986, args);
        assertTrue(recursiveEquals(term422986, term423409));
        assertTrue(recursiveEquals(term423072, term423410));
        assertTrue(recursiveEquals(term423228, term423412));
        assertTrue(recursiveEquals(term423314, term423413));
        assertTrue(recursiveEquals(retValue, term423318));
    }

};


