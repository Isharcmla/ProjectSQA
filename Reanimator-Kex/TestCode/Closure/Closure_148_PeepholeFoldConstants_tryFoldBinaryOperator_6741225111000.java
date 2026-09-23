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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234006;
     Object term234098;
     Object term234360;
     Object term234361;
     Object term234326;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234006 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term234098 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term234190 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term234282 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term234190, term234190.getClass(), "next", term234282);
        setField(term234098, term234098.getClass(), "first", term234190);
        setIntField(term234098, term234098.getClass(), "type", 12);
        term234360 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term234360, term234360.getClass(), "currentTraversal", null);
        term234361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term234362 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term234363 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term234361, term234361.getClass(), "str", null);
        setIntField(term234361, term234361.getClass(), "type", 12);
        setField(term234361, term234361.getClass(), "next", null);
        setField(term234362, term234362.getClass(), "str", null);
        setIntField(term234362, term234362.getClass(), "type", 0);
        setField(term234363, term234363.getClass(), "str", null);
        setIntField(term234363, term234363.getClass(), "type", 0);
        setField(term234363, term234363.getClass(), "next", null);
        setField(term234363, term234363.getClass(), "first", null);
        setField(term234363, term234363.getClass(), "last", null);
        setField(term234363, term234363.getClass(), "propListHead", null);
        setIntField(term234363, term234363.getClass(), "sourcePosition", 0);
        setField(term234363, term234363.getClass(), "jsType", null);
        setField(term234363, term234363.getClass(), "parent", null);
        setField(term234362, term234362.getClass(), "next", term234363);
        setField(term234362, term234362.getClass(), "first", null);
        setField(term234362, term234362.getClass(), "last", null);
        setField(term234362, term234362.getClass(), "propListHead", null);
        setIntField(term234362, term234362.getClass(), "sourcePosition", 0);
        setField(term234362, term234362.getClass(), "jsType", null);
        setField(term234362, term234362.getClass(), "parent", null);
        setField(term234361, term234361.getClass(), "first", term234362);
        setField(term234361, term234361.getClass(), "last", null);
        setField(term234361, term234361.getClass(), "propListHead", null);
        setIntField(term234361, term234361.getClass(), "sourcePosition", 0);
        setField(term234361, term234361.getClass(), "jsType", null);
        setField(term234361, term234361.getClass(), "parent", null);
        term234326 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term234328 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term234330 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term234326, term234326.getClass(), "str", null);
        setIntField(term234326, term234326.getClass(), "type", 12);
        setField(term234326, term234326.getClass(), "next", null);
        setField(term234328, term234328.getClass(), "str", null);
        setIntField(term234328, term234328.getClass(), "type", 0);
        setField(term234330, term234330.getClass(), "str", null);
        setIntField(term234330, term234330.getClass(), "type", 0);
        setField(term234330, term234330.getClass(), "next", null);
        setField(term234330, term234330.getClass(), "first", null);
        setField(term234330, term234330.getClass(), "last", null);
        setField(term234330, term234330.getClass(), "propListHead", null);
        setIntField(term234330, term234330.getClass(), "sourcePosition", 0);
        setField(term234330, term234330.getClass(), "jsType", null);
        setField(term234330, term234330.getClass(), "parent", null);
        setField(term234328, term234328.getClass(), "next", term234330);
        setField(term234328, term234328.getClass(), "first", null);
        setField(term234328, term234328.getClass(), "last", null);
        setField(term234328, term234328.getClass(), "propListHead", null);
        setIntField(term234328, term234328.getClass(), "sourcePosition", 0);
        setField(term234328, term234328.getClass(), "jsType", null);
        setField(term234328, term234328.getClass(), "parent", null);
        setField(term234326, term234326.getClass(), "first", term234328);
        setField(term234326, term234326.getClass(), "last", null);
        setField(term234326, term234326.getClass(), "propListHead", null);
        setIntField(term234326, term234326.getClass(), "sourcePosition", 0);
        setField(term234326, term234326.getClass(), "jsType", null);
        setField(term234326, term234326.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term234098;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term234006, args);
        assertTrue(recursiveEquals(term234006, term234360));
        assertTrue(recursiveEquals(term234098, term234361));
        assertTrue(recursiveEquals(retValue, term234326));
    }

};


