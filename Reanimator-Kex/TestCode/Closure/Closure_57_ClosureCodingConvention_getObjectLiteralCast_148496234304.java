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

public class ClosureCodingConvention_getObjectLiteralCast_148496234304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124542;
     Object term124628;
     Object term125071;
     Object term125072;

    public ClosureCodingConvention_getObjectLiteralCast_148496234304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124542 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term124628 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term124714 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term124628, term124628.getClass(), "type", 37);
        setField(term124628, term124628.getClass(), "first", term124714);
        term125071 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term125071, term125071.getClass(), "propertyTestFunctions", null);
        term125072 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term125073 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term125072, term125072.getClass(), "functionName", null);
        setBooleanField(term125072, term125072.getClass(), "itsNeedsActivation", false);
        setIntField(term125072, term125072.getClass(), "itsFunctionType", 0);
        setBooleanField(term125072, term125072.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term125072, term125072.getClass(), "encodedSourceStart", 0);
        setIntField(term125072, term125072.getClass(), "encodedSourceEnd", 0);
        setField(term125072, term125072.getClass(), "sourceName", null);
        setIntField(term125072, term125072.getClass(), "baseLineno", 0);
        setIntField(term125072, term125072.getClass(), "endLineno", 0);
        setField(term125072, term125072.getClass(), "functions", null);
        setField(term125072, term125072.getClass(), "regexps", null);
        setField(term125072, term125072.getClass(), "itsVariables", null);
        setField(term125072, term125072.getClass(), "itsConst", null);
        setField(term125072, term125072.getClass(), "itsVariableNames", null);
        setIntField(term125072, term125072.getClass(), "varStart", 0);
        setField(term125072, term125072.getClass(), "compilerData", null);
        setIntField(term125072, term125072.getClass(), "type", 37);
        setField(term125072, term125072.getClass(), "next", null);
        setField(term125073, term125073.getClass(), "functionName", null);
        setBooleanField(term125073, term125073.getClass(), "itsNeedsActivation", false);
        setIntField(term125073, term125073.getClass(), "itsFunctionType", 0);
        setBooleanField(term125073, term125073.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term125073, term125073.getClass(), "encodedSourceStart", 0);
        setIntField(term125073, term125073.getClass(), "encodedSourceEnd", 0);
        setField(term125073, term125073.getClass(), "sourceName", null);
        setIntField(term125073, term125073.getClass(), "baseLineno", 0);
        setIntField(term125073, term125073.getClass(), "endLineno", 0);
        setField(term125073, term125073.getClass(), "functions", null);
        setField(term125073, term125073.getClass(), "regexps", null);
        setField(term125073, term125073.getClass(), "itsVariables", null);
        setField(term125073, term125073.getClass(), "itsConst", null);
        setField(term125073, term125073.getClass(), "itsVariableNames", null);
        setIntField(term125073, term125073.getClass(), "varStart", 0);
        setField(term125073, term125073.getClass(), "compilerData", null);
        setIntField(term125073, term125073.getClass(), "type", 0);
        setField(term125073, term125073.getClass(), "next", null);
        setField(term125073, term125073.getClass(), "first", null);
        setField(term125073, term125073.getClass(), "last", null);
        setField(term125073, term125073.getClass(), "propListHead", null);
        setIntField(term125073, term125073.getClass(), "sourcePosition", 0);
        setField(term125073, term125073.getClass(), "jsType", null);
        setField(term125073, term125073.getClass(), "parent", null);
        setField(term125072, term125072.getClass(), "first", term125073);
        setField(term125072, term125072.getClass(), "last", null);
        setField(term125072, term125072.getClass(), "propListHead", null);
        setIntField(term125072, term125072.getClass(), "sourcePosition", 0);
        setField(term125072, term125072.getClass(), "jsType", null);
        setField(term125072, term125072.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term124628;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term124542, args);
        assertTrue(recursiveEquals(term124542, term125071));
        assertTrue(recursiveEquals(term124628, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


