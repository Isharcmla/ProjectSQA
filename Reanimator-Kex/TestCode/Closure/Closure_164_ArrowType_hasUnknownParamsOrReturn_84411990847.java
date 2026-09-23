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

public class ArrowType_hasUnknownParamsOrReturn_84411990847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8556;

    public ArrowType_hasUnknownParamsOrReturn_84411990847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term8626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term8696, term8696.getClass(), "jsType", term8790);
        setField(term8626, term8626.getClass(), "first", term8696);
        setField(term8556, term8556.getClass(), "parameters", term8626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasUnknownParamsOrReturn", argTypes, term8556, args);
    }

};


