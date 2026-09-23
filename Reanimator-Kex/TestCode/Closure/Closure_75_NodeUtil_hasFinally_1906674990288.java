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

public class NodeUtil_hasFinally_1906674990288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3998;

    public NodeUtil_hasFinally_1906674990288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4011 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4021 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3998, term3998.getClass(), "type", -992847709);
        setIntField(term4000, term4000.getClass(), "type", 1769496642);
        setIntField(term4002, term4002.getClass(), "type", 0);
        setField(term4002, term4002.getClass(), "next", null);
        setField(term4002, term4002.getClass(), "first", null);
        setField(term4002, term4002.getClass(), "last", null);
        setField(term4002, term4002.getClass(), "propListHead", null);
        setIntField(term4002, term4002.getClass(), "sourcePosition", 0);
        setField(term4002, term4002.getClass(), "jsType", null);
        setField(term4002, term4002.getClass(), "parent", null);
        setField(term4000, term4000.getClass(), "next", term4002);
        setIntField(term4005, term4005.getClass(), "type", 0);
        setField(term4005, term4005.getClass(), "next", null);
        setField(term4005, term4005.getClass(), "first", null);
        setField(term4005, term4005.getClass(), "last", null);
        setField(term4005, term4005.getClass(), "propListHead", null);
        setIntField(term4005, term4005.getClass(), "sourcePosition", 0);
        setField(term4005, term4005.getClass(), "jsType", null);
        setField(term4005, term4005.getClass(), "parent", null);
        setField(term4000, term4000.getClass(), "first", term4005);
        setIntField(term4008, term4008.getClass(), "type", 0);
        setField(term4008, term4008.getClass(), "next", null);
        setField(term4008, term4008.getClass(), "first", null);
        setField(term4008, term4008.getClass(), "last", null);
        setField(term4008, term4008.getClass(), "propListHead", null);
        setIntField(term4008, term4008.getClass(), "sourcePosition", 0);
        setField(term4008, term4008.getClass(), "jsType", null);
        setField(term4008, term4008.getClass(), "parent", null);
        setField(term4000, term4000.getClass(), "last", term4008);
        setField(term4011, term4011.getClass(), "next", null);
        setIntField(term4011, term4011.getClass(), "type", 0);
        setIntField(term4011, term4011.getClass(), "intValue", 0);
        setField(term4011, term4011.getClass(), "objectValue", null);
        setField(term4000, term4000.getClass(), "propListHead", term4011);
        setIntField(term4000, term4000.getClass(), "sourcePosition", 752858379);
        setField(term4000, term4000.getClass(), "jsType", null);
        setField(term4000, term4000.getClass(), "parent", null);
        setField(term3998, term3998.getClass(), "next", term4000);
        setIntField(term4015, term4015.getClass(), "type", 0);
        setField(term4015, term4015.getClass(), "next", null);
        setField(term4015, term4015.getClass(), "first", null);
        setField(term4015, term4015.getClass(), "last", null);
        setField(term4015, term4015.getClass(), "propListHead", null);
        setIntField(term4015, term4015.getClass(), "sourcePosition", 0);
        setField(term4015, term4015.getClass(), "jsType", null);
        setField(term4015, term4015.getClass(), "parent", null);
        setField(term3998, term3998.getClass(), "first", term4015);
        setIntField(term4018, term4018.getClass(), "type", 0);
        setField(term4018, term4018.getClass(), "next", null);
        setField(term4018, term4018.getClass(), "first", null);
        setField(term4018, term4018.getClass(), "last", null);
        setField(term4018, term4018.getClass(), "propListHead", null);
        setIntField(term4018, term4018.getClass(), "sourcePosition", 0);
        setField(term4018, term4018.getClass(), "jsType", null);
        setField(term4018, term4018.getClass(), "parent", null);
        setField(term3998, term3998.getClass(), "last", term4018);
        setField(term4021, term4021.getClass(), "next", null);
        setIntField(term4021, term4021.getClass(), "type", 0);
        setIntField(term4021, term4021.getClass(), "intValue", 0);
        setField(term4021, term4021.getClass(), "objectValue", null);
        setField(term3998, term3998.getClass(), "propListHead", term4021);
        setIntField(term3998, term3998.getClass(), "sourcePosition", -370819357);
        setField(term3998, term3998.getClass(), "jsType", null);
        setField(term3998, term3998.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3998;
        try {
            callMethod(klass, "hasFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


