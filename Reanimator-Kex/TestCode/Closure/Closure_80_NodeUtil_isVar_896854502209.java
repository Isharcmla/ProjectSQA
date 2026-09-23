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

public class NodeUtil_isVar_896854502209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1433;
     Object term11745;

    public NodeUtil_isVar_896854502209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1446 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1456 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1433, term1433.getClass(), "type", -1794965320);
        setIntField(term1435, term1435.getClass(), "type", 1091954101);
        setIntField(term1437, term1437.getClass(), "type", 0);
        setField(term1437, term1437.getClass(), "next", null);
        setField(term1437, term1437.getClass(), "first", null);
        setField(term1437, term1437.getClass(), "last", null);
        setField(term1437, term1437.getClass(), "propListHead", null);
        setIntField(term1437, term1437.getClass(), "sourcePosition", 0);
        setField(term1437, term1437.getClass(), "jsType", null);
        setField(term1437, term1437.getClass(), "parent", null);
        setField(term1435, term1435.getClass(), "next", term1437);
        setIntField(term1440, term1440.getClass(), "type", 0);
        setField(term1440, term1440.getClass(), "next", null);
        setField(term1440, term1440.getClass(), "first", null);
        setField(term1440, term1440.getClass(), "last", null);
        setField(term1440, term1440.getClass(), "propListHead", null);
        setIntField(term1440, term1440.getClass(), "sourcePosition", 0);
        setField(term1440, term1440.getClass(), "jsType", null);
        setField(term1440, term1440.getClass(), "parent", null);
        setField(term1435, term1435.getClass(), "first", term1440);
        setIntField(term1443, term1443.getClass(), "type", 0);
        setField(term1443, term1443.getClass(), "next", null);
        setField(term1443, term1443.getClass(), "first", null);
        setField(term1443, term1443.getClass(), "last", null);
        setField(term1443, term1443.getClass(), "propListHead", null);
        setIntField(term1443, term1443.getClass(), "sourcePosition", 0);
        setField(term1443, term1443.getClass(), "jsType", null);
        setField(term1443, term1443.getClass(), "parent", null);
        setField(term1435, term1435.getClass(), "last", term1443);
        setField(term1446, term1446.getClass(), "next", null);
        setIntField(term1446, term1446.getClass(), "type", 0);
        setIntField(term1446, term1446.getClass(), "intValue", 0);
        setField(term1446, term1446.getClass(), "objectValue", null);
        setField(term1435, term1435.getClass(), "propListHead", term1446);
        setIntField(term1435, term1435.getClass(), "sourcePosition", 732174235);
        setField(term1435, term1435.getClass(), "jsType", null);
        setField(term1435, term1435.getClass(), "parent", null);
        setField(term1433, term1433.getClass(), "next", term1435);
        setIntField(term1450, term1450.getClass(), "type", 0);
        setField(term1450, term1450.getClass(), "next", null);
        setField(term1450, term1450.getClass(), "first", null);
        setField(term1450, term1450.getClass(), "last", null);
        setField(term1450, term1450.getClass(), "propListHead", null);
        setIntField(term1450, term1450.getClass(), "sourcePosition", 0);
        setField(term1450, term1450.getClass(), "jsType", null);
        setField(term1450, term1450.getClass(), "parent", null);
        setField(term1433, term1433.getClass(), "first", term1450);
        setIntField(term1453, term1453.getClass(), "type", 0);
        setField(term1453, term1453.getClass(), "next", null);
        setField(term1453, term1453.getClass(), "first", null);
        setField(term1453, term1453.getClass(), "last", null);
        setField(term1453, term1453.getClass(), "propListHead", null);
        setIntField(term1453, term1453.getClass(), "sourcePosition", 0);
        setField(term1453, term1453.getClass(), "jsType", null);
        setField(term1453, term1453.getClass(), "parent", null);
        setField(term1433, term1433.getClass(), "last", term1453);
        setField(term1456, term1456.getClass(), "next", null);
        setIntField(term1456, term1456.getClass(), "type", 0);
        setIntField(term1456, term1456.getClass(), "intValue", 0);
        setField(term1456, term1456.getClass(), "objectValue", null);
        setField(term1433, term1433.getClass(), "propListHead", term1456);
        setIntField(term1433, term1433.getClass(), "sourcePosition", 470895808);
        setField(term1433, term1433.getClass(), "jsType", null);
        setField(term1433, term1433.getClass(), "parent", null);
        term11745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11750 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11753 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11745, term11745.getClass(), "type", -1794965320);
        setIntField(term11746, term11746.getClass(), "type", 1091954101);
        setIntField(term11747, term11747.getClass(), "type", 0);
        setField(term11747, term11747.getClass(), "next", null);
        setField(term11747, term11747.getClass(), "first", null);
        setField(term11747, term11747.getClass(), "last", null);
        setField(term11747, term11747.getClass(), "propListHead", null);
        setIntField(term11747, term11747.getClass(), "sourcePosition", 0);
        setField(term11747, term11747.getClass(), "jsType", null);
        setField(term11747, term11747.getClass(), "parent", null);
        setField(term11746, term11746.getClass(), "next", term11747);
        setIntField(term11748, term11748.getClass(), "type", 0);
        setField(term11748, term11748.getClass(), "next", null);
        setField(term11748, term11748.getClass(), "first", null);
        setField(term11748, term11748.getClass(), "last", null);
        setField(term11748, term11748.getClass(), "propListHead", null);
        setIntField(term11748, term11748.getClass(), "sourcePosition", 0);
        setField(term11748, term11748.getClass(), "jsType", null);
        setField(term11748, term11748.getClass(), "parent", null);
        setField(term11746, term11746.getClass(), "first", term11748);
        setIntField(term11749, term11749.getClass(), "type", 0);
        setField(term11749, term11749.getClass(), "next", null);
        setField(term11749, term11749.getClass(), "first", null);
        setField(term11749, term11749.getClass(), "last", null);
        setField(term11749, term11749.getClass(), "propListHead", null);
        setIntField(term11749, term11749.getClass(), "sourcePosition", 0);
        setField(term11749, term11749.getClass(), "jsType", null);
        setField(term11749, term11749.getClass(), "parent", null);
        setField(term11746, term11746.getClass(), "last", term11749);
        setField(term11750, term11750.getClass(), "next", null);
        setIntField(term11750, term11750.getClass(), "type", 0);
        setIntField(term11750, term11750.getClass(), "intValue", 0);
        setField(term11750, term11750.getClass(), "objectValue", null);
        setField(term11746, term11746.getClass(), "propListHead", term11750);
        setIntField(term11746, term11746.getClass(), "sourcePosition", 732174235);
        setField(term11746, term11746.getClass(), "jsType", null);
        setField(term11746, term11746.getClass(), "parent", null);
        setField(term11745, term11745.getClass(), "next", term11746);
        setIntField(term11751, term11751.getClass(), "type", 0);
        setField(term11751, term11751.getClass(), "next", null);
        setField(term11751, term11751.getClass(), "first", null);
        setField(term11751, term11751.getClass(), "last", null);
        setField(term11751, term11751.getClass(), "propListHead", null);
        setIntField(term11751, term11751.getClass(), "sourcePosition", 0);
        setField(term11751, term11751.getClass(), "jsType", null);
        setField(term11751, term11751.getClass(), "parent", null);
        setField(term11745, term11745.getClass(), "first", term11751);
        setIntField(term11752, term11752.getClass(), "type", 0);
        setField(term11752, term11752.getClass(), "next", null);
        setField(term11752, term11752.getClass(), "first", null);
        setField(term11752, term11752.getClass(), "last", null);
        setField(term11752, term11752.getClass(), "propListHead", null);
        setIntField(term11752, term11752.getClass(), "sourcePosition", 0);
        setField(term11752, term11752.getClass(), "jsType", null);
        setField(term11752, term11752.getClass(), "parent", null);
        setField(term11745, term11745.getClass(), "last", term11752);
        setField(term11753, term11753.getClass(), "next", null);
        setIntField(term11753, term11753.getClass(), "type", 0);
        setIntField(term11753, term11753.getClass(), "intValue", 0);
        setField(term11753, term11753.getClass(), "objectValue", null);
        setField(term11745, term11745.getClass(), "propListHead", term11753);
        setIntField(term11745, term11745.getClass(), "sourcePosition", 470895808);
        setField(term11745, term11745.getClass(), "jsType", null);
        setField(term11745, term11745.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1433;
        Object retValue = callMethod(klass, "isVar", argTypes, null, args);
        assertTrue(recursiveEquals(term1433, term11745));
        assertTrue(recursiveEquals(retValue, false));
    }

};


