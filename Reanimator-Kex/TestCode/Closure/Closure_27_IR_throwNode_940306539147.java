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

public class IR_throwNode_940306539147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17541;
     Object term17644;
     Object term17568;

    public IR_throwNode_940306539147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17541, term17541.getClass(), "type", 39);
        term17644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17644, term17644.getClass(), "type", 39);
        setField(term17644, term17644.getClass(), "next", null);
        setField(term17644, term17644.getClass(), "first", null);
        setField(term17644, term17644.getClass(), "last", null);
        setField(term17644, term17644.getClass(), "propListHead", null);
        setIntField(term17644, term17644.getClass(), "sourcePosition", 0);
        setField(term17644, term17644.getClass(), "jsType", null);
        setIntField(term17645, term17645.getClass(), "type", 49);
        setField(term17645, term17645.getClass(), "next", null);
        setField(term17645, term17645.getClass(), "first", term17644);
        setField(term17645, term17645.getClass(), "last", term17644);
        setField(term17645, term17645.getClass(), "propListHead", null);
        setIntField(term17645, term17645.getClass(), "sourcePosition", -1);
        setField(term17645, term17645.getClass(), "jsType", null);
        setField(term17645, term17645.getClass(), "parent", null);
        setField(term17644, term17644.getClass(), "parent", term17645);
        term17568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17568, term17568.getClass(), "type", 49);
        setField(term17568, term17568.getClass(), "next", null);
        setIntField(term17565, term17565.getClass(), "type", 39);
        setField(term17565, term17565.getClass(), "next", null);
        setField(term17565, term17565.getClass(), "first", null);
        setField(term17565, term17565.getClass(), "last", null);
        setField(term17565, term17565.getClass(), "propListHead", null);
        setIntField(term17565, term17565.getClass(), "sourcePosition", 0);
        setField(term17565, term17565.getClass(), "jsType", null);
        setField(term17565, term17565.getClass(), "parent", term17568);
        setField(term17568, term17568.getClass(), "first", term17565);
        setField(term17568, term17568.getClass(), "last", term17565);
        setField(term17568, term17568.getClass(), "propListHead", null);
        setIntField(term17568, term17568.getClass(), "sourcePosition", -1);
        setField(term17568, term17568.getClass(), "jsType", null);
        setField(term17568, term17568.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17541;
        Object retValue = callMethod(klass, "throwNode", argTypes, null, args);
        assertTrue(recursiveEquals(term17541, term17644));
        assertTrue(recursiveEquals(retValue, term17568));
    }

};


