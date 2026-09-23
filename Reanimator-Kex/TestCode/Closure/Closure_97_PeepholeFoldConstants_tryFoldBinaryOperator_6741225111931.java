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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734424;
     Object term734516;
     Object term735042;
     Object term735043;
     Object term734995;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term734424 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term734516 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term734602 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term734672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term734602, term734602.getClass(), "next", term734672);
        setField(term734516, term734516.getClass(), "first", term734602);
        setIntField(term734516, term734516.getClass(), "type", 33);
        term735042 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term735042, term735042.getClass(), "currentTraversal", null);
        term735043 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term735044 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term735045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term735043, term735043.getClass(), "str", null);
        setIntField(term735043, term735043.getClass(), "type", 33);
        setField(term735043, term735043.getClass(), "next", null);
        setField(term735044, term735044.getClass(), "functionName", null);
        setBooleanField(term735044, term735044.getClass(), "itsNeedsActivation", false);
        setIntField(term735044, term735044.getClass(), "itsFunctionType", 0);
        setBooleanField(term735044, term735044.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term735044, term735044.getClass(), "encodedSourceStart", 0);
        setIntField(term735044, term735044.getClass(), "encodedSourceEnd", 0);
        setField(term735044, term735044.getClass(), "sourceName", null);
        setIntField(term735044, term735044.getClass(), "baseLineno", 0);
        setIntField(term735044, term735044.getClass(), "endLineno", 0);
        setField(term735044, term735044.getClass(), "functions", null);
        setField(term735044, term735044.getClass(), "regexps", null);
        setField(term735044, term735044.getClass(), "itsVariables", null);
        setField(term735044, term735044.getClass(), "itsConst", null);
        setField(term735044, term735044.getClass(), "itsVariableNames", null);
        setIntField(term735044, term735044.getClass(), "varStart", 0);
        setField(term735044, term735044.getClass(), "compilerData", null);
        setIntField(term735044, term735044.getClass(), "type", 0);
        setIntField(term735045, term735045.getClass(), "type", 0);
        setField(term735045, term735045.getClass(), "next", null);
        setField(term735045, term735045.getClass(), "first", null);
        setField(term735045, term735045.getClass(), "last", null);
        setField(term735045, term735045.getClass(), "propListHead", null);
        setIntField(term735045, term735045.getClass(), "sourcePosition", 0);
        setField(term735045, term735045.getClass(), "jsType", null);
        setField(term735045, term735045.getClass(), "parent", null);
        setField(term735044, term735044.getClass(), "next", term735045);
        setField(term735044, term735044.getClass(), "first", null);
        setField(term735044, term735044.getClass(), "last", null);
        setField(term735044, term735044.getClass(), "propListHead", null);
        setIntField(term735044, term735044.getClass(), "sourcePosition", 0);
        setField(term735044, term735044.getClass(), "jsType", null);
        setField(term735044, term735044.getClass(), "parent", null);
        setField(term735043, term735043.getClass(), "first", term735044);
        setField(term735043, term735043.getClass(), "last", null);
        setField(term735043, term735043.getClass(), "propListHead", null);
        setIntField(term735043, term735043.getClass(), "sourcePosition", 0);
        setField(term735043, term735043.getClass(), "jsType", null);
        setField(term735043, term735043.getClass(), "parent", null);
        term734995 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term734997 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term735007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term734995, term734995.getClass(), "str", null);
        setIntField(term734995, term734995.getClass(), "type", 33);
        setField(term734995, term734995.getClass(), "next", null);
        setField(term734997, term734997.getClass(), "functionName", null);
        setBooleanField(term734997, term734997.getClass(), "itsNeedsActivation", false);
        setIntField(term734997, term734997.getClass(), "itsFunctionType", 0);
        setBooleanField(term734997, term734997.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term734997, term734997.getClass(), "encodedSourceStart", 0);
        setIntField(term734997, term734997.getClass(), "encodedSourceEnd", 0);
        setField(term734997, term734997.getClass(), "sourceName", null);
        setIntField(term734997, term734997.getClass(), "baseLineno", 0);
        setIntField(term734997, term734997.getClass(), "endLineno", 0);
        setField(term734997, term734997.getClass(), "functions", null);
        setField(term734997, term734997.getClass(), "regexps", null);
        setField(term734997, term734997.getClass(), "itsVariables", null);
        setField(term734997, term734997.getClass(), "itsConst", null);
        setField(term734997, term734997.getClass(), "itsVariableNames", null);
        setIntField(term734997, term734997.getClass(), "varStart", 0);
        setField(term734997, term734997.getClass(), "compilerData", null);
        setIntField(term734997, term734997.getClass(), "type", 0);
        setIntField(term735007, term735007.getClass(), "type", 0);
        setField(term735007, term735007.getClass(), "next", null);
        setField(term735007, term735007.getClass(), "first", null);
        setField(term735007, term735007.getClass(), "last", null);
        setField(term735007, term735007.getClass(), "propListHead", null);
        setIntField(term735007, term735007.getClass(), "sourcePosition", 0);
        setField(term735007, term735007.getClass(), "jsType", null);
        setField(term735007, term735007.getClass(), "parent", null);
        setField(term734997, term734997.getClass(), "next", term735007);
        setField(term734997, term734997.getClass(), "first", null);
        setField(term734997, term734997.getClass(), "last", null);
        setField(term734997, term734997.getClass(), "propListHead", null);
        setIntField(term734997, term734997.getClass(), "sourcePosition", 0);
        setField(term734997, term734997.getClass(), "jsType", null);
        setField(term734997, term734997.getClass(), "parent", null);
        setField(term734995, term734995.getClass(), "first", term734997);
        setField(term734995, term734995.getClass(), "last", null);
        setField(term734995, term734995.getClass(), "propListHead", null);
        setIntField(term734995, term734995.getClass(), "sourcePosition", 0);
        setField(term734995, term734995.getClass(), "jsType", null);
        setField(term734995, term734995.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term734516;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term734424, args);
        assertTrue(recursiveEquals(term734424, term735042));
        assertTrue(recursiveEquals(term734516, term735043));
        assertTrue(recursiveEquals(retValue, term734995));
    }

};


