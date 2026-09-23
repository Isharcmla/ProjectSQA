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

public class PeepholeFoldConstants_tryFoldComparison_848443179255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50439;
     Object term50531;
     Object term50623;
     Object term50829;
     Object term50830;
     Object term50831;
     Object term50822;

    public PeepholeFoldConstants_tryFoldComparison_848443179255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50439 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term50531 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term50531, term50531.getClass(), "type", 0);
        term50623 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term50623, term50623.getClass(), "type", 0);
        term50829 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term50829, term50829.getClass(), "currentTraversal", null);
        term50830 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term50830, term50830.getClass(), "str", null);
        setIntField(term50830, term50830.getClass(), "type", 0);
        setField(term50830, term50830.getClass(), "next", null);
        setField(term50830, term50830.getClass(), "first", null);
        setField(term50830, term50830.getClass(), "last", null);
        setField(term50830, term50830.getClass(), "propListHead", null);
        setIntField(term50830, term50830.getClass(), "sourcePosition", 0);
        setField(term50830, term50830.getClass(), "jsType", null);
        setField(term50830, term50830.getClass(), "parent", null);
        term50831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term50831, term50831.getClass(), "str", null);
        setIntField(term50831, term50831.getClass(), "type", 0);
        setField(term50831, term50831.getClass(), "next", null);
        setField(term50831, term50831.getClass(), "first", null);
        setField(term50831, term50831.getClass(), "last", null);
        setField(term50831, term50831.getClass(), "propListHead", null);
        setIntField(term50831, term50831.getClass(), "sourcePosition", 0);
        setField(term50831, term50831.getClass(), "jsType", null);
        setField(term50831, term50831.getClass(), "parent", null);
        term50822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term50822, term50822.getClass(), "str", null);
        setIntField(term50822, term50822.getClass(), "type", 0);
        setField(term50822, term50822.getClass(), "next", null);
        setField(term50822, term50822.getClass(), "first", null);
        setField(term50822, term50822.getClass(), "last", null);
        setField(term50822, term50822.getClass(), "propListHead", null);
        setIntField(term50822, term50822.getClass(), "sourcePosition", 0);
        setField(term50822, term50822.getClass(), "jsType", null);
        setField(term50822, term50822.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term50531;
        args[1] = term50623;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term50439, args);
        assertTrue(recursiveEquals(term50439, term50829));
        assertTrue(recursiveEquals(term50531, term50830));
        assertTrue(recursiveEquals(term50623, term50831));
        assertTrue(recursiveEquals(retValue, term50822));
    }

};


