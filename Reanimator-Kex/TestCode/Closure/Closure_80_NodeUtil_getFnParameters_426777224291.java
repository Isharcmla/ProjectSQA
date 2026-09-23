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

public class NodeUtil_getFnParameters_426777224291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4079;

    public NodeUtil_getFnParameters_426777224291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4092 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4102 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4079, term4079.getClass(), "type", 338342107);
        setIntField(term4081, term4081.getClass(), "type", 252799294);
        setIntField(term4083, term4083.getClass(), "type", 0);
        setField(term4083, term4083.getClass(), "next", null);
        setField(term4083, term4083.getClass(), "first", null);
        setField(term4083, term4083.getClass(), "last", null);
        setField(term4083, term4083.getClass(), "propListHead", null);
        setIntField(term4083, term4083.getClass(), "sourcePosition", 0);
        setField(term4083, term4083.getClass(), "jsType", null);
        setField(term4083, term4083.getClass(), "parent", null);
        setField(term4081, term4081.getClass(), "next", term4083);
        setIntField(term4086, term4086.getClass(), "type", 0);
        setField(term4086, term4086.getClass(), "next", null);
        setField(term4086, term4086.getClass(), "first", null);
        setField(term4086, term4086.getClass(), "last", null);
        setField(term4086, term4086.getClass(), "propListHead", null);
        setIntField(term4086, term4086.getClass(), "sourcePosition", 0);
        setField(term4086, term4086.getClass(), "jsType", null);
        setField(term4086, term4086.getClass(), "parent", null);
        setField(term4081, term4081.getClass(), "first", term4086);
        setIntField(term4089, term4089.getClass(), "type", 0);
        setField(term4089, term4089.getClass(), "next", null);
        setField(term4089, term4089.getClass(), "first", null);
        setField(term4089, term4089.getClass(), "last", null);
        setField(term4089, term4089.getClass(), "propListHead", null);
        setIntField(term4089, term4089.getClass(), "sourcePosition", 0);
        setField(term4089, term4089.getClass(), "jsType", null);
        setField(term4089, term4089.getClass(), "parent", null);
        setField(term4081, term4081.getClass(), "last", term4089);
        setField(term4092, term4092.getClass(), "next", null);
        setIntField(term4092, term4092.getClass(), "type", 0);
        setIntField(term4092, term4092.getClass(), "intValue", 0);
        setField(term4092, term4092.getClass(), "objectValue", null);
        setField(term4081, term4081.getClass(), "propListHead", term4092);
        setIntField(term4081, term4081.getClass(), "sourcePosition", 686286032);
        setField(term4081, term4081.getClass(), "jsType", null);
        setField(term4081, term4081.getClass(), "parent", null);
        setField(term4079, term4079.getClass(), "next", term4081);
        setIntField(term4096, term4096.getClass(), "type", 0);
        setField(term4096, term4096.getClass(), "next", null);
        setField(term4096, term4096.getClass(), "first", null);
        setField(term4096, term4096.getClass(), "last", null);
        setField(term4096, term4096.getClass(), "propListHead", null);
        setIntField(term4096, term4096.getClass(), "sourcePosition", 0);
        setField(term4096, term4096.getClass(), "jsType", null);
        setField(term4096, term4096.getClass(), "parent", null);
        setField(term4079, term4079.getClass(), "first", term4096);
        setIntField(term4099, term4099.getClass(), "type", 0);
        setField(term4099, term4099.getClass(), "next", null);
        setField(term4099, term4099.getClass(), "first", null);
        setField(term4099, term4099.getClass(), "last", null);
        setField(term4099, term4099.getClass(), "propListHead", null);
        setIntField(term4099, term4099.getClass(), "sourcePosition", 0);
        setField(term4099, term4099.getClass(), "jsType", null);
        setField(term4099, term4099.getClass(), "parent", null);
        setField(term4079, term4079.getClass(), "last", term4099);
        setField(term4102, term4102.getClass(), "next", null);
        setIntField(term4102, term4102.getClass(), "type", 0);
        setIntField(term4102, term4102.getClass(), "intValue", 0);
        setField(term4102, term4102.getClass(), "objectValue", null);
        setField(term4079, term4079.getClass(), "propListHead", term4102);
        setIntField(term4079, term4079.getClass(), "sourcePosition", -1277201854);
        setField(term4079, term4079.getClass(), "jsType", null);
        setField(term4079, term4079.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4079;
        try {
            callMethod(klass, "getFnParameters", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


