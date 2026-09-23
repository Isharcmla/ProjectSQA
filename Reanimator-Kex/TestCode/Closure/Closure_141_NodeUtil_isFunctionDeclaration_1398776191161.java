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

public class NodeUtil_isFunctionDeclaration_1398776191161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1543;
     Object term9516;

    public NodeUtil_isFunctionDeclaration_1398776191161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1556 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1566 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1543, term1543.getClass(), "type", 1104108112);
        setIntField(term1545, term1545.getClass(), "type", 1545119095);
        setIntField(term1547, term1547.getClass(), "type", 0);
        setField(term1547, term1547.getClass(), "next", null);
        setField(term1547, term1547.getClass(), "first", null);
        setField(term1547, term1547.getClass(), "last", null);
        setField(term1547, term1547.getClass(), "propListHead", null);
        setIntField(term1547, term1547.getClass(), "sourcePosition", 0);
        setField(term1547, term1547.getClass(), "jsType", null);
        setField(term1547, term1547.getClass(), "parent", null);
        setField(term1545, term1545.getClass(), "next", term1547);
        setIntField(term1550, term1550.getClass(), "type", 0);
        setField(term1550, term1550.getClass(), "next", null);
        setField(term1550, term1550.getClass(), "first", null);
        setField(term1550, term1550.getClass(), "last", null);
        setField(term1550, term1550.getClass(), "propListHead", null);
        setIntField(term1550, term1550.getClass(), "sourcePosition", 0);
        setField(term1550, term1550.getClass(), "jsType", null);
        setField(term1550, term1550.getClass(), "parent", null);
        setField(term1545, term1545.getClass(), "first", term1550);
        setIntField(term1553, term1553.getClass(), "type", 0);
        setField(term1553, term1553.getClass(), "next", null);
        setField(term1553, term1553.getClass(), "first", null);
        setField(term1553, term1553.getClass(), "last", null);
        setField(term1553, term1553.getClass(), "propListHead", null);
        setIntField(term1553, term1553.getClass(), "sourcePosition", 0);
        setField(term1553, term1553.getClass(), "jsType", null);
        setField(term1553, term1553.getClass(), "parent", null);
        setField(term1545, term1545.getClass(), "last", term1553);
        setField(term1556, term1556.getClass(), "next", null);
        setIntField(term1556, term1556.getClass(), "type", 0);
        setIntField(term1556, term1556.getClass(), "intValue", 0);
        setField(term1556, term1556.getClass(), "objectValue", null);
        setField(term1545, term1545.getClass(), "propListHead", term1556);
        setIntField(term1545, term1545.getClass(), "sourcePosition", -514195141);
        setField(term1545, term1545.getClass(), "jsType", null);
        setField(term1545, term1545.getClass(), "parent", null);
        setField(term1543, term1543.getClass(), "next", term1545);
        setIntField(term1560, term1560.getClass(), "type", 0);
        setField(term1560, term1560.getClass(), "next", null);
        setField(term1560, term1560.getClass(), "first", null);
        setField(term1560, term1560.getClass(), "last", null);
        setField(term1560, term1560.getClass(), "propListHead", null);
        setIntField(term1560, term1560.getClass(), "sourcePosition", 0);
        setField(term1560, term1560.getClass(), "jsType", null);
        setField(term1560, term1560.getClass(), "parent", null);
        setField(term1543, term1543.getClass(), "first", term1560);
        setIntField(term1563, term1563.getClass(), "type", 0);
        setField(term1563, term1563.getClass(), "next", null);
        setField(term1563, term1563.getClass(), "first", null);
        setField(term1563, term1563.getClass(), "last", null);
        setField(term1563, term1563.getClass(), "propListHead", null);
        setIntField(term1563, term1563.getClass(), "sourcePosition", 0);
        setField(term1563, term1563.getClass(), "jsType", null);
        setField(term1563, term1563.getClass(), "parent", null);
        setField(term1543, term1543.getClass(), "last", term1563);
        setField(term1566, term1566.getClass(), "next", null);
        setIntField(term1566, term1566.getClass(), "type", 0);
        setIntField(term1566, term1566.getClass(), "intValue", 0);
        setField(term1566, term1566.getClass(), "objectValue", null);
        setField(term1543, term1543.getClass(), "propListHead", term1566);
        setIntField(term1543, term1543.getClass(), "sourcePosition", -297946422);
        setField(term1543, term1543.getClass(), "jsType", null);
        setField(term1543, term1543.getClass(), "parent", null);
        term9516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9521 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9524 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9516, term9516.getClass(), "type", 1104108112);
        setIntField(term9517, term9517.getClass(), "type", 1545119095);
        setIntField(term9518, term9518.getClass(), "type", 0);
        setField(term9518, term9518.getClass(), "next", null);
        setField(term9518, term9518.getClass(), "first", null);
        setField(term9518, term9518.getClass(), "last", null);
        setField(term9518, term9518.getClass(), "propListHead", null);
        setIntField(term9518, term9518.getClass(), "sourcePosition", 0);
        setField(term9518, term9518.getClass(), "jsType", null);
        setField(term9518, term9518.getClass(), "parent", null);
        setField(term9517, term9517.getClass(), "next", term9518);
        setIntField(term9519, term9519.getClass(), "type", 0);
        setField(term9519, term9519.getClass(), "next", null);
        setField(term9519, term9519.getClass(), "first", null);
        setField(term9519, term9519.getClass(), "last", null);
        setField(term9519, term9519.getClass(), "propListHead", null);
        setIntField(term9519, term9519.getClass(), "sourcePosition", 0);
        setField(term9519, term9519.getClass(), "jsType", null);
        setField(term9519, term9519.getClass(), "parent", null);
        setField(term9517, term9517.getClass(), "first", term9519);
        setIntField(term9520, term9520.getClass(), "type", 0);
        setField(term9520, term9520.getClass(), "next", null);
        setField(term9520, term9520.getClass(), "first", null);
        setField(term9520, term9520.getClass(), "last", null);
        setField(term9520, term9520.getClass(), "propListHead", null);
        setIntField(term9520, term9520.getClass(), "sourcePosition", 0);
        setField(term9520, term9520.getClass(), "jsType", null);
        setField(term9520, term9520.getClass(), "parent", null);
        setField(term9517, term9517.getClass(), "last", term9520);
        setField(term9521, term9521.getClass(), "next", null);
        setIntField(term9521, term9521.getClass(), "type", 0);
        setIntField(term9521, term9521.getClass(), "intValue", 0);
        setField(term9521, term9521.getClass(), "objectValue", null);
        setField(term9517, term9517.getClass(), "propListHead", term9521);
        setIntField(term9517, term9517.getClass(), "sourcePosition", -514195141);
        setField(term9517, term9517.getClass(), "jsType", null);
        setField(term9517, term9517.getClass(), "parent", null);
        setField(term9516, term9516.getClass(), "next", term9517);
        setIntField(term9522, term9522.getClass(), "type", 0);
        setField(term9522, term9522.getClass(), "next", null);
        setField(term9522, term9522.getClass(), "first", null);
        setField(term9522, term9522.getClass(), "last", null);
        setField(term9522, term9522.getClass(), "propListHead", null);
        setIntField(term9522, term9522.getClass(), "sourcePosition", 0);
        setField(term9522, term9522.getClass(), "jsType", null);
        setField(term9522, term9522.getClass(), "parent", null);
        setField(term9516, term9516.getClass(), "first", term9522);
        setIntField(term9523, term9523.getClass(), "type", 0);
        setField(term9523, term9523.getClass(), "next", null);
        setField(term9523, term9523.getClass(), "first", null);
        setField(term9523, term9523.getClass(), "last", null);
        setField(term9523, term9523.getClass(), "propListHead", null);
        setIntField(term9523, term9523.getClass(), "sourcePosition", 0);
        setField(term9523, term9523.getClass(), "jsType", null);
        setField(term9523, term9523.getClass(), "parent", null);
        setField(term9516, term9516.getClass(), "last", term9523);
        setField(term9524, term9524.getClass(), "next", null);
        setIntField(term9524, term9524.getClass(), "type", 0);
        setIntField(term9524, term9524.getClass(), "intValue", 0);
        setField(term9524, term9524.getClass(), "objectValue", null);
        setField(term9516, term9516.getClass(), "propListHead", term9524);
        setIntField(term9516, term9516.getClass(), "sourcePosition", -297946422);
        setField(term9516, term9516.getClass(), "jsType", null);
        setField(term9516, term9516.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1543;
        Object retValue = callMethod(klass, "isFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term1543, term9516));
        assertTrue(recursiveEquals(retValue, false));
    }

};


