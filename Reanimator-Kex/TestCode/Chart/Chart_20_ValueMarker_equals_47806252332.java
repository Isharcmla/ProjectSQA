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

public class ValueMarker_equals_47806252332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5820;
     Object term5968;
     Object term6250;
     Object term6252;

    public ValueMarker_equals_47806252332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5820 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term5898 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term5820, term5820.getClass(), "paint", null);
        setField(term5820, term5820.getClass(), "stroke", null);
        setField(term5820, term5820.getClass(), "outlinePaint", null);
        setField(term5820, term5820.getClass(), "outlineStroke", null);
        setFloatField(term5820, term5820.getClass(), "alpha", -2.13490074E9F);
        setField(term5820, term5820.getClass(), "label", null);
        setField(term5820, term5820.getClass(), "labelFont", null);
        setField(term5820, term5820.getClass(), "labelPaint", null);
        setField(term5820, term5820.getClass(), "labelAnchor", null);
        setField(term5820, term5820.getClass(), "labelTextAnchor", null);
        setField(term5820, term5820.getClass(), "labelOffset", term5898);
        term5968 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term5968, term5968.getClass(), "paint", null);
        setField(term5968, term5968.getClass(), "stroke", null);
        setField(term5968, term5968.getClass(), "outlinePaint", null);
        setField(term5968, term5968.getClass(), "outlineStroke", null);
        setFloatField(term5968, term5968.getClass(), "alpha", -2.13490074E9F);
        setField(term5968, term5968.getClass(), "label", null);
        setField(term5968, term5968.getClass(), "labelFont", null);
        setField(term5968, term5968.getClass(), "labelPaint", null);
        setField(term5968, term5968.getClass(), "labelAnchor", null);
        setField(term5968, term5968.getClass(), "labelTextAnchor", null);
        setField(term5968, term5968.getClass(), "labelOffset", null);
        term6250 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term6251 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setDoubleField(term6250, term6250.getClass(), "value", 0.0);
        setField(term6250, term6250.getClass(), "paint", null);
        setField(term6250, term6250.getClass(), "stroke", null);
        setField(term6250, term6250.getClass(), "outlinePaint", null);
        setField(term6250, term6250.getClass(), "outlineStroke", null);
        setFloatField(term6250, term6250.getClass(), "alpha", -2.13490074E9F);
        setField(term6250, term6250.getClass(), "label", null);
        setField(term6250, term6250.getClass(), "labelFont", null);
        setField(term6250, term6250.getClass(), "labelPaint", null);
        setField(term6250, term6250.getClass(), "labelAnchor", null);
        setField(term6250, term6250.getClass(), "labelTextAnchor", null);
        setField(term6251, term6251.getClass(), "unitType", null);
        setDoubleField(term6251, term6251.getClass(), "top", 0.0);
        setDoubleField(term6251, term6251.getClass(), "left", 0.0);
        setDoubleField(term6251, term6251.getClass(), "bottom", 0.0);
        setDoubleField(term6251, term6251.getClass(), "right", 0.0);
        setField(term6250, term6250.getClass(), "labelOffset", term6251);
        setField(term6250, term6250.getClass(), "labelOffsetType", null);
        setField(term6250, term6250.getClass(), "listenerList", null);
        term6252 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setDoubleField(term6252, term6252.getClass(), "value", 0.0);
        setField(term6252, term6252.getClass(), "paint", null);
        setField(term6252, term6252.getClass(), "stroke", null);
        setField(term6252, term6252.getClass(), "outlinePaint", null);
        setField(term6252, term6252.getClass(), "outlineStroke", null);
        setFloatField(term6252, term6252.getClass(), "alpha", -2.13490074E9F);
        setField(term6252, term6252.getClass(), "label", null);
        setField(term6252, term6252.getClass(), "labelFont", null);
        setField(term6252, term6252.getClass(), "labelPaint", null);
        setField(term6252, term6252.getClass(), "labelAnchor", null);
        setField(term6252, term6252.getClass(), "labelTextAnchor", null);
        setField(term6252, term6252.getClass(), "labelOffset", null);
        setField(term6252, term6252.getClass(), "labelOffsetType", null);
        setField(term6252, term6252.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5968;
        Object retValue = callMethod(klass, "equals", argTypes, term5820, args);
        assertTrue(recursiveEquals(term5820, term6250));
        assertTrue(recursiveEquals(term5968, term6252));
        assertTrue(recursiveEquals(retValue, false));
    }

};


