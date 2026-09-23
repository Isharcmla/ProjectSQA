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

public class IR_not_1431350902311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41842;
     Object term42011;
     Object term41929;

    public IR_not_1431350902311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41842, term41842.getClass(), "type", 30);
        term42011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42011, term42011.getClass(), "type", 30);
        setField(term42011, term42011.getClass(), "next", null);
        setField(term42011, term42011.getClass(), "first", null);
        setField(term42011, term42011.getClass(), "last", null);
        setField(term42011, term42011.getClass(), "propListHead", null);
        setIntField(term42011, term42011.getClass(), "sourcePosition", 0);
        setField(term42011, term42011.getClass(), "jsType", null);
        setIntField(term42012, term42012.getClass(), "type", 26);
        setField(term42012, term42012.getClass(), "next", null);
        setField(term42012, term42012.getClass(), "first", term42011);
        setField(term42012, term42012.getClass(), "last", term42011);
        setField(term42012, term42012.getClass(), "propListHead", null);
        setIntField(term42012, term42012.getClass(), "sourcePosition", -1);
        setField(term42012, term42012.getClass(), "jsType", null);
        setField(term42012, term42012.getClass(), "parent", null);
        setField(term42011, term42011.getClass(), "parent", term42012);
        term41929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41929, term41929.getClass(), "type", 26);
        setField(term41929, term41929.getClass(), "next", null);
        setIntField(term41926, term41926.getClass(), "type", 30);
        setField(term41926, term41926.getClass(), "next", null);
        setField(term41926, term41926.getClass(), "first", null);
        setField(term41926, term41926.getClass(), "last", null);
        setField(term41926, term41926.getClass(), "propListHead", null);
        setIntField(term41926, term41926.getClass(), "sourcePosition", 0);
        setField(term41926, term41926.getClass(), "jsType", null);
        setField(term41926, term41926.getClass(), "parent", term41929);
        setField(term41929, term41929.getClass(), "first", term41926);
        setField(term41929, term41929.getClass(), "last", term41926);
        setField(term41929, term41929.getClass(), "propListHead", null);
        setIntField(term41929, term41929.getClass(), "sourcePosition", -1);
        setField(term41929, term41929.getClass(), "jsType", null);
        setField(term41929, term41929.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41842;
        Object retValue = callMethod(klass, "not", argTypes, null, args);
        assertTrue(recursiveEquals(term41842, term42011));
        assertTrue(recursiveEquals(retValue, term41929));
    }

};


