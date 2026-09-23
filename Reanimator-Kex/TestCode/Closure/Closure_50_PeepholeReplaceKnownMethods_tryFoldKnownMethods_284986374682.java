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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3598215;
     Object term3598307;
     Object term3600456;
     Object term3600457;
     Object term3600222;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3598215 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3598307 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3598399 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3598491 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3598583 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3598711 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term3598399, term3598399.getClass(), "type", 35);
        setIntField(term3598583, term3598583.getClass(), "type", 40);
        setField(term3598583, term3598583.getClass(), "str", "");
        setField(term3598491, term3598491.getClass(), "next", term3598583);
        setIntField(term3598491, term3598491.getClass(), "type", 40);
        setField(term3598399, term3598399.getClass(), "first", term3598491);
        setIntField(term3598711, term3598711.getClass(), "type", 43);
        setField(term3598399, term3598399.getClass(), "next", term3598711);
        setField(term3598307, term3598307.getClass(), "first", term3598399);
        setIntField(term3598307, term3598307.getClass(), "type", 37);
        term3600456 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3600456, term3600456.getClass(), "currentTraversal", null);
        term3600457 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3600458 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3600459 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term3600460 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3600461 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3600457, term3600457.getClass(), "str", null);
        setIntField(term3600457, term3600457.getClass(), "type", 37);
        setField(term3600457, term3600457.getClass(), "next", null);
        setField(term3600458, term3600458.getClass(), "str", null);
        setIntField(term3600458, term3600458.getClass(), "type", 35);
        setIntField(term3600459, term3600459.getClass(), "encodedSourceStart", 0);
        setIntField(term3600459, term3600459.getClass(), "encodedSourceEnd", 0);
        setField(term3600459, term3600459.getClass(), "sourceName", null);
        setIntField(term3600459, term3600459.getClass(), "baseLineno", 0);
        setIntField(term3600459, term3600459.getClass(), "endLineno", 0);
        setField(term3600459, term3600459.getClass(), "functions", null);
        setField(term3600459, term3600459.getClass(), "regexps", null);
        setField(term3600459, term3600459.getClass(), "itsVariables", null);
        setField(term3600459, term3600459.getClass(), "itsConst", null);
        setField(term3600459, term3600459.getClass(), "itsVariableNames", null);
        setIntField(term3600459, term3600459.getClass(), "varStart", 0);
        setField(term3600459, term3600459.getClass(), "compilerData", null);
        setIntField(term3600459, term3600459.getClass(), "type", 43);
        setField(term3600459, term3600459.getClass(), "next", null);
        setField(term3600459, term3600459.getClass(), "first", null);
        setField(term3600459, term3600459.getClass(), "last", null);
        setField(term3600459, term3600459.getClass(), "propListHead", null);
        setIntField(term3600459, term3600459.getClass(), "sourcePosition", 0);
        setField(term3600459, term3600459.getClass(), "jsType", null);
        setField(term3600459, term3600459.getClass(), "parent", null);
        setField(term3600458, term3600458.getClass(), "next", term3600459);
        setField(term3600460, term3600460.getClass(), "str", null);
        setIntField(term3600460, term3600460.getClass(), "type", 40);
        setField(term3600461, term3600461.getClass(), "str", "");
        setIntField(term3600461, term3600461.getClass(), "type", 40);
        setField(term3600461, term3600461.getClass(), "next", null);
        setField(term3600461, term3600461.getClass(), "first", null);
        setField(term3600461, term3600461.getClass(), "last", null);
        setField(term3600461, term3600461.getClass(), "propListHead", null);
        setIntField(term3600461, term3600461.getClass(), "sourcePosition", 0);
        setField(term3600461, term3600461.getClass(), "jsType", null);
        setField(term3600461, term3600461.getClass(), "parent", null);
        setField(term3600460, term3600460.getClass(), "next", term3600461);
        setField(term3600460, term3600460.getClass(), "first", null);
        setField(term3600460, term3600460.getClass(), "last", null);
        setField(term3600460, term3600460.getClass(), "propListHead", null);
        setIntField(term3600460, term3600460.getClass(), "sourcePosition", 0);
        setField(term3600460, term3600460.getClass(), "jsType", null);
        setField(term3600460, term3600460.getClass(), "parent", null);
        setField(term3600458, term3600458.getClass(), "first", term3600460);
        setField(term3600458, term3600458.getClass(), "last", null);
        setField(term3600458, term3600458.getClass(), "propListHead", null);
        setIntField(term3600458, term3600458.getClass(), "sourcePosition", 0);
        setField(term3600458, term3600458.getClass(), "jsType", null);
        setField(term3600458, term3600458.getClass(), "parent", null);
        setField(term3600457, term3600457.getClass(), "first", term3600458);
        setField(term3600457, term3600457.getClass(), "last", null);
        setField(term3600457, term3600457.getClass(), "propListHead", null);
        setIntField(term3600457, term3600457.getClass(), "sourcePosition", 0);
        setField(term3600457, term3600457.getClass(), "jsType", null);
        setField(term3600457, term3600457.getClass(), "parent", null);
        term3600222 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3600224 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3600226 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term3600234 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3600236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3600222, term3600222.getClass(), "str", null);
        setIntField(term3600222, term3600222.getClass(), "type", 37);
        setField(term3600222, term3600222.getClass(), "next", null);
        setField(term3600224, term3600224.getClass(), "str", null);
        setIntField(term3600224, term3600224.getClass(), "type", 35);
        setIntField(term3600226, term3600226.getClass(), "encodedSourceStart", 0);
        setIntField(term3600226, term3600226.getClass(), "encodedSourceEnd", 0);
        setField(term3600226, term3600226.getClass(), "sourceName", null);
        setIntField(term3600226, term3600226.getClass(), "baseLineno", 0);
        setIntField(term3600226, term3600226.getClass(), "endLineno", 0);
        setField(term3600226, term3600226.getClass(), "functions", null);
        setField(term3600226, term3600226.getClass(), "regexps", null);
        setField(term3600226, term3600226.getClass(), "itsVariables", null);
        setField(term3600226, term3600226.getClass(), "itsConst", null);
        setField(term3600226, term3600226.getClass(), "itsVariableNames", null);
        setIntField(term3600226, term3600226.getClass(), "varStart", 0);
        setField(term3600226, term3600226.getClass(), "compilerData", null);
        setIntField(term3600226, term3600226.getClass(), "type", 43);
        setField(term3600226, term3600226.getClass(), "next", null);
        setField(term3600226, term3600226.getClass(), "first", null);
        setField(term3600226, term3600226.getClass(), "last", null);
        setField(term3600226, term3600226.getClass(), "propListHead", null);
        setIntField(term3600226, term3600226.getClass(), "sourcePosition", 0);
        setField(term3600226, term3600226.getClass(), "jsType", null);
        setField(term3600226, term3600226.getClass(), "parent", null);
        setField(term3600224, term3600224.getClass(), "next", term3600226);
        setField(term3600234, term3600234.getClass(), "str", null);
        setIntField(term3600234, term3600234.getClass(), "type", 40);
        setField(term3600236, term3600236.getClass(), "str", "");
        setIntField(term3600236, term3600236.getClass(), "type", 40);
        setField(term3600236, term3600236.getClass(), "next", null);
        setField(term3600236, term3600236.getClass(), "first", null);
        setField(term3600236, term3600236.getClass(), "last", null);
        setField(term3600236, term3600236.getClass(), "propListHead", null);
        setIntField(term3600236, term3600236.getClass(), "sourcePosition", 0);
        setField(term3600236, term3600236.getClass(), "jsType", null);
        setField(term3600236, term3600236.getClass(), "parent", null);
        setField(term3600234, term3600234.getClass(), "next", term3600236);
        setField(term3600234, term3600234.getClass(), "first", null);
        setField(term3600234, term3600234.getClass(), "last", null);
        setField(term3600234, term3600234.getClass(), "propListHead", null);
        setIntField(term3600234, term3600234.getClass(), "sourcePosition", 0);
        setField(term3600234, term3600234.getClass(), "jsType", null);
        setField(term3600234, term3600234.getClass(), "parent", null);
        setField(term3600224, term3600224.getClass(), "first", term3600234);
        setField(term3600224, term3600224.getClass(), "last", null);
        setField(term3600224, term3600224.getClass(), "propListHead", null);
        setIntField(term3600224, term3600224.getClass(), "sourcePosition", 0);
        setField(term3600224, term3600224.getClass(), "jsType", null);
        setField(term3600224, term3600224.getClass(), "parent", null);
        setField(term3600222, term3600222.getClass(), "first", term3600224);
        setField(term3600222, term3600222.getClass(), "last", null);
        setField(term3600222, term3600222.getClass(), "propListHead", null);
        setIntField(term3600222, term3600222.getClass(), "sourcePosition", 0);
        setField(term3600222, term3600222.getClass(), "jsType", null);
        setField(term3600222, term3600222.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3598307;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3598215, args);
        assertTrue(recursiveEquals(term3598215, term3600456));
        assertTrue(recursiveEquals(term3598307, term3600457));
        assertTrue(recursiveEquals(retValue, term3600222));
    }

};


