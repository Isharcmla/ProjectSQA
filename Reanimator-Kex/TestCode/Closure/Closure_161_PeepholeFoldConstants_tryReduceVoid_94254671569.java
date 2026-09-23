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

public class PeepholeFoldConstants_tryReduceVoid_94254671569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11091;
     Object term11251;
     Object term11352;
     Object term11354;
     Object term11325;

    public PeepholeFoldConstants_tryReduceVoid_94254671569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11091 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term11181 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term11181, term11181.getClass(), "compiler", null);
        setField(term11091, term11091.getClass(), "currentTraversal", term11181);
        term11251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11321, term11321.getClass(), "type", 117);
        setField(term11251, term11251.getClass(), "first", term11321);
        setIntField(term11251, term11251.getClass(), "type", 117);
        term11352 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term11353 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term11353, term11353.getClass(), "compiler", null);
        setField(term11353, term11353.getClass(), "callback", null);
        setField(term11353, term11353.getClass(), "curNode", null);
        setField(term11353, term11353.getClass(), "scopes", null);
        setField(term11353, term11353.getClass(), "scopeRoots", null);
        setField(term11353, term11353.getClass(), "cfgs", null);
        setField(term11353, term11353.getClass(), "sourceName", null);
        setField(term11353, term11353.getClass(), "scopeCreator", null);
        setField(term11353, term11353.getClass(), "scopeCallback", null);
        setField(term11352, term11352.getClass(), "currentTraversal", term11353);
        term11354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11354, term11354.getClass(), "type", 117);
        setField(term11354, term11354.getClass(), "next", null);
        setIntField(term11355, term11355.getClass(), "type", 117);
        setField(term11355, term11355.getClass(), "next", null);
        setField(term11355, term11355.getClass(), "first", null);
        setField(term11355, term11355.getClass(), "last", null);
        setField(term11355, term11355.getClass(), "propListHead", null);
        setIntField(term11355, term11355.getClass(), "sourcePosition", 0);
        setField(term11355, term11355.getClass(), "jsType", null);
        setField(term11355, term11355.getClass(), "parent", null);
        setField(term11354, term11354.getClass(), "first", term11355);
        setField(term11354, term11354.getClass(), "last", null);
        setField(term11354, term11354.getClass(), "propListHead", null);
        setIntField(term11354, term11354.getClass(), "sourcePosition", 0);
        setField(term11354, term11354.getClass(), "jsType", null);
        setField(term11354, term11354.getClass(), "parent", null);
        term11325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11325, term11325.getClass(), "type", 117);
        setField(term11325, term11325.getClass(), "next", null);
        setIntField(term11327, term11327.getClass(), "type", 117);
        setField(term11327, term11327.getClass(), "next", null);
        setField(term11327, term11327.getClass(), "first", null);
        setField(term11327, term11327.getClass(), "last", null);
        setField(term11327, term11327.getClass(), "propListHead", null);
        setIntField(term11327, term11327.getClass(), "sourcePosition", 0);
        setField(term11327, term11327.getClass(), "jsType", null);
        setField(term11327, term11327.getClass(), "parent", null);
        setField(term11325, term11325.getClass(), "first", term11327);
        setField(term11325, term11325.getClass(), "last", null);
        setField(term11325, term11325.getClass(), "propListHead", null);
        setIntField(term11325, term11325.getClass(), "sourcePosition", 0);
        setField(term11325, term11325.getClass(), "jsType", null);
        setField(term11325, term11325.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term11251;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term11091, args);
        assertTrue(recursiveEquals(term11091, term11352));
        assertTrue(recursiveEquals(term11251, term11354));
        assertTrue(recursiveEquals(retValue, term11325));
    }

};


