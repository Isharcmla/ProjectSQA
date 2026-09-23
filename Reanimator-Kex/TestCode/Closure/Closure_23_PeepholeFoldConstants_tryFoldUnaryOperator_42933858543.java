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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldUnaryOperator_42933858543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;
     Object term208;

    public PeepholeFoldConstants_tryFoldUnaryOperator_42933858543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term206, term206.getClass(), "late", false);
        setField(term206, term206.getClass(), "compiler", null);
        term208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term208, term208.getClass(), "type", 287287233);
        setIntField(term210, term210.getClass(), "type", 962840079);
        setIntField(term212, term212.getClass(), "type", 1540719661);
        setIntField(term214, term214.getClass(), "type", 1265463001);
        setIntField(term216, term216.getClass(), "type", 335112684);
        setField(term216, term216.getClass(), "next", null);
        setField(term216, term216.getClass(), "first", null);
        setField(term216, term216.getClass(), "last", null);
        setField(term216, term216.getClass(), "propListHead", null);
        setIntField(term216, term216.getClass(), "sourcePosition", 0);
        setField(term216, term216.getClass(), "jsType", null);
        setField(term216, term216.getClass(), "parent", null);
        setField(term214, term214.getClass(), "next", term216);
        setIntField(term219, term219.getClass(), "type", 1551099402);
        setField(term219, term219.getClass(), "next", null);
        setField(term219, term219.getClass(), "first", null);
        setField(term219, term219.getClass(), "last", term216);
        setField(term219, term219.getClass(), "propListHead", null);
        setIntField(term219, term219.getClass(), "sourcePosition", 0);
        setField(term219, term219.getClass(), "jsType", null);
        setField(term219, term219.getClass(), "parent", null);
        setField(term214, term214.getClass(), "first", term219);
        setField(term214, term214.getClass(), "last", term212);
        setField(term214, term214.getClass(), "propListHead", null);
        setIntField(term214, term214.getClass(), "sourcePosition", 0);
        setField(term214, term214.getClass(), "jsType", null);
        setField(term214, term214.getClass(), "parent", null);
        setField(term212, term212.getClass(), "next", term214);
        setField(term212, term212.getClass(), "first", term216);
        setIntField(term223, term223.getClass(), "type", 1063420942);
        setIntField(term225, term225.getClass(), "type", 1375330971);
        setField(term225, term225.getClass(), "next", null);
        setField(term225, term225.getClass(), "first", term219);
        setField(term225, term225.getClass(), "last", term214);
        setField(term225, term225.getClass(), "propListHead", null);
        setIntField(term225, term225.getClass(), "sourcePosition", 0);
        setField(term225, term225.getClass(), "jsType", null);
        setField(term225, term225.getClass(), "parent", null);
        setField(term223, term223.getClass(), "next", term225);
        setField(term223, term223.getClass(), "first", term210);
        setField(term223, term223.getClass(), "last", term210);
        setField(term223, term223.getClass(), "propListHead", null);
        setIntField(term223, term223.getClass(), "sourcePosition", 0);
        setField(term223, term223.getClass(), "jsType", null);
        setField(term223, term223.getClass(), "parent", null);
        setField(term212, term212.getClass(), "last", term223);
        setField(term212, term212.getClass(), "propListHead", null);
        setIntField(term212, term212.getClass(), "sourcePosition", 0);
        setField(term212, term212.getClass(), "jsType", null);
        setField(term212, term212.getClass(), "parent", null);
        setField(term210, term210.getClass(), "next", term212);
        setIntField(term230, term230.getClass(), "type", -478195677);
        setField(term230, term230.getClass(), "next", term223);
        setField(term230, term230.getClass(), "first", term225);
        setField(term230, term230.getClass(), "last", term208);
        setField(term230, term230.getClass(), "propListHead", null);
        setIntField(term230, term230.getClass(), "sourcePosition", 0);
        setField(term230, term230.getClass(), "jsType", null);
        setField(term230, term230.getClass(), "parent", null);
        setField(term210, term210.getClass(), "first", term230);
        setField(term210, term210.getClass(), "last", term230);
        setField(term210, term210.getClass(), "propListHead", null);
        setIntField(term210, term210.getClass(), "sourcePosition", 0);
        setField(term210, term210.getClass(), "jsType", null);
        setField(term210, term210.getClass(), "parent", null);
        setField(term208, term208.getClass(), "next", term210);
        setField(term208, term208.getClass(), "first", term214);
        setField(term208, term208.getClass(), "last", term216);
        setField(term208, term208.getClass(), "propListHead", null);
        setIntField(term208, term208.getClass(), "sourcePosition", 0);
        setField(term208, term208.getClass(), "jsType", null);
        setField(term208, term208.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term208;
        try {
            callMethod(klass, "tryFoldUnaryOperator", argTypes, term206, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


