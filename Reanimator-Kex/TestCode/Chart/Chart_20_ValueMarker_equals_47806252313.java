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

public class ValueMarker_equals_47806252313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2377;
     Object term2383;
     Object term2384;

    public ValueMarker_equals_47806252313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2377 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        term2383 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setDoubleField(term2383, term2383.getClass(), "value", 0.0);
        setField(term2383, term2383.getClass(), "paint", null);
        setField(term2383, term2383.getClass(), "stroke", null);
        setField(term2383, term2383.getClass(), "outlinePaint", null);
        setField(term2383, term2383.getClass(), "outlineStroke", null);
        setFloatField(term2383, term2383.getClass(), "alpha", 0.0F);
        setField(term2383, term2383.getClass(), "label", null);
        setField(term2383, term2383.getClass(), "labelFont", null);
        setField(term2383, term2383.getClass(), "labelPaint", null);
        setField(term2383, term2383.getClass(), "labelAnchor", null);
        setField(term2383, term2383.getClass(), "labelTextAnchor", null);
        setField(term2383, term2383.getClass(), "labelOffset", null);
        setField(term2383, term2383.getClass(), "labelOffsetType", null);
        setField(term2383, term2383.getClass(), "listenerList", null);
        term2384 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setDoubleField(term2384, term2384.getClass(), "value", 0.0);
        setField(term2384, term2384.getClass(), "paint", null);
        setField(term2384, term2384.getClass(), "stroke", null);
        setField(term2384, term2384.getClass(), "outlinePaint", null);
        setField(term2384, term2384.getClass(), "outlineStroke", null);
        setFloatField(term2384, term2384.getClass(), "alpha", 0.0F);
        setField(term2384, term2384.getClass(), "label", null);
        setField(term2384, term2384.getClass(), "labelFont", null);
        setField(term2384, term2384.getClass(), "labelPaint", null);
        setField(term2384, term2384.getClass(), "labelAnchor", null);
        setField(term2384, term2384.getClass(), "labelTextAnchor", null);
        setField(term2384, term2384.getClass(), "labelOffset", null);
        setField(term2384, term2384.getClass(), "labelOffsetType", null);
        setField(term2384, term2384.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2377;
        Object retValue = callMethod(klass, "equals", argTypes, term2377, args);
        assertTrue(recursiveEquals(term2377, term2383));
        assertTrue(recursiveEquals(term2377, term2384));
        assertTrue(recursiveEquals(retValue, true));
    }

};


