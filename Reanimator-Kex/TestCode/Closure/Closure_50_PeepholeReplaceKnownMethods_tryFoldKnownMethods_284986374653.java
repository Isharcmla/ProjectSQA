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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3579406;
     Object term3579498;
     Object term3580949;
     Object term3580950;
     Object term3580760;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3579406 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3579498 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3579590 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3579682 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3579774 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3579904 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3579590, term3579590.getClass(), "type", 35);
        setIntField(term3579774, term3579774.getClass(), "type", 40);
        setField(term3579774, term3579774.getClass(), "str", "");
        setField(term3579682, term3579682.getClass(), "next", term3579774);
        setIntField(term3579682, term3579682.getClass(), "type", 40);
        setField(term3579590, term3579590.getClass(), "first", term3579682);
        setIntField(term3579904, term3579904.getClass(), "type", 41);
        setField(term3579590, term3579590.getClass(), "next", term3579904);
        setField(term3579498, term3579498.getClass(), "first", term3579590);
        setIntField(term3579498, term3579498.getClass(), "type", 37);
        term3580949 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3580949, term3580949.getClass(), "currentTraversal", null);
        term3580950 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3580951 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3580952 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3580953 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3580954 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3580950, term3580950.getClass(), "str", null);
        setIntField(term3580950, term3580950.getClass(), "type", 37);
        setField(term3580950, term3580950.getClass(), "next", null);
        setField(term3580951, term3580951.getClass(), "str", null);
        setIntField(term3580951, term3580951.getClass(), "type", 35);
        setField(term3580952, term3580952.getClass(), "str", null);
        setIntField(term3580952, term3580952.getClass(), "type", 41);
        setField(term3580952, term3580952.getClass(), "next", null);
        setField(term3580952, term3580952.getClass(), "first", null);
        setField(term3580952, term3580952.getClass(), "last", null);
        setField(term3580952, term3580952.getClass(), "propListHead", null);
        setIntField(term3580952, term3580952.getClass(), "sourcePosition", 0);
        setField(term3580952, term3580952.getClass(), "jsType", null);
        setField(term3580952, term3580952.getClass(), "parent", null);
        setField(term3580951, term3580951.getClass(), "next", term3580952);
        setField(term3580953, term3580953.getClass(), "str", null);
        setIntField(term3580953, term3580953.getClass(), "type", 40);
        setField(term3580954, term3580954.getClass(), "str", "");
        setIntField(term3580954, term3580954.getClass(), "type", 40);
        setField(term3580954, term3580954.getClass(), "next", null);
        setField(term3580954, term3580954.getClass(), "first", null);
        setField(term3580954, term3580954.getClass(), "last", null);
        setField(term3580954, term3580954.getClass(), "propListHead", null);
        setIntField(term3580954, term3580954.getClass(), "sourcePosition", 0);
        setField(term3580954, term3580954.getClass(), "jsType", null);
        setField(term3580954, term3580954.getClass(), "parent", null);
        setField(term3580953, term3580953.getClass(), "next", term3580954);
        setField(term3580953, term3580953.getClass(), "first", null);
        setField(term3580953, term3580953.getClass(), "last", null);
        setField(term3580953, term3580953.getClass(), "propListHead", null);
        setIntField(term3580953, term3580953.getClass(), "sourcePosition", 0);
        setField(term3580953, term3580953.getClass(), "jsType", null);
        setField(term3580953, term3580953.getClass(), "parent", null);
        setField(term3580951, term3580951.getClass(), "first", term3580953);
        setField(term3580951, term3580951.getClass(), "last", null);
        setField(term3580951, term3580951.getClass(), "propListHead", null);
        setIntField(term3580951, term3580951.getClass(), "sourcePosition", 0);
        setField(term3580951, term3580951.getClass(), "jsType", null);
        setField(term3580951, term3580951.getClass(), "parent", null);
        setField(term3580950, term3580950.getClass(), "first", term3580951);
        setField(term3580950, term3580950.getClass(), "last", null);
        setField(term3580950, term3580950.getClass(), "propListHead", null);
        setIntField(term3580950, term3580950.getClass(), "sourcePosition", 0);
        setField(term3580950, term3580950.getClass(), "jsType", null);
        setField(term3580950, term3580950.getClass(), "parent", null);
        term3580760 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3580762 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3580764 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3580767 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3580769 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3580760, term3580760.getClass(), "str", null);
        setIntField(term3580760, term3580760.getClass(), "type", 37);
        setField(term3580760, term3580760.getClass(), "next", null);
        setField(term3580762, term3580762.getClass(), "str", null);
        setIntField(term3580762, term3580762.getClass(), "type", 35);
        setField(term3580764, term3580764.getClass(), "str", null);
        setIntField(term3580764, term3580764.getClass(), "type", 41);
        setField(term3580764, term3580764.getClass(), "next", null);
        setField(term3580764, term3580764.getClass(), "first", null);
        setField(term3580764, term3580764.getClass(), "last", null);
        setField(term3580764, term3580764.getClass(), "propListHead", null);
        setIntField(term3580764, term3580764.getClass(), "sourcePosition", 0);
        setField(term3580764, term3580764.getClass(), "jsType", null);
        setField(term3580764, term3580764.getClass(), "parent", null);
        setField(term3580762, term3580762.getClass(), "next", term3580764);
        setField(term3580767, term3580767.getClass(), "str", null);
        setIntField(term3580767, term3580767.getClass(), "type", 40);
        setField(term3580769, term3580769.getClass(), "str", "");
        setIntField(term3580769, term3580769.getClass(), "type", 40);
        setField(term3580769, term3580769.getClass(), "next", null);
        setField(term3580769, term3580769.getClass(), "first", null);
        setField(term3580769, term3580769.getClass(), "last", null);
        setField(term3580769, term3580769.getClass(), "propListHead", null);
        setIntField(term3580769, term3580769.getClass(), "sourcePosition", 0);
        setField(term3580769, term3580769.getClass(), "jsType", null);
        setField(term3580769, term3580769.getClass(), "parent", null);
        setField(term3580767, term3580767.getClass(), "next", term3580769);
        setField(term3580767, term3580767.getClass(), "first", null);
        setField(term3580767, term3580767.getClass(), "last", null);
        setField(term3580767, term3580767.getClass(), "propListHead", null);
        setIntField(term3580767, term3580767.getClass(), "sourcePosition", 0);
        setField(term3580767, term3580767.getClass(), "jsType", null);
        setField(term3580767, term3580767.getClass(), "parent", null);
        setField(term3580762, term3580762.getClass(), "first", term3580767);
        setField(term3580762, term3580762.getClass(), "last", null);
        setField(term3580762, term3580762.getClass(), "propListHead", null);
        setIntField(term3580762, term3580762.getClass(), "sourcePosition", 0);
        setField(term3580762, term3580762.getClass(), "jsType", null);
        setField(term3580762, term3580762.getClass(), "parent", null);
        setField(term3580760, term3580760.getClass(), "first", term3580762);
        setField(term3580760, term3580760.getClass(), "last", null);
        setField(term3580760, term3580760.getClass(), "propListHead", null);
        setIntField(term3580760, term3580760.getClass(), "sourcePosition", 0);
        setField(term3580760, term3580760.getClass(), "jsType", null);
        setField(term3580760, term3580760.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3579498;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3579406, args);
        assertTrue(recursiveEquals(term3579406, term3580949));
        assertTrue(recursiveEquals(term3579498, term3580950));
        assertTrue(recursiveEquals(retValue, term3580760));
    }

};


