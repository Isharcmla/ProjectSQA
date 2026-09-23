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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20009;
     Object term20079;
     Object term20485;
     Object term20486;
     Object term20463;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20009 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term20079, term20079.getClass(), "first", term20079);
        setField(term20079, term20079.getClass(), "next", term20079);
        setIntField(term20079, term20079.getClass(), "type", 12);
        term20485 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term20485, term20485.getClass(), "currentTraversal", null);
        term20486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20486, term20486.getClass(), "type", 12);
        setField(term20486, term20486.getClass(), "next", term20486);
        setField(term20486, term20486.getClass(), "first", term20486);
        setField(term20486, term20486.getClass(), "last", null);
        setField(term20486, term20486.getClass(), "propListHead", null);
        setIntField(term20486, term20486.getClass(), "sourcePosition", 0);
        setField(term20486, term20486.getClass(), "jsType", null);
        setField(term20486, term20486.getClass(), "parent", null);
        term20463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20463, term20463.getClass(), "type", 12);
        setField(term20463, term20463.getClass(), "next", term20463);
        setField(term20463, term20463.getClass(), "first", term20463);
        setField(term20463, term20463.getClass(), "last", null);
        setField(term20463, term20463.getClass(), "propListHead", null);
        setIntField(term20463, term20463.getClass(), "sourcePosition", 0);
        setField(term20463, term20463.getClass(), "jsType", null);
        setField(term20463, term20463.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20079;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term20009, args);
        assertTrue(recursiveEquals(term20009, term20485));
        assertTrue(recursiveEquals(term20079, term20486));
        assertTrue(recursiveEquals(retValue, term20463));
    }

};


