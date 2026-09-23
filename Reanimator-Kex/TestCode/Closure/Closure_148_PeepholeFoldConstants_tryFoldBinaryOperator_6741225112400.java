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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667117;
     Object term667209;
     Object term667779;
     Object term667780;
     Object term667734;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term667117 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term667209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term667295 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term667387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term667295, term667295.getClass(), "next", term667387);
        setIntField(term667295, term667295.getClass(), "type", 39);
        setField(term667209, term667209.getClass(), "first", term667295);
        setIntField(term667209, term667209.getClass(), "type", 20);
        term667779 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term667779, term667779.getClass(), "currentTraversal", null);
        term667780 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term667781 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term667782 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term667780, term667780.getClass(), "str", null);
        setIntField(term667780, term667780.getClass(), "type", 20);
        setField(term667780, term667780.getClass(), "next", null);
        setField(term667781, term667781.getClass(), "functionName", null);
        setBooleanField(term667781, term667781.getClass(), "itsNeedsActivation", false);
        setIntField(term667781, term667781.getClass(), "itsFunctionType", 0);
        setBooleanField(term667781, term667781.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term667781, term667781.getClass(), "encodedSourceStart", 0);
        setIntField(term667781, term667781.getClass(), "encodedSourceEnd", 0);
        setField(term667781, term667781.getClass(), "sourceName", null);
        setIntField(term667781, term667781.getClass(), "baseLineno", 0);
        setIntField(term667781, term667781.getClass(), "endLineno", 0);
        setField(term667781, term667781.getClass(), "functions", null);
        setField(term667781, term667781.getClass(), "regexps", null);
        setField(term667781, term667781.getClass(), "itsVariables", null);
        setField(term667781, term667781.getClass(), "itsConst", null);
        setField(term667781, term667781.getClass(), "itsVariableNames", null);
        setIntField(term667781, term667781.getClass(), "varStart", 0);
        setField(term667781, term667781.getClass(), "compilerData", null);
        setIntField(term667781, term667781.getClass(), "type", 39);
        setField(term667782, term667782.getClass(), "str", null);
        setIntField(term667782, term667782.getClass(), "type", 0);
        setField(term667782, term667782.getClass(), "next", null);
        setField(term667782, term667782.getClass(), "first", null);
        setField(term667782, term667782.getClass(), "last", null);
        setField(term667782, term667782.getClass(), "propListHead", null);
        setIntField(term667782, term667782.getClass(), "sourcePosition", 0);
        setField(term667782, term667782.getClass(), "jsType", null);
        setField(term667782, term667782.getClass(), "parent", null);
        setField(term667781, term667781.getClass(), "next", term667782);
        setField(term667781, term667781.getClass(), "first", null);
        setField(term667781, term667781.getClass(), "last", null);
        setField(term667781, term667781.getClass(), "propListHead", null);
        setIntField(term667781, term667781.getClass(), "sourcePosition", 0);
        setField(term667781, term667781.getClass(), "jsType", null);
        setField(term667781, term667781.getClass(), "parent", null);
        setField(term667780, term667780.getClass(), "first", term667781);
        setField(term667780, term667780.getClass(), "last", null);
        setField(term667780, term667780.getClass(), "propListHead", null);
        setIntField(term667780, term667780.getClass(), "sourcePosition", 0);
        setField(term667780, term667780.getClass(), "jsType", null);
        setField(term667780, term667780.getClass(), "parent", null);
        term667734 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term667736 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term667746 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term667734, term667734.getClass(), "str", null);
        setIntField(term667734, term667734.getClass(), "type", 20);
        setField(term667734, term667734.getClass(), "next", null);
        setField(term667736, term667736.getClass(), "functionName", null);
        setBooleanField(term667736, term667736.getClass(), "itsNeedsActivation", false);
        setIntField(term667736, term667736.getClass(), "itsFunctionType", 0);
        setBooleanField(term667736, term667736.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term667736, term667736.getClass(), "encodedSourceStart", 0);
        setIntField(term667736, term667736.getClass(), "encodedSourceEnd", 0);
        setField(term667736, term667736.getClass(), "sourceName", null);
        setIntField(term667736, term667736.getClass(), "baseLineno", 0);
        setIntField(term667736, term667736.getClass(), "endLineno", 0);
        setField(term667736, term667736.getClass(), "functions", null);
        setField(term667736, term667736.getClass(), "regexps", null);
        setField(term667736, term667736.getClass(), "itsVariables", null);
        setField(term667736, term667736.getClass(), "itsConst", null);
        setField(term667736, term667736.getClass(), "itsVariableNames", null);
        setIntField(term667736, term667736.getClass(), "varStart", 0);
        setField(term667736, term667736.getClass(), "compilerData", null);
        setIntField(term667736, term667736.getClass(), "type", 39);
        setField(term667746, term667746.getClass(), "str", null);
        setIntField(term667746, term667746.getClass(), "type", 0);
        setField(term667746, term667746.getClass(), "next", null);
        setField(term667746, term667746.getClass(), "first", null);
        setField(term667746, term667746.getClass(), "last", null);
        setField(term667746, term667746.getClass(), "propListHead", null);
        setIntField(term667746, term667746.getClass(), "sourcePosition", 0);
        setField(term667746, term667746.getClass(), "jsType", null);
        setField(term667746, term667746.getClass(), "parent", null);
        setField(term667736, term667736.getClass(), "next", term667746);
        setField(term667736, term667736.getClass(), "first", null);
        setField(term667736, term667736.getClass(), "last", null);
        setField(term667736, term667736.getClass(), "propListHead", null);
        setIntField(term667736, term667736.getClass(), "sourcePosition", 0);
        setField(term667736, term667736.getClass(), "jsType", null);
        setField(term667736, term667736.getClass(), "parent", null);
        setField(term667734, term667734.getClass(), "first", term667736);
        setField(term667734, term667734.getClass(), "last", null);
        setField(term667734, term667734.getClass(), "propListHead", null);
        setIntField(term667734, term667734.getClass(), "sourcePosition", 0);
        setField(term667734, term667734.getClass(), "jsType", null);
        setField(term667734, term667734.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term667209;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term667117, args);
        assertTrue(recursiveEquals(term667117, term667779));
        assertTrue(recursiveEquals(term667209, term667780));
        assertTrue(recursiveEquals(retValue, term667734));
    }

};


