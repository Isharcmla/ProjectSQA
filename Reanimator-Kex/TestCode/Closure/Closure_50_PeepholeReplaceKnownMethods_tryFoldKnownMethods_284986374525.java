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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3500137;
     Object term3500229;
     Object term3502256;
     Object term3502257;
     Object term3501952;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3500137 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3500229 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3500321 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3500413 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3500505 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3500635 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3500321, term3500321.getClass(), "type", 35);
        setIntField(term3500505, term3500505.getClass(), "type", 40);
        setField(term3500505, term3500505.getClass(), "str", "charCodeAt");
        setField(term3500413, term3500413.getClass(), "next", term3500505);
        setIntField(term3500413, term3500413.getClass(), "type", 40);
        setField(term3500321, term3500321.getClass(), "first", term3500413);
        setIntField(term3500635, term3500635.getClass(), "type", 41);
        setField(term3500321, term3500321.getClass(), "next", term3500635);
        setField(term3500229, term3500229.getClass(), "first", term3500321);
        setIntField(term3500229, term3500229.getClass(), "type", 37);
        term3502256 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3502256, term3502256.getClass(), "currentTraversal", null);
        term3502257 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3502258 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3502259 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3502260 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3502261 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3502257, term3502257.getClass(), "str", null);
        setIntField(term3502257, term3502257.getClass(), "type", 37);
        setField(term3502257, term3502257.getClass(), "next", null);
        setField(term3502258, term3502258.getClass(), "str", null);
        setIntField(term3502258, term3502258.getClass(), "type", 35);
        setDoubleField(term3502259, term3502259.getClass(), "number", 0.0);
        setIntField(term3502259, term3502259.getClass(), "type", 41);
        setField(term3502259, term3502259.getClass(), "next", null);
        setField(term3502259, term3502259.getClass(), "first", null);
        setField(term3502259, term3502259.getClass(), "last", null);
        setField(term3502259, term3502259.getClass(), "propListHead", null);
        setIntField(term3502259, term3502259.getClass(), "sourcePosition", 0);
        setField(term3502259, term3502259.getClass(), "jsType", null);
        setField(term3502259, term3502259.getClass(), "parent", null);
        setField(term3502258, term3502258.getClass(), "next", term3502259);
        setField(term3502260, term3502260.getClass(), "str", null);
        setIntField(term3502260, term3502260.getClass(), "type", 40);
        setField(term3502261, term3502261.getClass(), "str", "");
        setIntField(term3502261, term3502261.getClass(), "type", 40);
        setField(term3502261, term3502261.getClass(), "next", null);
        setField(term3502261, term3502261.getClass(), "first", null);
        setField(term3502261, term3502261.getClass(), "last", null);
        setField(term3502261, term3502261.getClass(), "propListHead", null);
        setIntField(term3502261, term3502261.getClass(), "sourcePosition", 0);
        setField(term3502261, term3502261.getClass(), "jsType", null);
        setField(term3502261, term3502261.getClass(), "parent", null);
        setField(term3502260, term3502260.getClass(), "next", term3502261);
        setField(term3502260, term3502260.getClass(), "first", null);
        setField(term3502260, term3502260.getClass(), "last", null);
        setField(term3502260, term3502260.getClass(), "propListHead", null);
        setIntField(term3502260, term3502260.getClass(), "sourcePosition", 0);
        setField(term3502260, term3502260.getClass(), "jsType", null);
        setField(term3502260, term3502260.getClass(), "parent", null);
        setField(term3502258, term3502258.getClass(), "first", term3502260);
        setField(term3502258, term3502258.getClass(), "last", null);
        setField(term3502258, term3502258.getClass(), "propListHead", null);
        setIntField(term3502258, term3502258.getClass(), "sourcePosition", 0);
        setField(term3502258, term3502258.getClass(), "jsType", null);
        setField(term3502258, term3502258.getClass(), "parent", null);
        setField(term3502257, term3502257.getClass(), "first", term3502258);
        setField(term3502257, term3502257.getClass(), "last", null);
        setField(term3502257, term3502257.getClass(), "propListHead", null);
        setIntField(term3502257, term3502257.getClass(), "sourcePosition", 0);
        setField(term3502257, term3502257.getClass(), "jsType", null);
        setField(term3502257, term3502257.getClass(), "parent", null);
        term3501952 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501954 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501956 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3501960 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501962 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3501952, term3501952.getClass(), "str", null);
        setIntField(term3501952, term3501952.getClass(), "type", 37);
        setField(term3501952, term3501952.getClass(), "next", null);
        setField(term3501954, term3501954.getClass(), "str", null);
        setIntField(term3501954, term3501954.getClass(), "type", 35);
        setDoubleField(term3501956, term3501956.getClass(), "number", 0.0);
        setIntField(term3501956, term3501956.getClass(), "type", 41);
        setField(term3501956, term3501956.getClass(), "next", null);
        setField(term3501956, term3501956.getClass(), "first", null);
        setField(term3501956, term3501956.getClass(), "last", null);
        setField(term3501956, term3501956.getClass(), "propListHead", null);
        setIntField(term3501956, term3501956.getClass(), "sourcePosition", 0);
        setField(term3501956, term3501956.getClass(), "jsType", null);
        setField(term3501956, term3501956.getClass(), "parent", null);
        setField(term3501954, term3501954.getClass(), "next", term3501956);
        setField(term3501960, term3501960.getClass(), "str", null);
        setIntField(term3501960, term3501960.getClass(), "type", 40);
        setField(term3501962, term3501962.getClass(), "str", "");
        setIntField(term3501962, term3501962.getClass(), "type", 40);
        setField(term3501962, term3501962.getClass(), "next", null);
        setField(term3501962, term3501962.getClass(), "first", null);
        setField(term3501962, term3501962.getClass(), "last", null);
        setField(term3501962, term3501962.getClass(), "propListHead", null);
        setIntField(term3501962, term3501962.getClass(), "sourcePosition", 0);
        setField(term3501962, term3501962.getClass(), "jsType", null);
        setField(term3501962, term3501962.getClass(), "parent", null);
        setField(term3501960, term3501960.getClass(), "next", term3501962);
        setField(term3501960, term3501960.getClass(), "first", null);
        setField(term3501960, term3501960.getClass(), "last", null);
        setField(term3501960, term3501960.getClass(), "propListHead", null);
        setIntField(term3501960, term3501960.getClass(), "sourcePosition", 0);
        setField(term3501960, term3501960.getClass(), "jsType", null);
        setField(term3501960, term3501960.getClass(), "parent", null);
        setField(term3501954, term3501954.getClass(), "first", term3501960);
        setField(term3501954, term3501954.getClass(), "last", null);
        setField(term3501954, term3501954.getClass(), "propListHead", null);
        setIntField(term3501954, term3501954.getClass(), "sourcePosition", 0);
        setField(term3501954, term3501954.getClass(), "jsType", null);
        setField(term3501954, term3501954.getClass(), "parent", null);
        setField(term3501952, term3501952.getClass(), "first", term3501954);
        setField(term3501952, term3501952.getClass(), "last", null);
        setField(term3501952, term3501952.getClass(), "propListHead", null);
        setIntField(term3501952, term3501952.getClass(), "sourcePosition", 0);
        setField(term3501952, term3501952.getClass(), "jsType", null);
        setField(term3501952, term3501952.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3500229;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3500137, args);
        assertTrue(recursiveEquals(term3500137, term3502256));
        assertTrue(recursiveEquals(term3500229, term3502257));
        assertTrue(recursiveEquals(retValue, term3501952));
    }

};


