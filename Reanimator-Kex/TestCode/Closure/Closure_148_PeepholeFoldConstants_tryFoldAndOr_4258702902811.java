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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term815629;
     Object term815715;
     Object term815899;
     Object term815991;
     Object term816647;
     Object term816648;
     Object term816650;
     Object term816651;
     Object term816569;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term815629 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term815715 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term815807 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term815807, term815807.getClass(), "type", 114);
        setField(term815715, term815715.getClass(), "parent", term815807);
        setIntField(term815715, term815715.getClass(), "type", 0);
        term815899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term815899, term815899.getClass(), "type", 31);
        term815991 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term815991, term815991.getClass(), "type", 63);
        term816647 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term816647, term816647.getClass(), "currentTraversal", null);
        term816648 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term816649 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term816648, term816648.getClass(), "functionName", null);
        setBooleanField(term816648, term816648.getClass(), "itsNeedsActivation", false);
        setIntField(term816648, term816648.getClass(), "itsFunctionType", 0);
        setBooleanField(term816648, term816648.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term816648, term816648.getClass(), "encodedSourceStart", 0);
        setIntField(term816648, term816648.getClass(), "encodedSourceEnd", 0);
        setField(term816648, term816648.getClass(), "sourceName", null);
        setIntField(term816648, term816648.getClass(), "baseLineno", 0);
        setIntField(term816648, term816648.getClass(), "endLineno", 0);
        setField(term816648, term816648.getClass(), "functions", null);
        setField(term816648, term816648.getClass(), "regexps", null);
        setField(term816648, term816648.getClass(), "itsVariables", null);
        setField(term816648, term816648.getClass(), "itsConst", null);
        setField(term816648, term816648.getClass(), "itsVariableNames", null);
        setIntField(term816648, term816648.getClass(), "varStart", 0);
        setField(term816648, term816648.getClass(), "compilerData", null);
        setIntField(term816648, term816648.getClass(), "type", 0);
        setField(term816648, term816648.getClass(), "next", null);
        setField(term816648, term816648.getClass(), "first", null);
        setField(term816648, term816648.getClass(), "last", null);
        setField(term816648, term816648.getClass(), "propListHead", null);
        setIntField(term816648, term816648.getClass(), "sourcePosition", 0);
        setField(term816648, term816648.getClass(), "jsType", null);
        setField(term816649, term816649.getClass(), "str", null);
        setIntField(term816649, term816649.getClass(), "type", 114);
        setField(term816649, term816649.getClass(), "next", null);
        setField(term816649, term816649.getClass(), "first", null);
        setField(term816649, term816649.getClass(), "last", null);
        setField(term816649, term816649.getClass(), "propListHead", null);
        setIntField(term816649, term816649.getClass(), "sourcePosition", 0);
        setField(term816649, term816649.getClass(), "jsType", null);
        setField(term816649, term816649.getClass(), "parent", null);
        setField(term816648, term816648.getClass(), "parent", term816649);
        term816650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term816650, term816650.getClass(), "str", null);
        setIntField(term816650, term816650.getClass(), "type", 31);
        setField(term816650, term816650.getClass(), "next", null);
        setField(term816650, term816650.getClass(), "first", null);
        setField(term816650, term816650.getClass(), "last", null);
        setField(term816650, term816650.getClass(), "propListHead", null);
        setIntField(term816650, term816650.getClass(), "sourcePosition", 0);
        setField(term816650, term816650.getClass(), "jsType", null);
        setField(term816650, term816650.getClass(), "parent", null);
        term816651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term816651, term816651.getClass(), "number", 0.0);
        setIntField(term816651, term816651.getClass(), "type", 63);
        setField(term816651, term816651.getClass(), "next", null);
        setField(term816651, term816651.getClass(), "first", null);
        setField(term816651, term816651.getClass(), "last", null);
        setField(term816651, term816651.getClass(), "propListHead", null);
        setIntField(term816651, term816651.getClass(), "sourcePosition", 0);
        setField(term816651, term816651.getClass(), "jsType", null);
        setField(term816651, term816651.getClass(), "parent", null);
        term816569 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term816580 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term816569, term816569.getClass(), "functionName", null);
        setBooleanField(term816569, term816569.getClass(), "itsNeedsActivation", false);
        setIntField(term816569, term816569.getClass(), "itsFunctionType", 0);
        setBooleanField(term816569, term816569.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term816569, term816569.getClass(), "encodedSourceStart", 0);
        setIntField(term816569, term816569.getClass(), "encodedSourceEnd", 0);
        setField(term816569, term816569.getClass(), "sourceName", null);
        setIntField(term816569, term816569.getClass(), "baseLineno", 0);
        setIntField(term816569, term816569.getClass(), "endLineno", 0);
        setField(term816569, term816569.getClass(), "functions", null);
        setField(term816569, term816569.getClass(), "regexps", null);
        setField(term816569, term816569.getClass(), "itsVariables", null);
        setField(term816569, term816569.getClass(), "itsConst", null);
        setField(term816569, term816569.getClass(), "itsVariableNames", null);
        setIntField(term816569, term816569.getClass(), "varStart", 0);
        setField(term816569, term816569.getClass(), "compilerData", null);
        setIntField(term816569, term816569.getClass(), "type", 0);
        setField(term816569, term816569.getClass(), "next", null);
        setField(term816569, term816569.getClass(), "first", null);
        setField(term816569, term816569.getClass(), "last", null);
        setField(term816569, term816569.getClass(), "propListHead", null);
        setIntField(term816569, term816569.getClass(), "sourcePosition", 0);
        setField(term816569, term816569.getClass(), "jsType", null);
        setField(term816580, term816580.getClass(), "str", null);
        setIntField(term816580, term816580.getClass(), "type", 114);
        setField(term816580, term816580.getClass(), "next", null);
        setField(term816580, term816580.getClass(), "first", null);
        setField(term816580, term816580.getClass(), "last", null);
        setField(term816580, term816580.getClass(), "propListHead", null);
        setIntField(term816580, term816580.getClass(), "sourcePosition", 0);
        setField(term816580, term816580.getClass(), "jsType", null);
        setField(term816580, term816580.getClass(), "parent", null);
        setField(term816569, term816569.getClass(), "parent", term816580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term815715;
        args[1] = term815899;
        args[2] = term815991;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term815629, args);
        assertTrue(recursiveEquals(term815629, term816647));
        assertTrue(recursiveEquals(term815715, term816648));
        assertTrue(recursiveEquals(term815899, term816650));
        assertTrue(recursiveEquals(term815991, term816651));
        assertTrue(recursiveEquals(retValue, term816569));
    }

};


