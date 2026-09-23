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

public class ClosureCodingConvention_getObjectLiteralCast_148496234173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79090;
     Object term79176;
     Object term79322;
     Object term79323;

    public ClosureCodingConvention_getObjectLiteralCast_148496234173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79090 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term79176 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term79262 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term79176, term79176.getClass(), "type", 37);
        setIntField(term79262, term79262.getClass(), "type", 42);
        setField(term79176, term79176.getClass(), "first", term79262);
        term79322 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term79322, term79322.getClass(), "propertyTestFunctions", null);
        term79323 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term79324 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term79323, term79323.getClass(), "functionName", null);
        setBooleanField(term79323, term79323.getClass(), "itsNeedsActivation", false);
        setIntField(term79323, term79323.getClass(), "itsFunctionType", 0);
        setBooleanField(term79323, term79323.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term79323, term79323.getClass(), "encodedSourceStart", 0);
        setIntField(term79323, term79323.getClass(), "encodedSourceEnd", 0);
        setField(term79323, term79323.getClass(), "sourceName", null);
        setIntField(term79323, term79323.getClass(), "baseLineno", 0);
        setIntField(term79323, term79323.getClass(), "endLineno", 0);
        setField(term79323, term79323.getClass(), "functions", null);
        setField(term79323, term79323.getClass(), "regexps", null);
        setField(term79323, term79323.getClass(), "itsVariables", null);
        setField(term79323, term79323.getClass(), "itsConst", null);
        setField(term79323, term79323.getClass(), "itsVariableNames", null);
        setIntField(term79323, term79323.getClass(), "varStart", 0);
        setField(term79323, term79323.getClass(), "compilerData", null);
        setIntField(term79323, term79323.getClass(), "type", 37);
        setField(term79323, term79323.getClass(), "next", null);
        setField(term79324, term79324.getClass(), "functionName", null);
        setBooleanField(term79324, term79324.getClass(), "itsNeedsActivation", false);
        setIntField(term79324, term79324.getClass(), "itsFunctionType", 0);
        setBooleanField(term79324, term79324.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term79324, term79324.getClass(), "encodedSourceStart", 0);
        setIntField(term79324, term79324.getClass(), "encodedSourceEnd", 0);
        setField(term79324, term79324.getClass(), "sourceName", null);
        setIntField(term79324, term79324.getClass(), "baseLineno", 0);
        setIntField(term79324, term79324.getClass(), "endLineno", 0);
        setField(term79324, term79324.getClass(), "functions", null);
        setField(term79324, term79324.getClass(), "regexps", null);
        setField(term79324, term79324.getClass(), "itsVariables", null);
        setField(term79324, term79324.getClass(), "itsConst", null);
        setField(term79324, term79324.getClass(), "itsVariableNames", null);
        setIntField(term79324, term79324.getClass(), "varStart", 0);
        setField(term79324, term79324.getClass(), "compilerData", null);
        setIntField(term79324, term79324.getClass(), "type", 42);
        setField(term79324, term79324.getClass(), "next", null);
        setField(term79324, term79324.getClass(), "first", null);
        setField(term79324, term79324.getClass(), "last", null);
        setField(term79324, term79324.getClass(), "propListHead", null);
        setIntField(term79324, term79324.getClass(), "sourcePosition", 0);
        setField(term79324, term79324.getClass(), "jsType", null);
        setField(term79324, term79324.getClass(), "parent", null);
        setField(term79323, term79323.getClass(), "first", term79324);
        setField(term79323, term79323.getClass(), "last", null);
        setField(term79323, term79323.getClass(), "propListHead", null);
        setIntField(term79323, term79323.getClass(), "sourcePosition", 0);
        setField(term79323, term79323.getClass(), "jsType", null);
        setField(term79323, term79323.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term79176;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term79090, args);
        assertTrue(recursiveEquals(term79090, term79322));
        assertTrue(recursiveEquals(term79176, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


