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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431821;
     Object term431913;
     Object term432142;
     Object term432143;
     Object term432106;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431821 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term431913 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term432005 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term432097 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term432005, term432005.getClass(), "next", term432097);
        setIntField(term432005, term432005.getClass(), "type", 39);
        setField(term431913, term431913.getClass(), "first", term432005);
        setIntField(term431913, term431913.getClass(), "type", 22);
        term432142 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term432142, term432142.getClass(), "currentTraversal", null);
        term432143 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term432144 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term432145 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term432143, term432143.getClass(), "number", 0.0);
        setIntField(term432143, term432143.getClass(), "type", 22);
        setField(term432143, term432143.getClass(), "next", null);
        setDoubleField(term432144, term432144.getClass(), "number", 0.0);
        setIntField(term432144, term432144.getClass(), "type", 39);
        setDoubleField(term432145, term432145.getClass(), "number", 0.0);
        setIntField(term432145, term432145.getClass(), "type", 0);
        setField(term432145, term432145.getClass(), "next", null);
        setField(term432145, term432145.getClass(), "first", null);
        setField(term432145, term432145.getClass(), "last", null);
        setField(term432145, term432145.getClass(), "propListHead", null);
        setIntField(term432145, term432145.getClass(), "sourcePosition", 0);
        setField(term432145, term432145.getClass(), "jsType", null);
        setField(term432145, term432145.getClass(), "parent", null);
        setField(term432144, term432144.getClass(), "next", term432145);
        setField(term432144, term432144.getClass(), "first", null);
        setField(term432144, term432144.getClass(), "last", null);
        setField(term432144, term432144.getClass(), "propListHead", null);
        setIntField(term432144, term432144.getClass(), "sourcePosition", 0);
        setField(term432144, term432144.getClass(), "jsType", null);
        setField(term432144, term432144.getClass(), "parent", null);
        setField(term432143, term432143.getClass(), "first", term432144);
        setField(term432143, term432143.getClass(), "last", null);
        setField(term432143, term432143.getClass(), "propListHead", null);
        setIntField(term432143, term432143.getClass(), "sourcePosition", 0);
        setField(term432143, term432143.getClass(), "jsType", null);
        setField(term432143, term432143.getClass(), "parent", null);
        term432106 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term432109 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term432112 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term432106, term432106.getClass(), "number", 0.0);
        setIntField(term432106, term432106.getClass(), "type", 22);
        setField(term432106, term432106.getClass(), "next", null);
        setDoubleField(term432109, term432109.getClass(), "number", 0.0);
        setIntField(term432109, term432109.getClass(), "type", 39);
        setDoubleField(term432112, term432112.getClass(), "number", 0.0);
        setIntField(term432112, term432112.getClass(), "type", 0);
        setField(term432112, term432112.getClass(), "next", null);
        setField(term432112, term432112.getClass(), "first", null);
        setField(term432112, term432112.getClass(), "last", null);
        setField(term432112, term432112.getClass(), "propListHead", null);
        setIntField(term432112, term432112.getClass(), "sourcePosition", 0);
        setField(term432112, term432112.getClass(), "jsType", null);
        setField(term432112, term432112.getClass(), "parent", null);
        setField(term432109, term432109.getClass(), "next", term432112);
        setField(term432109, term432109.getClass(), "first", null);
        setField(term432109, term432109.getClass(), "last", null);
        setField(term432109, term432109.getClass(), "propListHead", null);
        setIntField(term432109, term432109.getClass(), "sourcePosition", 0);
        setField(term432109, term432109.getClass(), "jsType", null);
        setField(term432109, term432109.getClass(), "parent", null);
        setField(term432106, term432106.getClass(), "first", term432109);
        setField(term432106, term432106.getClass(), "last", null);
        setField(term432106, term432106.getClass(), "propListHead", null);
        setIntField(term432106, term432106.getClass(), "sourcePosition", 0);
        setField(term432106, term432106.getClass(), "jsType", null);
        setField(term432106, term432106.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term431913;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term431821, args);
        assertTrue(recursiveEquals(term431821, term432142));
        assertTrue(recursiveEquals(term431913, term432143));
        assertTrue(recursiveEquals(retValue, term432106));
    }

};


