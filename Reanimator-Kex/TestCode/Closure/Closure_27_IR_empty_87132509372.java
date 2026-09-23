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

public class IR_empty_87132509372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2506;

    public IR_empty_87132509372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2506, term2506.getClass(), "type", 124);
        setField(term2506, term2506.getClass(), "next", null);
        setField(term2506, term2506.getClass(), "first", null);
        setField(term2506, term2506.getClass(), "last", null);
        setField(term2506, term2506.getClass(), "propListHead", null);
        setIntField(term2506, term2506.getClass(), "sourcePosition", -1);
        setField(term2506, term2506.getClass(), "jsType", null);
        setField(term2506, term2506.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "empty", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term2506));
    }

};


