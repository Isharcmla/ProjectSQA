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

public class ValueMarker_equals_47806252329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5498;
     Object term5646;
     Object term5687;
     Object term5689;

    public ValueMarker_equals_47806252329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5498 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term5576 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        setField(term5498, term5498.getClass(), "paint", null);
        setField(term5498, term5498.getClass(), "stroke", null);
        setField(term5498, term5498.getClass(), "outlinePaint", null);
        setField(term5498, term5498.getClass(), "outlineStroke", null);
        setFloatField(term5498, term5498.getClass(), "alpha", -2.13490074E9F);
        setField(term5498, term5498.getClass(), "label", null);
        setField(term5498, term5498.getClass(), "labelFont", null);
        setField(term5498, term5498.getClass(), "labelPaint", null);
        setField(term5498, term5498.getClass(), "labelAnchor", term5576);
        term5646 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term5646, term5646.getClass(), "paint", null);
        setField(term5646, term5646.getClass(), "stroke", null);
        setField(term5646, term5646.getClass(), "outlinePaint", null);
        setField(term5646, term5646.getClass(), "outlineStroke", null);
        setFloatField(term5646, term5646.getClass(), "alpha", -2.13490074E9F);
        setField(term5646, term5646.getClass(), "label", null);
        setField(term5646, term5646.getClass(), "labelFont", null);
        setField(term5646, term5646.getClass(), "labelPaint", null);
        setField(term5646, term5646.getClass(), "labelAnchor", null);
        term5687 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term5688 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        setDoubleField(term5687, term5687.getClass(), "value", 0.0);
        setField(term5687, term5687.getClass(), "paint", null);
        setField(term5687, term5687.getClass(), "stroke", null);
        setField(term5687, term5687.getClass(), "outlinePaint", null);
        setField(term5687, term5687.getClass(), "outlineStroke", null);
        setFloatField(term5687, term5687.getClass(), "alpha", -2.13490074E9F);
        setField(term5687, term5687.getClass(), "label", null);
        setField(term5687, term5687.getClass(), "labelFont", null);
        setField(term5687, term5687.getClass(), "labelPaint", null);
        setField(term5688, term5688.getClass(), "name", null);
        setField(term5687, term5687.getClass(), "labelAnchor", term5688);
        setField(term5687, term5687.getClass(), "labelTextAnchor", null);
        setField(term5687, term5687.getClass(), "labelOffset", null);
        setField(term5687, term5687.getClass(), "labelOffsetType", null);
        setField(term5687, term5687.getClass(), "listenerList", null);
        term5689 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setDoubleField(term5689, term5689.getClass(), "value", 0.0);
        setField(term5689, term5689.getClass(), "paint", null);
        setField(term5689, term5689.getClass(), "stroke", null);
        setField(term5689, term5689.getClass(), "outlinePaint", null);
        setField(term5689, term5689.getClass(), "outlineStroke", null);
        setFloatField(term5689, term5689.getClass(), "alpha", -2.13490074E9F);
        setField(term5689, term5689.getClass(), "label", null);
        setField(term5689, term5689.getClass(), "labelFont", null);
        setField(term5689, term5689.getClass(), "labelPaint", null);
        setField(term5689, term5689.getClass(), "labelAnchor", null);
        setField(term5689, term5689.getClass(), "labelTextAnchor", null);
        setField(term5689, term5689.getClass(), "labelOffset", null);
        setField(term5689, term5689.getClass(), "labelOffsetType", null);
        setField(term5689, term5689.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5646;
        Object retValue = callMethod(klass, "equals", argTypes, term5498, args);
        assertTrue(recursiveEquals(term5498, term5687));
        assertTrue(recursiveEquals(term5646, term5689));
        assertTrue(recursiveEquals(retValue, false));
    }

};


