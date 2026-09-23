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
     Object term20868;

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
        term20868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20873 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20876 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term20868, term20868.getClass(), "type", -1551790945);
        setIntField(term20869, term20869.getClass(), "type", -1897199214);
        setIntField(term20870, term20870.getClass(), "type", 0);
        setField(term20870, term20870.getClass(), "next", null);
        setField(term20870, term20870.getClass(), "first", null);
        setField(term20870, term20870.getClass(), "last", null);
        setField(term20870, term20870.getClass(), "propListHead", null);
        setIntField(term20870, term20870.getClass(), "sourcePosition", 0);
        setField(term20870, term20870.getClass(), "jsType", null);
        setField(term20870, term20870.getClass(), "parent", null);
        setField(term20869, term20869.getClass(), "next", term20870);
        setIntField(term20871, term20871.getClass(), "type", 0);
        setField(term20871, term20871.getClass(), "next", null);
        setField(term20871, term20871.getClass(), "first", null);
        setField(term20871, term20871.getClass(), "last", null);
        setField(term20871, term20871.getClass(), "propListHead", null);
        setIntField(term20871, term20871.getClass(), "sourcePosition", 0);
        setField(term20871, term20871.getClass(), "jsType", null);
        setField(term20871, term20871.getClass(), "parent", null);
        setField(term20869, term20869.getClass(), "first", term20871);
        setIntField(term20872, term20872.getClass(), "type", 0);
        setField(term20872, term20872.getClass(), "next", null);
        setField(term20872, term20872.getClass(), "first", null);
        setField(term20872, term20872.getClass(), "last", null);
        setField(term20872, term20872.getClass(), "propListHead", null);
        setIntField(term20872, term20872.getClass(), "sourcePosition", 0);
        setField(term20872, term20872.getClass(), "jsType", null);
        setField(term20872, term20872.getClass(), "parent", null);
        setField(term20869, term20869.getClass(), "last", term20872);
        setField(term20873, term20873.getClass(), "next", null);
        setIntField(term20873, term20873.getClass(), "type", 0);
        setIntField(term20873, term20873.getClass(), "intValue", 0);
        setField(term20873, term20873.getClass(), "objectValue", null);
        setField(term20869, term20869.getClass(), "propListHead", term20873);
        setIntField(term20869, term20869.getClass(), "sourcePosition", 638046409);
        setField(term20869, term20869.getClass(), "jsType", null);
        setField(term20869, term20869.getClass(), "parent", null);
        setField(term20868, term20868.getClass(), "next", term20869);
        setIntField(term20874, term20874.getClass(), "type", 0);
        setField(term20874, term20874.getClass(), "next", null);
        setField(term20874, term20874.getClass(), "first", null);
        setField(term20874, term20874.getClass(), "last", null);
        setField(term20874, term20874.getClass(), "propListHead", null);
        setIntField(term20874, term20874.getClass(), "sourcePosition", 0);
        setField(term20874, term20874.getClass(), "jsType", null);
        setField(term20874, term20874.getClass(), "parent", null);
        setField(term20868, term20868.getClass(), "first", term20874);
        setIntField(term20875, term20875.getClass(), "type", 0);
        setField(term20875, term20875.getClass(), "next", null);
        setField(term20875, term20875.getClass(), "first", null);
        setField(term20875, term20875.getClass(), "last", null);
        setField(term20875, term20875.getClass(), "propListHead", null);
        setIntField(term20875, term20875.getClass(), "sourcePosition", 0);
        setField(term20875, term20875.getClass(), "jsType", null);
        setField(term20875, term20875.getClass(), "parent", null);
        setField(term20868, term20868.getClass(), "last", term20875);
        setField(term20876, term20876.getClass(), "next", null);
        setIntField(term20876, term20876.getClass(), "type", 0);
        setIntField(term20876, term20876.getClass(), "intValue", 0);
        setField(term20876, term20876.getClass(), "objectValue", null);
        setField(term20868, term20868.getClass(), "propListHead", term20876);
        setIntField(term20868, term20868.getClass(), "sourcePosition", 427274898);
        setField(term20868, term20868.getClass(), "jsType", null);
        setField(term20868, term20868.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3584;
        Object retValue = callMethod(klass, "getPrototypeClassName", argTypes, null, args);
        assertTrue(recursiveEquals(term3584, term20868));
        assertTrue(recursiveEquals(retValue, null));
    }

};


