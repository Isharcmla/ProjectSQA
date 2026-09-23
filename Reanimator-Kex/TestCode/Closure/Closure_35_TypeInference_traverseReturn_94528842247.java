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

public class TypeInference_traverseReturn_94528842247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409737;
     Object term409807;

    public TypeInference_traverseReturn_94528842247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409737 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term409807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term409877, term409877.getClass(), "type", 9);
        setIntField(term409947, term409947.getClass(), "type", 9);
        setIntField(term410017, term410017.getClass(), "type", 9);
        setIntField(term410087, term410087.getClass(), "type", 9);
        setIntField(term410157, term410157.getClass(), "type", 9);
        setIntField(term410227, term410227.getClass(), "type", 9);
        setIntField(term410297, term410297.getClass(), "type", 9);
        setIntField(term410367, term410367.getClass(), "type", 9);
        setIntField(term410437, term410437.getClass(), "type", 9);
        setIntField(term410507, term410507.getClass(), "type", 9);
        setIntField(term410577, term410577.getClass(), "type", 9);
        setIntField(term410647, term410647.getClass(), "type", 9);
        setIntField(term410717, term410717.getClass(), "type", 9);
        setIntField(term410787, term410787.getClass(), "type", 9);
        setIntField(term410857, term410857.getClass(), "type", 9);
        setIntField(term410927, term410927.getClass(), "type", 9);
        setIntField(term410997, term410997.getClass(), "type", 9);
        setIntField(term411067, term411067.getClass(), "type", 9);
        setIntField(term411137, term411137.getClass(), "type", 9);
        setIntField(term411207, term411207.getClass(), "type", 9);
        setIntField(term411277, term411277.getClass(), "type", 9);
        setIntField(term411347, term411347.getClass(), "type", 9);
        setIntField(term411417, term411417.getClass(), "type", 9);
        setIntField(term411487, term411487.getClass(), "type", 9);
        setIntField(term411557, term411557.getClass(), "type", 72);
        setField(term411487, term411487.getClass(), "first", term411557);
        setField(term411417, term411417.getClass(), "first", term411487);
        setField(term411347, term411347.getClass(), "first", term411417);
        setField(term411277, term411277.getClass(), "first", term411347);
        setField(term411207, term411207.getClass(), "first", term411277);
        setField(term411137, term411137.getClass(), "first", term411207);
        setField(term411067, term411067.getClass(), "first", term411137);
        setField(term410997, term410997.getClass(), "first", term411067);
        setField(term410927, term410927.getClass(), "first", term410997);
        setField(term410857, term410857.getClass(), "first", term410927);
        setField(term410787, term410787.getClass(), "first", term410857);
        setField(term410717, term410717.getClass(), "first", term410787);
        setField(term410647, term410647.getClass(), "first", term410717);
        setField(term410577, term410577.getClass(), "first", term410647);
        setField(term410507, term410507.getClass(), "first", term410577);
        setField(term410437, term410437.getClass(), "first", term410507);
        setField(term410367, term410367.getClass(), "first", term410437);
        setField(term410297, term410297.getClass(), "first", term410367);
        setField(term410227, term410227.getClass(), "first", term410297);
        setField(term410157, term410157.getClass(), "first", term410227);
        setField(term410087, term410087.getClass(), "first", term410157);
        setField(term410017, term410017.getClass(), "first", term410087);
        setField(term409947, term409947.getClass(), "first", term410017);
        setField(term409877, term409877.getClass(), "first", term409947);
        setField(term409807, term409807.getClass(), "first", term409877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term409807;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term409737, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


