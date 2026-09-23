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

public class ArrowType_hasEqualParameters_90704292549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9327;
     Object term9561;

    public ArrowType_hasEqualParameters_90704292549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term9467, term9467.getClass(), "jsType", null);
        setField(term9397, term9397.getClass(), "first", term9467);
        setField(term9327, term9327.getClass(), "parameters", term9397);
        term9561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term9701, term9701.getClass(), "jsType", term9795);
        setField(term9631, term9631.getClass(), "first", term9701);
        setField(term9561, term9561.getClass(), "parameters", term9631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Object[] args = new Object[1];
        args[0] = term9561;
        callMethod(klass, "hasEqualParameters", argTypes, term9327, args);
    }

};


