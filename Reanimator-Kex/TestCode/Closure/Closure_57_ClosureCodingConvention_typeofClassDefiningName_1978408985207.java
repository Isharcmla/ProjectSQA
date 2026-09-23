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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95138;
     Object term95224;
     Object term95242;
     Object term95243;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95138 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term95224 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term95224, term95224.getClass(), "type", -34);
        term95242 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term95242, term95242.getClass(), "propertyTestFunctions", null);
        term95243 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term95243, term95243.getClass(), "functionName", null);
        setBooleanField(term95243, term95243.getClass(), "itsNeedsActivation", false);
        setIntField(term95243, term95243.getClass(), "itsFunctionType", 0);
        setBooleanField(term95243, term95243.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term95243, term95243.getClass(), "encodedSourceStart", 0);
        setIntField(term95243, term95243.getClass(), "encodedSourceEnd", 0);
        setField(term95243, term95243.getClass(), "sourceName", null);
        setIntField(term95243, term95243.getClass(), "baseLineno", 0);
        setIntField(term95243, term95243.getClass(), "endLineno", 0);
        setField(term95243, term95243.getClass(), "functions", null);
        setField(term95243, term95243.getClass(), "regexps", null);
        setField(term95243, term95243.getClass(), "itsVariables", null);
        setField(term95243, term95243.getClass(), "itsConst", null);
        setField(term95243, term95243.getClass(), "itsVariableNames", null);
        setIntField(term95243, term95243.getClass(), "varStart", 0);
        setField(term95243, term95243.getClass(), "compilerData", null);
        setIntField(term95243, term95243.getClass(), "type", -34);
        setField(term95243, term95243.getClass(), "next", null);
        setField(term95243, term95243.getClass(), "first", null);
        setField(term95243, term95243.getClass(), "last", null);
        setField(term95243, term95243.getClass(), "propListHead", null);
        setIntField(term95243, term95243.getClass(), "sourcePosition", 0);
        setField(term95243, term95243.getClass(), "jsType", null);
        setField(term95243, term95243.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term95224;
        Object retValue = callMethod(klass, "typeofClassDefiningName", argTypes, term95138, args);
        assertTrue(recursiveEquals(term95138, term95242));
        assertTrue(recursiveEquals(term95224, term95243));
        assertTrue(recursiveEquals(retValue, null));
    }

};


