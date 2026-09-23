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

public class Node_setSideEffectFlags_1752079817801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90443;
     Object term90647;

    public Node_setSideEffectFlags_1752079817801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90545 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term90443, term90443.getClass(), "type", 30);
        setField(term90443, term90443.getClass(), "propListHead", term90545);
        term90647 = newInstance(Class.forName("com.google.javascript.rhino.Node$SideEffectFlags"));
        setIntField(term90647, term90647.getClass(), "value", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node$SideEffectFlags");
        Object[] args = new Object[1];
        args[0] = term90647;
        callMethod(klass, "setSideEffectFlags", argTypes, term90443, args);
    }

};


