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

public class ClosureCodingConvention_endsWithPrototype_1576622357367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137439;
     Object term137525;
     Object term137541;
     Object term137542;

    public ClosureCodingConvention_endsWithPrototype_1576622357367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137439 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term137525 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term137541 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term137541, term137541.getClass(), "propertyTestFunctions", null);
        term137542 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term137542, term137542.getClass(), "functionName", null);
        setBooleanField(term137542, term137542.getClass(), "itsNeedsActivation", false);
        setIntField(term137542, term137542.getClass(), "itsFunctionType", 0);
        setBooleanField(term137542, term137542.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term137542, term137542.getClass(), "encodedSourceStart", 0);
        setIntField(term137542, term137542.getClass(), "encodedSourceEnd", 0);
        setField(term137542, term137542.getClass(), "sourceName", null);
        setIntField(term137542, term137542.getClass(), "baseLineno", 0);
        setIntField(term137542, term137542.getClass(), "endLineno", 0);
        setField(term137542, term137542.getClass(), "functions", null);
        setField(term137542, term137542.getClass(), "regexps", null);
        setField(term137542, term137542.getClass(), "itsVariables", null);
        setField(term137542, term137542.getClass(), "itsConst", null);
        setField(term137542, term137542.getClass(), "itsVariableNames", null);
        setIntField(term137542, term137542.getClass(), "varStart", 0);
        setField(term137542, term137542.getClass(), "compilerData", null);
        setIntField(term137542, term137542.getClass(), "type", 0);
        setField(term137542, term137542.getClass(), "next", null);
        setField(term137542, term137542.getClass(), "first", null);
        setField(term137542, term137542.getClass(), "last", null);
        setField(term137542, term137542.getClass(), "propListHead", null);
        setIntField(term137542, term137542.getClass(), "sourcePosition", 0);
        setField(term137542, term137542.getClass(), "jsType", null);
        setField(term137542, term137542.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term137525;
        Object retValue = callMethod(klass, "endsWithPrototype", argTypes, term137439, args);
        assertTrue(recursiveEquals(term137439, term137541));
        assertTrue(recursiveEquals(term137525, term137542));
        assertTrue(recursiveEquals(retValue, false));
    }

};


