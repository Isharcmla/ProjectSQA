package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class NodeUtil_getStringValue_242131640487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41886;
     Object term41907;

    public NodeUtil_getStringValue_242131640487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41886, term41886.getClass(), "type", 43);
        term41907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41907, term41907.getClass(), "type", 43);
        setField(term41907, term41907.getClass(), "next", null);
        setField(term41907, term41907.getClass(), "first", null);
        setField(term41907, term41907.getClass(), "last", null);
        setField(term41907, term41907.getClass(), "propListHead", null);
        setIntField(term41907, term41907.getClass(), "sourcePosition", 0);
        setField(term41907, term41907.getClass(), "jsType", null);
        setField(term41907, term41907.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41886;
        Object retValue = callMethod(klass, "getStringValue", argTypes, null, args);
        assertTrue(recursiveEquals(term41886, term41907));
        assertTrue(recursiveEquals(retValue, "false"));
    }

};


