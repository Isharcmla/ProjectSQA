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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202898;
     Object term202990;
     Object term203509;
     Object term203510;
     Object term203480;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202898 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term202990 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term203060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term202990, term202990.getClass(), "first", term202990);
        setField(term202990, term202990.getClass(), "next", term203060);
        setIntField(term202990, term202990.getClass(), "type", 9);
        term203509 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term203509, term203509.getClass(), "currentTraversal", null);
        term203510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term203511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term203510, term203510.getClass(), "number", 0.0);
        setIntField(term203510, term203510.getClass(), "type", 9);
        setIntField(term203511, term203511.getClass(), "type", 0);
        setField(term203511, term203511.getClass(), "next", null);
        setField(term203511, term203511.getClass(), "first", null);
        setField(term203511, term203511.getClass(), "last", null);
        setField(term203511, term203511.getClass(), "propListHead", null);
        setIntField(term203511, term203511.getClass(), "sourcePosition", 0);
        setField(term203511, term203511.getClass(), "jsType", null);
        setField(term203511, term203511.getClass(), "parent", null);
        setField(term203510, term203510.getClass(), "next", term203511);
        setField(term203510, term203510.getClass(), "first", term203510);
        setField(term203510, term203510.getClass(), "last", null);
        setField(term203510, term203510.getClass(), "propListHead", null);
        setIntField(term203510, term203510.getClass(), "sourcePosition", 0);
        setField(term203510, term203510.getClass(), "jsType", null);
        setField(term203510, term203510.getClass(), "parent", null);
        term203480 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term203483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term203480, term203480.getClass(), "number", 0.0);
        setIntField(term203480, term203480.getClass(), "type", 9);
        setIntField(term203483, term203483.getClass(), "type", 0);
        setField(term203483, term203483.getClass(), "next", null);
        setField(term203483, term203483.getClass(), "first", null);
        setField(term203483, term203483.getClass(), "last", null);
        setField(term203483, term203483.getClass(), "propListHead", null);
        setIntField(term203483, term203483.getClass(), "sourcePosition", 0);
        setField(term203483, term203483.getClass(), "jsType", null);
        setField(term203483, term203483.getClass(), "parent", null);
        setField(term203480, term203480.getClass(), "next", term203483);
        setField(term203480, term203480.getClass(), "first", term203480);
        setField(term203480, term203480.getClass(), "last", null);
        setField(term203480, term203480.getClass(), "propListHead", null);
        setIntField(term203480, term203480.getClass(), "sourcePosition", 0);
        setField(term203480, term203480.getClass(), "jsType", null);
        setField(term203480, term203480.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term202990;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term202898, args);
        assertTrue(recursiveEquals(term202898, term203509));
        assertTrue(recursiveEquals(term202990, term203510));
        assertTrue(recursiveEquals(retValue, term203480));
    }

};


