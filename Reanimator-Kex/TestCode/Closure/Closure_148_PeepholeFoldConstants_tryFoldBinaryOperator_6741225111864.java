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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491503;
     Object term491595;
     Object term491819;
     Object term491820;
     Object term491792;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term491503 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term491595 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term491687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term491779 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term491687, term491687.getClass(), "next", term491779);
        setField(term491595, term491595.getClass(), "first", term491687);
        setIntField(term491595, term491595.getClass(), "type", 18);
        term491819 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term491819, term491819.getClass(), "currentTraversal", null);
        term491820 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term491821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term491822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term491820, term491820.getClass(), "str", null);
        setIntField(term491820, term491820.getClass(), "type", 18);
        setField(term491820, term491820.getClass(), "next", null);
        setField(term491821, term491821.getClass(), "str", null);
        setIntField(term491821, term491821.getClass(), "type", 0);
        setField(term491822, term491822.getClass(), "str", null);
        setIntField(term491822, term491822.getClass(), "type", 0);
        setField(term491822, term491822.getClass(), "next", null);
        setField(term491822, term491822.getClass(), "first", null);
        setField(term491822, term491822.getClass(), "last", null);
        setField(term491822, term491822.getClass(), "propListHead", null);
        setIntField(term491822, term491822.getClass(), "sourcePosition", 0);
        setField(term491822, term491822.getClass(), "jsType", null);
        setField(term491822, term491822.getClass(), "parent", null);
        setField(term491821, term491821.getClass(), "next", term491822);
        setField(term491821, term491821.getClass(), "first", null);
        setField(term491821, term491821.getClass(), "last", null);
        setField(term491821, term491821.getClass(), "propListHead", null);
        setIntField(term491821, term491821.getClass(), "sourcePosition", 0);
        setField(term491821, term491821.getClass(), "jsType", null);
        setField(term491821, term491821.getClass(), "parent", null);
        setField(term491820, term491820.getClass(), "first", term491821);
        setField(term491820, term491820.getClass(), "last", null);
        setField(term491820, term491820.getClass(), "propListHead", null);
        setIntField(term491820, term491820.getClass(), "sourcePosition", 0);
        setField(term491820, term491820.getClass(), "jsType", null);
        setField(term491820, term491820.getClass(), "parent", null);
        term491792 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term491794 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term491796 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term491792, term491792.getClass(), "str", null);
        setIntField(term491792, term491792.getClass(), "type", 18);
        setField(term491792, term491792.getClass(), "next", null);
        setField(term491794, term491794.getClass(), "str", null);
        setIntField(term491794, term491794.getClass(), "type", 0);
        setField(term491796, term491796.getClass(), "str", null);
        setIntField(term491796, term491796.getClass(), "type", 0);
        setField(term491796, term491796.getClass(), "next", null);
        setField(term491796, term491796.getClass(), "first", null);
        setField(term491796, term491796.getClass(), "last", null);
        setField(term491796, term491796.getClass(), "propListHead", null);
        setIntField(term491796, term491796.getClass(), "sourcePosition", 0);
        setField(term491796, term491796.getClass(), "jsType", null);
        setField(term491796, term491796.getClass(), "parent", null);
        setField(term491794, term491794.getClass(), "next", term491796);
        setField(term491794, term491794.getClass(), "first", null);
        setField(term491794, term491794.getClass(), "last", null);
        setField(term491794, term491794.getClass(), "propListHead", null);
        setIntField(term491794, term491794.getClass(), "sourcePosition", 0);
        setField(term491794, term491794.getClass(), "jsType", null);
        setField(term491794, term491794.getClass(), "parent", null);
        setField(term491792, term491792.getClass(), "first", term491794);
        setField(term491792, term491792.getClass(), "last", null);
        setField(term491792, term491792.getClass(), "propListHead", null);
        setIntField(term491792, term491792.getClass(), "sourcePosition", 0);
        setField(term491792, term491792.getClass(), "jsType", null);
        setField(term491792, term491792.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term491595;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term491503, args);
        assertTrue(recursiveEquals(term491503, term491819));
        assertTrue(recursiveEquals(term491595, term491820));
        assertTrue(recursiveEquals(retValue, term491792));
    }

};


