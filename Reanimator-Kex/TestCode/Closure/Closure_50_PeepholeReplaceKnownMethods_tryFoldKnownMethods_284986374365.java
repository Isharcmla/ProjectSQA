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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2642052;
     Object term2642144;
     Object term2643181;
     Object term2643182;
     Object term2643021;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2642052 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2642144 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2642236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2642328 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2642420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2642512 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2642236, term2642236.getClass(), "type", 35);
        setIntField(term2642420, term2642420.getClass(), "type", 40);
        setField(term2642420, term2642420.getClass(), "str", null);
        setField(term2642328, term2642328.getClass(), "next", term2642420);
        setIntField(term2642328, term2642328.getClass(), "type", 40);
        setField(term2642236, term2642236.getClass(), "first", term2642328);
        setField(term2642236, term2642236.getClass(), "next", term2642512);
        setField(term2642144, term2642144.getClass(), "first", term2642236);
        setIntField(term2642144, term2642144.getClass(), "type", 37);
        term2643181 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2643181, term2643181.getClass(), "currentTraversal", null);
        term2643182 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2643183 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2643184 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2643185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2643186 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2643182, term2643182.getClass(), "str", null);
        setIntField(term2643182, term2643182.getClass(), "type", 37);
        setField(term2643182, term2643182.getClass(), "next", null);
        setField(term2643183, term2643183.getClass(), "str", null);
        setIntField(term2643183, term2643183.getClass(), "type", 35);
        setField(term2643184, term2643184.getClass(), "str", null);
        setIntField(term2643184, term2643184.getClass(), "type", 0);
        setField(term2643184, term2643184.getClass(), "next", null);
        setField(term2643184, term2643184.getClass(), "first", null);
        setField(term2643184, term2643184.getClass(), "last", null);
        setField(term2643184, term2643184.getClass(), "propListHead", null);
        setIntField(term2643184, term2643184.getClass(), "sourcePosition", 0);
        setField(term2643184, term2643184.getClass(), "jsType", null);
        setField(term2643184, term2643184.getClass(), "parent", null);
        setField(term2643183, term2643183.getClass(), "next", term2643184);
        setField(term2643185, term2643185.getClass(), "str", null);
        setIntField(term2643185, term2643185.getClass(), "type", 40);
        setField(term2643186, term2643186.getClass(), "str", null);
        setIntField(term2643186, term2643186.getClass(), "type", 40);
        setField(term2643186, term2643186.getClass(), "next", null);
        setField(term2643186, term2643186.getClass(), "first", null);
        setField(term2643186, term2643186.getClass(), "last", null);
        setField(term2643186, term2643186.getClass(), "propListHead", null);
        setIntField(term2643186, term2643186.getClass(), "sourcePosition", 0);
        setField(term2643186, term2643186.getClass(), "jsType", null);
        setField(term2643186, term2643186.getClass(), "parent", null);
        setField(term2643185, term2643185.getClass(), "next", term2643186);
        setField(term2643185, term2643185.getClass(), "first", null);
        setField(term2643185, term2643185.getClass(), "last", null);
        setField(term2643185, term2643185.getClass(), "propListHead", null);
        setIntField(term2643185, term2643185.getClass(), "sourcePosition", 0);
        setField(term2643185, term2643185.getClass(), "jsType", null);
        setField(term2643185, term2643185.getClass(), "parent", null);
        setField(term2643183, term2643183.getClass(), "first", term2643185);
        setField(term2643183, term2643183.getClass(), "last", null);
        setField(term2643183, term2643183.getClass(), "propListHead", null);
        setIntField(term2643183, term2643183.getClass(), "sourcePosition", 0);
        setField(term2643183, term2643183.getClass(), "jsType", null);
        setField(term2643183, term2643183.getClass(), "parent", null);
        setField(term2643182, term2643182.getClass(), "first", term2643183);
        setField(term2643182, term2643182.getClass(), "last", null);
        setField(term2643182, term2643182.getClass(), "propListHead", null);
        setIntField(term2643182, term2643182.getClass(), "sourcePosition", 0);
        setField(term2643182, term2643182.getClass(), "jsType", null);
        setField(term2643182, term2643182.getClass(), "parent", null);
        term2643021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2643023 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2643025 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2643028 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2643030 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2643021, term2643021.getClass(), "str", null);
        setIntField(term2643021, term2643021.getClass(), "type", 37);
        setField(term2643021, term2643021.getClass(), "next", null);
        setField(term2643023, term2643023.getClass(), "str", null);
        setIntField(term2643023, term2643023.getClass(), "type", 35);
        setField(term2643025, term2643025.getClass(), "str", null);
        setIntField(term2643025, term2643025.getClass(), "type", 0);
        setField(term2643025, term2643025.getClass(), "next", null);
        setField(term2643025, term2643025.getClass(), "first", null);
        setField(term2643025, term2643025.getClass(), "last", null);
        setField(term2643025, term2643025.getClass(), "propListHead", null);
        setIntField(term2643025, term2643025.getClass(), "sourcePosition", 0);
        setField(term2643025, term2643025.getClass(), "jsType", null);
        setField(term2643025, term2643025.getClass(), "parent", null);
        setField(term2643023, term2643023.getClass(), "next", term2643025);
        setField(term2643028, term2643028.getClass(), "str", null);
        setIntField(term2643028, term2643028.getClass(), "type", 40);
        setField(term2643030, term2643030.getClass(), "str", null);
        setIntField(term2643030, term2643030.getClass(), "type", 40);
        setField(term2643030, term2643030.getClass(), "next", null);
        setField(term2643030, term2643030.getClass(), "first", null);
        setField(term2643030, term2643030.getClass(), "last", null);
        setField(term2643030, term2643030.getClass(), "propListHead", null);
        setIntField(term2643030, term2643030.getClass(), "sourcePosition", 0);
        setField(term2643030, term2643030.getClass(), "jsType", null);
        setField(term2643030, term2643030.getClass(), "parent", null);
        setField(term2643028, term2643028.getClass(), "next", term2643030);
        setField(term2643028, term2643028.getClass(), "first", null);
        setField(term2643028, term2643028.getClass(), "last", null);
        setField(term2643028, term2643028.getClass(), "propListHead", null);
        setIntField(term2643028, term2643028.getClass(), "sourcePosition", 0);
        setField(term2643028, term2643028.getClass(), "jsType", null);
        setField(term2643028, term2643028.getClass(), "parent", null);
        setField(term2643023, term2643023.getClass(), "first", term2643028);
        setField(term2643023, term2643023.getClass(), "last", null);
        setField(term2643023, term2643023.getClass(), "propListHead", null);
        setIntField(term2643023, term2643023.getClass(), "sourcePosition", 0);
        setField(term2643023, term2643023.getClass(), "jsType", null);
        setField(term2643023, term2643023.getClass(), "parent", null);
        setField(term2643021, term2643021.getClass(), "first", term2643023);
        setField(term2643021, term2643021.getClass(), "last", null);
        setField(term2643021, term2643021.getClass(), "propListHead", null);
        setIntField(term2643021, term2643021.getClass(), "sourcePosition", 0);
        setField(term2643021, term2643021.getClass(), "jsType", null);
        setField(term2643021, term2643021.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2642144;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term2642052, args);
        assertTrue(recursiveEquals(term2642052, term2643181));
        assertTrue(recursiveEquals(term2642144, term2643182));
        assertTrue(recursiveEquals(retValue, term2643021));
    }

};


