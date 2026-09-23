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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144738;
     Object term144830;
     Object term145425;
     Object term145426;
     Object term145383;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144738 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term144830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144920 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term144830, term144830.getClass(), "first", term144830);
        setField(term144830, term144830.getClass(), "next", term144920);
        setIntField(term144830, term144830.getClass(), "type", 33);
        term145425 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term145425, term145425.getClass(), "currentTraversal", null);
        term145426 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term145427 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term145426, term145426.getClass(), "number", 0.0);
        setIntField(term145426, term145426.getClass(), "type", 33);
        setIntField(term145427, term145427.getClass(), "encodedSourceStart", 0);
        setIntField(term145427, term145427.getClass(), "encodedSourceEnd", 0);
        setField(term145427, term145427.getClass(), "sourceName", null);
        setIntField(term145427, term145427.getClass(), "baseLineno", 0);
        setIntField(term145427, term145427.getClass(), "endLineno", 0);
        setField(term145427, term145427.getClass(), "functions", null);
        setField(term145427, term145427.getClass(), "regexps", null);
        setField(term145427, term145427.getClass(), "itsVariables", null);
        setField(term145427, term145427.getClass(), "itsConst", null);
        setField(term145427, term145427.getClass(), "itsVariableNames", null);
        setIntField(term145427, term145427.getClass(), "varStart", 0);
        setField(term145427, term145427.getClass(), "compilerData", null);
        setIntField(term145427, term145427.getClass(), "type", 0);
        setField(term145427, term145427.getClass(), "next", null);
        setField(term145427, term145427.getClass(), "first", null);
        setField(term145427, term145427.getClass(), "last", null);
        setField(term145427, term145427.getClass(), "propListHead", null);
        setIntField(term145427, term145427.getClass(), "sourcePosition", 0);
        setField(term145427, term145427.getClass(), "jsType", null);
        setField(term145427, term145427.getClass(), "parent", null);
        setField(term145426, term145426.getClass(), "next", term145427);
        setField(term145426, term145426.getClass(), "first", term145426);
        setField(term145426, term145426.getClass(), "last", null);
        setField(term145426, term145426.getClass(), "propListHead", null);
        setIntField(term145426, term145426.getClass(), "sourcePosition", 0);
        setField(term145426, term145426.getClass(), "jsType", null);
        setField(term145426, term145426.getClass(), "parent", null);
        term145383 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term145386 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term145383, term145383.getClass(), "number", 0.0);
        setIntField(term145383, term145383.getClass(), "type", 33);
        setIntField(term145386, term145386.getClass(), "encodedSourceStart", 0);
        setIntField(term145386, term145386.getClass(), "encodedSourceEnd", 0);
        setField(term145386, term145386.getClass(), "sourceName", null);
        setIntField(term145386, term145386.getClass(), "baseLineno", 0);
        setIntField(term145386, term145386.getClass(), "endLineno", 0);
        setField(term145386, term145386.getClass(), "functions", null);
        setField(term145386, term145386.getClass(), "regexps", null);
        setField(term145386, term145386.getClass(), "itsVariables", null);
        setField(term145386, term145386.getClass(), "itsConst", null);
        setField(term145386, term145386.getClass(), "itsVariableNames", null);
        setIntField(term145386, term145386.getClass(), "varStart", 0);
        setField(term145386, term145386.getClass(), "compilerData", null);
        setIntField(term145386, term145386.getClass(), "type", 0);
        setField(term145386, term145386.getClass(), "next", null);
        setField(term145386, term145386.getClass(), "first", null);
        setField(term145386, term145386.getClass(), "last", null);
        setField(term145386, term145386.getClass(), "propListHead", null);
        setIntField(term145386, term145386.getClass(), "sourcePosition", 0);
        setField(term145386, term145386.getClass(), "jsType", null);
        setField(term145386, term145386.getClass(), "parent", null);
        setField(term145383, term145383.getClass(), "next", term145386);
        setField(term145383, term145383.getClass(), "first", term145383);
        setField(term145383, term145383.getClass(), "last", null);
        setField(term145383, term145383.getClass(), "propListHead", null);
        setIntField(term145383, term145383.getClass(), "sourcePosition", 0);
        setField(term145383, term145383.getClass(), "jsType", null);
        setField(term145383, term145383.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term144830;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term144738, args);
        assertTrue(recursiveEquals(term144738, term145425));
        assertTrue(recursiveEquals(term144830, term145426));
        assertTrue(recursiveEquals(retValue, term145383));
    }

};


