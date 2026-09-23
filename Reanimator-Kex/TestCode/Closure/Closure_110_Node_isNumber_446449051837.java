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

public class Node_isNumber_446449051837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56159;
     Object term96561;

    public Node_isNumber_446449051837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56159, term56159.getClass(), "type", 39);
        term96561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term96561, term96561.getClass(), "type", 39);
        setField(term96561, term96561.getClass(), "next", null);
        setField(term96561, term96561.getClass(), "first", null);
        setField(term96561, term96561.getClass(), "last", null);
        setField(term96561, term96561.getClass(), "propListHead", null);
        setIntField(term96561, term96561.getClass(), "sourcePosition", 0);
        setField(term96561, term96561.getClass(), "jsType", null);
        setField(term96561, term96561.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNumber", argTypes, term56159, args);
        assertTrue(recursiveEquals(term56159, term96561));
        assertTrue(recursiveEquals(retValue, true));
    }

};


