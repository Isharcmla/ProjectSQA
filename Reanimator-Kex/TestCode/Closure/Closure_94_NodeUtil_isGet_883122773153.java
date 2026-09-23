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

public class NodeUtil_isGet_883122773153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term870;
     Object term8573;

    public NodeUtil_isGet_883122773153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term893 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term870, term870.getClass(), "type", -938508470);
        setIntField(term872, term872.getClass(), "type", -1553893255);
        setIntField(term874, term874.getClass(), "type", 0);
        setField(term874, term874.getClass(), "next", null);
        setField(term874, term874.getClass(), "first", null);
        setField(term874, term874.getClass(), "last", null);
        setField(term874, term874.getClass(), "propListHead", null);
        setIntField(term874, term874.getClass(), "sourcePosition", 0);
        setField(term874, term874.getClass(), "jsType", null);
        setField(term874, term874.getClass(), "parent", null);
        setField(term872, term872.getClass(), "next", term874);
        setIntField(term877, term877.getClass(), "type", 0);
        setField(term877, term877.getClass(), "next", null);
        setField(term877, term877.getClass(), "first", null);
        setField(term877, term877.getClass(), "last", null);
        setField(term877, term877.getClass(), "propListHead", null);
        setIntField(term877, term877.getClass(), "sourcePosition", 0);
        setField(term877, term877.getClass(), "jsType", null);
        setField(term877, term877.getClass(), "parent", null);
        setField(term872, term872.getClass(), "first", term877);
        setIntField(term880, term880.getClass(), "type", 0);
        setField(term880, term880.getClass(), "next", null);
        setField(term880, term880.getClass(), "first", null);
        setField(term880, term880.getClass(), "last", null);
        setField(term880, term880.getClass(), "propListHead", null);
        setIntField(term880, term880.getClass(), "sourcePosition", 0);
        setField(term880, term880.getClass(), "jsType", null);
        setField(term880, term880.getClass(), "parent", null);
        setField(term872, term872.getClass(), "last", term880);
        setField(term883, term883.getClass(), "next", null);
        setIntField(term883, term883.getClass(), "type", 0);
        setIntField(term883, term883.getClass(), "intValue", 0);
        setField(term883, term883.getClass(), "objectValue", null);
        setField(term872, term872.getClass(), "propListHead", term883);
        setIntField(term872, term872.getClass(), "sourcePosition", -434468428);
        setField(term872, term872.getClass(), "jsType", null);
        setField(term872, term872.getClass(), "parent", null);
        setField(term870, term870.getClass(), "next", term872);
        setIntField(term887, term887.getClass(), "type", 0);
        setField(term887, term887.getClass(), "next", null);
        setField(term887, term887.getClass(), "first", null);
        setField(term887, term887.getClass(), "last", null);
        setField(term887, term887.getClass(), "propListHead", null);
        setIntField(term887, term887.getClass(), "sourcePosition", 0);
        setField(term887, term887.getClass(), "jsType", null);
        setField(term887, term887.getClass(), "parent", null);
        setField(term870, term870.getClass(), "first", term887);
        setIntField(term890, term890.getClass(), "type", 0);
        setField(term890, term890.getClass(), "next", null);
        setField(term890, term890.getClass(), "first", null);
        setField(term890, term890.getClass(), "last", null);
        setField(term890, term890.getClass(), "propListHead", null);
        setIntField(term890, term890.getClass(), "sourcePosition", 0);
        setField(term890, term890.getClass(), "jsType", null);
        setField(term890, term890.getClass(), "parent", null);
        setField(term870, term870.getClass(), "last", term890);
        setField(term893, term893.getClass(), "next", null);
        setIntField(term893, term893.getClass(), "type", 0);
        setIntField(term893, term893.getClass(), "intValue", 0);
        setField(term893, term893.getClass(), "objectValue", null);
        setField(term870, term870.getClass(), "propListHead", term893);
        setIntField(term870, term870.getClass(), "sourcePosition", 1559605714);
        setField(term870, term870.getClass(), "jsType", null);
        setField(term870, term870.getClass(), "parent", null);
        term8573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8578 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8581 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8573, term8573.getClass(), "type", -938508470);
        setIntField(term8574, term8574.getClass(), "type", -1553893255);
        setIntField(term8575, term8575.getClass(), "type", 0);
        setField(term8575, term8575.getClass(), "next", null);
        setField(term8575, term8575.getClass(), "first", null);
        setField(term8575, term8575.getClass(), "last", null);
        setField(term8575, term8575.getClass(), "propListHead", null);
        setIntField(term8575, term8575.getClass(), "sourcePosition", 0);
        setField(term8575, term8575.getClass(), "jsType", null);
        setField(term8575, term8575.getClass(), "parent", null);
        setField(term8574, term8574.getClass(), "next", term8575);
        setIntField(term8576, term8576.getClass(), "type", 0);
        setField(term8576, term8576.getClass(), "next", null);
        setField(term8576, term8576.getClass(), "first", null);
        setField(term8576, term8576.getClass(), "last", null);
        setField(term8576, term8576.getClass(), "propListHead", null);
        setIntField(term8576, term8576.getClass(), "sourcePosition", 0);
        setField(term8576, term8576.getClass(), "jsType", null);
        setField(term8576, term8576.getClass(), "parent", null);
        setField(term8574, term8574.getClass(), "first", term8576);
        setIntField(term8577, term8577.getClass(), "type", 0);
        setField(term8577, term8577.getClass(), "next", null);
        setField(term8577, term8577.getClass(), "first", null);
        setField(term8577, term8577.getClass(), "last", null);
        setField(term8577, term8577.getClass(), "propListHead", null);
        setIntField(term8577, term8577.getClass(), "sourcePosition", 0);
        setField(term8577, term8577.getClass(), "jsType", null);
        setField(term8577, term8577.getClass(), "parent", null);
        setField(term8574, term8574.getClass(), "last", term8577);
        setField(term8578, term8578.getClass(), "next", null);
        setIntField(term8578, term8578.getClass(), "type", 0);
        setIntField(term8578, term8578.getClass(), "intValue", 0);
        setField(term8578, term8578.getClass(), "objectValue", null);
        setField(term8574, term8574.getClass(), "propListHead", term8578);
        setIntField(term8574, term8574.getClass(), "sourcePosition", -434468428);
        setField(term8574, term8574.getClass(), "jsType", null);
        setField(term8574, term8574.getClass(), "parent", null);
        setField(term8573, term8573.getClass(), "next", term8574);
        setIntField(term8579, term8579.getClass(), "type", 0);
        setField(term8579, term8579.getClass(), "next", null);
        setField(term8579, term8579.getClass(), "first", null);
        setField(term8579, term8579.getClass(), "last", null);
        setField(term8579, term8579.getClass(), "propListHead", null);
        setIntField(term8579, term8579.getClass(), "sourcePosition", 0);
        setField(term8579, term8579.getClass(), "jsType", null);
        setField(term8579, term8579.getClass(), "parent", null);
        setField(term8573, term8573.getClass(), "first", term8579);
        setIntField(term8580, term8580.getClass(), "type", 0);
        setField(term8580, term8580.getClass(), "next", null);
        setField(term8580, term8580.getClass(), "first", null);
        setField(term8580, term8580.getClass(), "last", null);
        setField(term8580, term8580.getClass(), "propListHead", null);
        setIntField(term8580, term8580.getClass(), "sourcePosition", 0);
        setField(term8580, term8580.getClass(), "jsType", null);
        setField(term8580, term8580.getClass(), "parent", null);
        setField(term8573, term8573.getClass(), "last", term8580);
        setField(term8581, term8581.getClass(), "next", null);
        setIntField(term8581, term8581.getClass(), "type", 0);
        setIntField(term8581, term8581.getClass(), "intValue", 0);
        setField(term8581, term8581.getClass(), "objectValue", null);
        setField(term8573, term8573.getClass(), "propListHead", term8581);
        setIntField(term8573, term8573.getClass(), "sourcePosition", 1559605714);
        setField(term8573, term8573.getClass(), "jsType", null);
        setField(term8573, term8573.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term870;
        Object retValue = callMethod(klass, "isGet", argTypes, null, args);
        assertTrue(recursiveEquals(term870, term8573));
        assertTrue(recursiveEquals(retValue, false));
    }

};


