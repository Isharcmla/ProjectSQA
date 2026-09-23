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

public class FoldConstants_tryFoldBlock_1167048042325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88825;
     Object term88895;
     Object term89681;
     Object term89682;

    public FoldConstants_tryFoldBlock_1167048042325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88825 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term88895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89105, term89105.getClass(), "next", term89175);
        setIntField(term89105, term89105.getClass(), "type", 70);
        setField(term89035, term89035.getClass(), "next", term89105);
        setIntField(term89035, term89035.getClass(), "type", 128);
        setField(term88965, term88965.getClass(), "next", term89035);
        setIntField(term88965, term88965.getClass(), "type", 103);
        setField(term88895, term88895.getClass(), "first", term88965);
        term89681 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term89681, term89681.getClass(), "compiler", null);
        term89682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89682, term89682.getClass(), "type", 0);
        setField(term89682, term89682.getClass(), "next", null);
        setIntField(term89683, term89683.getClass(), "type", 103);
        setIntField(term89684, term89684.getClass(), "type", 128);
        setIntField(term89685, term89685.getClass(), "type", 70);
        setIntField(term89686, term89686.getClass(), "type", 0);
        setField(term89686, term89686.getClass(), "next", null);
        setField(term89686, term89686.getClass(), "first", null);
        setField(term89686, term89686.getClass(), "last", null);
        setField(term89686, term89686.getClass(), "propListHead", null);
        setIntField(term89686, term89686.getClass(), "sourcePosition", 0);
        setField(term89686, term89686.getClass(), "jsType", null);
        setField(term89686, term89686.getClass(), "parent", null);
        setField(term89685, term89685.getClass(), "next", term89686);
        setField(term89685, term89685.getClass(), "first", null);
        setField(term89685, term89685.getClass(), "last", null);
        setField(term89685, term89685.getClass(), "propListHead", null);
        setIntField(term89685, term89685.getClass(), "sourcePosition", 0);
        setField(term89685, term89685.getClass(), "jsType", null);
        setField(term89685, term89685.getClass(), "parent", null);
        setField(term89684, term89684.getClass(), "next", term89685);
        setField(term89684, term89684.getClass(), "first", null);
        setField(term89684, term89684.getClass(), "last", null);
        setField(term89684, term89684.getClass(), "propListHead", null);
        setIntField(term89684, term89684.getClass(), "sourcePosition", 0);
        setField(term89684, term89684.getClass(), "jsType", null);
        setField(term89684, term89684.getClass(), "parent", null);
        setField(term89683, term89683.getClass(), "next", term89684);
        setField(term89683, term89683.getClass(), "first", null);
        setField(term89683, term89683.getClass(), "last", null);
        setField(term89683, term89683.getClass(), "propListHead", null);
        setIntField(term89683, term89683.getClass(), "sourcePosition", 0);
        setField(term89683, term89683.getClass(), "jsType", null);
        setField(term89683, term89683.getClass(), "parent", null);
        setField(term89682, term89682.getClass(), "first", term89683);
        setField(term89682, term89682.getClass(), "last", null);
        setField(term89682, term89682.getClass(), "propListHead", null);
        setIntField(term89682, term89682.getClass(), "sourcePosition", 0);
        setField(term89682, term89682.getClass(), "jsType", null);
        setField(term89682, term89682.getClass(), "parent", null);
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
        args[1] = term88895;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term88825, args);
        assertTrue(recursiveEquals(term88825, term89681));
        assertTrue(recursiveEquals(term88895, null));
    }

};


