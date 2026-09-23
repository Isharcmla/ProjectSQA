package com.google.javascript.rhino.jstype;

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
import java.lang.StackOverflowError;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class ArrowType_toStringHelper_107835986027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552;
     Object term579;

    public ArrowType_toStringHelper_107835986027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term553, term553.getClass(), "type", -1222006000);
        setIntField(term555, term555.getClass(), "type", 2095798786);
        setIntField(term557, term557.getClass(), "type", -1565502840);
        setIntField(term559, term559.getClass(), "type", 344323424);
        setField(term559, term559.getClass(), "next", null);
        setField(term559, term559.getClass(), "first", null);
        setField(term559, term559.getClass(), "last", null);
        setField(term559, term559.getClass(), "propListHead", null);
        setIntField(term559, term559.getClass(), "sourcePosition", 0);
        setField(term559, term559.getClass(), "jsType", null);
        setField(term559, term559.getClass(), "parent", null);
        setField(term557, term557.getClass(), "next", term559);
        setIntField(term562, term562.getClass(), "type", 202001407);
        setField(term562, term562.getClass(), "next", null);
        setField(term562, term562.getClass(), "first", term553);
        setField(term562, term562.getClass(), "last", null);
        setField(term562, term562.getClass(), "propListHead", null);
        setIntField(term562, term562.getClass(), "sourcePosition", 0);
        setField(term562, term562.getClass(), "jsType", null);
        setField(term562, term562.getClass(), "parent", null);
        setField(term557, term557.getClass(), "first", term562);
        setIntField(term565, term565.getClass(), "type", -25637976);
        setField(term565, term565.getClass(), "next", null);
        setField(term565, term565.getClass(), "first", term555);
        setField(term565, term565.getClass(), "last", null);
        setField(term565, term565.getClass(), "propListHead", null);
        setIntField(term565, term565.getClass(), "sourcePosition", 0);
        setField(term565, term565.getClass(), "jsType", null);
        setField(term565, term565.getClass(), "parent", null);
        setField(term557, term557.getClass(), "last", term565);
        setField(term557, term557.getClass(), "propListHead", null);
        setIntField(term557, term557.getClass(), "sourcePosition", 0);
        setField(term557, term557.getClass(), "jsType", null);
        setField(term557, term557.getClass(), "parent", null);
        setField(term555, term555.getClass(), "next", term557);
        setField(term555, term555.getClass(), "first", term557);
        setIntField(term569, term569.getClass(), "type", 9726679);
        setField(term569, term569.getClass(), "next", term565);
        setField(term569, term569.getClass(), "first", term562);
        setField(term569, term569.getClass(), "last", term562);
        setField(term569, term569.getClass(), "propListHead", null);
        setIntField(term569, term569.getClass(), "sourcePosition", 0);
        setField(term569, term569.getClass(), "jsType", null);
        setField(term569, term569.getClass(), "parent", null);
        setField(term555, term555.getClass(), "last", term569);
        setField(term555, term555.getClass(), "propListHead", null);
        setIntField(term555, term555.getClass(), "sourcePosition", 0);
        setField(term555, term555.getClass(), "jsType", null);
        setField(term555, term555.getClass(), "parent", null);
        setField(term553, term553.getClass(), "next", term555);
        setField(term553, term553.getClass(), "first", term562);
        setIntField(term573, term573.getClass(), "type", 0);
        setField(term573, term573.getClass(), "next", null);
        setField(term573, term573.getClass(), "first", null);
        setField(term573, term573.getClass(), "last", null);
        setField(term573, term573.getClass(), "propListHead", null);
        setIntField(term573, term573.getClass(), "sourcePosition", 0);
        setField(term573, term573.getClass(), "jsType", null);
        setField(term573, term573.getClass(), "parent", null);
        setField(term553, term553.getClass(), "last", term573);
        setField(term553, term553.getClass(), "propListHead", null);
        setIntField(term553, term553.getClass(), "sourcePosition", 0);
        setField(term553, term553.getClass(), "jsType", null);
        setField(term553, term553.getClass(), "parent", null);
        setField(term552, term552.getClass(), "parameters", term553);
        setField(term552, term552.getClass(), "returnType", null);
        setBooleanField(term552, term552.getClass(), "returnTypeInferred", false);
        setBooleanField(term552, term552.getClass(), "resolved", false);
        setField(term552, term552.getClass(), "resolveResult", null);
        setField(term552, term552.getClass(), "registry", null);
        term579 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term579;
        try {
            callMethod(klass, "toStringHelper", argTypes, term552, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


