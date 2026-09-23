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

public class ArrowType_hasUnknownParamsOrReturn_84411990865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14847;

    public ArrowType_hasUnknownParamsOrReturn_84411990865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term14939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term15031 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term14939, term14939.getClass(), "first", term15031);
        setField(term14847, term14847.getClass(), "parameters", term14939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasUnknownParamsOrReturn", argTypes, term14847, args);
    }

};


