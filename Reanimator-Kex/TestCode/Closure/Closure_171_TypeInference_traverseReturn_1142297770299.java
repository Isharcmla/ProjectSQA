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

public class TypeInference_traverseReturn_1142297770299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616717;
     Object term616787;

    public TypeInference_traverseReturn_1142297770299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term616717 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term616787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term616857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term616927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term616997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term618047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term618117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term618187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term618257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term618327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term618397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term618467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term618537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term616857, term616857.getClass(), "type", 29);
        setIntField(term616927, term616927.getClass(), "type", 29);
        setIntField(term616997, term616997.getClass(), "type", 29);
        setIntField(term617067, term617067.getClass(), "type", 29);
        setIntField(term617137, term617137.getClass(), "type", 29);
        setIntField(term617207, term617207.getClass(), "type", 29);
        setIntField(term617277, term617277.getClass(), "type", 29);
        setIntField(term617347, term617347.getClass(), "type", 29);
        setIntField(term617417, term617417.getClass(), "type", 29);
        setIntField(term617487, term617487.getClass(), "type", 29);
        setIntField(term617557, term617557.getClass(), "type", 29);
        setIntField(term617627, term617627.getClass(), "type", 29);
        setIntField(term617697, term617697.getClass(), "type", 29);
        setIntField(term617767, term617767.getClass(), "type", 29);
        setIntField(term617837, term617837.getClass(), "type", 29);
        setIntField(term617907, term617907.getClass(), "type", 29);
        setIntField(term617977, term617977.getClass(), "type", 29);
        setIntField(term618047, term618047.getClass(), "type", 29);
        setIntField(term618117, term618117.getClass(), "type", 29);
        setIntField(term618187, term618187.getClass(), "type", 29);
        setIntField(term618257, term618257.getClass(), "type", 29);
        setIntField(term618327, term618327.getClass(), "type", 29);
        setIntField(term618397, term618397.getClass(), "type", 29);
        setIntField(term618467, term618467.getClass(), "type", 29);
        setIntField(term618537, term618537.getClass(), "type", 71);
        setField(term618467, term618467.getClass(), "first", term618537);
        setField(term618397, term618397.getClass(), "first", term618467);
        setField(term618327, term618327.getClass(), "first", term618397);
        setField(term618257, term618257.getClass(), "first", term618327);
        setField(term618187, term618187.getClass(), "first", term618257);
        setField(term618117, term618117.getClass(), "first", term618187);
        setField(term618047, term618047.getClass(), "first", term618117);
        setField(term617977, term617977.getClass(), "first", term618047);
        setField(term617907, term617907.getClass(), "first", term617977);
        setField(term617837, term617837.getClass(), "first", term617907);
        setField(term617767, term617767.getClass(), "first", term617837);
        setField(term617697, term617697.getClass(), "first", term617767);
        setField(term617627, term617627.getClass(), "first", term617697);
        setField(term617557, term617557.getClass(), "first", term617627);
        setField(term617487, term617487.getClass(), "first", term617557);
        setField(term617417, term617417.getClass(), "first", term617487);
        setField(term617347, term617347.getClass(), "first", term617417);
        setField(term617277, term617277.getClass(), "first", term617347);
        setField(term617207, term617207.getClass(), "first", term617277);
        setField(term617137, term617137.getClass(), "first", term617207);
        setField(term617067, term617067.getClass(), "first", term617137);
        setField(term616997, term616997.getClass(), "first", term617067);
        setField(term616927, term616927.getClass(), "first", term616997);
        setField(term616857, term616857.getClass(), "first", term616927);
        setField(term616787, term616787.getClass(), "first", term616857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term616787;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term616717, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


