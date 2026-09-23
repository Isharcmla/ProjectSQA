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

public class ArrowType_hashCode_152993979052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10565;

    public ArrowType_hashCode_152993979052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term10565, term10565.getClass(), "returnType", null);
        setBooleanField(term10565, term10565.getClass(), "returnTypeInferred", false);
        setField(term10635, term10635.getClass(), "first", term10635);
        setField(term10729, term10729.getClass(), "returnType", null);
        setBooleanField(term10729, term10729.getClass(), "returnTypeInferred", false);
        setField(term10729, term10729.getClass(), "parameters", null);
        setField(term10635, term10635.getClass(), "jsType", term10729);
        setField(term10635, term10635.getClass(), "next", term10635);
        setField(term10565, term10565.getClass(), "parameters", term10635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10565, args);
    }

};


