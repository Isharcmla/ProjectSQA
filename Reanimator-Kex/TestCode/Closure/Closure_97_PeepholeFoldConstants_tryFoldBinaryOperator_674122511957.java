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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304574;
     Object term304666;
     Object term305210;
     Object term305211;
     Object term305189;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304574 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term304666 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term304736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term304666, term304666.getClass(), "first", term304666);
        setField(term304666, term304666.getClass(), "next", term304736);
        setIntField(term304666, term304666.getClass(), "type", 23);
        term305210 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term305210, term305210.getClass(), "currentTraversal", null);
        term305211 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term305212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term305211, term305211.getClass(), "str", null);
        setIntField(term305211, term305211.getClass(), "type", 23);
        setIntField(term305212, term305212.getClass(), "type", 0);
        setField(term305212, term305212.getClass(), "next", null);
        setField(term305212, term305212.getClass(), "first", null);
        setField(term305212, term305212.getClass(), "last", null);
        setField(term305212, term305212.getClass(), "propListHead", null);
        setIntField(term305212, term305212.getClass(), "sourcePosition", 0);
        setField(term305212, term305212.getClass(), "jsType", null);
        setField(term305212, term305212.getClass(), "parent", null);
        setField(term305211, term305211.getClass(), "next", term305212);
        setField(term305211, term305211.getClass(), "first", term305211);
        setField(term305211, term305211.getClass(), "last", null);
        setField(term305211, term305211.getClass(), "propListHead", null);
        setIntField(term305211, term305211.getClass(), "sourcePosition", 0);
        setField(term305211, term305211.getClass(), "jsType", null);
        setField(term305211, term305211.getClass(), "parent", null);
        term305189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term305191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term305189, term305189.getClass(), "str", null);
        setIntField(term305189, term305189.getClass(), "type", 23);
        setIntField(term305191, term305191.getClass(), "type", 0);
        setField(term305191, term305191.getClass(), "next", null);
        setField(term305191, term305191.getClass(), "first", null);
        setField(term305191, term305191.getClass(), "last", null);
        setField(term305191, term305191.getClass(), "propListHead", null);
        setIntField(term305191, term305191.getClass(), "sourcePosition", 0);
        setField(term305191, term305191.getClass(), "jsType", null);
        setField(term305191, term305191.getClass(), "parent", null);
        setField(term305189, term305189.getClass(), "next", term305191);
        setField(term305189, term305189.getClass(), "first", term305189);
        setField(term305189, term305189.getClass(), "last", null);
        setField(term305189, term305189.getClass(), "propListHead", null);
        setIntField(term305189, term305189.getClass(), "sourcePosition", 0);
        setField(term305189, term305189.getClass(), "jsType", null);
        setField(term305189, term305189.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term304666;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term304574, args);
        assertTrue(recursiveEquals(term304574, term305210));
        assertTrue(recursiveEquals(term304666, term305211));
        assertTrue(recursiveEquals(retValue, term305189));
    }

};


