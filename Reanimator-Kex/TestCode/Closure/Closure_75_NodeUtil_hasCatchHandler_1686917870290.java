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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_hasCatchHandler_1686917870290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4052;

    public NodeUtil_hasCatchHandler_1686917870290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4065 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4075 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4052, term4052.getClass(), "type", 695330987);
        setIntField(term4054, term4054.getClass(), "type", -397161164);
        setIntField(term4056, term4056.getClass(), "type", 0);
        setField(term4056, term4056.getClass(), "next", null);
        setField(term4056, term4056.getClass(), "first", null);
        setField(term4056, term4056.getClass(), "last", null);
        setField(term4056, term4056.getClass(), "propListHead", null);
        setIntField(term4056, term4056.getClass(), "sourcePosition", 0);
        setField(term4056, term4056.getClass(), "jsType", null);
        setField(term4056, term4056.getClass(), "parent", null);
        setField(term4054, term4054.getClass(), "next", term4056);
        setIntField(term4059, term4059.getClass(), "type", 0);
        setField(term4059, term4059.getClass(), "next", null);
        setField(term4059, term4059.getClass(), "first", null);
        setField(term4059, term4059.getClass(), "last", null);
        setField(term4059, term4059.getClass(), "propListHead", null);
        setIntField(term4059, term4059.getClass(), "sourcePosition", 0);
        setField(term4059, term4059.getClass(), "jsType", null);
        setField(term4059, term4059.getClass(), "parent", null);
        setField(term4054, term4054.getClass(), "first", term4059);
        setIntField(term4062, term4062.getClass(), "type", 0);
        setField(term4062, term4062.getClass(), "next", null);
        setField(term4062, term4062.getClass(), "first", null);
        setField(term4062, term4062.getClass(), "last", null);
        setField(term4062, term4062.getClass(), "propListHead", null);
        setIntField(term4062, term4062.getClass(), "sourcePosition", 0);
        setField(term4062, term4062.getClass(), "jsType", null);
        setField(term4062, term4062.getClass(), "parent", null);
        setField(term4054, term4054.getClass(), "last", term4062);
        setField(term4065, term4065.getClass(), "next", null);
        setIntField(term4065, term4065.getClass(), "type", 0);
        setIntField(term4065, term4065.getClass(), "intValue", 0);
        setField(term4065, term4065.getClass(), "objectValue", null);
        setField(term4054, term4054.getClass(), "propListHead", term4065);
        setIntField(term4054, term4054.getClass(), "sourcePosition", -2033952124);
        setField(term4054, term4054.getClass(), "jsType", null);
        setField(term4054, term4054.getClass(), "parent", null);
        setField(term4052, term4052.getClass(), "next", term4054);
        setIntField(term4069, term4069.getClass(), "type", 0);
        setField(term4069, term4069.getClass(), "next", null);
        setField(term4069, term4069.getClass(), "first", null);
        setField(term4069, term4069.getClass(), "last", null);
        setField(term4069, term4069.getClass(), "propListHead", null);
        setIntField(term4069, term4069.getClass(), "sourcePosition", 0);
        setField(term4069, term4069.getClass(), "jsType", null);
        setField(term4069, term4069.getClass(), "parent", null);
        setField(term4052, term4052.getClass(), "first", term4069);
        setIntField(term4072, term4072.getClass(), "type", 0);
        setField(term4072, term4072.getClass(), "next", null);
        setField(term4072, term4072.getClass(), "first", null);
        setField(term4072, term4072.getClass(), "last", null);
        setField(term4072, term4072.getClass(), "propListHead", null);
        setIntField(term4072, term4072.getClass(), "sourcePosition", 0);
        setField(term4072, term4072.getClass(), "jsType", null);
        setField(term4072, term4072.getClass(), "parent", null);
        setField(term4052, term4052.getClass(), "last", term4072);
        setField(term4075, term4075.getClass(), "next", null);
        setIntField(term4075, term4075.getClass(), "type", 0);
        setIntField(term4075, term4075.getClass(), "intValue", 0);
        setField(term4075, term4075.getClass(), "objectValue", null);
        setField(term4052, term4052.getClass(), "propListHead", term4075);
        setIntField(term4052, term4052.getClass(), "sourcePosition", 560401653);
        setField(term4052, term4052.getClass(), "jsType", null);
        setField(term4052, term4052.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4052;
        try {
            callMethod(klass, "hasCatchHandler", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


