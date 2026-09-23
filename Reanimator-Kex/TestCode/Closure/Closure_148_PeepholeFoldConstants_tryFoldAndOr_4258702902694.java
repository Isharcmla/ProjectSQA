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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term771994;
     Object term772086;
     Object term772248;
     Object term772340;
     Object term772392;
     Object term772393;
     Object term772395;
     Object term772396;
     Object term772344;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term771994 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term772086 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term772156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term772156, term772156.getClass(), "type", 98);
        setField(term772086, term772086.getClass(), "parent", term772156);
        setIntField(term772086, term772086.getClass(), "type", 0);
        term772248 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term772248, term772248.getClass(), "type", 0);
        term772340 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term772340, term772340.getClass(), "type", 47);
        term772392 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term772392, term772392.getClass(), "currentTraversal", null);
        term772393 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term772394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term772393, term772393.getClass(), "str", null);
        setIntField(term772393, term772393.getClass(), "type", 0);
        setField(term772393, term772393.getClass(), "next", null);
        setField(term772393, term772393.getClass(), "first", null);
        setField(term772393, term772393.getClass(), "last", null);
        setField(term772393, term772393.getClass(), "propListHead", null);
        setIntField(term772393, term772393.getClass(), "sourcePosition", 0);
        setField(term772393, term772393.getClass(), "jsType", null);
        setIntField(term772394, term772394.getClass(), "type", 98);
        setField(term772394, term772394.getClass(), "next", null);
        setField(term772394, term772394.getClass(), "first", null);
        setField(term772394, term772394.getClass(), "last", null);
        setField(term772394, term772394.getClass(), "propListHead", null);
        setIntField(term772394, term772394.getClass(), "sourcePosition", 0);
        setField(term772394, term772394.getClass(), "jsType", null);
        setField(term772394, term772394.getClass(), "parent", null);
        setField(term772393, term772393.getClass(), "parent", term772394);
        term772395 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term772395, term772395.getClass(), "str", null);
        setIntField(term772395, term772395.getClass(), "type", 0);
        setField(term772395, term772395.getClass(), "next", null);
        setField(term772395, term772395.getClass(), "first", null);
        setField(term772395, term772395.getClass(), "last", null);
        setField(term772395, term772395.getClass(), "propListHead", null);
        setIntField(term772395, term772395.getClass(), "sourcePosition", 0);
        setField(term772395, term772395.getClass(), "jsType", null);
        setField(term772395, term772395.getClass(), "parent", null);
        term772396 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term772396, term772396.getClass(), "str", null);
        setIntField(term772396, term772396.getClass(), "type", 47);
        setField(term772396, term772396.getClass(), "next", null);
        setField(term772396, term772396.getClass(), "first", null);
        setField(term772396, term772396.getClass(), "last", null);
        setField(term772396, term772396.getClass(), "propListHead", null);
        setIntField(term772396, term772396.getClass(), "sourcePosition", 0);
        setField(term772396, term772396.getClass(), "jsType", null);
        setField(term772396, term772396.getClass(), "parent", null);
        term772344 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term772347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term772344, term772344.getClass(), "str", null);
        setIntField(term772344, term772344.getClass(), "type", 0);
        setField(term772344, term772344.getClass(), "next", null);
        setField(term772344, term772344.getClass(), "first", null);
        setField(term772344, term772344.getClass(), "last", null);
        setField(term772344, term772344.getClass(), "propListHead", null);
        setIntField(term772344, term772344.getClass(), "sourcePosition", 0);
        setField(term772344, term772344.getClass(), "jsType", null);
        setIntField(term772347, term772347.getClass(), "type", 98);
        setField(term772347, term772347.getClass(), "next", null);
        setField(term772347, term772347.getClass(), "first", null);
        setField(term772347, term772347.getClass(), "last", null);
        setField(term772347, term772347.getClass(), "propListHead", null);
        setIntField(term772347, term772347.getClass(), "sourcePosition", 0);
        setField(term772347, term772347.getClass(), "jsType", null);
        setField(term772347, term772347.getClass(), "parent", null);
        setField(term772344, term772344.getClass(), "parent", term772347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term772086;
        args[1] = term772248;
        args[2] = term772340;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term771994, args);
        assertTrue(recursiveEquals(term771994, term772392));
        assertTrue(recursiveEquals(term772086, term772393));
        assertTrue(recursiveEquals(term772248, term772395));
        assertTrue(recursiveEquals(term772340, term772396));
        assertTrue(recursiveEquals(retValue, term772344));
    }

};


