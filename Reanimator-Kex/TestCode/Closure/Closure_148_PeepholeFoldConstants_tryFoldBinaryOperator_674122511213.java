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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40628;
     Object term40698;
     Object term41133;
     Object term41134;
     Object term41111;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40628 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term40698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40698, term40698.getClass(), "first", term40698);
        setField(term40698, term40698.getClass(), "next", term40698);
        setIntField(term40698, term40698.getClass(), "type", 15);
        term41133 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term41133, term41133.getClass(), "currentTraversal", null);
        term41134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41134, term41134.getClass(), "type", 15);
        setField(term41134, term41134.getClass(), "next", term41134);
        setField(term41134, term41134.getClass(), "first", term41134);
        setField(term41134, term41134.getClass(), "last", null);
        setField(term41134, term41134.getClass(), "propListHead", null);
        setIntField(term41134, term41134.getClass(), "sourcePosition", 0);
        setField(term41134, term41134.getClass(), "jsType", null);
        setField(term41134, term41134.getClass(), "parent", null);
        term41111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41111, term41111.getClass(), "type", 15);
        setField(term41111, term41111.getClass(), "next", term41111);
        setField(term41111, term41111.getClass(), "first", term41111);
        setField(term41111, term41111.getClass(), "last", null);
        setField(term41111, term41111.getClass(), "propListHead", null);
        setIntField(term41111, term41111.getClass(), "sourcePosition", 0);
        setField(term41111, term41111.getClass(), "jsType", null);
        setField(term41111, term41111.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40698;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term40628, args);
        assertTrue(recursiveEquals(term40628, term41133));
        assertTrue(recursiveEquals(term40698, term41134));
        assertTrue(recursiveEquals(retValue, term41111));
    }

};


