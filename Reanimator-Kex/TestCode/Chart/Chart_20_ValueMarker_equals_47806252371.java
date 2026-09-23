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

public class ValueMarker_equals_47806252371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15433;
     Object term15675;
     Object term15900;
     Object term15903;

    public ValueMarker_equals_47806252371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15433 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term15511 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term15797 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term15433, term15433.getClass(), "paint", null);
        setField(term15433, term15433.getClass(), "stroke", null);
        setField(term15433, term15433.getClass(), "outlinePaint", null);
        setField(term15433, term15433.getClass(), "outlineStroke", null);
        setFloatField(term15433, term15433.getClass(), "alpha", -2.13907866E9F);
        setField(term15433, term15433.getClass(), "label", null);
        setField(term15433, term15433.getClass(), "labelFont", null);
        setField(term15433, term15433.getClass(), "labelPaint", null);
        setField(term15433, term15433.getClass(), "labelAnchor", null);
        setField(term15433, term15433.getClass(), "labelTextAnchor", null);
        setField(term15511, term15511.getClass(), "unitType", null);
        setDoubleField(term15511, term15511.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term15511, term15511.getClass(), "right", -9.2053576383452938E18);
        setDoubleField(term15511, term15511.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term15511, term15511.getClass(), "bottom", -9.2188684372274053E18);
        setField(term15433, term15433.getClass(), "labelOffset", term15511);
        setField(term15433, term15433.getClass(), "labelOffsetType", term15797);
        term15675 = newInstance(Class.forName("org.jfree.chart.plot.CategoryMarker"));
        Object term15753 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term15675, term15675.getClass(), "paint", null);
        setField(term15675, term15675.getClass(), "stroke", null);
        setField(term15675, term15675.getClass(), "outlinePaint", null);
        setField(term15675, term15675.getClass(), "outlineStroke", null);
        setFloatField(term15675, term15675.getClass(), "alpha", -2.13907866E9F);
        setField(term15675, term15675.getClass(), "label", null);
        setField(term15675, term15675.getClass(), "labelFont", null);
        setField(term15675, term15675.getClass(), "labelPaint", null);
        setField(term15675, term15675.getClass(), "labelAnchor", null);
        setField(term15675, term15675.getClass(), "labelTextAnchor", null);
        setField(term15753, term15753.getClass(), "unitType", null);
        setDoubleField(term15753, term15753.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term15753, term15753.getClass(), "right", -9.2053576383452938E18);
        setDoubleField(term15753, term15753.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term15753, term15753.getClass(), "bottom", -9.2188684372274053E18);
        setField(term15675, term15675.getClass(), "labelOffset", term15753);
        setField(term15675, term15675.getClass(), "labelOffsetType", term15797);
        term15900 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term15901 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term15902 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term15900, term15900.getClass(), "value", 0.0);
        setField(term15900, term15900.getClass(), "paint", null);
        setField(term15900, term15900.getClass(), "stroke", null);
        setField(term15900, term15900.getClass(), "outlinePaint", null);
        setField(term15900, term15900.getClass(), "outlineStroke", null);
        setFloatField(term15900, term15900.getClass(), "alpha", -2.13907866E9F);
        setField(term15900, term15900.getClass(), "label", null);
        setField(term15900, term15900.getClass(), "labelFont", null);
        setField(term15900, term15900.getClass(), "labelPaint", null);
        setField(term15900, term15900.getClass(), "labelAnchor", null);
        setField(term15900, term15900.getClass(), "labelTextAnchor", null);
        setField(term15901, term15901.getClass(), "unitType", null);
        setDoubleField(term15901, term15901.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term15901, term15901.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term15901, term15901.getClass(), "bottom", -9.2188684372274053E18);
        setDoubleField(term15901, term15901.getClass(), "right", -9.2053576383452938E18);
        setField(term15900, term15900.getClass(), "labelOffset", term15901);
        setField(term15902, term15902.getClass(), "name", null);
        setField(term15900, term15900.getClass(), "labelOffsetType", term15902);
        setField(term15900, term15900.getClass(), "listenerList", null);
        term15903 = newInstance(Class.forName("org.jfree.chart.plot.CategoryMarker"));
        Object term15904 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term15905 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term15903, term15903.getClass(), "key", null);
        setBooleanField(term15903, term15903.getClass(), "drawAsLine", false);
        setField(term15903, term15903.getClass(), "paint", null);
        setField(term15903, term15903.getClass(), "stroke", null);
        setField(term15903, term15903.getClass(), "outlinePaint", null);
        setField(term15903, term15903.getClass(), "outlineStroke", null);
        setFloatField(term15903, term15903.getClass(), "alpha", -2.13907866E9F);
        setField(term15903, term15903.getClass(), "label", null);
        setField(term15903, term15903.getClass(), "labelFont", null);
        setField(term15903, term15903.getClass(), "labelPaint", null);
        setField(term15903, term15903.getClass(), "labelAnchor", null);
        setField(term15903, term15903.getClass(), "labelTextAnchor", null);
        setField(term15904, term15904.getClass(), "unitType", null);
        setDoubleField(term15904, term15904.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term15904, term15904.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term15904, term15904.getClass(), "bottom", -9.2188684372274053E18);
        setDoubleField(term15904, term15904.getClass(), "right", -9.2053576383452938E18);
        setField(term15903, term15903.getClass(), "labelOffset", term15904);
        setField(term15905, term15905.getClass(), "name", null);
        setField(term15903, term15903.getClass(), "labelOffsetType", term15905);
        setField(term15903, term15903.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15675;
        Object retValue = callMethod(klass, "equals", argTypes, term15433, args);
        assertTrue(recursiveEquals(term15433, term15900));
        assertTrue(recursiveEquals(term15675, term15903));
        assertTrue(recursiveEquals(retValue, false));
    }

};


