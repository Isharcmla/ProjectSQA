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

public class CheckAccessControls_getClassOfMethod_1679898606134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36147;
     Object term36233;
     Object term36325;
     Object term36745;
     Object term36746;
     Object term36747;

    public CheckAccessControls_getClassOfMethod_1679898606134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36147 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term36233 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term36325 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term36325, term36325.getClass(), "type", -87);
        term36745 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term36745, term36745.getClass(), "compiler", null);
        setField(term36745, term36745.getClass(), "validator", null);
        setIntField(term36745, term36745.getClass(), "deprecatedDepth", 0);
        setIntField(term36745, term36745.getClass(), "methodDepth", 0);
        setField(term36745, term36745.getClass(), "currentClass", null);
        setField(term36745, term36745.getClass(), "initializedConstantProperties", null);
        term36746 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36746, term36746.getClass(), "str", null);
        setIntField(term36746, term36746.getClass(), "type", -87);
        setField(term36746, term36746.getClass(), "next", null);
        setField(term36746, term36746.getClass(), "first", null);
        setField(term36746, term36746.getClass(), "last", null);
        setField(term36746, term36746.getClass(), "propListHead", null);
        setIntField(term36746, term36746.getClass(), "sourcePosition", 0);
        setField(term36746, term36746.getClass(), "jsType", null);
        setField(term36746, term36746.getClass(), "parent", null);
        term36747 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term36747, term36747.getClass(), "functionName", null);
        setBooleanField(term36747, term36747.getClass(), "itsNeedsActivation", false);
        setIntField(term36747, term36747.getClass(), "itsFunctionType", 0);
        setBooleanField(term36747, term36747.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term36747, term36747.getClass(), "encodedSourceStart", 0);
        setIntField(term36747, term36747.getClass(), "encodedSourceEnd", 0);
        setField(term36747, term36747.getClass(), "sourceName", null);
        setIntField(term36747, term36747.getClass(), "baseLineno", 0);
        setIntField(term36747, term36747.getClass(), "endLineno", 0);
        setField(term36747, term36747.getClass(), "functions", null);
        setField(term36747, term36747.getClass(), "regexps", null);
        setField(term36747, term36747.getClass(), "itsVariables", null);
        setField(term36747, term36747.getClass(), "itsConst", null);
        setField(term36747, term36747.getClass(), "itsVariableNames", null);
        setIntField(term36747, term36747.getClass(), "varStart", 0);
        setField(term36747, term36747.getClass(), "compilerData", null);
        setIntField(term36747, term36747.getClass(), "type", 0);
        setField(term36747, term36747.getClass(), "next", null);
        setField(term36747, term36747.getClass(), "first", null);
        setField(term36747, term36747.getClass(), "last", null);
        setField(term36747, term36747.getClass(), "propListHead", null);
        setIntField(term36747, term36747.getClass(), "sourcePosition", 0);
        setField(term36747, term36747.getClass(), "jsType", null);
        setField(term36747, term36747.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term36233;
        args[1] = term36325;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term36147, args);
        assertTrue(recursiveEquals(term36147, term36745));
        assertTrue(recursiveEquals(term36233, term36746));
        assertTrue(recursiveEquals(term36325, term36747));
        assertTrue(recursiveEquals(retValue, null));
    }

};


