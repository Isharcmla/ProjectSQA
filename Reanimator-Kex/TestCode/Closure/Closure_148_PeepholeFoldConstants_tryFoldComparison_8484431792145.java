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

public class PeepholeFoldConstants_tryFoldComparison_8484431792145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584025;
     Object term584117;
     Object term584209;
     Object term584301;
     Object term584806;
     Object term584807;
     Object term584808;
     Object term584809;
     Object term584781;

    public PeepholeFoldConstants_tryFoldComparison_8484431792145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term584117 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term584117, term584117.getClass(), "type", 16);
        term584209 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term584209, term584209.getClass(), "type", 42);
        term584301 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term584301, term584301.getClass(), "type", 16);
        term584806 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term584806, term584806.getClass(), "currentTraversal", null);
        term584807 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term584807, term584807.getClass(), "number", 0.0);
        setIntField(term584807, term584807.getClass(), "type", 42);
        setField(term584807, term584807.getClass(), "next", null);
        setField(term584807, term584807.getClass(), "first", null);
        setField(term584807, term584807.getClass(), "last", null);
        setField(term584807, term584807.getClass(), "propListHead", null);
        setIntField(term584807, term584807.getClass(), "sourcePosition", 0);
        setField(term584807, term584807.getClass(), "jsType", null);
        setField(term584807, term584807.getClass(), "parent", null);
        term584808 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term584808, term584808.getClass(), "number", 0.0);
        setIntField(term584808, term584808.getClass(), "type", 16);
        setField(term584808, term584808.getClass(), "next", null);
        setField(term584808, term584808.getClass(), "first", null);
        setField(term584808, term584808.getClass(), "last", null);
        setField(term584808, term584808.getClass(), "propListHead", null);
        setIntField(term584808, term584808.getClass(), "sourcePosition", 0);
        setField(term584808, term584808.getClass(), "jsType", null);
        setField(term584808, term584808.getClass(), "parent", null);
        term584809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term584809, term584809.getClass(), "number", 0.0);
        setIntField(term584809, term584809.getClass(), "type", 16);
        setField(term584809, term584809.getClass(), "next", null);
        setField(term584809, term584809.getClass(), "first", null);
        setField(term584809, term584809.getClass(), "last", null);
        setField(term584809, term584809.getClass(), "propListHead", null);
        setIntField(term584809, term584809.getClass(), "sourcePosition", 0);
        setField(term584809, term584809.getClass(), "jsType", null);
        setField(term584809, term584809.getClass(), "parent", null);
        term584781 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term584781, term584781.getClass(), "number", 0.0);
        setIntField(term584781, term584781.getClass(), "type", 16);
        setField(term584781, term584781.getClass(), "next", null);
        setField(term584781, term584781.getClass(), "first", null);
        setField(term584781, term584781.getClass(), "last", null);
        setField(term584781, term584781.getClass(), "propListHead", null);
        setIntField(term584781, term584781.getClass(), "sourcePosition", 0);
        setField(term584781, term584781.getClass(), "jsType", null);
        setField(term584781, term584781.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term584117;
        args[1] = term584209;
        args[2] = term584301;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term584025, args);
        assertTrue(recursiveEquals(term584025, term584806));
        assertTrue(recursiveEquals(term584117, term584807));
        assertTrue(recursiveEquals(term584209, term584808));
        assertTrue(recursiveEquals(term584301, term584809));
        assertTrue(recursiveEquals(retValue, term584781));
    }

};


