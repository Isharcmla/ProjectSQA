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

public class ArrowType_hasEqualParameters_90704292561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14039;
     Object term14317;

    public ArrowType_hasEqualParameters_90704292561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term14363 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term14409 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term14363, term14363.getClass(), "first", term14409);
        setField(term14039, term14039.getClass(), "parameters", term14363);
        term14317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term14317, term14317.getClass(), "parameters", term14363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Object[] args = new Object[1];
        args[0] = term14317;
        callMethod(klass, "hasEqualParameters", argTypes, term14039, args);
    }

};


