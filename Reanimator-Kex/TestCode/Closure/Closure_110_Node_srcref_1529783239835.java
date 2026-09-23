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
import java.lang.Object;

public class Node_srcref_1529783239835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96319;
     Object term96519;

    public Node_srcref_1529783239835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96319 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96427 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term96319, term96319.getClass(), "propListHead", term96427);
        term96519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term96519, term96519.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term96519;
        callMethod(klass, "srcref", argTypes, term96319, args);
    }

};


