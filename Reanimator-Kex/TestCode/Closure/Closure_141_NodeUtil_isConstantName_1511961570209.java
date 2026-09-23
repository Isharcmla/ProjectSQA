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

public class NodeUtil_isConstantName_1511961570209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3170;
     Object term17475;

    public NodeUtil_isConstantName_1511961570209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3183 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3193 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3170, term3170.getClass(), "type", 932810106);
        setIntField(term3172, term3172.getClass(), "type", -2024983877);
        setIntField(term3174, term3174.getClass(), "type", 0);
        setField(term3174, term3174.getClass(), "next", null);
        setField(term3174, term3174.getClass(), "first", null);
        setField(term3174, term3174.getClass(), "last", null);
        setField(term3174, term3174.getClass(), "propListHead", null);
        setIntField(term3174, term3174.getClass(), "sourcePosition", 0);
        setField(term3174, term3174.getClass(), "jsType", null);
        setField(term3174, term3174.getClass(), "parent", null);
        setField(term3172, term3172.getClass(), "next", term3174);
        setIntField(term3177, term3177.getClass(), "type", 0);
        setField(term3177, term3177.getClass(), "next", null);
        setField(term3177, term3177.getClass(), "first", null);
        setField(term3177, term3177.getClass(), "last", null);
        setField(term3177, term3177.getClass(), "propListHead", null);
        setIntField(term3177, term3177.getClass(), "sourcePosition", 0);
        setField(term3177, term3177.getClass(), "jsType", null);
        setField(term3177, term3177.getClass(), "parent", null);
        setField(term3172, term3172.getClass(), "first", term3177);
        setIntField(term3180, term3180.getClass(), "type", 0);
        setField(term3180, term3180.getClass(), "next", null);
        setField(term3180, term3180.getClass(), "first", null);
        setField(term3180, term3180.getClass(), "last", null);
        setField(term3180, term3180.getClass(), "propListHead", null);
        setIntField(term3180, term3180.getClass(), "sourcePosition", 0);
        setField(term3180, term3180.getClass(), "jsType", null);
        setField(term3180, term3180.getClass(), "parent", null);
        setField(term3172, term3172.getClass(), "last", term3180);
        setField(term3183, term3183.getClass(), "next", null);
        setIntField(term3183, term3183.getClass(), "type", 0);
        setIntField(term3183, term3183.getClass(), "intValue", 0);
        setField(term3183, term3183.getClass(), "objectValue", null);
        setField(term3172, term3172.getClass(), "propListHead", term3183);
        setIntField(term3172, term3172.getClass(), "sourcePosition", -132005524);
        setField(term3172, term3172.getClass(), "jsType", null);
        setField(term3172, term3172.getClass(), "parent", null);
        setField(term3170, term3170.getClass(), "next", term3172);
        setIntField(term3187, term3187.getClass(), "type", 0);
        setField(term3187, term3187.getClass(), "next", null);
        setField(term3187, term3187.getClass(), "first", null);
        setField(term3187, term3187.getClass(), "last", null);
        setField(term3187, term3187.getClass(), "propListHead", null);
        setIntField(term3187, term3187.getClass(), "sourcePosition", 0);
        setField(term3187, term3187.getClass(), "jsType", null);
        setField(term3187, term3187.getClass(), "parent", null);
        setField(term3170, term3170.getClass(), "first", term3187);
        setIntField(term3190, term3190.getClass(), "type", 0);
        setField(term3190, term3190.getClass(), "next", null);
        setField(term3190, term3190.getClass(), "first", null);
        setField(term3190, term3190.getClass(), "last", null);
        setField(term3190, term3190.getClass(), "propListHead", null);
        setIntField(term3190, term3190.getClass(), "sourcePosition", 0);
        setField(term3190, term3190.getClass(), "jsType", null);
        setField(term3190, term3190.getClass(), "parent", null);
        setField(term3170, term3170.getClass(), "last", term3190);
        setField(term3193, term3193.getClass(), "next", null);
        setIntField(term3193, term3193.getClass(), "type", 0);
        setIntField(term3193, term3193.getClass(), "intValue", 0);
        setField(term3193, term3193.getClass(), "objectValue", null);
        setField(term3170, term3170.getClass(), "propListHead", term3193);
        setIntField(term3170, term3170.getClass(), "sourcePosition", -1235127374);
        setField(term3170, term3170.getClass(), "jsType", null);
        setField(term3170, term3170.getClass(), "parent", null);
        term17475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17480 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17483 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term17475, term17475.getClass(), "type", 932810106);
        setIntField(term17476, term17476.getClass(), "type", -2024983877);
        setIntField(term17477, term17477.getClass(), "type", 0);
        setField(term17477, term17477.getClass(), "next", null);
        setField(term17477, term17477.getClass(), "first", null);
        setField(term17477, term17477.getClass(), "last", null);
        setField(term17477, term17477.getClass(), "propListHead", null);
        setIntField(term17477, term17477.getClass(), "sourcePosition", 0);
        setField(term17477, term17477.getClass(), "jsType", null);
        setField(term17477, term17477.getClass(), "parent", null);
        setField(term17476, term17476.getClass(), "next", term17477);
        setIntField(term17478, term17478.getClass(), "type", 0);
        setField(term17478, term17478.getClass(), "next", null);
        setField(term17478, term17478.getClass(), "first", null);
        setField(term17478, term17478.getClass(), "last", null);
        setField(term17478, term17478.getClass(), "propListHead", null);
        setIntField(term17478, term17478.getClass(), "sourcePosition", 0);
        setField(term17478, term17478.getClass(), "jsType", null);
        setField(term17478, term17478.getClass(), "parent", null);
        setField(term17476, term17476.getClass(), "first", term17478);
        setIntField(term17479, term17479.getClass(), "type", 0);
        setField(term17479, term17479.getClass(), "next", null);
        setField(term17479, term17479.getClass(), "first", null);
        setField(term17479, term17479.getClass(), "last", null);
        setField(term17479, term17479.getClass(), "propListHead", null);
        setIntField(term17479, term17479.getClass(), "sourcePosition", 0);
        setField(term17479, term17479.getClass(), "jsType", null);
        setField(term17479, term17479.getClass(), "parent", null);
        setField(term17476, term17476.getClass(), "last", term17479);
        setField(term17480, term17480.getClass(), "next", null);
        setIntField(term17480, term17480.getClass(), "type", 0);
        setIntField(term17480, term17480.getClass(), "intValue", 0);
        setField(term17480, term17480.getClass(), "objectValue", null);
        setField(term17476, term17476.getClass(), "propListHead", term17480);
        setIntField(term17476, term17476.getClass(), "sourcePosition", -132005524);
        setField(term17476, term17476.getClass(), "jsType", null);
        setField(term17476, term17476.getClass(), "parent", null);
        setField(term17475, term17475.getClass(), "next", term17476);
        setIntField(term17481, term17481.getClass(), "type", 0);
        setField(term17481, term17481.getClass(), "next", null);
        setField(term17481, term17481.getClass(), "first", null);
        setField(term17481, term17481.getClass(), "last", null);
        setField(term17481, term17481.getClass(), "propListHead", null);
        setIntField(term17481, term17481.getClass(), "sourcePosition", 0);
        setField(term17481, term17481.getClass(), "jsType", null);
        setField(term17481, term17481.getClass(), "parent", null);
        setField(term17475, term17475.getClass(), "first", term17481);
        setIntField(term17482, term17482.getClass(), "type", 0);
        setField(term17482, term17482.getClass(), "next", null);
        setField(term17482, term17482.getClass(), "first", null);
        setField(term17482, term17482.getClass(), "last", null);
        setField(term17482, term17482.getClass(), "propListHead", null);
        setIntField(term17482, term17482.getClass(), "sourcePosition", 0);
        setField(term17482, term17482.getClass(), "jsType", null);
        setField(term17482, term17482.getClass(), "parent", null);
        setField(term17475, term17475.getClass(), "last", term17482);
        setField(term17483, term17483.getClass(), "next", null);
        setIntField(term17483, term17483.getClass(), "type", 0);
        setIntField(term17483, term17483.getClass(), "intValue", 0);
        setField(term17483, term17483.getClass(), "objectValue", null);
        setField(term17475, term17475.getClass(), "propListHead", term17483);
        setIntField(term17475, term17475.getClass(), "sourcePosition", -1235127374);
        setField(term17475, term17475.getClass(), "jsType", null);
        setField(term17475, term17475.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3170;
        callMethod(klass, "isConstantName", argTypes, null, args);
        assertTrue(recursiveEquals(term3170, term17475));
    }

};


