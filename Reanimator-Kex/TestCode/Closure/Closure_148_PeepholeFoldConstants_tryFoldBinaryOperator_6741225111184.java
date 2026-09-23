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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280405;
     Object term280497;
     Object term280711;
     Object term280712;
     Object term280668;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280405 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term280497 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term280583 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term280653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term280583, term280583.getClass(), "next", term280653);
        setField(term280497, term280497.getClass(), "first", term280583);
        setIntField(term280497, term280497.getClass(), "type", 22);
        term280711 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term280711, term280711.getClass(), "currentTraversal", null);
        term280712 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term280713 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term280714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term280712, term280712.getClass(), "str", null);
        setIntField(term280712, term280712.getClass(), "type", 22);
        setField(term280712, term280712.getClass(), "next", null);
        setField(term280713, term280713.getClass(), "functionName", null);
        setBooleanField(term280713, term280713.getClass(), "itsNeedsActivation", false);
        setIntField(term280713, term280713.getClass(), "itsFunctionType", 0);
        setBooleanField(term280713, term280713.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term280713, term280713.getClass(), "encodedSourceStart", 0);
        setIntField(term280713, term280713.getClass(), "encodedSourceEnd", 0);
        setField(term280713, term280713.getClass(), "sourceName", null);
        setIntField(term280713, term280713.getClass(), "baseLineno", 0);
        setIntField(term280713, term280713.getClass(), "endLineno", 0);
        setField(term280713, term280713.getClass(), "functions", null);
        setField(term280713, term280713.getClass(), "regexps", null);
        setField(term280713, term280713.getClass(), "itsVariables", null);
        setField(term280713, term280713.getClass(), "itsConst", null);
        setField(term280713, term280713.getClass(), "itsVariableNames", null);
        setIntField(term280713, term280713.getClass(), "varStart", 0);
        setField(term280713, term280713.getClass(), "compilerData", null);
        setIntField(term280713, term280713.getClass(), "type", 0);
        setIntField(term280714, term280714.getClass(), "type", 0);
        setField(term280714, term280714.getClass(), "next", null);
        setField(term280714, term280714.getClass(), "first", null);
        setField(term280714, term280714.getClass(), "last", null);
        setField(term280714, term280714.getClass(), "propListHead", null);
        setIntField(term280714, term280714.getClass(), "sourcePosition", 0);
        setField(term280714, term280714.getClass(), "jsType", null);
        setField(term280714, term280714.getClass(), "parent", null);
        setField(term280713, term280713.getClass(), "next", term280714);
        setField(term280713, term280713.getClass(), "first", null);
        setField(term280713, term280713.getClass(), "last", null);
        setField(term280713, term280713.getClass(), "propListHead", null);
        setIntField(term280713, term280713.getClass(), "sourcePosition", 0);
        setField(term280713, term280713.getClass(), "jsType", null);
        setField(term280713, term280713.getClass(), "parent", null);
        setField(term280712, term280712.getClass(), "first", term280713);
        setField(term280712, term280712.getClass(), "last", null);
        setField(term280712, term280712.getClass(), "propListHead", null);
        setIntField(term280712, term280712.getClass(), "sourcePosition", 0);
        setField(term280712, term280712.getClass(), "jsType", null);
        setField(term280712, term280712.getClass(), "parent", null);
        term280668 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term280670 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term280680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term280668, term280668.getClass(), "str", null);
        setIntField(term280668, term280668.getClass(), "type", 22);
        setField(term280668, term280668.getClass(), "next", null);
        setField(term280670, term280670.getClass(), "functionName", null);
        setBooleanField(term280670, term280670.getClass(), "itsNeedsActivation", false);
        setIntField(term280670, term280670.getClass(), "itsFunctionType", 0);
        setBooleanField(term280670, term280670.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term280670, term280670.getClass(), "encodedSourceStart", 0);
        setIntField(term280670, term280670.getClass(), "encodedSourceEnd", 0);
        setField(term280670, term280670.getClass(), "sourceName", null);
        setIntField(term280670, term280670.getClass(), "baseLineno", 0);
        setIntField(term280670, term280670.getClass(), "endLineno", 0);
        setField(term280670, term280670.getClass(), "functions", null);
        setField(term280670, term280670.getClass(), "regexps", null);
        setField(term280670, term280670.getClass(), "itsVariables", null);
        setField(term280670, term280670.getClass(), "itsConst", null);
        setField(term280670, term280670.getClass(), "itsVariableNames", null);
        setIntField(term280670, term280670.getClass(), "varStart", 0);
        setField(term280670, term280670.getClass(), "compilerData", null);
        setIntField(term280670, term280670.getClass(), "type", 0);
        setIntField(term280680, term280680.getClass(), "type", 0);
        setField(term280680, term280680.getClass(), "next", null);
        setField(term280680, term280680.getClass(), "first", null);
        setField(term280680, term280680.getClass(), "last", null);
        setField(term280680, term280680.getClass(), "propListHead", null);
        setIntField(term280680, term280680.getClass(), "sourcePosition", 0);
        setField(term280680, term280680.getClass(), "jsType", null);
        setField(term280680, term280680.getClass(), "parent", null);
        setField(term280670, term280670.getClass(), "next", term280680);
        setField(term280670, term280670.getClass(), "first", null);
        setField(term280670, term280670.getClass(), "last", null);
        setField(term280670, term280670.getClass(), "propListHead", null);
        setIntField(term280670, term280670.getClass(), "sourcePosition", 0);
        setField(term280670, term280670.getClass(), "jsType", null);
        setField(term280670, term280670.getClass(), "parent", null);
        setField(term280668, term280668.getClass(), "first", term280670);
        setField(term280668, term280668.getClass(), "last", null);
        setField(term280668, term280668.getClass(), "propListHead", null);
        setIntField(term280668, term280668.getClass(), "sourcePosition", 0);
        setField(term280668, term280668.getClass(), "jsType", null);
        setField(term280668, term280668.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term280497;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term280405, args);
        assertTrue(recursiveEquals(term280405, term280711));
        assertTrue(recursiveEquals(term280497, term280712));
        assertTrue(recursiveEquals(retValue, term280668));
    }

};


