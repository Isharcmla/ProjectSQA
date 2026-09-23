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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3582740;
     Object term3582832;
     Object term3585629;
     Object term3585630;
     Object term3585111;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3582740 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3582832 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3582924 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3583016 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3583108 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3583276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3583346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3582924, term3582924.getClass(), "type", 35);
        setIntField(term3583108, term3583108.getClass(), "type", 40);
        setField(term3583108, term3583108.getClass(), "str", "lastIndexOf");
        setField(term3583016, term3583016.getClass(), "next", term3583108);
        setIntField(term3583016, term3583016.getClass(), "type", 40);
        setField(term3583016, term3583016.getClass(), "str", "");
        setField(term3582924, term3582924.getClass(), "first", term3583016);
        setIntField(term3583276, term3583276.getClass(), "type", 40);
        setField(term3583276, term3583276.getClass(), "next", term3583346);
        setField(term3583276, term3583276.getClass(), "str", "lastIndexOf");
        setField(term3582924, term3582924.getClass(), "next", term3583276);
        setField(term3582832, term3582832.getClass(), "first", term3582924);
        setIntField(term3582832, term3582832.getClass(), "type", 37);
        term3585629 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3585629, term3585629.getClass(), "currentTraversal", null);
        term3585630 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3585631 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3585632 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3585635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3585636 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3585639 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3585630, term3585630.getClass(), "str", null);
        setIntField(term3585630, term3585630.getClass(), "type", 37);
        setField(term3585630, term3585630.getClass(), "next", null);
        setField(term3585631, term3585631.getClass(), "str", null);
        setIntField(term3585631, term3585631.getClass(), "type", 35);
        setField(term3585632, term3585632.getClass(), "str", "lastIndexOf");
        setIntField(term3585632, term3585632.getClass(), "type", 40);
        setIntField(term3585635, term3585635.getClass(), "type", 0);
        setField(term3585635, term3585635.getClass(), "next", null);
        setField(term3585635, term3585635.getClass(), "first", null);
        setField(term3585635, term3585635.getClass(), "last", null);
        setField(term3585635, term3585635.getClass(), "propListHead", null);
        setIntField(term3585635, term3585635.getClass(), "sourcePosition", 0);
        setField(term3585635, term3585635.getClass(), "jsType", null);
        setField(term3585635, term3585635.getClass(), "parent", null);
        setField(term3585632, term3585632.getClass(), "next", term3585635);
        setField(term3585632, term3585632.getClass(), "first", null);
        setField(term3585632, term3585632.getClass(), "last", null);
        setField(term3585632, term3585632.getClass(), "propListHead", null);
        setIntField(term3585632, term3585632.getClass(), "sourcePosition", 0);
        setField(term3585632, term3585632.getClass(), "jsType", null);
        setField(term3585632, term3585632.getClass(), "parent", null);
        setField(term3585631, term3585631.getClass(), "next", term3585632);
        setField(term3585636, term3585636.getClass(), "str", "");
        setIntField(term3585636, term3585636.getClass(), "type", 40);
        setField(term3585639, term3585639.getClass(), "str", "");
        setIntField(term3585639, term3585639.getClass(), "type", 40);
        setField(term3585639, term3585639.getClass(), "next", null);
        setField(term3585639, term3585639.getClass(), "first", null);
        setField(term3585639, term3585639.getClass(), "last", null);
        setField(term3585639, term3585639.getClass(), "propListHead", null);
        setIntField(term3585639, term3585639.getClass(), "sourcePosition", 0);
        setField(term3585639, term3585639.getClass(), "jsType", null);
        setField(term3585639, term3585639.getClass(), "parent", null);
        setField(term3585636, term3585636.getClass(), "next", term3585639);
        setField(term3585636, term3585636.getClass(), "first", null);
        setField(term3585636, term3585636.getClass(), "last", null);
        setField(term3585636, term3585636.getClass(), "propListHead", null);
        setIntField(term3585636, term3585636.getClass(), "sourcePosition", 0);
        setField(term3585636, term3585636.getClass(), "jsType", null);
        setField(term3585636, term3585636.getClass(), "parent", null);
        setField(term3585631, term3585631.getClass(), "first", term3585636);
        setField(term3585631, term3585631.getClass(), "last", null);
        setField(term3585631, term3585631.getClass(), "propListHead", null);
        setIntField(term3585631, term3585631.getClass(), "sourcePosition", 0);
        setField(term3585631, term3585631.getClass(), "jsType", null);
        setField(term3585631, term3585631.getClass(), "parent", null);
        setField(term3585630, term3585630.getClass(), "first", term3585631);
        setField(term3585630, term3585630.getClass(), "last", null);
        setField(term3585630, term3585630.getClass(), "propListHead", null);
        setIntField(term3585630, term3585630.getClass(), "sourcePosition", 0);
        setField(term3585630, term3585630.getClass(), "jsType", null);
        setField(term3585630, term3585630.getClass(), "parent", null);
        term3585111 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3585113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3585115 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3585130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3585134 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3585138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3585111, term3585111.getClass(), "str", null);
        setIntField(term3585111, term3585111.getClass(), "type", 37);
        setField(term3585111, term3585111.getClass(), "next", null);
        setField(term3585113, term3585113.getClass(), "str", null);
        setIntField(term3585113, term3585113.getClass(), "type", 35);
        setField(term3585115, term3585115.getClass(), "str", "lastIndexOf");
        setIntField(term3585115, term3585115.getClass(), "type", 40);
        setIntField(term3585130, term3585130.getClass(), "type", 0);
        setField(term3585130, term3585130.getClass(), "next", null);
        setField(term3585130, term3585130.getClass(), "first", null);
        setField(term3585130, term3585130.getClass(), "last", null);
        setField(term3585130, term3585130.getClass(), "propListHead", null);
        setIntField(term3585130, term3585130.getClass(), "sourcePosition", 0);
        setField(term3585130, term3585130.getClass(), "jsType", null);
        setField(term3585130, term3585130.getClass(), "parent", null);
        setField(term3585115, term3585115.getClass(), "next", term3585130);
        setField(term3585115, term3585115.getClass(), "first", null);
        setField(term3585115, term3585115.getClass(), "last", null);
        setField(term3585115, term3585115.getClass(), "propListHead", null);
        setIntField(term3585115, term3585115.getClass(), "sourcePosition", 0);
        setField(term3585115, term3585115.getClass(), "jsType", null);
        setField(term3585115, term3585115.getClass(), "parent", null);
        setField(term3585113, term3585113.getClass(), "next", term3585115);
        setField(term3585134, term3585134.getClass(), "str", "");
        setIntField(term3585134, term3585134.getClass(), "type", 40);
        setField(term3585138, term3585138.getClass(), "str", "");
        setIntField(term3585138, term3585138.getClass(), "type", 40);
        setField(term3585138, term3585138.getClass(), "next", null);
        setField(term3585138, term3585138.getClass(), "first", null);
        setField(term3585138, term3585138.getClass(), "last", null);
        setField(term3585138, term3585138.getClass(), "propListHead", null);
        setIntField(term3585138, term3585138.getClass(), "sourcePosition", 0);
        setField(term3585138, term3585138.getClass(), "jsType", null);
        setField(term3585138, term3585138.getClass(), "parent", null);
        setField(term3585134, term3585134.getClass(), "next", term3585138);
        setField(term3585134, term3585134.getClass(), "first", null);
        setField(term3585134, term3585134.getClass(), "last", null);
        setField(term3585134, term3585134.getClass(), "propListHead", null);
        setIntField(term3585134, term3585134.getClass(), "sourcePosition", 0);
        setField(term3585134, term3585134.getClass(), "jsType", null);
        setField(term3585134, term3585134.getClass(), "parent", null);
        setField(term3585113, term3585113.getClass(), "first", term3585134);
        setField(term3585113, term3585113.getClass(), "last", null);
        setField(term3585113, term3585113.getClass(), "propListHead", null);
        setIntField(term3585113, term3585113.getClass(), "sourcePosition", 0);
        setField(term3585113, term3585113.getClass(), "jsType", null);
        setField(term3585113, term3585113.getClass(), "parent", null);
        setField(term3585111, term3585111.getClass(), "first", term3585113);
        setField(term3585111, term3585111.getClass(), "last", null);
        setField(term3585111, term3585111.getClass(), "propListHead", null);
        setIntField(term3585111, term3585111.getClass(), "sourcePosition", 0);
        setField(term3585111, term3585111.getClass(), "jsType", null);
        setField(term3585111, term3585111.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3582832;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3582740, args);
        assertTrue(recursiveEquals(term3582740, term3585629));
        assertTrue(recursiveEquals(term3582832, term3585630));
        assertTrue(recursiveEquals(retValue, term3585111));
    }

};


