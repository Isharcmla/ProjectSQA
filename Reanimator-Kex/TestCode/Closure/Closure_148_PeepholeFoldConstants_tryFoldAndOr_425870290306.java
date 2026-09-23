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

public class PeepholeFoldConstants_tryFoldAndOr_425870290306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59442;
     Object term59528;
     Object term59706;
     Object term59776;
     Object term59867;
     Object term59868;
     Object term59870;
     Object term59871;
     Object term59809;

    public PeepholeFoldConstants_tryFoldAndOr_425870290306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59442 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term59528 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term59614 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term59528, term59528.getClass(), "parent", term59614);
        setIntField(term59528, term59528.getClass(), "type", 0);
        term59706 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term59706, term59706.getClass(), "type", 0);
        term59776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term59867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term59867, term59867.getClass(), "currentTraversal", null);
        term59868 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term59869 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term59868, term59868.getClass(), "functionName", null);
        setBooleanField(term59868, term59868.getClass(), "itsNeedsActivation", false);
        setIntField(term59868, term59868.getClass(), "itsFunctionType", 0);
        setBooleanField(term59868, term59868.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term59868, term59868.getClass(), "encodedSourceStart", 0);
        setIntField(term59868, term59868.getClass(), "encodedSourceEnd", 0);
        setField(term59868, term59868.getClass(), "sourceName", null);
        setIntField(term59868, term59868.getClass(), "baseLineno", 0);
        setIntField(term59868, term59868.getClass(), "endLineno", 0);
        setField(term59868, term59868.getClass(), "functions", null);
        setField(term59868, term59868.getClass(), "regexps", null);
        setField(term59868, term59868.getClass(), "itsVariables", null);
        setField(term59868, term59868.getClass(), "itsConst", null);
        setField(term59868, term59868.getClass(), "itsVariableNames", null);
        setIntField(term59868, term59868.getClass(), "varStart", 0);
        setField(term59868, term59868.getClass(), "compilerData", null);
        setIntField(term59868, term59868.getClass(), "type", 0);
        setField(term59868, term59868.getClass(), "next", null);
        setField(term59868, term59868.getClass(), "first", null);
        setField(term59868, term59868.getClass(), "last", null);
        setField(term59868, term59868.getClass(), "propListHead", null);
        setIntField(term59868, term59868.getClass(), "sourcePosition", 0);
        setField(term59868, term59868.getClass(), "jsType", null);
        setField(term59869, term59869.getClass(), "functionName", null);
        setBooleanField(term59869, term59869.getClass(), "itsNeedsActivation", false);
        setIntField(term59869, term59869.getClass(), "itsFunctionType", 0);
        setBooleanField(term59869, term59869.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term59869, term59869.getClass(), "encodedSourceStart", 0);
        setIntField(term59869, term59869.getClass(), "encodedSourceEnd", 0);
        setField(term59869, term59869.getClass(), "sourceName", null);
        setIntField(term59869, term59869.getClass(), "baseLineno", 0);
        setIntField(term59869, term59869.getClass(), "endLineno", 0);
        setField(term59869, term59869.getClass(), "functions", null);
        setField(term59869, term59869.getClass(), "regexps", null);
        setField(term59869, term59869.getClass(), "itsVariables", null);
        setField(term59869, term59869.getClass(), "itsConst", null);
        setField(term59869, term59869.getClass(), "itsVariableNames", null);
        setIntField(term59869, term59869.getClass(), "varStart", 0);
        setField(term59869, term59869.getClass(), "compilerData", null);
        setIntField(term59869, term59869.getClass(), "type", 0);
        setField(term59869, term59869.getClass(), "next", null);
        setField(term59869, term59869.getClass(), "first", null);
        setField(term59869, term59869.getClass(), "last", null);
        setField(term59869, term59869.getClass(), "propListHead", null);
        setIntField(term59869, term59869.getClass(), "sourcePosition", 0);
        setField(term59869, term59869.getClass(), "jsType", null);
        setField(term59869, term59869.getClass(), "parent", null);
        setField(term59868, term59868.getClass(), "parent", term59869);
        term59870 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term59870, term59870.getClass(), "number", 0.0);
        setIntField(term59870, term59870.getClass(), "type", 0);
        setField(term59870, term59870.getClass(), "next", null);
        setField(term59870, term59870.getClass(), "first", null);
        setField(term59870, term59870.getClass(), "last", null);
        setField(term59870, term59870.getClass(), "propListHead", null);
        setIntField(term59870, term59870.getClass(), "sourcePosition", 0);
        setField(term59870, term59870.getClass(), "jsType", null);
        setField(term59870, term59870.getClass(), "parent", null);
        term59871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59871, term59871.getClass(), "type", 0);
        setField(term59871, term59871.getClass(), "next", null);
        setField(term59871, term59871.getClass(), "first", null);
        setField(term59871, term59871.getClass(), "last", null);
        setField(term59871, term59871.getClass(), "propListHead", null);
        setIntField(term59871, term59871.getClass(), "sourcePosition", 0);
        setField(term59871, term59871.getClass(), "jsType", null);
        setField(term59871, term59871.getClass(), "parent", null);
        term59809 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term59820 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term59809, term59809.getClass(), "functionName", null);
        setBooleanField(term59809, term59809.getClass(), "itsNeedsActivation", false);
        setIntField(term59809, term59809.getClass(), "itsFunctionType", 0);
        setBooleanField(term59809, term59809.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term59809, term59809.getClass(), "encodedSourceStart", 0);
        setIntField(term59809, term59809.getClass(), "encodedSourceEnd", 0);
        setField(term59809, term59809.getClass(), "sourceName", null);
        setIntField(term59809, term59809.getClass(), "baseLineno", 0);
        setIntField(term59809, term59809.getClass(), "endLineno", 0);
        setField(term59809, term59809.getClass(), "functions", null);
        setField(term59809, term59809.getClass(), "regexps", null);
        setField(term59809, term59809.getClass(), "itsVariables", null);
        setField(term59809, term59809.getClass(), "itsConst", null);
        setField(term59809, term59809.getClass(), "itsVariableNames", null);
        setIntField(term59809, term59809.getClass(), "varStart", 0);
        setField(term59809, term59809.getClass(), "compilerData", null);
        setIntField(term59809, term59809.getClass(), "type", 0);
        setField(term59809, term59809.getClass(), "next", null);
        setField(term59809, term59809.getClass(), "first", null);
        setField(term59809, term59809.getClass(), "last", null);
        setField(term59809, term59809.getClass(), "propListHead", null);
        setIntField(term59809, term59809.getClass(), "sourcePosition", 0);
        setField(term59809, term59809.getClass(), "jsType", null);
        setField(term59820, term59820.getClass(), "functionName", null);
        setBooleanField(term59820, term59820.getClass(), "itsNeedsActivation", false);
        setIntField(term59820, term59820.getClass(), "itsFunctionType", 0);
        setBooleanField(term59820, term59820.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term59820, term59820.getClass(), "encodedSourceStart", 0);
        setIntField(term59820, term59820.getClass(), "encodedSourceEnd", 0);
        setField(term59820, term59820.getClass(), "sourceName", null);
        setIntField(term59820, term59820.getClass(), "baseLineno", 0);
        setIntField(term59820, term59820.getClass(), "endLineno", 0);
        setField(term59820, term59820.getClass(), "functions", null);
        setField(term59820, term59820.getClass(), "regexps", null);
        setField(term59820, term59820.getClass(), "itsVariables", null);
        setField(term59820, term59820.getClass(), "itsConst", null);
        setField(term59820, term59820.getClass(), "itsVariableNames", null);
        setIntField(term59820, term59820.getClass(), "varStart", 0);
        setField(term59820, term59820.getClass(), "compilerData", null);
        setIntField(term59820, term59820.getClass(), "type", 0);
        setField(term59820, term59820.getClass(), "next", null);
        setField(term59820, term59820.getClass(), "first", null);
        setField(term59820, term59820.getClass(), "last", null);
        setField(term59820, term59820.getClass(), "propListHead", null);
        setIntField(term59820, term59820.getClass(), "sourcePosition", 0);
        setField(term59820, term59820.getClass(), "jsType", null);
        setField(term59820, term59820.getClass(), "parent", null);
        setField(term59809, term59809.getClass(), "parent", term59820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term59528;
        args[1] = term59706;
        args[2] = term59776;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term59442, args);
        assertTrue(recursiveEquals(term59442, term59867));
        assertTrue(recursiveEquals(term59528, term59868));
        assertTrue(recursiveEquals(term59706, term59870));
        assertTrue(recursiveEquals(term59776, term59871));
        assertTrue(recursiveEquals(retValue, term59809));
    }

};


