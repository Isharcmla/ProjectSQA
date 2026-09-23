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

public class CheckAccessControls_getClassOfMethod_1679898606254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74636;
     Object term74728;
     Object term74814;
     Object term74841;
     Object term74842;
     Object term74843;

    public CheckAccessControls_getClassOfMethod_1679898606254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74636 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term74728 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term74728, term74728.getClass(), "type", 0);
        term74814 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term74814, term74814.getClass(), "type", 38);
        term74841 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term74841, term74841.getClass(), "compiler", null);
        setField(term74841, term74841.getClass(), "validator", null);
        setIntField(term74841, term74841.getClass(), "deprecatedDepth", 0);
        setIntField(term74841, term74841.getClass(), "methodDepth", 0);
        setField(term74841, term74841.getClass(), "currentClass", null);
        setField(term74841, term74841.getClass(), "initializedConstantProperties", null);
        term74842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term74842, term74842.getClass(), "functionName", null);
        setBooleanField(term74842, term74842.getClass(), "itsNeedsActivation", false);
        setIntField(term74842, term74842.getClass(), "itsFunctionType", 0);
        setBooleanField(term74842, term74842.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term74842, term74842.getClass(), "encodedSourceStart", 0);
        setIntField(term74842, term74842.getClass(), "encodedSourceEnd", 0);
        setField(term74842, term74842.getClass(), "sourceName", null);
        setIntField(term74842, term74842.getClass(), "baseLineno", 0);
        setIntField(term74842, term74842.getClass(), "endLineno", 0);
        setField(term74842, term74842.getClass(), "functions", null);
        setField(term74842, term74842.getClass(), "regexps", null);
        setField(term74842, term74842.getClass(), "itsVariables", null);
        setField(term74842, term74842.getClass(), "itsConst", null);
        setField(term74842, term74842.getClass(), "itsVariableNames", null);
        setIntField(term74842, term74842.getClass(), "varStart", 0);
        setField(term74842, term74842.getClass(), "compilerData", null);
        setIntField(term74842, term74842.getClass(), "type", 38);
        setField(term74842, term74842.getClass(), "next", null);
        setField(term74842, term74842.getClass(), "first", null);
        setField(term74842, term74842.getClass(), "last", null);
        setField(term74842, term74842.getClass(), "propListHead", null);
        setIntField(term74842, term74842.getClass(), "sourcePosition", 0);
        setField(term74842, term74842.getClass(), "jsType", null);
        setField(term74842, term74842.getClass(), "parent", null);
        term74843 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term74843, term74843.getClass(), "str", null);
        setIntField(term74843, term74843.getClass(), "type", 0);
        setField(term74843, term74843.getClass(), "next", null);
        setField(term74843, term74843.getClass(), "first", null);
        setField(term74843, term74843.getClass(), "last", null);
        setField(term74843, term74843.getClass(), "propListHead", null);
        setIntField(term74843, term74843.getClass(), "sourcePosition", 0);
        setField(term74843, term74843.getClass(), "jsType", null);
        setField(term74843, term74843.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term74728;
        args[1] = term74814;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term74636, args);
        assertTrue(recursiveEquals(term74636, term74841));
        assertTrue(recursiveEquals(term74728, term74842));
        assertTrue(recursiveEquals(term74814, term74843));
        assertTrue(recursiveEquals(retValue, null));
    }

};


