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

public class FoldConstants_tryFoldBlock_1167048042247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65236;
     Object term65306;
     Object term65722;
     Object term65723;

    public FoldConstants_tryFoldBlock_1167048042247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65236 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term65306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65516, term65516.getClass(), "next", term65586);
        setIntField(term65516, term65516.getClass(), "type", 123);
        setField(term65446, term65446.getClass(), "next", term65516);
        setIntField(term65446, term65446.getClass(), "type", 55);
        setField(term65376, term65376.getClass(), "next", term65446);
        setIntField(term65376, term65376.getClass(), "type", 31);
        setField(term65306, term65306.getClass(), "first", term65376);
        term65722 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term65722, term65722.getClass(), "compiler", null);
        term65723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65723, term65723.getClass(), "type", 0);
        setField(term65723, term65723.getClass(), "next", null);
        setIntField(term65724, term65724.getClass(), "type", 31);
        setIntField(term65725, term65725.getClass(), "type", 55);
        setIntField(term65726, term65726.getClass(), "type", 123);
        setIntField(term65727, term65727.getClass(), "type", 0);
        setField(term65727, term65727.getClass(), "next", null);
        setField(term65727, term65727.getClass(), "first", null);
        setField(term65727, term65727.getClass(), "last", null);
        setField(term65727, term65727.getClass(), "propListHead", null);
        setIntField(term65727, term65727.getClass(), "sourcePosition", 0);
        setField(term65727, term65727.getClass(), "jsType", null);
        setField(term65727, term65727.getClass(), "parent", null);
        setField(term65726, term65726.getClass(), "next", term65727);
        setField(term65726, term65726.getClass(), "first", null);
        setField(term65726, term65726.getClass(), "last", null);
        setField(term65726, term65726.getClass(), "propListHead", null);
        setIntField(term65726, term65726.getClass(), "sourcePosition", 0);
        setField(term65726, term65726.getClass(), "jsType", null);
        setField(term65726, term65726.getClass(), "parent", null);
        setField(term65725, term65725.getClass(), "next", term65726);
        setField(term65725, term65725.getClass(), "first", null);
        setField(term65725, term65725.getClass(), "last", null);
        setField(term65725, term65725.getClass(), "propListHead", null);
        setIntField(term65725, term65725.getClass(), "sourcePosition", 0);
        setField(term65725, term65725.getClass(), "jsType", null);
        setField(term65725, term65725.getClass(), "parent", null);
        setField(term65724, term65724.getClass(), "next", term65725);
        setField(term65724, term65724.getClass(), "first", null);
        setField(term65724, term65724.getClass(), "last", null);
        setField(term65724, term65724.getClass(), "propListHead", null);
        setIntField(term65724, term65724.getClass(), "sourcePosition", 0);
        setField(term65724, term65724.getClass(), "jsType", null);
        setField(term65724, term65724.getClass(), "parent", null);
        setField(term65723, term65723.getClass(), "first", term65724);
        setField(term65723, term65723.getClass(), "last", null);
        setField(term65723, term65723.getClass(), "propListHead", null);
        setIntField(term65723, term65723.getClass(), "sourcePosition", 0);
        setField(term65723, term65723.getClass(), "jsType", null);
        setField(term65723, term65723.getClass(), "parent", null);
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
        args[1] = term65306;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term65236, args);
        assertTrue(recursiveEquals(term65236, term65722));
        assertTrue(recursiveEquals(term65306, null));
    }

};


