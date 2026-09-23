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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137668;
     Object term137754;
     Object term137877;
     Object term137878;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137668 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term137754 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term137846 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term137754, term137754.getClass(), "first", term137846);
        term137877 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term137877, term137877.getClass(), "propertyTestFunctions", null);
        term137878 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term137879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term137878, term137878.getClass(), "functionName", null);
        setBooleanField(term137878, term137878.getClass(), "itsNeedsActivation", false);
        setIntField(term137878, term137878.getClass(), "itsFunctionType", 0);
        setBooleanField(term137878, term137878.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term137878, term137878.getClass(), "encodedSourceStart", 0);
        setIntField(term137878, term137878.getClass(), "encodedSourceEnd", 0);
        setField(term137878, term137878.getClass(), "sourceName", null);
        setIntField(term137878, term137878.getClass(), "baseLineno", 0);
        setIntField(term137878, term137878.getClass(), "endLineno", 0);
        setField(term137878, term137878.getClass(), "functions", null);
        setField(term137878, term137878.getClass(), "regexps", null);
        setField(term137878, term137878.getClass(), "itsVariables", null);
        setField(term137878, term137878.getClass(), "itsConst", null);
        setField(term137878, term137878.getClass(), "itsVariableNames", null);
        setIntField(term137878, term137878.getClass(), "varStart", 0);
        setField(term137878, term137878.getClass(), "compilerData", null);
        setIntField(term137878, term137878.getClass(), "type", 0);
        setField(term137878, term137878.getClass(), "next", null);
        setDoubleField(term137879, term137879.getClass(), "number", 0.0);
        setIntField(term137879, term137879.getClass(), "type", 0);
        setField(term137879, term137879.getClass(), "next", null);
        setField(term137879, term137879.getClass(), "first", null);
        setField(term137879, term137879.getClass(), "last", null);
        setField(term137879, term137879.getClass(), "propListHead", null);
        setIntField(term137879, term137879.getClass(), "sourcePosition", 0);
        setField(term137879, term137879.getClass(), "jsType", null);
        setField(term137879, term137879.getClass(), "parent", null);
        setField(term137878, term137878.getClass(), "first", term137879);
        setField(term137878, term137878.getClass(), "last", null);
        setField(term137878, term137878.getClass(), "propListHead", null);
        setIntField(term137878, term137878.getClass(), "sourcePosition", 0);
        setField(term137878, term137878.getClass(), "jsType", null);
        setField(term137878, term137878.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term137754;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term137668, args);
        assertTrue(recursiveEquals(term137668, term137877));
        assertTrue(recursiveEquals(term137754, term137878));
        assertTrue(recursiveEquals(retValue, null));
    }

};


