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

public class ArrowType_hasEqualParameters_90704292537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5947;
     Object term6391;

    public ArrowType_hasEqualParameters_90704292537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term6017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6461, term6461.getClass(), "jsType", null);
        setField(term6461, term6461.getClass(), "next", term6496);
        setField(term6426, term6426.getClass(), "first", term6461);
        setField(term6426, term6426.getClass(), "jsType", null);
        setField(term6426, term6426.getClass(), "next", term6531);
        setField(term6017, term6017.getClass(), "first", term6426);
        setField(term5947, term5947.getClass(), "parameters", term6017);
        term6391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term6391, term6391.getClass(), "parameters", term6426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Object[] args = new Object[1];
        args[0] = term6391;
        callMethod(klass, "hasEqualParameters", argTypes, term5947, args);
    }

};


