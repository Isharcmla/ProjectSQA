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

public class Normalize_extractForInitializer_142113984841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18621;
     Object term18691;
     Object term21172;

    public Normalize_extractForInitializer_142113984841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18621 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        term18691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term19273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term21172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21218 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18761, term18761.getClass(), "next", null);
        setIntField(term18761, term18761.getClass(), "type", 126);
        setField(term18831, term18831.getClass(), "next", null);
        setIntField(term18831, term18831.getClass(), "type", 126);
        setField(term18901, term18901.getClass(), "next", null);
        setIntField(term18901, term18901.getClass(), "type", 126);
        setField(term18971, term18971.getClass(), "next", null);
        setIntField(term18971, term18971.getClass(), "type", 126);
        setField(term19041, term19041.getClass(), "next", null);
        setIntField(term19041, term19041.getClass(), "type", 126);
        setField(term19111, term19111.getClass(), "next", null);
        setIntField(term19111, term19111.getClass(), "type", 126);
        setField(term19203, term19203.getClass(), "next", null);
        setIntField(term19203, term19203.getClass(), "type", 126);
        setField(term19273, term19273.getClass(), "next", null);
        setIntField(term19273, term19273.getClass(), "type", 126);
        setField(term19343, term19343.getClass(), "next", null);
        setIntField(term19343, term19343.getClass(), "type", 126);
        setField(term19435, term19435.getClass(), "next", null);
        setIntField(term19435, term19435.getClass(), "type", 126);
        setField(term21918, term21918.getClass(), "next", null);
        setIntField(term21918, term21918.getClass(), "type", 126);
        setField(term21953, term21953.getClass(), "next", null);
        setIntField(term21953, term21953.getClass(), "type", 126);
        setField(term21988, term21988.getClass(), "next", null);
        setIntField(term21988, term21988.getClass(), "type", 126);
        setField(term21172, term21172.getClass(), "next", null);
        setIntField(term21172, term21172.getClass(), "type", 126);
        setField(term21218, term21218.getClass(), "next", null);
        setIntField(term21218, term21218.getClass(), "type", 126);
        setField(term21253, term21253.getClass(), "next", null);
        setIntField(term21253, term21253.getClass(), "type", 126);
        setField(term21288, term21288.getClass(), "next", null);
        setIntField(term21288, term21288.getClass(), "type", 126);
        setField(term21323, term21323.getClass(), "next", null);
        setIntField(term21323, term21323.getClass(), "type", 126);
        setField(term21358, term21358.getClass(), "next", null);
        setIntField(term21358, term21358.getClass(), "type", 126);
        setField(term21393, term21393.getClass(), "next", null);
        setIntField(term21393, term21393.getClass(), "type", 126);
        setField(term21428, term21428.getClass(), "next", null);
        setIntField(term21428, term21428.getClass(), "type", 126);
        setField(term21463, term21463.getClass(), "next", null);
        setIntField(term21463, term21463.getClass(), "type", 126);
        setField(term21498, term21498.getClass(), "next", null);
        setIntField(term21498, term21498.getClass(), "type", 126);
        setField(term21533, term21533.getClass(), "next", null);
        setIntField(term21533, term21533.getClass(), "type", 126);
        setField(term21568, term21568.getClass(), "next", null);
        setIntField(term21568, term21568.getClass(), "type", 126);
        setField(term21603, term21603.getClass(), "next", null);
        setIntField(term21603, term21603.getClass(), "type", 126);
        setField(term21638, term21638.getClass(), "next", null);
        setIntField(term21638, term21638.getClass(), "type", 126);
        setField(term21673, term21673.getClass(), "next", null);
        setIntField(term21673, term21673.getClass(), "type", 126);
        setField(term21708, term21708.getClass(), "next", null);
        setIntField(term21708, term21708.getClass(), "type", 126);
        setField(term21743, term21743.getClass(), "next", null);
        setIntField(term21743, term21743.getClass(), "type", 126);
        setField(term21778, term21778.getClass(), "next", null);
        setIntField(term21778, term21778.getClass(), "type", 126);
        setField(term21813, term21813.getClass(), "next", null);
        setIntField(term21813, term21813.getClass(), "type", 126);
        setField(term21848, term21848.getClass(), "next", null);
        setIntField(term21848, term21848.getClass(), "type", 126);
        setField(term21883, term21883.getClass(), "next", null);
        setIntField(term21883, term21883.getClass(), "type", 126);
        setField(term21883, term21883.getClass(), "first", term21918);
        setField(term21848, term21848.getClass(), "first", term21883);
        setField(term21813, term21813.getClass(), "first", term21848);
        setField(term21778, term21778.getClass(), "first", term21813);
        setField(term21743, term21743.getClass(), "first", term21778);
        setField(term21708, term21708.getClass(), "first", term21743);
        setField(term21673, term21673.getClass(), "first", term21708);
        setField(term21638, term21638.getClass(), "first", term21673);
        setField(term21603, term21603.getClass(), "first", term21638);
        setField(term21568, term21568.getClass(), "first", term21603);
        setField(term21533, term21533.getClass(), "first", term21568);
        setField(term21498, term21498.getClass(), "first", term21533);
        setField(term21463, term21463.getClass(), "first", term21498);
        setField(term21428, term21428.getClass(), "first", term21463);
        setField(term21393, term21393.getClass(), "first", term21428);
        setField(term21358, term21358.getClass(), "first", term21393);
        setField(term21323, term21323.getClass(), "first", term21358);
        setField(term21288, term21288.getClass(), "first", term21323);
        setField(term21253, term21253.getClass(), "first", term21288);
        setField(term21218, term21218.getClass(), "first", term21253);
        setField(term21172, term21172.getClass(), "first", term21218);
        setField(term21988, term21988.getClass(), "first", term21172);
        setField(term21953, term21953.getClass(), "first", term21988);
        setField(term21918, term21918.getClass(), "first", term21953);
        setField(term19435, term19435.getClass(), "first", term21918);
        setField(term19343, term19343.getClass(), "first", term19435);
        setField(term19273, term19273.getClass(), "first", term19343);
        setField(term19203, term19203.getClass(), "first", term19273);
        setField(term19111, term19111.getClass(), "first", term19203);
        setField(term19041, term19041.getClass(), "first", term19111);
        setField(term18971, term18971.getClass(), "first", term19041);
        setField(term18901, term18901.getClass(), "first", term18971);
        setField(term18831, term18831.getClass(), "first", term18901);
        setField(term18761, term18761.getClass(), "first", term18831);
        setField(term18691, term18691.getClass(), "first", term18761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term18691;
        args[1] = term21172;
        args[2] = null;
        callMethod(klass, "extractForInitializer", argTypes, term18621, args);
    }

};


