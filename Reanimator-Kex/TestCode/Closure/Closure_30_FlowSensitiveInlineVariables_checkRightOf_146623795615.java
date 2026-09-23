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

public class FlowSensitiveInlineVariables_checkRightOf_146623795615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;
     Object term687;

    public FlowSensitiveInlineVariables_checkRightOf_146623795615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term660, term660.getClass(), "type", 1202361360);
        setIntField(term662, term662.getClass(), "type", -2015048153);
        setIntField(term664, term664.getClass(), "type", -2063457669);
        setIntField(term666, term666.getClass(), "type", -1222006000);
        setIntField(term668, term668.getClass(), "type", 2095798786);
        setField(term668, term668.getClass(), "next", null);
        setField(term668, term668.getClass(), "first", null);
        setField(term668, term668.getClass(), "last", null);
        setField(term668, term668.getClass(), "propListHead", null);
        setIntField(term668, term668.getClass(), "sourcePosition", 0);
        setField(term668, term668.getClass(), "jsType", null);
        setField(term668, term668.getClass(), "parent", null);
        setField(term666, term666.getClass(), "next", term668);
        setIntField(term671, term671.getClass(), "type", -1565502840);
        setField(term671, term671.getClass(), "next", null);
        setField(term671, term671.getClass(), "first", null);
        setField(term671, term671.getClass(), "last", term668);
        setField(term671, term671.getClass(), "propListHead", null);
        setIntField(term671, term671.getClass(), "sourcePosition", 0);
        setField(term671, term671.getClass(), "jsType", null);
        setField(term671, term671.getClass(), "parent", null);
        setField(term666, term666.getClass(), "first", term671);
        setField(term666, term666.getClass(), "last", term664);
        setField(term666, term666.getClass(), "propListHead", null);
        setIntField(term666, term666.getClass(), "sourcePosition", 0);
        setField(term666, term666.getClass(), "jsType", null);
        setField(term666, term666.getClass(), "parent", null);
        setField(term664, term664.getClass(), "next", term666);
        setField(term664, term664.getClass(), "first", term668);
        setIntField(term675, term675.getClass(), "type", 9726679);
        setIntField(term677, term677.getClass(), "type", -25637976);
        setField(term677, term677.getClass(), "next", null);
        setField(term677, term677.getClass(), "first", term671);
        setField(term677, term677.getClass(), "last", term666);
        setField(term677, term677.getClass(), "propListHead", null);
        setIntField(term677, term677.getClass(), "sourcePosition", 0);
        setField(term677, term677.getClass(), "jsType", null);
        setField(term677, term677.getClass(), "parent", null);
        setField(term675, term675.getClass(), "next", term677);
        setField(term675, term675.getClass(), "first", term662);
        setField(term675, term675.getClass(), "last", term662);
        setField(term675, term675.getClass(), "propListHead", null);
        setIntField(term675, term675.getClass(), "sourcePosition", 0);
        setField(term675, term675.getClass(), "jsType", null);
        setField(term675, term675.getClass(), "parent", null);
        setField(term664, term664.getClass(), "last", term675);
        setField(term664, term664.getClass(), "propListHead", null);
        setIntField(term664, term664.getClass(), "sourcePosition", 0);
        setField(term664, term664.getClass(), "jsType", null);
        setField(term664, term664.getClass(), "parent", null);
        setField(term662, term662.getClass(), "next", term664);
        setIntField(term682, term682.getClass(), "type", 1555897383);
        setField(term682, term682.getClass(), "next", term675);
        setField(term682, term682.getClass(), "first", term677);
        setField(term682, term682.getClass(), "last", term660);
        setField(term682, term682.getClass(), "propListHead", null);
        setIntField(term682, term682.getClass(), "sourcePosition", 0);
        setField(term682, term682.getClass(), "jsType", null);
        setField(term682, term682.getClass(), "parent", null);
        setField(term662, term662.getClass(), "first", term682);
        setField(term662, term662.getClass(), "last", term682);
        setField(term662, term662.getClass(), "propListHead", null);
        setIntField(term662, term662.getClass(), "sourcePosition", 0);
        setField(term662, term662.getClass(), "jsType", null);
        setField(term662, term662.getClass(), "parent", null);
        setField(term660, term660.getClass(), "next", term662);
        setField(term660, term660.getClass(), "first", term666);
        setField(term660, term660.getClass(), "last", term668);
        setField(term660, term660.getClass(), "propListHead", null);
        setIntField(term660, term660.getClass(), "sourcePosition", 0);
        setField(term660, term660.getClass(), "jsType", null);
        setField(term660, term660.getClass(), "parent", null);
        term687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term687, term687.getClass(), "type", 202001407);
        setIntField(term689, term689.getClass(), "type", 158873461);
        setIntField(term691, term691.getClass(), "type", -430151637);
        setIntField(term693, term693.getClass(), "type", -1697741339);
        setIntField(term695, term695.getClass(), "type", 98922530);
        setField(term695, term695.getClass(), "next", null);
        setField(term695, term695.getClass(), "first", null);
        setField(term695, term695.getClass(), "last", null);
        setField(term695, term695.getClass(), "propListHead", null);
        setIntField(term695, term695.getClass(), "sourcePosition", 0);
        setField(term695, term695.getClass(), "jsType", null);
        setField(term695, term695.getClass(), "parent", null);
        setField(term693, term693.getClass(), "next", term695);
        setIntField(term698, term698.getClass(), "type", -1388471422);
        setField(term698, term698.getClass(), "next", null);
        setField(term698, term698.getClass(), "first", null);
        setField(term698, term698.getClass(), "last", term695);
        setField(term698, term698.getClass(), "propListHead", null);
        setIntField(term698, term698.getClass(), "sourcePosition", 0);
        setField(term698, term698.getClass(), "jsType", null);
        setField(term698, term698.getClass(), "parent", null);
        setField(term693, term693.getClass(), "first", term698);
        setField(term693, term693.getClass(), "last", term691);
        setField(term693, term693.getClass(), "propListHead", null);
        setIntField(term693, term693.getClass(), "sourcePosition", 0);
        setField(term693, term693.getClass(), "jsType", null);
        setField(term693, term693.getClass(), "parent", null);
        setField(term691, term691.getClass(), "next", term693);
        setField(term691, term691.getClass(), "first", term695);
        setIntField(term702, term702.getClass(), "type", 2098647989);
        setIntField(term704, term704.getClass(), "type", 1598895173);
        setField(term704, term704.getClass(), "next", null);
        setField(term704, term704.getClass(), "first", term698);
        setField(term704, term704.getClass(), "last", term693);
        setField(term704, term704.getClass(), "propListHead", null);
        setIntField(term704, term704.getClass(), "sourcePosition", 0);
        setField(term704, term704.getClass(), "jsType", null);
        setField(term704, term704.getClass(), "parent", null);
        setField(term702, term702.getClass(), "next", term704);
        setField(term702, term702.getClass(), "first", term689);
        setField(term702, term702.getClass(), "last", term689);
        setField(term702, term702.getClass(), "propListHead", null);
        setIntField(term702, term702.getClass(), "sourcePosition", 0);
        setField(term702, term702.getClass(), "jsType", null);
        setField(term702, term702.getClass(), "parent", null);
        setField(term691, term691.getClass(), "last", term702);
        setField(term691, term691.getClass(), "propListHead", null);
        setIntField(term691, term691.getClass(), "sourcePosition", 0);
        setField(term691, term691.getClass(), "jsType", null);
        setField(term691, term691.getClass(), "parent", null);
        setField(term689, term689.getClass(), "next", term691);
        setIntField(term709, term709.getClass(), "type", 1830648570);
        setField(term709, term709.getClass(), "next", term702);
        setField(term709, term709.getClass(), "first", term704);
        setField(term709, term709.getClass(), "last", term687);
        setField(term709, term709.getClass(), "propListHead", null);
        setIntField(term709, term709.getClass(), "sourcePosition", 0);
        setField(term709, term709.getClass(), "jsType", null);
        setField(term709, term709.getClass(), "parent", null);
        setField(term689, term689.getClass(), "first", term709);
        setField(term689, term689.getClass(), "last", term709);
        setField(term689, term689.getClass(), "propListHead", null);
        setIntField(term689, term689.getClass(), "sourcePosition", 0);
        setField(term689, term689.getClass(), "jsType", null);
        setField(term689, term689.getClass(), "parent", null);
        setField(term687, term687.getClass(), "next", term689);
        setField(term687, term687.getClass(), "first", term693);
        setField(term687, term687.getClass(), "last", term695);
        setField(term687, term687.getClass(), "propListHead", null);
        setIntField(term687, term687.getClass(), "sourcePosition", 0);
        setField(term687, term687.getClass(), "jsType", null);
        setField(term687, term687.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term660;
        args[1] = term687;
        args[2] = null;
        try {
            callMethod(klass, "checkRightOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


