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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38520;
     Object term38606;
     Object term39068;
     Object term39069;
     Object term39013;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38520 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term38606 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term38692 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term38606, term38606.getClass(), "type", 37);
        setField(term38606, term38606.getClass(), "first", term38692);
        term39068 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term39068, term39068.getClass(), "currentTraversal", null);
        term39069 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term39070 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term39069, term39069.getClass(), "functionName", null);
        setBooleanField(term39069, term39069.getClass(), "itsNeedsActivation", false);
        setIntField(term39069, term39069.getClass(), "itsFunctionType", 0);
        setBooleanField(term39069, term39069.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term39069, term39069.getClass(), "encodedSourceStart", 0);
        setIntField(term39069, term39069.getClass(), "encodedSourceEnd", 0);
        setField(term39069, term39069.getClass(), "sourceName", null);
        setIntField(term39069, term39069.getClass(), "baseLineno", 0);
        setIntField(term39069, term39069.getClass(), "endLineno", 0);
        setField(term39069, term39069.getClass(), "functions", null);
        setField(term39069, term39069.getClass(), "regexps", null);
        setField(term39069, term39069.getClass(), "itsVariables", null);
        setField(term39069, term39069.getClass(), "itsConst", null);
        setField(term39069, term39069.getClass(), "itsVariableNames", null);
        setIntField(term39069, term39069.getClass(), "varStart", 0);
        setField(term39069, term39069.getClass(), "compilerData", null);
        setIntField(term39069, term39069.getClass(), "type", 37);
        setField(term39069, term39069.getClass(), "next", null);
        setField(term39070, term39070.getClass(), "functionName", null);
        setBooleanField(term39070, term39070.getClass(), "itsNeedsActivation", false);
        setIntField(term39070, term39070.getClass(), "itsFunctionType", 0);
        setBooleanField(term39070, term39070.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term39070, term39070.getClass(), "encodedSourceStart", 0);
        setIntField(term39070, term39070.getClass(), "encodedSourceEnd", 0);
        setField(term39070, term39070.getClass(), "sourceName", null);
        setIntField(term39070, term39070.getClass(), "baseLineno", 0);
        setIntField(term39070, term39070.getClass(), "endLineno", 0);
        setField(term39070, term39070.getClass(), "functions", null);
        setField(term39070, term39070.getClass(), "regexps", null);
        setField(term39070, term39070.getClass(), "itsVariables", null);
        setField(term39070, term39070.getClass(), "itsConst", null);
        setField(term39070, term39070.getClass(), "itsVariableNames", null);
        setIntField(term39070, term39070.getClass(), "varStart", 0);
        setField(term39070, term39070.getClass(), "compilerData", null);
        setIntField(term39070, term39070.getClass(), "type", 0);
        setField(term39070, term39070.getClass(), "next", null);
        setField(term39070, term39070.getClass(), "first", null);
        setField(term39070, term39070.getClass(), "last", null);
        setField(term39070, term39070.getClass(), "propListHead", null);
        setIntField(term39070, term39070.getClass(), "sourcePosition", 0);
        setField(term39070, term39070.getClass(), "jsType", null);
        setField(term39070, term39070.getClass(), "parent", null);
        setField(term39069, term39069.getClass(), "first", term39070);
        setField(term39069, term39069.getClass(), "last", null);
        setField(term39069, term39069.getClass(), "propListHead", null);
        setIntField(term39069, term39069.getClass(), "sourcePosition", 0);
        setField(term39069, term39069.getClass(), "jsType", null);
        setField(term39069, term39069.getClass(), "parent", null);
        term39013 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term39023 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term39013, term39013.getClass(), "functionName", null);
        setBooleanField(term39013, term39013.getClass(), "itsNeedsActivation", false);
        setIntField(term39013, term39013.getClass(), "itsFunctionType", 0);
        setBooleanField(term39013, term39013.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term39013, term39013.getClass(), "encodedSourceStart", 0);
        setIntField(term39013, term39013.getClass(), "encodedSourceEnd", 0);
        setField(term39013, term39013.getClass(), "sourceName", null);
        setIntField(term39013, term39013.getClass(), "baseLineno", 0);
        setIntField(term39013, term39013.getClass(), "endLineno", 0);
        setField(term39013, term39013.getClass(), "functions", null);
        setField(term39013, term39013.getClass(), "regexps", null);
        setField(term39013, term39013.getClass(), "itsVariables", null);
        setField(term39013, term39013.getClass(), "itsConst", null);
        setField(term39013, term39013.getClass(), "itsVariableNames", null);
        setIntField(term39013, term39013.getClass(), "varStart", 0);
        setField(term39013, term39013.getClass(), "compilerData", null);
        setIntField(term39013, term39013.getClass(), "type", 37);
        setField(term39013, term39013.getClass(), "next", null);
        setField(term39023, term39023.getClass(), "functionName", null);
        setBooleanField(term39023, term39023.getClass(), "itsNeedsActivation", false);
        setIntField(term39023, term39023.getClass(), "itsFunctionType", 0);
        setBooleanField(term39023, term39023.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term39023, term39023.getClass(), "encodedSourceStart", 0);
        setIntField(term39023, term39023.getClass(), "encodedSourceEnd", 0);
        setField(term39023, term39023.getClass(), "sourceName", null);
        setIntField(term39023, term39023.getClass(), "baseLineno", 0);
        setIntField(term39023, term39023.getClass(), "endLineno", 0);
        setField(term39023, term39023.getClass(), "functions", null);
        setField(term39023, term39023.getClass(), "regexps", null);
        setField(term39023, term39023.getClass(), "itsVariables", null);
        setField(term39023, term39023.getClass(), "itsConst", null);
        setField(term39023, term39023.getClass(), "itsVariableNames", null);
        setIntField(term39023, term39023.getClass(), "varStart", 0);
        setField(term39023, term39023.getClass(), "compilerData", null);
        setIntField(term39023, term39023.getClass(), "type", 0);
        setField(term39023, term39023.getClass(), "next", null);
        setField(term39023, term39023.getClass(), "first", null);
        setField(term39023, term39023.getClass(), "last", null);
        setField(term39023, term39023.getClass(), "propListHead", null);
        setIntField(term39023, term39023.getClass(), "sourcePosition", 0);
        setField(term39023, term39023.getClass(), "jsType", null);
        setField(term39023, term39023.getClass(), "parent", null);
        setField(term39013, term39013.getClass(), "first", term39023);
        setField(term39013, term39013.getClass(), "last", null);
        setField(term39013, term39013.getClass(), "propListHead", null);
        setIntField(term39013, term39013.getClass(), "sourcePosition", 0);
        setField(term39013, term39013.getClass(), "jsType", null);
        setField(term39013, term39013.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38606;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term38520, args);
        assertTrue(recursiveEquals(term38520, term39068));
        assertTrue(recursiveEquals(term38606, term39069));
        assertTrue(recursiveEquals(retValue, term39013));
    }

};


