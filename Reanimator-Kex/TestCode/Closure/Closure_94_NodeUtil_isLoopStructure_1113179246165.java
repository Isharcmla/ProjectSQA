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

public class NodeUtil_isLoopStructure_1113179246165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1194;
     Object term9302;

    public NodeUtil_isLoopStructure_1113179246165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1207 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1217 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1194, term1194.getClass(), "type", -20614472);
        setIntField(term1196, term1196.getClass(), "type", 1207142014);
        setIntField(term1198, term1198.getClass(), "type", 0);
        setField(term1198, term1198.getClass(), "next", null);
        setField(term1198, term1198.getClass(), "first", null);
        setField(term1198, term1198.getClass(), "last", null);
        setField(term1198, term1198.getClass(), "propListHead", null);
        setIntField(term1198, term1198.getClass(), "sourcePosition", 0);
        setField(term1198, term1198.getClass(), "jsType", null);
        setField(term1198, term1198.getClass(), "parent", null);
        setField(term1196, term1196.getClass(), "next", term1198);
        setIntField(term1201, term1201.getClass(), "type", 0);
        setField(term1201, term1201.getClass(), "next", null);
        setField(term1201, term1201.getClass(), "first", null);
        setField(term1201, term1201.getClass(), "last", null);
        setField(term1201, term1201.getClass(), "propListHead", null);
        setIntField(term1201, term1201.getClass(), "sourcePosition", 0);
        setField(term1201, term1201.getClass(), "jsType", null);
        setField(term1201, term1201.getClass(), "parent", null);
        setField(term1196, term1196.getClass(), "first", term1201);
        setIntField(term1204, term1204.getClass(), "type", 0);
        setField(term1204, term1204.getClass(), "next", null);
        setField(term1204, term1204.getClass(), "first", null);
        setField(term1204, term1204.getClass(), "last", null);
        setField(term1204, term1204.getClass(), "propListHead", null);
        setIntField(term1204, term1204.getClass(), "sourcePosition", 0);
        setField(term1204, term1204.getClass(), "jsType", null);
        setField(term1204, term1204.getClass(), "parent", null);
        setField(term1196, term1196.getClass(), "last", term1204);
        setField(term1207, term1207.getClass(), "next", null);
        setIntField(term1207, term1207.getClass(), "type", 0);
        setIntField(term1207, term1207.getClass(), "intValue", 0);
        setField(term1207, term1207.getClass(), "objectValue", null);
        setField(term1196, term1196.getClass(), "propListHead", term1207);
        setIntField(term1196, term1196.getClass(), "sourcePosition", 330043745);
        setField(term1196, term1196.getClass(), "jsType", null);
        setField(term1196, term1196.getClass(), "parent", null);
        setField(term1194, term1194.getClass(), "next", term1196);
        setIntField(term1211, term1211.getClass(), "type", 0);
        setField(term1211, term1211.getClass(), "next", null);
        setField(term1211, term1211.getClass(), "first", null);
        setField(term1211, term1211.getClass(), "last", null);
        setField(term1211, term1211.getClass(), "propListHead", null);
        setIntField(term1211, term1211.getClass(), "sourcePosition", 0);
        setField(term1211, term1211.getClass(), "jsType", null);
        setField(term1211, term1211.getClass(), "parent", null);
        setField(term1194, term1194.getClass(), "first", term1211);
        setIntField(term1214, term1214.getClass(), "type", 0);
        setField(term1214, term1214.getClass(), "next", null);
        setField(term1214, term1214.getClass(), "first", null);
        setField(term1214, term1214.getClass(), "last", null);
        setField(term1214, term1214.getClass(), "propListHead", null);
        setIntField(term1214, term1214.getClass(), "sourcePosition", 0);
        setField(term1214, term1214.getClass(), "jsType", null);
        setField(term1214, term1214.getClass(), "parent", null);
        setField(term1194, term1194.getClass(), "last", term1214);
        setField(term1217, term1217.getClass(), "next", null);
        setIntField(term1217, term1217.getClass(), "type", 0);
        setIntField(term1217, term1217.getClass(), "intValue", 0);
        setField(term1217, term1217.getClass(), "objectValue", null);
        setField(term1194, term1194.getClass(), "propListHead", term1217);
        setIntField(term1194, term1194.getClass(), "sourcePosition", -509349195);
        setField(term1194, term1194.getClass(), "jsType", null);
        setField(term1194, term1194.getClass(), "parent", null);
        term9302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9307 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9310 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9302, term9302.getClass(), "type", -20614472);
        setIntField(term9303, term9303.getClass(), "type", 1207142014);
        setIntField(term9304, term9304.getClass(), "type", 0);
        setField(term9304, term9304.getClass(), "next", null);
        setField(term9304, term9304.getClass(), "first", null);
        setField(term9304, term9304.getClass(), "last", null);
        setField(term9304, term9304.getClass(), "propListHead", null);
        setIntField(term9304, term9304.getClass(), "sourcePosition", 0);
        setField(term9304, term9304.getClass(), "jsType", null);
        setField(term9304, term9304.getClass(), "parent", null);
        setField(term9303, term9303.getClass(), "next", term9304);
        setIntField(term9305, term9305.getClass(), "type", 0);
        setField(term9305, term9305.getClass(), "next", null);
        setField(term9305, term9305.getClass(), "first", null);
        setField(term9305, term9305.getClass(), "last", null);
        setField(term9305, term9305.getClass(), "propListHead", null);
        setIntField(term9305, term9305.getClass(), "sourcePosition", 0);
        setField(term9305, term9305.getClass(), "jsType", null);
        setField(term9305, term9305.getClass(), "parent", null);
        setField(term9303, term9303.getClass(), "first", term9305);
        setIntField(term9306, term9306.getClass(), "type", 0);
        setField(term9306, term9306.getClass(), "next", null);
        setField(term9306, term9306.getClass(), "first", null);
        setField(term9306, term9306.getClass(), "last", null);
        setField(term9306, term9306.getClass(), "propListHead", null);
        setIntField(term9306, term9306.getClass(), "sourcePosition", 0);
        setField(term9306, term9306.getClass(), "jsType", null);
        setField(term9306, term9306.getClass(), "parent", null);
        setField(term9303, term9303.getClass(), "last", term9306);
        setField(term9307, term9307.getClass(), "next", null);
        setIntField(term9307, term9307.getClass(), "type", 0);
        setIntField(term9307, term9307.getClass(), "intValue", 0);
        setField(term9307, term9307.getClass(), "objectValue", null);
        setField(term9303, term9303.getClass(), "propListHead", term9307);
        setIntField(term9303, term9303.getClass(), "sourcePosition", 330043745);
        setField(term9303, term9303.getClass(), "jsType", null);
        setField(term9303, term9303.getClass(), "parent", null);
        setField(term9302, term9302.getClass(), "next", term9303);
        setIntField(term9308, term9308.getClass(), "type", 0);
        setField(term9308, term9308.getClass(), "next", null);
        setField(term9308, term9308.getClass(), "first", null);
        setField(term9308, term9308.getClass(), "last", null);
        setField(term9308, term9308.getClass(), "propListHead", null);
        setIntField(term9308, term9308.getClass(), "sourcePosition", 0);
        setField(term9308, term9308.getClass(), "jsType", null);
        setField(term9308, term9308.getClass(), "parent", null);
        setField(term9302, term9302.getClass(), "first", term9308);
        setIntField(term9309, term9309.getClass(), "type", 0);
        setField(term9309, term9309.getClass(), "next", null);
        setField(term9309, term9309.getClass(), "first", null);
        setField(term9309, term9309.getClass(), "last", null);
        setField(term9309, term9309.getClass(), "propListHead", null);
        setIntField(term9309, term9309.getClass(), "sourcePosition", 0);
        setField(term9309, term9309.getClass(), "jsType", null);
        setField(term9309, term9309.getClass(), "parent", null);
        setField(term9302, term9302.getClass(), "last", term9309);
        setField(term9310, term9310.getClass(), "next", null);
        setIntField(term9310, term9310.getClass(), "type", 0);
        setIntField(term9310, term9310.getClass(), "intValue", 0);
        setField(term9310, term9310.getClass(), "objectValue", null);
        setField(term9302, term9302.getClass(), "propListHead", term9310);
        setIntField(term9302, term9302.getClass(), "sourcePosition", -509349195);
        setField(term9302, term9302.getClass(), "jsType", null);
        setField(term9302, term9302.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1194;
        Object retValue = callMethod(klass, "isLoopStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term1194, term9302));
        assertTrue(recursiveEquals(retValue, false));
    }

};


