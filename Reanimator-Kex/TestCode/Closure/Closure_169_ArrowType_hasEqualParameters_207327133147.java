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

public class ArrowType_hasEqualParameters_207327133147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8520;
     Object term8918;

    public ArrowType_hasEqualParameters_207327133147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term8590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term8988, term8988.getClass(), "jsType", term9035);
        setField(term8953, term8953.getClass(), "first", term8988);
        setField(term8953, term8953.getClass(), "jsType", term9035);
        setField(term8590, term8590.getClass(), "first", term8953);
        setField(term8520, term8520.getClass(), "parameters", term8590);
        term8918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term8918, term8918.getClass(), "parameters", term8953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term8918;
        args[1] = false;
        callMethod(klass, "hasEqualParameters", argTypes, term8520, args);
    }

};


