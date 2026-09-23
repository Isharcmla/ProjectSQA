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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231152;
     Object term231242;
     Object term231503;
     Object term231504;
     Object term231439;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231152 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term231242 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term231332 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term231422 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term231332, term231332.getClass(), "next", term231422);
        setIntField(term231332, term231332.getClass(), "type", 39);
        setField(term231242, term231242.getClass(), "first", term231332);
        setIntField(term231242, term231242.getClass(), "type", 23);
        term231503 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term231503, term231503.getClass(), "currentTraversal", null);
        term231504 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term231505 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term231506 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term231504, term231504.getClass(), "encodedSourceStart", 0);
        setIntField(term231504, term231504.getClass(), "encodedSourceEnd", 0);
        setField(term231504, term231504.getClass(), "sourceName", null);
        setIntField(term231504, term231504.getClass(), "baseLineno", 0);
        setIntField(term231504, term231504.getClass(), "endLineno", 0);
        setField(term231504, term231504.getClass(), "functions", null);
        setField(term231504, term231504.getClass(), "regexps", null);
        setField(term231504, term231504.getClass(), "itsVariables", null);
        setField(term231504, term231504.getClass(), "itsConst", null);
        setField(term231504, term231504.getClass(), "itsVariableNames", null);
        setIntField(term231504, term231504.getClass(), "varStart", 0);
        setField(term231504, term231504.getClass(), "compilerData", null);
        setIntField(term231504, term231504.getClass(), "type", 23);
        setField(term231504, term231504.getClass(), "next", null);
        setIntField(term231505, term231505.getClass(), "encodedSourceStart", 0);
        setIntField(term231505, term231505.getClass(), "encodedSourceEnd", 0);
        setField(term231505, term231505.getClass(), "sourceName", null);
        setIntField(term231505, term231505.getClass(), "baseLineno", 0);
        setIntField(term231505, term231505.getClass(), "endLineno", 0);
        setField(term231505, term231505.getClass(), "functions", null);
        setField(term231505, term231505.getClass(), "regexps", null);
        setField(term231505, term231505.getClass(), "itsVariables", null);
        setField(term231505, term231505.getClass(), "itsConst", null);
        setField(term231505, term231505.getClass(), "itsVariableNames", null);
        setIntField(term231505, term231505.getClass(), "varStart", 0);
        setField(term231505, term231505.getClass(), "compilerData", null);
        setIntField(term231505, term231505.getClass(), "type", 39);
        setIntField(term231506, term231506.getClass(), "encodedSourceStart", 0);
        setIntField(term231506, term231506.getClass(), "encodedSourceEnd", 0);
        setField(term231506, term231506.getClass(), "sourceName", null);
        setIntField(term231506, term231506.getClass(), "baseLineno", 0);
        setIntField(term231506, term231506.getClass(), "endLineno", 0);
        setField(term231506, term231506.getClass(), "functions", null);
        setField(term231506, term231506.getClass(), "regexps", null);
        setField(term231506, term231506.getClass(), "itsVariables", null);
        setField(term231506, term231506.getClass(), "itsConst", null);
        setField(term231506, term231506.getClass(), "itsVariableNames", null);
        setIntField(term231506, term231506.getClass(), "varStart", 0);
        setField(term231506, term231506.getClass(), "compilerData", null);
        setIntField(term231506, term231506.getClass(), "type", 0);
        setField(term231506, term231506.getClass(), "next", null);
        setField(term231506, term231506.getClass(), "first", null);
        setField(term231506, term231506.getClass(), "last", null);
        setField(term231506, term231506.getClass(), "propListHead", null);
        setIntField(term231506, term231506.getClass(), "sourcePosition", 0);
        setField(term231506, term231506.getClass(), "jsType", null);
        setField(term231506, term231506.getClass(), "parent", null);
        setField(term231505, term231505.getClass(), "next", term231506);
        setField(term231505, term231505.getClass(), "first", null);
        setField(term231505, term231505.getClass(), "last", null);
        setField(term231505, term231505.getClass(), "propListHead", null);
        setIntField(term231505, term231505.getClass(), "sourcePosition", 0);
        setField(term231505, term231505.getClass(), "jsType", null);
        setField(term231505, term231505.getClass(), "parent", null);
        setField(term231504, term231504.getClass(), "first", term231505);
        setField(term231504, term231504.getClass(), "last", null);
        setField(term231504, term231504.getClass(), "propListHead", null);
        setIntField(term231504, term231504.getClass(), "sourcePosition", 0);
        setField(term231504, term231504.getClass(), "jsType", null);
        setField(term231504, term231504.getClass(), "parent", null);
        term231439 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term231446 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term231453 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term231439, term231439.getClass(), "encodedSourceStart", 0);
        setIntField(term231439, term231439.getClass(), "encodedSourceEnd", 0);
        setField(term231439, term231439.getClass(), "sourceName", null);
        setIntField(term231439, term231439.getClass(), "baseLineno", 0);
        setIntField(term231439, term231439.getClass(), "endLineno", 0);
        setField(term231439, term231439.getClass(), "functions", null);
        setField(term231439, term231439.getClass(), "regexps", null);
        setField(term231439, term231439.getClass(), "itsVariables", null);
        setField(term231439, term231439.getClass(), "itsConst", null);
        setField(term231439, term231439.getClass(), "itsVariableNames", null);
        setIntField(term231439, term231439.getClass(), "varStart", 0);
        setField(term231439, term231439.getClass(), "compilerData", null);
        setIntField(term231439, term231439.getClass(), "type", 23);
        setField(term231439, term231439.getClass(), "next", null);
        setIntField(term231446, term231446.getClass(), "encodedSourceStart", 0);
        setIntField(term231446, term231446.getClass(), "encodedSourceEnd", 0);
        setField(term231446, term231446.getClass(), "sourceName", null);
        setIntField(term231446, term231446.getClass(), "baseLineno", 0);
        setIntField(term231446, term231446.getClass(), "endLineno", 0);
        setField(term231446, term231446.getClass(), "functions", null);
        setField(term231446, term231446.getClass(), "regexps", null);
        setField(term231446, term231446.getClass(), "itsVariables", null);
        setField(term231446, term231446.getClass(), "itsConst", null);
        setField(term231446, term231446.getClass(), "itsVariableNames", null);
        setIntField(term231446, term231446.getClass(), "varStart", 0);
        setField(term231446, term231446.getClass(), "compilerData", null);
        setIntField(term231446, term231446.getClass(), "type", 39);
        setIntField(term231453, term231453.getClass(), "encodedSourceStart", 0);
        setIntField(term231453, term231453.getClass(), "encodedSourceEnd", 0);
        setField(term231453, term231453.getClass(), "sourceName", null);
        setIntField(term231453, term231453.getClass(), "baseLineno", 0);
        setIntField(term231453, term231453.getClass(), "endLineno", 0);
        setField(term231453, term231453.getClass(), "functions", null);
        setField(term231453, term231453.getClass(), "regexps", null);
        setField(term231453, term231453.getClass(), "itsVariables", null);
        setField(term231453, term231453.getClass(), "itsConst", null);
        setField(term231453, term231453.getClass(), "itsVariableNames", null);
        setIntField(term231453, term231453.getClass(), "varStart", 0);
        setField(term231453, term231453.getClass(), "compilerData", null);
        setIntField(term231453, term231453.getClass(), "type", 0);
        setField(term231453, term231453.getClass(), "next", null);
        setField(term231453, term231453.getClass(), "first", null);
        setField(term231453, term231453.getClass(), "last", null);
        setField(term231453, term231453.getClass(), "propListHead", null);
        setIntField(term231453, term231453.getClass(), "sourcePosition", 0);
        setField(term231453, term231453.getClass(), "jsType", null);
        setField(term231453, term231453.getClass(), "parent", null);
        setField(term231446, term231446.getClass(), "next", term231453);
        setField(term231446, term231446.getClass(), "first", null);
        setField(term231446, term231446.getClass(), "last", null);
        setField(term231446, term231446.getClass(), "propListHead", null);
        setIntField(term231446, term231446.getClass(), "sourcePosition", 0);
        setField(term231446, term231446.getClass(), "jsType", null);
        setField(term231446, term231446.getClass(), "parent", null);
        setField(term231439, term231439.getClass(), "first", term231446);
        setField(term231439, term231439.getClass(), "last", null);
        setField(term231439, term231439.getClass(), "propListHead", null);
        setIntField(term231439, term231439.getClass(), "sourcePosition", 0);
        setField(term231439, term231439.getClass(), "jsType", null);
        setField(term231439, term231439.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term231242;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term231152, args);
        assertTrue(recursiveEquals(term231152, term231503));
        assertTrue(recursiveEquals(term231242, term231504));
        assertTrue(recursiveEquals(retValue, term231439));
    }

};


