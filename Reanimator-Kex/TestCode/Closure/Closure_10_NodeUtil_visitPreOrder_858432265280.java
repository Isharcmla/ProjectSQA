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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_visitPreOrder_858432265280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3603;

    public NodeUtil_visitPreOrder_858432265280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3603, term3603.getClass(), "type", -1809928454);
        setIntField(term3605, term3605.getClass(), "type", -191639503);
        setIntField(term3607, term3607.getClass(), "type", -1563700756);
        setIntField(term3609, term3609.getClass(), "type", -208314837);
        setIntField(term3611, term3611.getClass(), "type", 697841387);
        setField(term3611, term3611.getClass(), "next", null);
        setField(term3611, term3611.getClass(), "first", null);
        setField(term3611, term3611.getClass(), "last", null);
        setField(term3611, term3611.getClass(), "propListHead", null);
        setIntField(term3611, term3611.getClass(), "sourcePosition", 0);
        setField(term3611, term3611.getClass(), "jsType", null);
        setField(term3611, term3611.getClass(), "parent", null);
        setField(term3609, term3609.getClass(), "next", term3611);
        setIntField(term3614, term3614.getClass(), "type", -1749591213);
        setField(term3614, term3614.getClass(), "next", null);
        setField(term3614, term3614.getClass(), "first", null);
        setField(term3614, term3614.getClass(), "last", term3611);
        setField(term3614, term3614.getClass(), "propListHead", null);
        setIntField(term3614, term3614.getClass(), "sourcePosition", 0);
        setField(term3614, term3614.getClass(), "jsType", null);
        setField(term3614, term3614.getClass(), "parent", null);
        setField(term3609, term3609.getClass(), "first", term3614);
        setField(term3609, term3609.getClass(), "last", term3607);
        setField(term3609, term3609.getClass(), "propListHead", null);
        setIntField(term3609, term3609.getClass(), "sourcePosition", 0);
        setField(term3609, term3609.getClass(), "jsType", null);
        setField(term3609, term3609.getClass(), "parent", null);
        setField(term3607, term3607.getClass(), "next", term3609);
        setField(term3607, term3607.getClass(), "first", term3611);
        setIntField(term3618, term3618.getClass(), "type", 47607734);
        setIntField(term3620, term3620.getClass(), "type", 1717232691);
        setField(term3620, term3620.getClass(), "next", null);
        setField(term3620, term3620.getClass(), "first", term3614);
        setField(term3620, term3620.getClass(), "last", term3609);
        setField(term3620, term3620.getClass(), "propListHead", null);
        setIntField(term3620, term3620.getClass(), "sourcePosition", 0);
        setField(term3620, term3620.getClass(), "jsType", null);
        setField(term3620, term3620.getClass(), "parent", null);
        setField(term3618, term3618.getClass(), "next", term3620);
        setField(term3618, term3618.getClass(), "first", term3605);
        setField(term3618, term3618.getClass(), "last", term3605);
        setField(term3618, term3618.getClass(), "propListHead", null);
        setIntField(term3618, term3618.getClass(), "sourcePosition", 0);
        setField(term3618, term3618.getClass(), "jsType", null);
        setField(term3618, term3618.getClass(), "parent", null);
        setField(term3607, term3607.getClass(), "last", term3618);
        setField(term3607, term3607.getClass(), "propListHead", null);
        setIntField(term3607, term3607.getClass(), "sourcePosition", 0);
        setField(term3607, term3607.getClass(), "jsType", null);
        setField(term3607, term3607.getClass(), "parent", null);
        setField(term3605, term3605.getClass(), "next", term3607);
        setIntField(term3625, term3625.getClass(), "type", -938127737);
        setField(term3625, term3625.getClass(), "next", term3618);
        setField(term3625, term3625.getClass(), "first", term3620);
        setField(term3625, term3625.getClass(), "last", term3603);
        setField(term3625, term3625.getClass(), "propListHead", null);
        setIntField(term3625, term3625.getClass(), "sourcePosition", 0);
        setField(term3625, term3625.getClass(), "jsType", null);
        setField(term3625, term3625.getClass(), "parent", null);
        setField(term3605, term3605.getClass(), "first", term3625);
        setField(term3605, term3605.getClass(), "last", term3625);
        setField(term3605, term3605.getClass(), "propListHead", null);
        setIntField(term3605, term3605.getClass(), "sourcePosition", 0);
        setField(term3605, term3605.getClass(), "jsType", null);
        setField(term3605, term3605.getClass(), "parent", null);
        setField(term3603, term3603.getClass(), "next", term3605);
        setField(term3603, term3603.getClass(), "first", term3609);
        setField(term3603, term3603.getClass(), "last", term3611);
        setField(term3603, term3603.getClass(), "propListHead", null);
        setIntField(term3603, term3603.getClass(), "sourcePosition", 0);
        setField(term3603, term3603.getClass(), "jsType", null);
        setField(term3603, term3603.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeUtil$Visitor");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3603;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitPreOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


