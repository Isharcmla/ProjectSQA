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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162438;
     Object term162524;
     Object term162662;
     Object term162663;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162438 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term162524 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term162610 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term162524, term162524.getClass(), "first", term162610);
        term162662 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term162662, term162662.getClass(), "propertyTestFunctions", null);
        term162663 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term162664 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term162663, term162663.getClass(), "functionName", null);
        setBooleanField(term162663, term162663.getClass(), "itsNeedsActivation", false);
        setIntField(term162663, term162663.getClass(), "itsFunctionType", 0);
        setBooleanField(term162663, term162663.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162663, term162663.getClass(), "encodedSourceStart", 0);
        setIntField(term162663, term162663.getClass(), "encodedSourceEnd", 0);
        setField(term162663, term162663.getClass(), "sourceName", null);
        setIntField(term162663, term162663.getClass(), "baseLineno", 0);
        setIntField(term162663, term162663.getClass(), "endLineno", 0);
        setField(term162663, term162663.getClass(), "functions", null);
        setField(term162663, term162663.getClass(), "regexps", null);
        setField(term162663, term162663.getClass(), "itsVariables", null);
        setField(term162663, term162663.getClass(), "itsConst", null);
        setField(term162663, term162663.getClass(), "itsVariableNames", null);
        setIntField(term162663, term162663.getClass(), "varStart", 0);
        setField(term162663, term162663.getClass(), "compilerData", null);
        setIntField(term162663, term162663.getClass(), "type", 0);
        setField(term162663, term162663.getClass(), "next", null);
        setField(term162664, term162664.getClass(), "functionName", null);
        setBooleanField(term162664, term162664.getClass(), "itsNeedsActivation", false);
        setIntField(term162664, term162664.getClass(), "itsFunctionType", 0);
        setBooleanField(term162664, term162664.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162664, term162664.getClass(), "encodedSourceStart", 0);
        setIntField(term162664, term162664.getClass(), "encodedSourceEnd", 0);
        setField(term162664, term162664.getClass(), "sourceName", null);
        setIntField(term162664, term162664.getClass(), "baseLineno", 0);
        setIntField(term162664, term162664.getClass(), "endLineno", 0);
        setField(term162664, term162664.getClass(), "functions", null);
        setField(term162664, term162664.getClass(), "regexps", null);
        setField(term162664, term162664.getClass(), "itsVariables", null);
        setField(term162664, term162664.getClass(), "itsConst", null);
        setField(term162664, term162664.getClass(), "itsVariableNames", null);
        setIntField(term162664, term162664.getClass(), "varStart", 0);
        setField(term162664, term162664.getClass(), "compilerData", null);
        setIntField(term162664, term162664.getClass(), "type", 0);
        setField(term162664, term162664.getClass(), "next", null);
        setField(term162664, term162664.getClass(), "first", null);
        setField(term162664, term162664.getClass(), "last", null);
        setField(term162664, term162664.getClass(), "propListHead", null);
        setIntField(term162664, term162664.getClass(), "sourcePosition", 0);
        setField(term162664, term162664.getClass(), "jsType", null);
        setField(term162664, term162664.getClass(), "parent", null);
        setField(term162663, term162663.getClass(), "first", term162664);
        setField(term162663, term162663.getClass(), "last", null);
        setField(term162663, term162663.getClass(), "propListHead", null);
        setIntField(term162663, term162663.getClass(), "sourcePosition", 0);
        setField(term162663, term162663.getClass(), "jsType", null);
        setField(term162663, term162663.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term162524;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term162438, args);
        assertTrue(recursiveEquals(term162438, term162662));
        assertTrue(recursiveEquals(term162524, term162663));
        assertTrue(recursiveEquals(retValue, null));
    }

};


