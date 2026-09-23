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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128994;
     Object term129064;
     Object term129297;
     Object term129298;
     Object term129268;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128994 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term129064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term129134, term129134.getClass(), "next", term129204);
        setIntField(term129134, term129134.getClass(), "type", 39);
        setField(term129064, term129064.getClass(), "first", term129134);
        setIntField(term129064, term129064.getClass(), "type", 24);
        term129297 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term129297, term129297.getClass(), "currentTraversal", null);
        term129298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129298, term129298.getClass(), "type", 24);
        setField(term129298, term129298.getClass(), "next", null);
        setIntField(term129299, term129299.getClass(), "type", 39);
        setIntField(term129300, term129300.getClass(), "type", 0);
        setField(term129300, term129300.getClass(), "next", null);
        setField(term129300, term129300.getClass(), "first", null);
        setField(term129300, term129300.getClass(), "last", null);
        setField(term129300, term129300.getClass(), "propListHead", null);
        setIntField(term129300, term129300.getClass(), "sourcePosition", 0);
        setField(term129300, term129300.getClass(), "jsType", null);
        setField(term129300, term129300.getClass(), "parent", null);
        setField(term129299, term129299.getClass(), "next", term129300);
        setField(term129299, term129299.getClass(), "first", null);
        setField(term129299, term129299.getClass(), "last", null);
        setField(term129299, term129299.getClass(), "propListHead", null);
        setIntField(term129299, term129299.getClass(), "sourcePosition", 0);
        setField(term129299, term129299.getClass(), "jsType", null);
        setField(term129299, term129299.getClass(), "parent", null);
        setField(term129298, term129298.getClass(), "first", term129299);
        setField(term129298, term129298.getClass(), "last", null);
        setField(term129298, term129298.getClass(), "propListHead", null);
        setIntField(term129298, term129298.getClass(), "sourcePosition", 0);
        setField(term129298, term129298.getClass(), "jsType", null);
        setField(term129298, term129298.getClass(), "parent", null);
        term129268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129268, term129268.getClass(), "type", 24);
        setField(term129268, term129268.getClass(), "next", null);
        setIntField(term129270, term129270.getClass(), "type", 39);
        setIntField(term129272, term129272.getClass(), "type", 0);
        setField(term129272, term129272.getClass(), "next", null);
        setField(term129272, term129272.getClass(), "first", null);
        setField(term129272, term129272.getClass(), "last", null);
        setField(term129272, term129272.getClass(), "propListHead", null);
        setIntField(term129272, term129272.getClass(), "sourcePosition", 0);
        setField(term129272, term129272.getClass(), "jsType", null);
        setField(term129272, term129272.getClass(), "parent", null);
        setField(term129270, term129270.getClass(), "next", term129272);
        setField(term129270, term129270.getClass(), "first", null);
        setField(term129270, term129270.getClass(), "last", null);
        setField(term129270, term129270.getClass(), "propListHead", null);
        setIntField(term129270, term129270.getClass(), "sourcePosition", 0);
        setField(term129270, term129270.getClass(), "jsType", null);
        setField(term129270, term129270.getClass(), "parent", null);
        setField(term129268, term129268.getClass(), "first", term129270);
        setField(term129268, term129268.getClass(), "last", null);
        setField(term129268, term129268.getClass(), "propListHead", null);
        setIntField(term129268, term129268.getClass(), "sourcePosition", 0);
        setField(term129268, term129268.getClass(), "jsType", null);
        setField(term129268, term129268.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term129064;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term128994, args);
        assertTrue(recursiveEquals(term128994, term129297));
        assertTrue(recursiveEquals(term129064, term129298));
        assertTrue(recursiveEquals(retValue, term129268));
    }

};


