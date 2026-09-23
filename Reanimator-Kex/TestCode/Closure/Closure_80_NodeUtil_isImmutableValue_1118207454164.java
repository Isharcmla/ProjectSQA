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

public class NodeUtil_isImmutableValue_1118207454164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263;
     Object term6811;

    public NodeUtil_isImmutableValue_1118207454164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term286 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term263, term263.getClass(), "type", -1347665717);
        setIntField(term265, term265.getClass(), "type", -268815336);
        setIntField(term267, term267.getClass(), "type", 0);
        setField(term267, term267.getClass(), "next", null);
        setField(term267, term267.getClass(), "first", null);
        setField(term267, term267.getClass(), "last", null);
        setField(term267, term267.getClass(), "propListHead", null);
        setIntField(term267, term267.getClass(), "sourcePosition", 0);
        setField(term267, term267.getClass(), "jsType", null);
        setField(term267, term267.getClass(), "parent", null);
        setField(term265, term265.getClass(), "next", term267);
        setIntField(term270, term270.getClass(), "type", 0);
        setField(term270, term270.getClass(), "next", null);
        setField(term270, term270.getClass(), "first", null);
        setField(term270, term270.getClass(), "last", null);
        setField(term270, term270.getClass(), "propListHead", null);
        setIntField(term270, term270.getClass(), "sourcePosition", 0);
        setField(term270, term270.getClass(), "jsType", null);
        setField(term270, term270.getClass(), "parent", null);
        setField(term265, term265.getClass(), "first", term270);
        setIntField(term273, term273.getClass(), "type", 0);
        setField(term273, term273.getClass(), "next", null);
        setField(term273, term273.getClass(), "first", null);
        setField(term273, term273.getClass(), "last", null);
        setField(term273, term273.getClass(), "propListHead", null);
        setIntField(term273, term273.getClass(), "sourcePosition", 0);
        setField(term273, term273.getClass(), "jsType", null);
        setField(term273, term273.getClass(), "parent", null);
        setField(term265, term265.getClass(), "last", term273);
        setField(term276, term276.getClass(), "next", null);
        setIntField(term276, term276.getClass(), "type", 0);
        setIntField(term276, term276.getClass(), "intValue", 0);
        setField(term276, term276.getClass(), "objectValue", null);
        setField(term265, term265.getClass(), "propListHead", term276);
        setIntField(term265, term265.getClass(), "sourcePosition", 339854490);
        setField(term265, term265.getClass(), "jsType", null);
        setField(term265, term265.getClass(), "parent", null);
        setField(term263, term263.getClass(), "next", term265);
        setIntField(term280, term280.getClass(), "type", 0);
        setField(term280, term280.getClass(), "next", null);
        setField(term280, term280.getClass(), "first", null);
        setField(term280, term280.getClass(), "last", null);
        setField(term280, term280.getClass(), "propListHead", null);
        setIntField(term280, term280.getClass(), "sourcePosition", 0);
        setField(term280, term280.getClass(), "jsType", null);
        setField(term280, term280.getClass(), "parent", null);
        setField(term263, term263.getClass(), "first", term280);
        setIntField(term283, term283.getClass(), "type", 0);
        setField(term283, term283.getClass(), "next", null);
        setField(term283, term283.getClass(), "first", null);
        setField(term283, term283.getClass(), "last", null);
        setField(term283, term283.getClass(), "propListHead", null);
        setIntField(term283, term283.getClass(), "sourcePosition", 0);
        setField(term283, term283.getClass(), "jsType", null);
        setField(term283, term283.getClass(), "parent", null);
        setField(term263, term263.getClass(), "last", term283);
        setField(term286, term286.getClass(), "next", null);
        setIntField(term286, term286.getClass(), "type", 0);
        setIntField(term286, term286.getClass(), "intValue", 0);
        setField(term286, term286.getClass(), "objectValue", null);
        setField(term263, term263.getClass(), "propListHead", term286);
        setIntField(term263, term263.getClass(), "sourcePosition", -615654495);
        setField(term263, term263.getClass(), "jsType", null);
        setField(term263, term263.getClass(), "parent", null);
        term6811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6816 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6819 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6811, term6811.getClass(), "type", -1347665717);
        setIntField(term6812, term6812.getClass(), "type", -268815336);
        setIntField(term6813, term6813.getClass(), "type", 0);
        setField(term6813, term6813.getClass(), "next", null);
        setField(term6813, term6813.getClass(), "first", null);
        setField(term6813, term6813.getClass(), "last", null);
        setField(term6813, term6813.getClass(), "propListHead", null);
        setIntField(term6813, term6813.getClass(), "sourcePosition", 0);
        setField(term6813, term6813.getClass(), "jsType", null);
        setField(term6813, term6813.getClass(), "parent", null);
        setField(term6812, term6812.getClass(), "next", term6813);
        setIntField(term6814, term6814.getClass(), "type", 0);
        setField(term6814, term6814.getClass(), "next", null);
        setField(term6814, term6814.getClass(), "first", null);
        setField(term6814, term6814.getClass(), "last", null);
        setField(term6814, term6814.getClass(), "propListHead", null);
        setIntField(term6814, term6814.getClass(), "sourcePosition", 0);
        setField(term6814, term6814.getClass(), "jsType", null);
        setField(term6814, term6814.getClass(), "parent", null);
        setField(term6812, term6812.getClass(), "first", term6814);
        setIntField(term6815, term6815.getClass(), "type", 0);
        setField(term6815, term6815.getClass(), "next", null);
        setField(term6815, term6815.getClass(), "first", null);
        setField(term6815, term6815.getClass(), "last", null);
        setField(term6815, term6815.getClass(), "propListHead", null);
        setIntField(term6815, term6815.getClass(), "sourcePosition", 0);
        setField(term6815, term6815.getClass(), "jsType", null);
        setField(term6815, term6815.getClass(), "parent", null);
        setField(term6812, term6812.getClass(), "last", term6815);
        setField(term6816, term6816.getClass(), "next", null);
        setIntField(term6816, term6816.getClass(), "type", 0);
        setIntField(term6816, term6816.getClass(), "intValue", 0);
        setField(term6816, term6816.getClass(), "objectValue", null);
        setField(term6812, term6812.getClass(), "propListHead", term6816);
        setIntField(term6812, term6812.getClass(), "sourcePosition", 339854490);
        setField(term6812, term6812.getClass(), "jsType", null);
        setField(term6812, term6812.getClass(), "parent", null);
        setField(term6811, term6811.getClass(), "next", term6812);
        setIntField(term6817, term6817.getClass(), "type", 0);
        setField(term6817, term6817.getClass(), "next", null);
        setField(term6817, term6817.getClass(), "first", null);
        setField(term6817, term6817.getClass(), "last", null);
        setField(term6817, term6817.getClass(), "propListHead", null);
        setIntField(term6817, term6817.getClass(), "sourcePosition", 0);
        setField(term6817, term6817.getClass(), "jsType", null);
        setField(term6817, term6817.getClass(), "parent", null);
        setField(term6811, term6811.getClass(), "first", term6817);
        setIntField(term6818, term6818.getClass(), "type", 0);
        setField(term6818, term6818.getClass(), "next", null);
        setField(term6818, term6818.getClass(), "first", null);
        setField(term6818, term6818.getClass(), "last", null);
        setField(term6818, term6818.getClass(), "propListHead", null);
        setIntField(term6818, term6818.getClass(), "sourcePosition", 0);
        setField(term6818, term6818.getClass(), "jsType", null);
        setField(term6818, term6818.getClass(), "parent", null);
        setField(term6811, term6811.getClass(), "last", term6818);
        setField(term6819, term6819.getClass(), "next", null);
        setIntField(term6819, term6819.getClass(), "type", 0);
        setIntField(term6819, term6819.getClass(), "intValue", 0);
        setField(term6819, term6819.getClass(), "objectValue", null);
        setField(term6811, term6811.getClass(), "propListHead", term6819);
        setIntField(term6811, term6811.getClass(), "sourcePosition", -615654495);
        setField(term6811, term6811.getClass(), "jsType", null);
        setField(term6811, term6811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term263;
        Object retValue = callMethod(klass, "isImmutableValue", argTypes, null, args);
        assertTrue(recursiveEquals(term263, term6811));
        assertTrue(recursiveEquals(retValue, false));
    }

};


