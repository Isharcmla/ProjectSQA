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

public class NodeUtil_isLiteralValue_214218539606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53895;
     Object term53983;

    public NodeUtil_isLiteralValue_214218539606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53895, term53895.getClass(), "type", 47);
        term53983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53983, term53983.getClass(), "type", 47);
        setField(term53983, term53983.getClass(), "next", null);
        setField(term53983, term53983.getClass(), "first", null);
        setField(term53983, term53983.getClass(), "last", null);
        setField(term53983, term53983.getClass(), "propListHead", null);
        setIntField(term53983, term53983.getClass(), "sourcePosition", 0);
        setField(term53983, term53983.getClass(), "jsType", null);
        setField(term53983, term53983.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53895;
        Object retValue = callMethod(klass, "isLiteralValue", argTypes, null, args);
        assertTrue(recursiveEquals(term53895, term53983));
        assertTrue(recursiveEquals(retValue, true));
    }

};


