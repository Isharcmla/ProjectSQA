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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157981;
     Object term158073;
     Object term158243;
     Object term158244;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157981 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term158073 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158159 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term158073, term158073.getClass(), "first", term158159);
        term158243 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term158243, term158243.getClass(), "propertyTestFunctions", null);
        term158244 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158245 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term158244, term158244.getClass(), "number", 0.0);
        setIntField(term158244, term158244.getClass(), "type", 0);
        setField(term158244, term158244.getClass(), "next", null);
        setField(term158245, term158245.getClass(), "functionName", null);
        setBooleanField(term158245, term158245.getClass(), "itsNeedsActivation", false);
        setIntField(term158245, term158245.getClass(), "itsFunctionType", 0);
        setBooleanField(term158245, term158245.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term158245, term158245.getClass(), "encodedSourceStart", 0);
        setIntField(term158245, term158245.getClass(), "encodedSourceEnd", 0);
        setField(term158245, term158245.getClass(), "sourceName", null);
        setIntField(term158245, term158245.getClass(), "baseLineno", 0);
        setIntField(term158245, term158245.getClass(), "endLineno", 0);
        setField(term158245, term158245.getClass(), "functions", null);
        setField(term158245, term158245.getClass(), "regexps", null);
        setField(term158245, term158245.getClass(), "itsVariables", null);
        setField(term158245, term158245.getClass(), "itsConst", null);
        setField(term158245, term158245.getClass(), "itsVariableNames", null);
        setIntField(term158245, term158245.getClass(), "varStart", 0);
        setField(term158245, term158245.getClass(), "compilerData", null);
        setIntField(term158245, term158245.getClass(), "type", 0);
        setField(term158245, term158245.getClass(), "next", null);
        setField(term158245, term158245.getClass(), "first", null);
        setField(term158245, term158245.getClass(), "last", null);
        setField(term158245, term158245.getClass(), "propListHead", null);
        setIntField(term158245, term158245.getClass(), "sourcePosition", 0);
        setField(term158245, term158245.getClass(), "jsType", null);
        setField(term158245, term158245.getClass(), "parent", null);
        setField(term158244, term158244.getClass(), "first", term158245);
        setField(term158244, term158244.getClass(), "last", null);
        setField(term158244, term158244.getClass(), "propListHead", null);
        setIntField(term158244, term158244.getClass(), "sourcePosition", 0);
        setField(term158244, term158244.getClass(), "jsType", null);
        setField(term158244, term158244.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term158073;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term157981, args);
        assertTrue(recursiveEquals(term157981, term158243));
        assertTrue(recursiveEquals(term158073, term158244));
        assertTrue(recursiveEquals(retValue, null));
    }

};


