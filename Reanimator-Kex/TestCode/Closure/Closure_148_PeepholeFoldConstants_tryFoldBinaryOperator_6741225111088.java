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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255395;
     Object term255487;
     Object term255717;
     Object term255718;
     Object term255684;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255395 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term255487 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255579 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255671 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term255579, term255579.getClass(), "next", term255671);
        setIntField(term255579, term255579.getClass(), "type", 39);
        setField(term255487, term255487.getClass(), "first", term255579);
        setIntField(term255487, term255487.getClass(), "type", 11);
        term255717 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term255717, term255717.getClass(), "currentTraversal", null);
        term255718 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255720 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term255718, term255718.getClass(), "str", null);
        setIntField(term255718, term255718.getClass(), "type", 11);
        setField(term255718, term255718.getClass(), "next", null);
        setField(term255719, term255719.getClass(), "str", null);
        setIntField(term255719, term255719.getClass(), "type", 39);
        setField(term255720, term255720.getClass(), "str", null);
        setIntField(term255720, term255720.getClass(), "type", 0);
        setField(term255720, term255720.getClass(), "next", null);
        setField(term255720, term255720.getClass(), "first", null);
        setField(term255720, term255720.getClass(), "last", null);
        setField(term255720, term255720.getClass(), "propListHead", null);
        setIntField(term255720, term255720.getClass(), "sourcePosition", 0);
        setField(term255720, term255720.getClass(), "jsType", null);
        setField(term255720, term255720.getClass(), "parent", null);
        setField(term255719, term255719.getClass(), "next", term255720);
        setField(term255719, term255719.getClass(), "first", null);
        setField(term255719, term255719.getClass(), "last", null);
        setField(term255719, term255719.getClass(), "propListHead", null);
        setIntField(term255719, term255719.getClass(), "sourcePosition", 0);
        setField(term255719, term255719.getClass(), "jsType", null);
        setField(term255719, term255719.getClass(), "parent", null);
        setField(term255718, term255718.getClass(), "first", term255719);
        setField(term255718, term255718.getClass(), "last", null);
        setField(term255718, term255718.getClass(), "propListHead", null);
        setIntField(term255718, term255718.getClass(), "sourcePosition", 0);
        setField(term255718, term255718.getClass(), "jsType", null);
        setField(term255718, term255718.getClass(), "parent", null);
        term255684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255686 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255688 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term255684, term255684.getClass(), "str", null);
        setIntField(term255684, term255684.getClass(), "type", 11);
        setField(term255684, term255684.getClass(), "next", null);
        setField(term255686, term255686.getClass(), "str", null);
        setIntField(term255686, term255686.getClass(), "type", 39);
        setField(term255688, term255688.getClass(), "str", null);
        setIntField(term255688, term255688.getClass(), "type", 0);
        setField(term255688, term255688.getClass(), "next", null);
        setField(term255688, term255688.getClass(), "first", null);
        setField(term255688, term255688.getClass(), "last", null);
        setField(term255688, term255688.getClass(), "propListHead", null);
        setIntField(term255688, term255688.getClass(), "sourcePosition", 0);
        setField(term255688, term255688.getClass(), "jsType", null);
        setField(term255688, term255688.getClass(), "parent", null);
        setField(term255686, term255686.getClass(), "next", term255688);
        setField(term255686, term255686.getClass(), "first", null);
        setField(term255686, term255686.getClass(), "last", null);
        setField(term255686, term255686.getClass(), "propListHead", null);
        setIntField(term255686, term255686.getClass(), "sourcePosition", 0);
        setField(term255686, term255686.getClass(), "jsType", null);
        setField(term255686, term255686.getClass(), "parent", null);
        setField(term255684, term255684.getClass(), "first", term255686);
        setField(term255684, term255684.getClass(), "last", null);
        setField(term255684, term255684.getClass(), "propListHead", null);
        setIntField(term255684, term255684.getClass(), "sourcePosition", 0);
        setField(term255684, term255684.getClass(), "jsType", null);
        setField(term255684, term255684.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term255487;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term255395, args);
        assertTrue(recursiveEquals(term255395, term255717));
        assertTrue(recursiveEquals(term255487, term255718));
        assertTrue(recursiveEquals(retValue, term255684));
    }

};


