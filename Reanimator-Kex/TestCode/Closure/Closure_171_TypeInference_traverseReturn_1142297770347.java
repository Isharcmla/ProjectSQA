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

public class TypeInference_traverseReturn_1142297770347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840993;
     Object term841063;

    public TypeInference_traverseReturn_1142297770347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term840993 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term841063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term841973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term841133, term841133.getClass(), "type", 92);
        setIntField(term841203, term841203.getClass(), "type", 92);
        setIntField(term841273, term841273.getClass(), "type", 92);
        setIntField(term841343, term841343.getClass(), "type", 92);
        setIntField(term841413, term841413.getClass(), "type", 92);
        setIntField(term841483, term841483.getClass(), "type", 92);
        setIntField(term841553, term841553.getClass(), "type", 92);
        setIntField(term841623, term841623.getClass(), "type", 92);
        setIntField(term841693, term841693.getClass(), "type", 92);
        setIntField(term841763, term841763.getClass(), "type", 92);
        setIntField(term841833, term841833.getClass(), "type", 92);
        setIntField(term841903, term841903.getClass(), "type", 92);
        setIntField(term841973, term841973.getClass(), "type", 92);
        setIntField(term842043, term842043.getClass(), "type", 92);
        setIntField(term842113, term842113.getClass(), "type", 92);
        setIntField(term842183, term842183.getClass(), "type", 92);
        setIntField(term842253, term842253.getClass(), "type", 92);
        setIntField(term842323, term842323.getClass(), "type", 92);
        setIntField(term842393, term842393.getClass(), "type", 92);
        setIntField(term842463, term842463.getClass(), "type", 92);
        setIntField(term842533, term842533.getClass(), "type", 92);
        setIntField(term842603, term842603.getClass(), "type", 92);
        setIntField(term842673, term842673.getClass(), "type", 92);
        setIntField(term842743, term842743.getClass(), "type", 92);
        setIntField(term842813, term842813.getClass(), "type", 61);
        setField(term842743, term842743.getClass(), "first", term842813);
        setField(term842673, term842673.getClass(), "first", term842743);
        setField(term842603, term842603.getClass(), "first", term842673);
        setField(term842533, term842533.getClass(), "first", term842603);
        setField(term842463, term842463.getClass(), "first", term842533);
        setField(term842393, term842393.getClass(), "first", term842463);
        setField(term842323, term842323.getClass(), "first", term842393);
        setField(term842253, term842253.getClass(), "first", term842323);
        setField(term842183, term842183.getClass(), "first", term842253);
        setField(term842113, term842113.getClass(), "first", term842183);
        setField(term842043, term842043.getClass(), "first", term842113);
        setField(term841973, term841973.getClass(), "first", term842043);
        setField(term841903, term841903.getClass(), "first", term841973);
        setField(term841833, term841833.getClass(), "first", term841903);
        setField(term841763, term841763.getClass(), "first", term841833);
        setField(term841693, term841693.getClass(), "first", term841763);
        setField(term841623, term841623.getClass(), "first", term841693);
        setField(term841553, term841553.getClass(), "first", term841623);
        setField(term841483, term841483.getClass(), "first", term841553);
        setField(term841413, term841413.getClass(), "first", term841483);
        setField(term841343, term841343.getClass(), "first", term841413);
        setField(term841273, term841273.getClass(), "first", term841343);
        setField(term841203, term841203.getClass(), "first", term841273);
        setField(term841133, term841133.getClass(), "first", term841203);
        setField(term841063, term841063.getClass(), "first", term841133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term841063;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term840993, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


