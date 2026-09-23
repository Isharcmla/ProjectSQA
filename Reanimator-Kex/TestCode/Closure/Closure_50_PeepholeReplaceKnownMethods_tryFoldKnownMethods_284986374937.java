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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3786789;
     Object term3786881;
     Object term3788406;
     Object term3788407;
     Object term3788141;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3786789 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3786881 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3786973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3787065 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3787157 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3787287 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3786973, term3786973.getClass(), "type", 35);
        setIntField(term3787157, term3787157.getClass(), "type", 40);
        setField(term3787157, term3787157.getClass(), "str", "substr");
        setField(term3787065, term3787065.getClass(), "next", term3787157);
        setIntField(term3787065, term3787065.getClass(), "type", 40);
        setField(term3786973, term3786973.getClass(), "first", term3787065);
        setIntField(term3787287, term3787287.getClass(), "type", 40);
        setField(term3786973, term3786973.getClass(), "next", term3787287);
        setField(term3786881, term3786881.getClass(), "first", term3786973);
        setIntField(term3786881, term3786881.getClass(), "type", 37);
        term3788406 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3788406, term3788406.getClass(), "currentTraversal", null);
        term3788407 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3788408 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3788409 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3788410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3788411 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3788407, term3788407.getClass(), "str", null);
        setIntField(term3788407, term3788407.getClass(), "type", 37);
        setField(term3788407, term3788407.getClass(), "next", null);
        setField(term3788408, term3788408.getClass(), "str", null);
        setIntField(term3788408, term3788408.getClass(), "type", 35);
        setDoubleField(term3788409, term3788409.getClass(), "number", 0.0);
        setIntField(term3788409, term3788409.getClass(), "type", 40);
        setField(term3788409, term3788409.getClass(), "next", null);
        setField(term3788409, term3788409.getClass(), "first", null);
        setField(term3788409, term3788409.getClass(), "last", null);
        setField(term3788409, term3788409.getClass(), "propListHead", null);
        setIntField(term3788409, term3788409.getClass(), "sourcePosition", 0);
        setField(term3788409, term3788409.getClass(), "jsType", null);
        setField(term3788409, term3788409.getClass(), "parent", null);
        setField(term3788408, term3788408.getClass(), "next", term3788409);
        setField(term3788410, term3788410.getClass(), "str", null);
        setIntField(term3788410, term3788410.getClass(), "type", 40);
        setField(term3788411, term3788411.getClass(), "str", "");
        setIntField(term3788411, term3788411.getClass(), "type", 40);
        setField(term3788411, term3788411.getClass(), "next", null);
        setField(term3788411, term3788411.getClass(), "first", null);
        setField(term3788411, term3788411.getClass(), "last", null);
        setField(term3788411, term3788411.getClass(), "propListHead", null);
        setIntField(term3788411, term3788411.getClass(), "sourcePosition", 0);
        setField(term3788411, term3788411.getClass(), "jsType", null);
        setField(term3788411, term3788411.getClass(), "parent", null);
        setField(term3788410, term3788410.getClass(), "next", term3788411);
        setField(term3788410, term3788410.getClass(), "first", null);
        setField(term3788410, term3788410.getClass(), "last", null);
        setField(term3788410, term3788410.getClass(), "propListHead", null);
        setIntField(term3788410, term3788410.getClass(), "sourcePosition", 0);
        setField(term3788410, term3788410.getClass(), "jsType", null);
        setField(term3788410, term3788410.getClass(), "parent", null);
        setField(term3788408, term3788408.getClass(), "first", term3788410);
        setField(term3788408, term3788408.getClass(), "last", null);
        setField(term3788408, term3788408.getClass(), "propListHead", null);
        setIntField(term3788408, term3788408.getClass(), "sourcePosition", 0);
        setField(term3788408, term3788408.getClass(), "jsType", null);
        setField(term3788408, term3788408.getClass(), "parent", null);
        setField(term3788407, term3788407.getClass(), "first", term3788408);
        setField(term3788407, term3788407.getClass(), "last", null);
        setField(term3788407, term3788407.getClass(), "propListHead", null);
        setIntField(term3788407, term3788407.getClass(), "sourcePosition", 0);
        setField(term3788407, term3788407.getClass(), "jsType", null);
        setField(term3788407, term3788407.getClass(), "parent", null);
        term3788141 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3788143 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3788145 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3788149 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3788151 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3788141, term3788141.getClass(), "str", null);
        setIntField(term3788141, term3788141.getClass(), "type", 37);
        setField(term3788141, term3788141.getClass(), "next", null);
        setField(term3788143, term3788143.getClass(), "str", null);
        setIntField(term3788143, term3788143.getClass(), "type", 35);
        setDoubleField(term3788145, term3788145.getClass(), "number", 0.0);
        setIntField(term3788145, term3788145.getClass(), "type", 40);
        setField(term3788145, term3788145.getClass(), "next", null);
        setField(term3788145, term3788145.getClass(), "first", null);
        setField(term3788145, term3788145.getClass(), "last", null);
        setField(term3788145, term3788145.getClass(), "propListHead", null);
        setIntField(term3788145, term3788145.getClass(), "sourcePosition", 0);
        setField(term3788145, term3788145.getClass(), "jsType", null);
        setField(term3788145, term3788145.getClass(), "parent", null);
        setField(term3788143, term3788143.getClass(), "next", term3788145);
        setField(term3788149, term3788149.getClass(), "str", null);
        setIntField(term3788149, term3788149.getClass(), "type", 40);
        setField(term3788151, term3788151.getClass(), "str", "");
        setIntField(term3788151, term3788151.getClass(), "type", 40);
        setField(term3788151, term3788151.getClass(), "next", null);
        setField(term3788151, term3788151.getClass(), "first", null);
        setField(term3788151, term3788151.getClass(), "last", null);
        setField(term3788151, term3788151.getClass(), "propListHead", null);
        setIntField(term3788151, term3788151.getClass(), "sourcePosition", 0);
        setField(term3788151, term3788151.getClass(), "jsType", null);
        setField(term3788151, term3788151.getClass(), "parent", null);
        setField(term3788149, term3788149.getClass(), "next", term3788151);
        setField(term3788149, term3788149.getClass(), "first", null);
        setField(term3788149, term3788149.getClass(), "last", null);
        setField(term3788149, term3788149.getClass(), "propListHead", null);
        setIntField(term3788149, term3788149.getClass(), "sourcePosition", 0);
        setField(term3788149, term3788149.getClass(), "jsType", null);
        setField(term3788149, term3788149.getClass(), "parent", null);
        setField(term3788143, term3788143.getClass(), "first", term3788149);
        setField(term3788143, term3788143.getClass(), "last", null);
        setField(term3788143, term3788143.getClass(), "propListHead", null);
        setIntField(term3788143, term3788143.getClass(), "sourcePosition", 0);
        setField(term3788143, term3788143.getClass(), "jsType", null);
        setField(term3788143, term3788143.getClass(), "parent", null);
        setField(term3788141, term3788141.getClass(), "first", term3788143);
        setField(term3788141, term3788141.getClass(), "last", null);
        setField(term3788141, term3788141.getClass(), "propListHead", null);
        setIntField(term3788141, term3788141.getClass(), "sourcePosition", 0);
        setField(term3788141, term3788141.getClass(), "jsType", null);
        setField(term3788141, term3788141.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3786881;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3786789, args);
        assertTrue(recursiveEquals(term3786789, term3788406));
        assertTrue(recursiveEquals(term3786881, term3788407));
        assertTrue(recursiveEquals(retValue, term3788141));
    }

};


