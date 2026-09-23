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

public class NodeUtil_getRValueOfLValue_2130766767316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4912;

    public NodeUtil_getRValueOfLValue_2130766767316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4912, term4912.getClass(), "type", -1551790945);
        setIntField(term4914, term4914.getClass(), "type", 2039538484);
        setIntField(term4916, term4916.getClass(), "type", 1235736068);
        setIntField(term4918, term4918.getClass(), "type", 329424176);
        setIntField(term4920, term4920.getClass(), "type", -1897199214);
        setField(term4920, term4920.getClass(), "next", null);
        setField(term4920, term4920.getClass(), "first", null);
        setField(term4920, term4920.getClass(), "last", null);
        setField(term4920, term4920.getClass(), "propListHead", null);
        setIntField(term4920, term4920.getClass(), "sourcePosition", 0);
        setField(term4920, term4920.getClass(), "jsType", null);
        setField(term4920, term4920.getClass(), "parent", null);
        setField(term4918, term4918.getClass(), "next", term4920);
        setIntField(term4923, term4923.getClass(), "type", -1016478729);
        setField(term4923, term4923.getClass(), "next", null);
        setField(term4923, term4923.getClass(), "first", null);
        setField(term4923, term4923.getClass(), "last", term4920);
        setField(term4923, term4923.getClass(), "propListHead", null);
        setIntField(term4923, term4923.getClass(), "sourcePosition", 0);
        setField(term4923, term4923.getClass(), "jsType", null);
        setField(term4923, term4923.getClass(), "parent", null);
        setField(term4918, term4918.getClass(), "first", term4923);
        setField(term4918, term4918.getClass(), "last", term4916);
        setField(term4918, term4918.getClass(), "propListHead", null);
        setIntField(term4918, term4918.getClass(), "sourcePosition", 0);
        setField(term4918, term4918.getClass(), "jsType", null);
        setField(term4918, term4918.getClass(), "parent", null);
        setField(term4916, term4916.getClass(), "next", term4918);
        setField(term4916, term4916.getClass(), "first", term4920);
        setIntField(term4927, term4927.getClass(), "type", 638046409);
        setIntField(term4929, term4929.getClass(), "type", 427274898);
        setField(term4929, term4929.getClass(), "next", null);
        setField(term4929, term4929.getClass(), "first", term4923);
        setField(term4929, term4929.getClass(), "last", term4918);
        setField(term4929, term4929.getClass(), "propListHead", null);
        setIntField(term4929, term4929.getClass(), "sourcePosition", 0);
        setField(term4929, term4929.getClass(), "jsType", null);
        setField(term4929, term4929.getClass(), "parent", null);
        setField(term4927, term4927.getClass(), "next", term4929);
        setField(term4927, term4927.getClass(), "first", term4914);
        setField(term4927, term4927.getClass(), "last", term4914);
        setField(term4927, term4927.getClass(), "propListHead", null);
        setIntField(term4927, term4927.getClass(), "sourcePosition", 0);
        setField(term4927, term4927.getClass(), "jsType", null);
        setField(term4927, term4927.getClass(), "parent", null);
        setField(term4916, term4916.getClass(), "last", term4927);
        setField(term4916, term4916.getClass(), "propListHead", null);
        setIntField(term4916, term4916.getClass(), "sourcePosition", 0);
        setField(term4916, term4916.getClass(), "jsType", null);
        setField(term4916, term4916.getClass(), "parent", null);
        setField(term4914, term4914.getClass(), "next", term4916);
        setIntField(term4934, term4934.getClass(), "type", -1654552020);
        setField(term4934, term4934.getClass(), "next", term4927);
        setField(term4934, term4934.getClass(), "first", term4929);
        setField(term4934, term4934.getClass(), "last", term4912);
        setField(term4934, term4934.getClass(), "propListHead", null);
        setIntField(term4934, term4934.getClass(), "sourcePosition", 0);
        setField(term4934, term4934.getClass(), "jsType", null);
        setField(term4934, term4934.getClass(), "parent", null);
        setField(term4914, term4914.getClass(), "first", term4934);
        setField(term4914, term4914.getClass(), "last", term4934);
        setField(term4914, term4914.getClass(), "propListHead", null);
        setIntField(term4914, term4914.getClass(), "sourcePosition", 0);
        setField(term4914, term4914.getClass(), "jsType", null);
        setField(term4914, term4914.getClass(), "parent", null);
        setField(term4912, term4912.getClass(), "next", term4914);
        setField(term4912, term4912.getClass(), "first", term4918);
        setField(term4912, term4912.getClass(), "last", term4920);
        setField(term4912, term4912.getClass(), "propListHead", null);
        setIntField(term4912, term4912.getClass(), "sourcePosition", 0);
        setField(term4912, term4912.getClass(), "jsType", null);
        setField(term4912, term4912.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4912;
        try {
            callMethod(klass, "getRValueOfLValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


