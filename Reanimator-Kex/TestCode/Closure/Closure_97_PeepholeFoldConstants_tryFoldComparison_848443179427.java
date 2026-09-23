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

public class PeepholeFoldConstants_tryFoldComparison_848443179427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98638;
     Object term98730;
     Object term98822;
     Object term98914;
     Object term99397;
     Object term99398;
     Object term99399;
     Object term99400;
     Object term99370;

    public PeepholeFoldConstants_tryFoldComparison_848443179427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98638 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term98730 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term98730, term98730.getClass(), "type", 14);
        term98822 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term98822, term98822.getClass(), "type", 42);
        term98914 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term98914, term98914.getClass(), "type", 14);
        term99397 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term99397, term99397.getClass(), "currentTraversal", null);
        term99398 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term99398, term99398.getClass(), "number", 0.0);
        setIntField(term99398, term99398.getClass(), "type", 42);
        setField(term99398, term99398.getClass(), "next", null);
        setField(term99398, term99398.getClass(), "first", null);
        setField(term99398, term99398.getClass(), "last", null);
        setField(term99398, term99398.getClass(), "propListHead", null);
        setIntField(term99398, term99398.getClass(), "sourcePosition", 0);
        setField(term99398, term99398.getClass(), "jsType", null);
        setField(term99398, term99398.getClass(), "parent", null);
        term99399 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term99399, term99399.getClass(), "number", 0.0);
        setIntField(term99399, term99399.getClass(), "type", 14);
        setField(term99399, term99399.getClass(), "next", null);
        setField(term99399, term99399.getClass(), "first", null);
        setField(term99399, term99399.getClass(), "last", null);
        setField(term99399, term99399.getClass(), "propListHead", null);
        setIntField(term99399, term99399.getClass(), "sourcePosition", 0);
        setField(term99399, term99399.getClass(), "jsType", null);
        setField(term99399, term99399.getClass(), "parent", null);
        term99400 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term99400, term99400.getClass(), "number", 0.0);
        setIntField(term99400, term99400.getClass(), "type", 14);
        setField(term99400, term99400.getClass(), "next", null);
        setField(term99400, term99400.getClass(), "first", null);
        setField(term99400, term99400.getClass(), "last", null);
        setField(term99400, term99400.getClass(), "propListHead", null);
        setIntField(term99400, term99400.getClass(), "sourcePosition", 0);
        setField(term99400, term99400.getClass(), "jsType", null);
        setField(term99400, term99400.getClass(), "parent", null);
        term99370 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term99370, term99370.getClass(), "number", 0.0);
        setIntField(term99370, term99370.getClass(), "type", 14);
        setField(term99370, term99370.getClass(), "next", null);
        setField(term99370, term99370.getClass(), "first", null);
        setField(term99370, term99370.getClass(), "last", null);
        setField(term99370, term99370.getClass(), "propListHead", null);
        setIntField(term99370, term99370.getClass(), "sourcePosition", 0);
        setField(term99370, term99370.getClass(), "jsType", null);
        setField(term99370, term99370.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term98730;
        args[1] = term98822;
        args[2] = term98914;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term98638, args);
        assertTrue(recursiveEquals(term98638, term99397));
        assertTrue(recursiveEquals(term98730, term99398));
        assertTrue(recursiveEquals(term98822, term99399));
        assertTrue(recursiveEquals(term98914, term99400));
        assertTrue(recursiveEquals(retValue, term99370));
    }

};


