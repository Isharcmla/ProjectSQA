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
import static com.google.javascript.rhino.EqualityUtils.*;

public class IR_mayBeExpressionOrEmpty_1141310474272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35720;
     Object term36343;

    public IR_mayBeExpressionOrEmpty_1141310474272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35720, term35720.getClass(), "type", 74);
        term36343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36343, term36343.getClass(), "type", 74);
        setField(term36343, term36343.getClass(), "next", null);
        setField(term36343, term36343.getClass(), "first", null);
        setField(term36343, term36343.getClass(), "last", null);
        setField(term36343, term36343.getClass(), "propListHead", null);
        setIntField(term36343, term36343.getClass(), "sourcePosition", 0);
        setField(term36343, term36343.getClass(), "jsType", null);
        setField(term36343, term36343.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35720;
        Object retValue = callMethod(klass, "mayBeExpressionOrEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term35720, term36343));
        assertTrue(recursiveEquals(retValue, false));
    }

};


