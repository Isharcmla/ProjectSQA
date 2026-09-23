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

public class PeepholeFoldConstants_optimizeSubtree_16065069933044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896294;
     Object term896380;
     Object term896719;
     Object term896720;
     Object term896604;

    public PeepholeFoldConstants_optimizeSubtree_16065069933044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896294 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term896380 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term896466 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term896558 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term896380, term896380.getClass(), "type", 33);
        setIntField(term896558, term896558.getClass(), "type", 40);
        setField(term896558, term896558.getClass(), "str", "");
        setField(term896466, term896466.getClass(), "next", term896558);
        setField(term896380, term896380.getClass(), "first", term896466);
        term896719 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term896719, term896719.getClass(), "currentTraversal", null);
        term896720 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term896721 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term896722 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term896720, term896720.getClass(), "functionName", null);
        setBooleanField(term896720, term896720.getClass(), "itsNeedsActivation", false);
        setIntField(term896720, term896720.getClass(), "itsFunctionType", 0);
        setBooleanField(term896720, term896720.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term896720, term896720.getClass(), "encodedSourceStart", 0);
        setIntField(term896720, term896720.getClass(), "encodedSourceEnd", 0);
        setField(term896720, term896720.getClass(), "sourceName", null);
        setIntField(term896720, term896720.getClass(), "baseLineno", 0);
        setIntField(term896720, term896720.getClass(), "endLineno", 0);
        setField(term896720, term896720.getClass(), "functions", null);
        setField(term896720, term896720.getClass(), "regexps", null);
        setField(term896720, term896720.getClass(), "itsVariables", null);
        setField(term896720, term896720.getClass(), "itsConst", null);
        setField(term896720, term896720.getClass(), "itsVariableNames", null);
        setIntField(term896720, term896720.getClass(), "varStart", 0);
        setField(term896720, term896720.getClass(), "compilerData", null);
        setIntField(term896720, term896720.getClass(), "type", 33);
        setField(term896720, term896720.getClass(), "next", null);
        setField(term896721, term896721.getClass(), "functionName", null);
        setBooleanField(term896721, term896721.getClass(), "itsNeedsActivation", false);
        setIntField(term896721, term896721.getClass(), "itsFunctionType", 0);
        setBooleanField(term896721, term896721.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term896721, term896721.getClass(), "encodedSourceStart", 0);
        setIntField(term896721, term896721.getClass(), "encodedSourceEnd", 0);
        setField(term896721, term896721.getClass(), "sourceName", null);
        setIntField(term896721, term896721.getClass(), "baseLineno", 0);
        setIntField(term896721, term896721.getClass(), "endLineno", 0);
        setField(term896721, term896721.getClass(), "functions", null);
        setField(term896721, term896721.getClass(), "regexps", null);
        setField(term896721, term896721.getClass(), "itsVariables", null);
        setField(term896721, term896721.getClass(), "itsConst", null);
        setField(term896721, term896721.getClass(), "itsVariableNames", null);
        setIntField(term896721, term896721.getClass(), "varStart", 0);
        setField(term896721, term896721.getClass(), "compilerData", null);
        setIntField(term896721, term896721.getClass(), "type", 0);
        setField(term896722, term896722.getClass(), "str", "");
        setIntField(term896722, term896722.getClass(), "type", 40);
        setField(term896722, term896722.getClass(), "next", null);
        setField(term896722, term896722.getClass(), "first", null);
        setField(term896722, term896722.getClass(), "last", null);
        setField(term896722, term896722.getClass(), "propListHead", null);
        setIntField(term896722, term896722.getClass(), "sourcePosition", 0);
        setField(term896722, term896722.getClass(), "jsType", null);
        setField(term896722, term896722.getClass(), "parent", null);
        setField(term896721, term896721.getClass(), "next", term896722);
        setField(term896721, term896721.getClass(), "first", null);
        setField(term896721, term896721.getClass(), "last", null);
        setField(term896721, term896721.getClass(), "propListHead", null);
        setIntField(term896721, term896721.getClass(), "sourcePosition", 0);
        setField(term896721, term896721.getClass(), "jsType", null);
        setField(term896721, term896721.getClass(), "parent", null);
        setField(term896720, term896720.getClass(), "first", term896721);
        setField(term896720, term896720.getClass(), "last", null);
        setField(term896720, term896720.getClass(), "propListHead", null);
        setIntField(term896720, term896720.getClass(), "sourcePosition", 0);
        setField(term896720, term896720.getClass(), "jsType", null);
        setField(term896720, term896720.getClass(), "parent", null);
        term896604 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term896614 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term896624 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term896604, term896604.getClass(), "functionName", null);
        setBooleanField(term896604, term896604.getClass(), "itsNeedsActivation", false);
        setIntField(term896604, term896604.getClass(), "itsFunctionType", 0);
        setBooleanField(term896604, term896604.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term896604, term896604.getClass(), "encodedSourceStart", 0);
        setIntField(term896604, term896604.getClass(), "encodedSourceEnd", 0);
        setField(term896604, term896604.getClass(), "sourceName", null);
        setIntField(term896604, term896604.getClass(), "baseLineno", 0);
        setIntField(term896604, term896604.getClass(), "endLineno", 0);
        setField(term896604, term896604.getClass(), "functions", null);
        setField(term896604, term896604.getClass(), "regexps", null);
        setField(term896604, term896604.getClass(), "itsVariables", null);
        setField(term896604, term896604.getClass(), "itsConst", null);
        setField(term896604, term896604.getClass(), "itsVariableNames", null);
        setIntField(term896604, term896604.getClass(), "varStart", 0);
        setField(term896604, term896604.getClass(), "compilerData", null);
        setIntField(term896604, term896604.getClass(), "type", 33);
        setField(term896604, term896604.getClass(), "next", null);
        setField(term896614, term896614.getClass(), "functionName", null);
        setBooleanField(term896614, term896614.getClass(), "itsNeedsActivation", false);
        setIntField(term896614, term896614.getClass(), "itsFunctionType", 0);
        setBooleanField(term896614, term896614.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term896614, term896614.getClass(), "encodedSourceStart", 0);
        setIntField(term896614, term896614.getClass(), "encodedSourceEnd", 0);
        setField(term896614, term896614.getClass(), "sourceName", null);
        setIntField(term896614, term896614.getClass(), "baseLineno", 0);
        setIntField(term896614, term896614.getClass(), "endLineno", 0);
        setField(term896614, term896614.getClass(), "functions", null);
        setField(term896614, term896614.getClass(), "regexps", null);
        setField(term896614, term896614.getClass(), "itsVariables", null);
        setField(term896614, term896614.getClass(), "itsConst", null);
        setField(term896614, term896614.getClass(), "itsVariableNames", null);
        setIntField(term896614, term896614.getClass(), "varStart", 0);
        setField(term896614, term896614.getClass(), "compilerData", null);
        setIntField(term896614, term896614.getClass(), "type", 0);
        setField(term896624, term896624.getClass(), "str", "");
        setIntField(term896624, term896624.getClass(), "type", 40);
        setField(term896624, term896624.getClass(), "next", null);
        setField(term896624, term896624.getClass(), "first", null);
        setField(term896624, term896624.getClass(), "last", null);
        setField(term896624, term896624.getClass(), "propListHead", null);
        setIntField(term896624, term896624.getClass(), "sourcePosition", 0);
        setField(term896624, term896624.getClass(), "jsType", null);
        setField(term896624, term896624.getClass(), "parent", null);
        setField(term896614, term896614.getClass(), "next", term896624);
        setField(term896614, term896614.getClass(), "first", null);
        setField(term896614, term896614.getClass(), "last", null);
        setField(term896614, term896614.getClass(), "propListHead", null);
        setIntField(term896614, term896614.getClass(), "sourcePosition", 0);
        setField(term896614, term896614.getClass(), "jsType", null);
        setField(term896614, term896614.getClass(), "parent", null);
        setField(term896604, term896604.getClass(), "first", term896614);
        setField(term896604, term896604.getClass(), "last", null);
        setField(term896604, term896604.getClass(), "propListHead", null);
        setIntField(term896604, term896604.getClass(), "sourcePosition", 0);
        setField(term896604, term896604.getClass(), "jsType", null);
        setField(term896604, term896604.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term896380;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term896294, args);
        assertTrue(recursiveEquals(term896294, term896719));
        assertTrue(recursiveEquals(term896380, term896720));
        assertTrue(recursiveEquals(retValue, term896604));
    }

};


