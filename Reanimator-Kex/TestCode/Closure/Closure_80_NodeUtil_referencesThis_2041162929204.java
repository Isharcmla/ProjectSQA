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

public class NodeUtil_referencesThis_2041162929204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1298;
     Object term11544;

    public NodeUtil_referencesThis_2041162929204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1311 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1321 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1298, term1298.getClass(), "type", -1982489643);
        setIntField(term1300, term1300.getClass(), "type", -1622760744);
        setIntField(term1302, term1302.getClass(), "type", 0);
        setField(term1302, term1302.getClass(), "next", null);
        setField(term1302, term1302.getClass(), "first", null);
        setField(term1302, term1302.getClass(), "last", null);
        setField(term1302, term1302.getClass(), "propListHead", null);
        setIntField(term1302, term1302.getClass(), "sourcePosition", 0);
        setField(term1302, term1302.getClass(), "jsType", null);
        setField(term1302, term1302.getClass(), "parent", null);
        setField(term1300, term1300.getClass(), "next", term1302);
        setIntField(term1305, term1305.getClass(), "type", 0);
        setField(term1305, term1305.getClass(), "next", null);
        setField(term1305, term1305.getClass(), "first", null);
        setField(term1305, term1305.getClass(), "last", null);
        setField(term1305, term1305.getClass(), "propListHead", null);
        setIntField(term1305, term1305.getClass(), "sourcePosition", 0);
        setField(term1305, term1305.getClass(), "jsType", null);
        setField(term1305, term1305.getClass(), "parent", null);
        setField(term1300, term1300.getClass(), "first", term1305);
        setIntField(term1308, term1308.getClass(), "type", 0);
        setField(term1308, term1308.getClass(), "next", null);
        setField(term1308, term1308.getClass(), "first", null);
        setField(term1308, term1308.getClass(), "last", null);
        setField(term1308, term1308.getClass(), "propListHead", null);
        setIntField(term1308, term1308.getClass(), "sourcePosition", 0);
        setField(term1308, term1308.getClass(), "jsType", null);
        setField(term1308, term1308.getClass(), "parent", null);
        setField(term1300, term1300.getClass(), "last", term1308);
        setField(term1311, term1311.getClass(), "next", null);
        setIntField(term1311, term1311.getClass(), "type", 0);
        setIntField(term1311, term1311.getClass(), "intValue", 0);
        setField(term1311, term1311.getClass(), "objectValue", null);
        setField(term1300, term1300.getClass(), "propListHead", term1311);
        setIntField(term1300, term1300.getClass(), "sourcePosition", 895255351);
        setField(term1300, term1300.getClass(), "jsType", null);
        setField(term1300, term1300.getClass(), "parent", null);
        setField(term1298, term1298.getClass(), "next", term1300);
        setIntField(term1315, term1315.getClass(), "type", 0);
        setField(term1315, term1315.getClass(), "next", null);
        setField(term1315, term1315.getClass(), "first", null);
        setField(term1315, term1315.getClass(), "last", null);
        setField(term1315, term1315.getClass(), "propListHead", null);
        setIntField(term1315, term1315.getClass(), "sourcePosition", 0);
        setField(term1315, term1315.getClass(), "jsType", null);
        setField(term1315, term1315.getClass(), "parent", null);
        setField(term1298, term1298.getClass(), "first", term1315);
        setIntField(term1318, term1318.getClass(), "type", 0);
        setField(term1318, term1318.getClass(), "next", null);
        setField(term1318, term1318.getClass(), "first", null);
        setField(term1318, term1318.getClass(), "last", null);
        setField(term1318, term1318.getClass(), "propListHead", null);
        setIntField(term1318, term1318.getClass(), "sourcePosition", 0);
        setField(term1318, term1318.getClass(), "jsType", null);
        setField(term1318, term1318.getClass(), "parent", null);
        setField(term1298, term1298.getClass(), "last", term1318);
        setField(term1321, term1321.getClass(), "next", null);
        setIntField(term1321, term1321.getClass(), "type", 0);
        setIntField(term1321, term1321.getClass(), "intValue", 0);
        setField(term1321, term1321.getClass(), "objectValue", null);
        setField(term1298, term1298.getClass(), "propListHead", term1321);
        setIntField(term1298, term1298.getClass(), "sourcePosition", -1317044799);
        setField(term1298, term1298.getClass(), "jsType", null);
        setField(term1298, term1298.getClass(), "parent", null);
        term11544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11549 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11552 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11544, term11544.getClass(), "type", -1982489643);
        setIntField(term11545, term11545.getClass(), "type", -1622760744);
        setIntField(term11546, term11546.getClass(), "type", 0);
        setField(term11546, term11546.getClass(), "next", null);
        setField(term11546, term11546.getClass(), "first", null);
        setField(term11546, term11546.getClass(), "last", null);
        setField(term11546, term11546.getClass(), "propListHead", null);
        setIntField(term11546, term11546.getClass(), "sourcePosition", 0);
        setField(term11546, term11546.getClass(), "jsType", null);
        setField(term11546, term11546.getClass(), "parent", null);
        setField(term11545, term11545.getClass(), "next", term11546);
        setIntField(term11547, term11547.getClass(), "type", 0);
        setField(term11547, term11547.getClass(), "next", null);
        setField(term11547, term11547.getClass(), "first", null);
        setField(term11547, term11547.getClass(), "last", null);
        setField(term11547, term11547.getClass(), "propListHead", null);
        setIntField(term11547, term11547.getClass(), "sourcePosition", 0);
        setField(term11547, term11547.getClass(), "jsType", null);
        setField(term11547, term11547.getClass(), "parent", null);
        setField(term11545, term11545.getClass(), "first", term11547);
        setIntField(term11548, term11548.getClass(), "type", 0);
        setField(term11548, term11548.getClass(), "next", null);
        setField(term11548, term11548.getClass(), "first", null);
        setField(term11548, term11548.getClass(), "last", null);
        setField(term11548, term11548.getClass(), "propListHead", null);
        setIntField(term11548, term11548.getClass(), "sourcePosition", 0);
        setField(term11548, term11548.getClass(), "jsType", null);
        setField(term11548, term11548.getClass(), "parent", null);
        setField(term11545, term11545.getClass(), "last", term11548);
        setField(term11549, term11549.getClass(), "next", null);
        setIntField(term11549, term11549.getClass(), "type", 0);
        setIntField(term11549, term11549.getClass(), "intValue", 0);
        setField(term11549, term11549.getClass(), "objectValue", null);
        setField(term11545, term11545.getClass(), "propListHead", term11549);
        setIntField(term11545, term11545.getClass(), "sourcePosition", 895255351);
        setField(term11545, term11545.getClass(), "jsType", null);
        setField(term11545, term11545.getClass(), "parent", null);
        setField(term11544, term11544.getClass(), "next", term11545);
        setIntField(term11550, term11550.getClass(), "type", 0);
        setField(term11550, term11550.getClass(), "next", null);
        setField(term11550, term11550.getClass(), "first", null);
        setField(term11550, term11550.getClass(), "last", null);
        setField(term11550, term11550.getClass(), "propListHead", null);
        setIntField(term11550, term11550.getClass(), "sourcePosition", 0);
        setField(term11550, term11550.getClass(), "jsType", null);
        setField(term11550, term11550.getClass(), "parent", null);
        setField(term11544, term11544.getClass(), "first", term11550);
        setIntField(term11551, term11551.getClass(), "type", 0);
        setField(term11551, term11551.getClass(), "next", null);
        setField(term11551, term11551.getClass(), "first", null);
        setField(term11551, term11551.getClass(), "last", null);
        setField(term11551, term11551.getClass(), "propListHead", null);
        setIntField(term11551, term11551.getClass(), "sourcePosition", 0);
        setField(term11551, term11551.getClass(), "jsType", null);
        setField(term11551, term11551.getClass(), "parent", null);
        setField(term11544, term11544.getClass(), "last", term11551);
        setField(term11552, term11552.getClass(), "next", null);
        setIntField(term11552, term11552.getClass(), "type", 0);
        setIntField(term11552, term11552.getClass(), "intValue", 0);
        setField(term11552, term11552.getClass(), "objectValue", null);
        setField(term11544, term11544.getClass(), "propListHead", term11552);
        setIntField(term11544, term11544.getClass(), "sourcePosition", -1317044799);
        setField(term11544, term11544.getClass(), "jsType", null);
        setField(term11544, term11544.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1298;
        callMethod(klass, "referencesThis", argTypes, null, args);
        assertTrue(recursiveEquals(term1298, term11544));
    }

};


