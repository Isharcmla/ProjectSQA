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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221641;
     Object term221727;
     Object term221819;
     Object term230338;
     Object term230341;
     Object term230344;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221641 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term221727 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term221819 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term221905 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term221819, term221819.getClass(), "type", 130);
        setIntField(term221905, term221905.getClass(), "type", 37);
        setField(term221819, term221819.getClass(), "first", term221905);
        term230338 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term230338, term230338.getClass(), "propertyTestFunctions", null);
        term230341 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term230342 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term230341, term230341.getClass(), "str", null);
        setIntField(term230341, term230341.getClass(), "type", 130);
        setField(term230341, term230341.getClass(), "next", null);
        setField(term230342, term230342.getClass(), "functionName", null);
        setBooleanField(term230342, term230342.getClass(), "itsNeedsActivation", false);
        setIntField(term230342, term230342.getClass(), "itsFunctionType", 0);
        setBooleanField(term230342, term230342.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term230342, term230342.getClass(), "encodedSourceStart", 0);
        setIntField(term230342, term230342.getClass(), "encodedSourceEnd", 0);
        setField(term230342, term230342.getClass(), "sourceName", null);
        setIntField(term230342, term230342.getClass(), "baseLineno", 0);
        setIntField(term230342, term230342.getClass(), "endLineno", 0);
        setField(term230342, term230342.getClass(), "functions", null);
        setField(term230342, term230342.getClass(), "regexps", null);
        setField(term230342, term230342.getClass(), "itsVariables", null);
        setField(term230342, term230342.getClass(), "itsConst", null);
        setField(term230342, term230342.getClass(), "itsVariableNames", null);
        setIntField(term230342, term230342.getClass(), "varStart", 0);
        setField(term230342, term230342.getClass(), "compilerData", null);
        setIntField(term230342, term230342.getClass(), "type", 37);
        setField(term230342, term230342.getClass(), "next", null);
        setField(term230342, term230342.getClass(), "first", null);
        setField(term230342, term230342.getClass(), "last", null);
        setField(term230342, term230342.getClass(), "propListHead", null);
        setIntField(term230342, term230342.getClass(), "sourcePosition", 0);
        setField(term230342, term230342.getClass(), "jsType", null);
        setField(term230342, term230342.getClass(), "parent", null);
        setField(term230341, term230341.getClass(), "first", term230342);
        setField(term230341, term230341.getClass(), "last", null);
        setField(term230341, term230341.getClass(), "propListHead", null);
        setIntField(term230341, term230341.getClass(), "sourcePosition", 0);
        setField(term230341, term230341.getClass(), "jsType", null);
        setField(term230341, term230341.getClass(), "parent", null);
        term230344 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term230344, term230344.getClass(), "functionName", null);
        setBooleanField(term230344, term230344.getClass(), "itsNeedsActivation", false);
        setIntField(term230344, term230344.getClass(), "itsFunctionType", 0);
        setBooleanField(term230344, term230344.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term230344, term230344.getClass(), "encodedSourceStart", 0);
        setIntField(term230344, term230344.getClass(), "encodedSourceEnd", 0);
        setField(term230344, term230344.getClass(), "sourceName", null);
        setIntField(term230344, term230344.getClass(), "baseLineno", 0);
        setIntField(term230344, term230344.getClass(), "endLineno", 0);
        setField(term230344, term230344.getClass(), "functions", null);
        setField(term230344, term230344.getClass(), "regexps", null);
        setField(term230344, term230344.getClass(), "itsVariables", null);
        setField(term230344, term230344.getClass(), "itsConst", null);
        setField(term230344, term230344.getClass(), "itsVariableNames", null);
        setIntField(term230344, term230344.getClass(), "varStart", 0);
        setField(term230344, term230344.getClass(), "compilerData", null);
        setIntField(term230344, term230344.getClass(), "type", 0);
        setField(term230344, term230344.getClass(), "next", null);
        setField(term230344, term230344.getClass(), "first", null);
        setField(term230344, term230344.getClass(), "last", null);
        setField(term230344, term230344.getClass(), "propListHead", null);
        setIntField(term230344, term230344.getClass(), "sourcePosition", 0);
        setField(term230344, term230344.getClass(), "jsType", null);
        setField(term230344, term230344.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term221727;
        args[1] = term221819;
        Object retValue = callMethod(klass, "extractClassNameIfProvide", argTypes, term221641, args);
        assertTrue(recursiveEquals(term221641, term230338));
        assertTrue(recursiveEquals(term221727, term230341));
        assertTrue(recursiveEquals(term221819, term230344));
        assertTrue(recursiveEquals(retValue, null));
    }

};


