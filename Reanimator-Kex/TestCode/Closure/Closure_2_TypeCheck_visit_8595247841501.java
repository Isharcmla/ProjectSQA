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

public class TypeCheck_visit_8595247841501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485856;
     Object term486052;

    public TypeCheck_visit_8595247841501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term485856 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term485960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term485856, term485856.getClass(), "typeRegistry", term485960);
        term486052 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term486144 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term486052, term486052.getClass(), "type", 97);
        setIntField(term486144, term486144.getClass(), "type", 0);
        setField(term486144, term486144.getClass(), "jsType", null);
        setField(term486052, term486052.getClass(), "first", term486144);
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
        args[1] = term486052;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term485856, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


