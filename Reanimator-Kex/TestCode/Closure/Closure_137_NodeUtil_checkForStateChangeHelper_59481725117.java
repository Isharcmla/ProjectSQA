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

public class NodeUtil_checkForStateChangeHelper_59481725117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323;
     Object term350;
     Object term4578;

    public NodeUtil_checkForStateChangeHelper_59481725117() {
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
        term4578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4583 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4586 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4578, term4578.getClass(), "type", 71190297);
        setIntField(term4579, term4579.getClass(), "type", -1222006000);
        setIntField(term4580, term4580.getClass(), "type", 0);
        setField(term4580, term4580.getClass(), "next", null);
        setField(term4580, term4580.getClass(), "first", null);
        setField(term4580, term4580.getClass(), "last", null);
        setField(term4580, term4580.getClass(), "propListHead", null);
        setIntField(term4580, term4580.getClass(), "sourcePosition", 0);
        setField(term4580, term4580.getClass(), "jsType", null);
        setField(term4580, term4580.getClass(), "parent", null);
        setField(term4579, term4579.getClass(), "next", term4580);
        setIntField(term4581, term4581.getClass(), "type", 0);
        setField(term4581, term4581.getClass(), "next", null);
        setField(term4581, term4581.getClass(), "first", null);
        setField(term4581, term4581.getClass(), "last", null);
        setField(term4581, term4581.getClass(), "propListHead", null);
        setIntField(term4581, term4581.getClass(), "sourcePosition", 0);
        setField(term4581, term4581.getClass(), "jsType", null);
        setField(term4581, term4581.getClass(), "parent", null);
        setField(term4579, term4579.getClass(), "first", term4581);
        setIntField(term4582, term4582.getClass(), "type", 0);
        setField(term4582, term4582.getClass(), "next", null);
        setField(term4582, term4582.getClass(), "first", null);
        setField(term4582, term4582.getClass(), "last", null);
        setField(term4582, term4582.getClass(), "propListHead", null);
        setIntField(term4582, term4582.getClass(), "sourcePosition", 0);
        setField(term4582, term4582.getClass(), "jsType", null);
        setField(term4582, term4582.getClass(), "parent", null);
        setField(term4579, term4579.getClass(), "last", term4582);
        setField(term4583, term4583.getClass(), "next", null);
        setIntField(term4583, term4583.getClass(), "type", 0);
        setIntField(term4583, term4583.getClass(), "intValue", 0);
        setField(term4583, term4583.getClass(), "objectValue", null);
        setField(term4579, term4579.getClass(), "propListHead", term4583);
        setIntField(term4579, term4579.getClass(), "sourcePosition", 344323424);
        setField(term4579, term4579.getClass(), "jsType", null);
        setField(term4579, term4579.getClass(), "parent", null);
        setField(term4578, term4578.getClass(), "next", term4579);
        setIntField(term4584, term4584.getClass(), "type", 0);
        setField(term4584, term4584.getClass(), "next", null);
        setField(term4584, term4584.getClass(), "first", null);
        setField(term4584, term4584.getClass(), "last", null);
        setField(term4584, term4584.getClass(), "propListHead", null);
        setIntField(term4584, term4584.getClass(), "sourcePosition", 0);
        setField(term4584, term4584.getClass(), "jsType", null);
        setField(term4584, term4584.getClass(), "parent", null);
        setField(term4578, term4578.getClass(), "first", term4584);
        setIntField(term4585, term4585.getClass(), "type", 0);
        setField(term4585, term4585.getClass(), "next", null);
        setField(term4585, term4585.getClass(), "first", null);
        setField(term4585, term4585.getClass(), "last", null);
        setField(term4585, term4585.getClass(), "propListHead", null);
        setIntField(term4585, term4585.getClass(), "sourcePosition", 0);
        setField(term4585, term4585.getClass(), "jsType", null);
        setField(term4585, term4585.getClass(), "parent", null);
        setField(term4578, term4578.getClass(), "last", term4585);
        setField(term4586, term4586.getClass(), "next", null);
        setIntField(term4586, term4586.getClass(), "type", 0);
        setIntField(term4586, term4586.getClass(), "intValue", 0);
        setField(term4586, term4586.getClass(), "objectValue", null);
        setField(term4578, term4578.getClass(), "propListHead", term4586);
        setIntField(term4578, term4578.getClass(), "sourcePosition", 9726679);
        setField(term4578, term4578.getClass(), "jsType", null);
        setField(term4578, term4578.getClass(), "parent", null);
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
        assertTrue(recursiveEquals(term323, term4578));
        assertTrue(recursiveEquals(term350, false));
        assertTrue(recursiveEquals(retValue, true));
    }

};


