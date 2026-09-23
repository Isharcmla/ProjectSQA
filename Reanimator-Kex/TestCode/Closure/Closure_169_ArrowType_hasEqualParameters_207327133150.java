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

public class ArrowType_hasEqualParameters_207327133150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10119;
     Object term10563;

    public ArrowType_hasEqualParameters_207327133150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10119 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term10633, term10633.getClass(), "jsType", null);
        setField(term10633, term10633.getClass(), "next", term10668);
        setField(term10598, term10598.getClass(), "first", term10633);
        setField(term10598, term10598.getClass(), "jsType", null);
        setField(term10598, term10598.getClass(), "next", term10703);
        setField(term10189, term10189.getClass(), "first", term10598);
        setField(term10119, term10119.getClass(), "parameters", term10189);
        term10563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term10563, term10563.getClass(), "parameters", term10598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term10563;
        args[1] = false;
        callMethod(klass, "hasEqualParameters", argTypes, term10119, args);
    }

};


