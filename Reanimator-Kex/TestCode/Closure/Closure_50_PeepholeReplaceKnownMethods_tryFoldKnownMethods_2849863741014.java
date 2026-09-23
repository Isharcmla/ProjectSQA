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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4215295;
     Object term4215387;
     Object term4216439;
     Object term4216440;
     Object term4216172;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4215295 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4215387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4215479 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4215571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4215663 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4215793 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4215479, term4215479.getClass(), "type", 35);
        setIntField(term4215663, term4215663.getClass(), "type", 40);
        setField(term4215663, term4215663.getClass(), "str", "charAt");
        setField(term4215571, term4215571.getClass(), "next", term4215663);
        setIntField(term4215571, term4215571.getClass(), "type", 40);
        setField(term4215479, term4215479.getClass(), "first", term4215571);
        setIntField(term4215793, term4215793.getClass(), "type", 40);
        setField(term4215479, term4215479.getClass(), "next", term4215793);
        setField(term4215387, term4215387.getClass(), "first", term4215479);
        setIntField(term4215387, term4215387.getClass(), "type", 37);
        term4216439 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4216439, term4216439.getClass(), "currentTraversal", null);
        term4216440 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4216441 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4216442 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4216443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4216444 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4216440, term4216440.getClass(), "str", null);
        setIntField(term4216440, term4216440.getClass(), "type", 37);
        setField(term4216440, term4216440.getClass(), "next", null);
        setField(term4216441, term4216441.getClass(), "str", null);
        setIntField(term4216441, term4216441.getClass(), "type", 35);
        setDoubleField(term4216442, term4216442.getClass(), "number", 0.0);
        setIntField(term4216442, term4216442.getClass(), "type", 40);
        setField(term4216442, term4216442.getClass(), "next", null);
        setField(term4216442, term4216442.getClass(), "first", null);
        setField(term4216442, term4216442.getClass(), "last", null);
        setField(term4216442, term4216442.getClass(), "propListHead", null);
        setIntField(term4216442, term4216442.getClass(), "sourcePosition", 0);
        setField(term4216442, term4216442.getClass(), "jsType", null);
        setField(term4216442, term4216442.getClass(), "parent", null);
        setField(term4216441, term4216441.getClass(), "next", term4216442);
        setField(term4216443, term4216443.getClass(), "str", null);
        setIntField(term4216443, term4216443.getClass(), "type", 40);
        setField(term4216444, term4216444.getClass(), "str", "");
        setIntField(term4216444, term4216444.getClass(), "type", 40);
        setField(term4216444, term4216444.getClass(), "next", null);
        setField(term4216444, term4216444.getClass(), "first", null);
        setField(term4216444, term4216444.getClass(), "last", null);
        setField(term4216444, term4216444.getClass(), "propListHead", null);
        setIntField(term4216444, term4216444.getClass(), "sourcePosition", 0);
        setField(term4216444, term4216444.getClass(), "jsType", null);
        setField(term4216444, term4216444.getClass(), "parent", null);
        setField(term4216443, term4216443.getClass(), "next", term4216444);
        setField(term4216443, term4216443.getClass(), "first", null);
        setField(term4216443, term4216443.getClass(), "last", null);
        setField(term4216443, term4216443.getClass(), "propListHead", null);
        setIntField(term4216443, term4216443.getClass(), "sourcePosition", 0);
        setField(term4216443, term4216443.getClass(), "jsType", null);
        setField(term4216443, term4216443.getClass(), "parent", null);
        setField(term4216441, term4216441.getClass(), "first", term4216443);
        setField(term4216441, term4216441.getClass(), "last", null);
        setField(term4216441, term4216441.getClass(), "propListHead", null);
        setIntField(term4216441, term4216441.getClass(), "sourcePosition", 0);
        setField(term4216441, term4216441.getClass(), "jsType", null);
        setField(term4216441, term4216441.getClass(), "parent", null);
        setField(term4216440, term4216440.getClass(), "first", term4216441);
        setField(term4216440, term4216440.getClass(), "last", null);
        setField(term4216440, term4216440.getClass(), "propListHead", null);
        setIntField(term4216440, term4216440.getClass(), "sourcePosition", 0);
        setField(term4216440, term4216440.getClass(), "jsType", null);
        setField(term4216440, term4216440.getClass(), "parent", null);
        term4216172 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4216174 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4216176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4216180 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4216182 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4216172, term4216172.getClass(), "str", null);
        setIntField(term4216172, term4216172.getClass(), "type", 37);
        setField(term4216172, term4216172.getClass(), "next", null);
        setField(term4216174, term4216174.getClass(), "str", null);
        setIntField(term4216174, term4216174.getClass(), "type", 35);
        setDoubleField(term4216176, term4216176.getClass(), "number", 0.0);
        setIntField(term4216176, term4216176.getClass(), "type", 40);
        setField(term4216176, term4216176.getClass(), "next", null);
        setField(term4216176, term4216176.getClass(), "first", null);
        setField(term4216176, term4216176.getClass(), "last", null);
        setField(term4216176, term4216176.getClass(), "propListHead", null);
        setIntField(term4216176, term4216176.getClass(), "sourcePosition", 0);
        setField(term4216176, term4216176.getClass(), "jsType", null);
        setField(term4216176, term4216176.getClass(), "parent", null);
        setField(term4216174, term4216174.getClass(), "next", term4216176);
        setField(term4216180, term4216180.getClass(), "str", null);
        setIntField(term4216180, term4216180.getClass(), "type", 40);
        setField(term4216182, term4216182.getClass(), "str", "");
        setIntField(term4216182, term4216182.getClass(), "type", 40);
        setField(term4216182, term4216182.getClass(), "next", null);
        setField(term4216182, term4216182.getClass(), "first", null);
        setField(term4216182, term4216182.getClass(), "last", null);
        setField(term4216182, term4216182.getClass(), "propListHead", null);
        setIntField(term4216182, term4216182.getClass(), "sourcePosition", 0);
        setField(term4216182, term4216182.getClass(), "jsType", null);
        setField(term4216182, term4216182.getClass(), "parent", null);
        setField(term4216180, term4216180.getClass(), "next", term4216182);
        setField(term4216180, term4216180.getClass(), "first", null);
        setField(term4216180, term4216180.getClass(), "last", null);
        setField(term4216180, term4216180.getClass(), "propListHead", null);
        setIntField(term4216180, term4216180.getClass(), "sourcePosition", 0);
        setField(term4216180, term4216180.getClass(), "jsType", null);
        setField(term4216180, term4216180.getClass(), "parent", null);
        setField(term4216174, term4216174.getClass(), "first", term4216180);
        setField(term4216174, term4216174.getClass(), "last", null);
        setField(term4216174, term4216174.getClass(), "propListHead", null);
        setIntField(term4216174, term4216174.getClass(), "sourcePosition", 0);
        setField(term4216174, term4216174.getClass(), "jsType", null);
        setField(term4216174, term4216174.getClass(), "parent", null);
        setField(term4216172, term4216172.getClass(), "first", term4216174);
        setField(term4216172, term4216172.getClass(), "last", null);
        setField(term4216172, term4216172.getClass(), "propListHead", null);
        setIntField(term4216172, term4216172.getClass(), "sourcePosition", 0);
        setField(term4216172, term4216172.getClass(), "jsType", null);
        setField(term4216172, term4216172.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4215387;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4215295, args);
        assertTrue(recursiveEquals(term4215295, term4216439));
        assertTrue(recursiveEquals(term4215387, term4216440));
        assertTrue(recursiveEquals(retValue, term4216172));
    }

};


