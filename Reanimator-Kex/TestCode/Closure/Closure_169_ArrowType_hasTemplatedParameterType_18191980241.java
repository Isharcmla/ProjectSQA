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

public class ArrowType_hasTemplatedParameterType_18191980241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7012;

    public ArrowType_hasTemplatedParameterType_18191980241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7012 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term7082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term7152, term7152.getClass(), "jsType", term7246);
        setField(term7082, term7082.getClass(), "first", term7152);
        setField(term7012, term7012.getClass(), "parameters", term7082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTemplatedParameterType", argTypes, term7012, args);
    }

};


