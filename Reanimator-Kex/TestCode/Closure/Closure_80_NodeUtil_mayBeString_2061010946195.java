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

public class NodeUtil_mayBeString_2061010946195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1103;
     Object term10638;

    public NodeUtil_mayBeString_2061010946195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1126 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1103, term1103.getClass(), "type", 1607082164);
        setIntField(term1105, term1105.getClass(), "type", 91958879);
        setIntField(term1107, term1107.getClass(), "type", 0);
        setField(term1107, term1107.getClass(), "next", null);
        setField(term1107, term1107.getClass(), "first", null);
        setField(term1107, term1107.getClass(), "last", null);
        setField(term1107, term1107.getClass(), "propListHead", null);
        setIntField(term1107, term1107.getClass(), "sourcePosition", 0);
        setField(term1107, term1107.getClass(), "jsType", null);
        setField(term1107, term1107.getClass(), "parent", null);
        setField(term1105, term1105.getClass(), "next", term1107);
        setIntField(term1110, term1110.getClass(), "type", 0);
        setField(term1110, term1110.getClass(), "next", null);
        setField(term1110, term1110.getClass(), "first", null);
        setField(term1110, term1110.getClass(), "last", null);
        setField(term1110, term1110.getClass(), "propListHead", null);
        setIntField(term1110, term1110.getClass(), "sourcePosition", 0);
        setField(term1110, term1110.getClass(), "jsType", null);
        setField(term1110, term1110.getClass(), "parent", null);
        setField(term1105, term1105.getClass(), "first", term1110);
        setIntField(term1113, term1113.getClass(), "type", 0);
        setField(term1113, term1113.getClass(), "next", null);
        setField(term1113, term1113.getClass(), "first", null);
        setField(term1113, term1113.getClass(), "last", null);
        setField(term1113, term1113.getClass(), "propListHead", null);
        setIntField(term1113, term1113.getClass(), "sourcePosition", 0);
        setField(term1113, term1113.getClass(), "jsType", null);
        setField(term1113, term1113.getClass(), "parent", null);
        setField(term1105, term1105.getClass(), "last", term1113);
        setField(term1116, term1116.getClass(), "next", null);
        setIntField(term1116, term1116.getClass(), "type", 0);
        setIntField(term1116, term1116.getClass(), "intValue", 0);
        setField(term1116, term1116.getClass(), "objectValue", null);
        setField(term1105, term1105.getClass(), "propListHead", term1116);
        setIntField(term1105, term1105.getClass(), "sourcePosition", 644154104);
        setField(term1105, term1105.getClass(), "jsType", null);
        setField(term1105, term1105.getClass(), "parent", null);
        setField(term1103, term1103.getClass(), "next", term1105);
        setIntField(term1120, term1120.getClass(), "type", 0);
        setField(term1120, term1120.getClass(), "next", null);
        setField(term1120, term1120.getClass(), "first", null);
        setField(term1120, term1120.getClass(), "last", null);
        setField(term1120, term1120.getClass(), "propListHead", null);
        setIntField(term1120, term1120.getClass(), "sourcePosition", 0);
        setField(term1120, term1120.getClass(), "jsType", null);
        setField(term1120, term1120.getClass(), "parent", null);
        setField(term1103, term1103.getClass(), "first", term1120);
        setIntField(term1123, term1123.getClass(), "type", 0);
        setField(term1123, term1123.getClass(), "next", null);
        setField(term1123, term1123.getClass(), "first", null);
        setField(term1123, term1123.getClass(), "last", null);
        setField(term1123, term1123.getClass(), "propListHead", null);
        setIntField(term1123, term1123.getClass(), "sourcePosition", 0);
        setField(term1123, term1123.getClass(), "jsType", null);
        setField(term1123, term1123.getClass(), "parent", null);
        setField(term1103, term1103.getClass(), "last", term1123);
        setField(term1126, term1126.getClass(), "next", null);
        setIntField(term1126, term1126.getClass(), "type", 0);
        setIntField(term1126, term1126.getClass(), "intValue", 0);
        setField(term1126, term1126.getClass(), "objectValue", null);
        setField(term1103, term1103.getClass(), "propListHead", term1126);
        setIntField(term1103, term1103.getClass(), "sourcePosition", 76650923);
        setField(term1103, term1103.getClass(), "jsType", null);
        setField(term1103, term1103.getClass(), "parent", null);
        term10638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10643 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10646 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10638, term10638.getClass(), "type", 1607082164);
        setIntField(term10639, term10639.getClass(), "type", 91958879);
        setIntField(term10640, term10640.getClass(), "type", 0);
        setField(term10640, term10640.getClass(), "next", null);
        setField(term10640, term10640.getClass(), "first", null);
        setField(term10640, term10640.getClass(), "last", null);
        setField(term10640, term10640.getClass(), "propListHead", null);
        setIntField(term10640, term10640.getClass(), "sourcePosition", 0);
        setField(term10640, term10640.getClass(), "jsType", null);
        setField(term10640, term10640.getClass(), "parent", null);
        setField(term10639, term10639.getClass(), "next", term10640);
        setIntField(term10641, term10641.getClass(), "type", 0);
        setField(term10641, term10641.getClass(), "next", null);
        setField(term10641, term10641.getClass(), "first", null);
        setField(term10641, term10641.getClass(), "last", null);
        setField(term10641, term10641.getClass(), "propListHead", null);
        setIntField(term10641, term10641.getClass(), "sourcePosition", 0);
        setField(term10641, term10641.getClass(), "jsType", null);
        setField(term10641, term10641.getClass(), "parent", null);
        setField(term10639, term10639.getClass(), "first", term10641);
        setIntField(term10642, term10642.getClass(), "type", 0);
        setField(term10642, term10642.getClass(), "next", null);
        setField(term10642, term10642.getClass(), "first", null);
        setField(term10642, term10642.getClass(), "last", null);
        setField(term10642, term10642.getClass(), "propListHead", null);
        setIntField(term10642, term10642.getClass(), "sourcePosition", 0);
        setField(term10642, term10642.getClass(), "jsType", null);
        setField(term10642, term10642.getClass(), "parent", null);
        setField(term10639, term10639.getClass(), "last", term10642);
        setField(term10643, term10643.getClass(), "next", null);
        setIntField(term10643, term10643.getClass(), "type", 0);
        setIntField(term10643, term10643.getClass(), "intValue", 0);
        setField(term10643, term10643.getClass(), "objectValue", null);
        setField(term10639, term10639.getClass(), "propListHead", term10643);
        setIntField(term10639, term10639.getClass(), "sourcePosition", 644154104);
        setField(term10639, term10639.getClass(), "jsType", null);
        setField(term10639, term10639.getClass(), "parent", null);
        setField(term10638, term10638.getClass(), "next", term10639);
        setIntField(term10644, term10644.getClass(), "type", 0);
        setField(term10644, term10644.getClass(), "next", null);
        setField(term10644, term10644.getClass(), "first", null);
        setField(term10644, term10644.getClass(), "last", null);
        setField(term10644, term10644.getClass(), "propListHead", null);
        setIntField(term10644, term10644.getClass(), "sourcePosition", 0);
        setField(term10644, term10644.getClass(), "jsType", null);
        setField(term10644, term10644.getClass(), "parent", null);
        setField(term10638, term10638.getClass(), "first", term10644);
        setIntField(term10645, term10645.getClass(), "type", 0);
        setField(term10645, term10645.getClass(), "next", null);
        setField(term10645, term10645.getClass(), "first", null);
        setField(term10645, term10645.getClass(), "last", null);
        setField(term10645, term10645.getClass(), "propListHead", null);
        setIntField(term10645, term10645.getClass(), "sourcePosition", 0);
        setField(term10645, term10645.getClass(), "jsType", null);
        setField(term10645, term10645.getClass(), "parent", null);
        setField(term10638, term10638.getClass(), "last", term10645);
        setField(term10646, term10646.getClass(), "next", null);
        setIntField(term10646, term10646.getClass(), "type", 0);
        setIntField(term10646, term10646.getClass(), "intValue", 0);
        setField(term10646, term10646.getClass(), "objectValue", null);
        setField(term10638, term10638.getClass(), "propListHead", term10646);
        setIntField(term10638, term10638.getClass(), "sourcePosition", 76650923);
        setField(term10638, term10638.getClass(), "jsType", null);
        setField(term10638, term10638.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1103;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term1103, term10638));
    }

};


