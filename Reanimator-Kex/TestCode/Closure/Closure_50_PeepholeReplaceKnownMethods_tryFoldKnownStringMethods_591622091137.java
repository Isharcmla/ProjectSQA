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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34388;
     Object term34474;
     Object term35986;
     Object term35987;
     Object term35931;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34388 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term34474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term34560 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term34474, term34474.getClass(), "type", 37);
        setField(term34474, term34474.getClass(), "first", term34560);
        term35986 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term35986, term35986.getClass(), "currentTraversal", null);
        term35987 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term35988 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term35987, term35987.getClass(), "functionName", null);
        setBooleanField(term35987, term35987.getClass(), "itsNeedsActivation", false);
        setIntField(term35987, term35987.getClass(), "itsFunctionType", 0);
        setBooleanField(term35987, term35987.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term35987, term35987.getClass(), "encodedSourceStart", 0);
        setIntField(term35987, term35987.getClass(), "encodedSourceEnd", 0);
        setField(term35987, term35987.getClass(), "sourceName", null);
        setIntField(term35987, term35987.getClass(), "baseLineno", 0);
        setIntField(term35987, term35987.getClass(), "endLineno", 0);
        setField(term35987, term35987.getClass(), "functions", null);
        setField(term35987, term35987.getClass(), "regexps", null);
        setField(term35987, term35987.getClass(), "itsVariables", null);
        setField(term35987, term35987.getClass(), "itsConst", null);
        setField(term35987, term35987.getClass(), "itsVariableNames", null);
        setIntField(term35987, term35987.getClass(), "varStart", 0);
        setField(term35987, term35987.getClass(), "compilerData", null);
        setIntField(term35987, term35987.getClass(), "type", 37);
        setField(term35987, term35987.getClass(), "next", null);
        setField(term35988, term35988.getClass(), "functionName", null);
        setBooleanField(term35988, term35988.getClass(), "itsNeedsActivation", false);
        setIntField(term35988, term35988.getClass(), "itsFunctionType", 0);
        setBooleanField(term35988, term35988.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term35988, term35988.getClass(), "encodedSourceStart", 0);
        setIntField(term35988, term35988.getClass(), "encodedSourceEnd", 0);
        setField(term35988, term35988.getClass(), "sourceName", null);
        setIntField(term35988, term35988.getClass(), "baseLineno", 0);
        setIntField(term35988, term35988.getClass(), "endLineno", 0);
        setField(term35988, term35988.getClass(), "functions", null);
        setField(term35988, term35988.getClass(), "regexps", null);
        setField(term35988, term35988.getClass(), "itsVariables", null);
        setField(term35988, term35988.getClass(), "itsConst", null);
        setField(term35988, term35988.getClass(), "itsVariableNames", null);
        setIntField(term35988, term35988.getClass(), "varStart", 0);
        setField(term35988, term35988.getClass(), "compilerData", null);
        setIntField(term35988, term35988.getClass(), "type", 0);
        setField(term35988, term35988.getClass(), "next", null);
        setField(term35988, term35988.getClass(), "first", null);
        setField(term35988, term35988.getClass(), "last", null);
        setField(term35988, term35988.getClass(), "propListHead", null);
        setIntField(term35988, term35988.getClass(), "sourcePosition", 0);
        setField(term35988, term35988.getClass(), "jsType", null);
        setField(term35988, term35988.getClass(), "parent", null);
        setField(term35987, term35987.getClass(), "first", term35988);
        setField(term35987, term35987.getClass(), "last", null);
        setField(term35987, term35987.getClass(), "propListHead", null);
        setIntField(term35987, term35987.getClass(), "sourcePosition", 0);
        setField(term35987, term35987.getClass(), "jsType", null);
        setField(term35987, term35987.getClass(), "parent", null);
        term35931 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term35941 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term35931, term35931.getClass(), "functionName", null);
        setBooleanField(term35931, term35931.getClass(), "itsNeedsActivation", false);
        setIntField(term35931, term35931.getClass(), "itsFunctionType", 0);
        setBooleanField(term35931, term35931.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term35931, term35931.getClass(), "encodedSourceStart", 0);
        setIntField(term35931, term35931.getClass(), "encodedSourceEnd", 0);
        setField(term35931, term35931.getClass(), "sourceName", null);
        setIntField(term35931, term35931.getClass(), "baseLineno", 0);
        setIntField(term35931, term35931.getClass(), "endLineno", 0);
        setField(term35931, term35931.getClass(), "functions", null);
        setField(term35931, term35931.getClass(), "regexps", null);
        setField(term35931, term35931.getClass(), "itsVariables", null);
        setField(term35931, term35931.getClass(), "itsConst", null);
        setField(term35931, term35931.getClass(), "itsVariableNames", null);
        setIntField(term35931, term35931.getClass(), "varStart", 0);
        setField(term35931, term35931.getClass(), "compilerData", null);
        setIntField(term35931, term35931.getClass(), "type", 37);
        setField(term35931, term35931.getClass(), "next", null);
        setField(term35941, term35941.getClass(), "functionName", null);
        setBooleanField(term35941, term35941.getClass(), "itsNeedsActivation", false);
        setIntField(term35941, term35941.getClass(), "itsFunctionType", 0);
        setBooleanField(term35941, term35941.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term35941, term35941.getClass(), "encodedSourceStart", 0);
        setIntField(term35941, term35941.getClass(), "encodedSourceEnd", 0);
        setField(term35941, term35941.getClass(), "sourceName", null);
        setIntField(term35941, term35941.getClass(), "baseLineno", 0);
        setIntField(term35941, term35941.getClass(), "endLineno", 0);
        setField(term35941, term35941.getClass(), "functions", null);
        setField(term35941, term35941.getClass(), "regexps", null);
        setField(term35941, term35941.getClass(), "itsVariables", null);
        setField(term35941, term35941.getClass(), "itsConst", null);
        setField(term35941, term35941.getClass(), "itsVariableNames", null);
        setIntField(term35941, term35941.getClass(), "varStart", 0);
        setField(term35941, term35941.getClass(), "compilerData", null);
        setIntField(term35941, term35941.getClass(), "type", 0);
        setField(term35941, term35941.getClass(), "next", null);
        setField(term35941, term35941.getClass(), "first", null);
        setField(term35941, term35941.getClass(), "last", null);
        setField(term35941, term35941.getClass(), "propListHead", null);
        setIntField(term35941, term35941.getClass(), "sourcePosition", 0);
        setField(term35941, term35941.getClass(), "jsType", null);
        setField(term35941, term35941.getClass(), "parent", null);
        setField(term35931, term35931.getClass(), "first", term35941);
        setField(term35931, term35931.getClass(), "last", null);
        setField(term35931, term35931.getClass(), "propListHead", null);
        setIntField(term35931, term35931.getClass(), "sourcePosition", 0);
        setField(term35931, term35931.getClass(), "jsType", null);
        setField(term35931, term35931.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34474;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term34388, args);
        assertTrue(recursiveEquals(term34388, term35986));
        assertTrue(recursiveEquals(term34474, term35987));
        assertTrue(recursiveEquals(retValue, term35931));
    }

};


