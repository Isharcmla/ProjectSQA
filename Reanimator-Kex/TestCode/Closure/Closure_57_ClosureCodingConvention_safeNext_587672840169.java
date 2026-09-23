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

public class ClosureCodingConvention_safeNext_587672840169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78378;
     Object term78464;
     Object term78478;
     Object term78479;

    public ClosureCodingConvention_safeNext_587672840169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78378 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term78464 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term78478 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term78478, term78478.getClass(), "propertyTestFunctions", null);
        term78479 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term78479, term78479.getClass(), "functionName", null);
        setBooleanField(term78479, term78479.getClass(), "itsNeedsActivation", false);
        setIntField(term78479, term78479.getClass(), "itsFunctionType", 0);
        setBooleanField(term78479, term78479.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term78479, term78479.getClass(), "encodedSourceStart", 0);
        setIntField(term78479, term78479.getClass(), "encodedSourceEnd", 0);
        setField(term78479, term78479.getClass(), "sourceName", null);
        setIntField(term78479, term78479.getClass(), "baseLineno", 0);
        setIntField(term78479, term78479.getClass(), "endLineno", 0);
        setField(term78479, term78479.getClass(), "functions", null);
        setField(term78479, term78479.getClass(), "regexps", null);
        setField(term78479, term78479.getClass(), "itsVariables", null);
        setField(term78479, term78479.getClass(), "itsConst", null);
        setField(term78479, term78479.getClass(), "itsVariableNames", null);
        setIntField(term78479, term78479.getClass(), "varStart", 0);
        setField(term78479, term78479.getClass(), "compilerData", null);
        setIntField(term78479, term78479.getClass(), "type", 0);
        setField(term78479, term78479.getClass(), "next", null);
        setField(term78479, term78479.getClass(), "first", null);
        setField(term78479, term78479.getClass(), "last", null);
        setField(term78479, term78479.getClass(), "propListHead", null);
        setIntField(term78479, term78479.getClass(), "sourcePosition", 0);
        setField(term78479, term78479.getClass(), "jsType", null);
        setField(term78479, term78479.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term78464;
        Object retValue = callMethod(klass, "safeNext", argTypes, term78378, args);
        assertTrue(recursiveEquals(term78378, term78478));
        assertTrue(recursiveEquals(term78464, term78479));
        assertTrue(recursiveEquals(retValue, null));
    }

};


