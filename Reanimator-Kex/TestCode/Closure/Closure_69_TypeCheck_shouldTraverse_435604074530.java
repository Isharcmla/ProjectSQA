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

public class TypeCheck_shouldTraverse_435604074530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164427;
     Object term164603;
     Object term164635;
     Object term164637;

    public TypeCheck_shouldTraverse_435604074530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164427 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term164517 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term164427, term164427.getClass(), "validator", term164517);
        setIntField(term164427, term164427.getClass(), "noTypeCheckSection", 0);
        term164603 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term164603, term164603.getClass(), "type", 125);
        setField(term164603, term164603.getClass(), "propListHead", null);
        term164635 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term164636 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term164635, term164635.getClass(), "compiler", null);
        setField(term164636, term164636.getClass(), "compiler", null);
        setField(term164636, term164636.getClass(), "typeRegistry", null);
        setField(term164636, term164636.getClass(), "allValueTypes", null);
        setBooleanField(term164636, term164636.getClass(), "shouldReport", true);
        setField(term164636, term164636.getClass(), "nullOrUndefined", null);
        setField(term164636, term164636.getClass(), "mismatches", null);
        setField(term164635, term164635.getClass(), "validator", term164636);
        setField(term164635, term164635.getClass(), "reverseInterpreter", null);
        setField(term164635, term164635.getClass(), "typeRegistry", null);
        setField(term164635, term164635.getClass(), "topScope", null);
        setField(term164635, term164635.getClass(), "scopeCreator", null);
        setField(term164635, term164635.getClass(), "reportMissingOverride", null);
        setField(term164635, term164635.getClass(), "reportUnknownTypes", null);
        setBooleanField(term164635, term164635.getClass(), "reportMissingProperties", false);
        setField(term164635, term164635.getClass(), "inferJSDocInfo", null);
        setIntField(term164635, term164635.getClass(), "typedCount", 0);
        setIntField(term164635, term164635.getClass(), "nullCount", 0);
        setIntField(term164635, term164635.getClass(), "unknownCount", 0);
        setBooleanField(term164635, term164635.getClass(), "inExterns", false);
        setIntField(term164635, term164635.getClass(), "noTypeCheckSection", 0);
        term164637 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term164637, term164637.getClass(), "functionName", null);
        setBooleanField(term164637, term164637.getClass(), "itsNeedsActivation", false);
        setIntField(term164637, term164637.getClass(), "itsFunctionType", 0);
        setBooleanField(term164637, term164637.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term164637, term164637.getClass(), "encodedSourceStart", 0);
        setIntField(term164637, term164637.getClass(), "encodedSourceEnd", 0);
        setField(term164637, term164637.getClass(), "sourceName", null);
        setIntField(term164637, term164637.getClass(), "baseLineno", 0);
        setIntField(term164637, term164637.getClass(), "endLineno", 0);
        setField(term164637, term164637.getClass(), "functions", null);
        setField(term164637, term164637.getClass(), "regexps", null);
        setField(term164637, term164637.getClass(), "itsVariables", null);
        setField(term164637, term164637.getClass(), "itsConst", null);
        setField(term164637, term164637.getClass(), "itsVariableNames", null);
        setIntField(term164637, term164637.getClass(), "varStart", 0);
        setField(term164637, term164637.getClass(), "compilerData", null);
        setIntField(term164637, term164637.getClass(), "type", 125);
        setField(term164637, term164637.getClass(), "next", null);
        setField(term164637, term164637.getClass(), "first", null);
        setField(term164637, term164637.getClass(), "last", null);
        setField(term164637, term164637.getClass(), "propListHead", null);
        setIntField(term164637, term164637.getClass(), "sourcePosition", 0);
        setField(term164637, term164637.getClass(), "jsType", null);
        setField(term164637, term164637.getClass(), "parent", null);
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
        args[1] = term164603;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term164427, args);
        assertTrue(recursiveEquals(term164427, term164635));
        assertTrue(recursiveEquals(term164603, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


