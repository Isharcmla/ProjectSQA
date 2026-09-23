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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157678;
     Object term157764;
     Object term158185;
     Object term158186;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157678 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term157764 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term157856 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term157764, term157764.getClass(), "first", term157856);
        term158185 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term158185, term158185.getClass(), "propertyTestFunctions", null);
        term158186 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term158187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term158186, term158186.getClass(), "functionName", null);
        setBooleanField(term158186, term158186.getClass(), "itsNeedsActivation", false);
        setIntField(term158186, term158186.getClass(), "itsFunctionType", 0);
        setBooleanField(term158186, term158186.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term158186, term158186.getClass(), "encodedSourceStart", 0);
        setIntField(term158186, term158186.getClass(), "encodedSourceEnd", 0);
        setField(term158186, term158186.getClass(), "sourceName", null);
        setIntField(term158186, term158186.getClass(), "baseLineno", 0);
        setIntField(term158186, term158186.getClass(), "endLineno", 0);
        setField(term158186, term158186.getClass(), "functions", null);
        setField(term158186, term158186.getClass(), "regexps", null);
        setField(term158186, term158186.getClass(), "itsVariables", null);
        setField(term158186, term158186.getClass(), "itsConst", null);
        setField(term158186, term158186.getClass(), "itsVariableNames", null);
        setIntField(term158186, term158186.getClass(), "varStart", 0);
        setField(term158186, term158186.getClass(), "compilerData", null);
        setIntField(term158186, term158186.getClass(), "type", 0);
        setField(term158186, term158186.getClass(), "next", null);
        setField(term158187, term158187.getClass(), "str", null);
        setIntField(term158187, term158187.getClass(), "type", 0);
        setField(term158187, term158187.getClass(), "next", null);
        setField(term158187, term158187.getClass(), "first", null);
        setField(term158187, term158187.getClass(), "last", null);
        setField(term158187, term158187.getClass(), "propListHead", null);
        setIntField(term158187, term158187.getClass(), "sourcePosition", 0);
        setField(term158187, term158187.getClass(), "jsType", null);
        setField(term158187, term158187.getClass(), "parent", null);
        setField(term158186, term158186.getClass(), "first", term158187);
        setField(term158186, term158186.getClass(), "last", null);
        setField(term158186, term158186.getClass(), "propListHead", null);
        setIntField(term158186, term158186.getClass(), "sourcePosition", 0);
        setField(term158186, term158186.getClass(), "jsType", null);
        setField(term158186, term158186.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term157764;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term157678, args);
        assertTrue(recursiveEquals(term157678, term158185));
        assertTrue(recursiveEquals(term157764, term158186));
        assertTrue(recursiveEquals(retValue, null));
    }

};


