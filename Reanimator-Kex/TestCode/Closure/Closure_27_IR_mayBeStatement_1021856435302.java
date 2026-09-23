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

public class IR_mayBeStatement_1021856435302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40639;
     Object term40725;

    public IR_mayBeStatement_1021856435302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40639, term40639.getClass(), "type", 152);
        term40725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40725, term40725.getClass(), "type", 152);
        setField(term40725, term40725.getClass(), "next", null);
        setField(term40725, term40725.getClass(), "first", null);
        setField(term40725, term40725.getClass(), "last", null);
        setField(term40725, term40725.getClass(), "propListHead", null);
        setIntField(term40725, term40725.getClass(), "sourcePosition", 0);
        setField(term40725, term40725.getClass(), "jsType", null);
        setField(term40725, term40725.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40639;
        Object retValue = callMethod(klass, "mayBeStatement", argTypes, null, args);
        assertTrue(recursiveEquals(term40639, term40725));
        assertTrue(recursiveEquals(retValue, true));
    }

};


