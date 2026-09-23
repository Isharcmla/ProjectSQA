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

public class FoldConstants_tryFoldBlock_1167048042128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20156;
     Object term20226;
     Object term30481;
     Object term30482;

    public FoldConstants_tryFoldBlock_1167048042128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20156 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term20226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20322 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term20226, term20226.getClass(), "first", term20226);
        setField(term20226, term20226.getClass(), "next", null);
        setIntField(term20226, term20226.getClass(), "type", 0);
        setIntField(term20322, term20322.getClass(), "type", -38);
        setField(term20322, term20322.getClass(), "next", null);
        setField(term20226, term20226.getClass(), "propListHead", term20322);
        term30481 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term30481, term30481.getClass(), "compiler", null);
        term30482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30483 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term30482, term30482.getClass(), "type", 0);
        setField(term30482, term30482.getClass(), "next", null);
        setField(term30482, term30482.getClass(), "first", term30482);
        setField(term30482, term30482.getClass(), "last", null);
        setField(term30483, term30483.getClass(), "next", null);
        setIntField(term30483, term30483.getClass(), "type", -38);
        setIntField(term30483, term30483.getClass(), "intValue", 0);
        setField(term30483, term30483.getClass(), "objectValue", null);
        setField(term30482, term30482.getClass(), "propListHead", term30483);
        setIntField(term30482, term30482.getClass(), "sourcePosition", 0);
        setField(term30482, term30482.getClass(), "jsType", null);
        setField(term30482, term30482.getClass(), "parent", null);
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
        args[1] = term20226;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term20156, args);
        assertTrue(recursiveEquals(term20156, term30481));
        assertTrue(recursiveEquals(term20226, null));
    }

};


