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

public class NodeUtil_isNumericResult_476998665340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30654;
     Object term30749;

    public NodeUtil_isNumericResult_476998665340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30654, term30654.getClass(), "type", 20);
        term30749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30749, term30749.getClass(), "type", 20);
        setField(term30749, term30749.getClass(), "next", null);
        setField(term30749, term30749.getClass(), "first", null);
        setField(term30749, term30749.getClass(), "last", null);
        setField(term30749, term30749.getClass(), "propListHead", null);
        setIntField(term30749, term30749.getClass(), "sourcePosition", 0);
        setField(term30749, term30749.getClass(), "jsType", null);
        setField(term30749, term30749.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30654;
        callMethod(klass, "isNumericResult", argTypes, null, args);
        assertTrue(recursiveEquals(term30654, term30749));
    }

};


