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

public class ControlFlowAnalysis_mayThrowException_128763591869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3106;

    public ControlFlowAnalysis_mayThrowException_128763591869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3119 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3129 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3106, term3106.getClass(), "type", 81427089);
        setIntField(term3108, term3108.getClass(), "type", 1558810715);
        setIntField(term3110, term3110.getClass(), "type", 0);
        setField(term3110, term3110.getClass(), "next", null);
        setField(term3110, term3110.getClass(), "first", null);
        setField(term3110, term3110.getClass(), "last", null);
        setField(term3110, term3110.getClass(), "propListHead", null);
        setIntField(term3110, term3110.getClass(), "sourcePosition", 0);
        setField(term3110, term3110.getClass(), "jsType", null);
        setField(term3110, term3110.getClass(), "parent", null);
        setField(term3108, term3108.getClass(), "next", term3110);
        setIntField(term3113, term3113.getClass(), "type", 0);
        setField(term3113, term3113.getClass(), "next", null);
        setField(term3113, term3113.getClass(), "first", null);
        setField(term3113, term3113.getClass(), "last", null);
        setField(term3113, term3113.getClass(), "propListHead", null);
        setIntField(term3113, term3113.getClass(), "sourcePosition", 0);
        setField(term3113, term3113.getClass(), "jsType", null);
        setField(term3113, term3113.getClass(), "parent", null);
        setField(term3108, term3108.getClass(), "first", term3113);
        setIntField(term3116, term3116.getClass(), "type", 0);
        setField(term3116, term3116.getClass(), "next", null);
        setField(term3116, term3116.getClass(), "first", null);
        setField(term3116, term3116.getClass(), "last", null);
        setField(term3116, term3116.getClass(), "propListHead", null);
        setIntField(term3116, term3116.getClass(), "sourcePosition", 0);
        setField(term3116, term3116.getClass(), "jsType", null);
        setField(term3116, term3116.getClass(), "parent", null);
        setField(term3108, term3108.getClass(), "last", term3116);
        setField(term3119, term3119.getClass(), "next", null);
        setIntField(term3119, term3119.getClass(), "type", 0);
        setIntField(term3119, term3119.getClass(), "intValue", 0);
        setField(term3119, term3119.getClass(), "objectValue", null);
        setField(term3108, term3108.getClass(), "propListHead", term3119);
        setIntField(term3108, term3108.getClass(), "sourcePosition", 196952878);
        setField(term3108, term3108.getClass(), "jsType", null);
        setField(term3108, term3108.getClass(), "parent", null);
        setField(term3106, term3106.getClass(), "next", term3108);
        setIntField(term3123, term3123.getClass(), "type", 0);
        setField(term3123, term3123.getClass(), "next", null);
        setField(term3123, term3123.getClass(), "first", null);
        setField(term3123, term3123.getClass(), "last", null);
        setField(term3123, term3123.getClass(), "propListHead", null);
        setIntField(term3123, term3123.getClass(), "sourcePosition", 0);
        setField(term3123, term3123.getClass(), "jsType", null);
        setField(term3123, term3123.getClass(), "parent", null);
        setField(term3106, term3106.getClass(), "first", term3123);
        setIntField(term3126, term3126.getClass(), "type", 0);
        setField(term3126, term3126.getClass(), "next", null);
        setField(term3126, term3126.getClass(), "first", null);
        setField(term3126, term3126.getClass(), "last", null);
        setField(term3126, term3126.getClass(), "propListHead", null);
        setIntField(term3126, term3126.getClass(), "sourcePosition", 0);
        setField(term3126, term3126.getClass(), "jsType", null);
        setField(term3126, term3126.getClass(), "parent", null);
        setField(term3106, term3106.getClass(), "last", term3126);
        setField(term3129, term3129.getClass(), "next", null);
        setIntField(term3129, term3129.getClass(), "type", 0);
        setIntField(term3129, term3129.getClass(), "intValue", 0);
        setField(term3129, term3129.getClass(), "objectValue", null);
        setField(term3106, term3106.getClass(), "propListHead", term3129);
        setIntField(term3106, term3106.getClass(), "sourcePosition", 802673242);
        setField(term3106, term3106.getClass(), "jsType", null);
        setField(term3106, term3106.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3106;
        try {
            callMethod(klass, "mayThrowException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


