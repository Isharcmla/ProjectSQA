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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156217;
     Object term156309;
     Object term156465;
     Object term156466;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156217 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term156309 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156395 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term156309, term156309.getClass(), "first", term156395);
        term156465 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term156465, term156465.getClass(), "propertyTestFunctions", null);
        term156466 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156467 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term156466, term156466.getClass(), "str", null);
        setIntField(term156466, term156466.getClass(), "type", 0);
        setField(term156466, term156466.getClass(), "next", null);
        setField(term156467, term156467.getClass(), "functionName", null);
        setBooleanField(term156467, term156467.getClass(), "itsNeedsActivation", false);
        setIntField(term156467, term156467.getClass(), "itsFunctionType", 0);
        setBooleanField(term156467, term156467.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term156467, term156467.getClass(), "encodedSourceStart", 0);
        setIntField(term156467, term156467.getClass(), "encodedSourceEnd", 0);
        setField(term156467, term156467.getClass(), "sourceName", null);
        setIntField(term156467, term156467.getClass(), "baseLineno", 0);
        setIntField(term156467, term156467.getClass(), "endLineno", 0);
        setField(term156467, term156467.getClass(), "functions", null);
        setField(term156467, term156467.getClass(), "regexps", null);
        setField(term156467, term156467.getClass(), "itsVariables", null);
        setField(term156467, term156467.getClass(), "itsConst", null);
        setField(term156467, term156467.getClass(), "itsVariableNames", null);
        setIntField(term156467, term156467.getClass(), "varStart", 0);
        setField(term156467, term156467.getClass(), "compilerData", null);
        setIntField(term156467, term156467.getClass(), "type", 0);
        setField(term156467, term156467.getClass(), "next", null);
        setField(term156467, term156467.getClass(), "first", null);
        setField(term156467, term156467.getClass(), "last", null);
        setField(term156467, term156467.getClass(), "propListHead", null);
        setIntField(term156467, term156467.getClass(), "sourcePosition", 0);
        setField(term156467, term156467.getClass(), "jsType", null);
        setField(term156467, term156467.getClass(), "parent", null);
        setField(term156466, term156466.getClass(), "first", term156467);
        setField(term156466, term156466.getClass(), "last", null);
        setField(term156466, term156466.getClass(), "propListHead", null);
        setIntField(term156466, term156466.getClass(), "sourcePosition", 0);
        setField(term156466, term156466.getClass(), "jsType", null);
        setField(term156466, term156466.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term156309;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term156217, args);
        assertTrue(recursiveEquals(term156217, term156465));
        assertTrue(recursiveEquals(term156309, term156466));
        assertTrue(recursiveEquals(retValue, null));
    }

};


