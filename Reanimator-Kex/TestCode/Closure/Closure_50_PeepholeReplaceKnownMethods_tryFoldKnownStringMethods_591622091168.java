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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45353;
     Object term45445;
     Object term45829;
     Object term45830;
     Object term45806;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45353 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term45445 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45537 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term45445, term45445.getClass(), "type", 37);
        setField(term45445, term45445.getClass(), "first", term45537);
        term45829 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term45829, term45829.getClass(), "currentTraversal", null);
        term45830 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term45830, term45830.getClass(), "str", null);
        setIntField(term45830, term45830.getClass(), "type", 37);
        setField(term45830, term45830.getClass(), "next", null);
        setField(term45831, term45831.getClass(), "str", null);
        setIntField(term45831, term45831.getClass(), "type", 0);
        setField(term45831, term45831.getClass(), "next", null);
        setField(term45831, term45831.getClass(), "first", null);
        setField(term45831, term45831.getClass(), "last", null);
        setField(term45831, term45831.getClass(), "propListHead", null);
        setIntField(term45831, term45831.getClass(), "sourcePosition", 0);
        setField(term45831, term45831.getClass(), "jsType", null);
        setField(term45831, term45831.getClass(), "parent", null);
        setField(term45830, term45830.getClass(), "first", term45831);
        setField(term45830, term45830.getClass(), "last", null);
        setField(term45830, term45830.getClass(), "propListHead", null);
        setIntField(term45830, term45830.getClass(), "sourcePosition", 0);
        setField(term45830, term45830.getClass(), "jsType", null);
        setField(term45830, term45830.getClass(), "parent", null);
        term45806 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term45808 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term45806, term45806.getClass(), "str", null);
        setIntField(term45806, term45806.getClass(), "type", 37);
        setField(term45806, term45806.getClass(), "next", null);
        setField(term45808, term45808.getClass(), "str", null);
        setIntField(term45808, term45808.getClass(), "type", 0);
        setField(term45808, term45808.getClass(), "next", null);
        setField(term45808, term45808.getClass(), "first", null);
        setField(term45808, term45808.getClass(), "last", null);
        setField(term45808, term45808.getClass(), "propListHead", null);
        setIntField(term45808, term45808.getClass(), "sourcePosition", 0);
        setField(term45808, term45808.getClass(), "jsType", null);
        setField(term45808, term45808.getClass(), "parent", null);
        setField(term45806, term45806.getClass(), "first", term45808);
        setField(term45806, term45806.getClass(), "last", null);
        setField(term45806, term45806.getClass(), "propListHead", null);
        setIntField(term45806, term45806.getClass(), "sourcePosition", 0);
        setField(term45806, term45806.getClass(), "jsType", null);
        setField(term45806, term45806.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45445;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term45353, args);
        assertTrue(recursiveEquals(term45353, term45829));
        assertTrue(recursiveEquals(term45445, term45830));
        assertTrue(recursiveEquals(retValue, term45806));
    }

};


