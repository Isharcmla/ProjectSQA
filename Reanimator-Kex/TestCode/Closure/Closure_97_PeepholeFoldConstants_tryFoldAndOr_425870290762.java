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

public class PeepholeFoldConstants_tryFoldAndOr_425870290762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218518;
     Object term218604;
     Object term218696;
     Object term218788;
     Object term218906;
     Object term218907;
     Object term218908;
     Object term218909;
     Object term218859;

    public PeepholeFoldConstants_tryFoldAndOr_425870290762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218518 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term218604 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term218604, term218604.getClass(), "parent", null);
        setIntField(term218604, term218604.getClass(), "type", 0);
        term218696 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term218696, term218696.getClass(), "type", 0);
        term218788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term218906 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term218906, term218906.getClass(), "currentTraversal", null);
        term218907 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term218907, term218907.getClass(), "functionName", null);
        setBooleanField(term218907, term218907.getClass(), "itsNeedsActivation", false);
        setIntField(term218907, term218907.getClass(), "itsFunctionType", 0);
        setBooleanField(term218907, term218907.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term218907, term218907.getClass(), "encodedSourceStart", 0);
        setIntField(term218907, term218907.getClass(), "encodedSourceEnd", 0);
        setField(term218907, term218907.getClass(), "sourceName", null);
        setIntField(term218907, term218907.getClass(), "baseLineno", 0);
        setIntField(term218907, term218907.getClass(), "endLineno", 0);
        setField(term218907, term218907.getClass(), "functions", null);
        setField(term218907, term218907.getClass(), "regexps", null);
        setField(term218907, term218907.getClass(), "itsVariables", null);
        setField(term218907, term218907.getClass(), "itsConst", null);
        setField(term218907, term218907.getClass(), "itsVariableNames", null);
        setIntField(term218907, term218907.getClass(), "varStart", 0);
        setField(term218907, term218907.getClass(), "compilerData", null);
        setIntField(term218907, term218907.getClass(), "type", 0);
        setField(term218907, term218907.getClass(), "next", null);
        setField(term218907, term218907.getClass(), "first", null);
        setField(term218907, term218907.getClass(), "last", null);
        setField(term218907, term218907.getClass(), "propListHead", null);
        setIntField(term218907, term218907.getClass(), "sourcePosition", 0);
        setField(term218907, term218907.getClass(), "jsType", null);
        setField(term218907, term218907.getClass(), "parent", null);
        term218908 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term218908, term218908.getClass(), "number", 0.0);
        setIntField(term218908, term218908.getClass(), "type", 0);
        setField(term218908, term218908.getClass(), "next", null);
        setField(term218908, term218908.getClass(), "first", null);
        setField(term218908, term218908.getClass(), "last", null);
        setField(term218908, term218908.getClass(), "propListHead", null);
        setIntField(term218908, term218908.getClass(), "sourcePosition", 0);
        setField(term218908, term218908.getClass(), "jsType", null);
        setField(term218908, term218908.getClass(), "parent", null);
        term218909 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term218909, term218909.getClass(), "str", null);
        setIntField(term218909, term218909.getClass(), "type", 0);
        setField(term218909, term218909.getClass(), "next", null);
        setField(term218909, term218909.getClass(), "first", null);
        setField(term218909, term218909.getClass(), "last", null);
        setField(term218909, term218909.getClass(), "propListHead", null);
        setIntField(term218909, term218909.getClass(), "sourcePosition", 0);
        setField(term218909, term218909.getClass(), "jsType", null);
        setField(term218909, term218909.getClass(), "parent", null);
        term218859 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term218859, term218859.getClass(), "functionName", null);
        setBooleanField(term218859, term218859.getClass(), "itsNeedsActivation", false);
        setIntField(term218859, term218859.getClass(), "itsFunctionType", 0);
        setBooleanField(term218859, term218859.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term218859, term218859.getClass(), "encodedSourceStart", 0);
        setIntField(term218859, term218859.getClass(), "encodedSourceEnd", 0);
        setField(term218859, term218859.getClass(), "sourceName", null);
        setIntField(term218859, term218859.getClass(), "baseLineno", 0);
        setIntField(term218859, term218859.getClass(), "endLineno", 0);
        setField(term218859, term218859.getClass(), "functions", null);
        setField(term218859, term218859.getClass(), "regexps", null);
        setField(term218859, term218859.getClass(), "itsVariables", null);
        setField(term218859, term218859.getClass(), "itsConst", null);
        setField(term218859, term218859.getClass(), "itsVariableNames", null);
        setIntField(term218859, term218859.getClass(), "varStart", 0);
        setField(term218859, term218859.getClass(), "compilerData", null);
        setIntField(term218859, term218859.getClass(), "type", 0);
        setField(term218859, term218859.getClass(), "next", null);
        setField(term218859, term218859.getClass(), "first", null);
        setField(term218859, term218859.getClass(), "last", null);
        setField(term218859, term218859.getClass(), "propListHead", null);
        setIntField(term218859, term218859.getClass(), "sourcePosition", 0);
        setField(term218859, term218859.getClass(), "jsType", null);
        setField(term218859, term218859.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term218604;
        args[1] = term218696;
        args[2] = term218788;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term218518, args);
        assertTrue(recursiveEquals(term218518, term218906));
        assertTrue(recursiveEquals(term218604, term218907));
        assertTrue(recursiveEquals(term218696, term218908));
        assertTrue(recursiveEquals(term218788, term218909));
        assertTrue(recursiveEquals(retValue, term218859));
    }

};


