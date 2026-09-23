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

public class NodeUtil_getFnParameters_426777224208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3143;

    public NodeUtil_getFnParameters_426777224208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3156 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3166 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3143, term3143.getClass(), "type", -1362132929);
        setIntField(term3145, term3145.getClass(), "type", 852281447);
        setIntField(term3147, term3147.getClass(), "type", 0);
        setField(term3147, term3147.getClass(), "next", null);
        setField(term3147, term3147.getClass(), "first", null);
        setField(term3147, term3147.getClass(), "last", null);
        setField(term3147, term3147.getClass(), "propListHead", null);
        setIntField(term3147, term3147.getClass(), "sourcePosition", 0);
        setField(term3147, term3147.getClass(), "jsType", null);
        setField(term3147, term3147.getClass(), "parent", null);
        setField(term3145, term3145.getClass(), "next", term3147);
        setIntField(term3150, term3150.getClass(), "type", 0);
        setField(term3150, term3150.getClass(), "next", null);
        setField(term3150, term3150.getClass(), "first", null);
        setField(term3150, term3150.getClass(), "last", null);
        setField(term3150, term3150.getClass(), "propListHead", null);
        setIntField(term3150, term3150.getClass(), "sourcePosition", 0);
        setField(term3150, term3150.getClass(), "jsType", null);
        setField(term3150, term3150.getClass(), "parent", null);
        setField(term3145, term3145.getClass(), "first", term3150);
        setIntField(term3153, term3153.getClass(), "type", 0);
        setField(term3153, term3153.getClass(), "next", null);
        setField(term3153, term3153.getClass(), "first", null);
        setField(term3153, term3153.getClass(), "last", null);
        setField(term3153, term3153.getClass(), "propListHead", null);
        setIntField(term3153, term3153.getClass(), "sourcePosition", 0);
        setField(term3153, term3153.getClass(), "jsType", null);
        setField(term3153, term3153.getClass(), "parent", null);
        setField(term3145, term3145.getClass(), "last", term3153);
        setField(term3156, term3156.getClass(), "next", null);
        setIntField(term3156, term3156.getClass(), "type", 0);
        setIntField(term3156, term3156.getClass(), "intValue", 0);
        setField(term3156, term3156.getClass(), "objectValue", null);
        setField(term3145, term3145.getClass(), "propListHead", term3156);
        setIntField(term3145, term3145.getClass(), "sourcePosition", 241725499);
        setField(term3145, term3145.getClass(), "jsType", null);
        setField(term3145, term3145.getClass(), "parent", null);
        setField(term3143, term3143.getClass(), "next", term3145);
        setIntField(term3160, term3160.getClass(), "type", 0);
        setField(term3160, term3160.getClass(), "next", null);
        setField(term3160, term3160.getClass(), "first", null);
        setField(term3160, term3160.getClass(), "last", null);
        setField(term3160, term3160.getClass(), "propListHead", null);
        setIntField(term3160, term3160.getClass(), "sourcePosition", 0);
        setField(term3160, term3160.getClass(), "jsType", null);
        setField(term3160, term3160.getClass(), "parent", null);
        setField(term3143, term3143.getClass(), "first", term3160);
        setIntField(term3163, term3163.getClass(), "type", 0);
        setField(term3163, term3163.getClass(), "next", null);
        setField(term3163, term3163.getClass(), "first", null);
        setField(term3163, term3163.getClass(), "last", null);
        setField(term3163, term3163.getClass(), "propListHead", null);
        setIntField(term3163, term3163.getClass(), "sourcePosition", 0);
        setField(term3163, term3163.getClass(), "jsType", null);
        setField(term3163, term3163.getClass(), "parent", null);
        setField(term3143, term3143.getClass(), "last", term3163);
        setField(term3166, term3166.getClass(), "next", null);
        setIntField(term3166, term3166.getClass(), "type", 0);
        setIntField(term3166, term3166.getClass(), "intValue", 0);
        setField(term3166, term3166.getClass(), "objectValue", null);
        setField(term3143, term3143.getClass(), "propListHead", term3166);
        setIntField(term3143, term3143.getClass(), "sourcePosition", 823179298);
        setField(term3143, term3143.getClass(), "jsType", null);
        setField(term3143, term3143.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3143;
        try {
            callMethod(klass, "getFnParameters", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


