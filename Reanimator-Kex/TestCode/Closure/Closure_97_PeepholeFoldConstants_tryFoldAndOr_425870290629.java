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

public class PeepholeFoldConstants_tryFoldAndOr_425870290629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164022;
     Object term164114;
     Object term164206;
     Object term164292;
     Object term164730;
     Object term164731;
     Object term164732;
     Object term164733;
     Object term164683;

    public PeepholeFoldConstants_tryFoldAndOr_425870290629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164022 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term164114 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term164114, term164114.getClass(), "parent", null);
        setIntField(term164114, term164114.getClass(), "type", 0);
        term164206 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term164206, term164206.getClass(), "type", 0);
        term164292 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term164730 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term164730, term164730.getClass(), "currentTraversal", null);
        term164731 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term164731, term164731.getClass(), "str", null);
        setIntField(term164731, term164731.getClass(), "type", 0);
        setField(term164731, term164731.getClass(), "next", null);
        setField(term164731, term164731.getClass(), "first", null);
        setField(term164731, term164731.getClass(), "last", null);
        setField(term164731, term164731.getClass(), "propListHead", null);
        setIntField(term164731, term164731.getClass(), "sourcePosition", 0);
        setField(term164731, term164731.getClass(), "jsType", null);
        setField(term164731, term164731.getClass(), "parent", null);
        term164732 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term164732, term164732.getClass(), "number", 0.0);
        setIntField(term164732, term164732.getClass(), "type", 0);
        setField(term164732, term164732.getClass(), "next", null);
        setField(term164732, term164732.getClass(), "first", null);
        setField(term164732, term164732.getClass(), "last", null);
        setField(term164732, term164732.getClass(), "propListHead", null);
        setIntField(term164732, term164732.getClass(), "sourcePosition", 0);
        setField(term164732, term164732.getClass(), "jsType", null);
        setField(term164732, term164732.getClass(), "parent", null);
        term164733 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term164733, term164733.getClass(), "functionName", null);
        setBooleanField(term164733, term164733.getClass(), "itsNeedsActivation", false);
        setIntField(term164733, term164733.getClass(), "itsFunctionType", 0);
        setBooleanField(term164733, term164733.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term164733, term164733.getClass(), "encodedSourceStart", 0);
        setIntField(term164733, term164733.getClass(), "encodedSourceEnd", 0);
        setField(term164733, term164733.getClass(), "sourceName", null);
        setIntField(term164733, term164733.getClass(), "baseLineno", 0);
        setIntField(term164733, term164733.getClass(), "endLineno", 0);
        setField(term164733, term164733.getClass(), "functions", null);
        setField(term164733, term164733.getClass(), "regexps", null);
        setField(term164733, term164733.getClass(), "itsVariables", null);
        setField(term164733, term164733.getClass(), "itsConst", null);
        setField(term164733, term164733.getClass(), "itsVariableNames", null);
        setIntField(term164733, term164733.getClass(), "varStart", 0);
        setField(term164733, term164733.getClass(), "compilerData", null);
        setIntField(term164733, term164733.getClass(), "type", 0);
        setField(term164733, term164733.getClass(), "next", null);
        setField(term164733, term164733.getClass(), "first", null);
        setField(term164733, term164733.getClass(), "last", null);
        setField(term164733, term164733.getClass(), "propListHead", null);
        setIntField(term164733, term164733.getClass(), "sourcePosition", 0);
        setField(term164733, term164733.getClass(), "jsType", null);
        setField(term164733, term164733.getClass(), "parent", null);
        term164683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term164683, term164683.getClass(), "str", null);
        setIntField(term164683, term164683.getClass(), "type", 0);
        setField(term164683, term164683.getClass(), "next", null);
        setField(term164683, term164683.getClass(), "first", null);
        setField(term164683, term164683.getClass(), "last", null);
        setField(term164683, term164683.getClass(), "propListHead", null);
        setIntField(term164683, term164683.getClass(), "sourcePosition", 0);
        setField(term164683, term164683.getClass(), "jsType", null);
        setField(term164683, term164683.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term164114;
        args[1] = term164206;
        args[2] = term164292;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term164022, args);
        assertTrue(recursiveEquals(term164022, term164730));
        assertTrue(recursiveEquals(term164114, term164731));
        assertTrue(recursiveEquals(term164206, term164732));
        assertTrue(recursiveEquals(term164292, term164733));
        assertTrue(recursiveEquals(retValue, term164683));
    }

};


