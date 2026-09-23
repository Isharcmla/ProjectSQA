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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126623;
     Object term126715;
     Object term127155;
     Object term127156;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126623 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term126715 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term126801 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term126715, term126715.getClass(), "first", term126801);
        term127155 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term127155, term127155.getClass(), "propertyTestFunctions", null);
        term127156 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term127157 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term127156, term127156.getClass(), "number", 0.0);
        setIntField(term127156, term127156.getClass(), "type", 0);
        setField(term127156, term127156.getClass(), "next", null);
        setField(term127157, term127157.getClass(), "functionName", null);
        setBooleanField(term127157, term127157.getClass(), "itsNeedsActivation", false);
        setIntField(term127157, term127157.getClass(), "itsFunctionType", 0);
        setBooleanField(term127157, term127157.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term127157, term127157.getClass(), "encodedSourceStart", 0);
        setIntField(term127157, term127157.getClass(), "encodedSourceEnd", 0);
        setField(term127157, term127157.getClass(), "sourceName", null);
        setIntField(term127157, term127157.getClass(), "baseLineno", 0);
        setIntField(term127157, term127157.getClass(), "endLineno", 0);
        setField(term127157, term127157.getClass(), "functions", null);
        setField(term127157, term127157.getClass(), "regexps", null);
        setField(term127157, term127157.getClass(), "itsVariables", null);
        setField(term127157, term127157.getClass(), "itsConst", null);
        setField(term127157, term127157.getClass(), "itsVariableNames", null);
        setIntField(term127157, term127157.getClass(), "varStart", 0);
        setField(term127157, term127157.getClass(), "compilerData", null);
        setIntField(term127157, term127157.getClass(), "type", 0);
        setField(term127157, term127157.getClass(), "next", null);
        setField(term127157, term127157.getClass(), "first", null);
        setField(term127157, term127157.getClass(), "last", null);
        setField(term127157, term127157.getClass(), "propListHead", null);
        setIntField(term127157, term127157.getClass(), "sourcePosition", 0);
        setField(term127157, term127157.getClass(), "jsType", null);
        setField(term127157, term127157.getClass(), "parent", null);
        setField(term127156, term127156.getClass(), "first", term127157);
        setField(term127156, term127156.getClass(), "last", null);
        setField(term127156, term127156.getClass(), "propListHead", null);
        setIntField(term127156, term127156.getClass(), "sourcePosition", 0);
        setField(term127156, term127156.getClass(), "jsType", null);
        setField(term127156, term127156.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term126715;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term126623, args);
        assertTrue(recursiveEquals(term126623, term127155));
        assertTrue(recursiveEquals(term126715, term127156));
        assertTrue(recursiveEquals(retValue, null));
    }

};


