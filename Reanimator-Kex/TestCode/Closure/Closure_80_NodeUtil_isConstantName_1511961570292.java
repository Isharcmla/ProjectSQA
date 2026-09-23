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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_isConstantName_1511961570292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4106;
     Object term24923;

    public NodeUtil_isConstantName_1511961570292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4119 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4129 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4106, term4106.getClass(), "type", 383244929);
        setIntField(term4108, term4108.getClass(), "type", -31125530);
        setIntField(term4110, term4110.getClass(), "type", 0);
        setField(term4110, term4110.getClass(), "next", null);
        setField(term4110, term4110.getClass(), "first", null);
        setField(term4110, term4110.getClass(), "last", null);
        setField(term4110, term4110.getClass(), "propListHead", null);
        setIntField(term4110, term4110.getClass(), "sourcePosition", 0);
        setField(term4110, term4110.getClass(), "jsType", null);
        setField(term4110, term4110.getClass(), "parent", null);
        setField(term4108, term4108.getClass(), "next", term4110);
        setIntField(term4113, term4113.getClass(), "type", 0);
        setField(term4113, term4113.getClass(), "next", null);
        setField(term4113, term4113.getClass(), "first", null);
        setField(term4113, term4113.getClass(), "last", null);
        setField(term4113, term4113.getClass(), "propListHead", null);
        setIntField(term4113, term4113.getClass(), "sourcePosition", 0);
        setField(term4113, term4113.getClass(), "jsType", null);
        setField(term4113, term4113.getClass(), "parent", null);
        setField(term4108, term4108.getClass(), "first", term4113);
        setIntField(term4116, term4116.getClass(), "type", 0);
        setField(term4116, term4116.getClass(), "next", null);
        setField(term4116, term4116.getClass(), "first", null);
        setField(term4116, term4116.getClass(), "last", null);
        setField(term4116, term4116.getClass(), "propListHead", null);
        setIntField(term4116, term4116.getClass(), "sourcePosition", 0);
        setField(term4116, term4116.getClass(), "jsType", null);
        setField(term4116, term4116.getClass(), "parent", null);
        setField(term4108, term4108.getClass(), "last", term4116);
        setField(term4119, term4119.getClass(), "next", null);
        setIntField(term4119, term4119.getClass(), "type", 0);
        setIntField(term4119, term4119.getClass(), "intValue", 0);
        setField(term4119, term4119.getClass(), "objectValue", null);
        setField(term4108, term4108.getClass(), "propListHead", term4119);
        setIntField(term4108, term4108.getClass(), "sourcePosition", 1097894139);
        setField(term4108, term4108.getClass(), "jsType", null);
        setField(term4108, term4108.getClass(), "parent", null);
        setField(term4106, term4106.getClass(), "next", term4108);
        setIntField(term4123, term4123.getClass(), "type", 0);
        setField(term4123, term4123.getClass(), "next", null);
        setField(term4123, term4123.getClass(), "first", null);
        setField(term4123, term4123.getClass(), "last", null);
        setField(term4123, term4123.getClass(), "propListHead", null);
        setIntField(term4123, term4123.getClass(), "sourcePosition", 0);
        setField(term4123, term4123.getClass(), "jsType", null);
        setField(term4123, term4123.getClass(), "parent", null);
        setField(term4106, term4106.getClass(), "first", term4123);
        setIntField(term4126, term4126.getClass(), "type", 0);
        setField(term4126, term4126.getClass(), "next", null);
        setField(term4126, term4126.getClass(), "first", null);
        setField(term4126, term4126.getClass(), "last", null);
        setField(term4126, term4126.getClass(), "propListHead", null);
        setIntField(term4126, term4126.getClass(), "sourcePosition", 0);
        setField(term4126, term4126.getClass(), "jsType", null);
        setField(term4126, term4126.getClass(), "parent", null);
        setField(term4106, term4106.getClass(), "last", term4126);
        setField(term4129, term4129.getClass(), "next", null);
        setIntField(term4129, term4129.getClass(), "type", 0);
        setIntField(term4129, term4129.getClass(), "intValue", 0);
        setField(term4129, term4129.getClass(), "objectValue", null);
        setField(term4106, term4106.getClass(), "propListHead", term4129);
        setIntField(term4106, term4106.getClass(), "sourcePosition", 390256347);
        setField(term4106, term4106.getClass(), "jsType", null);
        setField(term4106, term4106.getClass(), "parent", null);
        term24923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24928 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term24929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24931 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term24923, term24923.getClass(), "type", 383244929);
        setIntField(term24924, term24924.getClass(), "type", -31125530);
        setIntField(term24925, term24925.getClass(), "type", 0);
        setField(term24925, term24925.getClass(), "next", null);
        setField(term24925, term24925.getClass(), "first", null);
        setField(term24925, term24925.getClass(), "last", null);
        setField(term24925, term24925.getClass(), "propListHead", null);
        setIntField(term24925, term24925.getClass(), "sourcePosition", 0);
        setField(term24925, term24925.getClass(), "jsType", null);
        setField(term24925, term24925.getClass(), "parent", null);
        setField(term24924, term24924.getClass(), "next", term24925);
        setIntField(term24926, term24926.getClass(), "type", 0);
        setField(term24926, term24926.getClass(), "next", null);
        setField(term24926, term24926.getClass(), "first", null);
        setField(term24926, term24926.getClass(), "last", null);
        setField(term24926, term24926.getClass(), "propListHead", null);
        setIntField(term24926, term24926.getClass(), "sourcePosition", 0);
        setField(term24926, term24926.getClass(), "jsType", null);
        setField(term24926, term24926.getClass(), "parent", null);
        setField(term24924, term24924.getClass(), "first", term24926);
        setIntField(term24927, term24927.getClass(), "type", 0);
        setField(term24927, term24927.getClass(), "next", null);
        setField(term24927, term24927.getClass(), "first", null);
        setField(term24927, term24927.getClass(), "last", null);
        setField(term24927, term24927.getClass(), "propListHead", null);
        setIntField(term24927, term24927.getClass(), "sourcePosition", 0);
        setField(term24927, term24927.getClass(), "jsType", null);
        setField(term24927, term24927.getClass(), "parent", null);
        setField(term24924, term24924.getClass(), "last", term24927);
        setField(term24928, term24928.getClass(), "next", null);
        setIntField(term24928, term24928.getClass(), "type", 0);
        setIntField(term24928, term24928.getClass(), "intValue", 0);
        setField(term24928, term24928.getClass(), "objectValue", null);
        setField(term24924, term24924.getClass(), "propListHead", term24928);
        setIntField(term24924, term24924.getClass(), "sourcePosition", 1097894139);
        setField(term24924, term24924.getClass(), "jsType", null);
        setField(term24924, term24924.getClass(), "parent", null);
        setField(term24923, term24923.getClass(), "next", term24924);
        setIntField(term24929, term24929.getClass(), "type", 0);
        setField(term24929, term24929.getClass(), "next", null);
        setField(term24929, term24929.getClass(), "first", null);
        setField(term24929, term24929.getClass(), "last", null);
        setField(term24929, term24929.getClass(), "propListHead", null);
        setIntField(term24929, term24929.getClass(), "sourcePosition", 0);
        setField(term24929, term24929.getClass(), "jsType", null);
        setField(term24929, term24929.getClass(), "parent", null);
        setField(term24923, term24923.getClass(), "first", term24929);
        setIntField(term24930, term24930.getClass(), "type", 0);
        setField(term24930, term24930.getClass(), "next", null);
        setField(term24930, term24930.getClass(), "first", null);
        setField(term24930, term24930.getClass(), "last", null);
        setField(term24930, term24930.getClass(), "propListHead", null);
        setIntField(term24930, term24930.getClass(), "sourcePosition", 0);
        setField(term24930, term24930.getClass(), "jsType", null);
        setField(term24930, term24930.getClass(), "parent", null);
        setField(term24923, term24923.getClass(), "last", term24930);
        setField(term24931, term24931.getClass(), "next", null);
        setIntField(term24931, term24931.getClass(), "type", 0);
        setIntField(term24931, term24931.getClass(), "intValue", 0);
        setField(term24931, term24931.getClass(), "objectValue", null);
        setField(term24923, term24923.getClass(), "propListHead", term24931);
        setIntField(term24923, term24923.getClass(), "sourcePosition", 390256347);
        setField(term24923, term24923.getClass(), "jsType", null);
        setField(term24923, term24923.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4106;
        callMethod(klass, "isConstantName", argTypes, null, args);
        assertTrue(recursiveEquals(term4106, term24923));
    }

};


