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

public class PeepholeFoldConstants_tryFoldComparison_848443179907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210462;
     Object term210548;
     Object term210634;
     Object term210720;
     Object term211185;
     Object term211186;
     Object term211187;
     Object term211188;
     Object term211149;

    public PeepholeFoldConstants_tryFoldComparison_848443179907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210462 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term210548 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term210548, term210548.getClass(), "type", 16);
        term210634 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term210634, term210634.getClass(), "type", 42);
        term210720 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term210720, term210720.getClass(), "type", 42);
        term211185 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term211185, term211185.getClass(), "currentTraversal", null);
        term211186 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term211186, term211186.getClass(), "functionName", null);
        setBooleanField(term211186, term211186.getClass(), "itsNeedsActivation", false);
        setIntField(term211186, term211186.getClass(), "itsFunctionType", 0);
        setBooleanField(term211186, term211186.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term211186, term211186.getClass(), "encodedSourceStart", 0);
        setIntField(term211186, term211186.getClass(), "encodedSourceEnd", 0);
        setField(term211186, term211186.getClass(), "sourceName", null);
        setIntField(term211186, term211186.getClass(), "baseLineno", 0);
        setIntField(term211186, term211186.getClass(), "endLineno", 0);
        setField(term211186, term211186.getClass(), "functions", null);
        setField(term211186, term211186.getClass(), "regexps", null);
        setField(term211186, term211186.getClass(), "itsVariables", null);
        setField(term211186, term211186.getClass(), "itsConst", null);
        setField(term211186, term211186.getClass(), "itsVariableNames", null);
        setIntField(term211186, term211186.getClass(), "varStart", 0);
        setField(term211186, term211186.getClass(), "compilerData", null);
        setIntField(term211186, term211186.getClass(), "type", 42);
        setField(term211186, term211186.getClass(), "next", null);
        setField(term211186, term211186.getClass(), "first", null);
        setField(term211186, term211186.getClass(), "last", null);
        setField(term211186, term211186.getClass(), "propListHead", null);
        setIntField(term211186, term211186.getClass(), "sourcePosition", 0);
        setField(term211186, term211186.getClass(), "jsType", null);
        setField(term211186, term211186.getClass(), "parent", null);
        term211187 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term211187, term211187.getClass(), "functionName", null);
        setBooleanField(term211187, term211187.getClass(), "itsNeedsActivation", false);
        setIntField(term211187, term211187.getClass(), "itsFunctionType", 0);
        setBooleanField(term211187, term211187.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term211187, term211187.getClass(), "encodedSourceStart", 0);
        setIntField(term211187, term211187.getClass(), "encodedSourceEnd", 0);
        setField(term211187, term211187.getClass(), "sourceName", null);
        setIntField(term211187, term211187.getClass(), "baseLineno", 0);
        setIntField(term211187, term211187.getClass(), "endLineno", 0);
        setField(term211187, term211187.getClass(), "functions", null);
        setField(term211187, term211187.getClass(), "regexps", null);
        setField(term211187, term211187.getClass(), "itsVariables", null);
        setField(term211187, term211187.getClass(), "itsConst", null);
        setField(term211187, term211187.getClass(), "itsVariableNames", null);
        setIntField(term211187, term211187.getClass(), "varStart", 0);
        setField(term211187, term211187.getClass(), "compilerData", null);
        setIntField(term211187, term211187.getClass(), "type", 16);
        setField(term211187, term211187.getClass(), "next", null);
        setField(term211187, term211187.getClass(), "first", null);
        setField(term211187, term211187.getClass(), "last", null);
        setField(term211187, term211187.getClass(), "propListHead", null);
        setIntField(term211187, term211187.getClass(), "sourcePosition", 0);
        setField(term211187, term211187.getClass(), "jsType", null);
        setField(term211187, term211187.getClass(), "parent", null);
        term211188 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term211188, term211188.getClass(), "functionName", null);
        setBooleanField(term211188, term211188.getClass(), "itsNeedsActivation", false);
        setIntField(term211188, term211188.getClass(), "itsFunctionType", 0);
        setBooleanField(term211188, term211188.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term211188, term211188.getClass(), "encodedSourceStart", 0);
        setIntField(term211188, term211188.getClass(), "encodedSourceEnd", 0);
        setField(term211188, term211188.getClass(), "sourceName", null);
        setIntField(term211188, term211188.getClass(), "baseLineno", 0);
        setIntField(term211188, term211188.getClass(), "endLineno", 0);
        setField(term211188, term211188.getClass(), "functions", null);
        setField(term211188, term211188.getClass(), "regexps", null);
        setField(term211188, term211188.getClass(), "itsVariables", null);
        setField(term211188, term211188.getClass(), "itsConst", null);
        setField(term211188, term211188.getClass(), "itsVariableNames", null);
        setIntField(term211188, term211188.getClass(), "varStart", 0);
        setField(term211188, term211188.getClass(), "compilerData", null);
        setIntField(term211188, term211188.getClass(), "type", 42);
        setField(term211188, term211188.getClass(), "next", null);
        setField(term211188, term211188.getClass(), "first", null);
        setField(term211188, term211188.getClass(), "last", null);
        setField(term211188, term211188.getClass(), "propListHead", null);
        setIntField(term211188, term211188.getClass(), "sourcePosition", 0);
        setField(term211188, term211188.getClass(), "jsType", null);
        setField(term211188, term211188.getClass(), "parent", null);
        term211149 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term211149, term211149.getClass(), "functionName", null);
        setBooleanField(term211149, term211149.getClass(), "itsNeedsActivation", false);
        setIntField(term211149, term211149.getClass(), "itsFunctionType", 0);
        setBooleanField(term211149, term211149.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term211149, term211149.getClass(), "encodedSourceStart", 0);
        setIntField(term211149, term211149.getClass(), "encodedSourceEnd", 0);
        setField(term211149, term211149.getClass(), "sourceName", null);
        setIntField(term211149, term211149.getClass(), "baseLineno", 0);
        setIntField(term211149, term211149.getClass(), "endLineno", 0);
        setField(term211149, term211149.getClass(), "functions", null);
        setField(term211149, term211149.getClass(), "regexps", null);
        setField(term211149, term211149.getClass(), "itsVariables", null);
        setField(term211149, term211149.getClass(), "itsConst", null);
        setField(term211149, term211149.getClass(), "itsVariableNames", null);
        setIntField(term211149, term211149.getClass(), "varStart", 0);
        setField(term211149, term211149.getClass(), "compilerData", null);
        setIntField(term211149, term211149.getClass(), "type", 16);
        setField(term211149, term211149.getClass(), "next", null);
        setField(term211149, term211149.getClass(), "first", null);
        setField(term211149, term211149.getClass(), "last", null);
        setField(term211149, term211149.getClass(), "propListHead", null);
        setIntField(term211149, term211149.getClass(), "sourcePosition", 0);
        setField(term211149, term211149.getClass(), "jsType", null);
        setField(term211149, term211149.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term210548;
        args[1] = term210634;
        args[2] = term210720;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term210462, args);
        assertTrue(recursiveEquals(term210462, term211185));
        assertTrue(recursiveEquals(term210548, term211186));
        assertTrue(recursiveEquals(term210634, term211187));
        assertTrue(recursiveEquals(term210720, term211188));
        assertTrue(recursiveEquals(retValue, term211149));
    }

};


