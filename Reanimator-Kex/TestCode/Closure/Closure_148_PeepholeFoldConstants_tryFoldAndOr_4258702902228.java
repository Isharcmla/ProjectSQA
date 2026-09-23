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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term610854;
     Object term610940;
     Object term611096;
     Object term611182;
     Object term611587;
     Object term611588;
     Object term611590;
     Object term611591;
     Object term611496;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term610854 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term610940 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term611010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term611010, term611010.getClass(), "type", 108);
        setField(term610940, term610940.getClass(), "parent", term611010);
        setIntField(term610940, term610940.getClass(), "type", 0);
        term611096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term611096, term611096.getClass(), "type", 65);
        term611182 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term611182, term611182.getClass(), "type", 63);
        term611587 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term611587, term611587.getClass(), "currentTraversal", null);
        term611588 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term611589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term611588, term611588.getClass(), "functionName", null);
        setBooleanField(term611588, term611588.getClass(), "itsNeedsActivation", false);
        setIntField(term611588, term611588.getClass(), "itsFunctionType", 0);
        setBooleanField(term611588, term611588.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term611588, term611588.getClass(), "encodedSourceStart", 0);
        setIntField(term611588, term611588.getClass(), "encodedSourceEnd", 0);
        setField(term611588, term611588.getClass(), "sourceName", null);
        setIntField(term611588, term611588.getClass(), "baseLineno", 0);
        setIntField(term611588, term611588.getClass(), "endLineno", 0);
        setField(term611588, term611588.getClass(), "functions", null);
        setField(term611588, term611588.getClass(), "regexps", null);
        setField(term611588, term611588.getClass(), "itsVariables", null);
        setField(term611588, term611588.getClass(), "itsConst", null);
        setField(term611588, term611588.getClass(), "itsVariableNames", null);
        setIntField(term611588, term611588.getClass(), "varStart", 0);
        setField(term611588, term611588.getClass(), "compilerData", null);
        setIntField(term611588, term611588.getClass(), "type", 0);
        setField(term611588, term611588.getClass(), "next", null);
        setField(term611588, term611588.getClass(), "first", null);
        setField(term611588, term611588.getClass(), "last", null);
        setField(term611588, term611588.getClass(), "propListHead", null);
        setIntField(term611588, term611588.getClass(), "sourcePosition", 0);
        setField(term611588, term611588.getClass(), "jsType", null);
        setIntField(term611589, term611589.getClass(), "type", 108);
        setField(term611589, term611589.getClass(), "next", null);
        setField(term611589, term611589.getClass(), "first", null);
        setField(term611589, term611589.getClass(), "last", null);
        setField(term611589, term611589.getClass(), "propListHead", null);
        setIntField(term611589, term611589.getClass(), "sourcePosition", 0);
        setField(term611589, term611589.getClass(), "jsType", null);
        setField(term611589, term611589.getClass(), "parent", null);
        setField(term611588, term611588.getClass(), "parent", term611589);
        term611590 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term611590, term611590.getClass(), "functionName", null);
        setBooleanField(term611590, term611590.getClass(), "itsNeedsActivation", false);
        setIntField(term611590, term611590.getClass(), "itsFunctionType", 0);
        setBooleanField(term611590, term611590.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term611590, term611590.getClass(), "encodedSourceStart", 0);
        setIntField(term611590, term611590.getClass(), "encodedSourceEnd", 0);
        setField(term611590, term611590.getClass(), "sourceName", null);
        setIntField(term611590, term611590.getClass(), "baseLineno", 0);
        setIntField(term611590, term611590.getClass(), "endLineno", 0);
        setField(term611590, term611590.getClass(), "functions", null);
        setField(term611590, term611590.getClass(), "regexps", null);
        setField(term611590, term611590.getClass(), "itsVariables", null);
        setField(term611590, term611590.getClass(), "itsConst", null);
        setField(term611590, term611590.getClass(), "itsVariableNames", null);
        setIntField(term611590, term611590.getClass(), "varStart", 0);
        setField(term611590, term611590.getClass(), "compilerData", null);
        setIntField(term611590, term611590.getClass(), "type", 65);
        setField(term611590, term611590.getClass(), "next", null);
        setField(term611590, term611590.getClass(), "first", null);
        setField(term611590, term611590.getClass(), "last", null);
        setField(term611590, term611590.getClass(), "propListHead", null);
        setIntField(term611590, term611590.getClass(), "sourcePosition", 0);
        setField(term611590, term611590.getClass(), "jsType", null);
        setField(term611590, term611590.getClass(), "parent", null);
        term611591 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term611591, term611591.getClass(), "functionName", null);
        setBooleanField(term611591, term611591.getClass(), "itsNeedsActivation", false);
        setIntField(term611591, term611591.getClass(), "itsFunctionType", 0);
        setBooleanField(term611591, term611591.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term611591, term611591.getClass(), "encodedSourceStart", 0);
        setIntField(term611591, term611591.getClass(), "encodedSourceEnd", 0);
        setField(term611591, term611591.getClass(), "sourceName", null);
        setIntField(term611591, term611591.getClass(), "baseLineno", 0);
        setIntField(term611591, term611591.getClass(), "endLineno", 0);
        setField(term611591, term611591.getClass(), "functions", null);
        setField(term611591, term611591.getClass(), "regexps", null);
        setField(term611591, term611591.getClass(), "itsVariables", null);
        setField(term611591, term611591.getClass(), "itsConst", null);
        setField(term611591, term611591.getClass(), "itsVariableNames", null);
        setIntField(term611591, term611591.getClass(), "varStart", 0);
        setField(term611591, term611591.getClass(), "compilerData", null);
        setIntField(term611591, term611591.getClass(), "type", 63);
        setField(term611591, term611591.getClass(), "next", null);
        setField(term611591, term611591.getClass(), "first", null);
        setField(term611591, term611591.getClass(), "last", null);
        setField(term611591, term611591.getClass(), "propListHead", null);
        setIntField(term611591, term611591.getClass(), "sourcePosition", 0);
        setField(term611591, term611591.getClass(), "jsType", null);
        setField(term611591, term611591.getClass(), "parent", null);
        term611496 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term611507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term611496, term611496.getClass(), "functionName", null);
        setBooleanField(term611496, term611496.getClass(), "itsNeedsActivation", false);
        setIntField(term611496, term611496.getClass(), "itsFunctionType", 0);
        setBooleanField(term611496, term611496.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term611496, term611496.getClass(), "encodedSourceStart", 0);
        setIntField(term611496, term611496.getClass(), "encodedSourceEnd", 0);
        setField(term611496, term611496.getClass(), "sourceName", null);
        setIntField(term611496, term611496.getClass(), "baseLineno", 0);
        setIntField(term611496, term611496.getClass(), "endLineno", 0);
        setField(term611496, term611496.getClass(), "functions", null);
        setField(term611496, term611496.getClass(), "regexps", null);
        setField(term611496, term611496.getClass(), "itsVariables", null);
        setField(term611496, term611496.getClass(), "itsConst", null);
        setField(term611496, term611496.getClass(), "itsVariableNames", null);
        setIntField(term611496, term611496.getClass(), "varStart", 0);
        setField(term611496, term611496.getClass(), "compilerData", null);
        setIntField(term611496, term611496.getClass(), "type", 0);
        setField(term611496, term611496.getClass(), "next", null);
        setField(term611496, term611496.getClass(), "first", null);
        setField(term611496, term611496.getClass(), "last", null);
        setField(term611496, term611496.getClass(), "propListHead", null);
        setIntField(term611496, term611496.getClass(), "sourcePosition", 0);
        setField(term611496, term611496.getClass(), "jsType", null);
        setIntField(term611507, term611507.getClass(), "type", 108);
        setField(term611507, term611507.getClass(), "next", null);
        setField(term611507, term611507.getClass(), "first", null);
        setField(term611507, term611507.getClass(), "last", null);
        setField(term611507, term611507.getClass(), "propListHead", null);
        setIntField(term611507, term611507.getClass(), "sourcePosition", 0);
        setField(term611507, term611507.getClass(), "jsType", null);
        setField(term611507, term611507.getClass(), "parent", null);
        setField(term611496, term611496.getClass(), "parent", term611507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term610940;
        args[1] = term611096;
        args[2] = term611182;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term610854, args);
        assertTrue(recursiveEquals(term610854, term611587));
        assertTrue(recursiveEquals(term610940, term611588));
        assertTrue(recursiveEquals(term611096, term611590));
        assertTrue(recursiveEquals(term611182, term611591));
        assertTrue(recursiveEquals(retValue, term611496));
    }

};


