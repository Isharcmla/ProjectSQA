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
import java.lang.Boolean;

public class NodeUtil_checkForStateChangeHelper_59481725118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323;
     Object term350;
     Object term4605;

    public NodeUtil_checkForStateChangeHelper_59481725118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term336 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term346 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term323, term323.getClass(), "type", 71190297);
        setIntField(term325, term325.getClass(), "type", -1222006000);
        setIntField(term327, term327.getClass(), "type", 0);
        setField(term327, term327.getClass(), "next", null);
        setField(term327, term327.getClass(), "first", null);
        setField(term327, term327.getClass(), "last", null);
        setField(term327, term327.getClass(), "propListHead", null);
        setIntField(term327, term327.getClass(), "sourcePosition", 0);
        setField(term327, term327.getClass(), "jsType", null);
        setField(term327, term327.getClass(), "parent", null);
        setField(term325, term325.getClass(), "next", term327);
        setIntField(term330, term330.getClass(), "type", 0);
        setField(term330, term330.getClass(), "next", null);
        setField(term330, term330.getClass(), "first", null);
        setField(term330, term330.getClass(), "last", null);
        setField(term330, term330.getClass(), "propListHead", null);
        setIntField(term330, term330.getClass(), "sourcePosition", 0);
        setField(term330, term330.getClass(), "jsType", null);
        setField(term330, term330.getClass(), "parent", null);
        setField(term325, term325.getClass(), "first", term330);
        setIntField(term333, term333.getClass(), "type", 0);
        setField(term333, term333.getClass(), "next", null);
        setField(term333, term333.getClass(), "first", null);
        setField(term333, term333.getClass(), "last", null);
        setField(term333, term333.getClass(), "propListHead", null);
        setIntField(term333, term333.getClass(), "sourcePosition", 0);
        setField(term333, term333.getClass(), "jsType", null);
        setField(term333, term333.getClass(), "parent", null);
        setField(term325, term325.getClass(), "last", term333);
        setField(term336, term336.getClass(), "next", null);
        setIntField(term336, term336.getClass(), "type", 0);
        setIntField(term336, term336.getClass(), "intValue", 0);
        setField(term336, term336.getClass(), "objectValue", null);
        setField(term325, term325.getClass(), "propListHead", term336);
        setIntField(term325, term325.getClass(), "sourcePosition", 344323424);
        setField(term325, term325.getClass(), "jsType", null);
        setField(term325, term325.getClass(), "parent", null);
        setField(term323, term323.getClass(), "next", term325);
        setIntField(term340, term340.getClass(), "type", 0);
        setField(term340, term340.getClass(), "next", null);
        setField(term340, term340.getClass(), "first", null);
        setField(term340, term340.getClass(), "last", null);
        setField(term340, term340.getClass(), "propListHead", null);
        setIntField(term340, term340.getClass(), "sourcePosition", 0);
        setField(term340, term340.getClass(), "jsType", null);
        setField(term340, term340.getClass(), "parent", null);
        setField(term323, term323.getClass(), "first", term340);
        setIntField(term343, term343.getClass(), "type", 0);
        setField(term343, term343.getClass(), "next", null);
        setField(term343, term343.getClass(), "first", null);
        setField(term343, term343.getClass(), "last", null);
        setField(term343, term343.getClass(), "propListHead", null);
        setIntField(term343, term343.getClass(), "sourcePosition", 0);
        setField(term343, term343.getClass(), "jsType", null);
        setField(term343, term343.getClass(), "parent", null);
        setField(term323, term323.getClass(), "last", term343);
        setField(term346, term346.getClass(), "next", null);
        setIntField(term346, term346.getClass(), "type", 0);
        setIntField(term346, term346.getClass(), "intValue", 0);
        setField(term346, term346.getClass(), "objectValue", null);
        setField(term323, term323.getClass(), "propListHead", term346);
        setIntField(term323, term323.getClass(), "sourcePosition", 9726679);
        setField(term323, term323.getClass(), "jsType", null);
        setField(term323, term323.getClass(), "parent", null);
        term350 = new Boolean(false);
        term4605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4610 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4613 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4605, term4605.getClass(), "type", 71190297);
        setIntField(term4606, term4606.getClass(), "type", -1222006000);
        setIntField(term4607, term4607.getClass(), "type", 0);
        setField(term4607, term4607.getClass(), "next", null);
        setField(term4607, term4607.getClass(), "first", null);
        setField(term4607, term4607.getClass(), "last", null);
        setField(term4607, term4607.getClass(), "propListHead", null);
        setIntField(term4607, term4607.getClass(), "sourcePosition", 0);
        setField(term4607, term4607.getClass(), "jsType", null);
        setField(term4607, term4607.getClass(), "parent", null);
        setField(term4606, term4606.getClass(), "next", term4607);
        setIntField(term4608, term4608.getClass(), "type", 0);
        setField(term4608, term4608.getClass(), "next", null);
        setField(term4608, term4608.getClass(), "first", null);
        setField(term4608, term4608.getClass(), "last", null);
        setField(term4608, term4608.getClass(), "propListHead", null);
        setIntField(term4608, term4608.getClass(), "sourcePosition", 0);
        setField(term4608, term4608.getClass(), "jsType", null);
        setField(term4608, term4608.getClass(), "parent", null);
        setField(term4606, term4606.getClass(), "first", term4608);
        setIntField(term4609, term4609.getClass(), "type", 0);
        setField(term4609, term4609.getClass(), "next", null);
        setField(term4609, term4609.getClass(), "first", null);
        setField(term4609, term4609.getClass(), "last", null);
        setField(term4609, term4609.getClass(), "propListHead", null);
        setIntField(term4609, term4609.getClass(), "sourcePosition", 0);
        setField(term4609, term4609.getClass(), "jsType", null);
        setField(term4609, term4609.getClass(), "parent", null);
        setField(term4606, term4606.getClass(), "last", term4609);
        setField(term4610, term4610.getClass(), "next", null);
        setIntField(term4610, term4610.getClass(), "type", 0);
        setIntField(term4610, term4610.getClass(), "intValue", 0);
        setField(term4610, term4610.getClass(), "objectValue", null);
        setField(term4606, term4606.getClass(), "propListHead", term4610);
        setIntField(term4606, term4606.getClass(), "sourcePosition", 344323424);
        setField(term4606, term4606.getClass(), "jsType", null);
        setField(term4606, term4606.getClass(), "parent", null);
        setField(term4605, term4605.getClass(), "next", term4606);
        setIntField(term4611, term4611.getClass(), "type", 0);
        setField(term4611, term4611.getClass(), "next", null);
        setField(term4611, term4611.getClass(), "first", null);
        setField(term4611, term4611.getClass(), "last", null);
        setField(term4611, term4611.getClass(), "propListHead", null);
        setIntField(term4611, term4611.getClass(), "sourcePosition", 0);
        setField(term4611, term4611.getClass(), "jsType", null);
        setField(term4611, term4611.getClass(), "parent", null);
        setField(term4605, term4605.getClass(), "first", term4611);
        setIntField(term4612, term4612.getClass(), "type", 0);
        setField(term4612, term4612.getClass(), "next", null);
        setField(term4612, term4612.getClass(), "first", null);
        setField(term4612, term4612.getClass(), "last", null);
        setField(term4612, term4612.getClass(), "propListHead", null);
        setIntField(term4612, term4612.getClass(), "sourcePosition", 0);
        setField(term4612, term4612.getClass(), "jsType", null);
        setField(term4612, term4612.getClass(), "parent", null);
        setField(term4605, term4605.getClass(), "last", term4612);
        setField(term4613, term4613.getClass(), "next", null);
        setIntField(term4613, term4613.getClass(), "type", 0);
        setIntField(term4613, term4613.getClass(), "intValue", 0);
        setField(term4613, term4613.getClass(), "objectValue", null);
        setField(term4605, term4605.getClass(), "propListHead", term4613);
        setIntField(term4605, term4605.getClass(), "sourcePosition", 9726679);
        setField(term4605, term4605.getClass(), "jsType", null);
        setField(term4605, term4605.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term323;
        args[1] = term350;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term323, term4605));
        assertTrue(recursiveEquals(term350, false));
        assertTrue(recursiveEquals(retValue, true));
    }

};


