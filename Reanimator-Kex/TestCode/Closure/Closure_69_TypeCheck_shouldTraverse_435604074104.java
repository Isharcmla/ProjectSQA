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

public class TypeCheck_shouldTraverse_435604074104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30466;
     Object term30552;
     Object term30839;
     Object term30840;

    public TypeCheck_shouldTraverse_435604074104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30466 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term30552 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term30839 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term30839, term30839.getClass(), "compiler", null);
        setField(term30839, term30839.getClass(), "validator", null);
        setField(term30839, term30839.getClass(), "reverseInterpreter", null);
        setField(term30839, term30839.getClass(), "typeRegistry", null);
        setField(term30839, term30839.getClass(), "topScope", null);
        setField(term30839, term30839.getClass(), "scopeCreator", null);
        setField(term30839, term30839.getClass(), "reportMissingOverride", null);
        setField(term30839, term30839.getClass(), "reportUnknownTypes", null);
        setBooleanField(term30839, term30839.getClass(), "reportMissingProperties", false);
        setField(term30839, term30839.getClass(), "inferJSDocInfo", null);
        setIntField(term30839, term30839.getClass(), "typedCount", 0);
        setIntField(term30839, term30839.getClass(), "nullCount", 0);
        setIntField(term30839, term30839.getClass(), "unknownCount", 0);
        setBooleanField(term30839, term30839.getClass(), "inExterns", false);
        setIntField(term30839, term30839.getClass(), "noTypeCheckSection", 0);
        term30840 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term30840, term30840.getClass(), "functionName", null);
        setBooleanField(term30840, term30840.getClass(), "itsNeedsActivation", false);
        setIntField(term30840, term30840.getClass(), "itsFunctionType", 0);
        setBooleanField(term30840, term30840.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term30840, term30840.getClass(), "encodedSourceStart", 0);
        setIntField(term30840, term30840.getClass(), "encodedSourceEnd", 0);
        setField(term30840, term30840.getClass(), "sourceName", null);
        setIntField(term30840, term30840.getClass(), "baseLineno", 0);
        setIntField(term30840, term30840.getClass(), "endLineno", 0);
        setField(term30840, term30840.getClass(), "functions", null);
        setField(term30840, term30840.getClass(), "regexps", null);
        setField(term30840, term30840.getClass(), "itsVariables", null);
        setField(term30840, term30840.getClass(), "itsConst", null);
        setField(term30840, term30840.getClass(), "itsVariableNames", null);
        setIntField(term30840, term30840.getClass(), "varStart", 0);
        setField(term30840, term30840.getClass(), "compilerData", null);
        setIntField(term30840, term30840.getClass(), "type", 0);
        setField(term30840, term30840.getClass(), "next", null);
        setField(term30840, term30840.getClass(), "first", null);
        setField(term30840, term30840.getClass(), "last", null);
        setField(term30840, term30840.getClass(), "propListHead", null);
        setIntField(term30840, term30840.getClass(), "sourcePosition", 0);
        setField(term30840, term30840.getClass(), "jsType", null);
        setField(term30840, term30840.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term30552;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term30466, args);
        assertTrue(recursiveEquals(term30466, term30839));
        assertTrue(recursiveEquals(term30552, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


