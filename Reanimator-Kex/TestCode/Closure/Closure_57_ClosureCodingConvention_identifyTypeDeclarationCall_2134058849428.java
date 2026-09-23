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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147685;
     Object term147771;
     Object term148139;
     Object term148140;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147685 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term147771 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term147771, term147771.getClass(), "first", term147771);
        setIntField(term147771, term147771.getClass(), "type", 42);
        term148139 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term148139, term148139.getClass(), "propertyTestFunctions", null);
        term148140 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term148140, term148140.getClass(), "functionName", null);
        setBooleanField(term148140, term148140.getClass(), "itsNeedsActivation", false);
        setIntField(term148140, term148140.getClass(), "itsFunctionType", 0);
        setBooleanField(term148140, term148140.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term148140, term148140.getClass(), "encodedSourceStart", 0);
        setIntField(term148140, term148140.getClass(), "encodedSourceEnd", 0);
        setField(term148140, term148140.getClass(), "sourceName", null);
        setIntField(term148140, term148140.getClass(), "baseLineno", 0);
        setIntField(term148140, term148140.getClass(), "endLineno", 0);
        setField(term148140, term148140.getClass(), "functions", null);
        setField(term148140, term148140.getClass(), "regexps", null);
        setField(term148140, term148140.getClass(), "itsVariables", null);
        setField(term148140, term148140.getClass(), "itsConst", null);
        setField(term148140, term148140.getClass(), "itsVariableNames", null);
        setIntField(term148140, term148140.getClass(), "varStart", 0);
        setField(term148140, term148140.getClass(), "compilerData", null);
        setIntField(term148140, term148140.getClass(), "type", 42);
        setField(term148140, term148140.getClass(), "next", null);
        setField(term148140, term148140.getClass(), "first", term148140);
        setField(term148140, term148140.getClass(), "last", null);
        setField(term148140, term148140.getClass(), "propListHead", null);
        setIntField(term148140, term148140.getClass(), "sourcePosition", 0);
        setField(term148140, term148140.getClass(), "jsType", null);
        setField(term148140, term148140.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term147771;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term147685, args);
        assertTrue(recursiveEquals(term147685, term148139));
        assertTrue(recursiveEquals(term147771, term148140));
        assertTrue(recursiveEquals(retValue, null));
    }

};


