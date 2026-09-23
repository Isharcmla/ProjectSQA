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

public class ValueMarker_init_140573476417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ValueMarker_init_140573476417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2630 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term2630, term2630.getClass(), "label", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("java.awt.Paint");
        argTypes[2] = Class.forName("java.awt.Stroke");
        argTypes[3] = Class.forName("java.awt.Paint");
        argTypes[4] = Class.forName("java.awt.Stroke");
        argTypes[5] = float.class;
        Object[] args = new Object[6];
        args[0] = 0.0;
        args[1] = "";
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = 0.0F;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


