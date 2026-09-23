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

public class ValueMarker_equals_47806252351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9480;
     Object term9550;
     Object term10101;
     Object term10102;

    public ValueMarker_equals_47806252351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9480 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term9480, term9480.getClass(), "paint", null);
        setField(term9480, term9480.getClass(), "stroke", null);
        setField(term9480, term9480.getClass(), "outlinePaint", null);
        setField(term9480, term9480.getClass(), "outlineStroke", null);
        setFloatField(term9480, term9480.getClass(), "alpha", -2.13490074E9F);
        setField(term9480, term9480.getClass(), "label", null);
        term9550 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term9550, term9550.getClass(), "paint", null);
        setField(term9550, term9550.getClass(), "stroke", null);
        setField(term9550, term9550.getClass(), "outlinePaint", null);
        setField(term9550, term9550.getClass(), "outlineStroke", null);
        setFloatField(term9550, term9550.getClass(), "alpha", -2.13490074E9F);
        setField(term9550, term9550.getClass(), "label", "");
        term10101 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setDoubleField(term10101, term10101.getClass(), "value", 0.0);
        setField(term10101, term10101.getClass(), "paint", null);
        setField(term10101, term10101.getClass(), "stroke", null);
        setField(term10101, term10101.getClass(), "outlinePaint", null);
        setField(term10101, term10101.getClass(), "outlineStroke", null);
        setFloatField(term10101, term10101.getClass(), "alpha", -2.13490074E9F);
        setField(term10101, term10101.getClass(), "label", null);
        setField(term10101, term10101.getClass(), "labelFont", null);
        setField(term10101, term10101.getClass(), "labelPaint", null);
        setField(term10101, term10101.getClass(), "labelAnchor", null);
        setField(term10101, term10101.getClass(), "labelTextAnchor", null);
        setField(term10101, term10101.getClass(), "labelOffset", null);
        setField(term10101, term10101.getClass(), "labelOffsetType", null);
        setField(term10101, term10101.getClass(), "listenerList", null);
        term10102 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setDoubleField(term10102, term10102.getClass(), "value", 0.0);
        setField(term10102, term10102.getClass(), "paint", null);
        setField(term10102, term10102.getClass(), "stroke", null);
        setField(term10102, term10102.getClass(), "outlinePaint", null);
        setField(term10102, term10102.getClass(), "outlineStroke", null);
        setFloatField(term10102, term10102.getClass(), "alpha", -2.13490074E9F);
        setField(term10102, term10102.getClass(), "label", "");
        setField(term10102, term10102.getClass(), "labelFont", null);
        setField(term10102, term10102.getClass(), "labelPaint", null);
        setField(term10102, term10102.getClass(), "labelAnchor", null);
        setField(term10102, term10102.getClass(), "labelTextAnchor", null);
        setField(term10102, term10102.getClass(), "labelOffset", null);
        setField(term10102, term10102.getClass(), "labelOffsetType", null);
        setField(term10102, term10102.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9550;
        Object retValue = callMethod(klass, "equals", argTypes, term9480, args);
        assertTrue(recursiveEquals(term9480, term10101));
        assertTrue(recursiveEquals(term9550, term10102));
        assertTrue(recursiveEquals(retValue, false));
    }

};


