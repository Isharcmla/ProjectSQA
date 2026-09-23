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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3560634;
     Object term3560726;
     Object term3561382;
     Object term3561383;
     Object term3561193;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3560634 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3560726 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3560818 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3560910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3561002 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3561132 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3560818, term3560818.getClass(), "type", 35);
        setIntField(term3561002, term3561002.getClass(), "type", 40);
        setField(term3561002, term3561002.getClass(), "str", "");
        setField(term3560910, term3560910.getClass(), "next", term3561002);
        setIntField(term3560910, term3560910.getClass(), "type", 40);
        setField(term3560818, term3560818.getClass(), "first", term3560910);
        setIntField(term3561132, term3561132.getClass(), "type", 43);
        setField(term3560818, term3560818.getClass(), "next", term3561132);
        setField(term3560726, term3560726.getClass(), "first", term3560818);
        setIntField(term3560726, term3560726.getClass(), "type", 37);
        term3561382 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3561382, term3561382.getClass(), "currentTraversal", null);
        term3561383 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3561384 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3561385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3561386 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3561387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3561383, term3561383.getClass(), "str", null);
        setIntField(term3561383, term3561383.getClass(), "type", 37);
        setField(term3561383, term3561383.getClass(), "next", null);
        setField(term3561384, term3561384.getClass(), "str", null);
        setIntField(term3561384, term3561384.getClass(), "type", 35);
        setField(term3561385, term3561385.getClass(), "str", null);
        setIntField(term3561385, term3561385.getClass(), "type", 43);
        setField(term3561385, term3561385.getClass(), "next", null);
        setField(term3561385, term3561385.getClass(), "first", null);
        setField(term3561385, term3561385.getClass(), "last", null);
        setField(term3561385, term3561385.getClass(), "propListHead", null);
        setIntField(term3561385, term3561385.getClass(), "sourcePosition", 0);
        setField(term3561385, term3561385.getClass(), "jsType", null);
        setField(term3561385, term3561385.getClass(), "parent", null);
        setField(term3561384, term3561384.getClass(), "next", term3561385);
        setField(term3561386, term3561386.getClass(), "str", null);
        setIntField(term3561386, term3561386.getClass(), "type", 40);
        setField(term3561387, term3561387.getClass(), "str", "");
        setIntField(term3561387, term3561387.getClass(), "type", 40);
        setField(term3561387, term3561387.getClass(), "next", null);
        setField(term3561387, term3561387.getClass(), "first", null);
        setField(term3561387, term3561387.getClass(), "last", null);
        setField(term3561387, term3561387.getClass(), "propListHead", null);
        setIntField(term3561387, term3561387.getClass(), "sourcePosition", 0);
        setField(term3561387, term3561387.getClass(), "jsType", null);
        setField(term3561387, term3561387.getClass(), "parent", null);
        setField(term3561386, term3561386.getClass(), "next", term3561387);
        setField(term3561386, term3561386.getClass(), "first", null);
        setField(term3561386, term3561386.getClass(), "last", null);
        setField(term3561386, term3561386.getClass(), "propListHead", null);
        setIntField(term3561386, term3561386.getClass(), "sourcePosition", 0);
        setField(term3561386, term3561386.getClass(), "jsType", null);
        setField(term3561386, term3561386.getClass(), "parent", null);
        setField(term3561384, term3561384.getClass(), "first", term3561386);
        setField(term3561384, term3561384.getClass(), "last", null);
        setField(term3561384, term3561384.getClass(), "propListHead", null);
        setIntField(term3561384, term3561384.getClass(), "sourcePosition", 0);
        setField(term3561384, term3561384.getClass(), "jsType", null);
        setField(term3561384, term3561384.getClass(), "parent", null);
        setField(term3561383, term3561383.getClass(), "first", term3561384);
        setField(term3561383, term3561383.getClass(), "last", null);
        setField(term3561383, term3561383.getClass(), "propListHead", null);
        setIntField(term3561383, term3561383.getClass(), "sourcePosition", 0);
        setField(term3561383, term3561383.getClass(), "jsType", null);
        setField(term3561383, term3561383.getClass(), "parent", null);
        term3561193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3561195 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3561197 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3561200 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3561202 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3561193, term3561193.getClass(), "str", null);
        setIntField(term3561193, term3561193.getClass(), "type", 37);
        setField(term3561193, term3561193.getClass(), "next", null);
        setField(term3561195, term3561195.getClass(), "str", null);
        setIntField(term3561195, term3561195.getClass(), "type", 35);
        setField(term3561197, term3561197.getClass(), "str", null);
        setIntField(term3561197, term3561197.getClass(), "type", 43);
        setField(term3561197, term3561197.getClass(), "next", null);
        setField(term3561197, term3561197.getClass(), "first", null);
        setField(term3561197, term3561197.getClass(), "last", null);
        setField(term3561197, term3561197.getClass(), "propListHead", null);
        setIntField(term3561197, term3561197.getClass(), "sourcePosition", 0);
        setField(term3561197, term3561197.getClass(), "jsType", null);
        setField(term3561197, term3561197.getClass(), "parent", null);
        setField(term3561195, term3561195.getClass(), "next", term3561197);
        setField(term3561200, term3561200.getClass(), "str", null);
        setIntField(term3561200, term3561200.getClass(), "type", 40);
        setField(term3561202, term3561202.getClass(), "str", "");
        setIntField(term3561202, term3561202.getClass(), "type", 40);
        setField(term3561202, term3561202.getClass(), "next", null);
        setField(term3561202, term3561202.getClass(), "first", null);
        setField(term3561202, term3561202.getClass(), "last", null);
        setField(term3561202, term3561202.getClass(), "propListHead", null);
        setIntField(term3561202, term3561202.getClass(), "sourcePosition", 0);
        setField(term3561202, term3561202.getClass(), "jsType", null);
        setField(term3561202, term3561202.getClass(), "parent", null);
        setField(term3561200, term3561200.getClass(), "next", term3561202);
        setField(term3561200, term3561200.getClass(), "first", null);
        setField(term3561200, term3561200.getClass(), "last", null);
        setField(term3561200, term3561200.getClass(), "propListHead", null);
        setIntField(term3561200, term3561200.getClass(), "sourcePosition", 0);
        setField(term3561200, term3561200.getClass(), "jsType", null);
        setField(term3561200, term3561200.getClass(), "parent", null);
        setField(term3561195, term3561195.getClass(), "first", term3561200);
        setField(term3561195, term3561195.getClass(), "last", null);
        setField(term3561195, term3561195.getClass(), "propListHead", null);
        setIntField(term3561195, term3561195.getClass(), "sourcePosition", 0);
        setField(term3561195, term3561195.getClass(), "jsType", null);
        setField(term3561195, term3561195.getClass(), "parent", null);
        setField(term3561193, term3561193.getClass(), "first", term3561195);
        setField(term3561193, term3561193.getClass(), "last", null);
        setField(term3561193, term3561193.getClass(), "propListHead", null);
        setIntField(term3561193, term3561193.getClass(), "sourcePosition", 0);
        setField(term3561193, term3561193.getClass(), "jsType", null);
        setField(term3561193, term3561193.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3560726;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3560634, args);
        assertTrue(recursiveEquals(term3560634, term3561382));
        assertTrue(recursiveEquals(term3560726, term3561383));
        assertTrue(recursiveEquals(retValue, term3561193));
    }

};


