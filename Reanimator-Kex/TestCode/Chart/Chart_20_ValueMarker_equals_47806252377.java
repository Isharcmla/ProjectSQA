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

public class ValueMarker_equals_47806252377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17666;
     Object term17940;
     Object term18222;
     Object term18227;

    public ValueMarker_equals_47806252377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17666 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term17744 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term17832 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term17666, term17666.getClass(), "paint", null);
        setField(term17666, term17666.getClass(), "stroke", null);
        setField(term17666, term17666.getClass(), "outlinePaint", null);
        setField(term17666, term17666.getClass(), "outlineStroke", null);
        setFloatField(term17666, term17666.getClass(), "alpha", -2.13909504E9F);
        setField(term17666, term17666.getClass(), "label", null);
        setField(term17666, term17666.getClass(), "labelFont", null);
        setField(term17666, term17666.getClass(), "labelPaint", null);
        setField(term17666, term17666.getClass(), "labelAnchor", null);
        setField(term17666, term17666.getClass(), "labelTextAnchor", null);
        setField(term17744, term17744.getClass(), "unitType", null);
        setDoubleField(term17744, term17744.getClass(), "left", -4.6105601185205453E18);
        setDoubleField(term17744, term17744.getClass(), "right", -4.6116156496832102E18);
        setDoubleField(term17744, term17744.getClass(), "top", -9.2188678874715914E18);
        setDoubleField(term17744, term17744.getClass(), "bottom", 4.503599627370496E15);
        setField(term17666, term17666.getClass(), "labelOffset", term17744);
        setField(term17832, term17832.getClass(), "name", "");
        setField(term17666, term17666.getClass(), "labelOffsetType", term17832);
        term17940 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term18018 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term18106 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term17940, term17940.getClass(), "paint", null);
        setField(term17940, term17940.getClass(), "stroke", null);
        setField(term17940, term17940.getClass(), "outlinePaint", null);
        setField(term17940, term17940.getClass(), "outlineStroke", null);
        setFloatField(term17940, term17940.getClass(), "alpha", -2.13909504E9F);
        setField(term17940, term17940.getClass(), "label", null);
        setField(term17940, term17940.getClass(), "labelFont", null);
        setField(term17940, term17940.getClass(), "labelPaint", null);
        setField(term17940, term17940.getClass(), "labelAnchor", null);
        setField(term17940, term17940.getClass(), "labelTextAnchor", null);
        setField(term18018, term18018.getClass(), "unitType", null);
        setDoubleField(term18018, term18018.getClass(), "left", -4.6105601185205453E18);
        setDoubleField(term18018, term18018.getClass(), "right", -4.6116156496832102E18);
        setDoubleField(term18018, term18018.getClass(), "top", -9.2188678874715914E18);
        setDoubleField(term18018, term18018.getClass(), "bottom", 4.503599627370496E15);
        setField(term17940, term17940.getClass(), "labelOffset", term18018);
        setField(term18106, term18106.getClass(), "name", "");
        setField(term17940, term17940.getClass(), "labelOffsetType", term18106);
        term18222 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term18223 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term18224 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term18222, term18222.getClass(), "value", 0.0);
        setField(term18222, term18222.getClass(), "paint", null);
        setField(term18222, term18222.getClass(), "stroke", null);
        setField(term18222, term18222.getClass(), "outlinePaint", null);
        setField(term18222, term18222.getClass(), "outlineStroke", null);
        setFloatField(term18222, term18222.getClass(), "alpha", -2.13909504E9F);
        setField(term18222, term18222.getClass(), "label", null);
        setField(term18222, term18222.getClass(), "labelFont", null);
        setField(term18222, term18222.getClass(), "labelPaint", null);
        setField(term18222, term18222.getClass(), "labelAnchor", null);
        setField(term18222, term18222.getClass(), "labelTextAnchor", null);
        setField(term18223, term18223.getClass(), "unitType", null);
        setDoubleField(term18223, term18223.getClass(), "top", -9.2188678874715914E18);
        setDoubleField(term18223, term18223.getClass(), "left", -4.6105601185205453E18);
        setDoubleField(term18223, term18223.getClass(), "bottom", 4.503599627370496E15);
        setDoubleField(term18223, term18223.getClass(), "right", -4.6116156496832102E18);
        setField(term18222, term18222.getClass(), "labelOffset", term18223);
        setField(term18224, term18224.getClass(), "name", "");
        setField(term18222, term18222.getClass(), "labelOffsetType", term18224);
        setField(term18222, term18222.getClass(), "listenerList", null);
        term18227 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term18228 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term18229 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term18227, term18227.getClass(), "value", 0.0);
        setField(term18227, term18227.getClass(), "paint", null);
        setField(term18227, term18227.getClass(), "stroke", null);
        setField(term18227, term18227.getClass(), "outlinePaint", null);
        setField(term18227, term18227.getClass(), "outlineStroke", null);
        setFloatField(term18227, term18227.getClass(), "alpha", -2.13909504E9F);
        setField(term18227, term18227.getClass(), "label", null);
        setField(term18227, term18227.getClass(), "labelFont", null);
        setField(term18227, term18227.getClass(), "labelPaint", null);
        setField(term18227, term18227.getClass(), "labelAnchor", null);
        setField(term18227, term18227.getClass(), "labelTextAnchor", null);
        setField(term18228, term18228.getClass(), "unitType", null);
        setDoubleField(term18228, term18228.getClass(), "top", -9.2188678874715914E18);
        setDoubleField(term18228, term18228.getClass(), "left", -4.6105601185205453E18);
        setDoubleField(term18228, term18228.getClass(), "bottom", 4.503599627370496E15);
        setDoubleField(term18228, term18228.getClass(), "right", -4.6116156496832102E18);
        setField(term18227, term18227.getClass(), "labelOffset", term18228);
        setField(term18229, term18229.getClass(), "name", "");
        setField(term18227, term18227.getClass(), "labelOffsetType", term18229);
        setField(term18227, term18227.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17940;
        Object retValue = callMethod(klass, "equals", argTypes, term17666, args);
        assertTrue(recursiveEquals(term17666, term18222));
        assertTrue(recursiveEquals(term17940, term18227));
        assertTrue(recursiveEquals(retValue, true));
    }

};


