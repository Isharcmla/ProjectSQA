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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533621;
     Object term533713;
     Object term533996;
     Object term533997;
     Object term533951;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533621 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term533713 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term533799 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term533869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term533799, term533799.getClass(), "next", term533869);
        setField(term533713, term533713.getClass(), "first", term533799);
        setIntField(term533713, term533713.getClass(), "type", 19);
        term533996 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term533996, term533996.getClass(), "currentTraversal", null);
        term533997 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term533998 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term533999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term533997, term533997.getClass(), "number", 0.0);
        setIntField(term533997, term533997.getClass(), "type", 19);
        setField(term533997, term533997.getClass(), "next", null);
        setField(term533998, term533998.getClass(), "functionName", null);
        setBooleanField(term533998, term533998.getClass(), "itsNeedsActivation", false);
        setIntField(term533998, term533998.getClass(), "itsFunctionType", 0);
        setBooleanField(term533998, term533998.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term533998, term533998.getClass(), "encodedSourceStart", 0);
        setIntField(term533998, term533998.getClass(), "encodedSourceEnd", 0);
        setField(term533998, term533998.getClass(), "sourceName", null);
        setIntField(term533998, term533998.getClass(), "baseLineno", 0);
        setIntField(term533998, term533998.getClass(), "endLineno", 0);
        setField(term533998, term533998.getClass(), "functions", null);
        setField(term533998, term533998.getClass(), "regexps", null);
        setField(term533998, term533998.getClass(), "itsVariables", null);
        setField(term533998, term533998.getClass(), "itsConst", null);
        setField(term533998, term533998.getClass(), "itsVariableNames", null);
        setIntField(term533998, term533998.getClass(), "varStart", 0);
        setField(term533998, term533998.getClass(), "compilerData", null);
        setIntField(term533998, term533998.getClass(), "type", 0);
        setIntField(term533999, term533999.getClass(), "type", 0);
        setField(term533999, term533999.getClass(), "next", null);
        setField(term533999, term533999.getClass(), "first", null);
        setField(term533999, term533999.getClass(), "last", null);
        setField(term533999, term533999.getClass(), "propListHead", null);
        setIntField(term533999, term533999.getClass(), "sourcePosition", 0);
        setField(term533999, term533999.getClass(), "jsType", null);
        setField(term533999, term533999.getClass(), "parent", null);
        setField(term533998, term533998.getClass(), "next", term533999);
        setField(term533998, term533998.getClass(), "first", null);
        setField(term533998, term533998.getClass(), "last", null);
        setField(term533998, term533998.getClass(), "propListHead", null);
        setIntField(term533998, term533998.getClass(), "sourcePosition", 0);
        setField(term533998, term533998.getClass(), "jsType", null);
        setField(term533998, term533998.getClass(), "parent", null);
        setField(term533997, term533997.getClass(), "first", term533998);
        setField(term533997, term533997.getClass(), "last", null);
        setField(term533997, term533997.getClass(), "propListHead", null);
        setIntField(term533997, term533997.getClass(), "sourcePosition", 0);
        setField(term533997, term533997.getClass(), "jsType", null);
        setField(term533997, term533997.getClass(), "parent", null);
        term533951 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term533954 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term533964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term533951, term533951.getClass(), "number", 0.0);
        setIntField(term533951, term533951.getClass(), "type", 19);
        setField(term533951, term533951.getClass(), "next", null);
        setField(term533954, term533954.getClass(), "functionName", null);
        setBooleanField(term533954, term533954.getClass(), "itsNeedsActivation", false);
        setIntField(term533954, term533954.getClass(), "itsFunctionType", 0);
        setBooleanField(term533954, term533954.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term533954, term533954.getClass(), "encodedSourceStart", 0);
        setIntField(term533954, term533954.getClass(), "encodedSourceEnd", 0);
        setField(term533954, term533954.getClass(), "sourceName", null);
        setIntField(term533954, term533954.getClass(), "baseLineno", 0);
        setIntField(term533954, term533954.getClass(), "endLineno", 0);
        setField(term533954, term533954.getClass(), "functions", null);
        setField(term533954, term533954.getClass(), "regexps", null);
        setField(term533954, term533954.getClass(), "itsVariables", null);
        setField(term533954, term533954.getClass(), "itsConst", null);
        setField(term533954, term533954.getClass(), "itsVariableNames", null);
        setIntField(term533954, term533954.getClass(), "varStart", 0);
        setField(term533954, term533954.getClass(), "compilerData", null);
        setIntField(term533954, term533954.getClass(), "type", 0);
        setIntField(term533964, term533964.getClass(), "type", 0);
        setField(term533964, term533964.getClass(), "next", null);
        setField(term533964, term533964.getClass(), "first", null);
        setField(term533964, term533964.getClass(), "last", null);
        setField(term533964, term533964.getClass(), "propListHead", null);
        setIntField(term533964, term533964.getClass(), "sourcePosition", 0);
        setField(term533964, term533964.getClass(), "jsType", null);
        setField(term533964, term533964.getClass(), "parent", null);
        setField(term533954, term533954.getClass(), "next", term533964);
        setField(term533954, term533954.getClass(), "first", null);
        setField(term533954, term533954.getClass(), "last", null);
        setField(term533954, term533954.getClass(), "propListHead", null);
        setIntField(term533954, term533954.getClass(), "sourcePosition", 0);
        setField(term533954, term533954.getClass(), "jsType", null);
        setField(term533954, term533954.getClass(), "parent", null);
        setField(term533951, term533951.getClass(), "first", term533954);
        setField(term533951, term533951.getClass(), "last", null);
        setField(term533951, term533951.getClass(), "propListHead", null);
        setIntField(term533951, term533951.getClass(), "sourcePosition", 0);
        setField(term533951, term533951.getClass(), "jsType", null);
        setField(term533951, term533951.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term533713;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term533621, args);
        assertTrue(recursiveEquals(term533621, term533996));
        assertTrue(recursiveEquals(term533713, term533997));
        assertTrue(recursiveEquals(retValue, term533951));
    }

};


