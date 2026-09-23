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
     Object term7354;

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
        term7354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7359 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7362 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7354, term7354.getClass(), "type", -601863069);
        setIntField(term7355, term7355.getClass(), "type", -1731761810);
        setIntField(term7356, term7356.getClass(), "type", 0);
        setField(term7356, term7356.getClass(), "next", null);
        setField(term7356, term7356.getClass(), "first", null);
        setField(term7356, term7356.getClass(), "last", null);
        setField(term7356, term7356.getClass(), "propListHead", null);
        setIntField(term7356, term7356.getClass(), "sourcePosition", 0);
        setField(term7356, term7356.getClass(), "jsType", null);
        setField(term7356, term7356.getClass(), "parent", null);
        setField(term7355, term7355.getClass(), "next", term7356);
        setIntField(term7357, term7357.getClass(), "type", 0);
        setField(term7357, term7357.getClass(), "next", null);
        setField(term7357, term7357.getClass(), "first", null);
        setField(term7357, term7357.getClass(), "last", null);
        setField(term7357, term7357.getClass(), "propListHead", null);
        setIntField(term7357, term7357.getClass(), "sourcePosition", 0);
        setField(term7357, term7357.getClass(), "jsType", null);
        setField(term7357, term7357.getClass(), "parent", null);
        setField(term7355, term7355.getClass(), "first", term7357);
        setIntField(term7358, term7358.getClass(), "type", 0);
        setField(term7358, term7358.getClass(), "next", null);
        setField(term7358, term7358.getClass(), "first", null);
        setField(term7358, term7358.getClass(), "last", null);
        setField(term7358, term7358.getClass(), "propListHead", null);
        setIntField(term7358, term7358.getClass(), "sourcePosition", 0);
        setField(term7358, term7358.getClass(), "jsType", null);
        setField(term7358, term7358.getClass(), "parent", null);
        setField(term7355, term7355.getClass(), "last", term7358);
        setField(term7359, term7359.getClass(), "next", null);
        setIntField(term7359, term7359.getClass(), "type", 0);
        setIntField(term7359, term7359.getClass(), "intValue", 0);
        setField(term7359, term7359.getClass(), "objectValue", null);
        setField(term7355, term7355.getClass(), "propListHead", term7359);
        setIntField(term7355, term7355.getClass(), "sourcePosition", 1557431527);
        setField(term7355, term7355.getClass(), "jsType", null);
        setField(term7355, term7355.getClass(), "parent", null);
        setField(term7354, term7354.getClass(), "next", term7355);
        setIntField(term7360, term7360.getClass(), "type", 0);
        setField(term7360, term7360.getClass(), "next", null);
        setField(term7360, term7360.getClass(), "first", null);
        setField(term7360, term7360.getClass(), "last", null);
        setField(term7360, term7360.getClass(), "propListHead", null);
        setIntField(term7360, term7360.getClass(), "sourcePosition", 0);
        setField(term7360, term7360.getClass(), "jsType", null);
        setField(term7360, term7360.getClass(), "parent", null);
        setField(term7354, term7354.getClass(), "first", term7360);
        setIntField(term7361, term7361.getClass(), "type", 0);
        setField(term7361, term7361.getClass(), "next", null);
        setField(term7361, term7361.getClass(), "first", null);
        setField(term7361, term7361.getClass(), "last", null);
        setField(term7361, term7361.getClass(), "propListHead", null);
        setIntField(term7361, term7361.getClass(), "sourcePosition", 0);
        setField(term7361, term7361.getClass(), "jsType", null);
        setField(term7361, term7361.getClass(), "parent", null);
        setField(term7354, term7354.getClass(), "last", term7361);
        setField(term7362, term7362.getClass(), "next", null);
        setIntField(term7362, term7362.getClass(), "type", 0);
        setIntField(term7362, term7362.getClass(), "intValue", 0);
        setField(term7362, term7362.getClass(), "objectValue", null);
        setField(term7354, term7354.getClass(), "propListHead", term7362);
        setIntField(term7354, term7354.getClass(), "sourcePosition", -1504890659);
        setField(term7354, term7354.getClass(), "jsType", null);
        setField(term7354, term7354.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term453;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term453, term7354));
    }

};


