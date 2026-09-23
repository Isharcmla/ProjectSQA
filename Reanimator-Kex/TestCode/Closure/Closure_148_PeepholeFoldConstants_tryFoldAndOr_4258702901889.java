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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498741;
     Object term498827;
     Object term498983;
     Object term499069;
     Object term500073;
     Object term500074;
     Object term500076;
     Object term500077;
     Object term499982;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term498741 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term498827 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term498897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term498897, term498897.getClass(), "type", 108);
        setField(term498827, term498827.getClass(), "parent", term498897);
        setIntField(term498827, term498827.getClass(), "type", 0);
        term498983 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term498983, term498983.getClass(), "type", 61);
        term499069 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term499069, term499069.getClass(), "type", 63);
        term500073 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term500073, term500073.getClass(), "currentTraversal", null);
        term500074 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term500075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term500074, term500074.getClass(), "functionName", null);
        setBooleanField(term500074, term500074.getClass(), "itsNeedsActivation", false);
        setIntField(term500074, term500074.getClass(), "itsFunctionType", 0);
        setBooleanField(term500074, term500074.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term500074, term500074.getClass(), "encodedSourceStart", 0);
        setIntField(term500074, term500074.getClass(), "encodedSourceEnd", 0);
        setField(term500074, term500074.getClass(), "sourceName", null);
        setIntField(term500074, term500074.getClass(), "baseLineno", 0);
        setIntField(term500074, term500074.getClass(), "endLineno", 0);
        setField(term500074, term500074.getClass(), "functions", null);
        setField(term500074, term500074.getClass(), "regexps", null);
        setField(term500074, term500074.getClass(), "itsVariables", null);
        setField(term500074, term500074.getClass(), "itsConst", null);
        setField(term500074, term500074.getClass(), "itsVariableNames", null);
        setIntField(term500074, term500074.getClass(), "varStart", 0);
        setField(term500074, term500074.getClass(), "compilerData", null);
        setIntField(term500074, term500074.getClass(), "type", 0);
        setField(term500074, term500074.getClass(), "next", null);
        setField(term500074, term500074.getClass(), "first", null);
        setField(term500074, term500074.getClass(), "last", null);
        setField(term500074, term500074.getClass(), "propListHead", null);
        setIntField(term500074, term500074.getClass(), "sourcePosition", 0);
        setField(term500074, term500074.getClass(), "jsType", null);
        setIntField(term500075, term500075.getClass(), "type", 108);
        setField(term500075, term500075.getClass(), "next", null);
        setField(term500075, term500075.getClass(), "first", null);
        setField(term500075, term500075.getClass(), "last", null);
        setField(term500075, term500075.getClass(), "propListHead", null);
        setIntField(term500075, term500075.getClass(), "sourcePosition", 0);
        setField(term500075, term500075.getClass(), "jsType", null);
        setField(term500075, term500075.getClass(), "parent", null);
        setField(term500074, term500074.getClass(), "parent", term500075);
        term500076 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term500076, term500076.getClass(), "functionName", null);
        setBooleanField(term500076, term500076.getClass(), "itsNeedsActivation", false);
        setIntField(term500076, term500076.getClass(), "itsFunctionType", 0);
        setBooleanField(term500076, term500076.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term500076, term500076.getClass(), "encodedSourceStart", 0);
        setIntField(term500076, term500076.getClass(), "encodedSourceEnd", 0);
        setField(term500076, term500076.getClass(), "sourceName", null);
        setIntField(term500076, term500076.getClass(), "baseLineno", 0);
        setIntField(term500076, term500076.getClass(), "endLineno", 0);
        setField(term500076, term500076.getClass(), "functions", null);
        setField(term500076, term500076.getClass(), "regexps", null);
        setField(term500076, term500076.getClass(), "itsVariables", null);
        setField(term500076, term500076.getClass(), "itsConst", null);
        setField(term500076, term500076.getClass(), "itsVariableNames", null);
        setIntField(term500076, term500076.getClass(), "varStart", 0);
        setField(term500076, term500076.getClass(), "compilerData", null);
        setIntField(term500076, term500076.getClass(), "type", 61);
        setField(term500076, term500076.getClass(), "next", null);
        setField(term500076, term500076.getClass(), "first", null);
        setField(term500076, term500076.getClass(), "last", null);
        setField(term500076, term500076.getClass(), "propListHead", null);
        setIntField(term500076, term500076.getClass(), "sourcePosition", 0);
        setField(term500076, term500076.getClass(), "jsType", null);
        setField(term500076, term500076.getClass(), "parent", null);
        term500077 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term500077, term500077.getClass(), "functionName", null);
        setBooleanField(term500077, term500077.getClass(), "itsNeedsActivation", false);
        setIntField(term500077, term500077.getClass(), "itsFunctionType", 0);
        setBooleanField(term500077, term500077.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term500077, term500077.getClass(), "encodedSourceStart", 0);
        setIntField(term500077, term500077.getClass(), "encodedSourceEnd", 0);
        setField(term500077, term500077.getClass(), "sourceName", null);
        setIntField(term500077, term500077.getClass(), "baseLineno", 0);
        setIntField(term500077, term500077.getClass(), "endLineno", 0);
        setField(term500077, term500077.getClass(), "functions", null);
        setField(term500077, term500077.getClass(), "regexps", null);
        setField(term500077, term500077.getClass(), "itsVariables", null);
        setField(term500077, term500077.getClass(), "itsConst", null);
        setField(term500077, term500077.getClass(), "itsVariableNames", null);
        setIntField(term500077, term500077.getClass(), "varStart", 0);
        setField(term500077, term500077.getClass(), "compilerData", null);
        setIntField(term500077, term500077.getClass(), "type", 63);
        setField(term500077, term500077.getClass(), "next", null);
        setField(term500077, term500077.getClass(), "first", null);
        setField(term500077, term500077.getClass(), "last", null);
        setField(term500077, term500077.getClass(), "propListHead", null);
        setIntField(term500077, term500077.getClass(), "sourcePosition", 0);
        setField(term500077, term500077.getClass(), "jsType", null);
        setField(term500077, term500077.getClass(), "parent", null);
        term499982 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term499993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term499982, term499982.getClass(), "functionName", null);
        setBooleanField(term499982, term499982.getClass(), "itsNeedsActivation", false);
        setIntField(term499982, term499982.getClass(), "itsFunctionType", 0);
        setBooleanField(term499982, term499982.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term499982, term499982.getClass(), "encodedSourceStart", 0);
        setIntField(term499982, term499982.getClass(), "encodedSourceEnd", 0);
        setField(term499982, term499982.getClass(), "sourceName", null);
        setIntField(term499982, term499982.getClass(), "baseLineno", 0);
        setIntField(term499982, term499982.getClass(), "endLineno", 0);
        setField(term499982, term499982.getClass(), "functions", null);
        setField(term499982, term499982.getClass(), "regexps", null);
        setField(term499982, term499982.getClass(), "itsVariables", null);
        setField(term499982, term499982.getClass(), "itsConst", null);
        setField(term499982, term499982.getClass(), "itsVariableNames", null);
        setIntField(term499982, term499982.getClass(), "varStart", 0);
        setField(term499982, term499982.getClass(), "compilerData", null);
        setIntField(term499982, term499982.getClass(), "type", 0);
        setField(term499982, term499982.getClass(), "next", null);
        setField(term499982, term499982.getClass(), "first", null);
        setField(term499982, term499982.getClass(), "last", null);
        setField(term499982, term499982.getClass(), "propListHead", null);
        setIntField(term499982, term499982.getClass(), "sourcePosition", 0);
        setField(term499982, term499982.getClass(), "jsType", null);
        setIntField(term499993, term499993.getClass(), "type", 108);
        setField(term499993, term499993.getClass(), "next", null);
        setField(term499993, term499993.getClass(), "first", null);
        setField(term499993, term499993.getClass(), "last", null);
        setField(term499993, term499993.getClass(), "propListHead", null);
        setIntField(term499993, term499993.getClass(), "sourcePosition", 0);
        setField(term499993, term499993.getClass(), "jsType", null);
        setField(term499993, term499993.getClass(), "parent", null);
        setField(term499982, term499982.getClass(), "parent", term499993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term498827;
        args[1] = term498983;
        args[2] = term499069;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term498741, args);
        assertTrue(recursiveEquals(term498741, term500073));
        assertTrue(recursiveEquals(term498827, term500074));
        assertTrue(recursiveEquals(term498983, term500076));
        assertTrue(recursiveEquals(term499069, term500077));
        assertTrue(recursiveEquals(retValue, term499982));
    }

};


