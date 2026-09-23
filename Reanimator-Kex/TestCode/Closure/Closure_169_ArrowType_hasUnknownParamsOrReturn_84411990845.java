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

public class ArrowType_hasUnknownParamsOrReturn_84411990845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8059;

    public ArrowType_hasUnknownParamsOrReturn_84411990845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term8129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8293 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term8199, term8199.getClass(), "jsType", term8293);
        setField(term8129, term8129.getClass(), "first", term8199);
        setField(term8059, term8059.getClass(), "parameters", term8129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasUnknownParamsOrReturn", argTypes, term8059, args);
    }

};


