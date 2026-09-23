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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2450736;
     Object term2450828;
     Object term2615579;
     Object term2615580;
     Object term2615450;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2450736 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2450828 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2450914 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2450984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2451070 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2450828, term2450828.getClass(), "type", 37);
        setIntField(term2450914, term2450914.getClass(), "type", 35);
        setField(term2450984, term2450984.getClass(), "next", term2451070);
        setIntField(term2450984, term2450984.getClass(), "type", 40);
        setField(term2450914, term2450914.getClass(), "first", term2450984);
        setField(term2450828, term2450828.getClass(), "first", term2450914);
        term2615579 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2615579, term2615579.getClass(), "currentTraversal", null);
        term2615580 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2615581 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2615582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2615583 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term2615580, term2615580.getClass(), "str", null);
        setIntField(term2615580, term2615580.getClass(), "type", 37);
        setField(term2615580, term2615580.getClass(), "next", null);
        setField(term2615581, term2615581.getClass(), "functionName", null);
        setBooleanField(term2615581, term2615581.getClass(), "itsNeedsActivation", false);
        setIntField(term2615581, term2615581.getClass(), "itsFunctionType", 0);
        setBooleanField(term2615581, term2615581.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2615581, term2615581.getClass(), "encodedSourceStart", 0);
        setIntField(term2615581, term2615581.getClass(), "encodedSourceEnd", 0);
        setField(term2615581, term2615581.getClass(), "sourceName", null);
        setIntField(term2615581, term2615581.getClass(), "baseLineno", 0);
        setIntField(term2615581, term2615581.getClass(), "endLineno", 0);
        setField(term2615581, term2615581.getClass(), "functions", null);
        setField(term2615581, term2615581.getClass(), "regexps", null);
        setField(term2615581, term2615581.getClass(), "itsVariables", null);
        setField(term2615581, term2615581.getClass(), "itsConst", null);
        setField(term2615581, term2615581.getClass(), "itsVariableNames", null);
        setIntField(term2615581, term2615581.getClass(), "varStart", 0);
        setField(term2615581, term2615581.getClass(), "compilerData", null);
        setIntField(term2615581, term2615581.getClass(), "type", 35);
        setField(term2615581, term2615581.getClass(), "next", null);
        setIntField(term2615582, term2615582.getClass(), "type", 40);
        setField(term2615583, term2615583.getClass(), "functionName", null);
        setBooleanField(term2615583, term2615583.getClass(), "itsNeedsActivation", false);
        setIntField(term2615583, term2615583.getClass(), "itsFunctionType", 0);
        setBooleanField(term2615583, term2615583.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2615583, term2615583.getClass(), "encodedSourceStart", 0);
        setIntField(term2615583, term2615583.getClass(), "encodedSourceEnd", 0);
        setField(term2615583, term2615583.getClass(), "sourceName", null);
        setIntField(term2615583, term2615583.getClass(), "baseLineno", 0);
        setIntField(term2615583, term2615583.getClass(), "endLineno", 0);
        setField(term2615583, term2615583.getClass(), "functions", null);
        setField(term2615583, term2615583.getClass(), "regexps", null);
        setField(term2615583, term2615583.getClass(), "itsVariables", null);
        setField(term2615583, term2615583.getClass(), "itsConst", null);
        setField(term2615583, term2615583.getClass(), "itsVariableNames", null);
        setIntField(term2615583, term2615583.getClass(), "varStart", 0);
        setField(term2615583, term2615583.getClass(), "compilerData", null);
        setIntField(term2615583, term2615583.getClass(), "type", 0);
        setField(term2615583, term2615583.getClass(), "next", null);
        setField(term2615583, term2615583.getClass(), "first", null);
        setField(term2615583, term2615583.getClass(), "last", null);
        setField(term2615583, term2615583.getClass(), "propListHead", null);
        setIntField(term2615583, term2615583.getClass(), "sourcePosition", 0);
        setField(term2615583, term2615583.getClass(), "jsType", null);
        setField(term2615583, term2615583.getClass(), "parent", null);
        setField(term2615582, term2615582.getClass(), "next", term2615583);
        setField(term2615582, term2615582.getClass(), "first", null);
        setField(term2615582, term2615582.getClass(), "last", null);
        setField(term2615582, term2615582.getClass(), "propListHead", null);
        setIntField(term2615582, term2615582.getClass(), "sourcePosition", 0);
        setField(term2615582, term2615582.getClass(), "jsType", null);
        setField(term2615582, term2615582.getClass(), "parent", null);
        setField(term2615581, term2615581.getClass(), "first", term2615582);
        setField(term2615581, term2615581.getClass(), "last", null);
        setField(term2615581, term2615581.getClass(), "propListHead", null);
        setIntField(term2615581, term2615581.getClass(), "sourcePosition", 0);
        setField(term2615581, term2615581.getClass(), "jsType", null);
        setField(term2615581, term2615581.getClass(), "parent", null);
        setField(term2615580, term2615580.getClass(), "first", term2615581);
        setField(term2615580, term2615580.getClass(), "last", null);
        setField(term2615580, term2615580.getClass(), "propListHead", null);
        setIntField(term2615580, term2615580.getClass(), "sourcePosition", 0);
        setField(term2615580, term2615580.getClass(), "jsType", null);
        setField(term2615580, term2615580.getClass(), "parent", null);
        term2615450 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2615452 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2615462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2615464 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term2615450, term2615450.getClass(), "str", null);
        setIntField(term2615450, term2615450.getClass(), "type", 37);
        setField(term2615450, term2615450.getClass(), "next", null);
        setField(term2615452, term2615452.getClass(), "functionName", null);
        setBooleanField(term2615452, term2615452.getClass(), "itsNeedsActivation", false);
        setIntField(term2615452, term2615452.getClass(), "itsFunctionType", 0);
        setBooleanField(term2615452, term2615452.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2615452, term2615452.getClass(), "encodedSourceStart", 0);
        setIntField(term2615452, term2615452.getClass(), "encodedSourceEnd", 0);
        setField(term2615452, term2615452.getClass(), "sourceName", null);
        setIntField(term2615452, term2615452.getClass(), "baseLineno", 0);
        setIntField(term2615452, term2615452.getClass(), "endLineno", 0);
        setField(term2615452, term2615452.getClass(), "functions", null);
        setField(term2615452, term2615452.getClass(), "regexps", null);
        setField(term2615452, term2615452.getClass(), "itsVariables", null);
        setField(term2615452, term2615452.getClass(), "itsConst", null);
        setField(term2615452, term2615452.getClass(), "itsVariableNames", null);
        setIntField(term2615452, term2615452.getClass(), "varStart", 0);
        setField(term2615452, term2615452.getClass(), "compilerData", null);
        setIntField(term2615452, term2615452.getClass(), "type", 35);
        setField(term2615452, term2615452.getClass(), "next", null);
        setIntField(term2615462, term2615462.getClass(), "type", 40);
        setField(term2615464, term2615464.getClass(), "functionName", null);
        setBooleanField(term2615464, term2615464.getClass(), "itsNeedsActivation", false);
        setIntField(term2615464, term2615464.getClass(), "itsFunctionType", 0);
        setBooleanField(term2615464, term2615464.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2615464, term2615464.getClass(), "encodedSourceStart", 0);
        setIntField(term2615464, term2615464.getClass(), "encodedSourceEnd", 0);
        setField(term2615464, term2615464.getClass(), "sourceName", null);
        setIntField(term2615464, term2615464.getClass(), "baseLineno", 0);
        setIntField(term2615464, term2615464.getClass(), "endLineno", 0);
        setField(term2615464, term2615464.getClass(), "functions", null);
        setField(term2615464, term2615464.getClass(), "regexps", null);
        setField(term2615464, term2615464.getClass(), "itsVariables", null);
        setField(term2615464, term2615464.getClass(), "itsConst", null);
        setField(term2615464, term2615464.getClass(), "itsVariableNames", null);
        setIntField(term2615464, term2615464.getClass(), "varStart", 0);
        setField(term2615464, term2615464.getClass(), "compilerData", null);
        setIntField(term2615464, term2615464.getClass(), "type", 0);
        setField(term2615464, term2615464.getClass(), "next", null);
        setField(term2615464, term2615464.getClass(), "first", null);
        setField(term2615464, term2615464.getClass(), "last", null);
        setField(term2615464, term2615464.getClass(), "propListHead", null);
        setIntField(term2615464, term2615464.getClass(), "sourcePosition", 0);
        setField(term2615464, term2615464.getClass(), "jsType", null);
        setField(term2615464, term2615464.getClass(), "parent", null);
        setField(term2615462, term2615462.getClass(), "next", term2615464);
        setField(term2615462, term2615462.getClass(), "first", null);
        setField(term2615462, term2615462.getClass(), "last", null);
        setField(term2615462, term2615462.getClass(), "propListHead", null);
        setIntField(term2615462, term2615462.getClass(), "sourcePosition", 0);
        setField(term2615462, term2615462.getClass(), "jsType", null);
        setField(term2615462, term2615462.getClass(), "parent", null);
        setField(term2615452, term2615452.getClass(), "first", term2615462);
        setField(term2615452, term2615452.getClass(), "last", null);
        setField(term2615452, term2615452.getClass(), "propListHead", null);
        setIntField(term2615452, term2615452.getClass(), "sourcePosition", 0);
        setField(term2615452, term2615452.getClass(), "jsType", null);
        setField(term2615452, term2615452.getClass(), "parent", null);
        setField(term2615450, term2615450.getClass(), "first", term2615452);
        setField(term2615450, term2615450.getClass(), "last", null);
        setField(term2615450, term2615450.getClass(), "propListHead", null);
        setIntField(term2615450, term2615450.getClass(), "sourcePosition", 0);
        setField(term2615450, term2615450.getClass(), "jsType", null);
        setField(term2615450, term2615450.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2450828;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2450736, args);
        assertTrue(recursiveEquals(term2450736, term2615579));
        assertTrue(recursiveEquals(term2450828, term2615580));
        assertTrue(recursiveEquals(retValue, term2615450));
    }

};


