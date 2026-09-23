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

public class PeepholeFoldConstants_tryFoldTypeof_1036786877780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176227;
     Object term176297;
     Object term176307;
     Object term176308;
     Object term176299;

    public PeepholeFoldConstants_tryFoldTypeof_1036786877780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176227 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term176297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term176297, term176297.getClass(), "type", 32);
        term176307 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term176307, term176307.getClass(), "currentTraversal", null);
        term176308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term176308, term176308.getClass(), "type", 32);
        setField(term176308, term176308.getClass(), "next", null);
        setField(term176308, term176308.getClass(), "first", null);
        setField(term176308, term176308.getClass(), "last", null);
        setField(term176308, term176308.getClass(), "propListHead", null);
        setIntField(term176308, term176308.getClass(), "sourcePosition", 0);
        setField(term176308, term176308.getClass(), "jsType", null);
        setField(term176308, term176308.getClass(), "parent", null);
        term176299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term176299, term176299.getClass(), "type", 32);
        setField(term176299, term176299.getClass(), "next", null);
        setField(term176299, term176299.getClass(), "first", null);
        setField(term176299, term176299.getClass(), "last", null);
        setField(term176299, term176299.getClass(), "propListHead", null);
        setIntField(term176299, term176299.getClass(), "sourcePosition", 0);
        setField(term176299, term176299.getClass(), "jsType", null);
        setField(term176299, term176299.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term176297;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term176227, args);
        assertTrue(recursiveEquals(term176227, term176307));
        assertTrue(recursiveEquals(term176297, term176308));
        assertTrue(recursiveEquals(retValue, term176299));
    }

};


