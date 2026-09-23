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
import static org.jfree.chart.plot.EqualityUtils.*;
import java.lang.Object;

public class ValueMarker_equals_47806252346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8231;
     Object term8301;
     Object term8973;
     Object term8974;

    public ValueMarker_equals_47806252346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8231 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term8231, term8231.getClass(), "paint", null);
        setField(term8231, term8231.getClass(), "stroke", null);
        setField(term8231, term8231.getClass(), "outlinePaint", null);
        setField(term8231, term8231.getClass(), "outlineStroke", null);
        setFloatField(term8231, term8231.getClass(), "alpha", -2.13490074E9F);
        setField(term8231, term8231.getClass(), "label", null);
        setField(term8231, term8231.getClass(), "labelFont", null);
        setField(term8231, term8231.getClass(), "labelPaint", null);
        setField(term8231, term8231.getClass(), "labelAnchor", null);
        setField(term8231, term8231.getClass(), "labelTextAnchor", null);
        setField(term8231, term8231.getClass(), "labelOffset", null);
        term8301 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term8379 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term8301, term8301.getClass(), "paint", null);
        setField(term8301, term8301.getClass(), "stroke", null);
        setField(term8301, term8301.getClass(), "outlinePaint", null);
        setField(term8301, term8301.getClass(), "outlineStroke", null);
        setFloatField(term8301, term8301.getClass(), "alpha", -2.13490074E9F);
        setField(term8301, term8301.getClass(), "label", null);
        setField(term8301, term8301.getClass(), "labelFont", null);
        setField(term8301, term8301.getClass(), "labelPaint", null);
        setField(term8301, term8301.getClass(), "labelAnchor", null);
        setField(term8301, term8301.getClass(), "labelTextAnchor", null);
        setField(term8301, term8301.getClass(), "labelOffset", term8379);
        term8973 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setDoubleField(term8973, term8973.getClass(), "value", 0.0);
        setField(term8973, term8973.getClass(), "paint", null);
        setField(term8973, term8973.getClass(), "stroke", null);
        setField(term8973, term8973.getClass(), "outlinePaint", null);
        setField(term8973, term8973.getClass(), "outlineStroke", null);
        setFloatField(term8973, term8973.getClass(), "alpha", -2.13490074E9F);
        setField(term8973, term8973.getClass(), "label", null);
        setField(term8973, term8973.getClass(), "labelFont", null);
        setField(term8973, term8973.getClass(), "labelPaint", null);
        setField(term8973, term8973.getClass(), "labelAnchor", null);
        setField(term8973, term8973.getClass(), "labelTextAnchor", null);
        setField(term8973, term8973.getClass(), "labelOffset", null);
        setField(term8973, term8973.getClass(), "labelOffsetType", null);
        setField(term8973, term8973.getClass(), "listenerList", null);
        term8974 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term8975 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setDoubleField(term8974, term8974.getClass(), "value", 0.0);
        setField(term8974, term8974.getClass(), "paint", null);
        setField(term8974, term8974.getClass(), "stroke", null);
        setField(term8974, term8974.getClass(), "outlinePaint", null);
        setField(term8974, term8974.getClass(), "outlineStroke", null);
        setFloatField(term8974, term8974.getClass(), "alpha", -2.13490074E9F);
        setField(term8974, term8974.getClass(), "label", null);
        setField(term8974, term8974.getClass(), "labelFont", null);
        setField(term8974, term8974.getClass(), "labelPaint", null);
        setField(term8974, term8974.getClass(), "labelAnchor", null);
        setField(term8974, term8974.getClass(), "labelTextAnchor", null);
        setField(term8975, term8975.getClass(), "unitType", null);
        setDoubleField(term8975, term8975.getClass(), "top", 0.0);
        setDoubleField(term8975, term8975.getClass(), "left", 0.0);
        setDoubleField(term8975, term8975.getClass(), "bottom", 0.0);
        setDoubleField(term8975, term8975.getClass(), "right", 0.0);
        setField(term8974, term8974.getClass(), "labelOffset", term8975);
        setField(term8974, term8974.getClass(), "labelOffsetType", null);
        setField(term8974, term8974.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8301;
        Object retValue = callMethod(klass, "equals", argTypes, term8231, args);
        assertTrue(recursiveEquals(term8231, term8973));
        assertTrue(recursiveEquals(term8301, term8974));
        assertTrue(recursiveEquals(retValue, false));
    }

};


