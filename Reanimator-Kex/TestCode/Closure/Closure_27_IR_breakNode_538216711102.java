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

public class IR_breakNode_538216711102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9552;

    public IR_breakNode_538216711102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9552, term9552.getClass(), "type", 116);
        setField(term9552, term9552.getClass(), "next", null);
        setField(term9552, term9552.getClass(), "first", null);
        setField(term9552, term9552.getClass(), "last", null);
        setField(term9552, term9552.getClass(), "propListHead", null);
        setIntField(term9552, term9552.getClass(), "sourcePosition", -1);
        setField(term9552, term9552.getClass(), "jsType", null);
        setField(term9552, term9552.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "breakNode", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term9552));
    }

};


