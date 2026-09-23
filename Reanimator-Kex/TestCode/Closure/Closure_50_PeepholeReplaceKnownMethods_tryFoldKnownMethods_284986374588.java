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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3539960;
     Object term3540052;
     Object term3542180;
     Object term3542181;
     Object term3541850;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3539960 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3540052 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3540144 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3540236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3540328 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3540496 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3540144, term3540144.getClass(), "type", 35);
        setIntField(term3540328, term3540328.getClass(), "type", 40);
        setField(term3540328, term3540328.getClass(), "str", "charCodeAt");
        setField(term3540236, term3540236.getClass(), "next", term3540328);
        setIntField(term3540236, term3540236.getClass(), "type", 40);
        setField(term3540236, term3540236.getClass(), "str", "");
        setField(term3540144, term3540144.getClass(), "first", term3540236);
        setIntField(term3540496, term3540496.getClass(), "type", 39);
        setField(term3540496, term3540496.getClass(), "next", null);
        setDoubleField(term3540496, term3540496.getClass(), "number", 4.6162099590869811E18);
        setField(term3540144, term3540144.getClass(), "next", term3540496);
        setField(term3540052, term3540052.getClass(), "first", term3540144);
        setIntField(term3540052, term3540052.getClass(), "type", 37);
        term3542180 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3542180, term3542180.getClass(), "currentTraversal", null);
        term3542181 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3542182 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3542183 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3542184 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3542187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3542181, term3542181.getClass(), "str", null);
        setIntField(term3542181, term3542181.getClass(), "type", 37);
        setField(term3542181, term3542181.getClass(), "next", null);
        setField(term3542182, term3542182.getClass(), "str", null);
        setIntField(term3542182, term3542182.getClass(), "type", 35);
        setDoubleField(term3542183, term3542183.getClass(), "number", 4.6162099590869811E18);
        setIntField(term3542183, term3542183.getClass(), "type", 39);
        setField(term3542183, term3542183.getClass(), "next", null);
        setField(term3542183, term3542183.getClass(), "first", null);
        setField(term3542183, term3542183.getClass(), "last", null);
        setField(term3542183, term3542183.getClass(), "propListHead", null);
        setIntField(term3542183, term3542183.getClass(), "sourcePosition", 0);
        setField(term3542183, term3542183.getClass(), "jsType", null);
        setField(term3542183, term3542183.getClass(), "parent", null);
        setField(term3542182, term3542182.getClass(), "next", term3542183);
        setField(term3542184, term3542184.getClass(), "str", "");
        setIntField(term3542184, term3542184.getClass(), "type", 40);
        setField(term3542187, term3542187.getClass(), "str", "");
        setIntField(term3542187, term3542187.getClass(), "type", 40);
        setField(term3542187, term3542187.getClass(), "next", null);
        setField(term3542187, term3542187.getClass(), "first", null);
        setField(term3542187, term3542187.getClass(), "last", null);
        setField(term3542187, term3542187.getClass(), "propListHead", null);
        setIntField(term3542187, term3542187.getClass(), "sourcePosition", 0);
        setField(term3542187, term3542187.getClass(), "jsType", null);
        setField(term3542187, term3542187.getClass(), "parent", null);
        setField(term3542184, term3542184.getClass(), "next", term3542187);
        setField(term3542184, term3542184.getClass(), "first", null);
        setField(term3542184, term3542184.getClass(), "last", null);
        setField(term3542184, term3542184.getClass(), "propListHead", null);
        setIntField(term3542184, term3542184.getClass(), "sourcePosition", 0);
        setField(term3542184, term3542184.getClass(), "jsType", null);
        setField(term3542184, term3542184.getClass(), "parent", null);
        setField(term3542182, term3542182.getClass(), "first", term3542184);
        setField(term3542182, term3542182.getClass(), "last", null);
        setField(term3542182, term3542182.getClass(), "propListHead", null);
        setIntField(term3542182, term3542182.getClass(), "sourcePosition", 0);
        setField(term3542182, term3542182.getClass(), "jsType", null);
        setField(term3542182, term3542182.getClass(), "parent", null);
        setField(term3542181, term3542181.getClass(), "first", term3542182);
        setField(term3542181, term3542181.getClass(), "last", null);
        setField(term3542181, term3542181.getClass(), "propListHead", null);
        setIntField(term3542181, term3542181.getClass(), "sourcePosition", 0);
        setField(term3542181, term3542181.getClass(), "jsType", null);
        setField(term3542181, term3542181.getClass(), "parent", null);
        term3541850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3541852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3541854 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3541858 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3541862 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3541850, term3541850.getClass(), "str", null);
        setIntField(term3541850, term3541850.getClass(), "type", 37);
        setField(term3541850, term3541850.getClass(), "next", null);
        setField(term3541852, term3541852.getClass(), "str", null);
        setIntField(term3541852, term3541852.getClass(), "type", 35);
        setDoubleField(term3541854, term3541854.getClass(), "number", 4.6162099590869811E18);
        setIntField(term3541854, term3541854.getClass(), "type", 39);
        setField(term3541854, term3541854.getClass(), "next", null);
        setField(term3541854, term3541854.getClass(), "first", null);
        setField(term3541854, term3541854.getClass(), "last", null);
        setField(term3541854, term3541854.getClass(), "propListHead", null);
        setIntField(term3541854, term3541854.getClass(), "sourcePosition", 0);
        setField(term3541854, term3541854.getClass(), "jsType", null);
        setField(term3541854, term3541854.getClass(), "parent", null);
        setField(term3541852, term3541852.getClass(), "next", term3541854);
        setField(term3541858, term3541858.getClass(), "str", "");
        setIntField(term3541858, term3541858.getClass(), "type", 40);
        setField(term3541862, term3541862.getClass(), "str", "");
        setIntField(term3541862, term3541862.getClass(), "type", 40);
        setField(term3541862, term3541862.getClass(), "next", null);
        setField(term3541862, term3541862.getClass(), "first", null);
        setField(term3541862, term3541862.getClass(), "last", null);
        setField(term3541862, term3541862.getClass(), "propListHead", null);
        setIntField(term3541862, term3541862.getClass(), "sourcePosition", 0);
        setField(term3541862, term3541862.getClass(), "jsType", null);
        setField(term3541862, term3541862.getClass(), "parent", null);
        setField(term3541858, term3541858.getClass(), "next", term3541862);
        setField(term3541858, term3541858.getClass(), "first", null);
        setField(term3541858, term3541858.getClass(), "last", null);
        setField(term3541858, term3541858.getClass(), "propListHead", null);
        setIntField(term3541858, term3541858.getClass(), "sourcePosition", 0);
        setField(term3541858, term3541858.getClass(), "jsType", null);
        setField(term3541858, term3541858.getClass(), "parent", null);
        setField(term3541852, term3541852.getClass(), "first", term3541858);
        setField(term3541852, term3541852.getClass(), "last", null);
        setField(term3541852, term3541852.getClass(), "propListHead", null);
        setIntField(term3541852, term3541852.getClass(), "sourcePosition", 0);
        setField(term3541852, term3541852.getClass(), "jsType", null);
        setField(term3541852, term3541852.getClass(), "parent", null);
        setField(term3541850, term3541850.getClass(), "first", term3541852);
        setField(term3541850, term3541850.getClass(), "last", null);
        setField(term3541850, term3541850.getClass(), "propListHead", null);
        setIntField(term3541850, term3541850.getClass(), "sourcePosition", 0);
        setField(term3541850, term3541850.getClass(), "jsType", null);
        setField(term3541850, term3541850.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3540052;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3539960, args);
        assertTrue(recursiveEquals(term3539960, term3542180));
        assertTrue(recursiveEquals(term3540052, term3542181));
        assertTrue(recursiveEquals(retValue, term3541850));
    }

};


