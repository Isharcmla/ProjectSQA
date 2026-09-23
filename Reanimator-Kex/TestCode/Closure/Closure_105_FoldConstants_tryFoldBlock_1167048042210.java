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

public class FoldConstants_tryFoldBlock_1167048042210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53450;
     Object term53520;
     Object term54509;
     Object term54510;

    public FoldConstants_tryFoldBlock_1167048042210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53450 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term53520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term53730, term53730.getClass(), "next", term53800);
        setIntField(term53730, term53730.getClass(), "type", 65);
        setField(term53660, term53660.getClass(), "next", term53730);
        setIntField(term53660, term53660.getClass(), "type", 112);
        setField(term53590, term53590.getClass(), "next", term53660);
        setIntField(term53590, term53590.getClass(), "type", 112);
        setField(term53520, term53520.getClass(), "first", term53590);
        term54509 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term54509, term54509.getClass(), "compiler", null);
        term54510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54510, term54510.getClass(), "type", 0);
        setField(term54510, term54510.getClass(), "next", null);
        setIntField(term54511, term54511.getClass(), "type", 112);
        setIntField(term54512, term54512.getClass(), "type", 112);
        setIntField(term54513, term54513.getClass(), "type", 65);
        setIntField(term54514, term54514.getClass(), "type", 0);
        setField(term54514, term54514.getClass(), "next", null);
        setField(term54514, term54514.getClass(), "first", null);
        setField(term54514, term54514.getClass(), "last", null);
        setField(term54514, term54514.getClass(), "propListHead", null);
        setIntField(term54514, term54514.getClass(), "sourcePosition", 0);
        setField(term54514, term54514.getClass(), "jsType", null);
        setField(term54514, term54514.getClass(), "parent", null);
        setField(term54513, term54513.getClass(), "next", term54514);
        setField(term54513, term54513.getClass(), "first", null);
        setField(term54513, term54513.getClass(), "last", null);
        setField(term54513, term54513.getClass(), "propListHead", null);
        setIntField(term54513, term54513.getClass(), "sourcePosition", 0);
        setField(term54513, term54513.getClass(), "jsType", null);
        setField(term54513, term54513.getClass(), "parent", null);
        setField(term54512, term54512.getClass(), "next", term54513);
        setField(term54512, term54512.getClass(), "first", null);
        setField(term54512, term54512.getClass(), "last", null);
        setField(term54512, term54512.getClass(), "propListHead", null);
        setIntField(term54512, term54512.getClass(), "sourcePosition", 0);
        setField(term54512, term54512.getClass(), "jsType", null);
        setField(term54512, term54512.getClass(), "parent", null);
        setField(term54511, term54511.getClass(), "next", term54512);
        setField(term54511, term54511.getClass(), "first", null);
        setField(term54511, term54511.getClass(), "last", null);
        setField(term54511, term54511.getClass(), "propListHead", null);
        setIntField(term54511, term54511.getClass(), "sourcePosition", 0);
        setField(term54511, term54511.getClass(), "jsType", null);
        setField(term54511, term54511.getClass(), "parent", null);
        setField(term54510, term54510.getClass(), "first", term54511);
        setField(term54510, term54510.getClass(), "last", null);
        setField(term54510, term54510.getClass(), "propListHead", null);
        setIntField(term54510, term54510.getClass(), "sourcePosition", 0);
        setField(term54510, term54510.getClass(), "jsType", null);
        setField(term54510, term54510.getClass(), "parent", null);
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
        args[1] = term53520;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term53450, args);
        assertTrue(recursiveEquals(term53450, term54509));
        assertTrue(recursiveEquals(term53520, null));
    }

};


