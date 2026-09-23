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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4842181;
     Object term4842273;
     Object term4844466;
     Object term4844467;
     Object term4844123;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4842181 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4842273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4842365 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4842457 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4842549 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4842679 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4842771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4842365, term4842365.getClass(), "type", 35);
        setIntField(term4842549, term4842549.getClass(), "type", 40);
        setField(term4842549, term4842549.getClass(), "str", "indexOf");
        setField(term4842457, term4842457.getClass(), "next", term4842549);
        setIntField(term4842457, term4842457.getClass(), "type", 40);
        setField(term4842457, term4842457.getClass(), "str", null);
        setField(term4842365, term4842365.getClass(), "first", term4842457);
        setIntField(term4842679, term4842679.getClass(), "type", 40);
        setField(term4842679, term4842679.getClass(), "next", term4842771);
        setField(term4842679, term4842679.getClass(), "str", "");
        setField(term4842365, term4842365.getClass(), "next", term4842679);
        setField(term4842273, term4842273.getClass(), "first", term4842365);
        setIntField(term4842273, term4842273.getClass(), "type", 37);
        term4844466 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4844466, term4844466.getClass(), "currentTraversal", null);
        term4844467 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4844468 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4844469 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4844472 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4844473 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4844474 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4844467, term4844467.getClass(), "str", null);
        setIntField(term4844467, term4844467.getClass(), "type", 37);
        setField(term4844467, term4844467.getClass(), "next", null);
        setField(term4844468, term4844468.getClass(), "str", null);
        setIntField(term4844468, term4844468.getClass(), "type", 35);
        setField(term4844469, term4844469.getClass(), "str", "");
        setIntField(term4844469, term4844469.getClass(), "type", 40);
        setDoubleField(term4844472, term4844472.getClass(), "number", 0.0);
        setIntField(term4844472, term4844472.getClass(), "type", 0);
        setField(term4844472, term4844472.getClass(), "next", null);
        setField(term4844472, term4844472.getClass(), "first", null);
        setField(term4844472, term4844472.getClass(), "last", null);
        setField(term4844472, term4844472.getClass(), "propListHead", null);
        setIntField(term4844472, term4844472.getClass(), "sourcePosition", 0);
        setField(term4844472, term4844472.getClass(), "jsType", null);
        setField(term4844472, term4844472.getClass(), "parent", null);
        setField(term4844469, term4844469.getClass(), "next", term4844472);
        setField(term4844469, term4844469.getClass(), "first", null);
        setField(term4844469, term4844469.getClass(), "last", null);
        setField(term4844469, term4844469.getClass(), "propListHead", null);
        setIntField(term4844469, term4844469.getClass(), "sourcePosition", 0);
        setField(term4844469, term4844469.getClass(), "jsType", null);
        setField(term4844469, term4844469.getClass(), "parent", null);
        setField(term4844468, term4844468.getClass(), "next", term4844469);
        setField(term4844473, term4844473.getClass(), "str", null);
        setIntField(term4844473, term4844473.getClass(), "type", 40);
        setField(term4844474, term4844474.getClass(), "str", "");
        setIntField(term4844474, term4844474.getClass(), "type", 40);
        setField(term4844474, term4844474.getClass(), "next", null);
        setField(term4844474, term4844474.getClass(), "first", null);
        setField(term4844474, term4844474.getClass(), "last", null);
        setField(term4844474, term4844474.getClass(), "propListHead", null);
        setIntField(term4844474, term4844474.getClass(), "sourcePosition", 0);
        setField(term4844474, term4844474.getClass(), "jsType", null);
        setField(term4844474, term4844474.getClass(), "parent", null);
        setField(term4844473, term4844473.getClass(), "next", term4844474);
        setField(term4844473, term4844473.getClass(), "first", null);
        setField(term4844473, term4844473.getClass(), "last", null);
        setField(term4844473, term4844473.getClass(), "propListHead", null);
        setIntField(term4844473, term4844473.getClass(), "sourcePosition", 0);
        setField(term4844473, term4844473.getClass(), "jsType", null);
        setField(term4844473, term4844473.getClass(), "parent", null);
        setField(term4844468, term4844468.getClass(), "first", term4844473);
        setField(term4844468, term4844468.getClass(), "last", null);
        setField(term4844468, term4844468.getClass(), "propListHead", null);
        setIntField(term4844468, term4844468.getClass(), "sourcePosition", 0);
        setField(term4844468, term4844468.getClass(), "jsType", null);
        setField(term4844468, term4844468.getClass(), "parent", null);
        setField(term4844467, term4844467.getClass(), "first", term4844468);
        setField(term4844467, term4844467.getClass(), "last", null);
        setField(term4844467, term4844467.getClass(), "propListHead", null);
        setIntField(term4844467, term4844467.getClass(), "sourcePosition", 0);
        setField(term4844467, term4844467.getClass(), "jsType", null);
        setField(term4844467, term4844467.getClass(), "parent", null);
        term4844123 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4844125 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4844127 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4844131 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4844136 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4844138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4844123, term4844123.getClass(), "str", null);
        setIntField(term4844123, term4844123.getClass(), "type", 37);
        setField(term4844123, term4844123.getClass(), "next", null);
        setField(term4844125, term4844125.getClass(), "str", null);
        setIntField(term4844125, term4844125.getClass(), "type", 35);
        setField(term4844127, term4844127.getClass(), "str", "");
        setIntField(term4844127, term4844127.getClass(), "type", 40);
        setDoubleField(term4844131, term4844131.getClass(), "number", 0.0);
        setIntField(term4844131, term4844131.getClass(), "type", 0);
        setField(term4844131, term4844131.getClass(), "next", null);
        setField(term4844131, term4844131.getClass(), "first", null);
        setField(term4844131, term4844131.getClass(), "last", null);
        setField(term4844131, term4844131.getClass(), "propListHead", null);
        setIntField(term4844131, term4844131.getClass(), "sourcePosition", 0);
        setField(term4844131, term4844131.getClass(), "jsType", null);
        setField(term4844131, term4844131.getClass(), "parent", null);
        setField(term4844127, term4844127.getClass(), "next", term4844131);
        setField(term4844127, term4844127.getClass(), "first", null);
        setField(term4844127, term4844127.getClass(), "last", null);
        setField(term4844127, term4844127.getClass(), "propListHead", null);
        setIntField(term4844127, term4844127.getClass(), "sourcePosition", 0);
        setField(term4844127, term4844127.getClass(), "jsType", null);
        setField(term4844127, term4844127.getClass(), "parent", null);
        setField(term4844125, term4844125.getClass(), "next", term4844127);
        setField(term4844136, term4844136.getClass(), "str", null);
        setIntField(term4844136, term4844136.getClass(), "type", 40);
        setField(term4844138, term4844138.getClass(), "str", "");
        setIntField(term4844138, term4844138.getClass(), "type", 40);
        setField(term4844138, term4844138.getClass(), "next", null);
        setField(term4844138, term4844138.getClass(), "first", null);
        setField(term4844138, term4844138.getClass(), "last", null);
        setField(term4844138, term4844138.getClass(), "propListHead", null);
        setIntField(term4844138, term4844138.getClass(), "sourcePosition", 0);
        setField(term4844138, term4844138.getClass(), "jsType", null);
        setField(term4844138, term4844138.getClass(), "parent", null);
        setField(term4844136, term4844136.getClass(), "next", term4844138);
        setField(term4844136, term4844136.getClass(), "first", null);
        setField(term4844136, term4844136.getClass(), "last", null);
        setField(term4844136, term4844136.getClass(), "propListHead", null);
        setIntField(term4844136, term4844136.getClass(), "sourcePosition", 0);
        setField(term4844136, term4844136.getClass(), "jsType", null);
        setField(term4844136, term4844136.getClass(), "parent", null);
        setField(term4844125, term4844125.getClass(), "first", term4844136);
        setField(term4844125, term4844125.getClass(), "last", null);
        setField(term4844125, term4844125.getClass(), "propListHead", null);
        setIntField(term4844125, term4844125.getClass(), "sourcePosition", 0);
        setField(term4844125, term4844125.getClass(), "jsType", null);
        setField(term4844125, term4844125.getClass(), "parent", null);
        setField(term4844123, term4844123.getClass(), "first", term4844125);
        setField(term4844123, term4844123.getClass(), "last", null);
        setField(term4844123, term4844123.getClass(), "propListHead", null);
        setIntField(term4844123, term4844123.getClass(), "sourcePosition", 0);
        setField(term4844123, term4844123.getClass(), "jsType", null);
        setField(term4844123, term4844123.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4842273;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4842181, args);
        assertTrue(recursiveEquals(term4842181, term4844466));
        assertTrue(recursiveEquals(term4842273, term4844467));
        assertTrue(recursiveEquals(retValue, term4844123));
    }

};


