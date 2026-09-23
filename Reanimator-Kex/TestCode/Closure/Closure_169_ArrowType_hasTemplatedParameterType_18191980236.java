package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrowType_hasTemplatedParameterType_18191980236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5556;

    public ArrowType_hasTemplatedParameterType_18191980236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term5626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5626, term5626.getClass(), "first", term5626);
        setField(term5626, term5626.getClass(), "jsType", null);
        setField(term5626, term5626.getClass(), "next", term5626);
        setField(term5556, term5556.getClass(), "parameters", term5626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTemplatedParameterType", argTypes, term5556, args);
    }

};


