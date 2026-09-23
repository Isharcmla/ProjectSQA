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

public class NodeUtil_hasFinally_1906674990296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4314;

    public NodeUtil_hasFinally_1906674990296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4314, term4314.getClass(), "type", -824369460);
        setIntField(term4316, term4316.getClass(), "type", -1573760035);
        setIntField(term4318, term4318.getClass(), "type", -1147965121);
        setIntField(term4320, term4320.getClass(), "type", -867099093);
        setIntField(term4322, term4322.getClass(), "type", -1091199008);
        setField(term4322, term4322.getClass(), "next", null);
        setField(term4322, term4322.getClass(), "first", null);
        setField(term4322, term4322.getClass(), "last", null);
        setField(term4322, term4322.getClass(), "propListHead", null);
        setIntField(term4322, term4322.getClass(), "sourcePosition", 0);
        setField(term4322, term4322.getClass(), "jsType", null);
        setField(term4322, term4322.getClass(), "parent", null);
        setField(term4320, term4320.getClass(), "next", term4322);
        setIntField(term4325, term4325.getClass(), "type", 1837886253);
        setField(term4325, term4325.getClass(), "next", null);
        setField(term4325, term4325.getClass(), "first", null);
        setField(term4325, term4325.getClass(), "last", term4322);
        setField(term4325, term4325.getClass(), "propListHead", null);
        setIntField(term4325, term4325.getClass(), "sourcePosition", 0);
        setField(term4325, term4325.getClass(), "jsType", null);
        setField(term4325, term4325.getClass(), "parent", null);
        setField(term4320, term4320.getClass(), "first", term4325);
        setField(term4320, term4320.getClass(), "last", term4318);
        setField(term4320, term4320.getClass(), "propListHead", null);
        setIntField(term4320, term4320.getClass(), "sourcePosition", 0);
        setField(term4320, term4320.getClass(), "jsType", null);
        setField(term4320, term4320.getClass(), "parent", null);
        setField(term4318, term4318.getClass(), "next", term4320);
        setField(term4318, term4318.getClass(), "first", term4322);
        setIntField(term4329, term4329.getClass(), "type", 2108571355);
        setIntField(term4331, term4331.getClass(), "type", 1909966089);
        setField(term4331, term4331.getClass(), "next", null);
        setField(term4331, term4331.getClass(), "first", term4325);
        setField(term4331, term4331.getClass(), "last", term4320);
        setField(term4331, term4331.getClass(), "propListHead", null);
        setIntField(term4331, term4331.getClass(), "sourcePosition", 0);
        setField(term4331, term4331.getClass(), "jsType", null);
        setField(term4331, term4331.getClass(), "parent", null);
        setField(term4329, term4329.getClass(), "next", term4331);
        setField(term4329, term4329.getClass(), "first", term4316);
        setField(term4329, term4329.getClass(), "last", term4316);
        setField(term4329, term4329.getClass(), "propListHead", null);
        setIntField(term4329, term4329.getClass(), "sourcePosition", 0);
        setField(term4329, term4329.getClass(), "jsType", null);
        setField(term4329, term4329.getClass(), "parent", null);
        setField(term4318, term4318.getClass(), "last", term4329);
        setField(term4318, term4318.getClass(), "propListHead", null);
        setIntField(term4318, term4318.getClass(), "sourcePosition", 0);
        setField(term4318, term4318.getClass(), "jsType", null);
        setField(term4318, term4318.getClass(), "parent", null);
        setField(term4316, term4316.getClass(), "next", term4318);
        setIntField(term4336, term4336.getClass(), "type", 1827255916);
        setField(term4336, term4336.getClass(), "next", term4329);
        setField(term4336, term4336.getClass(), "first", term4331);
        setField(term4336, term4336.getClass(), "last", term4314);
        setField(term4336, term4336.getClass(), "propListHead", null);
        setIntField(term4336, term4336.getClass(), "sourcePosition", 0);
        setField(term4336, term4336.getClass(), "jsType", null);
        setField(term4336, term4336.getClass(), "parent", null);
        setField(term4316, term4316.getClass(), "first", term4336);
        setField(term4316, term4316.getClass(), "last", term4336);
        setField(term4316, term4316.getClass(), "propListHead", null);
        setIntField(term4316, term4316.getClass(), "sourcePosition", 0);
        setField(term4316, term4316.getClass(), "jsType", null);
        setField(term4316, term4316.getClass(), "parent", null);
        setField(term4314, term4314.getClass(), "next", term4316);
        setField(term4314, term4314.getClass(), "first", term4320);
        setField(term4314, term4314.getClass(), "last", term4322);
        setField(term4314, term4314.getClass(), "propListHead", null);
        setIntField(term4314, term4314.getClass(), "sourcePosition", 0);
        setField(term4314, term4314.getClass(), "jsType", null);
        setField(term4314, term4314.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4314;
        try {
            callMethod(klass, "hasFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


