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

public class NodeUtil_isVar_896854502134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760;
     Object term6502;

    public NodeUtil_isVar_896854502134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term773 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term783 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term760, term760.getClass(), "type", 954660603);
        setIntField(term762, term762.getClass(), "type", -648200466);
        setIntField(term764, term764.getClass(), "type", 0);
        setField(term764, term764.getClass(), "next", null);
        setField(term764, term764.getClass(), "first", null);
        setField(term764, term764.getClass(), "last", null);
        setField(term764, term764.getClass(), "propListHead", null);
        setIntField(term764, term764.getClass(), "sourcePosition", 0);
        setField(term764, term764.getClass(), "jsType", null);
        setField(term764, term764.getClass(), "parent", null);
        setField(term762, term762.getClass(), "next", term764);
        setIntField(term767, term767.getClass(), "type", 0);
        setField(term767, term767.getClass(), "next", null);
        setField(term767, term767.getClass(), "first", null);
        setField(term767, term767.getClass(), "last", null);
        setField(term767, term767.getClass(), "propListHead", null);
        setIntField(term767, term767.getClass(), "sourcePosition", 0);
        setField(term767, term767.getClass(), "jsType", null);
        setField(term767, term767.getClass(), "parent", null);
        setField(term762, term762.getClass(), "first", term767);
        setIntField(term770, term770.getClass(), "type", 0);
        setField(term770, term770.getClass(), "next", null);
        setField(term770, term770.getClass(), "first", null);
        setField(term770, term770.getClass(), "last", null);
        setField(term770, term770.getClass(), "propListHead", null);
        setIntField(term770, term770.getClass(), "sourcePosition", 0);
        setField(term770, term770.getClass(), "jsType", null);
        setField(term770, term770.getClass(), "parent", null);
        setField(term762, term762.getClass(), "last", term770);
        setField(term773, term773.getClass(), "next", null);
        setIntField(term773, term773.getClass(), "type", 0);
        setIntField(term773, term773.getClass(), "intValue", 0);
        setField(term773, term773.getClass(), "objectValue", null);
        setField(term762, term762.getClass(), "propListHead", term773);
        setIntField(term762, term762.getClass(), "sourcePosition", -765191335);
        setField(term762, term762.getClass(), "jsType", null);
        setField(term762, term762.getClass(), "parent", null);
        setField(term760, term760.getClass(), "next", term762);
        setIntField(term777, term777.getClass(), "type", 0);
        setField(term777, term777.getClass(), "next", null);
        setField(term777, term777.getClass(), "first", null);
        setField(term777, term777.getClass(), "last", null);
        setField(term777, term777.getClass(), "propListHead", null);
        setIntField(term777, term777.getClass(), "sourcePosition", 0);
        setField(term777, term777.getClass(), "jsType", null);
        setField(term777, term777.getClass(), "parent", null);
        setField(term760, term760.getClass(), "first", term777);
        setIntField(term780, term780.getClass(), "type", 0);
        setField(term780, term780.getClass(), "next", null);
        setField(term780, term780.getClass(), "first", null);
        setField(term780, term780.getClass(), "last", null);
        setField(term780, term780.getClass(), "propListHead", null);
        setIntField(term780, term780.getClass(), "sourcePosition", 0);
        setField(term780, term780.getClass(), "jsType", null);
        setField(term780, term780.getClass(), "parent", null);
        setField(term760, term760.getClass(), "last", term780);
        setField(term783, term783.getClass(), "next", null);
        setIntField(term783, term783.getClass(), "type", 0);
        setIntField(term783, term783.getClass(), "intValue", 0);
        setField(term783, term783.getClass(), "objectValue", null);
        setField(term760, term760.getClass(), "propListHead", term783);
        setIntField(term760, term760.getClass(), "sourcePosition", -1697741155);
        setField(term760, term760.getClass(), "jsType", null);
        setField(term760, term760.getClass(), "parent", null);
        term6502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6507 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6510 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6502, term6502.getClass(), "type", 954660603);
        setIntField(term6503, term6503.getClass(), "type", -648200466);
        setIntField(term6504, term6504.getClass(), "type", 0);
        setField(term6504, term6504.getClass(), "next", null);
        setField(term6504, term6504.getClass(), "first", null);
        setField(term6504, term6504.getClass(), "last", null);
        setField(term6504, term6504.getClass(), "propListHead", null);
        setIntField(term6504, term6504.getClass(), "sourcePosition", 0);
        setField(term6504, term6504.getClass(), "jsType", null);
        setField(term6504, term6504.getClass(), "parent", null);
        setField(term6503, term6503.getClass(), "next", term6504);
        setIntField(term6505, term6505.getClass(), "type", 0);
        setField(term6505, term6505.getClass(), "next", null);
        setField(term6505, term6505.getClass(), "first", null);
        setField(term6505, term6505.getClass(), "last", null);
        setField(term6505, term6505.getClass(), "propListHead", null);
        setIntField(term6505, term6505.getClass(), "sourcePosition", 0);
        setField(term6505, term6505.getClass(), "jsType", null);
        setField(term6505, term6505.getClass(), "parent", null);
        setField(term6503, term6503.getClass(), "first", term6505);
        setIntField(term6506, term6506.getClass(), "type", 0);
        setField(term6506, term6506.getClass(), "next", null);
        setField(term6506, term6506.getClass(), "first", null);
        setField(term6506, term6506.getClass(), "last", null);
        setField(term6506, term6506.getClass(), "propListHead", null);
        setIntField(term6506, term6506.getClass(), "sourcePosition", 0);
        setField(term6506, term6506.getClass(), "jsType", null);
        setField(term6506, term6506.getClass(), "parent", null);
        setField(term6503, term6503.getClass(), "last", term6506);
        setField(term6507, term6507.getClass(), "next", null);
        setIntField(term6507, term6507.getClass(), "type", 0);
        setIntField(term6507, term6507.getClass(), "intValue", 0);
        setField(term6507, term6507.getClass(), "objectValue", null);
        setField(term6503, term6503.getClass(), "propListHead", term6507);
        setIntField(term6503, term6503.getClass(), "sourcePosition", -765191335);
        setField(term6503, term6503.getClass(), "jsType", null);
        setField(term6503, term6503.getClass(), "parent", null);
        setField(term6502, term6502.getClass(), "next", term6503);
        setIntField(term6508, term6508.getClass(), "type", 0);
        setField(term6508, term6508.getClass(), "next", null);
        setField(term6508, term6508.getClass(), "first", null);
        setField(term6508, term6508.getClass(), "last", null);
        setField(term6508, term6508.getClass(), "propListHead", null);
        setIntField(term6508, term6508.getClass(), "sourcePosition", 0);
        setField(term6508, term6508.getClass(), "jsType", null);
        setField(term6508, term6508.getClass(), "parent", null);
        setField(term6502, term6502.getClass(), "first", term6508);
        setIntField(term6509, term6509.getClass(), "type", 0);
        setField(term6509, term6509.getClass(), "next", null);
        setField(term6509, term6509.getClass(), "first", null);
        setField(term6509, term6509.getClass(), "last", null);
        setField(term6509, term6509.getClass(), "propListHead", null);
        setIntField(term6509, term6509.getClass(), "sourcePosition", 0);
        setField(term6509, term6509.getClass(), "jsType", null);
        setField(term6509, term6509.getClass(), "parent", null);
        setField(term6502, term6502.getClass(), "last", term6509);
        setField(term6510, term6510.getClass(), "next", null);
        setIntField(term6510, term6510.getClass(), "type", 0);
        setIntField(term6510, term6510.getClass(), "intValue", 0);
        setField(term6510, term6510.getClass(), "objectValue", null);
        setField(term6502, term6502.getClass(), "propListHead", term6510);
        setIntField(term6502, term6502.getClass(), "sourcePosition", -1697741155);
        setField(term6502, term6502.getClass(), "jsType", null);
        setField(term6502, term6502.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term760;
        Object retValue = callMethod(klass, "isVar", argTypes, null, args);
        assertTrue(recursiveEquals(term760, term6502));
        assertTrue(recursiveEquals(retValue, false));
    }

};


