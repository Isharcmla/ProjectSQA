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

public class ValueMarker_equals_47806252331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6087;
     Object term6192;

    public ValueMarker_equals_47806252331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6087 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        term6192 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term6087, term6087.getClass(), "paint", null);
        setField(term6087, term6087.getClass(), "stroke", null);
        setField(term6087, term6087.getClass(), "outlinePaint", null);
        setField(term6087, term6087.getClass(), "outlineStroke", null);
        setFloatField(term6087, term6087.getClass(), "alpha", -2.13490074E9F);
        setField(term6087, term6087.getClass(), "label", null);
        setField(term6087, term6087.getClass(), "labelFont", null);
        setField(term6192, term6192.getClass(), "paint", null);
        setField(term6192, term6192.getClass(), "stroke", null);
        setField(term6192, term6192.getClass(), "outlinePaint", null);
        setField(term6192, term6192.getClass(), "outlineStroke", null);
        setFloatField(term6192, term6192.getClass(), "alpha", -2.13490074E9F);
        setField(term6192, term6192.getClass(), "label", null);
        setField(term6192, term6192.getClass(), "labelFont", null);
        setField(term6192, term6192.getClass(), "labelPaint", null);
        setField(term6087, term6087.getClass(), "labelPaint", term6192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6192;
        callMethod(klass, "equals", argTypes, term6087, args);
    }

};


