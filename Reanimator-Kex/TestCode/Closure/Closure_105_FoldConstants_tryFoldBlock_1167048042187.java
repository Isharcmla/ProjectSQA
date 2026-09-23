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

public class FoldConstants_tryFoldBlock_1167048042187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47850;
     Object term47920;
     Object term48160;
     Object term48161;

    public FoldConstants_tryFoldBlock_1167048042187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47850 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term47920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47990, term47990.getClass(), "next", term47920);
        setIntField(term47990, term47990.getClass(), "type", 31);
        setField(term47920, term47920.getClass(), "first", term47990);
        setField(term47920, term47920.getClass(), "next", term48060);
        setIntField(term47920, term47920.getClass(), "type", 55);
        term48160 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term48160, term48160.getClass(), "compiler", null);
        term48161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48161, term48161.getClass(), "type", 55);
        setIntField(term48162, term48162.getClass(), "type", 0);
        setField(term48162, term48162.getClass(), "next", null);
        setField(term48162, term48162.getClass(), "first", null);
        setField(term48162, term48162.getClass(), "last", null);
        setField(term48162, term48162.getClass(), "propListHead", null);
        setIntField(term48162, term48162.getClass(), "sourcePosition", 0);
        setField(term48162, term48162.getClass(), "jsType", null);
        setField(term48162, term48162.getClass(), "parent", null);
        setField(term48161, term48161.getClass(), "next", term48162);
        setIntField(term48163, term48163.getClass(), "type", 31);
        setField(term48163, term48163.getClass(), "next", term48161);
        setField(term48163, term48163.getClass(), "first", null);
        setField(term48163, term48163.getClass(), "last", null);
        setField(term48163, term48163.getClass(), "propListHead", null);
        setIntField(term48163, term48163.getClass(), "sourcePosition", 0);
        setField(term48163, term48163.getClass(), "jsType", null);
        setField(term48163, term48163.getClass(), "parent", null);
        setField(term48161, term48161.getClass(), "first", term48163);
        setField(term48161, term48161.getClass(), "last", null);
        setField(term48161, term48161.getClass(), "propListHead", null);
        setIntField(term48161, term48161.getClass(), "sourcePosition", 0);
        setField(term48161, term48161.getClass(), "jsType", null);
        setField(term48161, term48161.getClass(), "parent", null);
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
        args[1] = term47920;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term47850, args);
        assertTrue(recursiveEquals(term47850, term48160));
        assertTrue(recursiveEquals(term47920, null));
    }

};


