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

public class ValueMarker_equals_47806252339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7278;
     Object term7386;
     Object term7423;
     Object term7426;

    public ValueMarker_equals_47806252339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7278 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term7278, term7278.getClass(), "paint", null);
        setField(term7278, term7278.getClass(), "stroke", null);
        setField(term7278, term7278.getClass(), "outlinePaint", null);
        setField(term7278, term7278.getClass(), "outlineStroke", null);
        setFloatField(term7278, term7278.getClass(), "alpha", -2.13490074E9F);
        setField(term7278, term7278.getClass(), "label", "");
        term7386 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term7386, term7386.getClass(), "paint", null);
        setField(term7386, term7386.getClass(), "stroke", null);
        setField(term7386, term7386.getClass(), "outlinePaint", null);
        setField(term7386, term7386.getClass(), "outlineStroke", null);
        setFloatField(term7386, term7386.getClass(), "alpha", -2.13490074E9F);
        setField(term7386, term7386.getClass(), "label", null);
        term7423 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setDoubleField(term7423, term7423.getClass(), "value", 0.0);
        setField(term7423, term7423.getClass(), "paint", null);
        setField(term7423, term7423.getClass(), "stroke", null);
        setField(term7423, term7423.getClass(), "outlinePaint", null);
        setField(term7423, term7423.getClass(), "outlineStroke", null);
        setFloatField(term7423, term7423.getClass(), "alpha", -2.13490074E9F);
        setField(term7423, term7423.getClass(), "label", "");
        setField(term7423, term7423.getClass(), "labelFont", null);
        setField(term7423, term7423.getClass(), "labelPaint", null);
        setField(term7423, term7423.getClass(), "labelAnchor", null);
        setField(term7423, term7423.getClass(), "labelTextAnchor", null);
        setField(term7423, term7423.getClass(), "labelOffset", null);
        setField(term7423, term7423.getClass(), "labelOffsetType", null);
        setField(term7423, term7423.getClass(), "listenerList", null);
        term7426 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setDoubleField(term7426, term7426.getClass(), "value", 0.0);
        setField(term7426, term7426.getClass(), "paint", null);
        setField(term7426, term7426.getClass(), "stroke", null);
        setField(term7426, term7426.getClass(), "outlinePaint", null);
        setField(term7426, term7426.getClass(), "outlineStroke", null);
        setFloatField(term7426, term7426.getClass(), "alpha", -2.13490074E9F);
        setField(term7426, term7426.getClass(), "label", null);
        setField(term7426, term7426.getClass(), "labelFont", null);
        setField(term7426, term7426.getClass(), "labelPaint", null);
        setField(term7426, term7426.getClass(), "labelAnchor", null);
        setField(term7426, term7426.getClass(), "labelTextAnchor", null);
        setField(term7426, term7426.getClass(), "labelOffset", null);
        setField(term7426, term7426.getClass(), "labelOffsetType", null);
        setField(term7426, term7426.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7386;
        Object retValue = callMethod(klass, "equals", argTypes, term7278, args);
        assertTrue(recursiveEquals(term7278, term7423));
        assertTrue(recursiveEquals(term7386, term7426));
        assertTrue(recursiveEquals(retValue, false));
    }

};


