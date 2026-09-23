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

public class NodeUtil_getAddingRoot_820874009262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3002;

    public NodeUtil_getAddingRoot_820874009262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3015 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3025 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3002, term3002.getClass(), "type", -1123526433);
        setIntField(term3004, term3004.getClass(), "type", -329141819);
        setIntField(term3006, term3006.getClass(), "type", 0);
        setField(term3006, term3006.getClass(), "next", null);
        setField(term3006, term3006.getClass(), "first", null);
        setField(term3006, term3006.getClass(), "last", null);
        setField(term3006, term3006.getClass(), "propListHead", null);
        setIntField(term3006, term3006.getClass(), "sourcePosition", 0);
        setField(term3006, term3006.getClass(), "jsType", null);
        setField(term3006, term3006.getClass(), "parent", null);
        setField(term3004, term3004.getClass(), "next", term3006);
        setIntField(term3009, term3009.getClass(), "type", 0);
        setField(term3009, term3009.getClass(), "next", null);
        setField(term3009, term3009.getClass(), "first", null);
        setField(term3009, term3009.getClass(), "last", null);
        setField(term3009, term3009.getClass(), "propListHead", null);
        setIntField(term3009, term3009.getClass(), "sourcePosition", 0);
        setField(term3009, term3009.getClass(), "jsType", null);
        setField(term3009, term3009.getClass(), "parent", null);
        setField(term3004, term3004.getClass(), "first", term3009);
        setIntField(term3012, term3012.getClass(), "type", 0);
        setField(term3012, term3012.getClass(), "next", null);
        setField(term3012, term3012.getClass(), "first", null);
        setField(term3012, term3012.getClass(), "last", null);
        setField(term3012, term3012.getClass(), "propListHead", null);
        setIntField(term3012, term3012.getClass(), "sourcePosition", 0);
        setField(term3012, term3012.getClass(), "jsType", null);
        setField(term3012, term3012.getClass(), "parent", null);
        setField(term3004, term3004.getClass(), "last", term3012);
        setField(term3015, term3015.getClass(), "next", null);
        setIntField(term3015, term3015.getClass(), "type", 0);
        setIntField(term3015, term3015.getClass(), "intValue", 0);
        setField(term3015, term3015.getClass(), "objectValue", null);
        setField(term3004, term3004.getClass(), "propListHead", term3015);
        setIntField(term3004, term3004.getClass(), "sourcePosition", -777833461);
        setField(term3004, term3004.getClass(), "jsType", null);
        setField(term3004, term3004.getClass(), "parent", null);
        setField(term3002, term3002.getClass(), "next", term3004);
        setIntField(term3019, term3019.getClass(), "type", 0);
        setField(term3019, term3019.getClass(), "next", null);
        setField(term3019, term3019.getClass(), "first", null);
        setField(term3019, term3019.getClass(), "last", null);
        setField(term3019, term3019.getClass(), "propListHead", null);
        setIntField(term3019, term3019.getClass(), "sourcePosition", 0);
        setField(term3019, term3019.getClass(), "jsType", null);
        setField(term3019, term3019.getClass(), "parent", null);
        setField(term3002, term3002.getClass(), "first", term3019);
        setIntField(term3022, term3022.getClass(), "type", 0);
        setField(term3022, term3022.getClass(), "next", null);
        setField(term3022, term3022.getClass(), "first", null);
        setField(term3022, term3022.getClass(), "last", null);
        setField(term3022, term3022.getClass(), "propListHead", null);
        setIntField(term3022, term3022.getClass(), "sourcePosition", 0);
        setField(term3022, term3022.getClass(), "jsType", null);
        setField(term3022, term3022.getClass(), "parent", null);
        setField(term3002, term3002.getClass(), "last", term3022);
        setField(term3025, term3025.getClass(), "next", null);
        setIntField(term3025, term3025.getClass(), "type", 0);
        setIntField(term3025, term3025.getClass(), "intValue", 0);
        setField(term3025, term3025.getClass(), "objectValue", null);
        setField(term3002, term3002.getClass(), "propListHead", term3025);
        setIntField(term3002, term3002.getClass(), "sourcePosition", 1583691829);
        setField(term3002, term3002.getClass(), "jsType", null);
        setField(term3002, term3002.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3002;
        try {
            callMethod(klass, "getAddingRoot", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


