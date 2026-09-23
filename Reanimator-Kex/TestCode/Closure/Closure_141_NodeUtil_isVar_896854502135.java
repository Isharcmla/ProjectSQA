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

public class NodeUtil_isVar_896854502135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760;
     Object term6529;

    public NodeUtil_isVar_896854502135() {
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
        term6529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6534 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6537 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6529, term6529.getClass(), "type", 954660603);
        setIntField(term6530, term6530.getClass(), "type", -648200466);
        setIntField(term6531, term6531.getClass(), "type", 0);
        setField(term6531, term6531.getClass(), "next", null);
        setField(term6531, term6531.getClass(), "first", null);
        setField(term6531, term6531.getClass(), "last", null);
        setField(term6531, term6531.getClass(), "propListHead", null);
        setIntField(term6531, term6531.getClass(), "sourcePosition", 0);
        setField(term6531, term6531.getClass(), "jsType", null);
        setField(term6531, term6531.getClass(), "parent", null);
        setField(term6530, term6530.getClass(), "next", term6531);
        setIntField(term6532, term6532.getClass(), "type", 0);
        setField(term6532, term6532.getClass(), "next", null);
        setField(term6532, term6532.getClass(), "first", null);
        setField(term6532, term6532.getClass(), "last", null);
        setField(term6532, term6532.getClass(), "propListHead", null);
        setIntField(term6532, term6532.getClass(), "sourcePosition", 0);
        setField(term6532, term6532.getClass(), "jsType", null);
        setField(term6532, term6532.getClass(), "parent", null);
        setField(term6530, term6530.getClass(), "first", term6532);
        setIntField(term6533, term6533.getClass(), "type", 0);
        setField(term6533, term6533.getClass(), "next", null);
        setField(term6533, term6533.getClass(), "first", null);
        setField(term6533, term6533.getClass(), "last", null);
        setField(term6533, term6533.getClass(), "propListHead", null);
        setIntField(term6533, term6533.getClass(), "sourcePosition", 0);
        setField(term6533, term6533.getClass(), "jsType", null);
        setField(term6533, term6533.getClass(), "parent", null);
        setField(term6530, term6530.getClass(), "last", term6533);
        setField(term6534, term6534.getClass(), "next", null);
        setIntField(term6534, term6534.getClass(), "type", 0);
        setIntField(term6534, term6534.getClass(), "intValue", 0);
        setField(term6534, term6534.getClass(), "objectValue", null);
        setField(term6530, term6530.getClass(), "propListHead", term6534);
        setIntField(term6530, term6530.getClass(), "sourcePosition", -765191335);
        setField(term6530, term6530.getClass(), "jsType", null);
        setField(term6530, term6530.getClass(), "parent", null);
        setField(term6529, term6529.getClass(), "next", term6530);
        setIntField(term6535, term6535.getClass(), "type", 0);
        setField(term6535, term6535.getClass(), "next", null);
        setField(term6535, term6535.getClass(), "first", null);
        setField(term6535, term6535.getClass(), "last", null);
        setField(term6535, term6535.getClass(), "propListHead", null);
        setIntField(term6535, term6535.getClass(), "sourcePosition", 0);
        setField(term6535, term6535.getClass(), "jsType", null);
        setField(term6535, term6535.getClass(), "parent", null);
        setField(term6529, term6529.getClass(), "first", term6535);
        setIntField(term6536, term6536.getClass(), "type", 0);
        setField(term6536, term6536.getClass(), "next", null);
        setField(term6536, term6536.getClass(), "first", null);
        setField(term6536, term6536.getClass(), "last", null);
        setField(term6536, term6536.getClass(), "propListHead", null);
        setIntField(term6536, term6536.getClass(), "sourcePosition", 0);
        setField(term6536, term6536.getClass(), "jsType", null);
        setField(term6536, term6536.getClass(), "parent", null);
        setField(term6529, term6529.getClass(), "last", term6536);
        setField(term6537, term6537.getClass(), "next", null);
        setIntField(term6537, term6537.getClass(), "type", 0);
        setIntField(term6537, term6537.getClass(), "intValue", 0);
        setField(term6537, term6537.getClass(), "objectValue", null);
        setField(term6529, term6529.getClass(), "propListHead", term6537);
        setIntField(term6529, term6529.getClass(), "sourcePosition", -1697741155);
        setField(term6529, term6529.getClass(), "jsType", null);
        setField(term6529, term6529.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term760;
        Object retValue = callMethod(klass, "isVar", argTypes, null, args);
        assertTrue(recursiveEquals(term760, term6529));
        assertTrue(recursiveEquals(retValue, false));
    }

};


