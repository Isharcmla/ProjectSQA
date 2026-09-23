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

public class FoldConstants_tryFoldBlock_1167048042386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109442;
     Object term109512;
     Object term110714;
     Object term110715;

    public FoldConstants_tryFoldBlock_1167048042386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109442 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term109512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term109792, term109792.getClass(), "next", term109862);
        setIntField(term109792, term109792.getClass(), "type", 113);
        setField(term109722, term109722.getClass(), "next", term109792);
        setIntField(term109722, term109722.getClass(), "type", 81);
        setField(term109652, term109652.getClass(), "next", term109722);
        setIntField(term109652, term109652.getClass(), "type", 87);
        setIntField(term109932, term109932.getClass(), "type", 75);
        setField(term109652, term109652.getClass(), "first", term109932);
        setField(term109582, term109582.getClass(), "next", term109652);
        setIntField(term109582, term109582.getClass(), "type", 75);
        setField(term109512, term109512.getClass(), "first", term109582);
        term110714 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term110714, term110714.getClass(), "compiler", null);
        term110715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term110715, term110715.getClass(), "type", 0);
        setField(term110715, term110715.getClass(), "next", null);
        setIntField(term110716, term110716.getClass(), "type", 75);
        setIntField(term110717, term110717.getClass(), "type", 87);
        setIntField(term110718, term110718.getClass(), "type", 81);
        setIntField(term110719, term110719.getClass(), "type", 113);
        setField(term110719, term110719.getClass(), "next", null);
        setField(term110719, term110719.getClass(), "first", null);
        setField(term110719, term110719.getClass(), "last", null);
        setField(term110719, term110719.getClass(), "propListHead", null);
        setIntField(term110719, term110719.getClass(), "sourcePosition", 0);
        setField(term110719, term110719.getClass(), "jsType", null);
        setField(term110719, term110719.getClass(), "parent", null);
        setField(term110718, term110718.getClass(), "next", term110719);
        setField(term110718, term110718.getClass(), "first", null);
        setField(term110718, term110718.getClass(), "last", null);
        setField(term110718, term110718.getClass(), "propListHead", null);
        setIntField(term110718, term110718.getClass(), "sourcePosition", 0);
        setField(term110718, term110718.getClass(), "jsType", null);
        setField(term110718, term110718.getClass(), "parent", null);
        setField(term110717, term110717.getClass(), "next", term110718);
        setIntField(term110720, term110720.getClass(), "type", 75);
        setField(term110720, term110720.getClass(), "next", null);
        setField(term110720, term110720.getClass(), "first", null);
        setField(term110720, term110720.getClass(), "last", null);
        setField(term110720, term110720.getClass(), "propListHead", null);
        setIntField(term110720, term110720.getClass(), "sourcePosition", 0);
        setField(term110720, term110720.getClass(), "jsType", null);
        setField(term110720, term110720.getClass(), "parent", null);
        setField(term110717, term110717.getClass(), "first", term110720);
        setField(term110717, term110717.getClass(), "last", null);
        setField(term110717, term110717.getClass(), "propListHead", null);
        setIntField(term110717, term110717.getClass(), "sourcePosition", 0);
        setField(term110717, term110717.getClass(), "jsType", null);
        setField(term110717, term110717.getClass(), "parent", null);
        setField(term110716, term110716.getClass(), "next", term110717);
        setField(term110716, term110716.getClass(), "first", null);
        setField(term110716, term110716.getClass(), "last", null);
        setField(term110716, term110716.getClass(), "propListHead", null);
        setIntField(term110716, term110716.getClass(), "sourcePosition", 0);
        setField(term110716, term110716.getClass(), "jsType", null);
        setField(term110716, term110716.getClass(), "parent", null);
        setField(term110715, term110715.getClass(), "first", term110716);
        setField(term110715, term110715.getClass(), "last", null);
        setField(term110715, term110715.getClass(), "propListHead", null);
        setIntField(term110715, term110715.getClass(), "sourcePosition", 0);
        setField(term110715, term110715.getClass(), "jsType", null);
        setField(term110715, term110715.getClass(), "parent", null);
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
        args[1] = term109512;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term109442, args);
        assertTrue(recursiveEquals(term109442, term110714));
        assertTrue(recursiveEquals(term109512, null));
    }

};


