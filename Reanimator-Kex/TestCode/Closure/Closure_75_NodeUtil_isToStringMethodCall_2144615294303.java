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
     Object term27427;

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
        term27427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27432 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term27433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27435 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term27427, term27427.getClass(), "type", 2129957018);
        setIntField(term27428, term27428.getClass(), "type", -297957951);
        setIntField(term27429, term27429.getClass(), "type", 0);
        setField(term27429, term27429.getClass(), "next", null);
        setField(term27429, term27429.getClass(), "first", null);
        setField(term27429, term27429.getClass(), "last", null);
        setField(term27429, term27429.getClass(), "propListHead", null);
        setIntField(term27429, term27429.getClass(), "sourcePosition", 0);
        setField(term27429, term27429.getClass(), "jsType", null);
        setField(term27429, term27429.getClass(), "parent", null);
        setField(term27428, term27428.getClass(), "next", term27429);
        setIntField(term27430, term27430.getClass(), "type", 0);
        setField(term27430, term27430.getClass(), "next", null);
        setField(term27430, term27430.getClass(), "first", null);
        setField(term27430, term27430.getClass(), "last", null);
        setField(term27430, term27430.getClass(), "propListHead", null);
        setIntField(term27430, term27430.getClass(), "sourcePosition", 0);
        setField(term27430, term27430.getClass(), "jsType", null);
        setField(term27430, term27430.getClass(), "parent", null);
        setField(term27428, term27428.getClass(), "first", term27430);
        setIntField(term27431, term27431.getClass(), "type", 0);
        setField(term27431, term27431.getClass(), "next", null);
        setField(term27431, term27431.getClass(), "first", null);
        setField(term27431, term27431.getClass(), "last", null);
        setField(term27431, term27431.getClass(), "propListHead", null);
        setIntField(term27431, term27431.getClass(), "sourcePosition", 0);
        setField(term27431, term27431.getClass(), "jsType", null);
        setField(term27431, term27431.getClass(), "parent", null);
        setField(term27428, term27428.getClass(), "last", term27431);
        setField(term27432, term27432.getClass(), "next", null);
        setIntField(term27432, term27432.getClass(), "type", 0);
        setIntField(term27432, term27432.getClass(), "intValue", 0);
        setField(term27432, term27432.getClass(), "objectValue", null);
        setField(term27428, term27428.getClass(), "propListHead", term27432);
        setIntField(term27428, term27428.getClass(), "sourcePosition", 1875252647);
        setField(term27428, term27428.getClass(), "jsType", null);
        setField(term27428, term27428.getClass(), "parent", null);
        setField(term27427, term27427.getClass(), "next", term27428);
        setIntField(term27433, term27433.getClass(), "type", 0);
        setField(term27433, term27433.getClass(), "next", null);
        setField(term27433, term27433.getClass(), "first", null);
        setField(term27433, term27433.getClass(), "last", null);
        setField(term27433, term27433.getClass(), "propListHead", null);
        setIntField(term27433, term27433.getClass(), "sourcePosition", 0);
        setField(term27433, term27433.getClass(), "jsType", null);
        setField(term27433, term27433.getClass(), "parent", null);
        setField(term27427, term27427.getClass(), "first", term27433);
        setIntField(term27434, term27434.getClass(), "type", 0);
        setField(term27434, term27434.getClass(), "next", null);
        setField(term27434, term27434.getClass(), "first", null);
        setField(term27434, term27434.getClass(), "last", null);
        setField(term27434, term27434.getClass(), "propListHead", null);
        setIntField(term27434, term27434.getClass(), "sourcePosition", 0);
        setField(term27434, term27434.getClass(), "jsType", null);
        setField(term27434, term27434.getClass(), "parent", null);
        setField(term27427, term27427.getClass(), "last", term27434);
        setField(term27435, term27435.getClass(), "next", null);
        setIntField(term27435, term27435.getClass(), "type", 0);
        setIntField(term27435, term27435.getClass(), "intValue", 0);
        setField(term27435, term27435.getClass(), "objectValue", null);
        setField(term27427, term27427.getClass(), "propListHead", term27435);
        setIntField(term27427, term27427.getClass(), "sourcePosition", -1298688401);
        setField(term27427, term27427.getClass(), "jsType", null);
        setField(term27427, term27427.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4437;
        Object retValue = callMethod(klass, "isToStringMethodCall", argTypes, null, args);
        assertTrue(recursiveEquals(term4437, term27427));
        assertTrue(recursiveEquals(retValue, false));
    }

};


