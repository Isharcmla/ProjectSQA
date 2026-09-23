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

public class ValueMarker_equals_47806252361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11871;
     Object term12107;
     Object term12268;
     Object term12271;

    public ValueMarker_equals_47806252361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11871 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term11949 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term12037 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term11871, term11871.getClass(), "paint", null);
        setField(term11871, term11871.getClass(), "stroke", null);
        setField(term11871, term11871.getClass(), "outlinePaint", null);
        setField(term11871, term11871.getClass(), "outlineStroke", null);
        setFloatField(term11871, term11871.getClass(), "alpha", -2.13907866E9F);
        setField(term11871, term11871.getClass(), "label", null);
        setField(term11871, term11871.getClass(), "labelFont", null);
        setField(term11871, term11871.getClass(), "labelPaint", null);
        setField(term11871, term11871.getClass(), "labelAnchor", null);
        setField(term11871, term11871.getClass(), "labelTextAnchor", null);
        setField(term11949, term11949.getClass(), "unitType", null);
        setDoubleField(term11949, term11949.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term11949, term11949.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term11949, term11949.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term11949, term11949.getClass(), "bottom", -9.2166166374137201E18);
        setField(term11871, term11871.getClass(), "labelOffset", term11949);
        setField(term11871, term11871.getClass(), "labelOffsetType", term12037);
        term12107 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term12185 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term12107, term12107.getClass(), "paint", null);
        setField(term12107, term12107.getClass(), "stroke", null);
        setField(term12107, term12107.getClass(), "outlinePaint", null);
        setField(term12107, term12107.getClass(), "outlineStroke", null);
        setFloatField(term12107, term12107.getClass(), "alpha", -2.13907866E9F);
        setField(term12107, term12107.getClass(), "label", null);
        setField(term12107, term12107.getClass(), "labelFont", null);
        setField(term12107, term12107.getClass(), "labelPaint", null);
        setField(term12107, term12107.getClass(), "labelAnchor", null);
        setField(term12107, term12107.getClass(), "labelTextAnchor", null);
        setField(term12185, term12185.getClass(), "unitType", null);
        setDoubleField(term12185, term12185.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term12185, term12185.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term12185, term12185.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term12185, term12185.getClass(), "bottom", -9.2166166374137201E18);
        setField(term12107, term12107.getClass(), "labelOffset", term12185);
        setField(term12107, term12107.getClass(), "labelOffsetType", null);
        term12268 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term12269 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term12270 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term12268, term12268.getClass(), "value", 0.0);
        setField(term12268, term12268.getClass(), "paint", null);
        setField(term12268, term12268.getClass(), "stroke", null);
        setField(term12268, term12268.getClass(), "outlinePaint", null);
        setField(term12268, term12268.getClass(), "outlineStroke", null);
        setFloatField(term12268, term12268.getClass(), "alpha", -2.13907866E9F);
        setField(term12268, term12268.getClass(), "label", null);
        setField(term12268, term12268.getClass(), "labelFont", null);
        setField(term12268, term12268.getClass(), "labelPaint", null);
        setField(term12268, term12268.getClass(), "labelAnchor", null);
        setField(term12268, term12268.getClass(), "labelTextAnchor", null);
        setField(term12269, term12269.getClass(), "unitType", null);
        setDoubleField(term12269, term12269.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term12269, term12269.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term12269, term12269.getClass(), "bottom", -9.2166166374137201E18);
        setDoubleField(term12269, term12269.getClass(), "right", -9.2166166374137201E18);
        setField(term12268, term12268.getClass(), "labelOffset", term12269);
        setField(term12270, term12270.getClass(), "name", null);
        setField(term12268, term12268.getClass(), "labelOffsetType", term12270);
        setField(term12268, term12268.getClass(), "listenerList", null);
        term12271 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term12272 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setDoubleField(term12271, term12271.getClass(), "value", 0.0);
        setField(term12271, term12271.getClass(), "paint", null);
        setField(term12271, term12271.getClass(), "stroke", null);
        setField(term12271, term12271.getClass(), "outlinePaint", null);
        setField(term12271, term12271.getClass(), "outlineStroke", null);
        setFloatField(term12271, term12271.getClass(), "alpha", -2.13907866E9F);
        setField(term12271, term12271.getClass(), "label", null);
        setField(term12271, term12271.getClass(), "labelFont", null);
        setField(term12271, term12271.getClass(), "labelPaint", null);
        setField(term12271, term12271.getClass(), "labelAnchor", null);
        setField(term12271, term12271.getClass(), "labelTextAnchor", null);
        setField(term12272, term12272.getClass(), "unitType", null);
        setDoubleField(term12272, term12272.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term12272, term12272.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term12272, term12272.getClass(), "bottom", -9.2166166374137201E18);
        setDoubleField(term12272, term12272.getClass(), "right", -9.2166166374137201E18);
        setField(term12271, term12271.getClass(), "labelOffset", term12272);
        setField(term12271, term12271.getClass(), "labelOffsetType", null);
        setField(term12271, term12271.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12107;
        Object retValue = callMethod(klass, "equals", argTypes, term11871, args);
        assertTrue(recursiveEquals(term11871, term12268));
        assertTrue(recursiveEquals(term12107, term12271));
        assertTrue(recursiveEquals(retValue, false));
    }

};


