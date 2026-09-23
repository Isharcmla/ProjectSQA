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

public class FoldConstants_tryFoldBlock_1167048042347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96489;
     Object term96559;
     Object term97116;
     Object term97117;

    public FoldConstants_tryFoldBlock_1167048042347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96489 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term96559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96769, term96769.getClass(), "next", term96839);
        setIntField(term96769, term96769.getClass(), "type", 112);
        setField(term96699, term96699.getClass(), "next", term96769);
        setIntField(term96699, term96699.getClass(), "type", 61);
        setField(term96629, term96629.getClass(), "next", term96699);
        setIntField(term96629, term96629.getClass(), "type", 112);
        setField(term96559, term96559.getClass(), "first", term96629);
        term97116 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term97116, term97116.getClass(), "compiler", null);
        term97117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97117, term97117.getClass(), "type", 0);
        setField(term97117, term97117.getClass(), "next", null);
        setIntField(term97118, term97118.getClass(), "type", 112);
        setIntField(term97119, term97119.getClass(), "type", 61);
        setIntField(term97120, term97120.getClass(), "type", 112);
        setIntField(term97121, term97121.getClass(), "type", 0);
        setField(term97121, term97121.getClass(), "next", null);
        setField(term97121, term97121.getClass(), "first", null);
        setField(term97121, term97121.getClass(), "last", null);
        setField(term97121, term97121.getClass(), "propListHead", null);
        setIntField(term97121, term97121.getClass(), "sourcePosition", 0);
        setField(term97121, term97121.getClass(), "jsType", null);
        setField(term97121, term97121.getClass(), "parent", null);
        setField(term97120, term97120.getClass(), "next", term97121);
        setField(term97120, term97120.getClass(), "first", null);
        setField(term97120, term97120.getClass(), "last", null);
        setField(term97120, term97120.getClass(), "propListHead", null);
        setIntField(term97120, term97120.getClass(), "sourcePosition", 0);
        setField(term97120, term97120.getClass(), "jsType", null);
        setField(term97120, term97120.getClass(), "parent", null);
        setField(term97119, term97119.getClass(), "next", term97120);
        setField(term97119, term97119.getClass(), "first", null);
        setField(term97119, term97119.getClass(), "last", null);
        setField(term97119, term97119.getClass(), "propListHead", null);
        setIntField(term97119, term97119.getClass(), "sourcePosition", 0);
        setField(term97119, term97119.getClass(), "jsType", null);
        setField(term97119, term97119.getClass(), "parent", null);
        setField(term97118, term97118.getClass(), "next", term97119);
        setField(term97118, term97118.getClass(), "first", null);
        setField(term97118, term97118.getClass(), "last", null);
        setField(term97118, term97118.getClass(), "propListHead", null);
        setIntField(term97118, term97118.getClass(), "sourcePosition", 0);
        setField(term97118, term97118.getClass(), "jsType", null);
        setField(term97118, term97118.getClass(), "parent", null);
        setField(term97117, term97117.getClass(), "first", term97118);
        setField(term97117, term97117.getClass(), "last", null);
        setField(term97117, term97117.getClass(), "propListHead", null);
        setIntField(term97117, term97117.getClass(), "sourcePosition", 0);
        setField(term97117, term97117.getClass(), "jsType", null);
        setField(term97117, term97117.getClass(), "parent", null);
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
        args[1] = term96559;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term96489, args);
        assertTrue(recursiveEquals(term96489, term97116));
        assertTrue(recursiveEquals(term96559, null));
    }

};


