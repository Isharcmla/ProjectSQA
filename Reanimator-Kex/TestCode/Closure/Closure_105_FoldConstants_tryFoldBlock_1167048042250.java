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

public class FoldConstants_tryFoldBlock_1167048042250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65850;
     Object term65920;
     Object term66733;
     Object term66734;

    public FoldConstants_tryFoldBlock_1167048042250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65850 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term65920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65990, term65990.getClass(), "next", term65920);
        setIntField(term65990, term65990.getClass(), "type", 103);
        setField(term65920, term65920.getClass(), "first", term65990);
        setField(term65920, term65920.getClass(), "next", term66060);
        setIntField(term65920, term65920.getClass(), "type", 55);
        term66733 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term66733, term66733.getClass(), "compiler", null);
        term66734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66734, term66734.getClass(), "type", 55);
        setIntField(term66735, term66735.getClass(), "type", 0);
        setField(term66735, term66735.getClass(), "next", null);
        setField(term66735, term66735.getClass(), "first", null);
        setField(term66735, term66735.getClass(), "last", null);
        setField(term66735, term66735.getClass(), "propListHead", null);
        setIntField(term66735, term66735.getClass(), "sourcePosition", 0);
        setField(term66735, term66735.getClass(), "jsType", null);
        setField(term66735, term66735.getClass(), "parent", null);
        setField(term66734, term66734.getClass(), "next", term66735);
        setIntField(term66736, term66736.getClass(), "type", 103);
        setField(term66736, term66736.getClass(), "next", term66734);
        setField(term66736, term66736.getClass(), "first", null);
        setField(term66736, term66736.getClass(), "last", null);
        setField(term66736, term66736.getClass(), "propListHead", null);
        setIntField(term66736, term66736.getClass(), "sourcePosition", 0);
        setField(term66736, term66736.getClass(), "jsType", null);
        setField(term66736, term66736.getClass(), "parent", null);
        setField(term66734, term66734.getClass(), "first", term66736);
        setField(term66734, term66734.getClass(), "last", null);
        setField(term66734, term66734.getClass(), "propListHead", null);
        setIntField(term66734, term66734.getClass(), "sourcePosition", 0);
        setField(term66734, term66734.getClass(), "jsType", null);
        setField(term66734, term66734.getClass(), "parent", null);
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
        args[1] = term65920;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term65850, args);
        assertTrue(recursiveEquals(term65850, term66733));
        assertTrue(recursiveEquals(term65920, null));
    }

};


