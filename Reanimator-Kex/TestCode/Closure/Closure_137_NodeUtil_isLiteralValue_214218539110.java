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

public class NodeUtil_isLiteralValue_214218539110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;
     Object term4025;

    public NodeUtil_isLiteralValue_214218539110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term136, term136.getClass(), "type", -2095575670);
        setIntField(term138, term138.getClass(), "type", -93135961);
        setIntField(term140, term140.getClass(), "type", 0);
        setField(term140, term140.getClass(), "next", null);
        setField(term140, term140.getClass(), "first", null);
        setField(term140, term140.getClass(), "last", null);
        setField(term140, term140.getClass(), "propListHead", null);
        setIntField(term140, term140.getClass(), "sourcePosition", 0);
        setField(term140, term140.getClass(), "jsType", null);
        setField(term140, term140.getClass(), "parent", null);
        setField(term138, term138.getClass(), "next", term140);
        setIntField(term143, term143.getClass(), "type", 0);
        setField(term143, term143.getClass(), "next", null);
        setField(term143, term143.getClass(), "first", null);
        setField(term143, term143.getClass(), "last", null);
        setField(term143, term143.getClass(), "propListHead", null);
        setIntField(term143, term143.getClass(), "sourcePosition", 0);
        setField(term143, term143.getClass(), "jsType", null);
        setField(term143, term143.getClass(), "parent", null);
        setField(term138, term138.getClass(), "first", term143);
        setIntField(term146, term146.getClass(), "type", 0);
        setField(term146, term146.getClass(), "next", null);
        setField(term146, term146.getClass(), "first", null);
        setField(term146, term146.getClass(), "last", null);
        setField(term146, term146.getClass(), "propListHead", null);
        setIntField(term146, term146.getClass(), "sourcePosition", 0);
        setField(term146, term146.getClass(), "jsType", null);
        setField(term146, term146.getClass(), "parent", null);
        setField(term138, term138.getClass(), "last", term146);
        setField(term149, term149.getClass(), "next", null);
        setIntField(term149, term149.getClass(), "type", 0);
        setIntField(term149, term149.getClass(), "intValue", 0);
        setField(term149, term149.getClass(), "objectValue", null);
        setField(term138, term138.getClass(), "propListHead", term149);
        setIntField(term138, term138.getClass(), "sourcePosition", 287287233);
        setField(term138, term138.getClass(), "jsType", null);
        setField(term138, term138.getClass(), "parent", null);
        setField(term136, term136.getClass(), "next", term138);
        setIntField(term153, term153.getClass(), "type", 0);
        setField(term153, term153.getClass(), "next", null);
        setField(term153, term153.getClass(), "first", null);
        setField(term153, term153.getClass(), "last", null);
        setField(term153, term153.getClass(), "propListHead", null);
        setIntField(term153, term153.getClass(), "sourcePosition", 0);
        setField(term153, term153.getClass(), "jsType", null);
        setField(term153, term153.getClass(), "parent", null);
        setField(term136, term136.getClass(), "first", term153);
        setIntField(term156, term156.getClass(), "type", 0);
        setField(term156, term156.getClass(), "next", null);
        setField(term156, term156.getClass(), "first", null);
        setField(term156, term156.getClass(), "last", null);
        setField(term156, term156.getClass(), "propListHead", null);
        setIntField(term156, term156.getClass(), "sourcePosition", 0);
        setField(term156, term156.getClass(), "jsType", null);
        setField(term156, term156.getClass(), "parent", null);
        setField(term136, term136.getClass(), "last", term156);
        setField(term159, term159.getClass(), "next", null);
        setIntField(term159, term159.getClass(), "type", 0);
        setIntField(term159, term159.getClass(), "intValue", 0);
        setField(term159, term159.getClass(), "objectValue", null);
        setField(term136, term136.getClass(), "propListHead", term159);
        setIntField(term136, term136.getClass(), "sourcePosition", 962840079);
        setField(term136, term136.getClass(), "jsType", null);
        setField(term136, term136.getClass(), "parent", null);
        term4025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4030 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4033 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4025, term4025.getClass(), "type", -2095575670);
        setIntField(term4026, term4026.getClass(), "type", -93135961);
        setIntField(term4027, term4027.getClass(), "type", 0);
        setField(term4027, term4027.getClass(), "next", null);
        setField(term4027, term4027.getClass(), "first", null);
        setField(term4027, term4027.getClass(), "last", null);
        setField(term4027, term4027.getClass(), "propListHead", null);
        setIntField(term4027, term4027.getClass(), "sourcePosition", 0);
        setField(term4027, term4027.getClass(), "jsType", null);
        setField(term4027, term4027.getClass(), "parent", null);
        setField(term4026, term4026.getClass(), "next", term4027);
        setIntField(term4028, term4028.getClass(), "type", 0);
        setField(term4028, term4028.getClass(), "next", null);
        setField(term4028, term4028.getClass(), "first", null);
        setField(term4028, term4028.getClass(), "last", null);
        setField(term4028, term4028.getClass(), "propListHead", null);
        setIntField(term4028, term4028.getClass(), "sourcePosition", 0);
        setField(term4028, term4028.getClass(), "jsType", null);
        setField(term4028, term4028.getClass(), "parent", null);
        setField(term4026, term4026.getClass(), "first", term4028);
        setIntField(term4029, term4029.getClass(), "type", 0);
        setField(term4029, term4029.getClass(), "next", null);
        setField(term4029, term4029.getClass(), "first", null);
        setField(term4029, term4029.getClass(), "last", null);
        setField(term4029, term4029.getClass(), "propListHead", null);
        setIntField(term4029, term4029.getClass(), "sourcePosition", 0);
        setField(term4029, term4029.getClass(), "jsType", null);
        setField(term4029, term4029.getClass(), "parent", null);
        setField(term4026, term4026.getClass(), "last", term4029);
        setField(term4030, term4030.getClass(), "next", null);
        setIntField(term4030, term4030.getClass(), "type", 0);
        setIntField(term4030, term4030.getClass(), "intValue", 0);
        setField(term4030, term4030.getClass(), "objectValue", null);
        setField(term4026, term4026.getClass(), "propListHead", term4030);
        setIntField(term4026, term4026.getClass(), "sourcePosition", 287287233);
        setField(term4026, term4026.getClass(), "jsType", null);
        setField(term4026, term4026.getClass(), "parent", null);
        setField(term4025, term4025.getClass(), "next", term4026);
        setIntField(term4031, term4031.getClass(), "type", 0);
        setField(term4031, term4031.getClass(), "next", null);
        setField(term4031, term4031.getClass(), "first", null);
        setField(term4031, term4031.getClass(), "last", null);
        setField(term4031, term4031.getClass(), "propListHead", null);
        setIntField(term4031, term4031.getClass(), "sourcePosition", 0);
        setField(term4031, term4031.getClass(), "jsType", null);
        setField(term4031, term4031.getClass(), "parent", null);
        setField(term4025, term4025.getClass(), "first", term4031);
        setIntField(term4032, term4032.getClass(), "type", 0);
        setField(term4032, term4032.getClass(), "next", null);
        setField(term4032, term4032.getClass(), "first", null);
        setField(term4032, term4032.getClass(), "last", null);
        setField(term4032, term4032.getClass(), "propListHead", null);
        setIntField(term4032, term4032.getClass(), "sourcePosition", 0);
        setField(term4032, term4032.getClass(), "jsType", null);
        setField(term4032, term4032.getClass(), "parent", null);
        setField(term4025, term4025.getClass(), "last", term4032);
        setField(term4033, term4033.getClass(), "next", null);
        setIntField(term4033, term4033.getClass(), "type", 0);
        setIntField(term4033, term4033.getClass(), "intValue", 0);
        setField(term4033, term4033.getClass(), "objectValue", null);
        setField(term4025, term4025.getClass(), "propListHead", term4033);
        setIntField(term4025, term4025.getClass(), "sourcePosition", 962840079);
        setField(term4025, term4025.getClass(), "jsType", null);
        setField(term4025, term4025.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term136;
        Object retValue = callMethod(klass, "isLiteralValue", argTypes, null, args);
        assertTrue(recursiveEquals(term136, term4025));
        assertTrue(recursiveEquals(retValue, false));
    }

};


