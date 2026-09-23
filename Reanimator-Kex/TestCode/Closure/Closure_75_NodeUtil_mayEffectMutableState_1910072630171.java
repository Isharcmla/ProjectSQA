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

public class NodeUtil_mayEffectMutableState_1910072630171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453;
     Object term7648;

    public NodeUtil_mayEffectMutableState_1910072630171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term466 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term476 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term453, term453.getClass(), "type", -601863069);
        setIntField(term455, term455.getClass(), "type", -1731761810);
        setIntField(term457, term457.getClass(), "type", 0);
        setField(term457, term457.getClass(), "next", null);
        setField(term457, term457.getClass(), "first", null);
        setField(term457, term457.getClass(), "last", null);
        setField(term457, term457.getClass(), "propListHead", null);
        setIntField(term457, term457.getClass(), "sourcePosition", 0);
        setField(term457, term457.getClass(), "jsType", null);
        setField(term457, term457.getClass(), "parent", null);
        setField(term455, term455.getClass(), "next", term457);
        setIntField(term460, term460.getClass(), "type", 0);
        setField(term460, term460.getClass(), "next", null);
        setField(term460, term460.getClass(), "first", null);
        setField(term460, term460.getClass(), "last", null);
        setField(term460, term460.getClass(), "propListHead", null);
        setIntField(term460, term460.getClass(), "sourcePosition", 0);
        setField(term460, term460.getClass(), "jsType", null);
        setField(term460, term460.getClass(), "parent", null);
        setField(term455, term455.getClass(), "first", term460);
        setIntField(term463, term463.getClass(), "type", 0);
        setField(term463, term463.getClass(), "next", null);
        setField(term463, term463.getClass(), "first", null);
        setField(term463, term463.getClass(), "last", null);
        setField(term463, term463.getClass(), "propListHead", null);
        setIntField(term463, term463.getClass(), "sourcePosition", 0);
        setField(term463, term463.getClass(), "jsType", null);
        setField(term463, term463.getClass(), "parent", null);
        setField(term455, term455.getClass(), "last", term463);
        setField(term466, term466.getClass(), "next", null);
        setIntField(term466, term466.getClass(), "type", 0);
        setIntField(term466, term466.getClass(), "intValue", 0);
        setField(term466, term466.getClass(), "objectValue", null);
        setField(term455, term455.getClass(), "propListHead", term466);
        setIntField(term455, term455.getClass(), "sourcePosition", 1557431527);
        setField(term455, term455.getClass(), "jsType", null);
        setField(term455, term455.getClass(), "parent", null);
        setField(term453, term453.getClass(), "next", term455);
        setIntField(term470, term470.getClass(), "type", 0);
        setField(term470, term470.getClass(), "next", null);
        setField(term470, term470.getClass(), "first", null);
        setField(term470, term470.getClass(), "last", null);
        setField(term470, term470.getClass(), "propListHead", null);
        setIntField(term470, term470.getClass(), "sourcePosition", 0);
        setField(term470, term470.getClass(), "jsType", null);
        setField(term470, term470.getClass(), "parent", null);
        setField(term453, term453.getClass(), "first", term470);
        setIntField(term473, term473.getClass(), "type", 0);
        setField(term473, term473.getClass(), "next", null);
        setField(term473, term473.getClass(), "first", null);
        setField(term473, term473.getClass(), "last", null);
        setField(term473, term473.getClass(), "propListHead", null);
        setIntField(term473, term473.getClass(), "sourcePosition", 0);
        setField(term473, term473.getClass(), "jsType", null);
        setField(term473, term473.getClass(), "parent", null);
        setField(term453, term453.getClass(), "last", term473);
        setField(term476, term476.getClass(), "next", null);
        setIntField(term476, term476.getClass(), "type", 0);
        setIntField(term476, term476.getClass(), "intValue", 0);
        setField(term476, term476.getClass(), "objectValue", null);
        setField(term453, term453.getClass(), "propListHead", term476);
        setIntField(term453, term453.getClass(), "sourcePosition", -1504890659);
        setField(term453, term453.getClass(), "jsType", null);
        setField(term453, term453.getClass(), "parent", null);
        term7648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7653 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7656 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7648, term7648.getClass(), "type", -601863069);
        setIntField(term7649, term7649.getClass(), "type", -1731761810);
        setIntField(term7650, term7650.getClass(), "type", 0);
        setField(term7650, term7650.getClass(), "next", null);
        setField(term7650, term7650.getClass(), "first", null);
        setField(term7650, term7650.getClass(), "last", null);
        setField(term7650, term7650.getClass(), "propListHead", null);
        setIntField(term7650, term7650.getClass(), "sourcePosition", 0);
        setField(term7650, term7650.getClass(), "jsType", null);
        setField(term7650, term7650.getClass(), "parent", null);
        setField(term7649, term7649.getClass(), "next", term7650);
        setIntField(term7651, term7651.getClass(), "type", 0);
        setField(term7651, term7651.getClass(), "next", null);
        setField(term7651, term7651.getClass(), "first", null);
        setField(term7651, term7651.getClass(), "last", null);
        setField(term7651, term7651.getClass(), "propListHead", null);
        setIntField(term7651, term7651.getClass(), "sourcePosition", 0);
        setField(term7651, term7651.getClass(), "jsType", null);
        setField(term7651, term7651.getClass(), "parent", null);
        setField(term7649, term7649.getClass(), "first", term7651);
        setIntField(term7652, term7652.getClass(), "type", 0);
        setField(term7652, term7652.getClass(), "next", null);
        setField(term7652, term7652.getClass(), "first", null);
        setField(term7652, term7652.getClass(), "last", null);
        setField(term7652, term7652.getClass(), "propListHead", null);
        setIntField(term7652, term7652.getClass(), "sourcePosition", 0);
        setField(term7652, term7652.getClass(), "jsType", null);
        setField(term7652, term7652.getClass(), "parent", null);
        setField(term7649, term7649.getClass(), "last", term7652);
        setField(term7653, term7653.getClass(), "next", null);
        setIntField(term7653, term7653.getClass(), "type", 0);
        setIntField(term7653, term7653.getClass(), "intValue", 0);
        setField(term7653, term7653.getClass(), "objectValue", null);
        setField(term7649, term7649.getClass(), "propListHead", term7653);
        setIntField(term7649, term7649.getClass(), "sourcePosition", 1557431527);
        setField(term7649, term7649.getClass(), "jsType", null);
        setField(term7649, term7649.getClass(), "parent", null);
        setField(term7648, term7648.getClass(), "next", term7649);
        setIntField(term7654, term7654.getClass(), "type", 0);
        setField(term7654, term7654.getClass(), "next", null);
        setField(term7654, term7654.getClass(), "first", null);
        setField(term7654, term7654.getClass(), "last", null);
        setField(term7654, term7654.getClass(), "propListHead", null);
        setIntField(term7654, term7654.getClass(), "sourcePosition", 0);
        setField(term7654, term7654.getClass(), "jsType", null);
        setField(term7654, term7654.getClass(), "parent", null);
        setField(term7648, term7648.getClass(), "first", term7654);
        setIntField(term7655, term7655.getClass(), "type", 0);
        setField(term7655, term7655.getClass(), "next", null);
        setField(term7655, term7655.getClass(), "first", null);
        setField(term7655, term7655.getClass(), "last", null);
        setField(term7655, term7655.getClass(), "propListHead", null);
        setIntField(term7655, term7655.getClass(), "sourcePosition", 0);
        setField(term7655, term7655.getClass(), "jsType", null);
        setField(term7655, term7655.getClass(), "parent", null);
        setField(term7648, term7648.getClass(), "last", term7655);
        setField(term7656, term7656.getClass(), "next", null);
        setIntField(term7656, term7656.getClass(), "type", 0);
        setIntField(term7656, term7656.getClass(), "intValue", 0);
        setField(term7656, term7656.getClass(), "objectValue", null);
        setField(term7648, term7648.getClass(), "propListHead", term7656);
        setIntField(term7648, term7648.getClass(), "sourcePosition", -1504890659);
        setField(term7648, term7648.getClass(), "jsType", null);
        setField(term7648, term7648.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term453;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term453, term7648));
    }

};


