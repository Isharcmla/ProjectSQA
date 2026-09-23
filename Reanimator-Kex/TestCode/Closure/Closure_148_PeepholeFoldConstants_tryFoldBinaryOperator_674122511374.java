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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75679;
     Object term75771;
     Object term75895;
     Object term75896;
     Object term75855;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75679 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term75771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75771, term75771.getClass(), "first", term75771);
        setField(term75771, term75771.getClass(), "next", term75841);
        setIntField(term75771, term75771.getClass(), "type", 14);
        term75895 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term75895, term75895.getClass(), "currentTraversal", null);
        term75896 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term75896, term75896.getClass(), "number", 0.0);
        setIntField(term75896, term75896.getClass(), "type", 14);
        setIntField(term75897, term75897.getClass(), "type", 0);
        setField(term75897, term75897.getClass(), "next", null);
        setField(term75897, term75897.getClass(), "first", null);
        setField(term75897, term75897.getClass(), "last", null);
        setField(term75897, term75897.getClass(), "propListHead", null);
        setIntField(term75897, term75897.getClass(), "sourcePosition", 0);
        setField(term75897, term75897.getClass(), "jsType", null);
        setField(term75897, term75897.getClass(), "parent", null);
        setField(term75896, term75896.getClass(), "next", term75897);
        setField(term75896, term75896.getClass(), "first", term75896);
        setField(term75896, term75896.getClass(), "last", null);
        setField(term75896, term75896.getClass(), "propListHead", null);
        setIntField(term75896, term75896.getClass(), "sourcePosition", 0);
        setField(term75896, term75896.getClass(), "jsType", null);
        setField(term75896, term75896.getClass(), "parent", null);
        term75855 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term75855, term75855.getClass(), "number", 0.0);
        setIntField(term75855, term75855.getClass(), "type", 14);
        setIntField(term75858, term75858.getClass(), "type", 0);
        setField(term75858, term75858.getClass(), "next", null);
        setField(term75858, term75858.getClass(), "first", null);
        setField(term75858, term75858.getClass(), "last", null);
        setField(term75858, term75858.getClass(), "propListHead", null);
        setIntField(term75858, term75858.getClass(), "sourcePosition", 0);
        setField(term75858, term75858.getClass(), "jsType", null);
        setField(term75858, term75858.getClass(), "parent", null);
        setField(term75855, term75855.getClass(), "next", term75858);
        setField(term75855, term75855.getClass(), "first", term75855);
        setField(term75855, term75855.getClass(), "last", null);
        setField(term75855, term75855.getClass(), "propListHead", null);
        setIntField(term75855, term75855.getClass(), "sourcePosition", 0);
        setField(term75855, term75855.getClass(), "jsType", null);
        setField(term75855, term75855.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term75771;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term75679, args);
        assertTrue(recursiveEquals(term75679, term75895));
        assertTrue(recursiveEquals(term75771, term75896));
        assertTrue(recursiveEquals(retValue, term75855));
    }

};


