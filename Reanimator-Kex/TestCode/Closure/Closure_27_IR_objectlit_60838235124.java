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

public class IR_objectlit_60838235124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2101;
     Object term15208;
     Object term15202;

    public IR_objectlit_60838235124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2101 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term15208 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term15202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15202, term15202.getClass(), "type", 64);
        setField(term15202, term15202.getClass(), "next", null);
        setField(term15202, term15202.getClass(), "first", null);
        setField(term15202, term15202.getClass(), "last", null);
        setField(term15202, term15202.getClass(), "propListHead", null);
        setIntField(term15202, term15202.getClass(), "sourcePosition", -1);
        setField(term15202, term15202.getClass(), "jsType", null);
        setField(term15202, term15202.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2101;
        Object retValue = callMethod(klass, "objectlit", argTypes, null, args);
        assertTrue(recursiveEquals(term2101, term15208));
        assertTrue(recursiveEquals(retValue, term15202));
    }

};


