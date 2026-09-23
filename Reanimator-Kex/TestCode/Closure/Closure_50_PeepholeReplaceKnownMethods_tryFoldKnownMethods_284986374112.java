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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29029;
     Object term29115;
     Object term29419;
     Object term29420;
     Object term29381;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29029 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term29115 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term29115, term29115.getClass(), "first", null);
        setIntField(term29115, term29115.getClass(), "type", 37);
        term29419 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term29419, term29419.getClass(), "currentTraversal", null);
        term29420 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term29420, term29420.getClass(), "functionName", null);
        setBooleanField(term29420, term29420.getClass(), "itsNeedsActivation", false);
        setIntField(term29420, term29420.getClass(), "itsFunctionType", 0);
        setBooleanField(term29420, term29420.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term29420, term29420.getClass(), "encodedSourceStart", 0);
        setIntField(term29420, term29420.getClass(), "encodedSourceEnd", 0);
        setField(term29420, term29420.getClass(), "sourceName", null);
        setIntField(term29420, term29420.getClass(), "baseLineno", 0);
        setIntField(term29420, term29420.getClass(), "endLineno", 0);
        setField(term29420, term29420.getClass(), "functions", null);
        setField(term29420, term29420.getClass(), "regexps", null);
        setField(term29420, term29420.getClass(), "itsVariables", null);
        setField(term29420, term29420.getClass(), "itsConst", null);
        setField(term29420, term29420.getClass(), "itsVariableNames", null);
        setIntField(term29420, term29420.getClass(), "varStart", 0);
        setField(term29420, term29420.getClass(), "compilerData", null);
        setIntField(term29420, term29420.getClass(), "type", 37);
        setField(term29420, term29420.getClass(), "next", null);
        setField(term29420, term29420.getClass(), "first", null);
        setField(term29420, term29420.getClass(), "last", null);
        setField(term29420, term29420.getClass(), "propListHead", null);
        setIntField(term29420, term29420.getClass(), "sourcePosition", 0);
        setField(term29420, term29420.getClass(), "jsType", null);
        setField(term29420, term29420.getClass(), "parent", null);
        term29381 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term29381, term29381.getClass(), "functionName", null);
        setBooleanField(term29381, term29381.getClass(), "itsNeedsActivation", false);
        setIntField(term29381, term29381.getClass(), "itsFunctionType", 0);
        setBooleanField(term29381, term29381.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term29381, term29381.getClass(), "encodedSourceStart", 0);
        setIntField(term29381, term29381.getClass(), "encodedSourceEnd", 0);
        setField(term29381, term29381.getClass(), "sourceName", null);
        setIntField(term29381, term29381.getClass(), "baseLineno", 0);
        setIntField(term29381, term29381.getClass(), "endLineno", 0);
        setField(term29381, term29381.getClass(), "functions", null);
        setField(term29381, term29381.getClass(), "regexps", null);
        setField(term29381, term29381.getClass(), "itsVariables", null);
        setField(term29381, term29381.getClass(), "itsConst", null);
        setField(term29381, term29381.getClass(), "itsVariableNames", null);
        setIntField(term29381, term29381.getClass(), "varStart", 0);
        setField(term29381, term29381.getClass(), "compilerData", null);
        setIntField(term29381, term29381.getClass(), "type", 37);
        setField(term29381, term29381.getClass(), "next", null);
        setField(term29381, term29381.getClass(), "first", null);
        setField(term29381, term29381.getClass(), "last", null);
        setField(term29381, term29381.getClass(), "propListHead", null);
        setIntField(term29381, term29381.getClass(), "sourcePosition", 0);
        setField(term29381, term29381.getClass(), "jsType", null);
        setField(term29381, term29381.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29115;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term29029, args);
        assertTrue(recursiveEquals(term29029, term29419));
        assertTrue(recursiveEquals(term29115, term29420));
        assertTrue(recursiveEquals(retValue, term29381));
    }

};


