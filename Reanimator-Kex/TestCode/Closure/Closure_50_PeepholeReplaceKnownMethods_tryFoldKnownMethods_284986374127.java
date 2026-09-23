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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32339;
     Object term32425;
     Object term32745;
     Object term32746;
     Object term32708;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32339 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term32425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term32425, term32425.getClass(), "first", null);
        term32745 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term32745, term32745.getClass(), "currentTraversal", null);
        term32746 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term32746, term32746.getClass(), "functionName", null);
        setBooleanField(term32746, term32746.getClass(), "itsNeedsActivation", false);
        setIntField(term32746, term32746.getClass(), "itsFunctionType", 0);
        setBooleanField(term32746, term32746.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term32746, term32746.getClass(), "encodedSourceStart", 0);
        setIntField(term32746, term32746.getClass(), "encodedSourceEnd", 0);
        setField(term32746, term32746.getClass(), "sourceName", null);
        setIntField(term32746, term32746.getClass(), "baseLineno", 0);
        setIntField(term32746, term32746.getClass(), "endLineno", 0);
        setField(term32746, term32746.getClass(), "functions", null);
        setField(term32746, term32746.getClass(), "regexps", null);
        setField(term32746, term32746.getClass(), "itsVariables", null);
        setField(term32746, term32746.getClass(), "itsConst", null);
        setField(term32746, term32746.getClass(), "itsVariableNames", null);
        setIntField(term32746, term32746.getClass(), "varStart", 0);
        setField(term32746, term32746.getClass(), "compilerData", null);
        setIntField(term32746, term32746.getClass(), "type", 0);
        setField(term32746, term32746.getClass(), "next", null);
        setField(term32746, term32746.getClass(), "first", null);
        setField(term32746, term32746.getClass(), "last", null);
        setField(term32746, term32746.getClass(), "propListHead", null);
        setIntField(term32746, term32746.getClass(), "sourcePosition", 0);
        setField(term32746, term32746.getClass(), "jsType", null);
        setField(term32746, term32746.getClass(), "parent", null);
        term32708 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term32708, term32708.getClass(), "functionName", null);
        setBooleanField(term32708, term32708.getClass(), "itsNeedsActivation", false);
        setIntField(term32708, term32708.getClass(), "itsFunctionType", 0);
        setBooleanField(term32708, term32708.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term32708, term32708.getClass(), "encodedSourceStart", 0);
        setIntField(term32708, term32708.getClass(), "encodedSourceEnd", 0);
        setField(term32708, term32708.getClass(), "sourceName", null);
        setIntField(term32708, term32708.getClass(), "baseLineno", 0);
        setIntField(term32708, term32708.getClass(), "endLineno", 0);
        setField(term32708, term32708.getClass(), "functions", null);
        setField(term32708, term32708.getClass(), "regexps", null);
        setField(term32708, term32708.getClass(), "itsVariables", null);
        setField(term32708, term32708.getClass(), "itsConst", null);
        setField(term32708, term32708.getClass(), "itsVariableNames", null);
        setIntField(term32708, term32708.getClass(), "varStart", 0);
        setField(term32708, term32708.getClass(), "compilerData", null);
        setIntField(term32708, term32708.getClass(), "type", 0);
        setField(term32708, term32708.getClass(), "next", null);
        setField(term32708, term32708.getClass(), "first", null);
        setField(term32708, term32708.getClass(), "last", null);
        setField(term32708, term32708.getClass(), "propListHead", null);
        setIntField(term32708, term32708.getClass(), "sourcePosition", 0);
        setField(term32708, term32708.getClass(), "jsType", null);
        setField(term32708, term32708.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term32425;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term32339, args);
        assertTrue(recursiveEquals(term32339, term32745));
        assertTrue(recursiveEquals(term32425, term32746));
        assertTrue(recursiveEquals(retValue, term32708));
    }

};


