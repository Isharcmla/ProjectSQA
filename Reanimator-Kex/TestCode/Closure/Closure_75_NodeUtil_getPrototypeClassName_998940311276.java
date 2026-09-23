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

public class NodeUtil_getPrototypeClassName_998940311276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3584;
     Object term20915;

    public NodeUtil_getPrototypeClassName_998940311276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3597 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3607 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3584, term3584.getClass(), "type", -1551790945);
        setIntField(term3586, term3586.getClass(), "type", -1897199214);
        setIntField(term3588, term3588.getClass(), "type", 0);
        setField(term3588, term3588.getClass(), "next", null);
        setField(term3588, term3588.getClass(), "first", null);
        setField(term3588, term3588.getClass(), "last", null);
        setField(term3588, term3588.getClass(), "propListHead", null);
        setIntField(term3588, term3588.getClass(), "sourcePosition", 0);
        setField(term3588, term3588.getClass(), "jsType", null);
        setField(term3588, term3588.getClass(), "parent", null);
        setField(term3586, term3586.getClass(), "next", term3588);
        setIntField(term3591, term3591.getClass(), "type", 0);
        setField(term3591, term3591.getClass(), "next", null);
        setField(term3591, term3591.getClass(), "first", null);
        setField(term3591, term3591.getClass(), "last", null);
        setField(term3591, term3591.getClass(), "propListHead", null);
        setIntField(term3591, term3591.getClass(), "sourcePosition", 0);
        setField(term3591, term3591.getClass(), "jsType", null);
        setField(term3591, term3591.getClass(), "parent", null);
        setField(term3586, term3586.getClass(), "first", term3591);
        setIntField(term3594, term3594.getClass(), "type", 0);
        setField(term3594, term3594.getClass(), "next", null);
        setField(term3594, term3594.getClass(), "first", null);
        setField(term3594, term3594.getClass(), "last", null);
        setField(term3594, term3594.getClass(), "propListHead", null);
        setIntField(term3594, term3594.getClass(), "sourcePosition", 0);
        setField(term3594, term3594.getClass(), "jsType", null);
        setField(term3594, term3594.getClass(), "parent", null);
        setField(term3586, term3586.getClass(), "last", term3594);
        setField(term3597, term3597.getClass(), "next", null);
        setIntField(term3597, term3597.getClass(), "type", 0);
        setIntField(term3597, term3597.getClass(), "intValue", 0);
        setField(term3597, term3597.getClass(), "objectValue", null);
        setField(term3586, term3586.getClass(), "propListHead", term3597);
        setIntField(term3586, term3586.getClass(), "sourcePosition", 638046409);
        setField(term3586, term3586.getClass(), "jsType", null);
        setField(term3586, term3586.getClass(), "parent", null);
        setField(term3584, term3584.getClass(), "next", term3586);
        setIntField(term3601, term3601.getClass(), "type", 0);
        setField(term3601, term3601.getClass(), "next", null);
        setField(term3601, term3601.getClass(), "first", null);
        setField(term3601, term3601.getClass(), "last", null);
        setField(term3601, term3601.getClass(), "propListHead", null);
        setIntField(term3601, term3601.getClass(), "sourcePosition", 0);
        setField(term3601, term3601.getClass(), "jsType", null);
        setField(term3601, term3601.getClass(), "parent", null);
        setField(term3584, term3584.getClass(), "first", term3601);
        setIntField(term3604, term3604.getClass(), "type", 0);
        setField(term3604, term3604.getClass(), "next", null);
        setField(term3604, term3604.getClass(), "first", null);
        setField(term3604, term3604.getClass(), "last", null);
        setField(term3604, term3604.getClass(), "propListHead", null);
        setIntField(term3604, term3604.getClass(), "sourcePosition", 0);
        setField(term3604, term3604.getClass(), "jsType", null);
        setField(term3604, term3604.getClass(), "parent", null);
        setField(term3584, term3584.getClass(), "last", term3604);
        setField(term3607, term3607.getClass(), "next", null);
        setIntField(term3607, term3607.getClass(), "type", 0);
        setIntField(term3607, term3607.getClass(), "intValue", 0);
        setField(term3607, term3607.getClass(), "objectValue", null);
        setField(term3584, term3584.getClass(), "propListHead", term3607);
        setIntField(term3584, term3584.getClass(), "sourcePosition", 427274898);
        setField(term3584, term3584.getClass(), "jsType", null);
        setField(term3584, term3584.getClass(), "parent", null);
        term20915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20920 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20923 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term20915, term20915.getClass(), "type", -1551790945);
        setIntField(term20916, term20916.getClass(), "type", -1897199214);
        setIntField(term20917, term20917.getClass(), "type", 0);
        setField(term20917, term20917.getClass(), "next", null);
        setField(term20917, term20917.getClass(), "first", null);
        setField(term20917, term20917.getClass(), "last", null);
        setField(term20917, term20917.getClass(), "propListHead", null);
        setIntField(term20917, term20917.getClass(), "sourcePosition", 0);
        setField(term20917, term20917.getClass(), "jsType", null);
        setField(term20917, term20917.getClass(), "parent", null);
        setField(term20916, term20916.getClass(), "next", term20917);
        setIntField(term20918, term20918.getClass(), "type", 0);
        setField(term20918, term20918.getClass(), "next", null);
        setField(term20918, term20918.getClass(), "first", null);
        setField(term20918, term20918.getClass(), "last", null);
        setField(term20918, term20918.getClass(), "propListHead", null);
        setIntField(term20918, term20918.getClass(), "sourcePosition", 0);
        setField(term20918, term20918.getClass(), "jsType", null);
        setField(term20918, term20918.getClass(), "parent", null);
        setField(term20916, term20916.getClass(), "first", term20918);
        setIntField(term20919, term20919.getClass(), "type", 0);
        setField(term20919, term20919.getClass(), "next", null);
        setField(term20919, term20919.getClass(), "first", null);
        setField(term20919, term20919.getClass(), "last", null);
        setField(term20919, term20919.getClass(), "propListHead", null);
        setIntField(term20919, term20919.getClass(), "sourcePosition", 0);
        setField(term20919, term20919.getClass(), "jsType", null);
        setField(term20919, term20919.getClass(), "parent", null);
        setField(term20916, term20916.getClass(), "last", term20919);
        setField(term20920, term20920.getClass(), "next", null);
        setIntField(term20920, term20920.getClass(), "type", 0);
        setIntField(term20920, term20920.getClass(), "intValue", 0);
        setField(term20920, term20920.getClass(), "objectValue", null);
        setField(term20916, term20916.getClass(), "propListHead", term20920);
        setIntField(term20916, term20916.getClass(), "sourcePosition", 638046409);
        setField(term20916, term20916.getClass(), "jsType", null);
        setField(term20916, term20916.getClass(), "parent", null);
        setField(term20915, term20915.getClass(), "next", term20916);
        setIntField(term20921, term20921.getClass(), "type", 0);
        setField(term20921, term20921.getClass(), "next", null);
        setField(term20921, term20921.getClass(), "first", null);
        setField(term20921, term20921.getClass(), "last", null);
        setField(term20921, term20921.getClass(), "propListHead", null);
        setIntField(term20921, term20921.getClass(), "sourcePosition", 0);
        setField(term20921, term20921.getClass(), "jsType", null);
        setField(term20921, term20921.getClass(), "parent", null);
        setField(term20915, term20915.getClass(), "first", term20921);
        setIntField(term20922, term20922.getClass(), "type", 0);
        setField(term20922, term20922.getClass(), "next", null);
        setField(term20922, term20922.getClass(), "first", null);
        setField(term20922, term20922.getClass(), "last", null);
        setField(term20922, term20922.getClass(), "propListHead", null);
        setIntField(term20922, term20922.getClass(), "sourcePosition", 0);
        setField(term20922, term20922.getClass(), "jsType", null);
        setField(term20922, term20922.getClass(), "parent", null);
        setField(term20915, term20915.getClass(), "last", term20922);
        setField(term20923, term20923.getClass(), "next", null);
        setIntField(term20923, term20923.getClass(), "type", 0);
        setIntField(term20923, term20923.getClass(), "intValue", 0);
        setField(term20923, term20923.getClass(), "objectValue", null);
        setField(term20915, term20915.getClass(), "propListHead", term20923);
        setIntField(term20915, term20915.getClass(), "sourcePosition", 427274898);
        setField(term20915, term20915.getClass(), "jsType", null);
        setField(term20915, term20915.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3584;
        Object retValue = callMethod(klass, "getPrototypeClassName", argTypes, null, args);
        assertTrue(recursiveEquals(term3584, term20915));
        assertTrue(recursiveEquals(retValue, null));
    }

};


