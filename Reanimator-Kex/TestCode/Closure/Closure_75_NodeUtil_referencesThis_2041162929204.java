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
     Object term11838;

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
        term11838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11843 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11846 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11838, term11838.getClass(), "type", -1982489643);
        setIntField(term11839, term11839.getClass(), "type", -1622760744);
        setIntField(term11840, term11840.getClass(), "type", 0);
        setField(term11840, term11840.getClass(), "next", null);
        setField(term11840, term11840.getClass(), "first", null);
        setField(term11840, term11840.getClass(), "last", null);
        setField(term11840, term11840.getClass(), "propListHead", null);
        setIntField(term11840, term11840.getClass(), "sourcePosition", 0);
        setField(term11840, term11840.getClass(), "jsType", null);
        setField(term11840, term11840.getClass(), "parent", null);
        setField(term11839, term11839.getClass(), "next", term11840);
        setIntField(term11841, term11841.getClass(), "type", 0);
        setField(term11841, term11841.getClass(), "next", null);
        setField(term11841, term11841.getClass(), "first", null);
        setField(term11841, term11841.getClass(), "last", null);
        setField(term11841, term11841.getClass(), "propListHead", null);
        setIntField(term11841, term11841.getClass(), "sourcePosition", 0);
        setField(term11841, term11841.getClass(), "jsType", null);
        setField(term11841, term11841.getClass(), "parent", null);
        setField(term11839, term11839.getClass(), "first", term11841);
        setIntField(term11842, term11842.getClass(), "type", 0);
        setField(term11842, term11842.getClass(), "next", null);
        setField(term11842, term11842.getClass(), "first", null);
        setField(term11842, term11842.getClass(), "last", null);
        setField(term11842, term11842.getClass(), "propListHead", null);
        setIntField(term11842, term11842.getClass(), "sourcePosition", 0);
        setField(term11842, term11842.getClass(), "jsType", null);
        setField(term11842, term11842.getClass(), "parent", null);
        setField(term11839, term11839.getClass(), "last", term11842);
        setField(term11843, term11843.getClass(), "next", null);
        setIntField(term11843, term11843.getClass(), "type", 0);
        setIntField(term11843, term11843.getClass(), "intValue", 0);
        setField(term11843, term11843.getClass(), "objectValue", null);
        setField(term11839, term11839.getClass(), "propListHead", term11843);
        setIntField(term11839, term11839.getClass(), "sourcePosition", 895255351);
        setField(term11839, term11839.getClass(), "jsType", null);
        setField(term11839, term11839.getClass(), "parent", null);
        setField(term11838, term11838.getClass(), "next", term11839);
        setIntField(term11844, term11844.getClass(), "type", 0);
        setField(term11844, term11844.getClass(), "next", null);
        setField(term11844, term11844.getClass(), "first", null);
        setField(term11844, term11844.getClass(), "last", null);
        setField(term11844, term11844.getClass(), "propListHead", null);
        setIntField(term11844, term11844.getClass(), "sourcePosition", 0);
        setField(term11844, term11844.getClass(), "jsType", null);
        setField(term11844, term11844.getClass(), "parent", null);
        setField(term11838, term11838.getClass(), "first", term11844);
        setIntField(term11845, term11845.getClass(), "type", 0);
        setField(term11845, term11845.getClass(), "next", null);
        setField(term11845, term11845.getClass(), "first", null);
        setField(term11845, term11845.getClass(), "last", null);
        setField(term11845, term11845.getClass(), "propListHead", null);
        setIntField(term11845, term11845.getClass(), "sourcePosition", 0);
        setField(term11845, term11845.getClass(), "jsType", null);
        setField(term11845, term11845.getClass(), "parent", null);
        setField(term11838, term11838.getClass(), "last", term11845);
        setField(term11846, term11846.getClass(), "next", null);
        setIntField(term11846, term11846.getClass(), "type", 0);
        setIntField(term11846, term11846.getClass(), "intValue", 0);
        setField(term11846, term11846.getClass(), "objectValue", null);
        setField(term11838, term11838.getClass(), "propListHead", term11846);
        setIntField(term11838, term11838.getClass(), "sourcePosition", -1317044799);
        setField(term11838, term11838.getClass(), "jsType", null);
        setField(term11838, term11838.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1298;
        callMethod(klass, "referencesThis", argTypes, null, args);
        assertTrue(recursiveEquals(term1298, term11838));
    }

};


