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

public class FoldConstants_tryFoldBlock_1167048042129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20437;
     Object term20507;
     Object term30517;
     Object term30518;

    public FoldConstants_tryFoldBlock_1167048042129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20437 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term20507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term20507, term20507.getClass(), "first", term20507);
        setField(term20507, term20507.getClass(), "next", null);
        setIntField(term20507, term20507.getClass(), "type", 0);
        setField(term20507, term20507.getClass(), "propListHead", null);
        term30517 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term30517, term30517.getClass(), "compiler", null);
        term30518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30518, term30518.getClass(), "type", 0);
        setField(term30518, term30518.getClass(), "next", null);
        setField(term30518, term30518.getClass(), "first", term30518);
        setField(term30518, term30518.getClass(), "last", null);
        setField(term30518, term30518.getClass(), "propListHead", null);
        setIntField(term30518, term30518.getClass(), "sourcePosition", 0);
        setField(term30518, term30518.getClass(), "jsType", null);
        setField(term30518, term30518.getClass(), "parent", null);
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
        args[1] = term20507;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term20437, args);
        assertTrue(recursiveEquals(term20437, term30517));
        assertTrue(recursiveEquals(term20507, null));
    }

};


