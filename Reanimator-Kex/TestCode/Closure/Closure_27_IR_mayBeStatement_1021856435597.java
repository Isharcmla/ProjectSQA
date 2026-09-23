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

public class IR_mayBeStatement_1021856435597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89019;
     Object term89548;

    public IR_mayBeStatement_1021856435597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89019, term89019.getClass(), "type", 124);
        term89548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89548, term89548.getClass(), "type", 124);
        setField(term89548, term89548.getClass(), "next", null);
        setField(term89548, term89548.getClass(), "first", null);
        setField(term89548, term89548.getClass(), "last", null);
        setField(term89548, term89548.getClass(), "propListHead", null);
        setIntField(term89548, term89548.getClass(), "sourcePosition", 0);
        setField(term89548, term89548.getClass(), "jsType", null);
        setField(term89548, term89548.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term89019;
        Object retValue = callMethod(klass, "mayBeStatement", argTypes, null, args);
        assertTrue(recursiveEquals(term89019, term89548));
        assertTrue(recursiveEquals(retValue, true));
    }

};


