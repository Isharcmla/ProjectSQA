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

public class ArrowType_hasTemplatedParameterType_18191980262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14053;

    public ArrowType_hasTemplatedParameterType_18191980262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14053 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term14145 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term14237 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term14145, term14145.getClass(), "first", term14237);
        setField(term14053, term14053.getClass(), "parameters", term14145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTemplatedParameterType", argTypes, term14053, args);
    }

};


