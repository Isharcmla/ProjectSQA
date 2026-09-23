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

public class ClosureCodingConvention_getObjectLiteralCast_148496234541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180048;
     Object term180140;
     Object term180278;
     Object term180279;

    public ClosureCodingConvention_getObjectLiteralCast_148496234541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180048 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term180140 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180226 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term180140, term180140.getClass(), "type", 37);
        setIntField(term180226, term180226.getClass(), "type", 42);
        setField(term180140, term180140.getClass(), "first", term180226);
        term180278 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term180278, term180278.getClass(), "propertyTestFunctions", null);
        term180279 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180280 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term180279, term180279.getClass(), "str", null);
        setIntField(term180279, term180279.getClass(), "type", 37);
        setField(term180279, term180279.getClass(), "next", null);
        setField(term180280, term180280.getClass(), "functionName", null);
        setBooleanField(term180280, term180280.getClass(), "itsNeedsActivation", false);
        setIntField(term180280, term180280.getClass(), "itsFunctionType", 0);
        setBooleanField(term180280, term180280.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180280, term180280.getClass(), "encodedSourceStart", 0);
        setIntField(term180280, term180280.getClass(), "encodedSourceEnd", 0);
        setField(term180280, term180280.getClass(), "sourceName", null);
        setIntField(term180280, term180280.getClass(), "baseLineno", 0);
        setIntField(term180280, term180280.getClass(), "endLineno", 0);
        setField(term180280, term180280.getClass(), "functions", null);
        setField(term180280, term180280.getClass(), "regexps", null);
        setField(term180280, term180280.getClass(), "itsVariables", null);
        setField(term180280, term180280.getClass(), "itsConst", null);
        setField(term180280, term180280.getClass(), "itsVariableNames", null);
        setIntField(term180280, term180280.getClass(), "varStart", 0);
        setField(term180280, term180280.getClass(), "compilerData", null);
        setIntField(term180280, term180280.getClass(), "type", 42);
        setField(term180280, term180280.getClass(), "next", null);
        setField(term180280, term180280.getClass(), "first", null);
        setField(term180280, term180280.getClass(), "last", null);
        setField(term180280, term180280.getClass(), "propListHead", null);
        setIntField(term180280, term180280.getClass(), "sourcePosition", 0);
        setField(term180280, term180280.getClass(), "jsType", null);
        setField(term180280, term180280.getClass(), "parent", null);
        setField(term180279, term180279.getClass(), "first", term180280);
        setField(term180279, term180279.getClass(), "last", null);
        setField(term180279, term180279.getClass(), "propListHead", null);
        setIntField(term180279, term180279.getClass(), "sourcePosition", 0);
        setField(term180279, term180279.getClass(), "jsType", null);
        setField(term180279, term180279.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term180140;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term180048, args);
        assertTrue(recursiveEquals(term180048, term180278));
        assertTrue(recursiveEquals(term180140, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


