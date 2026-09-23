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

public class FoldConstants_tryFoldBlock_1167048042174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35450;
     Object term35520;
     Object term46483;
     Object term46484;

    public FoldConstants_tryFoldBlock_1167048042174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35450 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term35520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35520, term35520.getClass(), "first", term35520);
        setField(term35590, term35590.getClass(), "next", term35660);
        setIntField(term35590, term35590.getClass(), "type", 112);
        setField(term35520, term35520.getClass(), "next", term35590);
        setIntField(term35520, term35520.getClass(), "type", 112);
        term46483 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term46483, term46483.getClass(), "compiler", null);
        term46484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46484, term46484.getClass(), "type", 112);
        setIntField(term46485, term46485.getClass(), "type", 112);
        setIntField(term46486, term46486.getClass(), "type", 0);
        setField(term46486, term46486.getClass(), "next", null);
        setField(term46486, term46486.getClass(), "first", null);
        setField(term46486, term46486.getClass(), "last", null);
        setField(term46486, term46486.getClass(), "propListHead", null);
        setIntField(term46486, term46486.getClass(), "sourcePosition", 0);
        setField(term46486, term46486.getClass(), "jsType", null);
        setField(term46486, term46486.getClass(), "parent", null);
        setField(term46485, term46485.getClass(), "next", term46486);
        setField(term46485, term46485.getClass(), "first", null);
        setField(term46485, term46485.getClass(), "last", null);
        setField(term46485, term46485.getClass(), "propListHead", null);
        setIntField(term46485, term46485.getClass(), "sourcePosition", 0);
        setField(term46485, term46485.getClass(), "jsType", null);
        setField(term46485, term46485.getClass(), "parent", null);
        setField(term46484, term46484.getClass(), "next", term46485);
        setField(term46484, term46484.getClass(), "first", term46484);
        setField(term46484, term46484.getClass(), "last", null);
        setField(term46484, term46484.getClass(), "propListHead", null);
        setIntField(term46484, term46484.getClass(), "sourcePosition", 0);
        setField(term46484, term46484.getClass(), "jsType", null);
        setField(term46484, term46484.getClass(), "parent", null);
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
        args[1] = term35520;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term35450, args);
        assertTrue(recursiveEquals(term35450, term46483));
        assertTrue(recursiveEquals(term35520, null));
    }

};


