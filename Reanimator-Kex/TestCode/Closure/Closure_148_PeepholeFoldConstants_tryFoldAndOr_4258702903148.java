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

public class PeepholeFoldConstants_tryFoldAndOr_4258702903148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term932669;
     Object term932755;
     Object term932847;
     Object term933262;
     Object term933263;
     Object term933264;
     Object term933222;

    public PeepholeFoldConstants_tryFoldAndOr_4258702903148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term932669 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term932755 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term932755, term932755.getClass(), "parent", null);
        setIntField(term932755, term932755.getClass(), "type", 47);
        term932847 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term932847, term932847.getClass(), "type", 47);
        term933262 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term933262, term933262.getClass(), "currentTraversal", null);
        term933263 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term933263, term933263.getClass(), "functionName", null);
        setBooleanField(term933263, term933263.getClass(), "itsNeedsActivation", false);
        setIntField(term933263, term933263.getClass(), "itsFunctionType", 0);
        setBooleanField(term933263, term933263.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term933263, term933263.getClass(), "encodedSourceStart", 0);
        setIntField(term933263, term933263.getClass(), "encodedSourceEnd", 0);
        setField(term933263, term933263.getClass(), "sourceName", null);
        setIntField(term933263, term933263.getClass(), "baseLineno", 0);
        setIntField(term933263, term933263.getClass(), "endLineno", 0);
        setField(term933263, term933263.getClass(), "functions", null);
        setField(term933263, term933263.getClass(), "regexps", null);
        setField(term933263, term933263.getClass(), "itsVariables", null);
        setField(term933263, term933263.getClass(), "itsConst", null);
        setField(term933263, term933263.getClass(), "itsVariableNames", null);
        setIntField(term933263, term933263.getClass(), "varStart", 0);
        setField(term933263, term933263.getClass(), "compilerData", null);
        setIntField(term933263, term933263.getClass(), "type", 47);
        setField(term933263, term933263.getClass(), "next", null);
        setField(term933263, term933263.getClass(), "first", null);
        setField(term933263, term933263.getClass(), "last", null);
        setField(term933263, term933263.getClass(), "propListHead", null);
        setIntField(term933263, term933263.getClass(), "sourcePosition", 0);
        setField(term933263, term933263.getClass(), "jsType", null);
        setField(term933263, term933263.getClass(), "parent", null);
        term933264 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term933264, term933264.getClass(), "number", 0.0);
        setIntField(term933264, term933264.getClass(), "type", 47);
        setField(term933264, term933264.getClass(), "next", null);
        setField(term933264, term933264.getClass(), "first", null);
        setField(term933264, term933264.getClass(), "last", null);
        setField(term933264, term933264.getClass(), "propListHead", null);
        setIntField(term933264, term933264.getClass(), "sourcePosition", 0);
        setField(term933264, term933264.getClass(), "jsType", null);
        setField(term933264, term933264.getClass(), "parent", null);
        term933222 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term933222, term933222.getClass(), "functionName", null);
        setBooleanField(term933222, term933222.getClass(), "itsNeedsActivation", false);
        setIntField(term933222, term933222.getClass(), "itsFunctionType", 0);
        setBooleanField(term933222, term933222.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term933222, term933222.getClass(), "encodedSourceStart", 0);
        setIntField(term933222, term933222.getClass(), "encodedSourceEnd", 0);
        setField(term933222, term933222.getClass(), "sourceName", null);
        setIntField(term933222, term933222.getClass(), "baseLineno", 0);
        setIntField(term933222, term933222.getClass(), "endLineno", 0);
        setField(term933222, term933222.getClass(), "functions", null);
        setField(term933222, term933222.getClass(), "regexps", null);
        setField(term933222, term933222.getClass(), "itsVariables", null);
        setField(term933222, term933222.getClass(), "itsConst", null);
        setField(term933222, term933222.getClass(), "itsVariableNames", null);
        setIntField(term933222, term933222.getClass(), "varStart", 0);
        setField(term933222, term933222.getClass(), "compilerData", null);
        setIntField(term933222, term933222.getClass(), "type", 47);
        setField(term933222, term933222.getClass(), "next", null);
        setField(term933222, term933222.getClass(), "first", null);
        setField(term933222, term933222.getClass(), "last", null);
        setField(term933222, term933222.getClass(), "propListHead", null);
        setIntField(term933222, term933222.getClass(), "sourcePosition", 0);
        setField(term933222, term933222.getClass(), "jsType", null);
        setField(term933222, term933222.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term932755;
        args[1] = term932847;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term932669, args);
        assertTrue(recursiveEquals(term932669, term933262));
        assertTrue(recursiveEquals(term932755, term933263));
        assertTrue(recursiveEquals(term932847, term933264));
        assertTrue(recursiveEquals(retValue, term933222));
    }

};


