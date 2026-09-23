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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2692625;
     Object term2692717;
     Object term2694273;
     Object term2694274;
     Object term2694045;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2692625 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2692717 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2692809 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2692901 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2692993 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2693121 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term2692809, term2692809.getClass(), "type", 35);
        setIntField(term2692993, term2692993.getClass(), "type", 40);
        setField(term2692993, term2692993.getClass(), "str", "");
        setField(term2692901, term2692901.getClass(), "next", term2692993);
        setIntField(term2692901, term2692901.getClass(), "type", 40);
        setField(term2692809, term2692809.getClass(), "first", term2692901);
        setField(term2692809, term2692809.getClass(), "next", term2693121);
        setField(term2692717, term2692717.getClass(), "first", term2692809);
        setIntField(term2692717, term2692717.getClass(), "type", 37);
        term2694273 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2694273, term2694273.getClass(), "currentTraversal", null);
        term2694274 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694275 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694276 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term2694277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694278 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2694274, term2694274.getClass(), "str", null);
        setIntField(term2694274, term2694274.getClass(), "type", 37);
        setField(term2694274, term2694274.getClass(), "next", null);
        setField(term2694275, term2694275.getClass(), "str", null);
        setIntField(term2694275, term2694275.getClass(), "type", 35);
        setIntField(term2694276, term2694276.getClass(), "encodedSourceStart", 0);
        setIntField(term2694276, term2694276.getClass(), "encodedSourceEnd", 0);
        setField(term2694276, term2694276.getClass(), "sourceName", null);
        setIntField(term2694276, term2694276.getClass(), "baseLineno", 0);
        setIntField(term2694276, term2694276.getClass(), "endLineno", 0);
        setField(term2694276, term2694276.getClass(), "functions", null);
        setField(term2694276, term2694276.getClass(), "regexps", null);
        setField(term2694276, term2694276.getClass(), "itsVariables", null);
        setField(term2694276, term2694276.getClass(), "itsConst", null);
        setField(term2694276, term2694276.getClass(), "itsVariableNames", null);
        setIntField(term2694276, term2694276.getClass(), "varStart", 0);
        setField(term2694276, term2694276.getClass(), "compilerData", null);
        setIntField(term2694276, term2694276.getClass(), "type", 0);
        setField(term2694276, term2694276.getClass(), "next", null);
        setField(term2694276, term2694276.getClass(), "first", null);
        setField(term2694276, term2694276.getClass(), "last", null);
        setField(term2694276, term2694276.getClass(), "propListHead", null);
        setIntField(term2694276, term2694276.getClass(), "sourcePosition", 0);
        setField(term2694276, term2694276.getClass(), "jsType", null);
        setField(term2694276, term2694276.getClass(), "parent", null);
        setField(term2694275, term2694275.getClass(), "next", term2694276);
        setField(term2694277, term2694277.getClass(), "str", null);
        setIntField(term2694277, term2694277.getClass(), "type", 40);
        setField(term2694278, term2694278.getClass(), "str", "");
        setIntField(term2694278, term2694278.getClass(), "type", 40);
        setField(term2694278, term2694278.getClass(), "next", null);
        setField(term2694278, term2694278.getClass(), "first", null);
        setField(term2694278, term2694278.getClass(), "last", null);
        setField(term2694278, term2694278.getClass(), "propListHead", null);
        setIntField(term2694278, term2694278.getClass(), "sourcePosition", 0);
        setField(term2694278, term2694278.getClass(), "jsType", null);
        setField(term2694278, term2694278.getClass(), "parent", null);
        setField(term2694277, term2694277.getClass(), "next", term2694278);
        setField(term2694277, term2694277.getClass(), "first", null);
        setField(term2694277, term2694277.getClass(), "last", null);
        setField(term2694277, term2694277.getClass(), "propListHead", null);
        setIntField(term2694277, term2694277.getClass(), "sourcePosition", 0);
        setField(term2694277, term2694277.getClass(), "jsType", null);
        setField(term2694277, term2694277.getClass(), "parent", null);
        setField(term2694275, term2694275.getClass(), "first", term2694277);
        setField(term2694275, term2694275.getClass(), "last", null);
        setField(term2694275, term2694275.getClass(), "propListHead", null);
        setIntField(term2694275, term2694275.getClass(), "sourcePosition", 0);
        setField(term2694275, term2694275.getClass(), "jsType", null);
        setField(term2694275, term2694275.getClass(), "parent", null);
        setField(term2694274, term2694274.getClass(), "first", term2694275);
        setField(term2694274, term2694274.getClass(), "last", null);
        setField(term2694274, term2694274.getClass(), "propListHead", null);
        setIntField(term2694274, term2694274.getClass(), "sourcePosition", 0);
        setField(term2694274, term2694274.getClass(), "jsType", null);
        setField(term2694274, term2694274.getClass(), "parent", null);
        term2694045 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694047 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694049 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term2694057 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694059 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2694045, term2694045.getClass(), "str", null);
        setIntField(term2694045, term2694045.getClass(), "type", 37);
        setField(term2694045, term2694045.getClass(), "next", null);
        setField(term2694047, term2694047.getClass(), "str", null);
        setIntField(term2694047, term2694047.getClass(), "type", 35);
        setIntField(term2694049, term2694049.getClass(), "encodedSourceStart", 0);
        setIntField(term2694049, term2694049.getClass(), "encodedSourceEnd", 0);
        setField(term2694049, term2694049.getClass(), "sourceName", null);
        setIntField(term2694049, term2694049.getClass(), "baseLineno", 0);
        setIntField(term2694049, term2694049.getClass(), "endLineno", 0);
        setField(term2694049, term2694049.getClass(), "functions", null);
        setField(term2694049, term2694049.getClass(), "regexps", null);
        setField(term2694049, term2694049.getClass(), "itsVariables", null);
        setField(term2694049, term2694049.getClass(), "itsConst", null);
        setField(term2694049, term2694049.getClass(), "itsVariableNames", null);
        setIntField(term2694049, term2694049.getClass(), "varStart", 0);
        setField(term2694049, term2694049.getClass(), "compilerData", null);
        setIntField(term2694049, term2694049.getClass(), "type", 0);
        setField(term2694049, term2694049.getClass(), "next", null);
        setField(term2694049, term2694049.getClass(), "first", null);
        setField(term2694049, term2694049.getClass(), "last", null);
        setField(term2694049, term2694049.getClass(), "propListHead", null);
        setIntField(term2694049, term2694049.getClass(), "sourcePosition", 0);
        setField(term2694049, term2694049.getClass(), "jsType", null);
        setField(term2694049, term2694049.getClass(), "parent", null);
        setField(term2694047, term2694047.getClass(), "next", term2694049);
        setField(term2694057, term2694057.getClass(), "str", null);
        setIntField(term2694057, term2694057.getClass(), "type", 40);
        setField(term2694059, term2694059.getClass(), "str", "");
        setIntField(term2694059, term2694059.getClass(), "type", 40);
        setField(term2694059, term2694059.getClass(), "next", null);
        setField(term2694059, term2694059.getClass(), "first", null);
        setField(term2694059, term2694059.getClass(), "last", null);
        setField(term2694059, term2694059.getClass(), "propListHead", null);
        setIntField(term2694059, term2694059.getClass(), "sourcePosition", 0);
        setField(term2694059, term2694059.getClass(), "jsType", null);
        setField(term2694059, term2694059.getClass(), "parent", null);
        setField(term2694057, term2694057.getClass(), "next", term2694059);
        setField(term2694057, term2694057.getClass(), "first", null);
        setField(term2694057, term2694057.getClass(), "last", null);
        setField(term2694057, term2694057.getClass(), "propListHead", null);
        setIntField(term2694057, term2694057.getClass(), "sourcePosition", 0);
        setField(term2694057, term2694057.getClass(), "jsType", null);
        setField(term2694057, term2694057.getClass(), "parent", null);
        setField(term2694047, term2694047.getClass(), "first", term2694057);
        setField(term2694047, term2694047.getClass(), "last", null);
        setField(term2694047, term2694047.getClass(), "propListHead", null);
        setIntField(term2694047, term2694047.getClass(), "sourcePosition", 0);
        setField(term2694047, term2694047.getClass(), "jsType", null);
        setField(term2694047, term2694047.getClass(), "parent", null);
        setField(term2694045, term2694045.getClass(), "first", term2694047);
        setField(term2694045, term2694045.getClass(), "last", null);
        setField(term2694045, term2694045.getClass(), "propListHead", null);
        setIntField(term2694045, term2694045.getClass(), "sourcePosition", 0);
        setField(term2694045, term2694045.getClass(), "jsType", null);
        setField(term2694045, term2694045.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2692717;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term2692625, args);
        assertTrue(recursiveEquals(term2692625, term2694273));
        assertTrue(recursiveEquals(term2692717, term2694274));
        assertTrue(recursiveEquals(retValue, term2694045));
    }

};


