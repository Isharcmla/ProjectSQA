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

public class ArrowType_hashCode_152993979046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8280;

    public ArrowType_hashCode_152993979046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term8350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8444 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term8280, term8280.getClass(), "returnType", null);
        setBooleanField(term8280, term8280.getClass(), "returnTypeInferred", false);
        setField(term8350, term8350.getClass(), "first", term8350);
        setField(term8444, term8444.getClass(), "returnType", null);
        setBooleanField(term8444, term8444.getClass(), "returnTypeInferred", false);
        setField(term8444, term8444.getClass(), "parameters", term8350);
        setField(term8350, term8350.getClass(), "jsType", term8444);
        setField(term8280, term8280.getClass(), "parameters", term8350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8280, args);
    }

};


