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

public class FoldConstants_tryFoldBlock_1167048042149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33517;
     Object term33587;
     Object term33718;
     Object term33719;

    public FoldConstants_tryFoldBlock_1167048042149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33517 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term33587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33587, term33587.getClass(), "first", term33587);
        setField(term33587, term33587.getClass(), "next", term33657);
        setIntField(term33587, term33587.getClass(), "type", 81);
        term33718 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term33718, term33718.getClass(), "compiler", null);
        term33719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33719, term33719.getClass(), "type", 81);
        setIntField(term33720, term33720.getClass(), "type", 0);
        setField(term33720, term33720.getClass(), "next", null);
        setField(term33720, term33720.getClass(), "first", null);
        setField(term33720, term33720.getClass(), "last", null);
        setField(term33720, term33720.getClass(), "propListHead", null);
        setIntField(term33720, term33720.getClass(), "sourcePosition", 0);
        setField(term33720, term33720.getClass(), "jsType", null);
        setField(term33720, term33720.getClass(), "parent", null);
        setField(term33719, term33719.getClass(), "next", term33720);
        setField(term33719, term33719.getClass(), "first", term33719);
        setField(term33719, term33719.getClass(), "last", null);
        setField(term33719, term33719.getClass(), "propListHead", null);
        setIntField(term33719, term33719.getClass(), "sourcePosition", 0);
        setField(term33719, term33719.getClass(), "jsType", null);
        setField(term33719, term33719.getClass(), "parent", null);
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
        args[1] = term33587;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term33517, args);
        assertTrue(recursiveEquals(term33517, term33718));
        assertTrue(recursiveEquals(term33587, null));
    }

};


