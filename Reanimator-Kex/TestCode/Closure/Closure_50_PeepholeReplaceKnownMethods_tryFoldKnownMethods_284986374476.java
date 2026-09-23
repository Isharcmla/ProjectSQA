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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3468059;
     Object term3468151;
     Object term3468899;
     Object term3468900;
     Object term3468604;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3468059 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3468151 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3468243 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3468335 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3468427 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3468557 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3468243, term3468243.getClass(), "type", 35);
        setIntField(term3468427, term3468427.getClass(), "type", 40);
        setField(term3468427, term3468427.getClass(), "str", "charCodeAt");
        setField(term3468335, term3468335.getClass(), "next", term3468427);
        setIntField(term3468335, term3468335.getClass(), "type", 40);
        setField(term3468243, term3468243.getClass(), "first", term3468335);
        setIntField(term3468557, term3468557.getClass(), "type", 40);
        setField(term3468243, term3468243.getClass(), "next", term3468557);
        setField(term3468151, term3468151.getClass(), "first", term3468243);
        setIntField(term3468151, term3468151.getClass(), "type", 37);
        term3468899 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3468899, term3468899.getClass(), "currentTraversal", null);
        term3468900 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3468901 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3468902 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3468903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3468904 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3468900, term3468900.getClass(), "str", null);
        setIntField(term3468900, term3468900.getClass(), "type", 37);
        setField(term3468900, term3468900.getClass(), "next", null);
        setField(term3468901, term3468901.getClass(), "str", null);
        setIntField(term3468901, term3468901.getClass(), "type", 35);
        setField(term3468902, term3468902.getClass(), "str", null);
        setIntField(term3468902, term3468902.getClass(), "type", 40);
        setField(term3468902, term3468902.getClass(), "next", null);
        setField(term3468902, term3468902.getClass(), "first", null);
        setField(term3468902, term3468902.getClass(), "last", null);
        setField(term3468902, term3468902.getClass(), "propListHead", null);
        setIntField(term3468902, term3468902.getClass(), "sourcePosition", 0);
        setField(term3468902, term3468902.getClass(), "jsType", null);
        setField(term3468902, term3468902.getClass(), "parent", null);
        setField(term3468901, term3468901.getClass(), "next", term3468902);
        setField(term3468903, term3468903.getClass(), "str", null);
        setIntField(term3468903, term3468903.getClass(), "type", 40);
        setField(term3468904, term3468904.getClass(), "str", "");
        setIntField(term3468904, term3468904.getClass(), "type", 40);
        setField(term3468904, term3468904.getClass(), "next", null);
        setField(term3468904, term3468904.getClass(), "first", null);
        setField(term3468904, term3468904.getClass(), "last", null);
        setField(term3468904, term3468904.getClass(), "propListHead", null);
        setIntField(term3468904, term3468904.getClass(), "sourcePosition", 0);
        setField(term3468904, term3468904.getClass(), "jsType", null);
        setField(term3468904, term3468904.getClass(), "parent", null);
        setField(term3468903, term3468903.getClass(), "next", term3468904);
        setField(term3468903, term3468903.getClass(), "first", null);
        setField(term3468903, term3468903.getClass(), "last", null);
        setField(term3468903, term3468903.getClass(), "propListHead", null);
        setIntField(term3468903, term3468903.getClass(), "sourcePosition", 0);
        setField(term3468903, term3468903.getClass(), "jsType", null);
        setField(term3468903, term3468903.getClass(), "parent", null);
        setField(term3468901, term3468901.getClass(), "first", term3468903);
        setField(term3468901, term3468901.getClass(), "last", null);
        setField(term3468901, term3468901.getClass(), "propListHead", null);
        setIntField(term3468901, term3468901.getClass(), "sourcePosition", 0);
        setField(term3468901, term3468901.getClass(), "jsType", null);
        setField(term3468901, term3468901.getClass(), "parent", null);
        setField(term3468900, term3468900.getClass(), "first", term3468901);
        setField(term3468900, term3468900.getClass(), "last", null);
        setField(term3468900, term3468900.getClass(), "propListHead", null);
        setIntField(term3468900, term3468900.getClass(), "sourcePosition", 0);
        setField(term3468900, term3468900.getClass(), "jsType", null);
        setField(term3468900, term3468900.getClass(), "parent", null);
        term3468604 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3468606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3468608 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3468611 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3468613 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3468604, term3468604.getClass(), "str", null);
        setIntField(term3468604, term3468604.getClass(), "type", 37);
        setField(term3468604, term3468604.getClass(), "next", null);
        setField(term3468606, term3468606.getClass(), "str", null);
        setIntField(term3468606, term3468606.getClass(), "type", 35);
        setField(term3468608, term3468608.getClass(), "str", null);
        setIntField(term3468608, term3468608.getClass(), "type", 40);
        setField(term3468608, term3468608.getClass(), "next", null);
        setField(term3468608, term3468608.getClass(), "first", null);
        setField(term3468608, term3468608.getClass(), "last", null);
        setField(term3468608, term3468608.getClass(), "propListHead", null);
        setIntField(term3468608, term3468608.getClass(), "sourcePosition", 0);
        setField(term3468608, term3468608.getClass(), "jsType", null);
        setField(term3468608, term3468608.getClass(), "parent", null);
        setField(term3468606, term3468606.getClass(), "next", term3468608);
        setField(term3468611, term3468611.getClass(), "str", null);
        setIntField(term3468611, term3468611.getClass(), "type", 40);
        setField(term3468613, term3468613.getClass(), "str", "");
        setIntField(term3468613, term3468613.getClass(), "type", 40);
        setField(term3468613, term3468613.getClass(), "next", null);
        setField(term3468613, term3468613.getClass(), "first", null);
        setField(term3468613, term3468613.getClass(), "last", null);
        setField(term3468613, term3468613.getClass(), "propListHead", null);
        setIntField(term3468613, term3468613.getClass(), "sourcePosition", 0);
        setField(term3468613, term3468613.getClass(), "jsType", null);
        setField(term3468613, term3468613.getClass(), "parent", null);
        setField(term3468611, term3468611.getClass(), "next", term3468613);
        setField(term3468611, term3468611.getClass(), "first", null);
        setField(term3468611, term3468611.getClass(), "last", null);
        setField(term3468611, term3468611.getClass(), "propListHead", null);
        setIntField(term3468611, term3468611.getClass(), "sourcePosition", 0);
        setField(term3468611, term3468611.getClass(), "jsType", null);
        setField(term3468611, term3468611.getClass(), "parent", null);
        setField(term3468606, term3468606.getClass(), "first", term3468611);
        setField(term3468606, term3468606.getClass(), "last", null);
        setField(term3468606, term3468606.getClass(), "propListHead", null);
        setIntField(term3468606, term3468606.getClass(), "sourcePosition", 0);
        setField(term3468606, term3468606.getClass(), "jsType", null);
        setField(term3468606, term3468606.getClass(), "parent", null);
        setField(term3468604, term3468604.getClass(), "first", term3468606);
        setField(term3468604, term3468604.getClass(), "last", null);
        setField(term3468604, term3468604.getClass(), "propListHead", null);
        setIntField(term3468604, term3468604.getClass(), "sourcePosition", 0);
        setField(term3468604, term3468604.getClass(), "jsType", null);
        setField(term3468604, term3468604.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3468151;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3468059, args);
        assertTrue(recursiveEquals(term3468059, term3468899));
        assertTrue(recursiveEquals(term3468151, term3468900));
        assertTrue(recursiveEquals(retValue, term3468604));
    }

};


