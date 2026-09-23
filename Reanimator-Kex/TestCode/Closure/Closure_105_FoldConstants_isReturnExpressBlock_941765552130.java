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

public class FoldConstants_isReturnExpressBlock_941765552130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20611;
     Object term20681;
     Object term30529;
     Object term30530;

    public FoldConstants_isReturnExpressBlock_941765552130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20611 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term20681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20681, term20681.getClass(), "type", 125);
        term30529 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term30529, term30529.getClass(), "compiler", null);
        term30530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30530, term30530.getClass(), "type", 125);
        setField(term30530, term30530.getClass(), "next", null);
        setField(term30530, term30530.getClass(), "first", null);
        setField(term30530, term30530.getClass(), "last", null);
        setField(term30530, term30530.getClass(), "propListHead", null);
        setIntField(term30530, term30530.getClass(), "sourcePosition", 0);
        setField(term30530, term30530.getClass(), "jsType", null);
        setField(term30530, term30530.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20681;
        callMethod(klass, "isReturnExpressBlock", argTypes, term20611, args);
        assertTrue(recursiveEquals(term20611, term30529));
        assertTrue(recursiveEquals(term20681, term30530));
    }

};


