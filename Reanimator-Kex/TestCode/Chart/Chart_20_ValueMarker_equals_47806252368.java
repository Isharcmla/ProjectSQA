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

public class ValueMarker_equals_47806252368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13962;
     Object term14236;
     Object term15141;
     Object term15146;

    public ValueMarker_equals_47806252368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13962 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term14040 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term14128 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term13962, term13962.getClass(), "paint", null);
        setField(term13962, term13962.getClass(), "stroke", null);
        setField(term13962, term13962.getClass(), "outlinePaint", null);
        setField(term13962, term13962.getClass(), "outlineStroke", null);
        setFloatField(term13962, term13962.getClass(), "alpha", -2.13907866E9F);
        setField(term13962, term13962.getClass(), "label", null);
        setField(term13962, term13962.getClass(), "labelFont", null);
        setField(term13962, term13962.getClass(), "labelPaint", null);
        setField(term13962, term13962.getClass(), "labelAnchor", null);
        setField(term13962, term13962.getClass(), "labelTextAnchor", null);
        setField(term14040, term14040.getClass(), "unitType", null);
        setDoubleField(term14040, term14040.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term14040, term14040.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term14040, term14040.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term14040, term14040.getClass(), "bottom", -9.2166166374137201E18);
        setField(term13962, term13962.getClass(), "labelOffset", term14040);
        setField(term14128, term14128.getClass(), "name", "");
        setField(term13962, term13962.getClass(), "labelOffsetType", term14128);
        term14236 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term14314 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term14402 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term14236, term14236.getClass(), "paint", null);
        setField(term14236, term14236.getClass(), "stroke", null);
        setField(term14236, term14236.getClass(), "outlinePaint", null);
        setField(term14236, term14236.getClass(), "outlineStroke", null);
        setFloatField(term14236, term14236.getClass(), "alpha", -2.13907866E9F);
        setField(term14236, term14236.getClass(), "label", null);
        setField(term14236, term14236.getClass(), "labelFont", null);
        setField(term14236, term14236.getClass(), "labelPaint", null);
        setField(term14236, term14236.getClass(), "labelAnchor", null);
        setField(term14236, term14236.getClass(), "labelTextAnchor", null);
        setField(term14314, term14314.getClass(), "unitType", null);
        setDoubleField(term14314, term14314.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term14314, term14314.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term14314, term14314.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term14314, term14314.getClass(), "bottom", -9.2166166374137201E18);
        setField(term14236, term14236.getClass(), "labelOffset", term14314);
        setField(term14402, term14402.getClass(), "name", null);
        setField(term14236, term14236.getClass(), "labelOffsetType", term14402);
        term15141 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term15142 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term15143 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term15141, term15141.getClass(), "value", 0.0);
        setField(term15141, term15141.getClass(), "paint", null);
        setField(term15141, term15141.getClass(), "stroke", null);
        setField(term15141, term15141.getClass(), "outlinePaint", null);
        setField(term15141, term15141.getClass(), "outlineStroke", null);
        setFloatField(term15141, term15141.getClass(), "alpha", -2.13907866E9F);
        setField(term15141, term15141.getClass(), "label", null);
        setField(term15141, term15141.getClass(), "labelFont", null);
        setField(term15141, term15141.getClass(), "labelPaint", null);
        setField(term15141, term15141.getClass(), "labelAnchor", null);
        setField(term15141, term15141.getClass(), "labelTextAnchor", null);
        setField(term15142, term15142.getClass(), "unitType", null);
        setDoubleField(term15142, term15142.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term15142, term15142.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term15142, term15142.getClass(), "bottom", -9.2166166374137201E18);
        setDoubleField(term15142, term15142.getClass(), "right", -9.2166166374137201E18);
        setField(term15141, term15141.getClass(), "labelOffset", term15142);
        setField(term15143, term15143.getClass(), "name", "");
        setField(term15141, term15141.getClass(), "labelOffsetType", term15143);
        setField(term15141, term15141.getClass(), "listenerList", null);
        term15146 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term15147 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term15148 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term15146, term15146.getClass(), "value", 0.0);
        setField(term15146, term15146.getClass(), "paint", null);
        setField(term15146, term15146.getClass(), "stroke", null);
        setField(term15146, term15146.getClass(), "outlinePaint", null);
        setField(term15146, term15146.getClass(), "outlineStroke", null);
        setFloatField(term15146, term15146.getClass(), "alpha", -2.13907866E9F);
        setField(term15146, term15146.getClass(), "label", null);
        setField(term15146, term15146.getClass(), "labelFont", null);
        setField(term15146, term15146.getClass(), "labelPaint", null);
        setField(term15146, term15146.getClass(), "labelAnchor", null);
        setField(term15146, term15146.getClass(), "labelTextAnchor", null);
        setField(term15147, term15147.getClass(), "unitType", null);
        setDoubleField(term15147, term15147.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term15147, term15147.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term15147, term15147.getClass(), "bottom", -9.2166166374137201E18);
        setDoubleField(term15147, term15147.getClass(), "right", -9.2166166374137201E18);
        setField(term15146, term15146.getClass(), "labelOffset", term15147);
        setField(term15148, term15148.getClass(), "name", null);
        setField(term15146, term15146.getClass(), "labelOffsetType", term15148);
        setField(term15146, term15146.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14236;
        Object retValue = callMethod(klass, "equals", argTypes, term13962, args);
        assertTrue(recursiveEquals(term13962, term15141));
        assertTrue(recursiveEquals(term14236, term15146));
        assertTrue(recursiveEquals(retValue, false));
    }

};


