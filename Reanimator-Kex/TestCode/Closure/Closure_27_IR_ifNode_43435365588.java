package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_ifNode_43435365588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;
     Object term407;

    public IR_ifNode_43435365588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term380, term380.getClass(), "type", -1222006000);
        setIntField(term382, term382.getClass(), "type", 2095798786);
        setIntField(term384, term384.getClass(), "type", -1565502840);
        setIntField(term386, term386.getClass(), "type", 344323424);
        setIntField(term388, term388.getClass(), "type", 9726679);
        setField(term388, term388.getClass(), "next", null);
        setField(term388, term388.getClass(), "first", null);
        setField(term388, term388.getClass(), "last", null);
        setField(term388, term388.getClass(), "propListHead", null);
        setIntField(term388, term388.getClass(), "sourcePosition", 0);
        setField(term388, term388.getClass(), "jsType", null);
        setField(term388, term388.getClass(), "parent", null);
        setField(term386, term386.getClass(), "next", term388);
        setIntField(term391, term391.getClass(), "type", -25637976);
        setField(term391, term391.getClass(), "next", null);
        setField(term391, term391.getClass(), "first", null);
        setField(term391, term391.getClass(), "last", term388);
        setField(term391, term391.getClass(), "propListHead", null);
        setIntField(term391, term391.getClass(), "sourcePosition", 0);
        setField(term391, term391.getClass(), "jsType", null);
        setField(term391, term391.getClass(), "parent", null);
        setField(term386, term386.getClass(), "first", term391);
        setField(term386, term386.getClass(), "last", term384);
        setField(term386, term386.getClass(), "propListHead", null);
        setIntField(term386, term386.getClass(), "sourcePosition", 0);
        setField(term386, term386.getClass(), "jsType", null);
        setField(term386, term386.getClass(), "parent", null);
        setField(term384, term384.getClass(), "next", term386);
        setField(term384, term384.getClass(), "first", term388);
        setIntField(term395, term395.getClass(), "type", 202001407);
        setIntField(term397, term397.getClass(), "type", 158873461);
        setField(term397, term397.getClass(), "next", null);
        setField(term397, term397.getClass(), "first", term391);
        setField(term397, term397.getClass(), "last", term386);
        setField(term397, term397.getClass(), "propListHead", null);
        setIntField(term397, term397.getClass(), "sourcePosition", 0);
        setField(term397, term397.getClass(), "jsType", null);
        setField(term397, term397.getClass(), "parent", null);
        setField(term395, term395.getClass(), "next", term397);
        setField(term395, term395.getClass(), "first", term382);
        setField(term395, term395.getClass(), "last", term382);
        setField(term395, term395.getClass(), "propListHead", null);
        setIntField(term395, term395.getClass(), "sourcePosition", 0);
        setField(term395, term395.getClass(), "jsType", null);
        setField(term395, term395.getClass(), "parent", null);
        setField(term384, term384.getClass(), "last", term395);
        setField(term384, term384.getClass(), "propListHead", null);
        setIntField(term384, term384.getClass(), "sourcePosition", 0);
        setField(term384, term384.getClass(), "jsType", null);
        setField(term384, term384.getClass(), "parent", null);
        setField(term382, term382.getClass(), "next", term384);
        setIntField(term402, term402.getClass(), "type", -430151637);
        setField(term402, term402.getClass(), "next", term395);
        setField(term402, term402.getClass(), "first", term397);
        setField(term402, term402.getClass(), "last", term380);
        setField(term402, term402.getClass(), "propListHead", null);
        setIntField(term402, term402.getClass(), "sourcePosition", 0);
        setField(term402, term402.getClass(), "jsType", null);
        setField(term402, term402.getClass(), "parent", null);
        setField(term382, term382.getClass(), "first", term402);
        setField(term382, term382.getClass(), "last", term402);
        setField(term382, term382.getClass(), "propListHead", null);
        setIntField(term382, term382.getClass(), "sourcePosition", 0);
        setField(term382, term382.getClass(), "jsType", null);
        setField(term382, term382.getClass(), "parent", null);
        setField(term380, term380.getClass(), "next", term382);
        setField(term380, term380.getClass(), "first", term386);
        setField(term380, term380.getClass(), "last", term388);
        setField(term380, term380.getClass(), "propListHead", null);
        setIntField(term380, term380.getClass(), "sourcePosition", 0);
        setField(term380, term380.getClass(), "jsType", null);
        setField(term380, term380.getClass(), "parent", null);
        term407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term407, term407.getClass(), "type", -1697741339);
        setIntField(term409, term409.getClass(), "type", 98922530);
        setIntField(term411, term411.getClass(), "type", -1388471422);
        setIntField(term413, term413.getClass(), "type", -1498296052);
        setIntField(term415, term415.getClass(), "type", 2098647989);
        setField(term415, term415.getClass(), "next", null);
        setField(term415, term415.getClass(), "first", null);
        setField(term415, term415.getClass(), "last", null);
        setField(term415, term415.getClass(), "propListHead", null);
        setIntField(term415, term415.getClass(), "sourcePosition", 0);
        setField(term415, term415.getClass(), "jsType", null);
        setField(term415, term415.getClass(), "parent", null);
        setField(term413, term413.getClass(), "next", term415);
        setIntField(term418, term418.getClass(), "type", 1598895173);
        setField(term418, term418.getClass(), "next", null);
        setField(term418, term418.getClass(), "first", null);
        setField(term418, term418.getClass(), "last", term415);
        setField(term418, term418.getClass(), "propListHead", null);
        setIntField(term418, term418.getClass(), "sourcePosition", 0);
        setField(term418, term418.getClass(), "jsType", null);
        setField(term418, term418.getClass(), "parent", null);
        setField(term413, term413.getClass(), "first", term418);
        setField(term413, term413.getClass(), "last", term411);
        setField(term413, term413.getClass(), "propListHead", null);
        setIntField(term413, term413.getClass(), "sourcePosition", 0);
        setField(term413, term413.getClass(), "jsType", null);
        setField(term413, term413.getClass(), "parent", null);
        setField(term411, term411.getClass(), "next", term413);
        setField(term411, term411.getClass(), "first", term415);
        setIntField(term422, term422.getClass(), "type", -227365013);
        setIntField(term424, term424.getClass(), "type", 11724947);
        setField(term424, term424.getClass(), "next", null);
        setField(term424, term424.getClass(), "first", term418);
        setField(term424, term424.getClass(), "last", term413);
        setField(term424, term424.getClass(), "propListHead", null);
        setIntField(term424, term424.getClass(), "sourcePosition", 0);
        setField(term424, term424.getClass(), "jsType", null);
        setField(term424, term424.getClass(), "parent", null);
        setField(term422, term422.getClass(), "next", term424);
        setField(term422, term422.getClass(), "first", term409);
        setField(term422, term422.getClass(), "last", term409);
        setField(term422, term422.getClass(), "propListHead", null);
        setIntField(term422, term422.getClass(), "sourcePosition", 0);
        setField(term422, term422.getClass(), "jsType", null);
        setField(term422, term422.getClass(), "parent", null);
        setField(term411, term411.getClass(), "last", term422);
        setField(term411, term411.getClass(), "propListHead", null);
        setIntField(term411, term411.getClass(), "sourcePosition", 0);
        setField(term411, term411.getClass(), "jsType", null);
        setField(term411, term411.getClass(), "parent", null);
        setField(term409, term409.getClass(), "next", term411);
        setIntField(term429, term429.getClass(), "type", 1953277050);
        setField(term429, term429.getClass(), "next", term422);
        setField(term429, term429.getClass(), "first", term424);
        setField(term429, term429.getClass(), "last", term407);
        setField(term429, term429.getClass(), "propListHead", null);
        setIntField(term429, term429.getClass(), "sourcePosition", 0);
        setField(term429, term429.getClass(), "jsType", null);
        setField(term429, term429.getClass(), "parent", null);
        setField(term409, term409.getClass(), "first", term429);
        setField(term409, term409.getClass(), "last", term429);
        setField(term409, term409.getClass(), "propListHead", null);
        setIntField(term409, term409.getClass(), "sourcePosition", 0);
        setField(term409, term409.getClass(), "jsType", null);
        setField(term409, term409.getClass(), "parent", null);
        setField(term407, term407.getClass(), "next", term409);
        setField(term407, term407.getClass(), "first", term413);
        setField(term407, term407.getClass(), "last", term415);
        setField(term407, term407.getClass(), "propListHead", null);
        setIntField(term407, term407.getClass(), "sourcePosition", 0);
        setField(term407, term407.getClass(), "jsType", null);
        setField(term407, term407.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term380;
        args[1] = term407;
        try {
            callMethod(klass, "ifNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


