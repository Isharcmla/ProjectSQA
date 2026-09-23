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

public class PeepholeFoldConstants_tryFoldAdd_1749649931954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222723;
     Object term222815;
     Object term222907;
     Object term222999;
     Object term223108;
     Object term223109;
     Object term223110;
     Object term223111;
     Object term223078;

    public PeepholeFoldConstants_tryFoldAdd_1749649931954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222723 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term222815 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term222815, term222815.getClass(), "type", 21);
        term222907 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term222907, term222907.getClass(), "type", 21);
        term222999 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term223108 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term223108, term223108.getClass(), "currentTraversal", null);
        term223109 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term223109, term223109.getClass(), "number", 0.0);
        setIntField(term223109, term223109.getClass(), "type", 21);
        setField(term223109, term223109.getClass(), "next", null);
        setField(term223109, term223109.getClass(), "first", null);
        setField(term223109, term223109.getClass(), "last", null);
        setField(term223109, term223109.getClass(), "propListHead", null);
        setIntField(term223109, term223109.getClass(), "sourcePosition", 0);
        setField(term223109, term223109.getClass(), "jsType", null);
        setField(term223109, term223109.getClass(), "parent", null);
        term223110 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term223110, term223110.getClass(), "number", 0.0);
        setIntField(term223110, term223110.getClass(), "type", 21);
        setField(term223110, term223110.getClass(), "next", null);
        setField(term223110, term223110.getClass(), "first", null);
        setField(term223110, term223110.getClass(), "last", null);
        setField(term223110, term223110.getClass(), "propListHead", null);
        setIntField(term223110, term223110.getClass(), "sourcePosition", 0);
        setField(term223110, term223110.getClass(), "jsType", null);
        setField(term223110, term223110.getClass(), "parent", null);
        term223111 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term223111, term223111.getClass(), "number", 0.0);
        setIntField(term223111, term223111.getClass(), "type", 0);
        setField(term223111, term223111.getClass(), "next", null);
        setField(term223111, term223111.getClass(), "first", null);
        setField(term223111, term223111.getClass(), "last", null);
        setField(term223111, term223111.getClass(), "propListHead", null);
        setIntField(term223111, term223111.getClass(), "sourcePosition", 0);
        setField(term223111, term223111.getClass(), "jsType", null);
        setField(term223111, term223111.getClass(), "parent", null);
        term223078 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term223078, term223078.getClass(), "number", 0.0);
        setIntField(term223078, term223078.getClass(), "type", 21);
        setField(term223078, term223078.getClass(), "next", null);
        setField(term223078, term223078.getClass(), "first", null);
        setField(term223078, term223078.getClass(), "last", null);
        setField(term223078, term223078.getClass(), "propListHead", null);
        setIntField(term223078, term223078.getClass(), "sourcePosition", 0);
        setField(term223078, term223078.getClass(), "jsType", null);
        setField(term223078, term223078.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term222815;
        args[1] = term222907;
        args[2] = term222999;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term222723, args);
        assertTrue(recursiveEquals(term222723, term223108));
        assertTrue(recursiveEquals(term222815, term223109));
        assertTrue(recursiveEquals(term222907, term223110));
        assertTrue(recursiveEquals(term222999, term223111));
        assertTrue(recursiveEquals(retValue, term223078));
    }

};


