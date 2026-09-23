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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121876;
     Object term121968;
     Object term122197;
     Object term122198;
     Object term122161;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121876 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term121968 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122060 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122152 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term122060, term122060.getClass(), "next", term122152);
        setIntField(term122060, term122060.getClass(), "type", 39);
        setField(term121968, term121968.getClass(), "first", term122060);
        setIntField(term121968, term121968.getClass(), "type", 20);
        term122197 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term122197, term122197.getClass(), "currentTraversal", null);
        term122198 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122199 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122200 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term122198, term122198.getClass(), "number", 0.0);
        setIntField(term122198, term122198.getClass(), "type", 20);
        setField(term122198, term122198.getClass(), "next", null);
        setDoubleField(term122199, term122199.getClass(), "number", 0.0);
        setIntField(term122199, term122199.getClass(), "type", 39);
        setDoubleField(term122200, term122200.getClass(), "number", 0.0);
        setIntField(term122200, term122200.getClass(), "type", 0);
        setField(term122200, term122200.getClass(), "next", null);
        setField(term122200, term122200.getClass(), "first", null);
        setField(term122200, term122200.getClass(), "last", null);
        setField(term122200, term122200.getClass(), "propListHead", null);
        setIntField(term122200, term122200.getClass(), "sourcePosition", 0);
        setField(term122200, term122200.getClass(), "jsType", null);
        setField(term122200, term122200.getClass(), "parent", null);
        setField(term122199, term122199.getClass(), "next", term122200);
        setField(term122199, term122199.getClass(), "first", null);
        setField(term122199, term122199.getClass(), "last", null);
        setField(term122199, term122199.getClass(), "propListHead", null);
        setIntField(term122199, term122199.getClass(), "sourcePosition", 0);
        setField(term122199, term122199.getClass(), "jsType", null);
        setField(term122199, term122199.getClass(), "parent", null);
        setField(term122198, term122198.getClass(), "first", term122199);
        setField(term122198, term122198.getClass(), "last", null);
        setField(term122198, term122198.getClass(), "propListHead", null);
        setIntField(term122198, term122198.getClass(), "sourcePosition", 0);
        setField(term122198, term122198.getClass(), "jsType", null);
        setField(term122198, term122198.getClass(), "parent", null);
        term122161 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122164 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term122161, term122161.getClass(), "number", 0.0);
        setIntField(term122161, term122161.getClass(), "type", 20);
        setField(term122161, term122161.getClass(), "next", null);
        setDoubleField(term122164, term122164.getClass(), "number", 0.0);
        setIntField(term122164, term122164.getClass(), "type", 39);
        setDoubleField(term122167, term122167.getClass(), "number", 0.0);
        setIntField(term122167, term122167.getClass(), "type", 0);
        setField(term122167, term122167.getClass(), "next", null);
        setField(term122167, term122167.getClass(), "first", null);
        setField(term122167, term122167.getClass(), "last", null);
        setField(term122167, term122167.getClass(), "propListHead", null);
        setIntField(term122167, term122167.getClass(), "sourcePosition", 0);
        setField(term122167, term122167.getClass(), "jsType", null);
        setField(term122167, term122167.getClass(), "parent", null);
        setField(term122164, term122164.getClass(), "next", term122167);
        setField(term122164, term122164.getClass(), "first", null);
        setField(term122164, term122164.getClass(), "last", null);
        setField(term122164, term122164.getClass(), "propListHead", null);
        setIntField(term122164, term122164.getClass(), "sourcePosition", 0);
        setField(term122164, term122164.getClass(), "jsType", null);
        setField(term122164, term122164.getClass(), "parent", null);
        setField(term122161, term122161.getClass(), "first", term122164);
        setField(term122161, term122161.getClass(), "last", null);
        setField(term122161, term122161.getClass(), "propListHead", null);
        setIntField(term122161, term122161.getClass(), "sourcePosition", 0);
        setField(term122161, term122161.getClass(), "jsType", null);
        setField(term122161, term122161.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term121968;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term121876, args);
        assertTrue(recursiveEquals(term121876, term122197));
        assertTrue(recursiveEquals(term121968, term122198));
        assertTrue(recursiveEquals(retValue, term122161));
    }

};


