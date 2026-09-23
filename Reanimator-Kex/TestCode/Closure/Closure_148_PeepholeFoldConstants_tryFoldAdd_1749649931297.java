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

public class PeepholeFoldConstants_tryFoldAdd_1749649931297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57362;
     Object term57432;
     Object term57502;
     Object term57572;
     Object term58124;
     Object term58125;
     Object term58126;
     Object term58127;
     Object term58098;

    public PeepholeFoldConstants_tryFoldAdd_1749649931297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57362 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term57432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57432, term57432.getClass(), "type", 21);
        term57502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57502, term57502.getClass(), "type", 21);
        term57572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term58124 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term58124, term58124.getClass(), "currentTraversal", null);
        term58125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58125, term58125.getClass(), "type", 21);
        setField(term58125, term58125.getClass(), "next", null);
        setField(term58125, term58125.getClass(), "first", null);
        setField(term58125, term58125.getClass(), "last", null);
        setField(term58125, term58125.getClass(), "propListHead", null);
        setIntField(term58125, term58125.getClass(), "sourcePosition", 0);
        setField(term58125, term58125.getClass(), "jsType", null);
        setField(term58125, term58125.getClass(), "parent", null);
        term58126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58126, term58126.getClass(), "type", 21);
        setField(term58126, term58126.getClass(), "next", null);
        setField(term58126, term58126.getClass(), "first", null);
        setField(term58126, term58126.getClass(), "last", null);
        setField(term58126, term58126.getClass(), "propListHead", null);
        setIntField(term58126, term58126.getClass(), "sourcePosition", 0);
        setField(term58126, term58126.getClass(), "jsType", null);
        setField(term58126, term58126.getClass(), "parent", null);
        term58127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58127, term58127.getClass(), "type", 0);
        setField(term58127, term58127.getClass(), "next", null);
        setField(term58127, term58127.getClass(), "first", null);
        setField(term58127, term58127.getClass(), "last", null);
        setField(term58127, term58127.getClass(), "propListHead", null);
        setIntField(term58127, term58127.getClass(), "sourcePosition", 0);
        setField(term58127, term58127.getClass(), "jsType", null);
        setField(term58127, term58127.getClass(), "parent", null);
        term58098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58098, term58098.getClass(), "type", 21);
        setField(term58098, term58098.getClass(), "next", null);
        setField(term58098, term58098.getClass(), "first", null);
        setField(term58098, term58098.getClass(), "last", null);
        setField(term58098, term58098.getClass(), "propListHead", null);
        setIntField(term58098, term58098.getClass(), "sourcePosition", 0);
        setField(term58098, term58098.getClass(), "jsType", null);
        setField(term58098, term58098.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term57432;
        args[1] = term57502;
        args[2] = term57572;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term57362, args);
        assertTrue(recursiveEquals(term57362, term58124));
        assertTrue(recursiveEquals(term57432, term58125));
        assertTrue(recursiveEquals(term57502, term58126));
        assertTrue(recursiveEquals(term57572, term58127));
        assertTrue(recursiveEquals(retValue, term58098));
    }

};


