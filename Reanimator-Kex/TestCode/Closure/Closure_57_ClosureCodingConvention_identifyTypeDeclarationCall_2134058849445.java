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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150495;
     Object term150581;
     Object term150743;
     Object term150744;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150495 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term150581 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term150667 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term150581, term150581.getClass(), "first", term150667);
        term150743 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term150743, term150743.getClass(), "propertyTestFunctions", null);
        term150744 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term150745 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term150744, term150744.getClass(), "functionName", null);
        setBooleanField(term150744, term150744.getClass(), "itsNeedsActivation", false);
        setIntField(term150744, term150744.getClass(), "itsFunctionType", 0);
        setBooleanField(term150744, term150744.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term150744, term150744.getClass(), "encodedSourceStart", 0);
        setIntField(term150744, term150744.getClass(), "encodedSourceEnd", 0);
        setField(term150744, term150744.getClass(), "sourceName", null);
        setIntField(term150744, term150744.getClass(), "baseLineno", 0);
        setIntField(term150744, term150744.getClass(), "endLineno", 0);
        setField(term150744, term150744.getClass(), "functions", null);
        setField(term150744, term150744.getClass(), "regexps", null);
        setField(term150744, term150744.getClass(), "itsVariables", null);
        setField(term150744, term150744.getClass(), "itsConst", null);
        setField(term150744, term150744.getClass(), "itsVariableNames", null);
        setIntField(term150744, term150744.getClass(), "varStart", 0);
        setField(term150744, term150744.getClass(), "compilerData", null);
        setIntField(term150744, term150744.getClass(), "type", 0);
        setField(term150744, term150744.getClass(), "next", null);
        setField(term150745, term150745.getClass(), "functionName", null);
        setBooleanField(term150745, term150745.getClass(), "itsNeedsActivation", false);
        setIntField(term150745, term150745.getClass(), "itsFunctionType", 0);
        setBooleanField(term150745, term150745.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term150745, term150745.getClass(), "encodedSourceStart", 0);
        setIntField(term150745, term150745.getClass(), "encodedSourceEnd", 0);
        setField(term150745, term150745.getClass(), "sourceName", null);
        setIntField(term150745, term150745.getClass(), "baseLineno", 0);
        setIntField(term150745, term150745.getClass(), "endLineno", 0);
        setField(term150745, term150745.getClass(), "functions", null);
        setField(term150745, term150745.getClass(), "regexps", null);
        setField(term150745, term150745.getClass(), "itsVariables", null);
        setField(term150745, term150745.getClass(), "itsConst", null);
        setField(term150745, term150745.getClass(), "itsVariableNames", null);
        setIntField(term150745, term150745.getClass(), "varStart", 0);
        setField(term150745, term150745.getClass(), "compilerData", null);
        setIntField(term150745, term150745.getClass(), "type", 0);
        setField(term150745, term150745.getClass(), "next", null);
        setField(term150745, term150745.getClass(), "first", null);
        setField(term150745, term150745.getClass(), "last", null);
        setField(term150745, term150745.getClass(), "propListHead", null);
        setIntField(term150745, term150745.getClass(), "sourcePosition", 0);
        setField(term150745, term150745.getClass(), "jsType", null);
        setField(term150745, term150745.getClass(), "parent", null);
        setField(term150744, term150744.getClass(), "first", term150745);
        setField(term150744, term150744.getClass(), "last", null);
        setField(term150744, term150744.getClass(), "propListHead", null);
        setIntField(term150744, term150744.getClass(), "sourcePosition", 0);
        setField(term150744, term150744.getClass(), "jsType", null);
        setField(term150744, term150744.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term150581;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term150495, args);
        assertTrue(recursiveEquals(term150495, term150743));
        assertTrue(recursiveEquals(term150581, term150744));
        assertTrue(recursiveEquals(retValue, null));
    }

};


