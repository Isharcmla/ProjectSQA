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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90388;
     Object term90458;
     Object term91041;
     Object term91042;
     Object term91006;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90388 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term90458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term90528, term90528.getClass(), "next", term90598);
        setIntField(term90528, term90528.getClass(), "type", 39);
        setField(term90458, term90458.getClass(), "first", term90528);
        setIntField(term90458, term90458.getClass(), "type", 9);
        term91041 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term91041, term91041.getClass(), "currentTraversal", null);
        term91042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term91042, term91042.getClass(), "type", 9);
        setField(term91042, term91042.getClass(), "next", null);
        setIntField(term91043, term91043.getClass(), "type", 39);
        setIntField(term91044, term91044.getClass(), "type", 0);
        setField(term91044, term91044.getClass(), "next", null);
        setField(term91044, term91044.getClass(), "first", null);
        setField(term91044, term91044.getClass(), "last", null);
        setField(term91044, term91044.getClass(), "propListHead", null);
        setIntField(term91044, term91044.getClass(), "sourcePosition", 0);
        setField(term91044, term91044.getClass(), "jsType", null);
        setField(term91044, term91044.getClass(), "parent", null);
        setField(term91043, term91043.getClass(), "next", term91044);
        setField(term91043, term91043.getClass(), "first", null);
        setField(term91043, term91043.getClass(), "last", null);
        setField(term91043, term91043.getClass(), "propListHead", null);
        setIntField(term91043, term91043.getClass(), "sourcePosition", 0);
        setField(term91043, term91043.getClass(), "jsType", null);
        setField(term91043, term91043.getClass(), "parent", null);
        setField(term91042, term91042.getClass(), "first", term91043);
        setField(term91042, term91042.getClass(), "last", null);
        setField(term91042, term91042.getClass(), "propListHead", null);
        setIntField(term91042, term91042.getClass(), "sourcePosition", 0);
        setField(term91042, term91042.getClass(), "jsType", null);
        setField(term91042, term91042.getClass(), "parent", null);
        term91006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term91006, term91006.getClass(), "type", 9);
        setField(term91006, term91006.getClass(), "next", null);
        setIntField(term91008, term91008.getClass(), "type", 39);
        setIntField(term91010, term91010.getClass(), "type", 0);
        setField(term91010, term91010.getClass(), "next", null);
        setField(term91010, term91010.getClass(), "first", null);
        setField(term91010, term91010.getClass(), "last", null);
        setField(term91010, term91010.getClass(), "propListHead", null);
        setIntField(term91010, term91010.getClass(), "sourcePosition", 0);
        setField(term91010, term91010.getClass(), "jsType", null);
        setField(term91010, term91010.getClass(), "parent", null);
        setField(term91008, term91008.getClass(), "next", term91010);
        setField(term91008, term91008.getClass(), "first", null);
        setField(term91008, term91008.getClass(), "last", null);
        setField(term91008, term91008.getClass(), "propListHead", null);
        setIntField(term91008, term91008.getClass(), "sourcePosition", 0);
        setField(term91008, term91008.getClass(), "jsType", null);
        setField(term91008, term91008.getClass(), "parent", null);
        setField(term91006, term91006.getClass(), "first", term91008);
        setField(term91006, term91006.getClass(), "last", null);
        setField(term91006, term91006.getClass(), "propListHead", null);
        setIntField(term91006, term91006.getClass(), "sourcePosition", 0);
        setField(term91006, term91006.getClass(), "jsType", null);
        setField(term91006, term91006.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term90458;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term90388, args);
        assertTrue(recursiveEquals(term90388, term91041));
        assertTrue(recursiveEquals(term90458, term91042));
        assertTrue(recursiveEquals(retValue, term91006));
    }

};


