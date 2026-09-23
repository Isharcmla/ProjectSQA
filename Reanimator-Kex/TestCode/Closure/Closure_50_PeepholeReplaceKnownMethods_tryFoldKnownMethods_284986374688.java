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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3602717;
     Object term3602809;
     Object term3604187;
     Object term3604188;
     Object term3603830;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3602717 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3602809 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3602901 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3602993 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3603085 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3603253 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3603345 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3602901, term3602901.getClass(), "type", 35);
        setIntField(term3603085, term3603085.getClass(), "type", 40);
        setField(term3603085, term3603085.getClass(), "str", "indexOf");
        setField(term3602993, term3602993.getClass(), "next", term3603085);
        setIntField(term3602993, term3602993.getClass(), "type", 40);
        setField(term3602993, term3602993.getClass(), "str", "");
        setField(term3602901, term3602901.getClass(), "first", term3602993);
        setIntField(term3603253, term3603253.getClass(), "type", 44);
        setField(term3603345, term3603345.getClass(), "next", null);
        setField(term3603253, term3603253.getClass(), "next", term3603345);
        setField(term3602901, term3602901.getClass(), "next", term3603253);
        setField(term3602809, term3602809.getClass(), "first", term3602901);
        setIntField(term3602809, term3602809.getClass(), "type", 37);
        term3604187 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3604187, term3604187.getClass(), "currentTraversal", null);
        term3604188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3604189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3604190 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3604191 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3604192 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3604195 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3604188, term3604188.getClass(), "str", null);
        setIntField(term3604188, term3604188.getClass(), "type", 37);
        setField(term3604188, term3604188.getClass(), "next", null);
        setField(term3604189, term3604189.getClass(), "str", null);
        setIntField(term3604189, term3604189.getClass(), "type", 35);
        setDoubleField(term3604190, term3604190.getClass(), "number", 0.0);
        setIntField(term3604190, term3604190.getClass(), "type", 44);
        setField(term3604191, term3604191.getClass(), "str", null);
        setIntField(term3604191, term3604191.getClass(), "type", 0);
        setField(term3604191, term3604191.getClass(), "next", null);
        setField(term3604191, term3604191.getClass(), "first", null);
        setField(term3604191, term3604191.getClass(), "last", null);
        setField(term3604191, term3604191.getClass(), "propListHead", null);
        setIntField(term3604191, term3604191.getClass(), "sourcePosition", 0);
        setField(term3604191, term3604191.getClass(), "jsType", null);
        setField(term3604191, term3604191.getClass(), "parent", null);
        setField(term3604190, term3604190.getClass(), "next", term3604191);
        setField(term3604190, term3604190.getClass(), "first", null);
        setField(term3604190, term3604190.getClass(), "last", null);
        setField(term3604190, term3604190.getClass(), "propListHead", null);
        setIntField(term3604190, term3604190.getClass(), "sourcePosition", 0);
        setField(term3604190, term3604190.getClass(), "jsType", null);
        setField(term3604190, term3604190.getClass(), "parent", null);
        setField(term3604189, term3604189.getClass(), "next", term3604190);
        setField(term3604192, term3604192.getClass(), "str", "");
        setIntField(term3604192, term3604192.getClass(), "type", 40);
        setField(term3604195, term3604195.getClass(), "str", "");
        setIntField(term3604195, term3604195.getClass(), "type", 40);
        setField(term3604195, term3604195.getClass(), "next", null);
        setField(term3604195, term3604195.getClass(), "first", null);
        setField(term3604195, term3604195.getClass(), "last", null);
        setField(term3604195, term3604195.getClass(), "propListHead", null);
        setIntField(term3604195, term3604195.getClass(), "sourcePosition", 0);
        setField(term3604195, term3604195.getClass(), "jsType", null);
        setField(term3604195, term3604195.getClass(), "parent", null);
        setField(term3604192, term3604192.getClass(), "next", term3604195);
        setField(term3604192, term3604192.getClass(), "first", null);
        setField(term3604192, term3604192.getClass(), "last", null);
        setField(term3604192, term3604192.getClass(), "propListHead", null);
        setIntField(term3604192, term3604192.getClass(), "sourcePosition", 0);
        setField(term3604192, term3604192.getClass(), "jsType", null);
        setField(term3604192, term3604192.getClass(), "parent", null);
        setField(term3604189, term3604189.getClass(), "first", term3604192);
        setField(term3604189, term3604189.getClass(), "last", null);
        setField(term3604189, term3604189.getClass(), "propListHead", null);
        setIntField(term3604189, term3604189.getClass(), "sourcePosition", 0);
        setField(term3604189, term3604189.getClass(), "jsType", null);
        setField(term3604189, term3604189.getClass(), "parent", null);
        setField(term3604188, term3604188.getClass(), "first", term3604189);
        setField(term3604188, term3604188.getClass(), "last", null);
        setField(term3604188, term3604188.getClass(), "propListHead", null);
        setIntField(term3604188, term3604188.getClass(), "sourcePosition", 0);
        setField(term3604188, term3604188.getClass(), "jsType", null);
        setField(term3604188, term3604188.getClass(), "parent", null);
        term3603830 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3603832 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3603834 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3603837 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3603841 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3603845 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3603830, term3603830.getClass(), "str", null);
        setIntField(term3603830, term3603830.getClass(), "type", 37);
        setField(term3603830, term3603830.getClass(), "next", null);
        setField(term3603832, term3603832.getClass(), "str", null);
        setIntField(term3603832, term3603832.getClass(), "type", 35);
        setDoubleField(term3603834, term3603834.getClass(), "number", 0.0);
        setIntField(term3603834, term3603834.getClass(), "type", 44);
        setField(term3603837, term3603837.getClass(), "str", null);
        setIntField(term3603837, term3603837.getClass(), "type", 0);
        setField(term3603837, term3603837.getClass(), "next", null);
        setField(term3603837, term3603837.getClass(), "first", null);
        setField(term3603837, term3603837.getClass(), "last", null);
        setField(term3603837, term3603837.getClass(), "propListHead", null);
        setIntField(term3603837, term3603837.getClass(), "sourcePosition", 0);
        setField(term3603837, term3603837.getClass(), "jsType", null);
        setField(term3603837, term3603837.getClass(), "parent", null);
        setField(term3603834, term3603834.getClass(), "next", term3603837);
        setField(term3603834, term3603834.getClass(), "first", null);
        setField(term3603834, term3603834.getClass(), "last", null);
        setField(term3603834, term3603834.getClass(), "propListHead", null);
        setIntField(term3603834, term3603834.getClass(), "sourcePosition", 0);
        setField(term3603834, term3603834.getClass(), "jsType", null);
        setField(term3603834, term3603834.getClass(), "parent", null);
        setField(term3603832, term3603832.getClass(), "next", term3603834);
        setField(term3603841, term3603841.getClass(), "str", "");
        setIntField(term3603841, term3603841.getClass(), "type", 40);
        setField(term3603845, term3603845.getClass(), "str", "");
        setIntField(term3603845, term3603845.getClass(), "type", 40);
        setField(term3603845, term3603845.getClass(), "next", null);
        setField(term3603845, term3603845.getClass(), "first", null);
        setField(term3603845, term3603845.getClass(), "last", null);
        setField(term3603845, term3603845.getClass(), "propListHead", null);
        setIntField(term3603845, term3603845.getClass(), "sourcePosition", 0);
        setField(term3603845, term3603845.getClass(), "jsType", null);
        setField(term3603845, term3603845.getClass(), "parent", null);
        setField(term3603841, term3603841.getClass(), "next", term3603845);
        setField(term3603841, term3603841.getClass(), "first", null);
        setField(term3603841, term3603841.getClass(), "last", null);
        setField(term3603841, term3603841.getClass(), "propListHead", null);
        setIntField(term3603841, term3603841.getClass(), "sourcePosition", 0);
        setField(term3603841, term3603841.getClass(), "jsType", null);
        setField(term3603841, term3603841.getClass(), "parent", null);
        setField(term3603832, term3603832.getClass(), "first", term3603841);
        setField(term3603832, term3603832.getClass(), "last", null);
        setField(term3603832, term3603832.getClass(), "propListHead", null);
        setIntField(term3603832, term3603832.getClass(), "sourcePosition", 0);
        setField(term3603832, term3603832.getClass(), "jsType", null);
        setField(term3603832, term3603832.getClass(), "parent", null);
        setField(term3603830, term3603830.getClass(), "first", term3603832);
        setField(term3603830, term3603830.getClass(), "last", null);
        setField(term3603830, term3603830.getClass(), "propListHead", null);
        setIntField(term3603830, term3603830.getClass(), "sourcePosition", 0);
        setField(term3603830, term3603830.getClass(), "jsType", null);
        setField(term3603830, term3603830.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3602809;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3602717, args);
        assertTrue(recursiveEquals(term3602717, term3604187));
        assertTrue(recursiveEquals(term3602809, term3604188));
        assertTrue(recursiveEquals(retValue, term3603830));
    }

};


