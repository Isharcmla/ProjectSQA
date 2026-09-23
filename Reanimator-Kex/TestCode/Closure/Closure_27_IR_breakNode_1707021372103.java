package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_breakNode_1707021372103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1213;

    public IR_breakNode_1707021372103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1213, term1213.getClass(), "type", -97742366);
        setIntField(term1215, term1215.getClass(), "type", 1638851942);
        setIntField(term1217, term1217.getClass(), "type", 1374790203);
        setIntField(term1219, term1219.getClass(), "type", 1160010161);
        setIntField(term1221, term1221.getClass(), "type", -423900705);
        setField(term1221, term1221.getClass(), "next", null);
        setField(term1221, term1221.getClass(), "first", null);
        setField(term1221, term1221.getClass(), "last", null);
        setField(term1221, term1221.getClass(), "propListHead", null);
        setIntField(term1221, term1221.getClass(), "sourcePosition", 0);
        setField(term1221, term1221.getClass(), "jsType", null);
        setField(term1221, term1221.getClass(), "parent", null);
        setField(term1219, term1219.getClass(), "next", term1221);
        setIntField(term1224, term1224.getClass(), "type", -525570815);
        setField(term1224, term1224.getClass(), "next", null);
        setField(term1224, term1224.getClass(), "first", null);
        setField(term1224, term1224.getClass(), "last", term1221);
        setField(term1224, term1224.getClass(), "propListHead", null);
        setIntField(term1224, term1224.getClass(), "sourcePosition", 0);
        setField(term1224, term1224.getClass(), "jsType", null);
        setField(term1224, term1224.getClass(), "parent", null);
        setField(term1219, term1219.getClass(), "first", term1224);
        setField(term1219, term1219.getClass(), "last", term1217);
        setField(term1219, term1219.getClass(), "propListHead", null);
        setIntField(term1219, term1219.getClass(), "sourcePosition", 0);
        setField(term1219, term1219.getClass(), "jsType", null);
        setField(term1219, term1219.getClass(), "parent", null);
        setField(term1217, term1217.getClass(), "next", term1219);
        setField(term1217, term1217.getClass(), "first", term1221);
        setIntField(term1228, term1228.getClass(), "type", -19246901);
        setIntField(term1230, term1230.getClass(), "type", -370828664);
        setField(term1230, term1230.getClass(), "next", null);
        setField(term1230, term1230.getClass(), "first", term1224);
        setField(term1230, term1230.getClass(), "last", term1219);
        setField(term1230, term1230.getClass(), "propListHead", null);
        setIntField(term1230, term1230.getClass(), "sourcePosition", 0);
        setField(term1230, term1230.getClass(), "jsType", null);
        setField(term1230, term1230.getClass(), "parent", null);
        setField(term1228, term1228.getClass(), "next", term1230);
        setField(term1228, term1228.getClass(), "first", term1215);
        setField(term1228, term1228.getClass(), "last", term1215);
        setField(term1228, term1228.getClass(), "propListHead", null);
        setIntField(term1228, term1228.getClass(), "sourcePosition", 0);
        setField(term1228, term1228.getClass(), "jsType", null);
        setField(term1228, term1228.getClass(), "parent", null);
        setField(term1217, term1217.getClass(), "last", term1228);
        setField(term1217, term1217.getClass(), "propListHead", null);
        setIntField(term1217, term1217.getClass(), "sourcePosition", 0);
        setField(term1217, term1217.getClass(), "jsType", null);
        setField(term1217, term1217.getClass(), "parent", null);
        setField(term1215, term1215.getClass(), "next", term1217);
        setIntField(term1235, term1235.getClass(), "type", 1168633950);
        setField(term1235, term1235.getClass(), "next", term1228);
        setField(term1235, term1235.getClass(), "first", term1230);
        setField(term1235, term1235.getClass(), "last", term1213);
        setField(term1235, term1235.getClass(), "propListHead", null);
        setIntField(term1235, term1235.getClass(), "sourcePosition", 0);
        setField(term1235, term1235.getClass(), "jsType", null);
        setField(term1235, term1235.getClass(), "parent", null);
        setField(term1215, term1215.getClass(), "first", term1235);
        setField(term1215, term1215.getClass(), "last", term1235);
        setField(term1215, term1215.getClass(), "propListHead", null);
        setIntField(term1215, term1215.getClass(), "sourcePosition", 0);
        setField(term1215, term1215.getClass(), "jsType", null);
        setField(term1215, term1215.getClass(), "parent", null);
        setField(term1213, term1213.getClass(), "next", term1215);
        setField(term1213, term1213.getClass(), "first", term1219);
        setField(term1213, term1213.getClass(), "last", term1221);
        setField(term1213, term1213.getClass(), "propListHead", null);
        setIntField(term1213, term1213.getClass(), "sourcePosition", 0);
        setField(term1213, term1213.getClass(), "jsType", null);
        setField(term1213, term1213.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1213;
        try {
            callMethod(klass, "breakNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


