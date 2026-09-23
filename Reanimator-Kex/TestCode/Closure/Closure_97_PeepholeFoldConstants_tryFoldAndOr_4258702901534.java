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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564623;
     Object term564709;
     Object term564887;
     Object term564957;
     Object term565086;
     Object term565087;
     Object term565089;
     Object term565090;
     Object term565028;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term564623 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term564709 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term564795 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term564709, term564709.getClass(), "parent", term564795);
        setIntField(term564709, term564709.getClass(), "type", 0);
        term564887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term564887, term564887.getClass(), "type", 0);
        term564957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term565086 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term565086, term565086.getClass(), "currentTraversal", null);
        term565087 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term565088 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term565087, term565087.getClass(), "functionName", null);
        setBooleanField(term565087, term565087.getClass(), "itsNeedsActivation", false);
        setIntField(term565087, term565087.getClass(), "itsFunctionType", 0);
        setBooleanField(term565087, term565087.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term565087, term565087.getClass(), "encodedSourceStart", 0);
        setIntField(term565087, term565087.getClass(), "encodedSourceEnd", 0);
        setField(term565087, term565087.getClass(), "sourceName", null);
        setIntField(term565087, term565087.getClass(), "baseLineno", 0);
        setIntField(term565087, term565087.getClass(), "endLineno", 0);
        setField(term565087, term565087.getClass(), "functions", null);
        setField(term565087, term565087.getClass(), "regexps", null);
        setField(term565087, term565087.getClass(), "itsVariables", null);
        setField(term565087, term565087.getClass(), "itsConst", null);
        setField(term565087, term565087.getClass(), "itsVariableNames", null);
        setIntField(term565087, term565087.getClass(), "varStart", 0);
        setField(term565087, term565087.getClass(), "compilerData", null);
        setIntField(term565087, term565087.getClass(), "type", 0);
        setField(term565087, term565087.getClass(), "next", null);
        setField(term565087, term565087.getClass(), "first", null);
        setField(term565087, term565087.getClass(), "last", null);
        setField(term565087, term565087.getClass(), "propListHead", null);
        setIntField(term565087, term565087.getClass(), "sourcePosition", 0);
        setField(term565087, term565087.getClass(), "jsType", null);
        setField(term565088, term565088.getClass(), "functionName", null);
        setBooleanField(term565088, term565088.getClass(), "itsNeedsActivation", false);
        setIntField(term565088, term565088.getClass(), "itsFunctionType", 0);
        setBooleanField(term565088, term565088.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term565088, term565088.getClass(), "encodedSourceStart", 0);
        setIntField(term565088, term565088.getClass(), "encodedSourceEnd", 0);
        setField(term565088, term565088.getClass(), "sourceName", null);
        setIntField(term565088, term565088.getClass(), "baseLineno", 0);
        setIntField(term565088, term565088.getClass(), "endLineno", 0);
        setField(term565088, term565088.getClass(), "functions", null);
        setField(term565088, term565088.getClass(), "regexps", null);
        setField(term565088, term565088.getClass(), "itsVariables", null);
        setField(term565088, term565088.getClass(), "itsConst", null);
        setField(term565088, term565088.getClass(), "itsVariableNames", null);
        setIntField(term565088, term565088.getClass(), "varStart", 0);
        setField(term565088, term565088.getClass(), "compilerData", null);
        setIntField(term565088, term565088.getClass(), "type", 0);
        setField(term565088, term565088.getClass(), "next", null);
        setField(term565088, term565088.getClass(), "first", null);
        setField(term565088, term565088.getClass(), "last", null);
        setField(term565088, term565088.getClass(), "propListHead", null);
        setIntField(term565088, term565088.getClass(), "sourcePosition", 0);
        setField(term565088, term565088.getClass(), "jsType", null);
        setField(term565088, term565088.getClass(), "parent", null);
        setField(term565087, term565087.getClass(), "parent", term565088);
        term565089 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term565089, term565089.getClass(), "number", 0.0);
        setIntField(term565089, term565089.getClass(), "type", 0);
        setField(term565089, term565089.getClass(), "next", null);
        setField(term565089, term565089.getClass(), "first", null);
        setField(term565089, term565089.getClass(), "last", null);
        setField(term565089, term565089.getClass(), "propListHead", null);
        setIntField(term565089, term565089.getClass(), "sourcePosition", 0);
        setField(term565089, term565089.getClass(), "jsType", null);
        setField(term565089, term565089.getClass(), "parent", null);
        term565090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term565090, term565090.getClass(), "type", 0);
        setField(term565090, term565090.getClass(), "next", null);
        setField(term565090, term565090.getClass(), "first", null);
        setField(term565090, term565090.getClass(), "last", null);
        setField(term565090, term565090.getClass(), "propListHead", null);
        setIntField(term565090, term565090.getClass(), "sourcePosition", 0);
        setField(term565090, term565090.getClass(), "jsType", null);
        setField(term565090, term565090.getClass(), "parent", null);
        term565028 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term565039 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term565028, term565028.getClass(), "functionName", null);
        setBooleanField(term565028, term565028.getClass(), "itsNeedsActivation", false);
        setIntField(term565028, term565028.getClass(), "itsFunctionType", 0);
        setBooleanField(term565028, term565028.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term565028, term565028.getClass(), "encodedSourceStart", 0);
        setIntField(term565028, term565028.getClass(), "encodedSourceEnd", 0);
        setField(term565028, term565028.getClass(), "sourceName", null);
        setIntField(term565028, term565028.getClass(), "baseLineno", 0);
        setIntField(term565028, term565028.getClass(), "endLineno", 0);
        setField(term565028, term565028.getClass(), "functions", null);
        setField(term565028, term565028.getClass(), "regexps", null);
        setField(term565028, term565028.getClass(), "itsVariables", null);
        setField(term565028, term565028.getClass(), "itsConst", null);
        setField(term565028, term565028.getClass(), "itsVariableNames", null);
        setIntField(term565028, term565028.getClass(), "varStart", 0);
        setField(term565028, term565028.getClass(), "compilerData", null);
        setIntField(term565028, term565028.getClass(), "type", 0);
        setField(term565028, term565028.getClass(), "next", null);
        setField(term565028, term565028.getClass(), "first", null);
        setField(term565028, term565028.getClass(), "last", null);
        setField(term565028, term565028.getClass(), "propListHead", null);
        setIntField(term565028, term565028.getClass(), "sourcePosition", 0);
        setField(term565028, term565028.getClass(), "jsType", null);
        setField(term565039, term565039.getClass(), "functionName", null);
        setBooleanField(term565039, term565039.getClass(), "itsNeedsActivation", false);
        setIntField(term565039, term565039.getClass(), "itsFunctionType", 0);
        setBooleanField(term565039, term565039.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term565039, term565039.getClass(), "encodedSourceStart", 0);
        setIntField(term565039, term565039.getClass(), "encodedSourceEnd", 0);
        setField(term565039, term565039.getClass(), "sourceName", null);
        setIntField(term565039, term565039.getClass(), "baseLineno", 0);
        setIntField(term565039, term565039.getClass(), "endLineno", 0);
        setField(term565039, term565039.getClass(), "functions", null);
        setField(term565039, term565039.getClass(), "regexps", null);
        setField(term565039, term565039.getClass(), "itsVariables", null);
        setField(term565039, term565039.getClass(), "itsConst", null);
        setField(term565039, term565039.getClass(), "itsVariableNames", null);
        setIntField(term565039, term565039.getClass(), "varStart", 0);
        setField(term565039, term565039.getClass(), "compilerData", null);
        setIntField(term565039, term565039.getClass(), "type", 0);
        setField(term565039, term565039.getClass(), "next", null);
        setField(term565039, term565039.getClass(), "first", null);
        setField(term565039, term565039.getClass(), "last", null);
        setField(term565039, term565039.getClass(), "propListHead", null);
        setIntField(term565039, term565039.getClass(), "sourcePosition", 0);
        setField(term565039, term565039.getClass(), "jsType", null);
        setField(term565039, term565039.getClass(), "parent", null);
        setField(term565028, term565028.getClass(), "parent", term565039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term564709;
        args[1] = term564887;
        args[2] = term564957;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term564623, args);
        assertTrue(recursiveEquals(term564623, term565086));
        assertTrue(recursiveEquals(term564709, term565087));
        assertTrue(recursiveEquals(term564887, term565089));
        assertTrue(recursiveEquals(term564957, term565090));
        assertTrue(recursiveEquals(retValue, term565028));
    }

};


