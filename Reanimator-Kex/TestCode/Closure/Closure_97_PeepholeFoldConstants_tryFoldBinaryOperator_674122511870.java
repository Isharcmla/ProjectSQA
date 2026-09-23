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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247138;
     Object term247208;
     Object term247550;
     Object term247551;
     Object term247463;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247138 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term247208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term247298 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term247384 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term247298, term247298.getClass(), "next", term247384);
        setIntField(term247298, term247298.getClass(), "type", 0);
        setField(term247208, term247208.getClass(), "first", term247298);
        setIntField(term247208, term247208.getClass(), "type", 101);
        setField(term247208, term247208.getClass(), "parent", null);
        term247550 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term247550, term247550.getClass(), "currentTraversal", null);
        term247551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term247552 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term247553 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term247551, term247551.getClass(), "type", 101);
        setField(term247551, term247551.getClass(), "next", null);
        setIntField(term247552, term247552.getClass(), "encodedSourceStart", 0);
        setIntField(term247552, term247552.getClass(), "encodedSourceEnd", 0);
        setField(term247552, term247552.getClass(), "sourceName", null);
        setIntField(term247552, term247552.getClass(), "baseLineno", 0);
        setIntField(term247552, term247552.getClass(), "endLineno", 0);
        setField(term247552, term247552.getClass(), "functions", null);
        setField(term247552, term247552.getClass(), "regexps", null);
        setField(term247552, term247552.getClass(), "itsVariables", null);
        setField(term247552, term247552.getClass(), "itsConst", null);
        setField(term247552, term247552.getClass(), "itsVariableNames", null);
        setIntField(term247552, term247552.getClass(), "varStart", 0);
        setField(term247552, term247552.getClass(), "compilerData", null);
        setIntField(term247552, term247552.getClass(), "type", 0);
        setField(term247553, term247553.getClass(), "functionName", null);
        setBooleanField(term247553, term247553.getClass(), "itsNeedsActivation", false);
        setIntField(term247553, term247553.getClass(), "itsFunctionType", 0);
        setBooleanField(term247553, term247553.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term247553, term247553.getClass(), "encodedSourceStart", 0);
        setIntField(term247553, term247553.getClass(), "encodedSourceEnd", 0);
        setField(term247553, term247553.getClass(), "sourceName", null);
        setIntField(term247553, term247553.getClass(), "baseLineno", 0);
        setIntField(term247553, term247553.getClass(), "endLineno", 0);
        setField(term247553, term247553.getClass(), "functions", null);
        setField(term247553, term247553.getClass(), "regexps", null);
        setField(term247553, term247553.getClass(), "itsVariables", null);
        setField(term247553, term247553.getClass(), "itsConst", null);
        setField(term247553, term247553.getClass(), "itsVariableNames", null);
        setIntField(term247553, term247553.getClass(), "varStart", 0);
        setField(term247553, term247553.getClass(), "compilerData", null);
        setIntField(term247553, term247553.getClass(), "type", 0);
        setField(term247553, term247553.getClass(), "next", null);
        setField(term247553, term247553.getClass(), "first", null);
        setField(term247553, term247553.getClass(), "last", null);
        setField(term247553, term247553.getClass(), "propListHead", null);
        setIntField(term247553, term247553.getClass(), "sourcePosition", 0);
        setField(term247553, term247553.getClass(), "jsType", null);
        setField(term247553, term247553.getClass(), "parent", null);
        setField(term247552, term247552.getClass(), "next", term247553);
        setField(term247552, term247552.getClass(), "first", null);
        setField(term247552, term247552.getClass(), "last", null);
        setField(term247552, term247552.getClass(), "propListHead", null);
        setIntField(term247552, term247552.getClass(), "sourcePosition", 0);
        setField(term247552, term247552.getClass(), "jsType", null);
        setField(term247552, term247552.getClass(), "parent", null);
        setField(term247551, term247551.getClass(), "first", term247552);
        setField(term247551, term247551.getClass(), "last", null);
        setField(term247551, term247551.getClass(), "propListHead", null);
        setIntField(term247551, term247551.getClass(), "sourcePosition", 0);
        setField(term247551, term247551.getClass(), "jsType", null);
        setField(term247551, term247551.getClass(), "parent", null);
        term247463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term247465 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term247472 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term247463, term247463.getClass(), "type", 101);
        setField(term247463, term247463.getClass(), "next", null);
        setIntField(term247465, term247465.getClass(), "encodedSourceStart", 0);
        setIntField(term247465, term247465.getClass(), "encodedSourceEnd", 0);
        setField(term247465, term247465.getClass(), "sourceName", null);
        setIntField(term247465, term247465.getClass(), "baseLineno", 0);
        setIntField(term247465, term247465.getClass(), "endLineno", 0);
        setField(term247465, term247465.getClass(), "functions", null);
        setField(term247465, term247465.getClass(), "regexps", null);
        setField(term247465, term247465.getClass(), "itsVariables", null);
        setField(term247465, term247465.getClass(), "itsConst", null);
        setField(term247465, term247465.getClass(), "itsVariableNames", null);
        setIntField(term247465, term247465.getClass(), "varStart", 0);
        setField(term247465, term247465.getClass(), "compilerData", null);
        setIntField(term247465, term247465.getClass(), "type", 0);
        setField(term247472, term247472.getClass(), "functionName", null);
        setBooleanField(term247472, term247472.getClass(), "itsNeedsActivation", false);
        setIntField(term247472, term247472.getClass(), "itsFunctionType", 0);
        setBooleanField(term247472, term247472.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term247472, term247472.getClass(), "encodedSourceStart", 0);
        setIntField(term247472, term247472.getClass(), "encodedSourceEnd", 0);
        setField(term247472, term247472.getClass(), "sourceName", null);
        setIntField(term247472, term247472.getClass(), "baseLineno", 0);
        setIntField(term247472, term247472.getClass(), "endLineno", 0);
        setField(term247472, term247472.getClass(), "functions", null);
        setField(term247472, term247472.getClass(), "regexps", null);
        setField(term247472, term247472.getClass(), "itsVariables", null);
        setField(term247472, term247472.getClass(), "itsConst", null);
        setField(term247472, term247472.getClass(), "itsVariableNames", null);
        setIntField(term247472, term247472.getClass(), "varStart", 0);
        setField(term247472, term247472.getClass(), "compilerData", null);
        setIntField(term247472, term247472.getClass(), "type", 0);
        setField(term247472, term247472.getClass(), "next", null);
        setField(term247472, term247472.getClass(), "first", null);
        setField(term247472, term247472.getClass(), "last", null);
        setField(term247472, term247472.getClass(), "propListHead", null);
        setIntField(term247472, term247472.getClass(), "sourcePosition", 0);
        setField(term247472, term247472.getClass(), "jsType", null);
        setField(term247472, term247472.getClass(), "parent", null);
        setField(term247465, term247465.getClass(), "next", term247472);
        setField(term247465, term247465.getClass(), "first", null);
        setField(term247465, term247465.getClass(), "last", null);
        setField(term247465, term247465.getClass(), "propListHead", null);
        setIntField(term247465, term247465.getClass(), "sourcePosition", 0);
        setField(term247465, term247465.getClass(), "jsType", null);
        setField(term247465, term247465.getClass(), "parent", null);
        setField(term247463, term247463.getClass(), "first", term247465);
        setField(term247463, term247463.getClass(), "last", null);
        setField(term247463, term247463.getClass(), "propListHead", null);
        setIntField(term247463, term247463.getClass(), "sourcePosition", 0);
        setField(term247463, term247463.getClass(), "jsType", null);
        setField(term247463, term247463.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term247208;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term247138, args);
        assertTrue(recursiveEquals(term247138, term247550));
        assertTrue(recursiveEquals(term247208, term247551));
        assertTrue(recursiveEquals(retValue, term247463));
    }

};


