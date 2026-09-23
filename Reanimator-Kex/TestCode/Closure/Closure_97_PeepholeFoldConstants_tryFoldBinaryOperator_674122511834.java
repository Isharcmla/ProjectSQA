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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239021;
     Object term239107;
     Object term239246;
     Object term239247;
     Object term239192;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239021 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term239107 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term239107, term239107.getClass(), "first", term239107);
        setField(term239107, term239107.getClass(), "next", term239177);
        setIntField(term239107, term239107.getClass(), "type", 14);
        term239246 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term239246, term239246.getClass(), "currentTraversal", null);
        term239247 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term239247, term239247.getClass(), "functionName", null);
        setBooleanField(term239247, term239247.getClass(), "itsNeedsActivation", false);
        setIntField(term239247, term239247.getClass(), "itsFunctionType", 0);
        setBooleanField(term239247, term239247.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term239247, term239247.getClass(), "encodedSourceStart", 0);
        setIntField(term239247, term239247.getClass(), "encodedSourceEnd", 0);
        setField(term239247, term239247.getClass(), "sourceName", null);
        setIntField(term239247, term239247.getClass(), "baseLineno", 0);
        setIntField(term239247, term239247.getClass(), "endLineno", 0);
        setField(term239247, term239247.getClass(), "functions", null);
        setField(term239247, term239247.getClass(), "regexps", null);
        setField(term239247, term239247.getClass(), "itsVariables", null);
        setField(term239247, term239247.getClass(), "itsConst", null);
        setField(term239247, term239247.getClass(), "itsVariableNames", null);
        setIntField(term239247, term239247.getClass(), "varStart", 0);
        setField(term239247, term239247.getClass(), "compilerData", null);
        setIntField(term239247, term239247.getClass(), "type", 14);
        setIntField(term239248, term239248.getClass(), "type", 0);
        setField(term239248, term239248.getClass(), "next", null);
        setField(term239248, term239248.getClass(), "first", null);
        setField(term239248, term239248.getClass(), "last", null);
        setField(term239248, term239248.getClass(), "propListHead", null);
        setIntField(term239248, term239248.getClass(), "sourcePosition", 0);
        setField(term239248, term239248.getClass(), "jsType", null);
        setField(term239248, term239248.getClass(), "parent", null);
        setField(term239247, term239247.getClass(), "next", term239248);
        setField(term239247, term239247.getClass(), "first", term239247);
        setField(term239247, term239247.getClass(), "last", null);
        setField(term239247, term239247.getClass(), "propListHead", null);
        setIntField(term239247, term239247.getClass(), "sourcePosition", 0);
        setField(term239247, term239247.getClass(), "jsType", null);
        setField(term239247, term239247.getClass(), "parent", null);
        term239192 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term239202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term239192, term239192.getClass(), "functionName", null);
        setBooleanField(term239192, term239192.getClass(), "itsNeedsActivation", false);
        setIntField(term239192, term239192.getClass(), "itsFunctionType", 0);
        setBooleanField(term239192, term239192.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term239192, term239192.getClass(), "encodedSourceStart", 0);
        setIntField(term239192, term239192.getClass(), "encodedSourceEnd", 0);
        setField(term239192, term239192.getClass(), "sourceName", null);
        setIntField(term239192, term239192.getClass(), "baseLineno", 0);
        setIntField(term239192, term239192.getClass(), "endLineno", 0);
        setField(term239192, term239192.getClass(), "functions", null);
        setField(term239192, term239192.getClass(), "regexps", null);
        setField(term239192, term239192.getClass(), "itsVariables", null);
        setField(term239192, term239192.getClass(), "itsConst", null);
        setField(term239192, term239192.getClass(), "itsVariableNames", null);
        setIntField(term239192, term239192.getClass(), "varStart", 0);
        setField(term239192, term239192.getClass(), "compilerData", null);
        setIntField(term239192, term239192.getClass(), "type", 14);
        setIntField(term239202, term239202.getClass(), "type", 0);
        setField(term239202, term239202.getClass(), "next", null);
        setField(term239202, term239202.getClass(), "first", null);
        setField(term239202, term239202.getClass(), "last", null);
        setField(term239202, term239202.getClass(), "propListHead", null);
        setIntField(term239202, term239202.getClass(), "sourcePosition", 0);
        setField(term239202, term239202.getClass(), "jsType", null);
        setField(term239202, term239202.getClass(), "parent", null);
        setField(term239192, term239192.getClass(), "next", term239202);
        setField(term239192, term239192.getClass(), "first", term239192);
        setField(term239192, term239192.getClass(), "last", null);
        setField(term239192, term239192.getClass(), "propListHead", null);
        setIntField(term239192, term239192.getClass(), "sourcePosition", 0);
        setField(term239192, term239192.getClass(), "jsType", null);
        setField(term239192, term239192.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term239107;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term239021, args);
        assertTrue(recursiveEquals(term239021, term239246));
        assertTrue(recursiveEquals(term239107, term239247));
        assertTrue(recursiveEquals(retValue, term239192));
    }

};


