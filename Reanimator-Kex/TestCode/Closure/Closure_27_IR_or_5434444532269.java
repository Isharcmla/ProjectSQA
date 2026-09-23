package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_or_5434444532269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412147;
     Object term412673;
     Object term412675;
     Object term412492;

    public IR_or_5434444532269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term412147, term412147.getClass(), "type", 90);
        term412673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term412673, term412673.getClass(), "type", 90);
        setField(term412673, term412673.getClass(), "next", null);
        setField(term412673, term412673.getClass(), "first", null);
        setField(term412673, term412673.getClass(), "last", null);
        setField(term412673, term412673.getClass(), "propListHead", null);
        setIntField(term412673, term412673.getClass(), "sourcePosition", 0);
        setField(term412673, term412673.getClass(), "jsType", null);
        setIntField(term412674, term412674.getClass(), "type", 100);
        setField(term412674, term412674.getClass(), "next", null);
        setField(term412674, term412674.getClass(), "first", term412673);
        setField(term412674, term412674.getClass(), "last", term412673);
        setField(term412674, term412674.getClass(), "propListHead", null);
        setIntField(term412674, term412674.getClass(), "sourcePosition", -1);
        setField(term412674, term412674.getClass(), "jsType", null);
        setField(term412674, term412674.getClass(), "parent", null);
        setField(term412673, term412673.getClass(), "parent", term412674);
        term412675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term412675, term412675.getClass(), "type", 90);
        setField(term412675, term412675.getClass(), "next", null);
        setField(term412675, term412675.getClass(), "first", null);
        setField(term412675, term412675.getClass(), "last", null);
        setField(term412675, term412675.getClass(), "propListHead", null);
        setIntField(term412675, term412675.getClass(), "sourcePosition", 0);
        setField(term412675, term412675.getClass(), "jsType", null);
        setIntField(term412676, term412676.getClass(), "type", 100);
        setField(term412676, term412676.getClass(), "next", null);
        setField(term412676, term412676.getClass(), "first", term412675);
        setField(term412676, term412676.getClass(), "last", term412675);
        setField(term412676, term412676.getClass(), "propListHead", null);
        setIntField(term412676, term412676.getClass(), "sourcePosition", -1);
        setField(term412676, term412676.getClass(), "jsType", null);
        setField(term412676, term412676.getClass(), "parent", null);
        setField(term412675, term412675.getClass(), "parent", term412676);
        term412492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term412492, term412492.getClass(), "type", 100);
        setField(term412492, term412492.getClass(), "next", null);
        setIntField(term412489, term412489.getClass(), "type", 90);
        setField(term412489, term412489.getClass(), "next", null);
        setField(term412489, term412489.getClass(), "first", null);
        setField(term412489, term412489.getClass(), "last", null);
        setField(term412489, term412489.getClass(), "propListHead", null);
        setIntField(term412489, term412489.getClass(), "sourcePosition", 0);
        setField(term412489, term412489.getClass(), "jsType", null);
        setField(term412489, term412489.getClass(), "parent", term412492);
        setField(term412492, term412492.getClass(), "first", term412489);
        setField(term412492, term412492.getClass(), "last", term412489);
        setField(term412492, term412492.getClass(), "propListHead", null);
        setIntField(term412492, term412492.getClass(), "sourcePosition", -1);
        setField(term412492, term412492.getClass(), "jsType", null);
        setField(term412492, term412492.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term412147;
        args[1] = term412147;
        Object retValue = callMethod(klass, "or", argTypes, null, args);
        assertTrue(recursiveEquals(term412147, term412673));
        assertTrue(recursiveEquals(term412147, term412675));
        assertTrue(recursiveEquals(retValue, term412492));
    }

};


