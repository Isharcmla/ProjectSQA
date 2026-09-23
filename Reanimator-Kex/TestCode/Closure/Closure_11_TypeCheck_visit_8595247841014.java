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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visit_8595247841014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280910;
     Object term281106;

    public TypeCheck_visit_8595247841014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280910 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term281014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term280910, term280910.getClass(), "typeRegistry", term281014);
        term281106 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term281198 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term281106, term281106.getClass(), "type", 17);
        setField(term281198, term281198.getClass(), "jsType", null);
        setField(term281106, term281106.getClass(), "first", term281198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term281106;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term280910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


