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

public class ValueMarker_equals_47806252356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10463;
     Object term10611;
     Object term11142;
     Object term11144;

    public ValueMarker_equals_47806252356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10463 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term10541 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term10463, term10463.getClass(), "paint", null);
        setField(term10463, term10463.getClass(), "stroke", null);
        setField(term10463, term10463.getClass(), "outlinePaint", null);
        setField(term10463, term10463.getClass(), "outlineStroke", null);
        setFloatField(term10463, term10463.getClass(), "alpha", -2.13490074E9F);
        setField(term10463, term10463.getClass(), "label", null);
        setField(term10463, term10463.getClass(), "labelFont", null);
        setField(term10463, term10463.getClass(), "labelPaint", null);
        setField(term10463, term10463.getClass(), "labelAnchor", null);
        setField(term10463, term10463.getClass(), "labelTextAnchor", null);
        setField(term10541, term10541.getClass(), "unitType", null);
        setDoubleField(term10541, term10541.getClass(), "left", 4.6206932348619981E18);
        setField(term10463, term10463.getClass(), "labelOffset", term10541);
        term10611 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term10689 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term10611, term10611.getClass(), "paint", null);
        setField(term10611, term10611.getClass(), "stroke", null);
        setField(term10611, term10611.getClass(), "outlinePaint", null);
        setField(term10611, term10611.getClass(), "outlineStroke", null);
        setFloatField(term10611, term10611.getClass(), "alpha", -2.13490074E9F);
        setField(term10611, term10611.getClass(), "label", null);
        setField(term10611, term10611.getClass(), "labelFont", null);
        setField(term10611, term10611.getClass(), "labelPaint", null);
        setField(term10611, term10611.getClass(), "labelAnchor", null);
        setField(term10611, term10611.getClass(), "labelTextAnchor", null);
        setField(term10689, term10689.getClass(), "unitType", null);
        setDoubleField(term10689, term10689.getClass(), "left", -9.2188684200475361E18);
        setField(term10611, term10611.getClass(), "labelOffset", term10689);
        term11142 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term11143 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setDoubleField(term11142, term11142.getClass(), "value", 0.0);
        setField(term11142, term11142.getClass(), "paint", null);
        setField(term11142, term11142.getClass(), "stroke", null);
        setField(term11142, term11142.getClass(), "outlinePaint", null);
        setField(term11142, term11142.getClass(), "outlineStroke", null);
        setFloatField(term11142, term11142.getClass(), "alpha", -2.13490074E9F);
        setField(term11142, term11142.getClass(), "label", null);
        setField(term11142, term11142.getClass(), "labelFont", null);
        setField(term11142, term11142.getClass(), "labelPaint", null);
        setField(term11142, term11142.getClass(), "labelAnchor", null);
        setField(term11142, term11142.getClass(), "labelTextAnchor", null);
        setField(term11143, term11143.getClass(), "unitType", null);
        setDoubleField(term11143, term11143.getClass(), "top", 0.0);
        setDoubleField(term11143, term11143.getClass(), "left", 4.6206932348619981E18);
        setDoubleField(term11143, term11143.getClass(), "bottom", 0.0);
        setDoubleField(term11143, term11143.getClass(), "right", 0.0);
        setField(term11142, term11142.getClass(), "labelOffset", term11143);
        setField(term11142, term11142.getClass(), "labelOffsetType", null);
        setField(term11142, term11142.getClass(), "listenerList", null);
        term11144 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term11145 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setDoubleField(term11144, term11144.getClass(), "value", 0.0);
        setField(term11144, term11144.getClass(), "paint", null);
        setField(term11144, term11144.getClass(), "stroke", null);
        setField(term11144, term11144.getClass(), "outlinePaint", null);
        setField(term11144, term11144.getClass(), "outlineStroke", null);
        setFloatField(term11144, term11144.getClass(), "alpha", -2.13490074E9F);
        setField(term11144, term11144.getClass(), "label", null);
        setField(term11144, term11144.getClass(), "labelFont", null);
        setField(term11144, term11144.getClass(), "labelPaint", null);
        setField(term11144, term11144.getClass(), "labelAnchor", null);
        setField(term11144, term11144.getClass(), "labelTextAnchor", null);
        setField(term11145, term11145.getClass(), "unitType", null);
        setDoubleField(term11145, term11145.getClass(), "top", 0.0);
        setDoubleField(term11145, term11145.getClass(), "left", -9.2188684200475361E18);
        setDoubleField(term11145, term11145.getClass(), "bottom", 0.0);
        setDoubleField(term11145, term11145.getClass(), "right", 0.0);
        setField(term11144, term11144.getClass(), "labelOffset", term11145);
        setField(term11144, term11144.getClass(), "labelOffsetType", null);
        setField(term11144, term11144.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10611;
        Object retValue = callMethod(klass, "equals", argTypes, term10463, args);
        assertTrue(recursiveEquals(term10463, term11142));
        assertTrue(recursiveEquals(term10611, term11144));
        assertTrue(recursiveEquals(retValue, false));
    }

};


