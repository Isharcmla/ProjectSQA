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

public class Node_addChildAfter_1839212957514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41838;
     Object term41893;
     Object term41894;

    public Node_addChildAfter_1839212957514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term41838, term41838.getClass(), "next", null);
        term41893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41893, term41893.getClass(), "type", 0);
        setField(term41893, term41893.getClass(), "next", null);
        setField(term41893, term41893.getClass(), "first", term41893);
        setField(term41893, term41893.getClass(), "last", term41893);
        setField(term41893, term41893.getClass(), "propListHead", null);
        setIntField(term41893, term41893.getClass(), "sourcePosition", 0);
        setField(term41893, term41893.getClass(), "jsType", null);
        setField(term41893, term41893.getClass(), "parent", term41893);
        term41894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41894, term41894.getClass(), "type", 0);
        setField(term41894, term41894.getClass(), "next", null);
        setField(term41894, term41894.getClass(), "first", term41894);
        setField(term41894, term41894.getClass(), "last", term41894);
        setField(term41894, term41894.getClass(), "propListHead", null);
        setIntField(term41894, term41894.getClass(), "sourcePosition", 0);
        setField(term41894, term41894.getClass(), "jsType", null);
        setField(term41894, term41894.getClass(), "parent", term41894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term41838;
        args[1] = null;
        callMethod(klass, "addChildAfter", argTypes, term41838, args);
        assertTrue(recursiveEquals(term41838, term41893));
        assertTrue(recursiveEquals(term41838, term41894));
    }

};


