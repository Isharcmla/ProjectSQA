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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166147;
     Object term166233;
     Object term177753;
     Object term177754;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166147 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term166233 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term166319 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term166411 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term166319, term166319.getClass(), "type", 33);
        setField(term166411, term166411.getClass(), "str", "inherits");
        setField(term166319, term166319.getClass(), "last", term166411);
        setField(term166233, term166233.getClass(), "first", term166319);
        term177753 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term177753, term177753.getClass(), "propertyTestFunctions", null);
        term177754 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term177755 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term177756 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term177754, term177754.getClass(), "functionName", null);
        setBooleanField(term177754, term177754.getClass(), "itsNeedsActivation", false);
        setIntField(term177754, term177754.getClass(), "itsFunctionType", 0);
        setBooleanField(term177754, term177754.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term177754, term177754.getClass(), "encodedSourceStart", 0);
        setIntField(term177754, term177754.getClass(), "encodedSourceEnd", 0);
        setField(term177754, term177754.getClass(), "sourceName", null);
        setIntField(term177754, term177754.getClass(), "baseLineno", 0);
        setIntField(term177754, term177754.getClass(), "endLineno", 0);
        setField(term177754, term177754.getClass(), "functions", null);
        setField(term177754, term177754.getClass(), "regexps", null);
        setField(term177754, term177754.getClass(), "itsVariables", null);
        setField(term177754, term177754.getClass(), "itsConst", null);
        setField(term177754, term177754.getClass(), "itsVariableNames", null);
        setIntField(term177754, term177754.getClass(), "varStart", 0);
        setField(term177754, term177754.getClass(), "compilerData", null);
        setIntField(term177754, term177754.getClass(), "type", 0);
        setField(term177754, term177754.getClass(), "next", null);
        setField(term177755, term177755.getClass(), "functionName", null);
        setBooleanField(term177755, term177755.getClass(), "itsNeedsActivation", false);
        setIntField(term177755, term177755.getClass(), "itsFunctionType", 0);
        setBooleanField(term177755, term177755.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term177755, term177755.getClass(), "encodedSourceStart", 0);
        setIntField(term177755, term177755.getClass(), "encodedSourceEnd", 0);
        setField(term177755, term177755.getClass(), "sourceName", null);
        setIntField(term177755, term177755.getClass(), "baseLineno", 0);
        setIntField(term177755, term177755.getClass(), "endLineno", 0);
        setField(term177755, term177755.getClass(), "functions", null);
        setField(term177755, term177755.getClass(), "regexps", null);
        setField(term177755, term177755.getClass(), "itsVariables", null);
        setField(term177755, term177755.getClass(), "itsConst", null);
        setField(term177755, term177755.getClass(), "itsVariableNames", null);
        setIntField(term177755, term177755.getClass(), "varStart", 0);
        setField(term177755, term177755.getClass(), "compilerData", null);
        setIntField(term177755, term177755.getClass(), "type", 33);
        setField(term177755, term177755.getClass(), "next", null);
        setField(term177755, term177755.getClass(), "first", null);
        setField(term177756, term177756.getClass(), "str", "inherits");
        setIntField(term177756, term177756.getClass(), "type", 0);
        setField(term177756, term177756.getClass(), "next", null);
        setField(term177756, term177756.getClass(), "first", null);
        setField(term177756, term177756.getClass(), "last", null);
        setField(term177756, term177756.getClass(), "propListHead", null);
        setIntField(term177756, term177756.getClass(), "sourcePosition", 0);
        setField(term177756, term177756.getClass(), "jsType", null);
        setField(term177756, term177756.getClass(), "parent", null);
        setField(term177755, term177755.getClass(), "last", term177756);
        setField(term177755, term177755.getClass(), "propListHead", null);
        setIntField(term177755, term177755.getClass(), "sourcePosition", 0);
        setField(term177755, term177755.getClass(), "jsType", null);
        setField(term177755, term177755.getClass(), "parent", null);
        setField(term177754, term177754.getClass(), "first", term177755);
        setField(term177754, term177754.getClass(), "last", null);
        setField(term177754, term177754.getClass(), "propListHead", null);
        setIntField(term177754, term177754.getClass(), "sourcePosition", 0);
        setField(term177754, term177754.getClass(), "jsType", null);
        setField(term177754, term177754.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term166233;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term166147, args);
        assertTrue(recursiveEquals(term166147, term177753));
        assertTrue(recursiveEquals(term166233, term177754));
        assertTrue(recursiveEquals(retValue, null));
    }

};


