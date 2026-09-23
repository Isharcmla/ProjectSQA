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

public class FoldConstants_tryFoldBlock_1167048042255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67596;
     Object term67666;
     Object term68185;
     Object term68186;

    public FoldConstants_tryFoldBlock_1167048042255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67596 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term67666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67876, term67876.getClass(), "next", term67946);
        setIntField(term67876, term67876.getClass(), "type", 68);
        setField(term67806, term67806.getClass(), "next", term67876);
        setIntField(term67806, term67806.getClass(), "type", 55);
        setField(term67736, term67736.getClass(), "next", term67806);
        setIntField(term67736, term67736.getClass(), "type", 31);
        setField(term67666, term67666.getClass(), "first", term67736);
        term68185 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term68185, term68185.getClass(), "compiler", null);
        term68186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68186, term68186.getClass(), "type", 0);
        setField(term68186, term68186.getClass(), "next", null);
        setIntField(term68187, term68187.getClass(), "type", 31);
        setIntField(term68188, term68188.getClass(), "type", 55);
        setIntField(term68189, term68189.getClass(), "type", 68);
        setIntField(term68190, term68190.getClass(), "type", 0);
        setField(term68190, term68190.getClass(), "next", null);
        setField(term68190, term68190.getClass(), "first", null);
        setField(term68190, term68190.getClass(), "last", null);
        setField(term68190, term68190.getClass(), "propListHead", null);
        setIntField(term68190, term68190.getClass(), "sourcePosition", 0);
        setField(term68190, term68190.getClass(), "jsType", null);
        setField(term68190, term68190.getClass(), "parent", null);
        setField(term68189, term68189.getClass(), "next", term68190);
        setField(term68189, term68189.getClass(), "first", null);
        setField(term68189, term68189.getClass(), "last", null);
        setField(term68189, term68189.getClass(), "propListHead", null);
        setIntField(term68189, term68189.getClass(), "sourcePosition", 0);
        setField(term68189, term68189.getClass(), "jsType", null);
        setField(term68189, term68189.getClass(), "parent", null);
        setField(term68188, term68188.getClass(), "next", term68189);
        setField(term68188, term68188.getClass(), "first", null);
        setField(term68188, term68188.getClass(), "last", null);
        setField(term68188, term68188.getClass(), "propListHead", null);
        setIntField(term68188, term68188.getClass(), "sourcePosition", 0);
        setField(term68188, term68188.getClass(), "jsType", null);
        setField(term68188, term68188.getClass(), "parent", null);
        setField(term68187, term68187.getClass(), "next", term68188);
        setField(term68187, term68187.getClass(), "first", null);
        setField(term68187, term68187.getClass(), "last", null);
        setField(term68187, term68187.getClass(), "propListHead", null);
        setIntField(term68187, term68187.getClass(), "sourcePosition", 0);
        setField(term68187, term68187.getClass(), "jsType", null);
        setField(term68187, term68187.getClass(), "parent", null);
        setField(term68186, term68186.getClass(), "first", term68187);
        setField(term68186, term68186.getClass(), "last", null);
        setField(term68186, term68186.getClass(), "propListHead", null);
        setIntField(term68186, term68186.getClass(), "sourcePosition", 0);
        setField(term68186, term68186.getClass(), "jsType", null);
        setField(term68186, term68186.getClass(), "parent", null);
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
        args[1] = term67666;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term67596, args);
        assertTrue(recursiveEquals(term67596, term68185));
        assertTrue(recursiveEquals(term67666, null));
    }

};


