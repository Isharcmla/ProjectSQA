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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term670174;
     Object term670266;
     Object term670962;
     Object term670963;
     Object term670876;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term670174 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term670266 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term670352 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term670438 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term670438, term670438.getClass(), "type", 42);
        setField(term670352, term670352.getClass(), "next", term670438);
        setIntField(term670352, term670352.getClass(), "type", 42);
        setField(term670266, term670266.getClass(), "first", term670352);
        setIntField(term670266, term670266.getClass(), "type", 14);
        term670962 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term670962, term670962.getClass(), "currentTraversal", null);
        term670963 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term670964 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term670965 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term670963, term670963.getClass(), "str", null);
        setIntField(term670963, term670963.getClass(), "type", 14);
        setField(term670963, term670963.getClass(), "next", null);
        setField(term670964, term670964.getClass(), "functionName", null);
        setBooleanField(term670964, term670964.getClass(), "itsNeedsActivation", false);
        setIntField(term670964, term670964.getClass(), "itsFunctionType", 0);
        setBooleanField(term670964, term670964.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term670964, term670964.getClass(), "encodedSourceStart", 0);
        setIntField(term670964, term670964.getClass(), "encodedSourceEnd", 0);
        setField(term670964, term670964.getClass(), "sourceName", null);
        setIntField(term670964, term670964.getClass(), "baseLineno", 0);
        setIntField(term670964, term670964.getClass(), "endLineno", 0);
        setField(term670964, term670964.getClass(), "functions", null);
        setField(term670964, term670964.getClass(), "regexps", null);
        setField(term670964, term670964.getClass(), "itsVariables", null);
        setField(term670964, term670964.getClass(), "itsConst", null);
        setField(term670964, term670964.getClass(), "itsVariableNames", null);
        setIntField(term670964, term670964.getClass(), "varStart", 0);
        setField(term670964, term670964.getClass(), "compilerData", null);
        setIntField(term670964, term670964.getClass(), "type", 42);
        setField(term670965, term670965.getClass(), "functionName", null);
        setBooleanField(term670965, term670965.getClass(), "itsNeedsActivation", false);
        setIntField(term670965, term670965.getClass(), "itsFunctionType", 0);
        setBooleanField(term670965, term670965.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term670965, term670965.getClass(), "encodedSourceStart", 0);
        setIntField(term670965, term670965.getClass(), "encodedSourceEnd", 0);
        setField(term670965, term670965.getClass(), "sourceName", null);
        setIntField(term670965, term670965.getClass(), "baseLineno", 0);
        setIntField(term670965, term670965.getClass(), "endLineno", 0);
        setField(term670965, term670965.getClass(), "functions", null);
        setField(term670965, term670965.getClass(), "regexps", null);
        setField(term670965, term670965.getClass(), "itsVariables", null);
        setField(term670965, term670965.getClass(), "itsConst", null);
        setField(term670965, term670965.getClass(), "itsVariableNames", null);
        setIntField(term670965, term670965.getClass(), "varStart", 0);
        setField(term670965, term670965.getClass(), "compilerData", null);
        setIntField(term670965, term670965.getClass(), "type", 42);
        setField(term670965, term670965.getClass(), "next", null);
        setField(term670965, term670965.getClass(), "first", null);
        setField(term670965, term670965.getClass(), "last", null);
        setField(term670965, term670965.getClass(), "propListHead", null);
        setIntField(term670965, term670965.getClass(), "sourcePosition", 0);
        setField(term670965, term670965.getClass(), "jsType", null);
        setField(term670965, term670965.getClass(), "parent", null);
        setField(term670964, term670964.getClass(), "next", term670965);
        setField(term670964, term670964.getClass(), "first", null);
        setField(term670964, term670964.getClass(), "last", null);
        setField(term670964, term670964.getClass(), "propListHead", null);
        setIntField(term670964, term670964.getClass(), "sourcePosition", 0);
        setField(term670964, term670964.getClass(), "jsType", null);
        setField(term670964, term670964.getClass(), "parent", null);
        setField(term670963, term670963.getClass(), "first", term670964);
        setField(term670963, term670963.getClass(), "last", null);
        setField(term670963, term670963.getClass(), "propListHead", null);
        setIntField(term670963, term670963.getClass(), "sourcePosition", 0);
        setField(term670963, term670963.getClass(), "jsType", null);
        setField(term670963, term670963.getClass(), "parent", null);
        term670876 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term670878 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term670888 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term670876, term670876.getClass(), "str", null);
        setIntField(term670876, term670876.getClass(), "type", 14);
        setField(term670876, term670876.getClass(), "next", null);
        setField(term670878, term670878.getClass(), "functionName", null);
        setBooleanField(term670878, term670878.getClass(), "itsNeedsActivation", false);
        setIntField(term670878, term670878.getClass(), "itsFunctionType", 0);
        setBooleanField(term670878, term670878.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term670878, term670878.getClass(), "encodedSourceStart", 0);
        setIntField(term670878, term670878.getClass(), "encodedSourceEnd", 0);
        setField(term670878, term670878.getClass(), "sourceName", null);
        setIntField(term670878, term670878.getClass(), "baseLineno", 0);
        setIntField(term670878, term670878.getClass(), "endLineno", 0);
        setField(term670878, term670878.getClass(), "functions", null);
        setField(term670878, term670878.getClass(), "regexps", null);
        setField(term670878, term670878.getClass(), "itsVariables", null);
        setField(term670878, term670878.getClass(), "itsConst", null);
        setField(term670878, term670878.getClass(), "itsVariableNames", null);
        setIntField(term670878, term670878.getClass(), "varStart", 0);
        setField(term670878, term670878.getClass(), "compilerData", null);
        setIntField(term670878, term670878.getClass(), "type", 42);
        setField(term670888, term670888.getClass(), "functionName", null);
        setBooleanField(term670888, term670888.getClass(), "itsNeedsActivation", false);
        setIntField(term670888, term670888.getClass(), "itsFunctionType", 0);
        setBooleanField(term670888, term670888.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term670888, term670888.getClass(), "encodedSourceStart", 0);
        setIntField(term670888, term670888.getClass(), "encodedSourceEnd", 0);
        setField(term670888, term670888.getClass(), "sourceName", null);
        setIntField(term670888, term670888.getClass(), "baseLineno", 0);
        setIntField(term670888, term670888.getClass(), "endLineno", 0);
        setField(term670888, term670888.getClass(), "functions", null);
        setField(term670888, term670888.getClass(), "regexps", null);
        setField(term670888, term670888.getClass(), "itsVariables", null);
        setField(term670888, term670888.getClass(), "itsConst", null);
        setField(term670888, term670888.getClass(), "itsVariableNames", null);
        setIntField(term670888, term670888.getClass(), "varStart", 0);
        setField(term670888, term670888.getClass(), "compilerData", null);
        setIntField(term670888, term670888.getClass(), "type", 42);
        setField(term670888, term670888.getClass(), "next", null);
        setField(term670888, term670888.getClass(), "first", null);
        setField(term670888, term670888.getClass(), "last", null);
        setField(term670888, term670888.getClass(), "propListHead", null);
        setIntField(term670888, term670888.getClass(), "sourcePosition", 0);
        setField(term670888, term670888.getClass(), "jsType", null);
        setField(term670888, term670888.getClass(), "parent", null);
        setField(term670878, term670878.getClass(), "next", term670888);
        setField(term670878, term670878.getClass(), "first", null);
        setField(term670878, term670878.getClass(), "last", null);
        setField(term670878, term670878.getClass(), "propListHead", null);
        setIntField(term670878, term670878.getClass(), "sourcePosition", 0);
        setField(term670878, term670878.getClass(), "jsType", null);
        setField(term670878, term670878.getClass(), "parent", null);
        setField(term670876, term670876.getClass(), "first", term670878);
        setField(term670876, term670876.getClass(), "last", null);
        setField(term670876, term670876.getClass(), "propListHead", null);
        setIntField(term670876, term670876.getClass(), "sourcePosition", 0);
        setField(term670876, term670876.getClass(), "jsType", null);
        setField(term670876, term670876.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term670266;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term670174, args);
        assertTrue(recursiveEquals(term670174, term670962));
        assertTrue(recursiveEquals(term670266, term670963));
        assertTrue(recursiveEquals(retValue, term670876));
    }

};


