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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5491020;
     Object term5491112;
     Object term5494147;
     Object term5494148;
     Object term5493788;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5491020 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term5491112 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5491204 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5491296 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5491388 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5491556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5491648 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term5491204, term5491204.getClass(), "type", 35);
        setIntField(term5491388, term5491388.getClass(), "type", 40);
        setField(term5491388, term5491388.getClass(), "str", "indexOf");
        setField(term5491296, term5491296.getClass(), "next", term5491388);
        setIntField(term5491296, term5491296.getClass(), "type", 40);
        setField(term5491296, term5491296.getClass(), "str", "");
        setField(term5491204, term5491204.getClass(), "first", term5491296);
        setIntField(term5491556, term5491556.getClass(), "type", 44);
        setField(term5491556, term5491556.getClass(), "next", term5491648);
        setField(term5491204, term5491204.getClass(), "next", term5491556);
        setField(term5491112, term5491112.getClass(), "first", term5491204);
        setIntField(term5491112, term5491112.getClass(), "type", 37);
        term5494147 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term5494147, term5494147.getClass(), "currentTraversal", null);
        term5494148 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5494149 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5494150 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5494151 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5494152 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5494155 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5494148, term5494148.getClass(), "str", null);
        setIntField(term5494148, term5494148.getClass(), "type", 37);
        setField(term5494148, term5494148.getClass(), "next", null);
        setField(term5494149, term5494149.getClass(), "str", null);
        setIntField(term5494149, term5494149.getClass(), "type", 35);
        setField(term5494150, term5494150.getClass(), "str", null);
        setIntField(term5494150, term5494150.getClass(), "type", 44);
        setDoubleField(term5494151, term5494151.getClass(), "number", 0.0);
        setIntField(term5494151, term5494151.getClass(), "type", 0);
        setField(term5494151, term5494151.getClass(), "next", null);
        setField(term5494151, term5494151.getClass(), "first", null);
        setField(term5494151, term5494151.getClass(), "last", null);
        setField(term5494151, term5494151.getClass(), "propListHead", null);
        setIntField(term5494151, term5494151.getClass(), "sourcePosition", 0);
        setField(term5494151, term5494151.getClass(), "jsType", null);
        setField(term5494151, term5494151.getClass(), "parent", null);
        setField(term5494150, term5494150.getClass(), "next", term5494151);
        setField(term5494150, term5494150.getClass(), "first", null);
        setField(term5494150, term5494150.getClass(), "last", null);
        setField(term5494150, term5494150.getClass(), "propListHead", null);
        setIntField(term5494150, term5494150.getClass(), "sourcePosition", 0);
        setField(term5494150, term5494150.getClass(), "jsType", null);
        setField(term5494150, term5494150.getClass(), "parent", null);
        setField(term5494149, term5494149.getClass(), "next", term5494150);
        setField(term5494152, term5494152.getClass(), "str", "");
        setIntField(term5494152, term5494152.getClass(), "type", 40);
        setField(term5494155, term5494155.getClass(), "str", "");
        setIntField(term5494155, term5494155.getClass(), "type", 40);
        setField(term5494155, term5494155.getClass(), "next", null);
        setField(term5494155, term5494155.getClass(), "first", null);
        setField(term5494155, term5494155.getClass(), "last", null);
        setField(term5494155, term5494155.getClass(), "propListHead", null);
        setIntField(term5494155, term5494155.getClass(), "sourcePosition", 0);
        setField(term5494155, term5494155.getClass(), "jsType", null);
        setField(term5494155, term5494155.getClass(), "parent", null);
        setField(term5494152, term5494152.getClass(), "next", term5494155);
        setField(term5494152, term5494152.getClass(), "first", null);
        setField(term5494152, term5494152.getClass(), "last", null);
        setField(term5494152, term5494152.getClass(), "propListHead", null);
        setIntField(term5494152, term5494152.getClass(), "sourcePosition", 0);
        setField(term5494152, term5494152.getClass(), "jsType", null);
        setField(term5494152, term5494152.getClass(), "parent", null);
        setField(term5494149, term5494149.getClass(), "first", term5494152);
        setField(term5494149, term5494149.getClass(), "last", null);
        setField(term5494149, term5494149.getClass(), "propListHead", null);
        setIntField(term5494149, term5494149.getClass(), "sourcePosition", 0);
        setField(term5494149, term5494149.getClass(), "jsType", null);
        setField(term5494149, term5494149.getClass(), "parent", null);
        setField(term5494148, term5494148.getClass(), "first", term5494149);
        setField(term5494148, term5494148.getClass(), "last", null);
        setField(term5494148, term5494148.getClass(), "propListHead", null);
        setIntField(term5494148, term5494148.getClass(), "sourcePosition", 0);
        setField(term5494148, term5494148.getClass(), "jsType", null);
        setField(term5494148, term5494148.getClass(), "parent", null);
        term5493788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5493790 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5493792 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5493794 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5493799 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5493803 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5493788, term5493788.getClass(), "str", null);
        setIntField(term5493788, term5493788.getClass(), "type", 37);
        setField(term5493788, term5493788.getClass(), "next", null);
        setField(term5493790, term5493790.getClass(), "str", null);
        setIntField(term5493790, term5493790.getClass(), "type", 35);
        setField(term5493792, term5493792.getClass(), "str", null);
        setIntField(term5493792, term5493792.getClass(), "type", 44);
        setDoubleField(term5493794, term5493794.getClass(), "number", 0.0);
        setIntField(term5493794, term5493794.getClass(), "type", 0);
        setField(term5493794, term5493794.getClass(), "next", null);
        setField(term5493794, term5493794.getClass(), "first", null);
        setField(term5493794, term5493794.getClass(), "last", null);
        setField(term5493794, term5493794.getClass(), "propListHead", null);
        setIntField(term5493794, term5493794.getClass(), "sourcePosition", 0);
        setField(term5493794, term5493794.getClass(), "jsType", null);
        setField(term5493794, term5493794.getClass(), "parent", null);
        setField(term5493792, term5493792.getClass(), "next", term5493794);
        setField(term5493792, term5493792.getClass(), "first", null);
        setField(term5493792, term5493792.getClass(), "last", null);
        setField(term5493792, term5493792.getClass(), "propListHead", null);
        setIntField(term5493792, term5493792.getClass(), "sourcePosition", 0);
        setField(term5493792, term5493792.getClass(), "jsType", null);
        setField(term5493792, term5493792.getClass(), "parent", null);
        setField(term5493790, term5493790.getClass(), "next", term5493792);
        setField(term5493799, term5493799.getClass(), "str", "");
        setIntField(term5493799, term5493799.getClass(), "type", 40);
        setField(term5493803, term5493803.getClass(), "str", "");
        setIntField(term5493803, term5493803.getClass(), "type", 40);
        setField(term5493803, term5493803.getClass(), "next", null);
        setField(term5493803, term5493803.getClass(), "first", null);
        setField(term5493803, term5493803.getClass(), "last", null);
        setField(term5493803, term5493803.getClass(), "propListHead", null);
        setIntField(term5493803, term5493803.getClass(), "sourcePosition", 0);
        setField(term5493803, term5493803.getClass(), "jsType", null);
        setField(term5493803, term5493803.getClass(), "parent", null);
        setField(term5493799, term5493799.getClass(), "next", term5493803);
        setField(term5493799, term5493799.getClass(), "first", null);
        setField(term5493799, term5493799.getClass(), "last", null);
        setField(term5493799, term5493799.getClass(), "propListHead", null);
        setIntField(term5493799, term5493799.getClass(), "sourcePosition", 0);
        setField(term5493799, term5493799.getClass(), "jsType", null);
        setField(term5493799, term5493799.getClass(), "parent", null);
        setField(term5493790, term5493790.getClass(), "first", term5493799);
        setField(term5493790, term5493790.getClass(), "last", null);
        setField(term5493790, term5493790.getClass(), "propListHead", null);
        setIntField(term5493790, term5493790.getClass(), "sourcePosition", 0);
        setField(term5493790, term5493790.getClass(), "jsType", null);
        setField(term5493790, term5493790.getClass(), "parent", null);
        setField(term5493788, term5493788.getClass(), "first", term5493790);
        setField(term5493788, term5493788.getClass(), "last", null);
        setField(term5493788, term5493788.getClass(), "propListHead", null);
        setIntField(term5493788, term5493788.getClass(), "sourcePosition", 0);
        setField(term5493788, term5493788.getClass(), "jsType", null);
        setField(term5493788, term5493788.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5491112;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term5491020, args);
        assertTrue(recursiveEquals(term5491020, term5494147));
        assertTrue(recursiveEquals(term5491112, term5494148));
        assertTrue(recursiveEquals(retValue, term5493788));
    }

};


