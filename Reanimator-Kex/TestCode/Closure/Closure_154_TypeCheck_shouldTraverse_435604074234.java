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

public class TypeCheck_shouldTraverse_435604074234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64553;
     Object term64639;
     Object term64826;
     Object term64827;

    public TypeCheck_shouldTraverse_435604074234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64553 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term64639 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term64826 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term64826, term64826.getClass(), "compiler", null);
        setField(term64826, term64826.getClass(), "validator", null);
        setField(term64826, term64826.getClass(), "reverseInterpreter", null);
        setField(term64826, term64826.getClass(), "typeRegistry", null);
        setField(term64826, term64826.getClass(), "topScope", null);
        setField(term64826, term64826.getClass(), "scopeCreator", null);
        setField(term64826, term64826.getClass(), "reportMissingOverride", null);
        setField(term64826, term64826.getClass(), "reportUnknownTypes", null);
        setBooleanField(term64826, term64826.getClass(), "reportMissingProperties", false);
        setField(term64826, term64826.getClass(), "inferJSDocInfo", null);
        setIntField(term64826, term64826.getClass(), "typedCount", 0);
        setIntField(term64826, term64826.getClass(), "nullCount", 0);
        setIntField(term64826, term64826.getClass(), "unknownCount", 0);
        setBooleanField(term64826, term64826.getClass(), "inExterns", false);
        setIntField(term64826, term64826.getClass(), "noTypeCheckSection", 0);
        term64827 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term64827, term64827.getClass(), "functionName", null);
        setBooleanField(term64827, term64827.getClass(), "itsNeedsActivation", false);
        setIntField(term64827, term64827.getClass(), "itsFunctionType", 0);
        setBooleanField(term64827, term64827.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term64827, term64827.getClass(), "encodedSourceStart", 0);
        setIntField(term64827, term64827.getClass(), "encodedSourceEnd", 0);
        setField(term64827, term64827.getClass(), "sourceName", null);
        setIntField(term64827, term64827.getClass(), "baseLineno", 0);
        setIntField(term64827, term64827.getClass(), "endLineno", 0);
        setField(term64827, term64827.getClass(), "functions", null);
        setField(term64827, term64827.getClass(), "regexps", null);
        setField(term64827, term64827.getClass(), "itsVariables", null);
        setField(term64827, term64827.getClass(), "itsConst", null);
        setField(term64827, term64827.getClass(), "itsVariableNames", null);
        setIntField(term64827, term64827.getClass(), "varStart", 0);
        setField(term64827, term64827.getClass(), "compilerData", null);
        setIntField(term64827, term64827.getClass(), "type", 0);
        setField(term64827, term64827.getClass(), "next", null);
        setField(term64827, term64827.getClass(), "first", null);
        setField(term64827, term64827.getClass(), "last", null);
        setField(term64827, term64827.getClass(), "propListHead", null);
        setIntField(term64827, term64827.getClass(), "sourcePosition", 0);
        setField(term64827, term64827.getClass(), "jsType", null);
        setField(term64827, term64827.getClass(), "parent", null);
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
        args[1] = term64639;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term64553, args);
        assertTrue(recursiveEquals(term64553, term64826));
        assertTrue(recursiveEquals(term64639, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


