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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93207;
     Object term93293;
     Object term93581;
     Object term93582;
     Object term93522;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93207 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term93293 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93379 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93379, term93379.getClass(), "next", term93449);
        setField(term93293, term93293.getClass(), "first", term93379);
        setIntField(term93293, term93293.getClass(), "type", 23);
        term93581 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term93581, term93581.getClass(), "currentTraversal", null);
        term93582 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93583 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93582, term93582.getClass(), "functionName", null);
        setBooleanField(term93582, term93582.getClass(), "itsNeedsActivation", false);
        setIntField(term93582, term93582.getClass(), "itsFunctionType", 0);
        setBooleanField(term93582, term93582.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93582, term93582.getClass(), "encodedSourceStart", 0);
        setIntField(term93582, term93582.getClass(), "encodedSourceEnd", 0);
        setField(term93582, term93582.getClass(), "sourceName", null);
        setIntField(term93582, term93582.getClass(), "baseLineno", 0);
        setIntField(term93582, term93582.getClass(), "endLineno", 0);
        setField(term93582, term93582.getClass(), "functions", null);
        setField(term93582, term93582.getClass(), "regexps", null);
        setField(term93582, term93582.getClass(), "itsVariables", null);
        setField(term93582, term93582.getClass(), "itsConst", null);
        setField(term93582, term93582.getClass(), "itsVariableNames", null);
        setIntField(term93582, term93582.getClass(), "varStart", 0);
        setField(term93582, term93582.getClass(), "compilerData", null);
        setIntField(term93582, term93582.getClass(), "type", 23);
        setField(term93582, term93582.getClass(), "next", null);
        setField(term93583, term93583.getClass(), "functionName", null);
        setBooleanField(term93583, term93583.getClass(), "itsNeedsActivation", false);
        setIntField(term93583, term93583.getClass(), "itsFunctionType", 0);
        setBooleanField(term93583, term93583.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93583, term93583.getClass(), "encodedSourceStart", 0);
        setIntField(term93583, term93583.getClass(), "encodedSourceEnd", 0);
        setField(term93583, term93583.getClass(), "sourceName", null);
        setIntField(term93583, term93583.getClass(), "baseLineno", 0);
        setIntField(term93583, term93583.getClass(), "endLineno", 0);
        setField(term93583, term93583.getClass(), "functions", null);
        setField(term93583, term93583.getClass(), "regexps", null);
        setField(term93583, term93583.getClass(), "itsVariables", null);
        setField(term93583, term93583.getClass(), "itsConst", null);
        setField(term93583, term93583.getClass(), "itsVariableNames", null);
        setIntField(term93583, term93583.getClass(), "varStart", 0);
        setField(term93583, term93583.getClass(), "compilerData", null);
        setIntField(term93583, term93583.getClass(), "type", 0);
        setIntField(term93584, term93584.getClass(), "type", 0);
        setField(term93584, term93584.getClass(), "next", null);
        setField(term93584, term93584.getClass(), "first", null);
        setField(term93584, term93584.getClass(), "last", null);
        setField(term93584, term93584.getClass(), "propListHead", null);
        setIntField(term93584, term93584.getClass(), "sourcePosition", 0);
        setField(term93584, term93584.getClass(), "jsType", null);
        setField(term93584, term93584.getClass(), "parent", null);
        setField(term93583, term93583.getClass(), "next", term93584);
        setField(term93583, term93583.getClass(), "first", null);
        setField(term93583, term93583.getClass(), "last", null);
        setField(term93583, term93583.getClass(), "propListHead", null);
        setIntField(term93583, term93583.getClass(), "sourcePosition", 0);
        setField(term93583, term93583.getClass(), "jsType", null);
        setField(term93583, term93583.getClass(), "parent", null);
        setField(term93582, term93582.getClass(), "first", term93583);
        setField(term93582, term93582.getClass(), "last", null);
        setField(term93582, term93582.getClass(), "propListHead", null);
        setIntField(term93582, term93582.getClass(), "sourcePosition", 0);
        setField(term93582, term93582.getClass(), "jsType", null);
        setField(term93582, term93582.getClass(), "parent", null);
        term93522 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93532 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term93542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93522, term93522.getClass(), "functionName", null);
        setBooleanField(term93522, term93522.getClass(), "itsNeedsActivation", false);
        setIntField(term93522, term93522.getClass(), "itsFunctionType", 0);
        setBooleanField(term93522, term93522.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93522, term93522.getClass(), "encodedSourceStart", 0);
        setIntField(term93522, term93522.getClass(), "encodedSourceEnd", 0);
        setField(term93522, term93522.getClass(), "sourceName", null);
        setIntField(term93522, term93522.getClass(), "baseLineno", 0);
        setIntField(term93522, term93522.getClass(), "endLineno", 0);
        setField(term93522, term93522.getClass(), "functions", null);
        setField(term93522, term93522.getClass(), "regexps", null);
        setField(term93522, term93522.getClass(), "itsVariables", null);
        setField(term93522, term93522.getClass(), "itsConst", null);
        setField(term93522, term93522.getClass(), "itsVariableNames", null);
        setIntField(term93522, term93522.getClass(), "varStart", 0);
        setField(term93522, term93522.getClass(), "compilerData", null);
        setIntField(term93522, term93522.getClass(), "type", 23);
        setField(term93522, term93522.getClass(), "next", null);
        setField(term93532, term93532.getClass(), "functionName", null);
        setBooleanField(term93532, term93532.getClass(), "itsNeedsActivation", false);
        setIntField(term93532, term93532.getClass(), "itsFunctionType", 0);
        setBooleanField(term93532, term93532.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term93532, term93532.getClass(), "encodedSourceStart", 0);
        setIntField(term93532, term93532.getClass(), "encodedSourceEnd", 0);
        setField(term93532, term93532.getClass(), "sourceName", null);
        setIntField(term93532, term93532.getClass(), "baseLineno", 0);
        setIntField(term93532, term93532.getClass(), "endLineno", 0);
        setField(term93532, term93532.getClass(), "functions", null);
        setField(term93532, term93532.getClass(), "regexps", null);
        setField(term93532, term93532.getClass(), "itsVariables", null);
        setField(term93532, term93532.getClass(), "itsConst", null);
        setField(term93532, term93532.getClass(), "itsVariableNames", null);
        setIntField(term93532, term93532.getClass(), "varStart", 0);
        setField(term93532, term93532.getClass(), "compilerData", null);
        setIntField(term93532, term93532.getClass(), "type", 0);
        setIntField(term93542, term93542.getClass(), "type", 0);
        setField(term93542, term93542.getClass(), "next", null);
        setField(term93542, term93542.getClass(), "first", null);
        setField(term93542, term93542.getClass(), "last", null);
        setField(term93542, term93542.getClass(), "propListHead", null);
        setIntField(term93542, term93542.getClass(), "sourcePosition", 0);
        setField(term93542, term93542.getClass(), "jsType", null);
        setField(term93542, term93542.getClass(), "parent", null);
        setField(term93532, term93532.getClass(), "next", term93542);
        setField(term93532, term93532.getClass(), "first", null);
        setField(term93532, term93532.getClass(), "last", null);
        setField(term93532, term93532.getClass(), "propListHead", null);
        setIntField(term93532, term93532.getClass(), "sourcePosition", 0);
        setField(term93532, term93532.getClass(), "jsType", null);
        setField(term93532, term93532.getClass(), "parent", null);
        setField(term93522, term93522.getClass(), "first", term93532);
        setField(term93522, term93522.getClass(), "last", null);
        setField(term93522, term93522.getClass(), "propListHead", null);
        setIntField(term93522, term93522.getClass(), "sourcePosition", 0);
        setField(term93522, term93522.getClass(), "jsType", null);
        setField(term93522, term93522.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term93293;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term93207, args);
        assertTrue(recursiveEquals(term93207, term93581));
        assertTrue(recursiveEquals(term93293, term93582));
        assertTrue(recursiveEquals(retValue, term93522));
    }

};


