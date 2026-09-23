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

public class NodeUtil_mayHaveSideEffects_109682951176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413;
     Object term6802;

    public NodeUtil_mayHaveSideEffects_109682951176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term413, term413.getClass(), "type", -243422082);
        setIntField(term415, term415.getClass(), "type", 1296895584);
        setIntField(term417, term417.getClass(), "type", 0);
        setField(term417, term417.getClass(), "next", null);
        setField(term417, term417.getClass(), "first", null);
        setField(term417, term417.getClass(), "last", null);
        setField(term417, term417.getClass(), "propListHead", null);
        setIntField(term417, term417.getClass(), "sourcePosition", 0);
        setField(term417, term417.getClass(), "jsType", null);
        setField(term417, term417.getClass(), "parent", null);
        setField(term415, term415.getClass(), "next", term417);
        setIntField(term420, term420.getClass(), "type", 0);
        setField(term420, term420.getClass(), "next", null);
        setField(term420, term420.getClass(), "first", null);
        setField(term420, term420.getClass(), "last", null);
        setField(term420, term420.getClass(), "propListHead", null);
        setIntField(term420, term420.getClass(), "sourcePosition", 0);
        setField(term420, term420.getClass(), "jsType", null);
        setField(term420, term420.getClass(), "parent", null);
        setField(term415, term415.getClass(), "first", term420);
        setIntField(term423, term423.getClass(), "type", 0);
        setField(term423, term423.getClass(), "next", null);
        setField(term423, term423.getClass(), "first", null);
        setField(term423, term423.getClass(), "last", null);
        setField(term423, term423.getClass(), "propListHead", null);
        setIntField(term423, term423.getClass(), "sourcePosition", 0);
        setField(term423, term423.getClass(), "jsType", null);
        setField(term423, term423.getClass(), "parent", null);
        setField(term415, term415.getClass(), "last", term423);
        setField(term415, term415.getClass(), "propListHead", null);
        setIntField(term415, term415.getClass(), "sourcePosition", 0);
        setField(term415, term415.getClass(), "jsType", null);
        setField(term415, term415.getClass(), "parent", null);
        setField(term413, term413.getClass(), "next", term415);
        setIntField(term427, term427.getClass(), "type", 0);
        setField(term427, term427.getClass(), "next", null);
        setField(term427, term427.getClass(), "first", null);
        setField(term427, term427.getClass(), "last", null);
        setField(term427, term427.getClass(), "propListHead", null);
        setIntField(term427, term427.getClass(), "sourcePosition", 0);
        setField(term427, term427.getClass(), "jsType", null);
        setField(term427, term427.getClass(), "parent", null);
        setField(term413, term413.getClass(), "first", term427);
        setIntField(term430, term430.getClass(), "type", 0);
        setField(term430, term430.getClass(), "next", null);
        setField(term430, term430.getClass(), "first", null);
        setField(term430, term430.getClass(), "last", null);
        setField(term430, term430.getClass(), "propListHead", null);
        setIntField(term430, term430.getClass(), "sourcePosition", 0);
        setField(term430, term430.getClass(), "jsType", null);
        setField(term430, term430.getClass(), "parent", null);
        setField(term413, term413.getClass(), "last", term430);
        setField(term413, term413.getClass(), "propListHead", null);
        setIntField(term413, term413.getClass(), "sourcePosition", 0);
        setField(term413, term413.getClass(), "jsType", null);
        setField(term413, term413.getClass(), "parent", null);
        term6802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6802, term6802.getClass(), "type", -243422082);
        setIntField(term6803, term6803.getClass(), "type", 1296895584);
        setIntField(term6804, term6804.getClass(), "type", 0);
        setField(term6804, term6804.getClass(), "next", null);
        setField(term6804, term6804.getClass(), "first", null);
        setField(term6804, term6804.getClass(), "last", null);
        setField(term6804, term6804.getClass(), "propListHead", null);
        setIntField(term6804, term6804.getClass(), "sourcePosition", 0);
        setField(term6804, term6804.getClass(), "jsType", null);
        setField(term6804, term6804.getClass(), "parent", null);
        setField(term6803, term6803.getClass(), "next", term6804);
        setIntField(term6805, term6805.getClass(), "type", 0);
        setField(term6805, term6805.getClass(), "next", null);
        setField(term6805, term6805.getClass(), "first", null);
        setField(term6805, term6805.getClass(), "last", null);
        setField(term6805, term6805.getClass(), "propListHead", null);
        setIntField(term6805, term6805.getClass(), "sourcePosition", 0);
        setField(term6805, term6805.getClass(), "jsType", null);
        setField(term6805, term6805.getClass(), "parent", null);
        setField(term6803, term6803.getClass(), "first", term6805);
        setIntField(term6806, term6806.getClass(), "type", 0);
        setField(term6806, term6806.getClass(), "next", null);
        setField(term6806, term6806.getClass(), "first", null);
        setField(term6806, term6806.getClass(), "last", null);
        setField(term6806, term6806.getClass(), "propListHead", null);
        setIntField(term6806, term6806.getClass(), "sourcePosition", 0);
        setField(term6806, term6806.getClass(), "jsType", null);
        setField(term6806, term6806.getClass(), "parent", null);
        setField(term6803, term6803.getClass(), "last", term6806);
        setField(term6803, term6803.getClass(), "propListHead", null);
        setIntField(term6803, term6803.getClass(), "sourcePosition", 0);
        setField(term6803, term6803.getClass(), "jsType", null);
        setField(term6803, term6803.getClass(), "parent", null);
        setField(term6802, term6802.getClass(), "next", term6803);
        setIntField(term6807, term6807.getClass(), "type", 0);
        setField(term6807, term6807.getClass(), "next", null);
        setField(term6807, term6807.getClass(), "first", null);
        setField(term6807, term6807.getClass(), "last", null);
        setField(term6807, term6807.getClass(), "propListHead", null);
        setIntField(term6807, term6807.getClass(), "sourcePosition", 0);
        setField(term6807, term6807.getClass(), "jsType", null);
        setField(term6807, term6807.getClass(), "parent", null);
        setField(term6802, term6802.getClass(), "first", term6807);
        setIntField(term6808, term6808.getClass(), "type", 0);
        setField(term6808, term6808.getClass(), "next", null);
        setField(term6808, term6808.getClass(), "first", null);
        setField(term6808, term6808.getClass(), "last", null);
        setField(term6808, term6808.getClass(), "propListHead", null);
        setIntField(term6808, term6808.getClass(), "sourcePosition", 0);
        setField(term6808, term6808.getClass(), "jsType", null);
        setField(term6808, term6808.getClass(), "parent", null);
        setField(term6802, term6802.getClass(), "last", term6808);
        setField(term6802, term6802.getClass(), "propListHead", null);
        setIntField(term6802, term6802.getClass(), "sourcePosition", 0);
        setField(term6802, term6802.getClass(), "jsType", null);
        setField(term6802, term6802.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term413;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term413, term6802));
    }

};


