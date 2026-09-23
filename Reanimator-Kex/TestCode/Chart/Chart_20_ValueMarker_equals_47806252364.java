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
import java.lang.NullPointerException;
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ValueMarker_equals_47806252364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12448;
     Object term12684;

    public ValueMarker_equals_47806252364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12448 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term12526 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term12614 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term12448, term12448.getClass(), "paint", null);
        setField(term12448, term12448.getClass(), "stroke", null);
        setField(term12448, term12448.getClass(), "outlinePaint", null);
        setField(term12448, term12448.getClass(), "outlineStroke", null);
        setFloatField(term12448, term12448.getClass(), "alpha", -2.13909504E9F);
        setField(term12448, term12448.getClass(), "label", null);
        setField(term12448, term12448.getClass(), "labelFont", null);
        setField(term12448, term12448.getClass(), "labelPaint", null);
        setField(term12448, term12448.getClass(), "labelAnchor", null);
        setField(term12448, term12448.getClass(), "labelTextAnchor", null);
        setField(term12526, term12526.getClass(), "unitType", null);
        setDoubleField(term12526, term12526.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term12526, term12526.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term12526, term12526.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term12526, term12526.getClass(), "bottom", -9.2166166374137201E18);
        setField(term12448, term12448.getClass(), "labelOffset", term12526);
        setField(term12448, term12448.getClass(), "labelOffsetType", term12614);
        term12684 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term12762 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term12850 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term12684, term12684.getClass(), "paint", null);
        setField(term12684, term12684.getClass(), "stroke", null);
        setField(term12684, term12684.getClass(), "outlinePaint", null);
        setField(term12684, term12684.getClass(), "outlineStroke", null);
        setFloatField(term12684, term12684.getClass(), "alpha", -2.13909504E9F);
        setField(term12684, term12684.getClass(), "label", null);
        setField(term12684, term12684.getClass(), "labelFont", null);
        setField(term12684, term12684.getClass(), "labelPaint", null);
        setField(term12684, term12684.getClass(), "labelAnchor", null);
        setField(term12684, term12684.getClass(), "labelTextAnchor", null);
        setField(term12762, term12762.getClass(), "unitType", null);
        setDoubleField(term12762, term12762.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term12762, term12762.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term12762, term12762.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term12762, term12762.getClass(), "bottom", -9.2166166374137201E18);
        setField(term12684, term12684.getClass(), "labelOffset", term12762);
        setField(term12684, term12684.getClass(), "labelOffsetType", term12850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12684;
        try {
            callMethod(klass, "equals", argTypes, term12448, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


