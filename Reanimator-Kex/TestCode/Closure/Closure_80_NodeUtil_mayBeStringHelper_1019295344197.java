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

public class NodeUtil_mayBeStringHelper_1019295344197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1159;
     Object term10873;

    public NodeUtil_mayBeStringHelper_1019295344197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1172 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1182 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1159, term1159.getClass(), "type", 243280944);
        setIntField(term1161, term1161.getClass(), "type", 202214133);
        setIntField(term1163, term1163.getClass(), "type", 0);
        setField(term1163, term1163.getClass(), "next", null);
        setField(term1163, term1163.getClass(), "first", null);
        setField(term1163, term1163.getClass(), "last", null);
        setField(term1163, term1163.getClass(), "propListHead", null);
        setIntField(term1163, term1163.getClass(), "sourcePosition", 0);
        setField(term1163, term1163.getClass(), "jsType", null);
        setField(term1163, term1163.getClass(), "parent", null);
        setField(term1161, term1161.getClass(), "next", term1163);
        setIntField(term1166, term1166.getClass(), "type", 0);
        setField(term1166, term1166.getClass(), "next", null);
        setField(term1166, term1166.getClass(), "first", null);
        setField(term1166, term1166.getClass(), "last", null);
        setField(term1166, term1166.getClass(), "propListHead", null);
        setIntField(term1166, term1166.getClass(), "sourcePosition", 0);
        setField(term1166, term1166.getClass(), "jsType", null);
        setField(term1166, term1166.getClass(), "parent", null);
        setField(term1161, term1161.getClass(), "first", term1166);
        setIntField(term1169, term1169.getClass(), "type", 0);
        setField(term1169, term1169.getClass(), "next", null);
        setField(term1169, term1169.getClass(), "first", null);
        setField(term1169, term1169.getClass(), "last", null);
        setField(term1169, term1169.getClass(), "propListHead", null);
        setIntField(term1169, term1169.getClass(), "sourcePosition", 0);
        setField(term1169, term1169.getClass(), "jsType", null);
        setField(term1169, term1169.getClass(), "parent", null);
        setField(term1161, term1161.getClass(), "last", term1169);
        setField(term1172, term1172.getClass(), "next", null);
        setIntField(term1172, term1172.getClass(), "type", 0);
        setIntField(term1172, term1172.getClass(), "intValue", 0);
        setField(term1172, term1172.getClass(), "objectValue", null);
        setField(term1161, term1161.getClass(), "propListHead", term1172);
        setIntField(term1161, term1161.getClass(), "sourcePosition", -222941705);
        setField(term1161, term1161.getClass(), "jsType", null);
        setField(term1161, term1161.getClass(), "parent", null);
        setField(term1159, term1159.getClass(), "next", term1161);
        setIntField(term1176, term1176.getClass(), "type", 0);
        setField(term1176, term1176.getClass(), "next", null);
        setField(term1176, term1176.getClass(), "first", null);
        setField(term1176, term1176.getClass(), "last", null);
        setField(term1176, term1176.getClass(), "propListHead", null);
        setIntField(term1176, term1176.getClass(), "sourcePosition", 0);
        setField(term1176, term1176.getClass(), "jsType", null);
        setField(term1176, term1176.getClass(), "parent", null);
        setField(term1159, term1159.getClass(), "first", term1176);
        setIntField(term1179, term1179.getClass(), "type", 0);
        setField(term1179, term1179.getClass(), "next", null);
        setField(term1179, term1179.getClass(), "first", null);
        setField(term1179, term1179.getClass(), "last", null);
        setField(term1179, term1179.getClass(), "propListHead", null);
        setIntField(term1179, term1179.getClass(), "sourcePosition", 0);
        setField(term1179, term1179.getClass(), "jsType", null);
        setField(term1179, term1179.getClass(), "parent", null);
        setField(term1159, term1159.getClass(), "last", term1179);
        setField(term1182, term1182.getClass(), "next", null);
        setIntField(term1182, term1182.getClass(), "type", 0);
        setIntField(term1182, term1182.getClass(), "intValue", 0);
        setField(term1182, term1182.getClass(), "objectValue", null);
        setField(term1159, term1159.getClass(), "propListHead", term1182);
        setIntField(term1159, term1159.getClass(), "sourcePosition", 291864719);
        setField(term1159, term1159.getClass(), "jsType", null);
        setField(term1159, term1159.getClass(), "parent", null);
        term10873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10878 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10881 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10873, term10873.getClass(), "type", 243280944);
        setIntField(term10874, term10874.getClass(), "type", 202214133);
        setIntField(term10875, term10875.getClass(), "type", 0);
        setField(term10875, term10875.getClass(), "next", null);
        setField(term10875, term10875.getClass(), "first", null);
        setField(term10875, term10875.getClass(), "last", null);
        setField(term10875, term10875.getClass(), "propListHead", null);
        setIntField(term10875, term10875.getClass(), "sourcePosition", 0);
        setField(term10875, term10875.getClass(), "jsType", null);
        setField(term10875, term10875.getClass(), "parent", null);
        setField(term10874, term10874.getClass(), "next", term10875);
        setIntField(term10876, term10876.getClass(), "type", 0);
        setField(term10876, term10876.getClass(), "next", null);
        setField(term10876, term10876.getClass(), "first", null);
        setField(term10876, term10876.getClass(), "last", null);
        setField(term10876, term10876.getClass(), "propListHead", null);
        setIntField(term10876, term10876.getClass(), "sourcePosition", 0);
        setField(term10876, term10876.getClass(), "jsType", null);
        setField(term10876, term10876.getClass(), "parent", null);
        setField(term10874, term10874.getClass(), "first", term10876);
        setIntField(term10877, term10877.getClass(), "type", 0);
        setField(term10877, term10877.getClass(), "next", null);
        setField(term10877, term10877.getClass(), "first", null);
        setField(term10877, term10877.getClass(), "last", null);
        setField(term10877, term10877.getClass(), "propListHead", null);
        setIntField(term10877, term10877.getClass(), "sourcePosition", 0);
        setField(term10877, term10877.getClass(), "jsType", null);
        setField(term10877, term10877.getClass(), "parent", null);
        setField(term10874, term10874.getClass(), "last", term10877);
        setField(term10878, term10878.getClass(), "next", null);
        setIntField(term10878, term10878.getClass(), "type", 0);
        setIntField(term10878, term10878.getClass(), "intValue", 0);
        setField(term10878, term10878.getClass(), "objectValue", null);
        setField(term10874, term10874.getClass(), "propListHead", term10878);
        setIntField(term10874, term10874.getClass(), "sourcePosition", -222941705);
        setField(term10874, term10874.getClass(), "jsType", null);
        setField(term10874, term10874.getClass(), "parent", null);
        setField(term10873, term10873.getClass(), "next", term10874);
        setIntField(term10879, term10879.getClass(), "type", 0);
        setField(term10879, term10879.getClass(), "next", null);
        setField(term10879, term10879.getClass(), "first", null);
        setField(term10879, term10879.getClass(), "last", null);
        setField(term10879, term10879.getClass(), "propListHead", null);
        setIntField(term10879, term10879.getClass(), "sourcePosition", 0);
        setField(term10879, term10879.getClass(), "jsType", null);
        setField(term10879, term10879.getClass(), "parent", null);
        setField(term10873, term10873.getClass(), "first", term10879);
        setIntField(term10880, term10880.getClass(), "type", 0);
        setField(term10880, term10880.getClass(), "next", null);
        setField(term10880, term10880.getClass(), "first", null);
        setField(term10880, term10880.getClass(), "last", null);
        setField(term10880, term10880.getClass(), "propListHead", null);
        setIntField(term10880, term10880.getClass(), "sourcePosition", 0);
        setField(term10880, term10880.getClass(), "jsType", null);
        setField(term10880, term10880.getClass(), "parent", null);
        setField(term10873, term10873.getClass(), "last", term10880);
        setField(term10881, term10881.getClass(), "next", null);
        setIntField(term10881, term10881.getClass(), "type", 0);
        setIntField(term10881, term10881.getClass(), "intValue", 0);
        setField(term10881, term10881.getClass(), "objectValue", null);
        setField(term10873, term10873.getClass(), "propListHead", term10881);
        setIntField(term10873, term10873.getClass(), "sourcePosition", 291864719);
        setField(term10873, term10873.getClass(), "jsType", null);
        setField(term10873, term10873.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1159;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term1159, term10873));
        assertTrue(recursiveEquals(retValue, true));
    }

};


