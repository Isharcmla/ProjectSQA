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
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ValueMarker_equals_47806252353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10244;
     Object term10314;

    public ValueMarker_equals_47806252353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10244 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term10244, term10244.getClass(), "paint", null);
        setField(term10244, term10244.getClass(), "stroke", null);
        setField(term10244, term10244.getClass(), "outlinePaint", null);
        setField(term10244, term10244.getClass(), "outlineStroke", null);
        setFloatField(term10244, term10244.getClass(), "alpha", -2.13490074E9F);
        setField(term10244, term10244.getClass(), "label", null);
        setField(term10244, term10244.getClass(), "labelFont", null);
        setField(term10244, term10244.getClass(), "labelPaint", null);
        term10314 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term10314, term10314.getClass(), "paint", null);
        setField(term10314, term10314.getClass(), "stroke", null);
        setField(term10314, term10314.getClass(), "outlinePaint", null);
        setField(term10314, term10314.getClass(), "outlineStroke", null);
        setFloatField(term10314, term10314.getClass(), "alpha", -2.13490074E9F);
        setField(term10314, term10314.getClass(), "label", null);
        setField(term10314, term10314.getClass(), "labelFont", null);
        setField(term10314, term10314.getClass(), "labelPaint", term10314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10314;
        callMethod(klass, "equals", argTypes, term10244, args);
    }

};


