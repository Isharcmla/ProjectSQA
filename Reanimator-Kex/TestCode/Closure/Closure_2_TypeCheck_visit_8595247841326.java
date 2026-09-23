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

public class TypeCheck_visit_8595247841326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403488;
     Object term403684;

    public TypeCheck_visit_8595247841326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403488 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term403592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term403488, term403488.getClass(), "typeRegistry", term403592);
        term403684 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term403776 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term403684, term403684.getClass(), "type", 155);
        setField(term403776, term403776.getClass(), "jsType", null);
        setField(term403684, term403684.getClass(), "first", term403776);
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
        args[1] = term403684;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term403488, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


