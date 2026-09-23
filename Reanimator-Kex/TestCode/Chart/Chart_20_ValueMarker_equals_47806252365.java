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

public class ValueMarker_equals_47806252365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13022;
     Object term13258;
     Object term13778;
     Object term13781;

    public ValueMarker_equals_47806252365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13022 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term13100 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term13380 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term13022, term13022.getClass(), "paint", null);
        setField(term13022, term13022.getClass(), "stroke", null);
        setField(term13022, term13022.getClass(), "outlinePaint", null);
        setField(term13022, term13022.getClass(), "outlineStroke", null);
        setFloatField(term13022, term13022.getClass(), "alpha", -2.13907866E9F);
        setField(term13022, term13022.getClass(), "label", null);
        setField(term13022, term13022.getClass(), "labelFont", null);
        setField(term13022, term13022.getClass(), "labelPaint", null);
        setField(term13022, term13022.getClass(), "labelAnchor", null);
        setField(term13022, term13022.getClass(), "labelTextAnchor", null);
        setField(term13100, term13100.getClass(), "unitType", null);
        setDoubleField(term13100, term13100.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term13100, term13100.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term13100, term13100.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term13100, term13100.getClass(), "bottom", -9.2166166374137201E18);
        setField(term13022, term13022.getClass(), "labelOffset", term13100);
        setField(term13022, term13022.getClass(), "labelOffsetType", term13380);
        term13258 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term13336 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term13258, term13258.getClass(), "paint", null);
        setField(term13258, term13258.getClass(), "stroke", null);
        setField(term13258, term13258.getClass(), "outlinePaint", null);
        setField(term13258, term13258.getClass(), "outlineStroke", null);
        setFloatField(term13258, term13258.getClass(), "alpha", -2.13907866E9F);
        setField(term13258, term13258.getClass(), "label", null);
        setField(term13258, term13258.getClass(), "labelFont", null);
        setField(term13258, term13258.getClass(), "labelPaint", null);
        setField(term13258, term13258.getClass(), "labelAnchor", null);
        setField(term13258, term13258.getClass(), "labelTextAnchor", null);
        setField(term13336, term13336.getClass(), "unitType", null);
        setDoubleField(term13336, term13336.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term13336, term13336.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term13336, term13336.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term13336, term13336.getClass(), "bottom", -9.2166166374137201E18);
        setField(term13258, term13258.getClass(), "labelOffset", term13336);
        setField(term13258, term13258.getClass(), "labelOffsetType", term13380);
        term13778 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term13779 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term13780 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term13778, term13778.getClass(), "value", 0.0);
        setField(term13778, term13778.getClass(), "paint", null);
        setField(term13778, term13778.getClass(), "stroke", null);
        setField(term13778, term13778.getClass(), "outlinePaint", null);
        setField(term13778, term13778.getClass(), "outlineStroke", null);
        setFloatField(term13778, term13778.getClass(), "alpha", -2.13907866E9F);
        setField(term13778, term13778.getClass(), "label", null);
        setField(term13778, term13778.getClass(), "labelFont", null);
        setField(term13778, term13778.getClass(), "labelPaint", null);
        setField(term13778, term13778.getClass(), "labelAnchor", null);
        setField(term13778, term13778.getClass(), "labelTextAnchor", null);
        setField(term13779, term13779.getClass(), "unitType", null);
        setDoubleField(term13779, term13779.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term13779, term13779.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term13779, term13779.getClass(), "bottom", -9.2166166374137201E18);
        setDoubleField(term13779, term13779.getClass(), "right", -9.2166166374137201E18);
        setField(term13778, term13778.getClass(), "labelOffset", term13779);
        setField(term13780, term13780.getClass(), "name", null);
        setField(term13778, term13778.getClass(), "labelOffsetType", term13780);
        setField(term13778, term13778.getClass(), "listenerList", null);
        term13781 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term13782 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term13783 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term13781, term13781.getClass(), "value", 0.0);
        setField(term13781, term13781.getClass(), "paint", null);
        setField(term13781, term13781.getClass(), "stroke", null);
        setField(term13781, term13781.getClass(), "outlinePaint", null);
        setField(term13781, term13781.getClass(), "outlineStroke", null);
        setFloatField(term13781, term13781.getClass(), "alpha", -2.13907866E9F);
        setField(term13781, term13781.getClass(), "label", null);
        setField(term13781, term13781.getClass(), "labelFont", null);
        setField(term13781, term13781.getClass(), "labelPaint", null);
        setField(term13781, term13781.getClass(), "labelAnchor", null);
        setField(term13781, term13781.getClass(), "labelTextAnchor", null);
        setField(term13782, term13782.getClass(), "unitType", null);
        setDoubleField(term13782, term13782.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term13782, term13782.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term13782, term13782.getClass(), "bottom", -9.2166166374137201E18);
        setDoubleField(term13782, term13782.getClass(), "right", -9.2166166374137201E18);
        setField(term13781, term13781.getClass(), "labelOffset", term13782);
        setField(term13783, term13783.getClass(), "name", null);
        setField(term13781, term13781.getClass(), "labelOffsetType", term13783);
        setField(term13781, term13781.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13258;
        Object retValue = callMethod(klass, "equals", argTypes, term13022, args);
        assertTrue(recursiveEquals(term13022, term13778));
        assertTrue(recursiveEquals(term13258, term13781));
        assertTrue(recursiveEquals(retValue, true));
    }

};


