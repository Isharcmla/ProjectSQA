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

public class IR_block_130490411280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189;
     Object term3956;
     Object term3950;

    public IR_block_130490411280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term3956 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term3950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3950, term3950.getClass(), "type", 125);
        setField(term3950, term3950.getClass(), "next", null);
        setField(term3950, term3950.getClass(), "first", null);
        setField(term3950, term3950.getClass(), "last", null);
        setField(term3950, term3950.getClass(), "propListHead", null);
        setIntField(term3950, term3950.getClass(), "sourcePosition", -1);
        setField(term3950, term3950.getClass(), "jsType", null);
        setField(term3950, term3950.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term189;
        Object retValue = callMethod(klass, "block", argTypes, null, args);
        assertTrue(recursiveEquals(term189, term3956));
        assertTrue(recursiveEquals(retValue, term3950));
    }

};


