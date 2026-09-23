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

public class NodeUtil_getFunctionParameters_868132584299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4395;

    public NodeUtil_getFunctionParameters_868132584299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4395, term4395.getClass(), "type", -495242269);
        setIntField(term4397, term4397.getClass(), "type", 932810106);
        setIntField(term4399, term4399.getClass(), "type", -2138801137);
        setIntField(term4401, term4401.getClass(), "type", -1470115841);
        setIntField(term4403, term4403.getClass(), "type", 480909331);
        setField(term4403, term4403.getClass(), "next", null);
        setField(term4403, term4403.getClass(), "first", null);
        setField(term4403, term4403.getClass(), "last", null);
        setField(term4403, term4403.getClass(), "propListHead", null);
        setIntField(term4403, term4403.getClass(), "sourcePosition", 0);
        setField(term4403, term4403.getClass(), "jsType", null);
        setField(term4403, term4403.getClass(), "parent", null);
        setField(term4401, term4401.getClass(), "next", term4403);
        setIntField(term4406, term4406.getClass(), "type", -2024983877);
        setField(term4406, term4406.getClass(), "next", null);
        setField(term4406, term4406.getClass(), "first", null);
        setField(term4406, term4406.getClass(), "last", term4403);
        setField(term4406, term4406.getClass(), "propListHead", null);
        setIntField(term4406, term4406.getClass(), "sourcePosition", 0);
        setField(term4406, term4406.getClass(), "jsType", null);
        setField(term4406, term4406.getClass(), "parent", null);
        setField(term4401, term4401.getClass(), "first", term4406);
        setField(term4401, term4401.getClass(), "last", term4399);
        setField(term4401, term4401.getClass(), "propListHead", null);
        setIntField(term4401, term4401.getClass(), "sourcePosition", 0);
        setField(term4401, term4401.getClass(), "jsType", null);
        setField(term4401, term4401.getClass(), "parent", null);
        setField(term4399, term4399.getClass(), "next", term4401);
        setField(term4399, term4399.getClass(), "first", term4403);
        setIntField(term4410, term4410.getClass(), "type", 1505375686);
        setIntField(term4412, term4412.getClass(), "type", -132005524);
        setField(term4412, term4412.getClass(), "next", null);
        setField(term4412, term4412.getClass(), "first", term4406);
        setField(term4412, term4412.getClass(), "last", term4401);
        setField(term4412, term4412.getClass(), "propListHead", null);
        setIntField(term4412, term4412.getClass(), "sourcePosition", 0);
        setField(term4412, term4412.getClass(), "jsType", null);
        setField(term4412, term4412.getClass(), "parent", null);
        setField(term4410, term4410.getClass(), "next", term4412);
        setField(term4410, term4410.getClass(), "first", term4397);
        setField(term4410, term4410.getClass(), "last", term4397);
        setField(term4410, term4410.getClass(), "propListHead", null);
        setIntField(term4410, term4410.getClass(), "sourcePosition", 0);
        setField(term4410, term4410.getClass(), "jsType", null);
        setField(term4410, term4410.getClass(), "parent", null);
        setField(term4399, term4399.getClass(), "last", term4410);
        setField(term4399, term4399.getClass(), "propListHead", null);
        setIntField(term4399, term4399.getClass(), "sourcePosition", 0);
        setField(term4399, term4399.getClass(), "jsType", null);
        setField(term4399, term4399.getClass(), "parent", null);
        setField(term4397, term4397.getClass(), "next", term4399);
        setIntField(term4417, term4417.getClass(), "type", -1235127374);
        setField(term4417, term4417.getClass(), "next", term4410);
        setField(term4417, term4417.getClass(), "first", term4412);
        setField(term4417, term4417.getClass(), "last", term4395);
        setField(term4417, term4417.getClass(), "propListHead", null);
        setIntField(term4417, term4417.getClass(), "sourcePosition", 0);
        setField(term4417, term4417.getClass(), "jsType", null);
        setField(term4417, term4417.getClass(), "parent", null);
        setField(term4397, term4397.getClass(), "first", term4417);
        setField(term4397, term4397.getClass(), "last", term4417);
        setField(term4397, term4397.getClass(), "propListHead", null);
        setIntField(term4397, term4397.getClass(), "sourcePosition", 0);
        setField(term4397, term4397.getClass(), "jsType", null);
        setField(term4397, term4397.getClass(), "parent", null);
        setField(term4395, term4395.getClass(), "next", term4397);
        setField(term4395, term4395.getClass(), "first", term4401);
        setField(term4395, term4395.getClass(), "last", term4403);
        setField(term4395, term4395.getClass(), "propListHead", null);
        setIntField(term4395, term4395.getClass(), "sourcePosition", 0);
        setField(term4395, term4395.getClass(), "jsType", null);
        setField(term4395, term4395.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4395;
        try {
            callMethod(klass, "getFunctionParameters", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


