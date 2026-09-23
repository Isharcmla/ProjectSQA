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

public class TypeCheck_shouldTraverse_435604074160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42582;
     Object term42668;
     Object term42946;
     Object term42947;

    public TypeCheck_shouldTraverse_435604074160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42582 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term42668 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term42946 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term42946, term42946.getClass(), "compiler", null);
        setField(term42946, term42946.getClass(), "validator", null);
        setField(term42946, term42946.getClass(), "reverseInterpreter", null);
        setField(term42946, term42946.getClass(), "typeRegistry", null);
        setField(term42946, term42946.getClass(), "topScope", null);
        setField(term42946, term42946.getClass(), "scopeCreator", null);
        setField(term42946, term42946.getClass(), "reportMissingOverride", null);
        setField(term42946, term42946.getClass(), "reportUnknownTypes", null);
        setBooleanField(term42946, term42946.getClass(), "reportMissingProperties", false);
        setField(term42946, term42946.getClass(), "inferJSDocInfo", null);
        setIntField(term42946, term42946.getClass(), "typedCount", 0);
        setIntField(term42946, term42946.getClass(), "nullCount", 0);
        setIntField(term42946, term42946.getClass(), "unknownCount", 0);
        setBooleanField(term42946, term42946.getClass(), "inExterns", false);
        setIntField(term42946, term42946.getClass(), "noTypeCheckSection", 0);
        term42947 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term42947, term42947.getClass(), "functionName", null);
        setBooleanField(term42947, term42947.getClass(), "itsNeedsActivation", false);
        setIntField(term42947, term42947.getClass(), "itsFunctionType", 0);
        setBooleanField(term42947, term42947.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term42947, term42947.getClass(), "encodedSourceStart", 0);
        setIntField(term42947, term42947.getClass(), "encodedSourceEnd", 0);
        setField(term42947, term42947.getClass(), "sourceName", null);
        setIntField(term42947, term42947.getClass(), "baseLineno", 0);
        setIntField(term42947, term42947.getClass(), "endLineno", 0);
        setField(term42947, term42947.getClass(), "functions", null);
        setField(term42947, term42947.getClass(), "regexps", null);
        setField(term42947, term42947.getClass(), "itsVariables", null);
        setField(term42947, term42947.getClass(), "itsConst", null);
        setField(term42947, term42947.getClass(), "itsVariableNames", null);
        setIntField(term42947, term42947.getClass(), "varStart", 0);
        setField(term42947, term42947.getClass(), "compilerData", null);
        setIntField(term42947, term42947.getClass(), "type", 0);
        setField(term42947, term42947.getClass(), "next", null);
        setField(term42947, term42947.getClass(), "first", null);
        setField(term42947, term42947.getClass(), "last", null);
        setField(term42947, term42947.getClass(), "propListHead", null);
        setIntField(term42947, term42947.getClass(), "sourcePosition", 0);
        setField(term42947, term42947.getClass(), "jsType", null);
        setField(term42947, term42947.getClass(), "parent", null);
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
        args[1] = term42668;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term42582, args);
        assertTrue(recursiveEquals(term42582, term42946));
        assertTrue(recursiveEquals(term42668, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


