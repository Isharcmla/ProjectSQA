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

public class FoldConstants_tryFoldBlock_1167048042180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37296;
     Object term37366;
     Object term47285;
     Object term47286;

    public FoldConstants_tryFoldBlock_1167048042180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37296 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term37366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37436, term37436.getClass(), "next", term37366);
        setIntField(term37436, term37436.getClass(), "type", 48);
        setField(term37366, term37366.getClass(), "first", term37436);
        setField(term37366, term37366.getClass(), "next", term37506);
        setIntField(term37366, term37366.getClass(), "type", 62);
        term47285 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term47285, term47285.getClass(), "compiler", null);
        term47286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47286, term47286.getClass(), "type", 62);
        setIntField(term47287, term47287.getClass(), "type", 0);
        setField(term47287, term47287.getClass(), "next", null);
        setField(term47287, term47287.getClass(), "first", null);
        setField(term47287, term47287.getClass(), "last", null);
        setField(term47287, term47287.getClass(), "propListHead", null);
        setIntField(term47287, term47287.getClass(), "sourcePosition", 0);
        setField(term47287, term47287.getClass(), "jsType", null);
        setField(term47287, term47287.getClass(), "parent", null);
        setField(term47286, term47286.getClass(), "next", term47287);
        setIntField(term47288, term47288.getClass(), "type", 48);
        setField(term47288, term47288.getClass(), "next", term47286);
        setField(term47288, term47288.getClass(), "first", null);
        setField(term47288, term47288.getClass(), "last", null);
        setField(term47288, term47288.getClass(), "propListHead", null);
        setIntField(term47288, term47288.getClass(), "sourcePosition", 0);
        setField(term47288, term47288.getClass(), "jsType", null);
        setField(term47288, term47288.getClass(), "parent", null);
        setField(term47286, term47286.getClass(), "first", term47288);
        setField(term47286, term47286.getClass(), "last", null);
        setField(term47286, term47286.getClass(), "propListHead", null);
        setIntField(term47286, term47286.getClass(), "sourcePosition", 0);
        setField(term47286, term47286.getClass(), "jsType", null);
        setField(term47286, term47286.getClass(), "parent", null);
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
        args[1] = term37366;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term37296, args);
        assertTrue(recursiveEquals(term37296, term47285));
        assertTrue(recursiveEquals(term37366, null));
    }

};


