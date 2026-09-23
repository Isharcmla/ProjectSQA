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

public class NodeUtil_getAddingRoot_820874009255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2709;

    public NodeUtil_getAddingRoot_820874009255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2709, term2709.getClass(), "type", 1737876343);
        setIntField(term2711, term2711.getClass(), "type", -897937940);
        setIntField(term2713, term2713.getClass(), "type", 1523261232);
        setIntField(term2715, term2715.getClass(), "type", -428988337);
        setIntField(term2717, term2717.getClass(), "type", 48047085);
        setField(term2717, term2717.getClass(), "next", null);
        setField(term2717, term2717.getClass(), "first", null);
        setField(term2717, term2717.getClass(), "last", null);
        setField(term2717, term2717.getClass(), "propListHead", null);
        setIntField(term2717, term2717.getClass(), "sourcePosition", 0);
        setField(term2717, term2717.getClass(), "jsType", null);
        setField(term2717, term2717.getClass(), "parent", null);
        setField(term2715, term2715.getClass(), "next", term2717);
        setIntField(term2720, term2720.getClass(), "type", 1902784843);
        setField(term2720, term2720.getClass(), "next", null);
        setField(term2720, term2720.getClass(), "first", null);
        setField(term2720, term2720.getClass(), "last", term2717);
        setField(term2720, term2720.getClass(), "propListHead", null);
        setIntField(term2720, term2720.getClass(), "sourcePosition", 0);
        setField(term2720, term2720.getClass(), "jsType", null);
        setField(term2720, term2720.getClass(), "parent", null);
        setField(term2715, term2715.getClass(), "first", term2720);
        setField(term2715, term2715.getClass(), "last", term2713);
        setField(term2715, term2715.getClass(), "propListHead", null);
        setIntField(term2715, term2715.getClass(), "sourcePosition", 0);
        setField(term2715, term2715.getClass(), "jsType", null);
        setField(term2715, term2715.getClass(), "parent", null);
        setField(term2713, term2713.getClass(), "next", term2715);
        setField(term2713, term2713.getClass(), "first", term2717);
        setIntField(term2724, term2724.getClass(), "type", 1778570695);
        setIntField(term2726, term2726.getClass(), "type", -1142164411);
        setField(term2726, term2726.getClass(), "next", null);
        setField(term2726, term2726.getClass(), "first", term2720);
        setField(term2726, term2726.getClass(), "last", term2715);
        setField(term2726, term2726.getClass(), "propListHead", null);
        setIntField(term2726, term2726.getClass(), "sourcePosition", 0);
        setField(term2726, term2726.getClass(), "jsType", null);
        setField(term2726, term2726.getClass(), "parent", null);
        setField(term2724, term2724.getClass(), "next", term2726);
        setField(term2724, term2724.getClass(), "first", term2711);
        setField(term2724, term2724.getClass(), "last", term2711);
        setField(term2724, term2724.getClass(), "propListHead", null);
        setIntField(term2724, term2724.getClass(), "sourcePosition", 0);
        setField(term2724, term2724.getClass(), "jsType", null);
        setField(term2724, term2724.getClass(), "parent", null);
        setField(term2713, term2713.getClass(), "last", term2724);
        setField(term2713, term2713.getClass(), "propListHead", null);
        setIntField(term2713, term2713.getClass(), "sourcePosition", 0);
        setField(term2713, term2713.getClass(), "jsType", null);
        setField(term2713, term2713.getClass(), "parent", null);
        setField(term2711, term2711.getClass(), "next", term2713);
        setIntField(term2731, term2731.getClass(), "type", -1619435313);
        setField(term2731, term2731.getClass(), "next", term2724);
        setField(term2731, term2731.getClass(), "first", term2726);
        setField(term2731, term2731.getClass(), "last", term2709);
        setField(term2731, term2731.getClass(), "propListHead", null);
        setIntField(term2731, term2731.getClass(), "sourcePosition", 0);
        setField(term2731, term2731.getClass(), "jsType", null);
        setField(term2731, term2731.getClass(), "parent", null);
        setField(term2711, term2711.getClass(), "first", term2731);
        setField(term2711, term2711.getClass(), "last", term2731);
        setField(term2711, term2711.getClass(), "propListHead", null);
        setIntField(term2711, term2711.getClass(), "sourcePosition", 0);
        setField(term2711, term2711.getClass(), "jsType", null);
        setField(term2711, term2711.getClass(), "parent", null);
        setField(term2709, term2709.getClass(), "next", term2711);
        setField(term2709, term2709.getClass(), "first", term2715);
        setField(term2709, term2709.getClass(), "last", term2717);
        setField(term2709, term2709.getClass(), "propListHead", null);
        setIntField(term2709, term2709.getClass(), "sourcePosition", 0);
        setField(term2709, term2709.getClass(), "jsType", null);
        setField(term2709, term2709.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2709;
        try {
            callMethod(klass, "getAddingRoot", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


