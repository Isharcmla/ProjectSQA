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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571713;
     Object term571805;
     Object term572045;
     Object term572046;
     Object term571976;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term571713 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term571805 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term571891 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term571961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term571891, term571891.getClass(), "next", term571961);
        setField(term571805, term571805.getClass(), "first", term571891);
        setIntField(term571805, term571805.getClass(), "type", 101);
        term572045 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term572045, term572045.getClass(), "currentTraversal", null);
        term572046 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term572047 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term572048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term572046, term572046.getClass(), "str", null);
        setIntField(term572046, term572046.getClass(), "type", 101);
        setField(term572046, term572046.getClass(), "next", null);
        setField(term572047, term572047.getClass(), "functionName", null);
        setBooleanField(term572047, term572047.getClass(), "itsNeedsActivation", false);
        setIntField(term572047, term572047.getClass(), "itsFunctionType", 0);
        setBooleanField(term572047, term572047.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term572047, term572047.getClass(), "encodedSourceStart", 0);
        setIntField(term572047, term572047.getClass(), "encodedSourceEnd", 0);
        setField(term572047, term572047.getClass(), "sourceName", null);
        setIntField(term572047, term572047.getClass(), "baseLineno", 0);
        setIntField(term572047, term572047.getClass(), "endLineno", 0);
        setField(term572047, term572047.getClass(), "functions", null);
        setField(term572047, term572047.getClass(), "regexps", null);
        setField(term572047, term572047.getClass(), "itsVariables", null);
        setField(term572047, term572047.getClass(), "itsConst", null);
        setField(term572047, term572047.getClass(), "itsVariableNames", null);
        setIntField(term572047, term572047.getClass(), "varStart", 0);
        setField(term572047, term572047.getClass(), "compilerData", null);
        setIntField(term572047, term572047.getClass(), "type", 0);
        setIntField(term572048, term572048.getClass(), "type", 0);
        setField(term572048, term572048.getClass(), "next", null);
        setField(term572048, term572048.getClass(), "first", null);
        setField(term572048, term572048.getClass(), "last", null);
        setField(term572048, term572048.getClass(), "propListHead", null);
        setIntField(term572048, term572048.getClass(), "sourcePosition", 0);
        setField(term572048, term572048.getClass(), "jsType", null);
        setField(term572048, term572048.getClass(), "parent", null);
        setField(term572047, term572047.getClass(), "next", term572048);
        setField(term572047, term572047.getClass(), "first", null);
        setField(term572047, term572047.getClass(), "last", null);
        setField(term572047, term572047.getClass(), "propListHead", null);
        setIntField(term572047, term572047.getClass(), "sourcePosition", 0);
        setField(term572047, term572047.getClass(), "jsType", null);
        setField(term572047, term572047.getClass(), "parent", null);
        setField(term572046, term572046.getClass(), "first", term572047);
        setField(term572046, term572046.getClass(), "last", null);
        setField(term572046, term572046.getClass(), "propListHead", null);
        setIntField(term572046, term572046.getClass(), "sourcePosition", 0);
        setField(term572046, term572046.getClass(), "jsType", null);
        setField(term572046, term572046.getClass(), "parent", null);
        term571976 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term571978 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term571988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term571976, term571976.getClass(), "str", null);
        setIntField(term571976, term571976.getClass(), "type", 101);
        setField(term571976, term571976.getClass(), "next", null);
        setField(term571978, term571978.getClass(), "functionName", null);
        setBooleanField(term571978, term571978.getClass(), "itsNeedsActivation", false);
        setIntField(term571978, term571978.getClass(), "itsFunctionType", 0);
        setBooleanField(term571978, term571978.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term571978, term571978.getClass(), "encodedSourceStart", 0);
        setIntField(term571978, term571978.getClass(), "encodedSourceEnd", 0);
        setField(term571978, term571978.getClass(), "sourceName", null);
        setIntField(term571978, term571978.getClass(), "baseLineno", 0);
        setIntField(term571978, term571978.getClass(), "endLineno", 0);
        setField(term571978, term571978.getClass(), "functions", null);
        setField(term571978, term571978.getClass(), "regexps", null);
        setField(term571978, term571978.getClass(), "itsVariables", null);
        setField(term571978, term571978.getClass(), "itsConst", null);
        setField(term571978, term571978.getClass(), "itsVariableNames", null);
        setIntField(term571978, term571978.getClass(), "varStart", 0);
        setField(term571978, term571978.getClass(), "compilerData", null);
        setIntField(term571978, term571978.getClass(), "type", 0);
        setIntField(term571988, term571988.getClass(), "type", 0);
        setField(term571988, term571988.getClass(), "next", null);
        setField(term571988, term571988.getClass(), "first", null);
        setField(term571988, term571988.getClass(), "last", null);
        setField(term571988, term571988.getClass(), "propListHead", null);
        setIntField(term571988, term571988.getClass(), "sourcePosition", 0);
        setField(term571988, term571988.getClass(), "jsType", null);
        setField(term571988, term571988.getClass(), "parent", null);
        setField(term571978, term571978.getClass(), "next", term571988);
        setField(term571978, term571978.getClass(), "first", null);
        setField(term571978, term571978.getClass(), "last", null);
        setField(term571978, term571978.getClass(), "propListHead", null);
        setIntField(term571978, term571978.getClass(), "sourcePosition", 0);
        setField(term571978, term571978.getClass(), "jsType", null);
        setField(term571978, term571978.getClass(), "parent", null);
        setField(term571976, term571976.getClass(), "first", term571978);
        setField(term571976, term571976.getClass(), "last", null);
        setField(term571976, term571976.getClass(), "propListHead", null);
        setIntField(term571976, term571976.getClass(), "sourcePosition", 0);
        setField(term571976, term571976.getClass(), "jsType", null);
        setField(term571976, term571976.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term571805;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term571713, args);
        assertTrue(recursiveEquals(term571713, term572045));
        assertTrue(recursiveEquals(term571805, term572046));
        assertTrue(recursiveEquals(retValue, term571976));
    }

};


