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

public class IR_pos_1433196983277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36504;
     Object term36930;
     Object term36848;

    public IR_pos_1433196983277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36504, term36504.getClass(), "type", 23);
        term36930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36930, term36930.getClass(), "type", 23);
        setField(term36930, term36930.getClass(), "next", null);
        setField(term36930, term36930.getClass(), "first", null);
        setField(term36930, term36930.getClass(), "last", null);
        setField(term36930, term36930.getClass(), "propListHead", null);
        setIntField(term36930, term36930.getClass(), "sourcePosition", 0);
        setField(term36930, term36930.getClass(), "jsType", null);
        setIntField(term36931, term36931.getClass(), "type", 28);
        setField(term36931, term36931.getClass(), "next", null);
        setField(term36931, term36931.getClass(), "first", term36930);
        setField(term36931, term36931.getClass(), "last", term36930);
        setField(term36931, term36931.getClass(), "propListHead", null);
        setIntField(term36931, term36931.getClass(), "sourcePosition", -1);
        setField(term36931, term36931.getClass(), "jsType", null);
        setField(term36931, term36931.getClass(), "parent", null);
        setField(term36930, term36930.getClass(), "parent", term36931);
        term36848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36848, term36848.getClass(), "type", 28);
        setField(term36848, term36848.getClass(), "next", null);
        setIntField(term36845, term36845.getClass(), "type", 23);
        setField(term36845, term36845.getClass(), "next", null);
        setField(term36845, term36845.getClass(), "first", null);
        setField(term36845, term36845.getClass(), "last", null);
        setField(term36845, term36845.getClass(), "propListHead", null);
        setIntField(term36845, term36845.getClass(), "sourcePosition", 0);
        setField(term36845, term36845.getClass(), "jsType", null);
        setField(term36845, term36845.getClass(), "parent", term36848);
        setField(term36848, term36848.getClass(), "first", term36845);
        setField(term36848, term36848.getClass(), "last", term36845);
        setField(term36848, term36848.getClass(), "propListHead", null);
        setIntField(term36848, term36848.getClass(), "sourcePosition", -1);
        setField(term36848, term36848.getClass(), "jsType", null);
        setField(term36848, term36848.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36504;
        Object retValue = callMethod(klass, "pos", argTypes, null, args);
        assertTrue(recursiveEquals(term36504, term36930));
        assertTrue(recursiveEquals(retValue, term36848));
    }

};


