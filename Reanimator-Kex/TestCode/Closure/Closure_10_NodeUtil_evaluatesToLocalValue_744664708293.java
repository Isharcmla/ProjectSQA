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

public class NodeUtil_evaluatesToLocalValue_744664708293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4009;

    public NodeUtil_evaluatesToLocalValue_744664708293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4009, term4009.getClass(), "type", 1369020869);
        setIntField(term4011, term4011.getClass(), "type", -1428947021);
        setIntField(term4013, term4013.getClass(), "type", -134324004);
        setIntField(term4015, term4015.getClass(), "type", -1813266173);
        setIntField(term4017, term4017.getClass(), "type", -1201819537);
        setField(term4017, term4017.getClass(), "next", null);
        setField(term4017, term4017.getClass(), "first", null);
        setField(term4017, term4017.getClass(), "last", null);
        setField(term4017, term4017.getClass(), "propListHead", null);
        setIntField(term4017, term4017.getClass(), "sourcePosition", 0);
        setField(term4017, term4017.getClass(), "jsType", null);
        setField(term4017, term4017.getClass(), "parent", null);
        setField(term4015, term4015.getClass(), "next", term4017);
        setIntField(term4020, term4020.getClass(), "type", 2135922049);
        setField(term4020, term4020.getClass(), "next", null);
        setField(term4020, term4020.getClass(), "first", null);
        setField(term4020, term4020.getClass(), "last", term4017);
        setField(term4020, term4020.getClass(), "propListHead", null);
        setIntField(term4020, term4020.getClass(), "sourcePosition", 0);
        setField(term4020, term4020.getClass(), "jsType", null);
        setField(term4020, term4020.getClass(), "parent", null);
        setField(term4015, term4015.getClass(), "first", term4020);
        setField(term4015, term4015.getClass(), "last", term4013);
        setField(term4015, term4015.getClass(), "propListHead", null);
        setIntField(term4015, term4015.getClass(), "sourcePosition", 0);
        setField(term4015, term4015.getClass(), "jsType", null);
        setField(term4015, term4015.getClass(), "parent", null);
        setField(term4013, term4013.getClass(), "next", term4015);
        setField(term4013, term4013.getClass(), "first", term4017);
        setIntField(term4024, term4024.getClass(), "type", -755209283);
        setIntField(term4026, term4026.getClass(), "type", -616562794);
        setField(term4026, term4026.getClass(), "next", null);
        setField(term4026, term4026.getClass(), "first", term4020);
        setField(term4026, term4026.getClass(), "last", term4015);
        setField(term4026, term4026.getClass(), "propListHead", null);
        setIntField(term4026, term4026.getClass(), "sourcePosition", 0);
        setField(term4026, term4026.getClass(), "jsType", null);
        setField(term4026, term4026.getClass(), "parent", null);
        setField(term4024, term4024.getClass(), "next", term4026);
        setField(term4024, term4024.getClass(), "first", term4011);
        setField(term4024, term4024.getClass(), "last", term4011);
        setField(term4024, term4024.getClass(), "propListHead", null);
        setIntField(term4024, term4024.getClass(), "sourcePosition", 0);
        setField(term4024, term4024.getClass(), "jsType", null);
        setField(term4024, term4024.getClass(), "parent", null);
        setField(term4013, term4013.getClass(), "last", term4024);
        setField(term4013, term4013.getClass(), "propListHead", null);
        setIntField(term4013, term4013.getClass(), "sourcePosition", 0);
        setField(term4013, term4013.getClass(), "jsType", null);
        setField(term4013, term4013.getClass(), "parent", null);
        setField(term4011, term4011.getClass(), "next", term4013);
        setIntField(term4031, term4031.getClass(), "type", 750084083);
        setField(term4031, term4031.getClass(), "next", term4024);
        setField(term4031, term4031.getClass(), "first", term4026);
        setField(term4031, term4031.getClass(), "last", term4009);
        setField(term4031, term4031.getClass(), "propListHead", null);
        setIntField(term4031, term4031.getClass(), "sourcePosition", 0);
        setField(term4031, term4031.getClass(), "jsType", null);
        setField(term4031, term4031.getClass(), "parent", null);
        setField(term4011, term4011.getClass(), "first", term4031);
        setField(term4011, term4011.getClass(), "last", term4031);
        setField(term4011, term4011.getClass(), "propListHead", null);
        setIntField(term4011, term4011.getClass(), "sourcePosition", 0);
        setField(term4011, term4011.getClass(), "jsType", null);
        setField(term4011, term4011.getClass(), "parent", null);
        setField(term4009, term4009.getClass(), "next", term4011);
        setField(term4009, term4009.getClass(), "first", term4015);
        setField(term4009, term4009.getClass(), "last", term4017);
        setField(term4009, term4009.getClass(), "propListHead", null);
        setIntField(term4009, term4009.getClass(), "sourcePosition", 0);
        setField(term4009, term4009.getClass(), "jsType", null);
        setField(term4009, term4009.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4009;
        try {
            callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


