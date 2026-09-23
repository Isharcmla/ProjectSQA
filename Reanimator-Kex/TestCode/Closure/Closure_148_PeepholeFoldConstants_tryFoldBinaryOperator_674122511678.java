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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150451;
     Object term150543;
     Object term150802;
     Object term150803;
     Object term150736;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150451 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term150543 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term150635 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term150721 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term150635, term150635.getClass(), "next", term150721);
        setIntField(term150635, term150635.getClass(), "type", 16);
        setField(term150543, term150543.getClass(), "first", term150635);
        setIntField(term150543, term150543.getClass(), "type", 16);
        term150802 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term150802, term150802.getClass(), "currentTraversal", null);
        term150803 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term150804 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term150805 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term150803, term150803.getClass(), "str", null);
        setIntField(term150803, term150803.getClass(), "type", 16);
        setField(term150803, term150803.getClass(), "next", null);
        setField(term150804, term150804.getClass(), "str", null);
        setIntField(term150804, term150804.getClass(), "type", 16);
        setField(term150805, term150805.getClass(), "functionName", null);
        setBooleanField(term150805, term150805.getClass(), "itsNeedsActivation", false);
        setIntField(term150805, term150805.getClass(), "itsFunctionType", 0);
        setBooleanField(term150805, term150805.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term150805, term150805.getClass(), "encodedSourceStart", 0);
        setIntField(term150805, term150805.getClass(), "encodedSourceEnd", 0);
        setField(term150805, term150805.getClass(), "sourceName", null);
        setIntField(term150805, term150805.getClass(), "baseLineno", 0);
        setIntField(term150805, term150805.getClass(), "endLineno", 0);
        setField(term150805, term150805.getClass(), "functions", null);
        setField(term150805, term150805.getClass(), "regexps", null);
        setField(term150805, term150805.getClass(), "itsVariables", null);
        setField(term150805, term150805.getClass(), "itsConst", null);
        setField(term150805, term150805.getClass(), "itsVariableNames", null);
        setIntField(term150805, term150805.getClass(), "varStart", 0);
        setField(term150805, term150805.getClass(), "compilerData", null);
        setIntField(term150805, term150805.getClass(), "type", 0);
        setField(term150805, term150805.getClass(), "next", null);
        setField(term150805, term150805.getClass(), "first", null);
        setField(term150805, term150805.getClass(), "last", null);
        setField(term150805, term150805.getClass(), "propListHead", null);
        setIntField(term150805, term150805.getClass(), "sourcePosition", 0);
        setField(term150805, term150805.getClass(), "jsType", null);
        setField(term150805, term150805.getClass(), "parent", null);
        setField(term150804, term150804.getClass(), "next", term150805);
        setField(term150804, term150804.getClass(), "first", null);
        setField(term150804, term150804.getClass(), "last", null);
        setField(term150804, term150804.getClass(), "propListHead", null);
        setIntField(term150804, term150804.getClass(), "sourcePosition", 0);
        setField(term150804, term150804.getClass(), "jsType", null);
        setField(term150804, term150804.getClass(), "parent", null);
        setField(term150803, term150803.getClass(), "first", term150804);
        setField(term150803, term150803.getClass(), "last", null);
        setField(term150803, term150803.getClass(), "propListHead", null);
        setIntField(term150803, term150803.getClass(), "sourcePosition", 0);
        setField(term150803, term150803.getClass(), "jsType", null);
        setField(term150803, term150803.getClass(), "parent", null);
        term150736 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term150738 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term150740 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term150736, term150736.getClass(), "str", null);
        setIntField(term150736, term150736.getClass(), "type", 16);
        setField(term150736, term150736.getClass(), "next", null);
        setField(term150738, term150738.getClass(), "str", null);
        setIntField(term150738, term150738.getClass(), "type", 16);
        setField(term150740, term150740.getClass(), "functionName", null);
        setBooleanField(term150740, term150740.getClass(), "itsNeedsActivation", false);
        setIntField(term150740, term150740.getClass(), "itsFunctionType", 0);
        setBooleanField(term150740, term150740.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term150740, term150740.getClass(), "encodedSourceStart", 0);
        setIntField(term150740, term150740.getClass(), "encodedSourceEnd", 0);
        setField(term150740, term150740.getClass(), "sourceName", null);
        setIntField(term150740, term150740.getClass(), "baseLineno", 0);
        setIntField(term150740, term150740.getClass(), "endLineno", 0);
        setField(term150740, term150740.getClass(), "functions", null);
        setField(term150740, term150740.getClass(), "regexps", null);
        setField(term150740, term150740.getClass(), "itsVariables", null);
        setField(term150740, term150740.getClass(), "itsConst", null);
        setField(term150740, term150740.getClass(), "itsVariableNames", null);
        setIntField(term150740, term150740.getClass(), "varStart", 0);
        setField(term150740, term150740.getClass(), "compilerData", null);
        setIntField(term150740, term150740.getClass(), "type", 0);
        setField(term150740, term150740.getClass(), "next", null);
        setField(term150740, term150740.getClass(), "first", null);
        setField(term150740, term150740.getClass(), "last", null);
        setField(term150740, term150740.getClass(), "propListHead", null);
        setIntField(term150740, term150740.getClass(), "sourcePosition", 0);
        setField(term150740, term150740.getClass(), "jsType", null);
        setField(term150740, term150740.getClass(), "parent", null);
        setField(term150738, term150738.getClass(), "next", term150740);
        setField(term150738, term150738.getClass(), "first", null);
        setField(term150738, term150738.getClass(), "last", null);
        setField(term150738, term150738.getClass(), "propListHead", null);
        setIntField(term150738, term150738.getClass(), "sourcePosition", 0);
        setField(term150738, term150738.getClass(), "jsType", null);
        setField(term150738, term150738.getClass(), "parent", null);
        setField(term150736, term150736.getClass(), "first", term150738);
        setField(term150736, term150736.getClass(), "last", null);
        setField(term150736, term150736.getClass(), "propListHead", null);
        setIntField(term150736, term150736.getClass(), "sourcePosition", 0);
        setField(term150736, term150736.getClass(), "jsType", null);
        setField(term150736, term150736.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term150543;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term150451, args);
        assertTrue(recursiveEquals(term150451, term150802));
        assertTrue(recursiveEquals(term150543, term150803));
        assertTrue(recursiveEquals(retValue, term150736));
    }

};


