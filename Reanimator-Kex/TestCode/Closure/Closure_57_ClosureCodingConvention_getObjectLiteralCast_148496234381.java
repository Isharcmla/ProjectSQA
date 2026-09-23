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

public class ClosureCodingConvention_getObjectLiteralCast_148496234381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139998;
     Object term140084;
     Object term140215;
     Object term140216;

    public ClosureCodingConvention_getObjectLiteralCast_148496234381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139998 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term140084 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term140176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term140084, term140084.getClass(), "type", 37);
        setIntField(term140176, term140176.getClass(), "type", 42);
        setField(term140084, term140084.getClass(), "first", term140176);
        term140215 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term140215, term140215.getClass(), "propertyTestFunctions", null);
        term140216 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term140217 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term140216, term140216.getClass(), "functionName", null);
        setBooleanField(term140216, term140216.getClass(), "itsNeedsActivation", false);
        setIntField(term140216, term140216.getClass(), "itsFunctionType", 0);
        setBooleanField(term140216, term140216.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term140216, term140216.getClass(), "encodedSourceStart", 0);
        setIntField(term140216, term140216.getClass(), "encodedSourceEnd", 0);
        setField(term140216, term140216.getClass(), "sourceName", null);
        setIntField(term140216, term140216.getClass(), "baseLineno", 0);
        setIntField(term140216, term140216.getClass(), "endLineno", 0);
        setField(term140216, term140216.getClass(), "functions", null);
        setField(term140216, term140216.getClass(), "regexps", null);
        setField(term140216, term140216.getClass(), "itsVariables", null);
        setField(term140216, term140216.getClass(), "itsConst", null);
        setField(term140216, term140216.getClass(), "itsVariableNames", null);
        setIntField(term140216, term140216.getClass(), "varStart", 0);
        setField(term140216, term140216.getClass(), "compilerData", null);
        setIntField(term140216, term140216.getClass(), "type", 37);
        setField(term140216, term140216.getClass(), "next", null);
        setDoubleField(term140217, term140217.getClass(), "number", 0.0);
        setIntField(term140217, term140217.getClass(), "type", 42);
        setField(term140217, term140217.getClass(), "next", null);
        setField(term140217, term140217.getClass(), "first", null);
        setField(term140217, term140217.getClass(), "last", null);
        setField(term140217, term140217.getClass(), "propListHead", null);
        setIntField(term140217, term140217.getClass(), "sourcePosition", 0);
        setField(term140217, term140217.getClass(), "jsType", null);
        setField(term140217, term140217.getClass(), "parent", null);
        setField(term140216, term140216.getClass(), "first", term140217);
        setField(term140216, term140216.getClass(), "last", null);
        setField(term140216, term140216.getClass(), "propListHead", null);
        setIntField(term140216, term140216.getClass(), "sourcePosition", 0);
        setField(term140216, term140216.getClass(), "jsType", null);
        setField(term140216, term140216.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term140084;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term139998, args);
        assertTrue(recursiveEquals(term139998, term140215));
        assertTrue(recursiveEquals(term140084, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


