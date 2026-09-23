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

public class ValueMarker_equals_47806252373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16096;
     Object term16370;
     Object term16652;
     Object term16657;

    public ValueMarker_equals_47806252373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16096 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term16174 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term16262 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term16096, term16096.getClass(), "paint", null);
        setField(term16096, term16096.getClass(), "stroke", null);
        setField(term16096, term16096.getClass(), "outlinePaint", null);
        setField(term16096, term16096.getClass(), "outlineStroke", null);
        setFloatField(term16096, term16096.getClass(), "alpha", -2.13907866E9F);
        setField(term16096, term16096.getClass(), "label", null);
        setField(term16096, term16096.getClass(), "labelFont", null);
        setField(term16096, term16096.getClass(), "labelPaint", null);
        setField(term16096, term16096.getClass(), "labelAnchor", null);
        setField(term16096, term16096.getClass(), "labelTextAnchor", null);
        setField(term16174, term16174.getClass(), "unitType", null);
        setDoubleField(term16174, term16174.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term16174, term16174.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term16174, term16174.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term16174, term16174.getClass(), "bottom", -9.2166166374137201E18);
        setField(term16096, term16096.getClass(), "labelOffset", term16174);
        setField(term16262, term16262.getClass(), "name", "");
        setField(term16096, term16096.getClass(), "labelOffsetType", term16262);
        term16370 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term16448 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term16536 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term16370, term16370.getClass(), "paint", null);
        setField(term16370, term16370.getClass(), "stroke", null);
        setField(term16370, term16370.getClass(), "outlinePaint", null);
        setField(term16370, term16370.getClass(), "outlineStroke", null);
        setFloatField(term16370, term16370.getClass(), "alpha", -2.13907866E9F);
        setField(term16370, term16370.getClass(), "label", null);
        setField(term16370, term16370.getClass(), "labelFont", null);
        setField(term16370, term16370.getClass(), "labelPaint", null);
        setField(term16370, term16370.getClass(), "labelAnchor", null);
        setField(term16370, term16370.getClass(), "labelTextAnchor", null);
        setField(term16448, term16448.getClass(), "unitType", null);
        setDoubleField(term16448, term16448.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term16448, term16448.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term16448, term16448.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term16448, term16448.getClass(), "bottom", -9.2166166374137201E18);
        setField(term16370, term16370.getClass(), "labelOffset", term16448);
        setField(term16536, term16536.getClass(), "name", "");
        setField(term16370, term16370.getClass(), "labelOffsetType", term16536);
        term16652 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term16653 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term16654 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term16652, term16652.getClass(), "value", 0.0);
        setField(term16652, term16652.getClass(), "paint", null);
        setField(term16652, term16652.getClass(), "stroke", null);
        setField(term16652, term16652.getClass(), "outlinePaint", null);
        setField(term16652, term16652.getClass(), "outlineStroke", null);
        setFloatField(term16652, term16652.getClass(), "alpha", -2.13907866E9F);
        setField(term16652, term16652.getClass(), "label", null);
        setField(term16652, term16652.getClass(), "labelFont", null);
        setField(term16652, term16652.getClass(), "labelPaint", null);
        setField(term16652, term16652.getClass(), "labelAnchor", null);
        setField(term16652, term16652.getClass(), "labelTextAnchor", null);
        setField(term16653, term16653.getClass(), "unitType", null);
        setDoubleField(term16653, term16653.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term16653, term16653.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term16653, term16653.getClass(), "bottom", -9.2166166374137201E18);
        setDoubleField(term16653, term16653.getClass(), "right", -9.2166166374137201E18);
        setField(term16652, term16652.getClass(), "labelOffset", term16653);
        setField(term16654, term16654.getClass(), "name", "");
        setField(term16652, term16652.getClass(), "labelOffsetType", term16654);
        setField(term16652, term16652.getClass(), "listenerList", null);
        term16657 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term16658 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term16659 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term16657, term16657.getClass(), "value", 0.0);
        setField(term16657, term16657.getClass(), "paint", null);
        setField(term16657, term16657.getClass(), "stroke", null);
        setField(term16657, term16657.getClass(), "outlinePaint", null);
        setField(term16657, term16657.getClass(), "outlineStroke", null);
        setFloatField(term16657, term16657.getClass(), "alpha", -2.13907866E9F);
        setField(term16657, term16657.getClass(), "label", null);
        setField(term16657, term16657.getClass(), "labelFont", null);
        setField(term16657, term16657.getClass(), "labelPaint", null);
        setField(term16657, term16657.getClass(), "labelAnchor", null);
        setField(term16657, term16657.getClass(), "labelTextAnchor", null);
        setField(term16658, term16658.getClass(), "unitType", null);
        setDoubleField(term16658, term16658.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term16658, term16658.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term16658, term16658.getClass(), "bottom", -9.2166166374137201E18);
        setDoubleField(term16658, term16658.getClass(), "right", -9.2166166374137201E18);
        setField(term16657, term16657.getClass(), "labelOffset", term16658);
        setField(term16659, term16659.getClass(), "name", "");
        setField(term16657, term16657.getClass(), "labelOffsetType", term16659);
        setField(term16657, term16657.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16370;
        Object retValue = callMethod(klass, "equals", argTypes, term16096, args);
        assertTrue(recursiveEquals(term16096, term16652));
        assertTrue(recursiveEquals(term16370, term16657));
        assertTrue(recursiveEquals(retValue, true));
    }

};


