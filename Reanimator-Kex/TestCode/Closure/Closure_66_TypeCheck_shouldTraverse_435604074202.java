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

public class TypeCheck_shouldTraverse_435604074202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50614;
     Object term50700;
     Object term50744;
     Object term50745;

    public TypeCheck_shouldTraverse_435604074202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50614 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term50700 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term50744 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term50744, term50744.getClass(), "compiler", null);
        setField(term50744, term50744.getClass(), "validator", null);
        setField(term50744, term50744.getClass(), "reverseInterpreter", null);
        setField(term50744, term50744.getClass(), "typeRegistry", null);
        setField(term50744, term50744.getClass(), "topScope", null);
        setField(term50744, term50744.getClass(), "scopeCreator", null);
        setField(term50744, term50744.getClass(), "reportMissingOverride", null);
        setField(term50744, term50744.getClass(), "reportUnknownTypes", null);
        setBooleanField(term50744, term50744.getClass(), "reportMissingProperties", false);
        setField(term50744, term50744.getClass(), "inferJSDocInfo", null);
        setIntField(term50744, term50744.getClass(), "typedCount", 0);
        setIntField(term50744, term50744.getClass(), "nullCount", 0);
        setIntField(term50744, term50744.getClass(), "unknownCount", 0);
        setBooleanField(term50744, term50744.getClass(), "inExterns", false);
        setIntField(term50744, term50744.getClass(), "noTypeCheckSection", 0);
        term50745 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term50745, term50745.getClass(), "functionName", null);
        setBooleanField(term50745, term50745.getClass(), "itsNeedsActivation", false);
        setIntField(term50745, term50745.getClass(), "itsFunctionType", 0);
        setBooleanField(term50745, term50745.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term50745, term50745.getClass(), "encodedSourceStart", 0);
        setIntField(term50745, term50745.getClass(), "encodedSourceEnd", 0);
        setField(term50745, term50745.getClass(), "sourceName", null);
        setIntField(term50745, term50745.getClass(), "baseLineno", 0);
        setIntField(term50745, term50745.getClass(), "endLineno", 0);
        setField(term50745, term50745.getClass(), "functions", null);
        setField(term50745, term50745.getClass(), "regexps", null);
        setField(term50745, term50745.getClass(), "itsVariables", null);
        setField(term50745, term50745.getClass(), "itsConst", null);
        setField(term50745, term50745.getClass(), "itsVariableNames", null);
        setIntField(term50745, term50745.getClass(), "varStart", 0);
        setField(term50745, term50745.getClass(), "compilerData", null);
        setIntField(term50745, term50745.getClass(), "type", 0);
        setField(term50745, term50745.getClass(), "next", null);
        setField(term50745, term50745.getClass(), "first", null);
        setField(term50745, term50745.getClass(), "last", null);
        setField(term50745, term50745.getClass(), "propListHead", null);
        setIntField(term50745, term50745.getClass(), "sourcePosition", 0);
        setField(term50745, term50745.getClass(), "jsType", null);
        setField(term50745, term50745.getClass(), "parent", null);
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
        args[1] = term50700;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term50614, args);
        assertTrue(recursiveEquals(term50614, term50744));
        assertTrue(recursiveEquals(term50700, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


