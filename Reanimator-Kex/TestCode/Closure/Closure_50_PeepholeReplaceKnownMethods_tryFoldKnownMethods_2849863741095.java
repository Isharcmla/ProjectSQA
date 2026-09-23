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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4857315;
     Object term4857407;
     Object term5155442;
     Object term5155443;
     Object term5155127;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4857315 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4857407 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4857499 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4857591 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4857683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4857813 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4857499, term4857499.getClass(), "type", 35);
        setIntField(term4857683, term4857683.getClass(), "type", 40);
        setField(term4857683, term4857683.getClass(), "str", "indexOf");
        setField(term4857591, term4857591.getClass(), "next", term4857683);
        setIntField(term4857591, term4857591.getClass(), "type", 40);
        setField(term4857591, term4857591.getClass(), "str", null);
        setField(term4857499, term4857499.getClass(), "first", term4857591);
        setIntField(term4857813, term4857813.getClass(), "type", 44);
        setField(term4857813, term4857813.getClass(), "next", term4857683);
        setField(term4857499, term4857499.getClass(), "next", term4857813);
        setField(term4857407, term4857407.getClass(), "first", term4857499);
        setIntField(term4857407, term4857407.getClass(), "type", 37);
        term5155442 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term5155442, term5155442.getClass(), "currentTraversal", null);
        term5155443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5155444 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5155445 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5155446 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5155448 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5155443, term5155443.getClass(), "str", null);
        setIntField(term5155443, term5155443.getClass(), "type", 37);
        setField(term5155443, term5155443.getClass(), "next", null);
        setField(term5155444, term5155444.getClass(), "str", null);
        setIntField(term5155444, term5155444.getClass(), "type", 35);
        setField(term5155445, term5155445.getClass(), "str", null);
        setIntField(term5155445, term5155445.getClass(), "type", 44);
        setField(term5155446, term5155446.getClass(), "str", "");
        setIntField(term5155446, term5155446.getClass(), "type", 40);
        setField(term5155446, term5155446.getClass(), "next", null);
        setField(term5155446, term5155446.getClass(), "first", null);
        setField(term5155446, term5155446.getClass(), "last", null);
        setField(term5155446, term5155446.getClass(), "propListHead", null);
        setIntField(term5155446, term5155446.getClass(), "sourcePosition", 0);
        setField(term5155446, term5155446.getClass(), "jsType", null);
        setField(term5155446, term5155446.getClass(), "parent", null);
        setField(term5155445, term5155445.getClass(), "next", term5155446);
        setField(term5155445, term5155445.getClass(), "first", null);
        setField(term5155445, term5155445.getClass(), "last", null);
        setField(term5155445, term5155445.getClass(), "propListHead", null);
        setIntField(term5155445, term5155445.getClass(), "sourcePosition", 0);
        setField(term5155445, term5155445.getClass(), "jsType", null);
        setField(term5155445, term5155445.getClass(), "parent", null);
        setField(term5155444, term5155444.getClass(), "next", term5155445);
        setField(term5155448, term5155448.getClass(), "str", null);
        setIntField(term5155448, term5155448.getClass(), "type", 40);
        setField(term5155448, term5155448.getClass(), "next", term5155446);
        setField(term5155448, term5155448.getClass(), "first", null);
        setField(term5155448, term5155448.getClass(), "last", null);
        setField(term5155448, term5155448.getClass(), "propListHead", null);
        setIntField(term5155448, term5155448.getClass(), "sourcePosition", 0);
        setField(term5155448, term5155448.getClass(), "jsType", null);
        setField(term5155448, term5155448.getClass(), "parent", null);
        setField(term5155444, term5155444.getClass(), "first", term5155448);
        setField(term5155444, term5155444.getClass(), "last", null);
        setField(term5155444, term5155444.getClass(), "propListHead", null);
        setIntField(term5155444, term5155444.getClass(), "sourcePosition", 0);
        setField(term5155444, term5155444.getClass(), "jsType", null);
        setField(term5155444, term5155444.getClass(), "parent", null);
        setField(term5155443, term5155443.getClass(), "first", term5155444);
        setField(term5155443, term5155443.getClass(), "last", null);
        setField(term5155443, term5155443.getClass(), "propListHead", null);
        setIntField(term5155443, term5155443.getClass(), "sourcePosition", 0);
        setField(term5155443, term5155443.getClass(), "jsType", null);
        setField(term5155443, term5155443.getClass(), "parent", null);
        term5155127 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5155129 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5155131 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5155133 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5155138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5155127, term5155127.getClass(), "str", null);
        setIntField(term5155127, term5155127.getClass(), "type", 37);
        setField(term5155127, term5155127.getClass(), "next", null);
        setField(term5155129, term5155129.getClass(), "str", null);
        setIntField(term5155129, term5155129.getClass(), "type", 35);
        setField(term5155131, term5155131.getClass(), "str", null);
        setIntField(term5155131, term5155131.getClass(), "type", 44);
        setField(term5155133, term5155133.getClass(), "str", "");
        setIntField(term5155133, term5155133.getClass(), "type", 40);
        setField(term5155133, term5155133.getClass(), "next", null);
        setField(term5155133, term5155133.getClass(), "first", null);
        setField(term5155133, term5155133.getClass(), "last", null);
        setField(term5155133, term5155133.getClass(), "propListHead", null);
        setIntField(term5155133, term5155133.getClass(), "sourcePosition", 0);
        setField(term5155133, term5155133.getClass(), "jsType", null);
        setField(term5155133, term5155133.getClass(), "parent", null);
        setField(term5155131, term5155131.getClass(), "next", term5155133);
        setField(term5155131, term5155131.getClass(), "first", null);
        setField(term5155131, term5155131.getClass(), "last", null);
        setField(term5155131, term5155131.getClass(), "propListHead", null);
        setIntField(term5155131, term5155131.getClass(), "sourcePosition", 0);
        setField(term5155131, term5155131.getClass(), "jsType", null);
        setField(term5155131, term5155131.getClass(), "parent", null);
        setField(term5155129, term5155129.getClass(), "next", term5155131);
        setField(term5155138, term5155138.getClass(), "str", null);
        setIntField(term5155138, term5155138.getClass(), "type", 40);
        setField(term5155138, term5155138.getClass(), "next", term5155133);
        setField(term5155138, term5155138.getClass(), "first", null);
        setField(term5155138, term5155138.getClass(), "last", null);
        setField(term5155138, term5155138.getClass(), "propListHead", null);
        setIntField(term5155138, term5155138.getClass(), "sourcePosition", 0);
        setField(term5155138, term5155138.getClass(), "jsType", null);
        setField(term5155138, term5155138.getClass(), "parent", null);
        setField(term5155129, term5155129.getClass(), "first", term5155138);
        setField(term5155129, term5155129.getClass(), "last", null);
        setField(term5155129, term5155129.getClass(), "propListHead", null);
        setIntField(term5155129, term5155129.getClass(), "sourcePosition", 0);
        setField(term5155129, term5155129.getClass(), "jsType", null);
        setField(term5155129, term5155129.getClass(), "parent", null);
        setField(term5155127, term5155127.getClass(), "first", term5155129);
        setField(term5155127, term5155127.getClass(), "last", null);
        setField(term5155127, term5155127.getClass(), "propListHead", null);
        setIntField(term5155127, term5155127.getClass(), "sourcePosition", 0);
        setField(term5155127, term5155127.getClass(), "jsType", null);
        setField(term5155127, term5155127.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4857407;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4857315, args);
        assertTrue(recursiveEquals(term4857315, term5155442));
        assertTrue(recursiveEquals(term4857407, term5155443));
        assertTrue(recursiveEquals(retValue, term5155127));
    }

};


