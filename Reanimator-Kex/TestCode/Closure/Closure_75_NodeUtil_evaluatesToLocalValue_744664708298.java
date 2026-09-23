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
import java.lang.Object;

public class NodeUtil_evaluatesToLocalValue_744664708298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4296;

    public NodeUtil_evaluatesToLocalValue_744664708298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4309 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4319 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4296, term4296.getClass(), "type", -161850441);
        setIntField(term4298, term4298.getClass(), "type", -1020664075);
        setIntField(term4300, term4300.getClass(), "type", 0);
        setField(term4300, term4300.getClass(), "next", null);
        setField(term4300, term4300.getClass(), "first", null);
        setField(term4300, term4300.getClass(), "last", null);
        setField(term4300, term4300.getClass(), "propListHead", null);
        setIntField(term4300, term4300.getClass(), "sourcePosition", 0);
        setField(term4300, term4300.getClass(), "jsType", null);
        setField(term4300, term4300.getClass(), "parent", null);
        setField(term4298, term4298.getClass(), "next", term4300);
        setIntField(term4303, term4303.getClass(), "type", 0);
        setField(term4303, term4303.getClass(), "next", null);
        setField(term4303, term4303.getClass(), "first", null);
        setField(term4303, term4303.getClass(), "last", null);
        setField(term4303, term4303.getClass(), "propListHead", null);
        setIntField(term4303, term4303.getClass(), "sourcePosition", 0);
        setField(term4303, term4303.getClass(), "jsType", null);
        setField(term4303, term4303.getClass(), "parent", null);
        setField(term4298, term4298.getClass(), "first", term4303);
        setIntField(term4306, term4306.getClass(), "type", 0);
        setField(term4306, term4306.getClass(), "next", null);
        setField(term4306, term4306.getClass(), "first", null);
        setField(term4306, term4306.getClass(), "last", null);
        setField(term4306, term4306.getClass(), "propListHead", null);
        setIntField(term4306, term4306.getClass(), "sourcePosition", 0);
        setField(term4306, term4306.getClass(), "jsType", null);
        setField(term4306, term4306.getClass(), "parent", null);
        setField(term4298, term4298.getClass(), "last", term4306);
        setField(term4309, term4309.getClass(), "next", null);
        setIntField(term4309, term4309.getClass(), "type", 0);
        setIntField(term4309, term4309.getClass(), "intValue", 0);
        setField(term4309, term4309.getClass(), "objectValue", null);
        setField(term4298, term4298.getClass(), "propListHead", term4309);
        setIntField(term4298, term4298.getClass(), "sourcePosition", -1477091217);
        setField(term4298, term4298.getClass(), "jsType", null);
        setField(term4298, term4298.getClass(), "parent", null);
        setField(term4296, term4296.getClass(), "next", term4298);
        setIntField(term4313, term4313.getClass(), "type", 0);
        setField(term4313, term4313.getClass(), "next", null);
        setField(term4313, term4313.getClass(), "first", null);
        setField(term4313, term4313.getClass(), "last", null);
        setField(term4313, term4313.getClass(), "propListHead", null);
        setIntField(term4313, term4313.getClass(), "sourcePosition", 0);
        setField(term4313, term4313.getClass(), "jsType", null);
        setField(term4313, term4313.getClass(), "parent", null);
        setField(term4296, term4296.getClass(), "first", term4313);
        setIntField(term4316, term4316.getClass(), "type", 0);
        setField(term4316, term4316.getClass(), "next", null);
        setField(term4316, term4316.getClass(), "first", null);
        setField(term4316, term4316.getClass(), "last", null);
        setField(term4316, term4316.getClass(), "propListHead", null);
        setIntField(term4316, term4316.getClass(), "sourcePosition", 0);
        setField(term4316, term4316.getClass(), "jsType", null);
        setField(term4316, term4316.getClass(), "parent", null);
        setField(term4296, term4296.getClass(), "last", term4316);
        setField(term4319, term4319.getClass(), "next", null);
        setIntField(term4319, term4319.getClass(), "type", 0);
        setIntField(term4319, term4319.getClass(), "intValue", 0);
        setField(term4319, term4319.getClass(), "objectValue", null);
        setField(term4296, term4296.getClass(), "propListHead", term4319);
        setIntField(term4296, term4296.getClass(), "sourcePosition", 2023226154);
        setField(term4296, term4296.getClass(), "jsType", null);
        setField(term4296, term4296.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4296;
        try {
            callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


