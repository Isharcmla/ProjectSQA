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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95908;
     Object term96000;
     Object term96190;
     Object term96191;
     Object term96162;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95908 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term96000 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term96070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96000, term96000.getClass(), "first", term96000);
        setField(term96000, term96000.getClass(), "next", term96070);
        setIntField(term96000, term96000.getClass(), "type", 52);
        term96190 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term96190, term96190.getClass(), "currentTraversal", null);
        term96191 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term96192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96191, term96191.getClass(), "str", null);
        setIntField(term96191, term96191.getClass(), "type", 52);
        setIntField(term96192, term96192.getClass(), "type", 0);
        setField(term96192, term96192.getClass(), "next", null);
        setField(term96192, term96192.getClass(), "first", null);
        setField(term96192, term96192.getClass(), "last", null);
        setField(term96192, term96192.getClass(), "propListHead", null);
        setIntField(term96192, term96192.getClass(), "sourcePosition", 0);
        setField(term96192, term96192.getClass(), "jsType", null);
        setField(term96192, term96192.getClass(), "parent", null);
        setField(term96191, term96191.getClass(), "next", term96192);
        setField(term96191, term96191.getClass(), "first", term96191);
        setField(term96191, term96191.getClass(), "last", null);
        setField(term96191, term96191.getClass(), "propListHead", null);
        setIntField(term96191, term96191.getClass(), "sourcePosition", 0);
        setField(term96191, term96191.getClass(), "jsType", null);
        setField(term96191, term96191.getClass(), "parent", null);
        term96162 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term96164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96162, term96162.getClass(), "str", null);
        setIntField(term96162, term96162.getClass(), "type", 52);
        setIntField(term96164, term96164.getClass(), "type", 0);
        setField(term96164, term96164.getClass(), "next", null);
        setField(term96164, term96164.getClass(), "first", null);
        setField(term96164, term96164.getClass(), "last", null);
        setField(term96164, term96164.getClass(), "propListHead", null);
        setIntField(term96164, term96164.getClass(), "sourcePosition", 0);
        setField(term96164, term96164.getClass(), "jsType", null);
        setField(term96164, term96164.getClass(), "parent", null);
        setField(term96162, term96162.getClass(), "next", term96164);
        setField(term96162, term96162.getClass(), "first", term96162);
        setField(term96162, term96162.getClass(), "last", null);
        setField(term96162, term96162.getClass(), "propListHead", null);
        setIntField(term96162, term96162.getClass(), "sourcePosition", 0);
        setField(term96162, term96162.getClass(), "jsType", null);
        setField(term96162, term96162.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term96000;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term95908, args);
        assertTrue(recursiveEquals(term95908, term96190));
        assertTrue(recursiveEquals(term96000, term96191));
        assertTrue(recursiveEquals(retValue, term96162));
    }

};


