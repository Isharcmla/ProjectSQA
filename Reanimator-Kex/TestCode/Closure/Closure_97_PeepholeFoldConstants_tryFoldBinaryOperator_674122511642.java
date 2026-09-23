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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167199;
     Object term167291;
     Object term167743;
     Object term167744;
     Object term167716;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167199 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term167291 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term167291, term167291.getClass(), "first", term167291);
        setField(term167291, term167291.getClass(), "next", term167361);
        setIntField(term167291, term167291.getClass(), "type", 35);
        term167743 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term167743, term167743.getClass(), "currentTraversal", null);
        term167744 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term167744, term167744.getClass(), "number", 0.0);
        setIntField(term167744, term167744.getClass(), "type", 35);
        setIntField(term167745, term167745.getClass(), "type", 0);
        setField(term167745, term167745.getClass(), "next", null);
        setField(term167745, term167745.getClass(), "first", null);
        setField(term167745, term167745.getClass(), "last", null);
        setField(term167745, term167745.getClass(), "propListHead", null);
        setIntField(term167745, term167745.getClass(), "sourcePosition", 0);
        setField(term167745, term167745.getClass(), "jsType", null);
        setField(term167745, term167745.getClass(), "parent", null);
        setField(term167744, term167744.getClass(), "next", term167745);
        setField(term167744, term167744.getClass(), "first", term167744);
        setField(term167744, term167744.getClass(), "last", null);
        setField(term167744, term167744.getClass(), "propListHead", null);
        setIntField(term167744, term167744.getClass(), "sourcePosition", 0);
        setField(term167744, term167744.getClass(), "jsType", null);
        setField(term167744, term167744.getClass(), "parent", null);
        term167716 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term167716, term167716.getClass(), "number", 0.0);
        setIntField(term167716, term167716.getClass(), "type", 35);
        setIntField(term167719, term167719.getClass(), "type", 0);
        setField(term167719, term167719.getClass(), "next", null);
        setField(term167719, term167719.getClass(), "first", null);
        setField(term167719, term167719.getClass(), "last", null);
        setField(term167719, term167719.getClass(), "propListHead", null);
        setIntField(term167719, term167719.getClass(), "sourcePosition", 0);
        setField(term167719, term167719.getClass(), "jsType", null);
        setField(term167719, term167719.getClass(), "parent", null);
        setField(term167716, term167716.getClass(), "next", term167719);
        setField(term167716, term167716.getClass(), "first", term167716);
        setField(term167716, term167716.getClass(), "last", null);
        setField(term167716, term167716.getClass(), "propListHead", null);
        setIntField(term167716, term167716.getClass(), "sourcePosition", 0);
        setField(term167716, term167716.getClass(), "jsType", null);
        setField(term167716, term167716.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term167291;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term167199, args);
        assertTrue(recursiveEquals(term167199, term167743));
        assertTrue(recursiveEquals(term167291, term167744));
        assertTrue(recursiveEquals(retValue, term167716));
    }

};


