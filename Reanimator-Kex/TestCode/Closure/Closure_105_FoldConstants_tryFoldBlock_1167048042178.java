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

public class FoldConstants_tryFoldBlock_1167048042178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36623;
     Object term36693;
     Object term47079;
     Object term47080;

    public FoldConstants_tryFoldBlock_1167048042178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36623 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term36693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36763, term36763.getClass(), "next", term36693);
        setIntField(term36763, term36763.getClass(), "type", 75);
        setField(term36693, term36693.getClass(), "first", term36763);
        setField(term36693, term36693.getClass(), "next", term36833);
        setIntField(term36693, term36693.getClass(), "type", 87);
        term47079 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term47079, term47079.getClass(), "compiler", null);
        term47080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47080, term47080.getClass(), "type", 87);
        setIntField(term47081, term47081.getClass(), "type", 0);
        setField(term47081, term47081.getClass(), "next", null);
        setField(term47081, term47081.getClass(), "first", null);
        setField(term47081, term47081.getClass(), "last", null);
        setField(term47081, term47081.getClass(), "propListHead", null);
        setIntField(term47081, term47081.getClass(), "sourcePosition", 0);
        setField(term47081, term47081.getClass(), "jsType", null);
        setField(term47081, term47081.getClass(), "parent", null);
        setField(term47080, term47080.getClass(), "next", term47081);
        setIntField(term47082, term47082.getClass(), "type", 75);
        setField(term47082, term47082.getClass(), "next", term47080);
        setField(term47082, term47082.getClass(), "first", null);
        setField(term47082, term47082.getClass(), "last", null);
        setField(term47082, term47082.getClass(), "propListHead", null);
        setIntField(term47082, term47082.getClass(), "sourcePosition", 0);
        setField(term47082, term47082.getClass(), "jsType", null);
        setField(term47082, term47082.getClass(), "parent", null);
        setField(term47080, term47080.getClass(), "first", term47082);
        setField(term47080, term47080.getClass(), "last", null);
        setField(term47080, term47080.getClass(), "propListHead", null);
        setIntField(term47080, term47080.getClass(), "sourcePosition", 0);
        setField(term47080, term47080.getClass(), "jsType", null);
        setField(term47080, term47080.getClass(), "parent", null);
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
        args[1] = term36693;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term36623, args);
        assertTrue(recursiveEquals(term36623, term47079));
        assertTrue(recursiveEquals(term36693, null));
    }

};


