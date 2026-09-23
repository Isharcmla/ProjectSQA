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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208298;
     Object term208384;
     Object term217244;
     Object term217245;
     Object term217178;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208298 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term208384 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208470 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term208470, term208470.getClass(), "next", term208540);
        setField(term208384, term208384.getClass(), "first", term208470);
        setIntField(term208384, term208384.getClass(), "type", 17);
        term217244 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term217244, term217244.getClass(), "currentTraversal", null);
        term217245 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term217246 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term217247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term217245, term217245.getClass(), "functionName", null);
        setBooleanField(term217245, term217245.getClass(), "itsNeedsActivation", false);
        setIntField(term217245, term217245.getClass(), "itsFunctionType", 0);
        setBooleanField(term217245, term217245.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term217245, term217245.getClass(), "encodedSourceStart", 0);
        setIntField(term217245, term217245.getClass(), "encodedSourceEnd", 0);
        setField(term217245, term217245.getClass(), "sourceName", null);
        setIntField(term217245, term217245.getClass(), "baseLineno", 0);
        setIntField(term217245, term217245.getClass(), "endLineno", 0);
        setField(term217245, term217245.getClass(), "functions", null);
        setField(term217245, term217245.getClass(), "regexps", null);
        setField(term217245, term217245.getClass(), "itsVariables", null);
        setField(term217245, term217245.getClass(), "itsConst", null);
        setField(term217245, term217245.getClass(), "itsVariableNames", null);
        setIntField(term217245, term217245.getClass(), "varStart", 0);
        setField(term217245, term217245.getClass(), "compilerData", null);
        setIntField(term217245, term217245.getClass(), "type", 17);
        setField(term217245, term217245.getClass(), "next", null);
        setField(term217246, term217246.getClass(), "functionName", null);
        setBooleanField(term217246, term217246.getClass(), "itsNeedsActivation", false);
        setIntField(term217246, term217246.getClass(), "itsFunctionType", 0);
        setBooleanField(term217246, term217246.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term217246, term217246.getClass(), "encodedSourceStart", 0);
        setIntField(term217246, term217246.getClass(), "encodedSourceEnd", 0);
        setField(term217246, term217246.getClass(), "sourceName", null);
        setIntField(term217246, term217246.getClass(), "baseLineno", 0);
        setIntField(term217246, term217246.getClass(), "endLineno", 0);
        setField(term217246, term217246.getClass(), "functions", null);
        setField(term217246, term217246.getClass(), "regexps", null);
        setField(term217246, term217246.getClass(), "itsVariables", null);
        setField(term217246, term217246.getClass(), "itsConst", null);
        setField(term217246, term217246.getClass(), "itsVariableNames", null);
        setIntField(term217246, term217246.getClass(), "varStart", 0);
        setField(term217246, term217246.getClass(), "compilerData", null);
        setIntField(term217246, term217246.getClass(), "type", 0);
        setIntField(term217247, term217247.getClass(), "type", 0);
        setField(term217247, term217247.getClass(), "next", null);
        setField(term217247, term217247.getClass(), "first", null);
        setField(term217247, term217247.getClass(), "last", null);
        setField(term217247, term217247.getClass(), "propListHead", null);
        setIntField(term217247, term217247.getClass(), "sourcePosition", 0);
        setField(term217247, term217247.getClass(), "jsType", null);
        setField(term217247, term217247.getClass(), "parent", null);
        setField(term217246, term217246.getClass(), "next", term217247);
        setField(term217246, term217246.getClass(), "first", null);
        setField(term217246, term217246.getClass(), "last", null);
        setField(term217246, term217246.getClass(), "propListHead", null);
        setIntField(term217246, term217246.getClass(), "sourcePosition", 0);
        setField(term217246, term217246.getClass(), "jsType", null);
        setField(term217246, term217246.getClass(), "parent", null);
        setField(term217245, term217245.getClass(), "first", term217246);
        setField(term217245, term217245.getClass(), "last", null);
        setField(term217245, term217245.getClass(), "propListHead", null);
        setIntField(term217245, term217245.getClass(), "sourcePosition", 0);
        setField(term217245, term217245.getClass(), "jsType", null);
        setField(term217245, term217245.getClass(), "parent", null);
        term217178 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term217188 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term217198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term217178, term217178.getClass(), "functionName", null);
        setBooleanField(term217178, term217178.getClass(), "itsNeedsActivation", false);
        setIntField(term217178, term217178.getClass(), "itsFunctionType", 0);
        setBooleanField(term217178, term217178.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term217178, term217178.getClass(), "encodedSourceStart", 0);
        setIntField(term217178, term217178.getClass(), "encodedSourceEnd", 0);
        setField(term217178, term217178.getClass(), "sourceName", null);
        setIntField(term217178, term217178.getClass(), "baseLineno", 0);
        setIntField(term217178, term217178.getClass(), "endLineno", 0);
        setField(term217178, term217178.getClass(), "functions", null);
        setField(term217178, term217178.getClass(), "regexps", null);
        setField(term217178, term217178.getClass(), "itsVariables", null);
        setField(term217178, term217178.getClass(), "itsConst", null);
        setField(term217178, term217178.getClass(), "itsVariableNames", null);
        setIntField(term217178, term217178.getClass(), "varStart", 0);
        setField(term217178, term217178.getClass(), "compilerData", null);
        setIntField(term217178, term217178.getClass(), "type", 17);
        setField(term217178, term217178.getClass(), "next", null);
        setField(term217188, term217188.getClass(), "functionName", null);
        setBooleanField(term217188, term217188.getClass(), "itsNeedsActivation", false);
        setIntField(term217188, term217188.getClass(), "itsFunctionType", 0);
        setBooleanField(term217188, term217188.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term217188, term217188.getClass(), "encodedSourceStart", 0);
        setIntField(term217188, term217188.getClass(), "encodedSourceEnd", 0);
        setField(term217188, term217188.getClass(), "sourceName", null);
        setIntField(term217188, term217188.getClass(), "baseLineno", 0);
        setIntField(term217188, term217188.getClass(), "endLineno", 0);
        setField(term217188, term217188.getClass(), "functions", null);
        setField(term217188, term217188.getClass(), "regexps", null);
        setField(term217188, term217188.getClass(), "itsVariables", null);
        setField(term217188, term217188.getClass(), "itsConst", null);
        setField(term217188, term217188.getClass(), "itsVariableNames", null);
        setIntField(term217188, term217188.getClass(), "varStart", 0);
        setField(term217188, term217188.getClass(), "compilerData", null);
        setIntField(term217188, term217188.getClass(), "type", 0);
        setIntField(term217198, term217198.getClass(), "type", 0);
        setField(term217198, term217198.getClass(), "next", null);
        setField(term217198, term217198.getClass(), "first", null);
        setField(term217198, term217198.getClass(), "last", null);
        setField(term217198, term217198.getClass(), "propListHead", null);
        setIntField(term217198, term217198.getClass(), "sourcePosition", 0);
        setField(term217198, term217198.getClass(), "jsType", null);
        setField(term217198, term217198.getClass(), "parent", null);
        setField(term217188, term217188.getClass(), "next", term217198);
        setField(term217188, term217188.getClass(), "first", null);
        setField(term217188, term217188.getClass(), "last", null);
        setField(term217188, term217188.getClass(), "propListHead", null);
        setIntField(term217188, term217188.getClass(), "sourcePosition", 0);
        setField(term217188, term217188.getClass(), "jsType", null);
        setField(term217188, term217188.getClass(), "parent", null);
        setField(term217178, term217178.getClass(), "first", term217188);
        setField(term217178, term217178.getClass(), "last", null);
        setField(term217178, term217178.getClass(), "propListHead", null);
        setIntField(term217178, term217178.getClass(), "sourcePosition", 0);
        setField(term217178, term217178.getClass(), "jsType", null);
        setField(term217178, term217178.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term208384;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term208298, args);
        assertTrue(recursiveEquals(term208298, term217244));
        assertTrue(recursiveEquals(term208384, term217245));
        assertTrue(recursiveEquals(retValue, term217178));
    }

};


