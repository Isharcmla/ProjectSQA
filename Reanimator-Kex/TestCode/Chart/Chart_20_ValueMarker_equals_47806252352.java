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

public class ValueMarker_equals_47806252352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9806;
     Object term9922;
     Object term10121;
     Object term10123;

    public ValueMarker_equals_47806252352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9806 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term9884 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term9806, term9806.getClass(), "paint", null);
        setField(term9806, term9806.getClass(), "stroke", null);
        setField(term9806, term9806.getClass(), "outlinePaint", null);
        setField(term9806, term9806.getClass(), "outlineStroke", null);
        setFloatField(term9806, term9806.getClass(), "alpha", -2.13907866E9F);
        setField(term9806, term9806.getClass(), "label", null);
        setField(term9806, term9806.getClass(), "labelFont", null);
        setField(term9806, term9806.getClass(), "labelPaint", null);
        setField(term9806, term9806.getClass(), "labelAnchor", null);
        setField(term9806, term9806.getClass(), "labelTextAnchor", null);
        setField(term9884, term9884.getClass(), "unitType", null);
        setField(term9806, term9806.getClass(), "labelOffset", term9884);
        term9922 = newInstance(Class.forName("java.lang.Object"));
        term10121 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term10122 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setDoubleField(term10121, term10121.getClass(), "value", 0.0);
        setField(term10121, term10121.getClass(), "paint", null);
        setField(term10121, term10121.getClass(), "stroke", null);
        setField(term10121, term10121.getClass(), "outlinePaint", null);
        setField(term10121, term10121.getClass(), "outlineStroke", null);
        setFloatField(term10121, term10121.getClass(), "alpha", -2.13907866E9F);
        setField(term10121, term10121.getClass(), "label", null);
        setField(term10121, term10121.getClass(), "labelFont", null);
        setField(term10121, term10121.getClass(), "labelPaint", null);
        setField(term10121, term10121.getClass(), "labelAnchor", null);
        setField(term10121, term10121.getClass(), "labelTextAnchor", null);
        setField(term10122, term10122.getClass(), "unitType", null);
        setDoubleField(term10122, term10122.getClass(), "top", 0.0);
        setDoubleField(term10122, term10122.getClass(), "left", 0.0);
        setDoubleField(term10122, term10122.getClass(), "bottom", 0.0);
        setDoubleField(term10122, term10122.getClass(), "right", 0.0);
        setField(term10121, term10121.getClass(), "labelOffset", term10122);
        setField(term10121, term10121.getClass(), "labelOffsetType", null);
        setField(term10121, term10121.getClass(), "listenerList", null);
        term10123 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9922;
        Object retValue = callMethod(klass, "equals", argTypes, term9806, args);
        assertTrue(recursiveEquals(term9806, term10121));
        assertTrue(recursiveEquals(term9922, term10123));
        assertTrue(recursiveEquals(retValue, false));
    }

};


