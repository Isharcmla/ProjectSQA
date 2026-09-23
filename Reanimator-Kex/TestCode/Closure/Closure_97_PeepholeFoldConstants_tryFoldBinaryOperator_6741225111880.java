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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term721196;
     Object term721266;
     Object term721446;
     Object term721447;
     Object term721413;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term721196 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term721266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term721336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term721406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term721336, term721336.getClass(), "next", term721406);
        setIntField(term721336, term721336.getClass(), "type", 63);
        setField(term721266, term721266.getClass(), "first", term721336);
        setIntField(term721266, term721266.getClass(), "type", 35);
        term721446 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term721446, term721446.getClass(), "currentTraversal", null);
        term721447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term721448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term721449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term721447, term721447.getClass(), "type", 35);
        setField(term721447, term721447.getClass(), "next", null);
        setIntField(term721448, term721448.getClass(), "type", 63);
        setIntField(term721449, term721449.getClass(), "type", 0);
        setField(term721449, term721449.getClass(), "next", null);
        setField(term721449, term721449.getClass(), "first", null);
        setField(term721449, term721449.getClass(), "last", null);
        setField(term721449, term721449.getClass(), "propListHead", null);
        setIntField(term721449, term721449.getClass(), "sourcePosition", 0);
        setField(term721449, term721449.getClass(), "jsType", null);
        setField(term721449, term721449.getClass(), "parent", null);
        setField(term721448, term721448.getClass(), "next", term721449);
        setField(term721448, term721448.getClass(), "first", null);
        setField(term721448, term721448.getClass(), "last", null);
        setField(term721448, term721448.getClass(), "propListHead", null);
        setIntField(term721448, term721448.getClass(), "sourcePosition", 0);
        setField(term721448, term721448.getClass(), "jsType", null);
        setField(term721448, term721448.getClass(), "parent", null);
        setField(term721447, term721447.getClass(), "first", term721448);
        setField(term721447, term721447.getClass(), "last", null);
        setField(term721447, term721447.getClass(), "propListHead", null);
        setIntField(term721447, term721447.getClass(), "sourcePosition", 0);
        setField(term721447, term721447.getClass(), "jsType", null);
        setField(term721447, term721447.getClass(), "parent", null);
        term721413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term721415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term721417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term721413, term721413.getClass(), "type", 35);
        setField(term721413, term721413.getClass(), "next", null);
        setIntField(term721415, term721415.getClass(), "type", 63);
        setIntField(term721417, term721417.getClass(), "type", 0);
        setField(term721417, term721417.getClass(), "next", null);
        setField(term721417, term721417.getClass(), "first", null);
        setField(term721417, term721417.getClass(), "last", null);
        setField(term721417, term721417.getClass(), "propListHead", null);
        setIntField(term721417, term721417.getClass(), "sourcePosition", 0);
        setField(term721417, term721417.getClass(), "jsType", null);
        setField(term721417, term721417.getClass(), "parent", null);
        setField(term721415, term721415.getClass(), "next", term721417);
        setField(term721415, term721415.getClass(), "first", null);
        setField(term721415, term721415.getClass(), "last", null);
        setField(term721415, term721415.getClass(), "propListHead", null);
        setIntField(term721415, term721415.getClass(), "sourcePosition", 0);
        setField(term721415, term721415.getClass(), "jsType", null);
        setField(term721415, term721415.getClass(), "parent", null);
        setField(term721413, term721413.getClass(), "first", term721415);
        setField(term721413, term721413.getClass(), "last", null);
        setField(term721413, term721413.getClass(), "propListHead", null);
        setIntField(term721413, term721413.getClass(), "sourcePosition", 0);
        setField(term721413, term721413.getClass(), "jsType", null);
        setField(term721413, term721413.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term721266;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term721196, args);
        assertTrue(recursiveEquals(term721196, term721446));
        assertTrue(recursiveEquals(term721266, term721447));
        assertTrue(recursiveEquals(retValue, term721413));
    }

};


