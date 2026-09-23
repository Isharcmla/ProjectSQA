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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3575963;
     Object term3576055;
     Object term3578050;
     Object term3578051;
     Object term3577683;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3575963 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3576055 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3576147 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3576239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3576331 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3576455 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3576147, term3576147.getClass(), "type", 35);
        setIntField(term3576331, term3576331.getClass(), "type", 40);
        setField(term3576331, term3576331.getClass(), "str", "charCodeAt");
        setField(term3576239, term3576239.getClass(), "next", term3576331);
        setIntField(term3576239, term3576239.getClass(), "type", 40);
        setField(term3576147, term3576147.getClass(), "first", term3576239);
        setIntField(term3576455, term3576455.getClass(), "type", 40);
        setField(term3576147, term3576147.getClass(), "next", term3576455);
        setField(term3576055, term3576055.getClass(), "first", term3576147);
        setIntField(term3576055, term3576055.getClass(), "type", 37);
        term3578050 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3578050, term3578050.getClass(), "currentTraversal", null);
        term3578051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3578052 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3578053 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3578054 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3578055 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3578051, term3578051.getClass(), "str", null);
        setIntField(term3578051, term3578051.getClass(), "type", 37);
        setField(term3578051, term3578051.getClass(), "next", null);
        setField(term3578052, term3578052.getClass(), "str", null);
        setIntField(term3578052, term3578052.getClass(), "type", 35);
        setField(term3578053, term3578053.getClass(), "functionName", null);
        setBooleanField(term3578053, term3578053.getClass(), "itsNeedsActivation", false);
        setIntField(term3578053, term3578053.getClass(), "itsFunctionType", 0);
        setBooleanField(term3578053, term3578053.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3578053, term3578053.getClass(), "encodedSourceStart", 0);
        setIntField(term3578053, term3578053.getClass(), "encodedSourceEnd", 0);
        setField(term3578053, term3578053.getClass(), "sourceName", null);
        setIntField(term3578053, term3578053.getClass(), "baseLineno", 0);
        setIntField(term3578053, term3578053.getClass(), "endLineno", 0);
        setField(term3578053, term3578053.getClass(), "functions", null);
        setField(term3578053, term3578053.getClass(), "regexps", null);
        setField(term3578053, term3578053.getClass(), "itsVariables", null);
        setField(term3578053, term3578053.getClass(), "itsConst", null);
        setField(term3578053, term3578053.getClass(), "itsVariableNames", null);
        setIntField(term3578053, term3578053.getClass(), "varStart", 0);
        setField(term3578053, term3578053.getClass(), "compilerData", null);
        setIntField(term3578053, term3578053.getClass(), "type", 40);
        setField(term3578053, term3578053.getClass(), "next", null);
        setField(term3578053, term3578053.getClass(), "first", null);
        setField(term3578053, term3578053.getClass(), "last", null);
        setField(term3578053, term3578053.getClass(), "propListHead", null);
        setIntField(term3578053, term3578053.getClass(), "sourcePosition", 0);
        setField(term3578053, term3578053.getClass(), "jsType", null);
        setField(term3578053, term3578053.getClass(), "parent", null);
        setField(term3578052, term3578052.getClass(), "next", term3578053);
        setField(term3578054, term3578054.getClass(), "str", null);
        setIntField(term3578054, term3578054.getClass(), "type", 40);
        setField(term3578055, term3578055.getClass(), "str", "");
        setIntField(term3578055, term3578055.getClass(), "type", 40);
        setField(term3578055, term3578055.getClass(), "next", null);
        setField(term3578055, term3578055.getClass(), "first", null);
        setField(term3578055, term3578055.getClass(), "last", null);
        setField(term3578055, term3578055.getClass(), "propListHead", null);
        setIntField(term3578055, term3578055.getClass(), "sourcePosition", 0);
        setField(term3578055, term3578055.getClass(), "jsType", null);
        setField(term3578055, term3578055.getClass(), "parent", null);
        setField(term3578054, term3578054.getClass(), "next", term3578055);
        setField(term3578054, term3578054.getClass(), "first", null);
        setField(term3578054, term3578054.getClass(), "last", null);
        setField(term3578054, term3578054.getClass(), "propListHead", null);
        setIntField(term3578054, term3578054.getClass(), "sourcePosition", 0);
        setField(term3578054, term3578054.getClass(), "jsType", null);
        setField(term3578054, term3578054.getClass(), "parent", null);
        setField(term3578052, term3578052.getClass(), "first", term3578054);
        setField(term3578052, term3578052.getClass(), "last", null);
        setField(term3578052, term3578052.getClass(), "propListHead", null);
        setIntField(term3578052, term3578052.getClass(), "sourcePosition", 0);
        setField(term3578052, term3578052.getClass(), "jsType", null);
        setField(term3578052, term3578052.getClass(), "parent", null);
        setField(term3578051, term3578051.getClass(), "first", term3578052);
        setField(term3578051, term3578051.getClass(), "last", null);
        setField(term3578051, term3578051.getClass(), "propListHead", null);
        setIntField(term3578051, term3578051.getClass(), "sourcePosition", 0);
        setField(term3578051, term3578051.getClass(), "jsType", null);
        setField(term3578051, term3578051.getClass(), "parent", null);
        term3577683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3577685 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3577687 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3577698 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3577700 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3577683, term3577683.getClass(), "str", null);
        setIntField(term3577683, term3577683.getClass(), "type", 37);
        setField(term3577683, term3577683.getClass(), "next", null);
        setField(term3577685, term3577685.getClass(), "str", null);
        setIntField(term3577685, term3577685.getClass(), "type", 35);
        setField(term3577687, term3577687.getClass(), "functionName", null);
        setBooleanField(term3577687, term3577687.getClass(), "itsNeedsActivation", false);
        setIntField(term3577687, term3577687.getClass(), "itsFunctionType", 0);
        setBooleanField(term3577687, term3577687.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3577687, term3577687.getClass(), "encodedSourceStart", 0);
        setIntField(term3577687, term3577687.getClass(), "encodedSourceEnd", 0);
        setField(term3577687, term3577687.getClass(), "sourceName", null);
        setIntField(term3577687, term3577687.getClass(), "baseLineno", 0);
        setIntField(term3577687, term3577687.getClass(), "endLineno", 0);
        setField(term3577687, term3577687.getClass(), "functions", null);
        setField(term3577687, term3577687.getClass(), "regexps", null);
        setField(term3577687, term3577687.getClass(), "itsVariables", null);
        setField(term3577687, term3577687.getClass(), "itsConst", null);
        setField(term3577687, term3577687.getClass(), "itsVariableNames", null);
        setIntField(term3577687, term3577687.getClass(), "varStart", 0);
        setField(term3577687, term3577687.getClass(), "compilerData", null);
        setIntField(term3577687, term3577687.getClass(), "type", 40);
        setField(term3577687, term3577687.getClass(), "next", null);
        setField(term3577687, term3577687.getClass(), "first", null);
        setField(term3577687, term3577687.getClass(), "last", null);
        setField(term3577687, term3577687.getClass(), "propListHead", null);
        setIntField(term3577687, term3577687.getClass(), "sourcePosition", 0);
        setField(term3577687, term3577687.getClass(), "jsType", null);
        setField(term3577687, term3577687.getClass(), "parent", null);
        setField(term3577685, term3577685.getClass(), "next", term3577687);
        setField(term3577698, term3577698.getClass(), "str", null);
        setIntField(term3577698, term3577698.getClass(), "type", 40);
        setField(term3577700, term3577700.getClass(), "str", "");
        setIntField(term3577700, term3577700.getClass(), "type", 40);
        setField(term3577700, term3577700.getClass(), "next", null);
        setField(term3577700, term3577700.getClass(), "first", null);
        setField(term3577700, term3577700.getClass(), "last", null);
        setField(term3577700, term3577700.getClass(), "propListHead", null);
        setIntField(term3577700, term3577700.getClass(), "sourcePosition", 0);
        setField(term3577700, term3577700.getClass(), "jsType", null);
        setField(term3577700, term3577700.getClass(), "parent", null);
        setField(term3577698, term3577698.getClass(), "next", term3577700);
        setField(term3577698, term3577698.getClass(), "first", null);
        setField(term3577698, term3577698.getClass(), "last", null);
        setField(term3577698, term3577698.getClass(), "propListHead", null);
        setIntField(term3577698, term3577698.getClass(), "sourcePosition", 0);
        setField(term3577698, term3577698.getClass(), "jsType", null);
        setField(term3577698, term3577698.getClass(), "parent", null);
        setField(term3577685, term3577685.getClass(), "first", term3577698);
        setField(term3577685, term3577685.getClass(), "last", null);
        setField(term3577685, term3577685.getClass(), "propListHead", null);
        setIntField(term3577685, term3577685.getClass(), "sourcePosition", 0);
        setField(term3577685, term3577685.getClass(), "jsType", null);
        setField(term3577685, term3577685.getClass(), "parent", null);
        setField(term3577683, term3577683.getClass(), "first", term3577685);
        setField(term3577683, term3577683.getClass(), "last", null);
        setField(term3577683, term3577683.getClass(), "propListHead", null);
        setIntField(term3577683, term3577683.getClass(), "sourcePosition", 0);
        setField(term3577683, term3577683.getClass(), "jsType", null);
        setField(term3577683, term3577683.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3576055;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3575963, args);
        assertTrue(recursiveEquals(term3575963, term3578050));
        assertTrue(recursiveEquals(term3576055, term3578051));
        assertTrue(recursiveEquals(retValue, term3577683));
    }

};


