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

public class ArrowType_hasEqualParameters_207327133153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11422;
     Object term11586;

    public ArrowType_hasEqualParameters_207327133153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11492, term11492.getClass(), "first", null);
        setField(term11422, term11422.getClass(), "parameters", term11492);
        term11586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11656, term11656.getClass(), "first", term11726);
        setField(term11586, term11586.getClass(), "parameters", term11656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term11586;
        args[1] = false;
        callMethod(klass, "hasEqualParameters", argTypes, term11422, args);
    }

};


