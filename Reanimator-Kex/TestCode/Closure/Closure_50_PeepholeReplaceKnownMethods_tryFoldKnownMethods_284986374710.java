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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3615344;
     Object term3615436;
     Object term3618433;
     Object term3618434;
     Object term3617789;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3615344 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3615436 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3615528 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3615620 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3615712 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3615880 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3615528, term3615528.getClass(), "type", 35);
        setIntField(term3615712, term3615712.getClass(), "type", 40);
        setField(term3615712, term3615712.getClass(), "str", "charAt");
        setField(term3615620, term3615620.getClass(), "next", term3615712);
        setIntField(term3615620, term3615620.getClass(), "type", 40);
        setField(term3615620, term3615620.getClass(), "str", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term3615528, term3615528.getClass(), "first", term3615620);
        setIntField(term3615880, term3615880.getClass(), "type", 39);
        setField(term3615880, term3615880.getClass(), "next", null);
        setDoubleField(term3615880, term3615880.getClass(), "number", -2.83654688719500288E17);
        setField(term3615528, term3615528.getClass(), "next", term3615880);
        setField(term3615436, term3615436.getClass(), "first", term3615528);
        setIntField(term3615436, term3615436.getClass(), "type", 37);
        term3618433 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3618433, term3618433.getClass(), "currentTraversal", null);
        term3618434 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3618435 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3618436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3618437 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3618440 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3618434, term3618434.getClass(), "str", null);
        setIntField(term3618434, term3618434.getClass(), "type", 37);
        setField(term3618434, term3618434.getClass(), "next", null);
        setField(term3618435, term3618435.getClass(), "str", null);
        setIntField(term3618435, term3618435.getClass(), "type", 35);
        setDoubleField(term3618436, term3618436.getClass(), "number", -2.83654688719500288E17);
        setIntField(term3618436, term3618436.getClass(), "type", 39);
        setField(term3618436, term3618436.getClass(), "next", null);
        setField(term3618436, term3618436.getClass(), "first", null);
        setField(term3618436, term3618436.getClass(), "last", null);
        setField(term3618436, term3618436.getClass(), "propListHead", null);
        setIntField(term3618436, term3618436.getClass(), "sourcePosition", 0);
        setField(term3618436, term3618436.getClass(), "jsType", null);
        setField(term3618436, term3618436.getClass(), "parent", null);
        setField(term3618435, term3618435.getClass(), "next", term3618436);
        setField(term3618437, term3618437.getClass(), "str", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setIntField(term3618437, term3618437.getClass(), "type", 40);
        setField(term3618440, term3618440.getClass(), "str", "");
        setIntField(term3618440, term3618440.getClass(), "type", 40);
        setField(term3618440, term3618440.getClass(), "next", null);
        setField(term3618440, term3618440.getClass(), "first", null);
        setField(term3618440, term3618440.getClass(), "last", null);
        setField(term3618440, term3618440.getClass(), "propListHead", null);
        setIntField(term3618440, term3618440.getClass(), "sourcePosition", 0);
        setField(term3618440, term3618440.getClass(), "jsType", null);
        setField(term3618440, term3618440.getClass(), "parent", null);
        setField(term3618437, term3618437.getClass(), "next", term3618440);
        setField(term3618437, term3618437.getClass(), "first", null);
        setField(term3618437, term3618437.getClass(), "last", null);
        setField(term3618437, term3618437.getClass(), "propListHead", null);
        setIntField(term3618437, term3618437.getClass(), "sourcePosition", 0);
        setField(term3618437, term3618437.getClass(), "jsType", null);
        setField(term3618437, term3618437.getClass(), "parent", null);
        setField(term3618435, term3618435.getClass(), "first", term3618437);
        setField(term3618435, term3618435.getClass(), "last", null);
        setField(term3618435, term3618435.getClass(), "propListHead", null);
        setIntField(term3618435, term3618435.getClass(), "sourcePosition", 0);
        setField(term3618435, term3618435.getClass(), "jsType", null);
        setField(term3618435, term3618435.getClass(), "parent", null);
        setField(term3618434, term3618434.getClass(), "first", term3618435);
        setField(term3618434, term3618434.getClass(), "last", null);
        setField(term3618434, term3618434.getClass(), "propListHead", null);
        setIntField(term3618434, term3618434.getClass(), "sourcePosition", 0);
        setField(term3618434, term3618434.getClass(), "jsType", null);
        setField(term3618434, term3618434.getClass(), "parent", null);
        term3617789 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3617791 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3617793 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3617797 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3617833 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3617789, term3617789.getClass(), "str", null);
        setIntField(term3617789, term3617789.getClass(), "type", 37);
        setField(term3617789, term3617789.getClass(), "next", null);
        setField(term3617791, term3617791.getClass(), "str", null);
        setIntField(term3617791, term3617791.getClass(), "type", 35);
        setDoubleField(term3617793, term3617793.getClass(), "number", -2.83654688719500288E17);
        setIntField(term3617793, term3617793.getClass(), "type", 39);
        setField(term3617793, term3617793.getClass(), "next", null);
        setField(term3617793, term3617793.getClass(), "first", null);
        setField(term3617793, term3617793.getClass(), "last", null);
        setField(term3617793, term3617793.getClass(), "propListHead", null);
        setIntField(term3617793, term3617793.getClass(), "sourcePosition", 0);
        setField(term3617793, term3617793.getClass(), "jsType", null);
        setField(term3617793, term3617793.getClass(), "parent", null);
        setField(term3617791, term3617791.getClass(), "next", term3617793);
        setField(term3617797, term3617797.getClass(), "str", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setIntField(term3617797, term3617797.getClass(), "type", 40);
        setField(term3617833, term3617833.getClass(), "str", "");
        setIntField(term3617833, term3617833.getClass(), "type", 40);
        setField(term3617833, term3617833.getClass(), "next", null);
        setField(term3617833, term3617833.getClass(), "first", null);
        setField(term3617833, term3617833.getClass(), "last", null);
        setField(term3617833, term3617833.getClass(), "propListHead", null);
        setIntField(term3617833, term3617833.getClass(), "sourcePosition", 0);
        setField(term3617833, term3617833.getClass(), "jsType", null);
        setField(term3617833, term3617833.getClass(), "parent", null);
        setField(term3617797, term3617797.getClass(), "next", term3617833);
        setField(term3617797, term3617797.getClass(), "first", null);
        setField(term3617797, term3617797.getClass(), "last", null);
        setField(term3617797, term3617797.getClass(), "propListHead", null);
        setIntField(term3617797, term3617797.getClass(), "sourcePosition", 0);
        setField(term3617797, term3617797.getClass(), "jsType", null);
        setField(term3617797, term3617797.getClass(), "parent", null);
        setField(term3617791, term3617791.getClass(), "first", term3617797);
        setField(term3617791, term3617791.getClass(), "last", null);
        setField(term3617791, term3617791.getClass(), "propListHead", null);
        setIntField(term3617791, term3617791.getClass(), "sourcePosition", 0);
        setField(term3617791, term3617791.getClass(), "jsType", null);
        setField(term3617791, term3617791.getClass(), "parent", null);
        setField(term3617789, term3617789.getClass(), "first", term3617791);
        setField(term3617789, term3617789.getClass(), "last", null);
        setField(term3617789, term3617789.getClass(), "propListHead", null);
        setIntField(term3617789, term3617789.getClass(), "sourcePosition", 0);
        setField(term3617789, term3617789.getClass(), "jsType", null);
        setField(term3617789, term3617789.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3615436;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3615344, args);
        assertTrue(recursiveEquals(term3615344, term3618433));
        assertTrue(recursiveEquals(term3615436, term3618434));
        assertTrue(recursiveEquals(retValue, term3617789));
    }

};


