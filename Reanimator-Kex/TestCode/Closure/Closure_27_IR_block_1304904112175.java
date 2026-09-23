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

public class IR_block_1304904112175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21178;
     Object term21419;
     Object term21343;

    public IR_block_1304904112175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21178, term21178.getClass(), "type", 116);
        term21419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21419, term21419.getClass(), "type", 116);
        setField(term21419, term21419.getClass(), "next", null);
        setField(term21419, term21419.getClass(), "first", null);
        setField(term21419, term21419.getClass(), "last", null);
        setField(term21419, term21419.getClass(), "propListHead", null);
        setIntField(term21419, term21419.getClass(), "sourcePosition", 0);
        setField(term21419, term21419.getClass(), "jsType", null);
        setIntField(term21420, term21420.getClass(), "type", 125);
        setField(term21420, term21420.getClass(), "next", null);
        setField(term21420, term21420.getClass(), "first", term21419);
        setField(term21420, term21420.getClass(), "last", term21419);
        setField(term21420, term21420.getClass(), "propListHead", null);
        setIntField(term21420, term21420.getClass(), "sourcePosition", -1);
        setField(term21420, term21420.getClass(), "jsType", null);
        setField(term21420, term21420.getClass(), "parent", null);
        setField(term21419, term21419.getClass(), "parent", term21420);
        term21343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21343, term21343.getClass(), "type", 125);
        setField(term21343, term21343.getClass(), "next", null);
        setIntField(term21340, term21340.getClass(), "type", 116);
        setField(term21340, term21340.getClass(), "next", null);
        setField(term21340, term21340.getClass(), "first", null);
        setField(term21340, term21340.getClass(), "last", null);
        setField(term21340, term21340.getClass(), "propListHead", null);
        setIntField(term21340, term21340.getClass(), "sourcePosition", 0);
        setField(term21340, term21340.getClass(), "jsType", null);
        setField(term21340, term21340.getClass(), "parent", term21343);
        setField(term21343, term21343.getClass(), "first", term21340);
        setField(term21343, term21343.getClass(), "last", term21340);
        setField(term21343, term21343.getClass(), "propListHead", null);
        setIntField(term21343, term21343.getClass(), "sourcePosition", -1);
        setField(term21343, term21343.getClass(), "jsType", null);
        setField(term21343, term21343.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21178;
        Object retValue = callMethod(klass, "block", argTypes, null, args);
        assertTrue(recursiveEquals(term21178, term21419));
        assertTrue(recursiveEquals(retValue, term21343));
    }

};


