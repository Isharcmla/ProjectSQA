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

public class ValueMarker_equals_47806252335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6582;
     Object term6687;

    public ValueMarker_equals_47806252335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6582 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        term6687 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term6582, term6582.getClass(), "paint", null);
        setField(term6582, term6582.getClass(), "stroke", null);
        setField(term6582, term6582.getClass(), "outlinePaint", null);
        setField(term6582, term6582.getClass(), "outlineStroke", null);
        setFloatField(term6582, term6582.getClass(), "alpha", -2.13490074E9F);
        setField(term6582, term6582.getClass(), "label", null);
        setField(term6687, term6687.getClass(), "paint", null);
        setField(term6687, term6687.getClass(), "stroke", null);
        setField(term6687, term6687.getClass(), "outlinePaint", null);
        setField(term6687, term6687.getClass(), "outlineStroke", null);
        setFloatField(term6687, term6687.getClass(), "alpha", -2.13490074E9F);
        setField(term6687, term6687.getClass(), "label", null);
        setField(term6687, term6687.getClass(), "labelFont", null);
        setField(term6582, term6582.getClass(), "labelFont", term6687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6687;
        callMethod(klass, "equals", argTypes, term6582, args);
    }

};


