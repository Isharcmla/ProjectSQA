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

public class FoldConstants_tryFoldBlock_1167048042413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119382;
     Object term119452;
     Object term120081;
     Object term120082;

    public FoldConstants_tryFoldBlock_1167048042413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119382 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term119452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term119732, term119732.getClass(), "next", term119802);
        setIntField(term119732, term119732.getClass(), "type", 129);
        setField(term119662, term119662.getClass(), "next", term119732);
        setIntField(term119662, term119662.getClass(), "type", 126);
        setField(term119592, term119592.getClass(), "next", term119662);
        setIntField(term119592, term119592.getClass(), "type", 96);
        setIntField(term119872, term119872.getClass(), "type", 129);
        setField(term119592, term119592.getClass(), "first", term119872);
        setField(term119522, term119522.getClass(), "next", term119592);
        setIntField(term119522, term119522.getClass(), "type", 129);
        setField(term119452, term119452.getClass(), "first", term119522);
        term120081 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term120081, term120081.getClass(), "compiler", null);
        term120082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term120082, term120082.getClass(), "type", 0);
        setField(term120082, term120082.getClass(), "next", null);
        setIntField(term120083, term120083.getClass(), "type", 129);
        setIntField(term120084, term120084.getClass(), "type", 96);
        setIntField(term120085, term120085.getClass(), "type", 126);
        setIntField(term120086, term120086.getClass(), "type", 129);
        setField(term120086, term120086.getClass(), "next", null);
        setField(term120086, term120086.getClass(), "first", null);
        setField(term120086, term120086.getClass(), "last", null);
        setField(term120086, term120086.getClass(), "propListHead", null);
        setIntField(term120086, term120086.getClass(), "sourcePosition", 0);
        setField(term120086, term120086.getClass(), "jsType", null);
        setField(term120086, term120086.getClass(), "parent", null);
        setField(term120085, term120085.getClass(), "next", term120086);
        setField(term120085, term120085.getClass(), "first", null);
        setField(term120085, term120085.getClass(), "last", null);
        setField(term120085, term120085.getClass(), "propListHead", null);
        setIntField(term120085, term120085.getClass(), "sourcePosition", 0);
        setField(term120085, term120085.getClass(), "jsType", null);
        setField(term120085, term120085.getClass(), "parent", null);
        setField(term120084, term120084.getClass(), "next", term120085);
        setIntField(term120087, term120087.getClass(), "type", 129);
        setField(term120087, term120087.getClass(), "next", null);
        setField(term120087, term120087.getClass(), "first", null);
        setField(term120087, term120087.getClass(), "last", null);
        setField(term120087, term120087.getClass(), "propListHead", null);
        setIntField(term120087, term120087.getClass(), "sourcePosition", 0);
        setField(term120087, term120087.getClass(), "jsType", null);
        setField(term120087, term120087.getClass(), "parent", null);
        setField(term120084, term120084.getClass(), "first", term120087);
        setField(term120084, term120084.getClass(), "last", null);
        setField(term120084, term120084.getClass(), "propListHead", null);
        setIntField(term120084, term120084.getClass(), "sourcePosition", 0);
        setField(term120084, term120084.getClass(), "jsType", null);
        setField(term120084, term120084.getClass(), "parent", null);
        setField(term120083, term120083.getClass(), "next", term120084);
        setField(term120083, term120083.getClass(), "first", null);
        setField(term120083, term120083.getClass(), "last", null);
        setField(term120083, term120083.getClass(), "propListHead", null);
        setIntField(term120083, term120083.getClass(), "sourcePosition", 0);
        setField(term120083, term120083.getClass(), "jsType", null);
        setField(term120083, term120083.getClass(), "parent", null);
        setField(term120082, term120082.getClass(), "first", term120083);
        setField(term120082, term120082.getClass(), "last", null);
        setField(term120082, term120082.getClass(), "propListHead", null);
        setIntField(term120082, term120082.getClass(), "sourcePosition", 0);
        setField(term120082, term120082.getClass(), "jsType", null);
        setField(term120082, term120082.getClass(), "parent", null);
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
        args[1] = term119452;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term119382, args);
        assertTrue(recursiveEquals(term119382, term120081));
        assertTrue(recursiveEquals(term119452, null));
    }

};


