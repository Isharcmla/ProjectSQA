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

public class PeepholeFoldConstants_tryFoldAndOr_425870290536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114683;
     Object term114769;
     Object term114947;
     Object term115017;
     Object term115123;
     Object term115124;
     Object term115126;
     Object term115127;
     Object term115066;

    public PeepholeFoldConstants_tryFoldAndOr_425870290536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114683 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term114769 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term114855 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term114769, term114769.getClass(), "parent", term114855);
        setIntField(term114769, term114769.getClass(), "type", 0);
        term114947 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term114947, term114947.getClass(), "type", 0);
        term115017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term115123 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term115123, term115123.getClass(), "currentTraversal", null);
        term115124 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term115125 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term115124, term115124.getClass(), "functionName", null);
        setBooleanField(term115124, term115124.getClass(), "itsNeedsActivation", false);
        setIntField(term115124, term115124.getClass(), "itsFunctionType", 0);
        setBooleanField(term115124, term115124.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term115124, term115124.getClass(), "encodedSourceStart", 0);
        setIntField(term115124, term115124.getClass(), "encodedSourceEnd", 0);
        setField(term115124, term115124.getClass(), "sourceName", null);
        setIntField(term115124, term115124.getClass(), "baseLineno", 0);
        setIntField(term115124, term115124.getClass(), "endLineno", 0);
        setField(term115124, term115124.getClass(), "functions", null);
        setField(term115124, term115124.getClass(), "regexps", null);
        setField(term115124, term115124.getClass(), "itsVariables", null);
        setField(term115124, term115124.getClass(), "itsConst", null);
        setField(term115124, term115124.getClass(), "itsVariableNames", null);
        setIntField(term115124, term115124.getClass(), "varStart", 0);
        setField(term115124, term115124.getClass(), "compilerData", null);
        setIntField(term115124, term115124.getClass(), "type", 0);
        setField(term115124, term115124.getClass(), "next", null);
        setField(term115124, term115124.getClass(), "first", null);
        setField(term115124, term115124.getClass(), "last", null);
        setField(term115124, term115124.getClass(), "propListHead", null);
        setIntField(term115124, term115124.getClass(), "sourcePosition", 0);
        setField(term115124, term115124.getClass(), "jsType", null);
        setField(term115125, term115125.getClass(), "functionName", null);
        setBooleanField(term115125, term115125.getClass(), "itsNeedsActivation", false);
        setIntField(term115125, term115125.getClass(), "itsFunctionType", 0);
        setBooleanField(term115125, term115125.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term115125, term115125.getClass(), "encodedSourceStart", 0);
        setIntField(term115125, term115125.getClass(), "encodedSourceEnd", 0);
        setField(term115125, term115125.getClass(), "sourceName", null);
        setIntField(term115125, term115125.getClass(), "baseLineno", 0);
        setIntField(term115125, term115125.getClass(), "endLineno", 0);
        setField(term115125, term115125.getClass(), "functions", null);
        setField(term115125, term115125.getClass(), "regexps", null);
        setField(term115125, term115125.getClass(), "itsVariables", null);
        setField(term115125, term115125.getClass(), "itsConst", null);
        setField(term115125, term115125.getClass(), "itsVariableNames", null);
        setIntField(term115125, term115125.getClass(), "varStart", 0);
        setField(term115125, term115125.getClass(), "compilerData", null);
        setIntField(term115125, term115125.getClass(), "type", 0);
        setField(term115125, term115125.getClass(), "next", null);
        setField(term115125, term115125.getClass(), "first", null);
        setField(term115125, term115125.getClass(), "last", null);
        setField(term115125, term115125.getClass(), "propListHead", null);
        setIntField(term115125, term115125.getClass(), "sourcePosition", 0);
        setField(term115125, term115125.getClass(), "jsType", null);
        setField(term115125, term115125.getClass(), "parent", null);
        setField(term115124, term115124.getClass(), "parent", term115125);
        term115126 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term115126, term115126.getClass(), "str", null);
        setIntField(term115126, term115126.getClass(), "type", 0);
        setField(term115126, term115126.getClass(), "next", null);
        setField(term115126, term115126.getClass(), "first", null);
        setField(term115126, term115126.getClass(), "last", null);
        setField(term115126, term115126.getClass(), "propListHead", null);
        setIntField(term115126, term115126.getClass(), "sourcePosition", 0);
        setField(term115126, term115126.getClass(), "jsType", null);
        setField(term115126, term115126.getClass(), "parent", null);
        term115127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term115127, term115127.getClass(), "type", 0);
        setField(term115127, term115127.getClass(), "next", null);
        setField(term115127, term115127.getClass(), "first", null);
        setField(term115127, term115127.getClass(), "last", null);
        setField(term115127, term115127.getClass(), "propListHead", null);
        setIntField(term115127, term115127.getClass(), "sourcePosition", 0);
        setField(term115127, term115127.getClass(), "jsType", null);
        setField(term115127, term115127.getClass(), "parent", null);
        term115066 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term115077 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term115066, term115066.getClass(), "functionName", null);
        setBooleanField(term115066, term115066.getClass(), "itsNeedsActivation", false);
        setIntField(term115066, term115066.getClass(), "itsFunctionType", 0);
        setBooleanField(term115066, term115066.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term115066, term115066.getClass(), "encodedSourceStart", 0);
        setIntField(term115066, term115066.getClass(), "encodedSourceEnd", 0);
        setField(term115066, term115066.getClass(), "sourceName", null);
        setIntField(term115066, term115066.getClass(), "baseLineno", 0);
        setIntField(term115066, term115066.getClass(), "endLineno", 0);
        setField(term115066, term115066.getClass(), "functions", null);
        setField(term115066, term115066.getClass(), "regexps", null);
        setField(term115066, term115066.getClass(), "itsVariables", null);
        setField(term115066, term115066.getClass(), "itsConst", null);
        setField(term115066, term115066.getClass(), "itsVariableNames", null);
        setIntField(term115066, term115066.getClass(), "varStart", 0);
        setField(term115066, term115066.getClass(), "compilerData", null);
        setIntField(term115066, term115066.getClass(), "type", 0);
        setField(term115066, term115066.getClass(), "next", null);
        setField(term115066, term115066.getClass(), "first", null);
        setField(term115066, term115066.getClass(), "last", null);
        setField(term115066, term115066.getClass(), "propListHead", null);
        setIntField(term115066, term115066.getClass(), "sourcePosition", 0);
        setField(term115066, term115066.getClass(), "jsType", null);
        setField(term115077, term115077.getClass(), "functionName", null);
        setBooleanField(term115077, term115077.getClass(), "itsNeedsActivation", false);
        setIntField(term115077, term115077.getClass(), "itsFunctionType", 0);
        setBooleanField(term115077, term115077.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term115077, term115077.getClass(), "encodedSourceStart", 0);
        setIntField(term115077, term115077.getClass(), "encodedSourceEnd", 0);
        setField(term115077, term115077.getClass(), "sourceName", null);
        setIntField(term115077, term115077.getClass(), "baseLineno", 0);
        setIntField(term115077, term115077.getClass(), "endLineno", 0);
        setField(term115077, term115077.getClass(), "functions", null);
        setField(term115077, term115077.getClass(), "regexps", null);
        setField(term115077, term115077.getClass(), "itsVariables", null);
        setField(term115077, term115077.getClass(), "itsConst", null);
        setField(term115077, term115077.getClass(), "itsVariableNames", null);
        setIntField(term115077, term115077.getClass(), "varStart", 0);
        setField(term115077, term115077.getClass(), "compilerData", null);
        setIntField(term115077, term115077.getClass(), "type", 0);
        setField(term115077, term115077.getClass(), "next", null);
        setField(term115077, term115077.getClass(), "first", null);
        setField(term115077, term115077.getClass(), "last", null);
        setField(term115077, term115077.getClass(), "propListHead", null);
        setIntField(term115077, term115077.getClass(), "sourcePosition", 0);
        setField(term115077, term115077.getClass(), "jsType", null);
        setField(term115077, term115077.getClass(), "parent", null);
        setField(term115066, term115066.getClass(), "parent", term115077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term114769;
        args[1] = term114947;
        args[2] = term115017;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term114683, args);
        assertTrue(recursiveEquals(term114683, term115123));
        assertTrue(recursiveEquals(term114769, term115124));
        assertTrue(recursiveEquals(term114947, term115126));
        assertTrue(recursiveEquals(term115017, term115127));
        assertTrue(recursiveEquals(retValue, term115066));
    }

};


