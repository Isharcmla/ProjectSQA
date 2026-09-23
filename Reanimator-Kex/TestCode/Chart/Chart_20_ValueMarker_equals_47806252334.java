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

public class ValueMarker_equals_47806252334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6365;
     Object term6435;
     Object term6464;
     Object term6465;

    public ValueMarker_equals_47806252334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6365 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term6365, term6365.getClass(), "paint", null);
        setField(term6365, term6365.getClass(), "stroke", null);
        setField(term6365, term6365.getClass(), "outlinePaint", null);
        setField(term6365, term6365.getClass(), "outlineStroke", null);
        setFloatField(term6365, term6365.getClass(), "alpha", 1.8874368E7F);
        term6435 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term6435, term6435.getClass(), "paint", null);
        setField(term6435, term6435.getClass(), "stroke", null);
        setField(term6435, term6435.getClass(), "outlinePaint", null);
        setField(term6435, term6435.getClass(), "outlineStroke", null);
        setFloatField(term6435, term6435.getClass(), "alpha", -2.13699789E9F);
        term6464 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setDoubleField(term6464, term6464.getClass(), "value", 0.0);
        setField(term6464, term6464.getClass(), "paint", null);
        setField(term6464, term6464.getClass(), "stroke", null);
        setField(term6464, term6464.getClass(), "outlinePaint", null);
        setField(term6464, term6464.getClass(), "outlineStroke", null);
        setFloatField(term6464, term6464.getClass(), "alpha", 1.8874368E7F);
        setField(term6464, term6464.getClass(), "label", null);
        setField(term6464, term6464.getClass(), "labelFont", null);
        setField(term6464, term6464.getClass(), "labelPaint", null);
        setField(term6464, term6464.getClass(), "labelAnchor", null);
        setField(term6464, term6464.getClass(), "labelTextAnchor", null);
        setField(term6464, term6464.getClass(), "labelOffset", null);
        setField(term6464, term6464.getClass(), "labelOffsetType", null);
        setField(term6464, term6464.getClass(), "listenerList", null);
        term6465 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setDoubleField(term6465, term6465.getClass(), "value", 0.0);
        setField(term6465, term6465.getClass(), "paint", null);
        setField(term6465, term6465.getClass(), "stroke", null);
        setField(term6465, term6465.getClass(), "outlinePaint", null);
        setField(term6465, term6465.getClass(), "outlineStroke", null);
        setFloatField(term6465, term6465.getClass(), "alpha", -2.13699789E9F);
        setField(term6465, term6465.getClass(), "label", null);
        setField(term6465, term6465.getClass(), "labelFont", null);
        setField(term6465, term6465.getClass(), "labelPaint", null);
        setField(term6465, term6465.getClass(), "labelAnchor", null);
        setField(term6465, term6465.getClass(), "labelTextAnchor", null);
        setField(term6465, term6465.getClass(), "labelOffset", null);
        setField(term6465, term6465.getClass(), "labelOffsetType", null);
        setField(term6465, term6465.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6435;
        Object retValue = callMethod(klass, "equals", argTypes, term6365, args);
        assertTrue(recursiveEquals(term6365, term6464));
        assertTrue(recursiveEquals(term6435, term6465));
        assertTrue(recursiveEquals(retValue, false));
    }

};


