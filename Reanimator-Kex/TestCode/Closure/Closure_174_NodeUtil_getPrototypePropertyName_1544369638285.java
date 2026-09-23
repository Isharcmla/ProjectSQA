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

public class NodeUtil_getPrototypePropertyName_1544369638285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3927;

    public NodeUtil_getPrototypePropertyName_1544369638285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3927, term3927.getClass(), "type", -1823255084);
        setIntField(term3929, term3929.getClass(), "type", 793345010);
        setIntField(term3931, term3931.getClass(), "type", -2092117838);
        setIntField(term3933, term3933.getClass(), "type", 1524590776);
        setIntField(term3935, term3935.getClass(), "type", 1523896653);
        setField(term3935, term3935.getClass(), "next", null);
        setField(term3935, term3935.getClass(), "first", null);
        setField(term3935, term3935.getClass(), "last", null);
        setField(term3935, term3935.getClass(), "propListHead", null);
        setIntField(term3935, term3935.getClass(), "sourcePosition", 0);
        setField(term3935, term3935.getClass(), "jsType", null);
        setField(term3935, term3935.getClass(), "parent", null);
        setField(term3933, term3933.getClass(), "next", term3935);
        setIntField(term3938, term3938.getClass(), "type", -1731921726);
        setField(term3938, term3938.getClass(), "next", null);
        setField(term3938, term3938.getClass(), "first", null);
        setField(term3938, term3938.getClass(), "last", term3935);
        setField(term3938, term3938.getClass(), "propListHead", null);
        setIntField(term3938, term3938.getClass(), "sourcePosition", 0);
        setField(term3938, term3938.getClass(), "jsType", null);
        setField(term3938, term3938.getClass(), "parent", null);
        setField(term3933, term3933.getClass(), "first", term3938);
        setField(term3933, term3933.getClass(), "last", term3931);
        setField(term3933, term3933.getClass(), "propListHead", null);
        setIntField(term3933, term3933.getClass(), "sourcePosition", 0);
        setField(term3933, term3933.getClass(), "jsType", null);
        setField(term3933, term3933.getClass(), "parent", null);
        setField(term3931, term3931.getClass(), "next", term3933);
        setField(term3931, term3931.getClass(), "first", term3935);
        setIntField(term3942, term3942.getClass(), "type", 183531701);
        setIntField(term3944, term3944.getClass(), "type", -974923743);
        setField(term3944, term3944.getClass(), "next", null);
        setField(term3944, term3944.getClass(), "first", term3938);
        setField(term3944, term3944.getClass(), "last", term3933);
        setField(term3944, term3944.getClass(), "propListHead", null);
        setIntField(term3944, term3944.getClass(), "sourcePosition", 0);
        setField(term3944, term3944.getClass(), "jsType", null);
        setField(term3944, term3944.getClass(), "parent", null);
        setField(term3942, term3942.getClass(), "next", term3944);
        setField(term3942, term3942.getClass(), "first", term3929);
        setField(term3942, term3942.getClass(), "last", term3929);
        setField(term3942, term3942.getClass(), "propListHead", null);
        setIntField(term3942, term3942.getClass(), "sourcePosition", 0);
        setField(term3942, term3942.getClass(), "jsType", null);
        setField(term3942, term3942.getClass(), "parent", null);
        setField(term3931, term3931.getClass(), "last", term3942);
        setField(term3931, term3931.getClass(), "propListHead", null);
        setIntField(term3931, term3931.getClass(), "sourcePosition", 0);
        setField(term3931, term3931.getClass(), "jsType", null);
        setField(term3931, term3931.getClass(), "parent", null);
        setField(term3929, term3929.getClass(), "next", term3931);
        setIntField(term3949, term3949.getClass(), "type", 1876738932);
        setField(term3949, term3949.getClass(), "next", term3942);
        setField(term3949, term3949.getClass(), "first", term3944);
        setField(term3949, term3949.getClass(), "last", term3927);
        setField(term3949, term3949.getClass(), "propListHead", null);
        setIntField(term3949, term3949.getClass(), "sourcePosition", 0);
        setField(term3949, term3949.getClass(), "jsType", null);
        setField(term3949, term3949.getClass(), "parent", null);
        setField(term3929, term3929.getClass(), "first", term3949);
        setField(term3929, term3929.getClass(), "last", term3949);
        setField(term3929, term3929.getClass(), "propListHead", null);
        setIntField(term3929, term3929.getClass(), "sourcePosition", 0);
        setField(term3929, term3929.getClass(), "jsType", null);
        setField(term3929, term3929.getClass(), "parent", null);
        setField(term3927, term3927.getClass(), "next", term3929);
        setField(term3927, term3927.getClass(), "first", term3933);
        setField(term3927, term3927.getClass(), "last", term3935);
        setField(term3927, term3927.getClass(), "propListHead", null);
        setIntField(term3927, term3927.getClass(), "sourcePosition", 0);
        setField(term3927, term3927.getClass(), "jsType", null);
        setField(term3927, term3927.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3927;
        try {
            callMethod(klass, "getPrototypePropertyName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


