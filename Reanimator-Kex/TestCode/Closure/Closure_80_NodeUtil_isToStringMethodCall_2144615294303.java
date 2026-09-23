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

public class NodeUtil_isToStringMethodCall_2144615294303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4437;
     Object term27380;

    public NodeUtil_isToStringMethodCall_2144615294303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4450 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4460 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4437, term4437.getClass(), "type", 2129957018);
        setIntField(term4439, term4439.getClass(), "type", -297957951);
        setIntField(term4441, term4441.getClass(), "type", 0);
        setField(term4441, term4441.getClass(), "next", null);
        setField(term4441, term4441.getClass(), "first", null);
        setField(term4441, term4441.getClass(), "last", null);
        setField(term4441, term4441.getClass(), "propListHead", null);
        setIntField(term4441, term4441.getClass(), "sourcePosition", 0);
        setField(term4441, term4441.getClass(), "jsType", null);
        setField(term4441, term4441.getClass(), "parent", null);
        setField(term4439, term4439.getClass(), "next", term4441);
        setIntField(term4444, term4444.getClass(), "type", 0);
        setField(term4444, term4444.getClass(), "next", null);
        setField(term4444, term4444.getClass(), "first", null);
        setField(term4444, term4444.getClass(), "last", null);
        setField(term4444, term4444.getClass(), "propListHead", null);
        setIntField(term4444, term4444.getClass(), "sourcePosition", 0);
        setField(term4444, term4444.getClass(), "jsType", null);
        setField(term4444, term4444.getClass(), "parent", null);
        setField(term4439, term4439.getClass(), "first", term4444);
        setIntField(term4447, term4447.getClass(), "type", 0);
        setField(term4447, term4447.getClass(), "next", null);
        setField(term4447, term4447.getClass(), "first", null);
        setField(term4447, term4447.getClass(), "last", null);
        setField(term4447, term4447.getClass(), "propListHead", null);
        setIntField(term4447, term4447.getClass(), "sourcePosition", 0);
        setField(term4447, term4447.getClass(), "jsType", null);
        setField(term4447, term4447.getClass(), "parent", null);
        setField(term4439, term4439.getClass(), "last", term4447);
        setField(term4450, term4450.getClass(), "next", null);
        setIntField(term4450, term4450.getClass(), "type", 0);
        setIntField(term4450, term4450.getClass(), "intValue", 0);
        setField(term4450, term4450.getClass(), "objectValue", null);
        setField(term4439, term4439.getClass(), "propListHead", term4450);
        setIntField(term4439, term4439.getClass(), "sourcePosition", 1875252647);
        setField(term4439, term4439.getClass(), "jsType", null);
        setField(term4439, term4439.getClass(), "parent", null);
        setField(term4437, term4437.getClass(), "next", term4439);
        setIntField(term4454, term4454.getClass(), "type", 0);
        setField(term4454, term4454.getClass(), "next", null);
        setField(term4454, term4454.getClass(), "first", null);
        setField(term4454, term4454.getClass(), "last", null);
        setField(term4454, term4454.getClass(), "propListHead", null);
        setIntField(term4454, term4454.getClass(), "sourcePosition", 0);
        setField(term4454, term4454.getClass(), "jsType", null);
        setField(term4454, term4454.getClass(), "parent", null);
        setField(term4437, term4437.getClass(), "first", term4454);
        setIntField(term4457, term4457.getClass(), "type", 0);
        setField(term4457, term4457.getClass(), "next", null);
        setField(term4457, term4457.getClass(), "first", null);
        setField(term4457, term4457.getClass(), "last", null);
        setField(term4457, term4457.getClass(), "propListHead", null);
        setIntField(term4457, term4457.getClass(), "sourcePosition", 0);
        setField(term4457, term4457.getClass(), "jsType", null);
        setField(term4457, term4457.getClass(), "parent", null);
        setField(term4437, term4437.getClass(), "last", term4457);
        setField(term4460, term4460.getClass(), "next", null);
        setIntField(term4460, term4460.getClass(), "type", 0);
        setIntField(term4460, term4460.getClass(), "intValue", 0);
        setField(term4460, term4460.getClass(), "objectValue", null);
        setField(term4437, term4437.getClass(), "propListHead", term4460);
        setIntField(term4437, term4437.getClass(), "sourcePosition", -1298688401);
        setField(term4437, term4437.getClass(), "jsType", null);
        setField(term4437, term4437.getClass(), "parent", null);
        term27380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27385 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term27386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27388 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term27380, term27380.getClass(), "type", 2129957018);
        setIntField(term27381, term27381.getClass(), "type", -297957951);
        setIntField(term27382, term27382.getClass(), "type", 0);
        setField(term27382, term27382.getClass(), "next", null);
        setField(term27382, term27382.getClass(), "first", null);
        setField(term27382, term27382.getClass(), "last", null);
        setField(term27382, term27382.getClass(), "propListHead", null);
        setIntField(term27382, term27382.getClass(), "sourcePosition", 0);
        setField(term27382, term27382.getClass(), "jsType", null);
        setField(term27382, term27382.getClass(), "parent", null);
        setField(term27381, term27381.getClass(), "next", term27382);
        setIntField(term27383, term27383.getClass(), "type", 0);
        setField(term27383, term27383.getClass(), "next", null);
        setField(term27383, term27383.getClass(), "first", null);
        setField(term27383, term27383.getClass(), "last", null);
        setField(term27383, term27383.getClass(), "propListHead", null);
        setIntField(term27383, term27383.getClass(), "sourcePosition", 0);
        setField(term27383, term27383.getClass(), "jsType", null);
        setField(term27383, term27383.getClass(), "parent", null);
        setField(term27381, term27381.getClass(), "first", term27383);
        setIntField(term27384, term27384.getClass(), "type", 0);
        setField(term27384, term27384.getClass(), "next", null);
        setField(term27384, term27384.getClass(), "first", null);
        setField(term27384, term27384.getClass(), "last", null);
        setField(term27384, term27384.getClass(), "propListHead", null);
        setIntField(term27384, term27384.getClass(), "sourcePosition", 0);
        setField(term27384, term27384.getClass(), "jsType", null);
        setField(term27384, term27384.getClass(), "parent", null);
        setField(term27381, term27381.getClass(), "last", term27384);
        setField(term27385, term27385.getClass(), "next", null);
        setIntField(term27385, term27385.getClass(), "type", 0);
        setIntField(term27385, term27385.getClass(), "intValue", 0);
        setField(term27385, term27385.getClass(), "objectValue", null);
        setField(term27381, term27381.getClass(), "propListHead", term27385);
        setIntField(term27381, term27381.getClass(), "sourcePosition", 1875252647);
        setField(term27381, term27381.getClass(), "jsType", null);
        setField(term27381, term27381.getClass(), "parent", null);
        setField(term27380, term27380.getClass(), "next", term27381);
        setIntField(term27386, term27386.getClass(), "type", 0);
        setField(term27386, term27386.getClass(), "next", null);
        setField(term27386, term27386.getClass(), "first", null);
        setField(term27386, term27386.getClass(), "last", null);
        setField(term27386, term27386.getClass(), "propListHead", null);
        setIntField(term27386, term27386.getClass(), "sourcePosition", 0);
        setField(term27386, term27386.getClass(), "jsType", null);
        setField(term27386, term27386.getClass(), "parent", null);
        setField(term27380, term27380.getClass(), "first", term27386);
        setIntField(term27387, term27387.getClass(), "type", 0);
        setField(term27387, term27387.getClass(), "next", null);
        setField(term27387, term27387.getClass(), "first", null);
        setField(term27387, term27387.getClass(), "last", null);
        setField(term27387, term27387.getClass(), "propListHead", null);
        setIntField(term27387, term27387.getClass(), "sourcePosition", 0);
        setField(term27387, term27387.getClass(), "jsType", null);
        setField(term27387, term27387.getClass(), "parent", null);
        setField(term27380, term27380.getClass(), "last", term27387);
        setField(term27388, term27388.getClass(), "next", null);
        setIntField(term27388, term27388.getClass(), "type", 0);
        setIntField(term27388, term27388.getClass(), "intValue", 0);
        setField(term27388, term27388.getClass(), "objectValue", null);
        setField(term27380, term27380.getClass(), "propListHead", term27388);
        setIntField(term27380, term27380.getClass(), "sourcePosition", -1298688401);
        setField(term27380, term27380.getClass(), "jsType", null);
        setField(term27380, term27380.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4437;
        Object retValue = callMethod(klass, "isToStringMethodCall", argTypes, null, args);
        assertTrue(recursiveEquals(term4437, term27380));
        assertTrue(recursiveEquals(retValue, false));
    }

};


