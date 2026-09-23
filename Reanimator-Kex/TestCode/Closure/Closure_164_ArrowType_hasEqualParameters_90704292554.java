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

public class ArrowType_hasEqualParameters_90704292554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11205;
     Object term11603;

    public ArrowType_hasEqualParameters_90704292554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term11673, term11673.getClass(), "jsType", term11720);
        setField(term11638, term11638.getClass(), "first", term11673);
        setField(term11638, term11638.getClass(), "jsType", term11720);
        setField(term11275, term11275.getClass(), "first", term11638);
        setField(term11205, term11205.getClass(), "parameters", term11275);
        term11603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term11603, term11603.getClass(), "parameters", term11638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Object[] args = new Object[1];
        args[0] = term11603;
        callMethod(klass, "hasEqualParameters", argTypes, term11205, args);
    }

};


