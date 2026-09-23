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
import java.util.LinkedList;

public class IR_paramList_917233657146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17409;
     Object term17563;
     Object term17557;

    public IR_paramList_917233657146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17409 = new LinkedList();
        term17563 = new LinkedList();
        term17557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17557, term17557.getClass(), "type", 83);
        setField(term17557, term17557.getClass(), "next", null);
        setField(term17557, term17557.getClass(), "first", null);
        setField(term17557, term17557.getClass(), "last", null);
        setField(term17557, term17557.getClass(), "propListHead", null);
        setIntField(term17557, term17557.getClass(), "sourcePosition", -1);
        setField(term17557, term17557.getClass(), "jsType", null);
        setField(term17557, term17557.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term17409;
        Object retValue = callMethod(klass, "paramList", argTypes, null, args);
        assertTrue(recursiveEquals(term17409, term17563));
        assertTrue(recursiveEquals(retValue, term17557));
    }

};


