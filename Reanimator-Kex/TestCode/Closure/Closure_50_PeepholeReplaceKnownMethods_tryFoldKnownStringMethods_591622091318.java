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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2622273;
     Object term2622365;
     Object term2623712;
     Object term2623713;
     Object term2623647;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2622273 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2622365 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2622457 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2622549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2622619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2622365, term2622365.getClass(), "type", 37);
        setIntField(term2622457, term2622457.getClass(), "type", 35);
        setField(term2622549, term2622549.getClass(), "next", term2622619);
        setIntField(term2622549, term2622549.getClass(), "type", 40);
        setField(term2622457, term2622457.getClass(), "first", term2622549);
        setField(term2622365, term2622365.getClass(), "first", term2622457);
        term2623712 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2623712, term2623712.getClass(), "currentTraversal", null);
        term2623713 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2623714 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2623715 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2623716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term2623713, term2623713.getClass(), "number", 0.0);
        setIntField(term2623713, term2623713.getClass(), "type", 37);
        setField(term2623713, term2623713.getClass(), "next", null);
        setDoubleField(term2623714, term2623714.getClass(), "number", 0.0);
        setIntField(term2623714, term2623714.getClass(), "type", 35);
        setField(term2623714, term2623714.getClass(), "next", null);
        setDoubleField(term2623715, term2623715.getClass(), "number", 0.0);
        setIntField(term2623715, term2623715.getClass(), "type", 40);
        setIntField(term2623716, term2623716.getClass(), "type", 0);
        setField(term2623716, term2623716.getClass(), "next", null);
        setField(term2623716, term2623716.getClass(), "first", null);
        setField(term2623716, term2623716.getClass(), "last", null);
        setField(term2623716, term2623716.getClass(), "propListHead", null);
        setIntField(term2623716, term2623716.getClass(), "sourcePosition", 0);
        setField(term2623716, term2623716.getClass(), "jsType", null);
        setField(term2623716, term2623716.getClass(), "parent", null);
        setField(term2623715, term2623715.getClass(), "next", term2623716);
        setField(term2623715, term2623715.getClass(), "first", null);
        setField(term2623715, term2623715.getClass(), "last", null);
        setField(term2623715, term2623715.getClass(), "propListHead", null);
        setIntField(term2623715, term2623715.getClass(), "sourcePosition", 0);
        setField(term2623715, term2623715.getClass(), "jsType", null);
        setField(term2623715, term2623715.getClass(), "parent", null);
        setField(term2623714, term2623714.getClass(), "first", term2623715);
        setField(term2623714, term2623714.getClass(), "last", null);
        setField(term2623714, term2623714.getClass(), "propListHead", null);
        setIntField(term2623714, term2623714.getClass(), "sourcePosition", 0);
        setField(term2623714, term2623714.getClass(), "jsType", null);
        setField(term2623714, term2623714.getClass(), "parent", null);
        setField(term2623713, term2623713.getClass(), "first", term2623714);
        setField(term2623713, term2623713.getClass(), "last", null);
        setField(term2623713, term2623713.getClass(), "propListHead", null);
        setIntField(term2623713, term2623713.getClass(), "sourcePosition", 0);
        setField(term2623713, term2623713.getClass(), "jsType", null);
        setField(term2623713, term2623713.getClass(), "parent", null);
        term2623647 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2623650 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2623653 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2623656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term2623647, term2623647.getClass(), "number", 0.0);
        setIntField(term2623647, term2623647.getClass(), "type", 37);
        setField(term2623647, term2623647.getClass(), "next", null);
        setDoubleField(term2623650, term2623650.getClass(), "number", 0.0);
        setIntField(term2623650, term2623650.getClass(), "type", 35);
        setField(term2623650, term2623650.getClass(), "next", null);
        setDoubleField(term2623653, term2623653.getClass(), "number", 0.0);
        setIntField(term2623653, term2623653.getClass(), "type", 40);
        setIntField(term2623656, term2623656.getClass(), "type", 0);
        setField(term2623656, term2623656.getClass(), "next", null);
        setField(term2623656, term2623656.getClass(), "first", null);
        setField(term2623656, term2623656.getClass(), "last", null);
        setField(term2623656, term2623656.getClass(), "propListHead", null);
        setIntField(term2623656, term2623656.getClass(), "sourcePosition", 0);
        setField(term2623656, term2623656.getClass(), "jsType", null);
        setField(term2623656, term2623656.getClass(), "parent", null);
        setField(term2623653, term2623653.getClass(), "next", term2623656);
        setField(term2623653, term2623653.getClass(), "first", null);
        setField(term2623653, term2623653.getClass(), "last", null);
        setField(term2623653, term2623653.getClass(), "propListHead", null);
        setIntField(term2623653, term2623653.getClass(), "sourcePosition", 0);
        setField(term2623653, term2623653.getClass(), "jsType", null);
        setField(term2623653, term2623653.getClass(), "parent", null);
        setField(term2623650, term2623650.getClass(), "first", term2623653);
        setField(term2623650, term2623650.getClass(), "last", null);
        setField(term2623650, term2623650.getClass(), "propListHead", null);
        setIntField(term2623650, term2623650.getClass(), "sourcePosition", 0);
        setField(term2623650, term2623650.getClass(), "jsType", null);
        setField(term2623650, term2623650.getClass(), "parent", null);
        setField(term2623647, term2623647.getClass(), "first", term2623650);
        setField(term2623647, term2623647.getClass(), "last", null);
        setField(term2623647, term2623647.getClass(), "propListHead", null);
        setIntField(term2623647, term2623647.getClass(), "sourcePosition", 0);
        setField(term2623647, term2623647.getClass(), "jsType", null);
        setField(term2623647, term2623647.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2622365;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2622273, args);
        assertTrue(recursiveEquals(term2622273, term2623712));
        assertTrue(recursiveEquals(term2622365, term2623713));
        assertTrue(recursiveEquals(retValue, term2623647));
    }

};


