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

public class NodeUtil_mayBeString_1356610414506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39155;
     Object term76927;

    public NodeUtil_mayBeString_1356610414506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39155, term39155.getClass(), "type", 43);
        term76927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76927, term76927.getClass(), "type", 43);
        setField(term76927, term76927.getClass(), "next", null);
        setField(term76927, term76927.getClass(), "first", null);
        setField(term76927, term76927.getClass(), "last", null);
        setField(term76927, term76927.getClass(), "propListHead", null);
        setIntField(term76927, term76927.getClass(), "sourcePosition", 0);
        setField(term76927, term76927.getClass(), "jsType", null);
        setField(term76927, term76927.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term39155;
        args[1] = false;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term39155, term76927));
    }

};


