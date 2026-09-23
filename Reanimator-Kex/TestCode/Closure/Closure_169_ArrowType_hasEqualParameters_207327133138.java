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

public class ArrowType_hasEqualParameters_207327133138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6051;
     Object term6285;

    public ArrowType_hasEqualParameters_207327133138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6051 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term6121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6121, term6121.getClass(), "first", term6191);
        setField(term6051, term6051.getClass(), "parameters", term6121);
        term6285 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term6355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6355, term6355.getClass(), "first", null);
        setField(term6285, term6285.getClass(), "parameters", term6355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term6285;
        args[1] = false;
        callMethod(klass, "hasEqualParameters", argTypes, term6051, args);
    }

};


