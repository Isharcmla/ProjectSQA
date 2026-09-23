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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62892;
     Object term62978;
     Object term62996;
     Object term62997;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62892 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term62978 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term62996 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term62996, term62996.getClass(), "propertyTestFunctions", null);
        term62997 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term62997, term62997.getClass(), "functionName", null);
        setBooleanField(term62997, term62997.getClass(), "itsNeedsActivation", false);
        setIntField(term62997, term62997.getClass(), "itsFunctionType", 0);
        setBooleanField(term62997, term62997.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term62997, term62997.getClass(), "encodedSourceStart", 0);
        setIntField(term62997, term62997.getClass(), "encodedSourceEnd", 0);
        setField(term62997, term62997.getClass(), "sourceName", null);
        setIntField(term62997, term62997.getClass(), "baseLineno", 0);
        setIntField(term62997, term62997.getClass(), "endLineno", 0);
        setField(term62997, term62997.getClass(), "functions", null);
        setField(term62997, term62997.getClass(), "regexps", null);
        setField(term62997, term62997.getClass(), "itsVariables", null);
        setField(term62997, term62997.getClass(), "itsConst", null);
        setField(term62997, term62997.getClass(), "itsVariableNames", null);
        setIntField(term62997, term62997.getClass(), "varStart", 0);
        setField(term62997, term62997.getClass(), "compilerData", null);
        setIntField(term62997, term62997.getClass(), "type", 0);
        setField(term62997, term62997.getClass(), "next", null);
        setField(term62997, term62997.getClass(), "first", null);
        setField(term62997, term62997.getClass(), "last", null);
        setField(term62997, term62997.getClass(), "propListHead", null);
        setIntField(term62997, term62997.getClass(), "sourcePosition", 0);
        setField(term62997, term62997.getClass(), "jsType", null);
        setField(term62997, term62997.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term62978;
        Object retValue = callMethod(klass, "typeofClassDefiningName", argTypes, term62892, args);
        assertTrue(recursiveEquals(term62892, term62996));
        assertTrue(recursiveEquals(term62978, term62997));
        assertTrue(recursiveEquals(retValue, null));
    }

};


