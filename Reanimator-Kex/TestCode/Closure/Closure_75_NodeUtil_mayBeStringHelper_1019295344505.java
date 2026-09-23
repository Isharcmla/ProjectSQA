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

public class NodeUtil_mayBeStringHelper_1019295344505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39053;
     Object term76556;

    public NodeUtil_mayBeStringHelper_1019295344505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39053, term39053.getClass(), "type", 37);
        term76556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76556, term76556.getClass(), "type", 37);
        setField(term76556, term76556.getClass(), "next", null);
        setField(term76556, term76556.getClass(), "first", null);
        setField(term76556, term76556.getClass(), "last", null);
        setField(term76556, term76556.getClass(), "propListHead", null);
        setIntField(term76556, term76556.getClass(), "sourcePosition", 0);
        setField(term76556, term76556.getClass(), "jsType", null);
        setField(term76556, term76556.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term39053;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term39053, term76556));
        assertTrue(recursiveEquals(retValue, true));
    }

};


