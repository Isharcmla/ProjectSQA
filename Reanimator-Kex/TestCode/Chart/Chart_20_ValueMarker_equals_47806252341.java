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

public class ValueMarker_equals_47806252341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7555;
     Object term7693;
     Object term7735;
     Object term7737;

    public ValueMarker_equals_47806252341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7555 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term7623 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        setField(term7555, term7555.getClass(), "paint", null);
        setField(term7555, term7555.getClass(), "stroke", null);
        setField(term7555, term7555.getClass(), "outlinePaint", null);
        setField(term7555, term7555.getClass(), "outlineStroke", null);
        setFloatField(term7555, term7555.getClass(), "alpha", -2.13490074E9F);
        setField(term7555, term7555.getClass(), "label", null);
        setField(term7555, term7555.getClass(), "labelFont", null);
        setField(term7555, term7555.getClass(), "labelPaint", null);
        setField(term7555, term7555.getClass(), "labelAnchor", null);
        setField(term7555, term7555.getClass(), "labelTextAnchor", term7623);
        term7693 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term7693, term7693.getClass(), "paint", null);
        setField(term7693, term7693.getClass(), "stroke", null);
        setField(term7693, term7693.getClass(), "outlinePaint", null);
        setField(term7693, term7693.getClass(), "outlineStroke", null);
        setFloatField(term7693, term7693.getClass(), "alpha", -2.13490074E9F);
        setField(term7693, term7693.getClass(), "label", null);
        setField(term7693, term7693.getClass(), "labelFont", null);
        setField(term7693, term7693.getClass(), "labelPaint", null);
        setField(term7693, term7693.getClass(), "labelAnchor", null);
        setField(term7693, term7693.getClass(), "labelTextAnchor", null);
        term7735 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term7736 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        setDoubleField(term7735, term7735.getClass(), "value", 0.0);
        setField(term7735, term7735.getClass(), "paint", null);
        setField(term7735, term7735.getClass(), "stroke", null);
        setField(term7735, term7735.getClass(), "outlinePaint", null);
        setField(term7735, term7735.getClass(), "outlineStroke", null);
        setFloatField(term7735, term7735.getClass(), "alpha", -2.13490074E9F);
        setField(term7735, term7735.getClass(), "label", null);
        setField(term7735, term7735.getClass(), "labelFont", null);
        setField(term7735, term7735.getClass(), "labelPaint", null);
        setField(term7735, term7735.getClass(), "labelAnchor", null);
        setField(term7736, term7736.getClass(), "name", null);
        setField(term7735, term7735.getClass(), "labelTextAnchor", term7736);
        setField(term7735, term7735.getClass(), "labelOffset", null);
        setField(term7735, term7735.getClass(), "labelOffsetType", null);
        setField(term7735, term7735.getClass(), "listenerList", null);
        term7737 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setDoubleField(term7737, term7737.getClass(), "value", 0.0);
        setField(term7737, term7737.getClass(), "paint", null);
        setField(term7737, term7737.getClass(), "stroke", null);
        setField(term7737, term7737.getClass(), "outlinePaint", null);
        setField(term7737, term7737.getClass(), "outlineStroke", null);
        setFloatField(term7737, term7737.getClass(), "alpha", -2.13490074E9F);
        setField(term7737, term7737.getClass(), "label", null);
        setField(term7737, term7737.getClass(), "labelFont", null);
        setField(term7737, term7737.getClass(), "labelPaint", null);
        setField(term7737, term7737.getClass(), "labelAnchor", null);
        setField(term7737, term7737.getClass(), "labelTextAnchor", null);
        setField(term7737, term7737.getClass(), "labelOffset", null);
        setField(term7737, term7737.getClass(), "labelOffsetType", null);
        setField(term7737, term7737.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7693;
        Object retValue = callMethod(klass, "equals", argTypes, term7555, args);
        assertTrue(recursiveEquals(term7555, term7735));
        assertTrue(recursiveEquals(term7693, term7737));
        assertTrue(recursiveEquals(retValue, false));
    }

};


