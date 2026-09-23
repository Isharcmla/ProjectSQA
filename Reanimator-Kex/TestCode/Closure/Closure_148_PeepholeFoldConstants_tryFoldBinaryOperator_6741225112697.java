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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term772616;
     Object term772708;
     Object term773662;
     Object term773663;
     Object term773549;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term772616 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term772708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term772798 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term772890 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term772976 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term772890, term772890.getClass(), "type", 47);
        setField(term772798, term772798.getClass(), "next", term772890);
        setIntField(term772798, term772798.getClass(), "type", 0);
        setField(term772708, term772708.getClass(), "first", term772798);
        setIntField(term772708, term772708.getClass(), "type", 101);
        setField(term772708, term772708.getClass(), "parent", term772976);
        term773662 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term773662, term773662.getClass(), "currentTraversal", null);
        term773663 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term773664 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term773665 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term773666 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term773663, term773663.getClass(), "str", null);
        setIntField(term773663, term773663.getClass(), "type", 101);
        setField(term773663, term773663.getClass(), "next", null);
        setIntField(term773664, term773664.getClass(), "encodedSourceStart", 0);
        setIntField(term773664, term773664.getClass(), "encodedSourceEnd", 0);
        setField(term773664, term773664.getClass(), "sourceName", null);
        setIntField(term773664, term773664.getClass(), "baseLineno", 0);
        setIntField(term773664, term773664.getClass(), "endLineno", 0);
        setField(term773664, term773664.getClass(), "functions", null);
        setField(term773664, term773664.getClass(), "regexps", null);
        setField(term773664, term773664.getClass(), "itsVariables", null);
        setField(term773664, term773664.getClass(), "itsConst", null);
        setField(term773664, term773664.getClass(), "itsVariableNames", null);
        setIntField(term773664, term773664.getClass(), "varStart", 0);
        setField(term773664, term773664.getClass(), "compilerData", null);
        setIntField(term773664, term773664.getClass(), "type", 0);
        setDoubleField(term773665, term773665.getClass(), "number", 0.0);
        setIntField(term773665, term773665.getClass(), "type", 47);
        setField(term773665, term773665.getClass(), "next", null);
        setField(term773665, term773665.getClass(), "first", null);
        setField(term773665, term773665.getClass(), "last", null);
        setField(term773665, term773665.getClass(), "propListHead", null);
        setIntField(term773665, term773665.getClass(), "sourcePosition", 0);
        setField(term773665, term773665.getClass(), "jsType", null);
        setField(term773665, term773665.getClass(), "parent", null);
        setField(term773664, term773664.getClass(), "next", term773665);
        setField(term773664, term773664.getClass(), "first", null);
        setField(term773664, term773664.getClass(), "last", null);
        setField(term773664, term773664.getClass(), "propListHead", null);
        setIntField(term773664, term773664.getClass(), "sourcePosition", 0);
        setField(term773664, term773664.getClass(), "jsType", null);
        setField(term773664, term773664.getClass(), "parent", null);
        setField(term773663, term773663.getClass(), "first", term773664);
        setField(term773663, term773663.getClass(), "last", null);
        setField(term773663, term773663.getClass(), "propListHead", null);
        setIntField(term773663, term773663.getClass(), "sourcePosition", 0);
        setField(term773663, term773663.getClass(), "jsType", null);
        setField(term773666, term773666.getClass(), "functionName", null);
        setBooleanField(term773666, term773666.getClass(), "itsNeedsActivation", false);
        setIntField(term773666, term773666.getClass(), "itsFunctionType", 0);
        setBooleanField(term773666, term773666.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term773666, term773666.getClass(), "encodedSourceStart", 0);
        setIntField(term773666, term773666.getClass(), "encodedSourceEnd", 0);
        setField(term773666, term773666.getClass(), "sourceName", null);
        setIntField(term773666, term773666.getClass(), "baseLineno", 0);
        setIntField(term773666, term773666.getClass(), "endLineno", 0);
        setField(term773666, term773666.getClass(), "functions", null);
        setField(term773666, term773666.getClass(), "regexps", null);
        setField(term773666, term773666.getClass(), "itsVariables", null);
        setField(term773666, term773666.getClass(), "itsConst", null);
        setField(term773666, term773666.getClass(), "itsVariableNames", null);
        setIntField(term773666, term773666.getClass(), "varStart", 0);
        setField(term773666, term773666.getClass(), "compilerData", null);
        setIntField(term773666, term773666.getClass(), "type", 0);
        setField(term773666, term773666.getClass(), "next", null);
        setField(term773666, term773666.getClass(), "first", null);
        setField(term773666, term773666.getClass(), "last", null);
        setField(term773666, term773666.getClass(), "propListHead", null);
        setIntField(term773666, term773666.getClass(), "sourcePosition", 0);
        setField(term773666, term773666.getClass(), "jsType", null);
        setField(term773666, term773666.getClass(), "parent", null);
        setField(term773663, term773663.getClass(), "parent", term773666);
        term773549 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term773551 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term773558 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term773564 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term773549, term773549.getClass(), "str", null);
        setIntField(term773549, term773549.getClass(), "type", 101);
        setField(term773549, term773549.getClass(), "next", null);
        setIntField(term773551, term773551.getClass(), "encodedSourceStart", 0);
        setIntField(term773551, term773551.getClass(), "encodedSourceEnd", 0);
        setField(term773551, term773551.getClass(), "sourceName", null);
        setIntField(term773551, term773551.getClass(), "baseLineno", 0);
        setIntField(term773551, term773551.getClass(), "endLineno", 0);
        setField(term773551, term773551.getClass(), "functions", null);
        setField(term773551, term773551.getClass(), "regexps", null);
        setField(term773551, term773551.getClass(), "itsVariables", null);
        setField(term773551, term773551.getClass(), "itsConst", null);
        setField(term773551, term773551.getClass(), "itsVariableNames", null);
        setIntField(term773551, term773551.getClass(), "varStart", 0);
        setField(term773551, term773551.getClass(), "compilerData", null);
        setIntField(term773551, term773551.getClass(), "type", 0);
        setDoubleField(term773558, term773558.getClass(), "number", 0.0);
        setIntField(term773558, term773558.getClass(), "type", 47);
        setField(term773558, term773558.getClass(), "next", null);
        setField(term773558, term773558.getClass(), "first", null);
        setField(term773558, term773558.getClass(), "last", null);
        setField(term773558, term773558.getClass(), "propListHead", null);
        setIntField(term773558, term773558.getClass(), "sourcePosition", 0);
        setField(term773558, term773558.getClass(), "jsType", null);
        setField(term773558, term773558.getClass(), "parent", null);
        setField(term773551, term773551.getClass(), "next", term773558);
        setField(term773551, term773551.getClass(), "first", null);
        setField(term773551, term773551.getClass(), "last", null);
        setField(term773551, term773551.getClass(), "propListHead", null);
        setIntField(term773551, term773551.getClass(), "sourcePosition", 0);
        setField(term773551, term773551.getClass(), "jsType", null);
        setField(term773551, term773551.getClass(), "parent", null);
        setField(term773549, term773549.getClass(), "first", term773551);
        setField(term773549, term773549.getClass(), "last", null);
        setField(term773549, term773549.getClass(), "propListHead", null);
        setIntField(term773549, term773549.getClass(), "sourcePosition", 0);
        setField(term773549, term773549.getClass(), "jsType", null);
        setField(term773564, term773564.getClass(), "functionName", null);
        setBooleanField(term773564, term773564.getClass(), "itsNeedsActivation", false);
        setIntField(term773564, term773564.getClass(), "itsFunctionType", 0);
        setBooleanField(term773564, term773564.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term773564, term773564.getClass(), "encodedSourceStart", 0);
        setIntField(term773564, term773564.getClass(), "encodedSourceEnd", 0);
        setField(term773564, term773564.getClass(), "sourceName", null);
        setIntField(term773564, term773564.getClass(), "baseLineno", 0);
        setIntField(term773564, term773564.getClass(), "endLineno", 0);
        setField(term773564, term773564.getClass(), "functions", null);
        setField(term773564, term773564.getClass(), "regexps", null);
        setField(term773564, term773564.getClass(), "itsVariables", null);
        setField(term773564, term773564.getClass(), "itsConst", null);
        setField(term773564, term773564.getClass(), "itsVariableNames", null);
        setIntField(term773564, term773564.getClass(), "varStart", 0);
        setField(term773564, term773564.getClass(), "compilerData", null);
        setIntField(term773564, term773564.getClass(), "type", 0);
        setField(term773564, term773564.getClass(), "next", null);
        setField(term773564, term773564.getClass(), "first", null);
        setField(term773564, term773564.getClass(), "last", null);
        setField(term773564, term773564.getClass(), "propListHead", null);
        setIntField(term773564, term773564.getClass(), "sourcePosition", 0);
        setField(term773564, term773564.getClass(), "jsType", null);
        setField(term773564, term773564.getClass(), "parent", null);
        setField(term773549, term773549.getClass(), "parent", term773564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term772708;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term772616, args);
        assertTrue(recursiveEquals(term772616, term773662));
        assertTrue(recursiveEquals(term772708, term773663));
        assertTrue(recursiveEquals(retValue, term773549));
    }

};


