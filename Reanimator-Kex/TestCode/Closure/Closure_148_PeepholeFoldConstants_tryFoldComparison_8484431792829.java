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

public class PeepholeFoldConstants_tryFoldComparison_8484431792829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term822199;
     Object term822285;
     Object term822371;
     Object term822463;
     Object term823158;
     Object term823159;
     Object term823160;
     Object term823161;
     Object term823127;

    public PeepholeFoldConstants_tryFoldComparison_8484431792829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term822199 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term822285 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term822285, term822285.getClass(), "type", 16);
        term822371 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term822371, term822371.getClass(), "type", 42);
        term822463 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term822463, term822463.getClass(), "type", 16);
        term823158 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term823158, term823158.getClass(), "currentTraversal", null);
        term823159 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term823159, term823159.getClass(), "functionName", null);
        setBooleanField(term823159, term823159.getClass(), "itsNeedsActivation", false);
        setIntField(term823159, term823159.getClass(), "itsFunctionType", 0);
        setBooleanField(term823159, term823159.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term823159, term823159.getClass(), "encodedSourceStart", 0);
        setIntField(term823159, term823159.getClass(), "encodedSourceEnd", 0);
        setField(term823159, term823159.getClass(), "sourceName", null);
        setIntField(term823159, term823159.getClass(), "baseLineno", 0);
        setIntField(term823159, term823159.getClass(), "endLineno", 0);
        setField(term823159, term823159.getClass(), "functions", null);
        setField(term823159, term823159.getClass(), "regexps", null);
        setField(term823159, term823159.getClass(), "itsVariables", null);
        setField(term823159, term823159.getClass(), "itsConst", null);
        setField(term823159, term823159.getClass(), "itsVariableNames", null);
        setIntField(term823159, term823159.getClass(), "varStart", 0);
        setField(term823159, term823159.getClass(), "compilerData", null);
        setIntField(term823159, term823159.getClass(), "type", 42);
        setField(term823159, term823159.getClass(), "next", null);
        setField(term823159, term823159.getClass(), "first", null);
        setField(term823159, term823159.getClass(), "last", null);
        setField(term823159, term823159.getClass(), "propListHead", null);
        setIntField(term823159, term823159.getClass(), "sourcePosition", 0);
        setField(term823159, term823159.getClass(), "jsType", null);
        setField(term823159, term823159.getClass(), "parent", null);
        term823160 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term823160, term823160.getClass(), "functionName", null);
        setBooleanField(term823160, term823160.getClass(), "itsNeedsActivation", false);
        setIntField(term823160, term823160.getClass(), "itsFunctionType", 0);
        setBooleanField(term823160, term823160.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term823160, term823160.getClass(), "encodedSourceStart", 0);
        setIntField(term823160, term823160.getClass(), "encodedSourceEnd", 0);
        setField(term823160, term823160.getClass(), "sourceName", null);
        setIntField(term823160, term823160.getClass(), "baseLineno", 0);
        setIntField(term823160, term823160.getClass(), "endLineno", 0);
        setField(term823160, term823160.getClass(), "functions", null);
        setField(term823160, term823160.getClass(), "regexps", null);
        setField(term823160, term823160.getClass(), "itsVariables", null);
        setField(term823160, term823160.getClass(), "itsConst", null);
        setField(term823160, term823160.getClass(), "itsVariableNames", null);
        setIntField(term823160, term823160.getClass(), "varStart", 0);
        setField(term823160, term823160.getClass(), "compilerData", null);
        setIntField(term823160, term823160.getClass(), "type", 16);
        setField(term823160, term823160.getClass(), "next", null);
        setField(term823160, term823160.getClass(), "first", null);
        setField(term823160, term823160.getClass(), "last", null);
        setField(term823160, term823160.getClass(), "propListHead", null);
        setIntField(term823160, term823160.getClass(), "sourcePosition", 0);
        setField(term823160, term823160.getClass(), "jsType", null);
        setField(term823160, term823160.getClass(), "parent", null);
        term823161 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term823161, term823161.getClass(), "str", null);
        setIntField(term823161, term823161.getClass(), "type", 16);
        setField(term823161, term823161.getClass(), "next", null);
        setField(term823161, term823161.getClass(), "first", null);
        setField(term823161, term823161.getClass(), "last", null);
        setField(term823161, term823161.getClass(), "propListHead", null);
        setIntField(term823161, term823161.getClass(), "sourcePosition", 0);
        setField(term823161, term823161.getClass(), "jsType", null);
        setField(term823161, term823161.getClass(), "parent", null);
        term823127 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term823127, term823127.getClass(), "functionName", null);
        setBooleanField(term823127, term823127.getClass(), "itsNeedsActivation", false);
        setIntField(term823127, term823127.getClass(), "itsFunctionType", 0);
        setBooleanField(term823127, term823127.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term823127, term823127.getClass(), "encodedSourceStart", 0);
        setIntField(term823127, term823127.getClass(), "encodedSourceEnd", 0);
        setField(term823127, term823127.getClass(), "sourceName", null);
        setIntField(term823127, term823127.getClass(), "baseLineno", 0);
        setIntField(term823127, term823127.getClass(), "endLineno", 0);
        setField(term823127, term823127.getClass(), "functions", null);
        setField(term823127, term823127.getClass(), "regexps", null);
        setField(term823127, term823127.getClass(), "itsVariables", null);
        setField(term823127, term823127.getClass(), "itsConst", null);
        setField(term823127, term823127.getClass(), "itsVariableNames", null);
        setIntField(term823127, term823127.getClass(), "varStart", 0);
        setField(term823127, term823127.getClass(), "compilerData", null);
        setIntField(term823127, term823127.getClass(), "type", 16);
        setField(term823127, term823127.getClass(), "next", null);
        setField(term823127, term823127.getClass(), "first", null);
        setField(term823127, term823127.getClass(), "last", null);
        setField(term823127, term823127.getClass(), "propListHead", null);
        setIntField(term823127, term823127.getClass(), "sourcePosition", 0);
        setField(term823127, term823127.getClass(), "jsType", null);
        setField(term823127, term823127.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term822285;
        args[1] = term822371;
        args[2] = term822463;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term822199, args);
        assertTrue(recursiveEquals(term822199, term823158));
        assertTrue(recursiveEquals(term822285, term823159));
        assertTrue(recursiveEquals(term822371, term823160));
        assertTrue(recursiveEquals(term822463, term823161));
        assertTrue(recursiveEquals(retValue, term823127));
    }

};


