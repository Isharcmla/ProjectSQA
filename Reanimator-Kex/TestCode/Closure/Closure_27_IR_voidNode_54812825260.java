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
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_voidNode_54812825260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34350;
     Object term34775;
     Object term34693;

    public IR_voidNode_54812825260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34350, term34350.getClass(), "type", 85);
        term34775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34775, term34775.getClass(), "type", 85);
        setField(term34775, term34775.getClass(), "next", null);
        setField(term34775, term34775.getClass(), "first", null);
        setField(term34775, term34775.getClass(), "last", null);
        setField(term34775, term34775.getClass(), "propListHead", null);
        setIntField(term34775, term34775.getClass(), "sourcePosition", 0);
        setField(term34775, term34775.getClass(), "jsType", null);
        setIntField(term34776, term34776.getClass(), "type", 122);
        setField(term34776, term34776.getClass(), "next", null);
        setField(term34776, term34776.getClass(), "first", term34775);
        setField(term34776, term34776.getClass(), "last", term34775);
        setField(term34776, term34776.getClass(), "propListHead", null);
        setIntField(term34776, term34776.getClass(), "sourcePosition", -1);
        setField(term34776, term34776.getClass(), "jsType", null);
        setField(term34776, term34776.getClass(), "parent", null);
        setField(term34775, term34775.getClass(), "parent", term34776);
        term34693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34693, term34693.getClass(), "type", 122);
        setField(term34693, term34693.getClass(), "next", null);
        setIntField(term34690, term34690.getClass(), "type", 85);
        setField(term34690, term34690.getClass(), "next", null);
        setField(term34690, term34690.getClass(), "first", null);
        setField(term34690, term34690.getClass(), "last", null);
        setField(term34690, term34690.getClass(), "propListHead", null);
        setIntField(term34690, term34690.getClass(), "sourcePosition", 0);
        setField(term34690, term34690.getClass(), "jsType", null);
        setField(term34690, term34690.getClass(), "parent", term34693);
        setField(term34693, term34693.getClass(), "first", term34690);
        setField(term34693, term34693.getClass(), "last", term34690);
        setField(term34693, term34693.getClass(), "propListHead", null);
        setIntField(term34693, term34693.getClass(), "sourcePosition", -1);
        setField(term34693, term34693.getClass(), "jsType", null);
        setField(term34693, term34693.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34350;
        Object retValue = callMethod(klass, "voidNode", argTypes, null, args);
        assertTrue(recursiveEquals(term34350, term34775));
        assertTrue(recursiveEquals(retValue, term34693));
    }

};


