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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term750128;
     Object term750214;
     Object term750398;
     Object term750490;
     Object term750659;
     Object term750660;
     Object term750662;
     Object term750663;
     Object term750580;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term750128 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term750214 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term750306 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term750306, term750306.getClass(), "type", 108);
        setField(term750214, term750214.getClass(), "parent", term750306);
        setIntField(term750214, term750214.getClass(), "type", 100);
        term750398 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term750398, term750398.getClass(), "type", 117);
        term750490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term750490, term750490.getClass(), "type", 44);
        term750659 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term750659, term750659.getClass(), "currentTraversal", null);
        term750660 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term750661 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term750660, term750660.getClass(), "functionName", null);
        setBooleanField(term750660, term750660.getClass(), "itsNeedsActivation", false);
        setIntField(term750660, term750660.getClass(), "itsFunctionType", 0);
        setBooleanField(term750660, term750660.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term750660, term750660.getClass(), "encodedSourceStart", 0);
        setIntField(term750660, term750660.getClass(), "encodedSourceEnd", 0);
        setField(term750660, term750660.getClass(), "sourceName", null);
        setIntField(term750660, term750660.getClass(), "baseLineno", 0);
        setIntField(term750660, term750660.getClass(), "endLineno", 0);
        setField(term750660, term750660.getClass(), "functions", null);
        setField(term750660, term750660.getClass(), "regexps", null);
        setField(term750660, term750660.getClass(), "itsVariables", null);
        setField(term750660, term750660.getClass(), "itsConst", null);
        setField(term750660, term750660.getClass(), "itsVariableNames", null);
        setIntField(term750660, term750660.getClass(), "varStart", 0);
        setField(term750660, term750660.getClass(), "compilerData", null);
        setIntField(term750660, term750660.getClass(), "type", 100);
        setField(term750660, term750660.getClass(), "next", null);
        setField(term750660, term750660.getClass(), "first", null);
        setField(term750660, term750660.getClass(), "last", null);
        setField(term750660, term750660.getClass(), "propListHead", null);
        setIntField(term750660, term750660.getClass(), "sourcePosition", 0);
        setField(term750660, term750660.getClass(), "jsType", null);
        setDoubleField(term750661, term750661.getClass(), "number", 0.0);
        setIntField(term750661, term750661.getClass(), "type", 108);
        setField(term750661, term750661.getClass(), "next", null);
        setField(term750661, term750661.getClass(), "first", null);
        setField(term750661, term750661.getClass(), "last", null);
        setField(term750661, term750661.getClass(), "propListHead", null);
        setIntField(term750661, term750661.getClass(), "sourcePosition", 0);
        setField(term750661, term750661.getClass(), "jsType", null);
        setField(term750661, term750661.getClass(), "parent", null);
        setField(term750660, term750660.getClass(), "parent", term750661);
        term750662 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term750662, term750662.getClass(), "number", 0.0);
        setIntField(term750662, term750662.getClass(), "type", 117);
        setField(term750662, term750662.getClass(), "next", null);
        setField(term750662, term750662.getClass(), "first", null);
        setField(term750662, term750662.getClass(), "last", null);
        setField(term750662, term750662.getClass(), "propListHead", null);
        setIntField(term750662, term750662.getClass(), "sourcePosition", 0);
        setField(term750662, term750662.getClass(), "jsType", null);
        setField(term750662, term750662.getClass(), "parent", null);
        term750663 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term750663, term750663.getClass(), "str", null);
        setIntField(term750663, term750663.getClass(), "type", 44);
        setField(term750663, term750663.getClass(), "next", null);
        setField(term750663, term750663.getClass(), "first", null);
        setField(term750663, term750663.getClass(), "last", null);
        setField(term750663, term750663.getClass(), "propListHead", null);
        setIntField(term750663, term750663.getClass(), "sourcePosition", 0);
        setField(term750663, term750663.getClass(), "jsType", null);
        setField(term750663, term750663.getClass(), "parent", null);
        term750580 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term750591 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term750580, term750580.getClass(), "functionName", null);
        setBooleanField(term750580, term750580.getClass(), "itsNeedsActivation", false);
        setIntField(term750580, term750580.getClass(), "itsFunctionType", 0);
        setBooleanField(term750580, term750580.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term750580, term750580.getClass(), "encodedSourceStart", 0);
        setIntField(term750580, term750580.getClass(), "encodedSourceEnd", 0);
        setField(term750580, term750580.getClass(), "sourceName", null);
        setIntField(term750580, term750580.getClass(), "baseLineno", 0);
        setIntField(term750580, term750580.getClass(), "endLineno", 0);
        setField(term750580, term750580.getClass(), "functions", null);
        setField(term750580, term750580.getClass(), "regexps", null);
        setField(term750580, term750580.getClass(), "itsVariables", null);
        setField(term750580, term750580.getClass(), "itsConst", null);
        setField(term750580, term750580.getClass(), "itsVariableNames", null);
        setIntField(term750580, term750580.getClass(), "varStart", 0);
        setField(term750580, term750580.getClass(), "compilerData", null);
        setIntField(term750580, term750580.getClass(), "type", 100);
        setField(term750580, term750580.getClass(), "next", null);
        setField(term750580, term750580.getClass(), "first", null);
        setField(term750580, term750580.getClass(), "last", null);
        setField(term750580, term750580.getClass(), "propListHead", null);
        setIntField(term750580, term750580.getClass(), "sourcePosition", 0);
        setField(term750580, term750580.getClass(), "jsType", null);
        setDoubleField(term750591, term750591.getClass(), "number", 0.0);
        setIntField(term750591, term750591.getClass(), "type", 108);
        setField(term750591, term750591.getClass(), "next", null);
        setField(term750591, term750591.getClass(), "first", null);
        setField(term750591, term750591.getClass(), "last", null);
        setField(term750591, term750591.getClass(), "propListHead", null);
        setIntField(term750591, term750591.getClass(), "sourcePosition", 0);
        setField(term750591, term750591.getClass(), "jsType", null);
        setField(term750591, term750591.getClass(), "parent", null);
        setField(term750580, term750580.getClass(), "parent", term750591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term750214;
        args[1] = term750398;
        args[2] = term750490;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term750128, args);
        assertTrue(recursiveEquals(term750128, term750659));
        assertTrue(recursiveEquals(term750214, term750660));
        assertTrue(recursiveEquals(term750398, term750662));
        assertTrue(recursiveEquals(term750490, term750663));
        assertTrue(recursiveEquals(retValue, term750580));
    }

};


