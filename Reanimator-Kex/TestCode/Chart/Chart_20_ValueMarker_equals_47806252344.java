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
import java.lang.NullPointerException;
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ValueMarker_equals_47806252344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7874;
     Object term8022;

    public ValueMarker_equals_47806252344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7874 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term7952 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term7874, term7874.getClass(), "paint", null);
        setField(term7874, term7874.getClass(), "stroke", null);
        setField(term7874, term7874.getClass(), "outlinePaint", null);
        setField(term7874, term7874.getClass(), "outlineStroke", null);
        setFloatField(term7874, term7874.getClass(), "alpha", -2.13490074E9F);
        setField(term7874, term7874.getClass(), "label", null);
        setField(term7874, term7874.getClass(), "labelFont", null);
        setField(term7874, term7874.getClass(), "labelPaint", null);
        setField(term7874, term7874.getClass(), "labelAnchor", null);
        setField(term7874, term7874.getClass(), "labelTextAnchor", null);
        setField(term7874, term7874.getClass(), "labelOffset", term7952);
        term8022 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term8100 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term8022, term8022.getClass(), "paint", null);
        setField(term8022, term8022.getClass(), "stroke", null);
        setField(term8022, term8022.getClass(), "outlinePaint", null);
        setField(term8022, term8022.getClass(), "outlineStroke", null);
        setFloatField(term8022, term8022.getClass(), "alpha", -2.13490074E9F);
        setField(term8022, term8022.getClass(), "label", null);
        setField(term8022, term8022.getClass(), "labelFont", null);
        setField(term8022, term8022.getClass(), "labelPaint", null);
        setField(term8022, term8022.getClass(), "labelAnchor", null);
        setField(term8022, term8022.getClass(), "labelTextAnchor", null);
        setField(term8022, term8022.getClass(), "labelOffset", term8100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8022;
        try {
            callMethod(klass, "equals", argTypes, term7874, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


