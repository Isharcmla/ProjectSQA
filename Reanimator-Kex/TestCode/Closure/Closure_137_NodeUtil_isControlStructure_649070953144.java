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

public class NodeUtil_isControlStructure_649070953144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1030;
     Object term7137;

    public NodeUtil_isControlStructure_649070953144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1043 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1030, term1030.getClass(), "type", -941356098);
        setIntField(term1032, term1032.getClass(), "type", 1374790203);
        setIntField(term1034, term1034.getClass(), "type", 0);
        setField(term1034, term1034.getClass(), "next", null);
        setField(term1034, term1034.getClass(), "first", null);
        setField(term1034, term1034.getClass(), "last", null);
        setField(term1034, term1034.getClass(), "propListHead", null);
        setIntField(term1034, term1034.getClass(), "sourcePosition", 0);
        setField(term1034, term1034.getClass(), "jsType", null);
        setField(term1034, term1034.getClass(), "parent", null);
        setField(term1032, term1032.getClass(), "next", term1034);
        setIntField(term1037, term1037.getClass(), "type", 0);
        setField(term1037, term1037.getClass(), "next", null);
        setField(term1037, term1037.getClass(), "first", null);
        setField(term1037, term1037.getClass(), "last", null);
        setField(term1037, term1037.getClass(), "propListHead", null);
        setIntField(term1037, term1037.getClass(), "sourcePosition", 0);
        setField(term1037, term1037.getClass(), "jsType", null);
        setField(term1037, term1037.getClass(), "parent", null);
        setField(term1032, term1032.getClass(), "first", term1037);
        setIntField(term1040, term1040.getClass(), "type", 0);
        setField(term1040, term1040.getClass(), "next", null);
        setField(term1040, term1040.getClass(), "first", null);
        setField(term1040, term1040.getClass(), "last", null);
        setField(term1040, term1040.getClass(), "propListHead", null);
        setIntField(term1040, term1040.getClass(), "sourcePosition", 0);
        setField(term1040, term1040.getClass(), "jsType", null);
        setField(term1040, term1040.getClass(), "parent", null);
        setField(term1032, term1032.getClass(), "last", term1040);
        setField(term1043, term1043.getClass(), "next", null);
        setIntField(term1043, term1043.getClass(), "type", 0);
        setIntField(term1043, term1043.getClass(), "intValue", 0);
        setField(term1043, term1043.getClass(), "objectValue", null);
        setField(term1032, term1032.getClass(), "propListHead", term1043);
        setIntField(term1032, term1032.getClass(), "sourcePosition", -525570815);
        setField(term1032, term1032.getClass(), "jsType", null);
        setField(term1032, term1032.getClass(), "parent", null);
        setField(term1030, term1030.getClass(), "next", term1032);
        setIntField(term1047, term1047.getClass(), "type", 0);
        setField(term1047, term1047.getClass(), "next", null);
        setField(term1047, term1047.getClass(), "first", null);
        setField(term1047, term1047.getClass(), "last", null);
        setField(term1047, term1047.getClass(), "propListHead", null);
        setIntField(term1047, term1047.getClass(), "sourcePosition", 0);
        setField(term1047, term1047.getClass(), "jsType", null);
        setField(term1047, term1047.getClass(), "parent", null);
        setField(term1030, term1030.getClass(), "first", term1047);
        setIntField(term1050, term1050.getClass(), "type", 0);
        setField(term1050, term1050.getClass(), "next", null);
        setField(term1050, term1050.getClass(), "first", null);
        setField(term1050, term1050.getClass(), "last", null);
        setField(term1050, term1050.getClass(), "propListHead", null);
        setIntField(term1050, term1050.getClass(), "sourcePosition", 0);
        setField(term1050, term1050.getClass(), "jsType", null);
        setField(term1050, term1050.getClass(), "parent", null);
        setField(term1030, term1030.getClass(), "last", term1050);
        setField(term1053, term1053.getClass(), "next", null);
        setIntField(term1053, term1053.getClass(), "type", 0);
        setIntField(term1053, term1053.getClass(), "intValue", 0);
        setField(term1053, term1053.getClass(), "objectValue", null);
        setField(term1030, term1030.getClass(), "propListHead", term1053);
        setIntField(term1030, term1030.getClass(), "sourcePosition", 754055848);
        setField(term1030, term1030.getClass(), "jsType", null);
        setField(term1030, term1030.getClass(), "parent", null);
        term7137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7142 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7145 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7137, term7137.getClass(), "type", -941356098);
        setIntField(term7138, term7138.getClass(), "type", 1374790203);
        setIntField(term7139, term7139.getClass(), "type", 0);
        setField(term7139, term7139.getClass(), "next", null);
        setField(term7139, term7139.getClass(), "first", null);
        setField(term7139, term7139.getClass(), "last", null);
        setField(term7139, term7139.getClass(), "propListHead", null);
        setIntField(term7139, term7139.getClass(), "sourcePosition", 0);
        setField(term7139, term7139.getClass(), "jsType", null);
        setField(term7139, term7139.getClass(), "parent", null);
        setField(term7138, term7138.getClass(), "next", term7139);
        setIntField(term7140, term7140.getClass(), "type", 0);
        setField(term7140, term7140.getClass(), "next", null);
        setField(term7140, term7140.getClass(), "first", null);
        setField(term7140, term7140.getClass(), "last", null);
        setField(term7140, term7140.getClass(), "propListHead", null);
        setIntField(term7140, term7140.getClass(), "sourcePosition", 0);
        setField(term7140, term7140.getClass(), "jsType", null);
        setField(term7140, term7140.getClass(), "parent", null);
        setField(term7138, term7138.getClass(), "first", term7140);
        setIntField(term7141, term7141.getClass(), "type", 0);
        setField(term7141, term7141.getClass(), "next", null);
        setField(term7141, term7141.getClass(), "first", null);
        setField(term7141, term7141.getClass(), "last", null);
        setField(term7141, term7141.getClass(), "propListHead", null);
        setIntField(term7141, term7141.getClass(), "sourcePosition", 0);
        setField(term7141, term7141.getClass(), "jsType", null);
        setField(term7141, term7141.getClass(), "parent", null);
        setField(term7138, term7138.getClass(), "last", term7141);
        setField(term7142, term7142.getClass(), "next", null);
        setIntField(term7142, term7142.getClass(), "type", 0);
        setIntField(term7142, term7142.getClass(), "intValue", 0);
        setField(term7142, term7142.getClass(), "objectValue", null);
        setField(term7138, term7138.getClass(), "propListHead", term7142);
        setIntField(term7138, term7138.getClass(), "sourcePosition", -525570815);
        setField(term7138, term7138.getClass(), "jsType", null);
        setField(term7138, term7138.getClass(), "parent", null);
        setField(term7137, term7137.getClass(), "next", term7138);
        setIntField(term7143, term7143.getClass(), "type", 0);
        setField(term7143, term7143.getClass(), "next", null);
        setField(term7143, term7143.getClass(), "first", null);
        setField(term7143, term7143.getClass(), "last", null);
        setField(term7143, term7143.getClass(), "propListHead", null);
        setIntField(term7143, term7143.getClass(), "sourcePosition", 0);
        setField(term7143, term7143.getClass(), "jsType", null);
        setField(term7143, term7143.getClass(), "parent", null);
        setField(term7137, term7137.getClass(), "first", term7143);
        setIntField(term7144, term7144.getClass(), "type", 0);
        setField(term7144, term7144.getClass(), "next", null);
        setField(term7144, term7144.getClass(), "first", null);
        setField(term7144, term7144.getClass(), "last", null);
        setField(term7144, term7144.getClass(), "propListHead", null);
        setIntField(term7144, term7144.getClass(), "sourcePosition", 0);
        setField(term7144, term7144.getClass(), "jsType", null);
        setField(term7144, term7144.getClass(), "parent", null);
        setField(term7137, term7137.getClass(), "last", term7144);
        setField(term7145, term7145.getClass(), "next", null);
        setIntField(term7145, term7145.getClass(), "type", 0);
        setIntField(term7145, term7145.getClass(), "intValue", 0);
        setField(term7145, term7145.getClass(), "objectValue", null);
        setField(term7137, term7137.getClass(), "propListHead", term7145);
        setIntField(term7137, term7137.getClass(), "sourcePosition", 754055848);
        setField(term7137, term7137.getClass(), "jsType", null);
        setField(term7137, term7137.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1030;
        Object retValue = callMethod(klass, "isControlStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term1030, term7137));
        assertTrue(recursiveEquals(retValue, false));
    }

};


