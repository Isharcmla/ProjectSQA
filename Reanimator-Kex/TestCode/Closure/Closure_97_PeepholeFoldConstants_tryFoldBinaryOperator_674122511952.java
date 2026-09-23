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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281879;
     Object term281965;
     Object term304278;
     Object term304279;
     Object term304241;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281879 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term281965 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term282035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term281965, term281965.getClass(), "first", term281965);
        setField(term281965, term281965.getClass(), "next", term282035);
        setIntField(term281965, term281965.getClass(), "type", 18);
        term304278 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term304278, term304278.getClass(), "currentTraversal", null);
        term304279 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term304279, term304279.getClass(), "functionName", null);
        setBooleanField(term304279, term304279.getClass(), "itsNeedsActivation", false);
        setIntField(term304279, term304279.getClass(), "itsFunctionType", 0);
        setBooleanField(term304279, term304279.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term304279, term304279.getClass(), "encodedSourceStart", 0);
        setIntField(term304279, term304279.getClass(), "encodedSourceEnd", 0);
        setField(term304279, term304279.getClass(), "sourceName", null);
        setIntField(term304279, term304279.getClass(), "baseLineno", 0);
        setIntField(term304279, term304279.getClass(), "endLineno", 0);
        setField(term304279, term304279.getClass(), "functions", null);
        setField(term304279, term304279.getClass(), "regexps", null);
        setField(term304279, term304279.getClass(), "itsVariables", null);
        setField(term304279, term304279.getClass(), "itsConst", null);
        setField(term304279, term304279.getClass(), "itsVariableNames", null);
        setIntField(term304279, term304279.getClass(), "varStart", 0);
        setField(term304279, term304279.getClass(), "compilerData", null);
        setIntField(term304279, term304279.getClass(), "type", 18);
        setIntField(term304280, term304280.getClass(), "type", 0);
        setField(term304280, term304280.getClass(), "next", null);
        setField(term304280, term304280.getClass(), "first", null);
        setField(term304280, term304280.getClass(), "last", null);
        setField(term304280, term304280.getClass(), "propListHead", null);
        setIntField(term304280, term304280.getClass(), "sourcePosition", 0);
        setField(term304280, term304280.getClass(), "jsType", null);
        setField(term304280, term304280.getClass(), "parent", null);
        setField(term304279, term304279.getClass(), "next", term304280);
        setField(term304279, term304279.getClass(), "first", term304279);
        setField(term304279, term304279.getClass(), "last", null);
        setField(term304279, term304279.getClass(), "propListHead", null);
        setIntField(term304279, term304279.getClass(), "sourcePosition", 0);
        setField(term304279, term304279.getClass(), "jsType", null);
        setField(term304279, term304279.getClass(), "parent", null);
        term304241 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term304241, term304241.getClass(), "functionName", null);
        setBooleanField(term304241, term304241.getClass(), "itsNeedsActivation", false);
        setIntField(term304241, term304241.getClass(), "itsFunctionType", 0);
        setBooleanField(term304241, term304241.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term304241, term304241.getClass(), "encodedSourceStart", 0);
        setIntField(term304241, term304241.getClass(), "encodedSourceEnd", 0);
        setField(term304241, term304241.getClass(), "sourceName", null);
        setIntField(term304241, term304241.getClass(), "baseLineno", 0);
        setIntField(term304241, term304241.getClass(), "endLineno", 0);
        setField(term304241, term304241.getClass(), "functions", null);
        setField(term304241, term304241.getClass(), "regexps", null);
        setField(term304241, term304241.getClass(), "itsVariables", null);
        setField(term304241, term304241.getClass(), "itsConst", null);
        setField(term304241, term304241.getClass(), "itsVariableNames", null);
        setIntField(term304241, term304241.getClass(), "varStart", 0);
        setField(term304241, term304241.getClass(), "compilerData", null);
        setIntField(term304241, term304241.getClass(), "type", 18);
        setIntField(term304251, term304251.getClass(), "type", 0);
        setField(term304251, term304251.getClass(), "next", null);
        setField(term304251, term304251.getClass(), "first", null);
        setField(term304251, term304251.getClass(), "last", null);
        setField(term304251, term304251.getClass(), "propListHead", null);
        setIntField(term304251, term304251.getClass(), "sourcePosition", 0);
        setField(term304251, term304251.getClass(), "jsType", null);
        setField(term304251, term304251.getClass(), "parent", null);
        setField(term304241, term304241.getClass(), "next", term304251);
        setField(term304241, term304241.getClass(), "first", term304241);
        setField(term304241, term304241.getClass(), "last", null);
        setField(term304241, term304241.getClass(), "propListHead", null);
        setIntField(term304241, term304241.getClass(), "sourcePosition", 0);
        setField(term304241, term304241.getClass(), "jsType", null);
        setField(term304241, term304241.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term281965;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term281879, args);
        assertTrue(recursiveEquals(term281879, term304278));
        assertTrue(recursiveEquals(term281965, term304279));
        assertTrue(recursiveEquals(retValue, term304241));
    }

};


