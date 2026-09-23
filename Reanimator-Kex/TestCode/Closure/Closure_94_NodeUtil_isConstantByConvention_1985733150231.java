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
import java.lang.Object;

public class NodeUtil_isConstantByConvention_1985733150231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3409;
     Object term3436;

    public NodeUtil_isConstantByConvention_1985733150231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3422 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3432 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3409, term3409.getClass(), "type", 1016087323);
        setIntField(term3411, term3411.getClass(), "type", 1765633108);
        setIntField(term3413, term3413.getClass(), "type", 0);
        setField(term3413, term3413.getClass(), "next", null);
        setField(term3413, term3413.getClass(), "first", null);
        setField(term3413, term3413.getClass(), "last", null);
        setField(term3413, term3413.getClass(), "propListHead", null);
        setIntField(term3413, term3413.getClass(), "sourcePosition", 0);
        setField(term3413, term3413.getClass(), "jsType", null);
        setField(term3413, term3413.getClass(), "parent", null);
        setField(term3411, term3411.getClass(), "next", term3413);
        setIntField(term3416, term3416.getClass(), "type", 0);
        setField(term3416, term3416.getClass(), "next", null);
        setField(term3416, term3416.getClass(), "first", null);
        setField(term3416, term3416.getClass(), "last", null);
        setField(term3416, term3416.getClass(), "propListHead", null);
        setIntField(term3416, term3416.getClass(), "sourcePosition", 0);
        setField(term3416, term3416.getClass(), "jsType", null);
        setField(term3416, term3416.getClass(), "parent", null);
        setField(term3411, term3411.getClass(), "first", term3416);
        setIntField(term3419, term3419.getClass(), "type", 0);
        setField(term3419, term3419.getClass(), "next", null);
        setField(term3419, term3419.getClass(), "first", null);
        setField(term3419, term3419.getClass(), "last", null);
        setField(term3419, term3419.getClass(), "propListHead", null);
        setIntField(term3419, term3419.getClass(), "sourcePosition", 0);
        setField(term3419, term3419.getClass(), "jsType", null);
        setField(term3419, term3419.getClass(), "parent", null);
        setField(term3411, term3411.getClass(), "last", term3419);
        setField(term3422, term3422.getClass(), "next", null);
        setIntField(term3422, term3422.getClass(), "type", 0);
        setIntField(term3422, term3422.getClass(), "intValue", 0);
        setField(term3422, term3422.getClass(), "objectValue", null);
        setField(term3411, term3411.getClass(), "propListHead", term3422);
        setIntField(term3411, term3411.getClass(), "sourcePosition", -1331169079);
        setField(term3411, term3411.getClass(), "jsType", null);
        setField(term3411, term3411.getClass(), "parent", null);
        setField(term3409, term3409.getClass(), "next", term3411);
        setIntField(term3426, term3426.getClass(), "type", 0);
        setField(term3426, term3426.getClass(), "next", null);
        setField(term3426, term3426.getClass(), "first", null);
        setField(term3426, term3426.getClass(), "last", null);
        setField(term3426, term3426.getClass(), "propListHead", null);
        setIntField(term3426, term3426.getClass(), "sourcePosition", 0);
        setField(term3426, term3426.getClass(), "jsType", null);
        setField(term3426, term3426.getClass(), "parent", null);
        setField(term3409, term3409.getClass(), "first", term3426);
        setIntField(term3429, term3429.getClass(), "type", 0);
        setField(term3429, term3429.getClass(), "next", null);
        setField(term3429, term3429.getClass(), "first", null);
        setField(term3429, term3429.getClass(), "last", null);
        setField(term3429, term3429.getClass(), "propListHead", null);
        setIntField(term3429, term3429.getClass(), "sourcePosition", 0);
        setField(term3429, term3429.getClass(), "jsType", null);
        setField(term3429, term3429.getClass(), "parent", null);
        setField(term3409, term3409.getClass(), "last", term3429);
        setField(term3432, term3432.getClass(), "next", null);
        setIntField(term3432, term3432.getClass(), "type", 0);
        setIntField(term3432, term3432.getClass(), "intValue", 0);
        setField(term3432, term3432.getClass(), "objectValue", null);
        setField(term3409, term3409.getClass(), "propListHead", term3432);
        setIntField(term3409, term3409.getClass(), "sourcePosition", 1109050836);
        setField(term3409, term3409.getClass(), "jsType", null);
        setField(term3409, term3409.getClass(), "parent", null);
        term3436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3449 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3459 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3436, term3436.getClass(), "type", 1329150584);
        setIntField(term3438, term3438.getClass(), "type", 953387911);
        setIntField(term3440, term3440.getClass(), "type", 0);
        setField(term3440, term3440.getClass(), "next", null);
        setField(term3440, term3440.getClass(), "first", null);
        setField(term3440, term3440.getClass(), "last", null);
        setField(term3440, term3440.getClass(), "propListHead", null);
        setIntField(term3440, term3440.getClass(), "sourcePosition", 0);
        setField(term3440, term3440.getClass(), "jsType", null);
        setField(term3440, term3440.getClass(), "parent", null);
        setField(term3438, term3438.getClass(), "next", term3440);
        setIntField(term3443, term3443.getClass(), "type", 0);
        setField(term3443, term3443.getClass(), "next", null);
        setField(term3443, term3443.getClass(), "first", null);
        setField(term3443, term3443.getClass(), "last", null);
        setField(term3443, term3443.getClass(), "propListHead", null);
        setIntField(term3443, term3443.getClass(), "sourcePosition", 0);
        setField(term3443, term3443.getClass(), "jsType", null);
        setField(term3443, term3443.getClass(), "parent", null);
        setField(term3438, term3438.getClass(), "first", term3443);
        setIntField(term3446, term3446.getClass(), "type", 0);
        setField(term3446, term3446.getClass(), "next", null);
        setField(term3446, term3446.getClass(), "first", null);
        setField(term3446, term3446.getClass(), "last", null);
        setField(term3446, term3446.getClass(), "propListHead", null);
        setIntField(term3446, term3446.getClass(), "sourcePosition", 0);
        setField(term3446, term3446.getClass(), "jsType", null);
        setField(term3446, term3446.getClass(), "parent", null);
        setField(term3438, term3438.getClass(), "last", term3446);
        setField(term3449, term3449.getClass(), "next", null);
        setIntField(term3449, term3449.getClass(), "type", 0);
        setIntField(term3449, term3449.getClass(), "intValue", 0);
        setField(term3449, term3449.getClass(), "objectValue", null);
        setField(term3438, term3438.getClass(), "propListHead", term3449);
        setIntField(term3438, term3438.getClass(), "sourcePosition", -159489307);
        setField(term3438, term3438.getClass(), "jsType", null);
        setField(term3438, term3438.getClass(), "parent", null);
        setField(term3436, term3436.getClass(), "next", term3438);
        setIntField(term3453, term3453.getClass(), "type", 0);
        setField(term3453, term3453.getClass(), "next", null);
        setField(term3453, term3453.getClass(), "first", null);
        setField(term3453, term3453.getClass(), "last", null);
        setField(term3453, term3453.getClass(), "propListHead", null);
        setIntField(term3453, term3453.getClass(), "sourcePosition", 0);
        setField(term3453, term3453.getClass(), "jsType", null);
        setField(term3453, term3453.getClass(), "parent", null);
        setField(term3436, term3436.getClass(), "first", term3453);
        setIntField(term3456, term3456.getClass(), "type", 0);
        setField(term3456, term3456.getClass(), "next", null);
        setField(term3456, term3456.getClass(), "first", null);
        setField(term3456, term3456.getClass(), "last", null);
        setField(term3456, term3456.getClass(), "propListHead", null);
        setIntField(term3456, term3456.getClass(), "sourcePosition", 0);
        setField(term3456, term3456.getClass(), "jsType", null);
        setField(term3456, term3456.getClass(), "parent", null);
        setField(term3436, term3436.getClass(), "last", term3456);
        setField(term3459, term3459.getClass(), "next", null);
        setIntField(term3459, term3459.getClass(), "type", 0);
        setIntField(term3459, term3459.getClass(), "intValue", 0);
        setField(term3459, term3459.getClass(), "objectValue", null);
        setField(term3436, term3436.getClass(), "propListHead", term3459);
        setIntField(term3436, term3436.getClass(), "sourcePosition", 1317020952);
        setField(term3436, term3436.getClass(), "jsType", null);
        setField(term3436, term3436.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3409;
        args[2] = term3436;
        try {
            callMethod(klass, "isConstantByConvention", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


