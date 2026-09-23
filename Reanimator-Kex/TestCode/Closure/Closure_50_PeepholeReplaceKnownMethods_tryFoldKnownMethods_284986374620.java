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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3559279;
     Object term3559371;
     Object term3560411;
     Object term3560412;
     Object term3560101;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3559279 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3559371 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3559463 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3559555 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3559685 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3559463, term3559463.getClass(), "type", 35);
        setField(term3559555, term3559555.getClass(), "next", term3559555);
        setIntField(term3559555, term3559555.getClass(), "type", 40);
        setField(term3559555, term3559555.getClass(), "str", "indexOf");
        setField(term3559463, term3559463.getClass(), "first", term3559555);
        setIntField(term3559685, term3559685.getClass(), "type", 44);
        setField(term3559685, term3559685.getClass(), "next", term3559555);
        setField(term3559463, term3559463.getClass(), "next", term3559685);
        setField(term3559371, term3559371.getClass(), "first", term3559463);
        setIntField(term3559371, term3559371.getClass(), "type", 37);
        term3560411 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3560411, term3560411.getClass(), "currentTraversal", null);
        term3560412 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3560413 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3560414 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3560415 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3560412, term3560412.getClass(), "str", null);
        setIntField(term3560412, term3560412.getClass(), "type", 37);
        setField(term3560412, term3560412.getClass(), "next", null);
        setField(term3560413, term3560413.getClass(), "str", null);
        setIntField(term3560413, term3560413.getClass(), "type", 35);
        setDoubleField(term3560414, term3560414.getClass(), "number", 0.0);
        setIntField(term3560414, term3560414.getClass(), "type", 44);
        setField(term3560415, term3560415.getClass(), "str", "");
        setIntField(term3560415, term3560415.getClass(), "type", 40);
        setField(term3560415, term3560415.getClass(), "next", term3560415);
        setField(term3560415, term3560415.getClass(), "first", null);
        setField(term3560415, term3560415.getClass(), "last", null);
        setField(term3560415, term3560415.getClass(), "propListHead", null);
        setIntField(term3560415, term3560415.getClass(), "sourcePosition", 0);
        setField(term3560415, term3560415.getClass(), "jsType", null);
        setField(term3560415, term3560415.getClass(), "parent", null);
        setField(term3560414, term3560414.getClass(), "next", term3560415);
        setField(term3560414, term3560414.getClass(), "first", null);
        setField(term3560414, term3560414.getClass(), "last", null);
        setField(term3560414, term3560414.getClass(), "propListHead", null);
        setIntField(term3560414, term3560414.getClass(), "sourcePosition", 0);
        setField(term3560414, term3560414.getClass(), "jsType", null);
        setField(term3560414, term3560414.getClass(), "parent", null);
        setField(term3560413, term3560413.getClass(), "next", term3560414);
        setField(term3560413, term3560413.getClass(), "first", term3560415);
        setField(term3560413, term3560413.getClass(), "last", null);
        setField(term3560413, term3560413.getClass(), "propListHead", null);
        setIntField(term3560413, term3560413.getClass(), "sourcePosition", 0);
        setField(term3560413, term3560413.getClass(), "jsType", null);
        setField(term3560413, term3560413.getClass(), "parent", null);
        setField(term3560412, term3560412.getClass(), "first", term3560413);
        setField(term3560412, term3560412.getClass(), "last", null);
        setField(term3560412, term3560412.getClass(), "propListHead", null);
        setIntField(term3560412, term3560412.getClass(), "sourcePosition", 0);
        setField(term3560412, term3560412.getClass(), "jsType", null);
        setField(term3560412, term3560412.getClass(), "parent", null);
        term3560101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3560103 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3560105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3560108 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3560101, term3560101.getClass(), "str", null);
        setIntField(term3560101, term3560101.getClass(), "type", 37);
        setField(term3560101, term3560101.getClass(), "next", null);
        setField(term3560103, term3560103.getClass(), "str", null);
        setIntField(term3560103, term3560103.getClass(), "type", 35);
        setDoubleField(term3560105, term3560105.getClass(), "number", 0.0);
        setIntField(term3560105, term3560105.getClass(), "type", 44);
        setField(term3560108, term3560108.getClass(), "str", "");
        setIntField(term3560108, term3560108.getClass(), "type", 40);
        setField(term3560108, term3560108.getClass(), "next", term3560108);
        setField(term3560108, term3560108.getClass(), "first", null);
        setField(term3560108, term3560108.getClass(), "last", null);
        setField(term3560108, term3560108.getClass(), "propListHead", null);
        setIntField(term3560108, term3560108.getClass(), "sourcePosition", 0);
        setField(term3560108, term3560108.getClass(), "jsType", null);
        setField(term3560108, term3560108.getClass(), "parent", null);
        setField(term3560105, term3560105.getClass(), "next", term3560108);
        setField(term3560105, term3560105.getClass(), "first", null);
        setField(term3560105, term3560105.getClass(), "last", null);
        setField(term3560105, term3560105.getClass(), "propListHead", null);
        setIntField(term3560105, term3560105.getClass(), "sourcePosition", 0);
        setField(term3560105, term3560105.getClass(), "jsType", null);
        setField(term3560105, term3560105.getClass(), "parent", null);
        setField(term3560103, term3560103.getClass(), "next", term3560105);
        setField(term3560103, term3560103.getClass(), "first", term3560108);
        setField(term3560103, term3560103.getClass(), "last", null);
        setField(term3560103, term3560103.getClass(), "propListHead", null);
        setIntField(term3560103, term3560103.getClass(), "sourcePosition", 0);
        setField(term3560103, term3560103.getClass(), "jsType", null);
        setField(term3560103, term3560103.getClass(), "parent", null);
        setField(term3560101, term3560101.getClass(), "first", term3560103);
        setField(term3560101, term3560101.getClass(), "last", null);
        setField(term3560101, term3560101.getClass(), "propListHead", null);
        setIntField(term3560101, term3560101.getClass(), "sourcePosition", 0);
        setField(term3560101, term3560101.getClass(), "jsType", null);
        setField(term3560101, term3560101.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3559371;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3559279, args);
        assertTrue(recursiveEquals(term3559279, term3560411));
        assertTrue(recursiveEquals(term3559371, term3560412));
        assertTrue(recursiveEquals(retValue, term3560101));
    }

};


