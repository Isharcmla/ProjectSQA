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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.lang.Object;

public class CoalesceVariableNames_checkRanges_118307546514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454;
     Object term460;
     Object term464;

    public CoalesceVariableNames_checkRanges_118307546514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term455 = new ArrayDeque();
        term454 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term454, term454.getClass(), "compiler", null);
        setField(term454, term454.getClass(), "colorings", term455);
        setBooleanField(term454, term454.getClass(), "usePseudoNames", true);
        term460 = new ArrayList();
        term464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term477 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term487 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term464, term464.getClass(), "type", -1845499264);
        setIntField(term466, term466.getClass(), "type", 444029505);
        setIntField(term468, term468.getClass(), "type", 0);
        setField(term468, term468.getClass(), "next", null);
        setField(term468, term468.getClass(), "first", null);
        setField(term468, term468.getClass(), "last", null);
        setField(term468, term468.getClass(), "propListHead", null);
        setIntField(term468, term468.getClass(), "sourcePosition", 0);
        setField(term468, term468.getClass(), "jsType", null);
        setField(term468, term468.getClass(), "parent", null);
        setField(term466, term466.getClass(), "next", term468);
        setIntField(term471, term471.getClass(), "type", 0);
        setField(term471, term471.getClass(), "next", null);
        setField(term471, term471.getClass(), "first", null);
        setField(term471, term471.getClass(), "last", null);
        setField(term471, term471.getClass(), "propListHead", null);
        setIntField(term471, term471.getClass(), "sourcePosition", 0);
        setField(term471, term471.getClass(), "jsType", null);
        setField(term471, term471.getClass(), "parent", null);
        setField(term466, term466.getClass(), "first", term471);
        setIntField(term474, term474.getClass(), "type", 0);
        setField(term474, term474.getClass(), "next", null);
        setField(term474, term474.getClass(), "first", null);
        setField(term474, term474.getClass(), "last", null);
        setField(term474, term474.getClass(), "propListHead", null);
        setIntField(term474, term474.getClass(), "sourcePosition", 0);
        setField(term474, term474.getClass(), "jsType", null);
        setField(term474, term474.getClass(), "parent", null);
        setField(term466, term466.getClass(), "last", term474);
        setField(term477, term477.getClass(), "next", null);
        setIntField(term477, term477.getClass(), "type", 0);
        setIntField(term477, term477.getClass(), "intValue", 0);
        setField(term477, term477.getClass(), "objectValue", null);
        setField(term466, term466.getClass(), "propListHead", term477);
        setIntField(term466, term466.getClass(), "sourcePosition", -894662986);
        setField(term466, term466.getClass(), "jsType", null);
        setField(term466, term466.getClass(), "parent", null);
        setField(term464, term464.getClass(), "next", term466);
        setIntField(term481, term481.getClass(), "type", 0);
        setField(term481, term481.getClass(), "next", null);
        setField(term481, term481.getClass(), "first", null);
        setField(term481, term481.getClass(), "last", null);
        setField(term481, term481.getClass(), "propListHead", null);
        setIntField(term481, term481.getClass(), "sourcePosition", 0);
        setField(term481, term481.getClass(), "jsType", null);
        setField(term481, term481.getClass(), "parent", null);
        setField(term464, term464.getClass(), "first", term481);
        setIntField(term484, term484.getClass(), "type", 0);
        setField(term484, term484.getClass(), "next", null);
        setField(term484, term484.getClass(), "first", null);
        setField(term484, term484.getClass(), "last", null);
        setField(term484, term484.getClass(), "propListHead", null);
        setIntField(term484, term484.getClass(), "sourcePosition", 0);
        setField(term484, term484.getClass(), "jsType", null);
        setField(term484, term484.getClass(), "parent", null);
        setField(term464, term464.getClass(), "last", term484);
        setField(term487, term487.getClass(), "next", null);
        setIntField(term487, term487.getClass(), "type", 0);
        setIntField(term487, term487.getClass(), "intValue", 0);
        setField(term487, term487.getClass(), "objectValue", null);
        setField(term464, term464.getClass(), "propListHead", term487);
        setIntField(term464, term464.getClass(), "sourcePosition", 304775596);
        setField(term464, term464.getClass(), "jsType", null);
        setField(term464, term464.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term460;
        args[1] = term464;
        try {
            callMethod(klass, "checkRanges", argTypes, term454, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


