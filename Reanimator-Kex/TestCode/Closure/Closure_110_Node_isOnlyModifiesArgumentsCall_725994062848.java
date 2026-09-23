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

public class Node_isOnlyModifiesArgumentsCall_725994062848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97320;

    public Node_isOnlyModifiesArgumentsCall_725994062848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97422 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term97524 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term97422, term97422.getClass(), "propType", -43);
        setField(term97422, term97422.getClass(), "next", term97524);
        setField(term97320, term97320.getClass(), "propListHead", term97422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOnlyModifiesArgumentsCall", argTypes, term97320, args);
    }

};


