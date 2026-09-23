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

public class FoldConstants_tryFoldBlock_1167048042272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72543;
     Object term72613;
     Object term73215;
     Object term73216;

    public FoldConstants_tryFoldBlock_1167048042272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72543 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term72613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term72683, term72683.getClass(), "next", term72613);
        setIntField(term72683, term72683.getClass(), "type", 75);
        setField(term72613, term72613.getClass(), "first", term72683);
        setField(term72613, term72613.getClass(), "next", term72753);
        setIntField(term72613, term72613.getClass(), "type", 72);
        term73215 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term73215, term73215.getClass(), "compiler", null);
        term73216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73216, term73216.getClass(), "type", 72);
        setIntField(term73217, term73217.getClass(), "type", 0);
        setField(term73217, term73217.getClass(), "next", null);
        setField(term73217, term73217.getClass(), "first", null);
        setField(term73217, term73217.getClass(), "last", null);
        setField(term73217, term73217.getClass(), "propListHead", null);
        setIntField(term73217, term73217.getClass(), "sourcePosition", 0);
        setField(term73217, term73217.getClass(), "jsType", null);
        setField(term73217, term73217.getClass(), "parent", null);
        setField(term73216, term73216.getClass(), "next", term73217);
        setIntField(term73218, term73218.getClass(), "type", 75);
        setField(term73218, term73218.getClass(), "next", term73216);
        setField(term73218, term73218.getClass(), "first", null);
        setField(term73218, term73218.getClass(), "last", null);
        setField(term73218, term73218.getClass(), "propListHead", null);
        setIntField(term73218, term73218.getClass(), "sourcePosition", 0);
        setField(term73218, term73218.getClass(), "jsType", null);
        setField(term73218, term73218.getClass(), "parent", null);
        setField(term73216, term73216.getClass(), "first", term73218);
        setField(term73216, term73216.getClass(), "last", null);
        setField(term73216, term73216.getClass(), "propListHead", null);
        setIntField(term73216, term73216.getClass(), "sourcePosition", 0);
        setField(term73216, term73216.getClass(), "jsType", null);
        setField(term73216, term73216.getClass(), "parent", null);
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
        args[1] = term72613;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term72543, args);
        assertTrue(recursiveEquals(term72543, term73215));
        assertTrue(recursiveEquals(term72613, null));
    }

};


