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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53436;
     Object term53522;
     Object term54130;
     Object term54131;
     Object term54064;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53436 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term53522 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term53608 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term53678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term53608, term53608.getClass(), "next", term53678);
        setField(term53522, term53522.getClass(), "first", term53608);
        setIntField(term53522, term53522.getClass(), "type", 13);
        term54130 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term54130, term54130.getClass(), "currentTraversal", null);
        term54131 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54132 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54131, term54131.getClass(), "functionName", null);
        setBooleanField(term54131, term54131.getClass(), "itsNeedsActivation", false);
        setIntField(term54131, term54131.getClass(), "itsFunctionType", 0);
        setBooleanField(term54131, term54131.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term54131, term54131.getClass(), "encodedSourceStart", 0);
        setIntField(term54131, term54131.getClass(), "encodedSourceEnd", 0);
        setField(term54131, term54131.getClass(), "sourceName", null);
        setIntField(term54131, term54131.getClass(), "baseLineno", 0);
        setIntField(term54131, term54131.getClass(), "endLineno", 0);
        setField(term54131, term54131.getClass(), "functions", null);
        setField(term54131, term54131.getClass(), "regexps", null);
        setField(term54131, term54131.getClass(), "itsVariables", null);
        setField(term54131, term54131.getClass(), "itsConst", null);
        setField(term54131, term54131.getClass(), "itsVariableNames", null);
        setIntField(term54131, term54131.getClass(), "varStart", 0);
        setField(term54131, term54131.getClass(), "compilerData", null);
        setIntField(term54131, term54131.getClass(), "type", 13);
        setField(term54131, term54131.getClass(), "next", null);
        setField(term54132, term54132.getClass(), "functionName", null);
        setBooleanField(term54132, term54132.getClass(), "itsNeedsActivation", false);
        setIntField(term54132, term54132.getClass(), "itsFunctionType", 0);
        setBooleanField(term54132, term54132.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term54132, term54132.getClass(), "encodedSourceStart", 0);
        setIntField(term54132, term54132.getClass(), "encodedSourceEnd", 0);
        setField(term54132, term54132.getClass(), "sourceName", null);
        setIntField(term54132, term54132.getClass(), "baseLineno", 0);
        setIntField(term54132, term54132.getClass(), "endLineno", 0);
        setField(term54132, term54132.getClass(), "functions", null);
        setField(term54132, term54132.getClass(), "regexps", null);
        setField(term54132, term54132.getClass(), "itsVariables", null);
        setField(term54132, term54132.getClass(), "itsConst", null);
        setField(term54132, term54132.getClass(), "itsVariableNames", null);
        setIntField(term54132, term54132.getClass(), "varStart", 0);
        setField(term54132, term54132.getClass(), "compilerData", null);
        setIntField(term54132, term54132.getClass(), "type", 0);
        setIntField(term54133, term54133.getClass(), "type", 0);
        setField(term54133, term54133.getClass(), "next", null);
        setField(term54133, term54133.getClass(), "first", null);
        setField(term54133, term54133.getClass(), "last", null);
        setField(term54133, term54133.getClass(), "propListHead", null);
        setIntField(term54133, term54133.getClass(), "sourcePosition", 0);
        setField(term54133, term54133.getClass(), "jsType", null);
        setField(term54133, term54133.getClass(), "parent", null);
        setField(term54132, term54132.getClass(), "next", term54133);
        setField(term54132, term54132.getClass(), "first", null);
        setField(term54132, term54132.getClass(), "last", null);
        setField(term54132, term54132.getClass(), "propListHead", null);
        setIntField(term54132, term54132.getClass(), "sourcePosition", 0);
        setField(term54132, term54132.getClass(), "jsType", null);
        setField(term54132, term54132.getClass(), "parent", null);
        setField(term54131, term54131.getClass(), "first", term54132);
        setField(term54131, term54131.getClass(), "last", null);
        setField(term54131, term54131.getClass(), "propListHead", null);
        setIntField(term54131, term54131.getClass(), "sourcePosition", 0);
        setField(term54131, term54131.getClass(), "jsType", null);
        setField(term54131, term54131.getClass(), "parent", null);
        term54064 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54074 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54064, term54064.getClass(), "functionName", null);
        setBooleanField(term54064, term54064.getClass(), "itsNeedsActivation", false);
        setIntField(term54064, term54064.getClass(), "itsFunctionType", 0);
        setBooleanField(term54064, term54064.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term54064, term54064.getClass(), "encodedSourceStart", 0);
        setIntField(term54064, term54064.getClass(), "encodedSourceEnd", 0);
        setField(term54064, term54064.getClass(), "sourceName", null);
        setIntField(term54064, term54064.getClass(), "baseLineno", 0);
        setIntField(term54064, term54064.getClass(), "endLineno", 0);
        setField(term54064, term54064.getClass(), "functions", null);
        setField(term54064, term54064.getClass(), "regexps", null);
        setField(term54064, term54064.getClass(), "itsVariables", null);
        setField(term54064, term54064.getClass(), "itsConst", null);
        setField(term54064, term54064.getClass(), "itsVariableNames", null);
        setIntField(term54064, term54064.getClass(), "varStart", 0);
        setField(term54064, term54064.getClass(), "compilerData", null);
        setIntField(term54064, term54064.getClass(), "type", 13);
        setField(term54064, term54064.getClass(), "next", null);
        setField(term54074, term54074.getClass(), "functionName", null);
        setBooleanField(term54074, term54074.getClass(), "itsNeedsActivation", false);
        setIntField(term54074, term54074.getClass(), "itsFunctionType", 0);
        setBooleanField(term54074, term54074.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term54074, term54074.getClass(), "encodedSourceStart", 0);
        setIntField(term54074, term54074.getClass(), "encodedSourceEnd", 0);
        setField(term54074, term54074.getClass(), "sourceName", null);
        setIntField(term54074, term54074.getClass(), "baseLineno", 0);
        setIntField(term54074, term54074.getClass(), "endLineno", 0);
        setField(term54074, term54074.getClass(), "functions", null);
        setField(term54074, term54074.getClass(), "regexps", null);
        setField(term54074, term54074.getClass(), "itsVariables", null);
        setField(term54074, term54074.getClass(), "itsConst", null);
        setField(term54074, term54074.getClass(), "itsVariableNames", null);
        setIntField(term54074, term54074.getClass(), "varStart", 0);
        setField(term54074, term54074.getClass(), "compilerData", null);
        setIntField(term54074, term54074.getClass(), "type", 0);
        setIntField(term54084, term54084.getClass(), "type", 0);
        setField(term54084, term54084.getClass(), "next", null);
        setField(term54084, term54084.getClass(), "first", null);
        setField(term54084, term54084.getClass(), "last", null);
        setField(term54084, term54084.getClass(), "propListHead", null);
        setIntField(term54084, term54084.getClass(), "sourcePosition", 0);
        setField(term54084, term54084.getClass(), "jsType", null);
        setField(term54084, term54084.getClass(), "parent", null);
        setField(term54074, term54074.getClass(), "next", term54084);
        setField(term54074, term54074.getClass(), "first", null);
        setField(term54074, term54074.getClass(), "last", null);
        setField(term54074, term54074.getClass(), "propListHead", null);
        setIntField(term54074, term54074.getClass(), "sourcePosition", 0);
        setField(term54074, term54074.getClass(), "jsType", null);
        setField(term54074, term54074.getClass(), "parent", null);
        setField(term54064, term54064.getClass(), "first", term54074);
        setField(term54064, term54064.getClass(), "last", null);
        setField(term54064, term54064.getClass(), "propListHead", null);
        setIntField(term54064, term54064.getClass(), "sourcePosition", 0);
        setField(term54064, term54064.getClass(), "jsType", null);
        setField(term54064, term54064.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53522;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term53436, args);
        assertTrue(recursiveEquals(term53436, term54130));
        assertTrue(recursiveEquals(term53522, term54131));
        assertTrue(recursiveEquals(retValue, term54064));
    }

};


