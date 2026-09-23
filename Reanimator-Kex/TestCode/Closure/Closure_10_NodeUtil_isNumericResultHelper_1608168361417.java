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

public class NodeUtil_isNumericResultHelper_1608168361417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51881;
     Object term51890;

    public NodeUtil_isNumericResultHelper_1608168361417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51881, term51881.getClass(), "type", 25);
        term51890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51890, term51890.getClass(), "type", 25);
        setField(term51890, term51890.getClass(), "next", null);
        setField(term51890, term51890.getClass(), "first", null);
        setField(term51890, term51890.getClass(), "last", null);
        setField(term51890, term51890.getClass(), "propListHead", null);
        setIntField(term51890, term51890.getClass(), "sourcePosition", 0);
        setField(term51890, term51890.getClass(), "jsType", null);
        setField(term51890, term51890.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51881;
        Object retValue = callMethod(klass, "isNumericResultHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term51881, term51890));
        assertTrue(recursiveEquals(retValue, true));
    }

};


