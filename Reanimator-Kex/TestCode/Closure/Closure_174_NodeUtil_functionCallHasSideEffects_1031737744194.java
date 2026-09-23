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

public class NodeUtil_functionCallHasSideEffects_1031737744194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702;

    public NodeUtil_functionCallHasSideEffects_1031737744194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term702, term702.getClass(), "type", 1045547089);
        setIntField(term704, term704.getClass(), "type", -1122880881);
        setIntField(term706, term706.getClass(), "type", -542712742);
        setIntField(term708, term708.getClass(), "type", -1254072822);
        setIntField(term710, term710.getClass(), "type", -1111249833);
        setField(term710, term710.getClass(), "next", null);
        setField(term710, term710.getClass(), "first", null);
        setField(term710, term710.getClass(), "last", null);
        setField(term710, term710.getClass(), "propListHead", null);
        setIntField(term710, term710.getClass(), "sourcePosition", 0);
        setField(term710, term710.getClass(), "jsType", null);
        setField(term710, term710.getClass(), "parent", null);
        setField(term708, term708.getClass(), "next", term710);
        setIntField(term713, term713.getClass(), "type", -1692331299);
        setField(term713, term713.getClass(), "next", null);
        setField(term713, term713.getClass(), "first", null);
        setField(term713, term713.getClass(), "last", term710);
        setField(term713, term713.getClass(), "propListHead", null);
        setIntField(term713, term713.getClass(), "sourcePosition", 0);
        setField(term713, term713.getClass(), "jsType", null);
        setField(term713, term713.getClass(), "parent", null);
        setField(term708, term708.getClass(), "first", term713);
        setField(term708, term708.getClass(), "last", term706);
        setField(term708, term708.getClass(), "propListHead", null);
        setIntField(term708, term708.getClass(), "sourcePosition", 0);
        setField(term708, term708.getClass(), "jsType", null);
        setField(term708, term708.getClass(), "parent", null);
        setField(term706, term706.getClass(), "next", term708);
        setField(term706, term706.getClass(), "first", term710);
        setIntField(term717, term717.getClass(), "type", 1320570890);
        setIntField(term719, term719.getClass(), "type", -130649791);
        setField(term719, term719.getClass(), "next", null);
        setField(term719, term719.getClass(), "first", term713);
        setField(term719, term719.getClass(), "last", term708);
        setField(term719, term719.getClass(), "propListHead", null);
        setIntField(term719, term719.getClass(), "sourcePosition", 0);
        setField(term719, term719.getClass(), "jsType", null);
        setField(term719, term719.getClass(), "parent", null);
        setField(term717, term717.getClass(), "next", term719);
        setField(term717, term717.getClass(), "first", term704);
        setField(term717, term717.getClass(), "last", term704);
        setField(term717, term717.getClass(), "propListHead", null);
        setIntField(term717, term717.getClass(), "sourcePosition", 0);
        setField(term717, term717.getClass(), "jsType", null);
        setField(term717, term717.getClass(), "parent", null);
        setField(term706, term706.getClass(), "last", term717);
        setField(term706, term706.getClass(), "propListHead", null);
        setIntField(term706, term706.getClass(), "sourcePosition", 0);
        setField(term706, term706.getClass(), "jsType", null);
        setField(term706, term706.getClass(), "parent", null);
        setField(term704, term704.getClass(), "next", term706);
        setIntField(term724, term724.getClass(), "type", 534834644);
        setField(term724, term724.getClass(), "next", term717);
        setField(term724, term724.getClass(), "first", term719);
        setField(term724, term724.getClass(), "last", term702);
        setField(term724, term724.getClass(), "propListHead", null);
        setIntField(term724, term724.getClass(), "sourcePosition", 0);
        setField(term724, term724.getClass(), "jsType", null);
        setField(term724, term724.getClass(), "parent", null);
        setField(term704, term704.getClass(), "first", term724);
        setField(term704, term704.getClass(), "last", term724);
        setField(term704, term704.getClass(), "propListHead", null);
        setIntField(term704, term704.getClass(), "sourcePosition", 0);
        setField(term704, term704.getClass(), "jsType", null);
        setField(term704, term704.getClass(), "parent", null);
        setField(term702, term702.getClass(), "next", term704);
        setField(term702, term702.getClass(), "first", term708);
        setField(term702, term702.getClass(), "last", term710);
        setField(term702, term702.getClass(), "propListHead", null);
        setIntField(term702, term702.getClass(), "sourcePosition", 0);
        setField(term702, term702.getClass(), "jsType", null);
        setField(term702, term702.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term702;
        try {
            callMethod(klass, "functionCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


