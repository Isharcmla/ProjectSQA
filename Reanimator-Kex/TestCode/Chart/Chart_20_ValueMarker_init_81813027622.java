package org.jfree.chart.plot;

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
import java.lang.IllegalArgumentException;
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ValueMarker_init_81813027622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ValueMarker_init_81813027622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3966 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term3966, term3966.getClass(), "label", null);
        setField(null, Class.forName("java.awt.Color"), "gray", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


