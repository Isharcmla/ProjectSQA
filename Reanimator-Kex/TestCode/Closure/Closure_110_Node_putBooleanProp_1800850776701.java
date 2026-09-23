package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_putBooleanProp_1800850776701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67158;

    public Node_putBooleanProp_1800850776701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67260 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term67260, term67260.getClass(), "propType", 0);
        setField(term67158, term67158.getClass(), "propListHead", term67260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = -1;
        args[1] = false;
        callMethod(klass, "putBooleanProp", argTypes, term67158, args);
    }

};


