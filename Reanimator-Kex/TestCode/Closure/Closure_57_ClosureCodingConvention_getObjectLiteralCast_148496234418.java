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

public class ClosureCodingConvention_getObjectLiteralCast_148496234418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146081;
     Object term146173;
     Object term146602;
     Object term146603;

    public ClosureCodingConvention_getObjectLiteralCast_148496234418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146081 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term146173 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term146259 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term146173, term146173.getClass(), "type", 37);
        setField(term146173, term146173.getClass(), "first", term146259);
        term146602 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term146602, term146602.getClass(), "propertyTestFunctions", null);
        term146603 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term146604 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term146603, term146603.getClass(), "number", 0.0);
        setIntField(term146603, term146603.getClass(), "type", 37);
        setField(term146603, term146603.getClass(), "next", null);
        setField(term146604, term146604.getClass(), "functionName", null);
        setBooleanField(term146604, term146604.getClass(), "itsNeedsActivation", false);
        setIntField(term146604, term146604.getClass(), "itsFunctionType", 0);
        setBooleanField(term146604, term146604.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term146604, term146604.getClass(), "encodedSourceStart", 0);
        setIntField(term146604, term146604.getClass(), "encodedSourceEnd", 0);
        setField(term146604, term146604.getClass(), "sourceName", null);
        setIntField(term146604, term146604.getClass(), "baseLineno", 0);
        setIntField(term146604, term146604.getClass(), "endLineno", 0);
        setField(term146604, term146604.getClass(), "functions", null);
        setField(term146604, term146604.getClass(), "regexps", null);
        setField(term146604, term146604.getClass(), "itsVariables", null);
        setField(term146604, term146604.getClass(), "itsConst", null);
        setField(term146604, term146604.getClass(), "itsVariableNames", null);
        setIntField(term146604, term146604.getClass(), "varStart", 0);
        setField(term146604, term146604.getClass(), "compilerData", null);
        setIntField(term146604, term146604.getClass(), "type", 0);
        setField(term146604, term146604.getClass(), "next", null);
        setField(term146604, term146604.getClass(), "first", null);
        setField(term146604, term146604.getClass(), "last", null);
        setField(term146604, term146604.getClass(), "propListHead", null);
        setIntField(term146604, term146604.getClass(), "sourcePosition", 0);
        setField(term146604, term146604.getClass(), "jsType", null);
        setField(term146604, term146604.getClass(), "parent", null);
        setField(term146603, term146603.getClass(), "first", term146604);
        setField(term146603, term146603.getClass(), "last", null);
        setField(term146603, term146603.getClass(), "propListHead", null);
        setIntField(term146603, term146603.getClass(), "sourcePosition", 0);
        setField(term146603, term146603.getClass(), "jsType", null);
        setField(term146603, term146603.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term146173;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term146081, args);
        assertTrue(recursiveEquals(term146081, term146602));
        assertTrue(recursiveEquals(term146173, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


