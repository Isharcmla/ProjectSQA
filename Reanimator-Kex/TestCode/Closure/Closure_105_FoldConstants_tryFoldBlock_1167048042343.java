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

public class FoldConstants_tryFoldBlock_1167048042343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95221;
     Object term95291;
     Object term95848;
     Object term95849;

    public FoldConstants_tryFoldBlock_1167048042343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95221 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term95291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95501, term95501.getClass(), "next", term95571);
        setIntField(term95501, term95501.getClass(), "type", 109);
        setField(term95431, term95431.getClass(), "next", term95501);
        setIntField(term95431, term95431.getClass(), "type", 67);
        setField(term95361, term95361.getClass(), "next", term95431);
        setIntField(term95361, term95361.getClass(), "type", 31);
        setField(term95291, term95291.getClass(), "first", term95361);
        term95848 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term95848, term95848.getClass(), "compiler", null);
        term95849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term95849, term95849.getClass(), "type", 0);
        setField(term95849, term95849.getClass(), "next", null);
        setIntField(term95850, term95850.getClass(), "type", 31);
        setIntField(term95851, term95851.getClass(), "type", 67);
        setIntField(term95852, term95852.getClass(), "type", 109);
        setIntField(term95853, term95853.getClass(), "type", 0);
        setField(term95853, term95853.getClass(), "next", null);
        setField(term95853, term95853.getClass(), "first", null);
        setField(term95853, term95853.getClass(), "last", null);
        setField(term95853, term95853.getClass(), "propListHead", null);
        setIntField(term95853, term95853.getClass(), "sourcePosition", 0);
        setField(term95853, term95853.getClass(), "jsType", null);
        setField(term95853, term95853.getClass(), "parent", null);
        setField(term95852, term95852.getClass(), "next", term95853);
        setField(term95852, term95852.getClass(), "first", null);
        setField(term95852, term95852.getClass(), "last", null);
        setField(term95852, term95852.getClass(), "propListHead", null);
        setIntField(term95852, term95852.getClass(), "sourcePosition", 0);
        setField(term95852, term95852.getClass(), "jsType", null);
        setField(term95852, term95852.getClass(), "parent", null);
        setField(term95851, term95851.getClass(), "next", term95852);
        setField(term95851, term95851.getClass(), "first", null);
        setField(term95851, term95851.getClass(), "last", null);
        setField(term95851, term95851.getClass(), "propListHead", null);
        setIntField(term95851, term95851.getClass(), "sourcePosition", 0);
        setField(term95851, term95851.getClass(), "jsType", null);
        setField(term95851, term95851.getClass(), "parent", null);
        setField(term95850, term95850.getClass(), "next", term95851);
        setField(term95850, term95850.getClass(), "first", null);
        setField(term95850, term95850.getClass(), "last", null);
        setField(term95850, term95850.getClass(), "propListHead", null);
        setIntField(term95850, term95850.getClass(), "sourcePosition", 0);
        setField(term95850, term95850.getClass(), "jsType", null);
        setField(term95850, term95850.getClass(), "parent", null);
        setField(term95849, term95849.getClass(), "first", term95850);
        setField(term95849, term95849.getClass(), "last", null);
        setField(term95849, term95849.getClass(), "propListHead", null);
        setIntField(term95849, term95849.getClass(), "sourcePosition", 0);
        setField(term95849, term95849.getClass(), "jsType", null);
        setField(term95849, term95849.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term95291;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term95221, args);
        assertTrue(recursiveEquals(term95221, term95848));
        assertTrue(recursiveEquals(term95291, null));
    }

};


