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

public class ArrowType_hasEqualParameters_207327133161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13384;
     Object term13760;

    public ArrowType_hasEqualParameters_207327133161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term13476 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term13568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term13666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term13568, term13568.getClass(), "jsType", term13666);
        setField(term13476, term13476.getClass(), "first", term13568);
        setField(term13384, term13384.getClass(), "parameters", term13476);
        term13760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term13852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term13944 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term13852, term13852.getClass(), "first", term13944);
        setField(term13760, term13760.getClass(), "parameters", term13852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term13760;
        args[1] = false;
        callMethod(klass, "hasEqualParameters", argTypes, term13384, args);
    }

};


