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

public class ValueMarker_equals_47806252369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14591;
     Object term14895;
     Object term15245;
     Object term15249;

    public ValueMarker_equals_47806252369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14591 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term14929 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        Object term14737 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term15051 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term14591, term14591.getClass(), "paint", null);
        setField(term14591, term14591.getClass(), "stroke", null);
        setField(term14591, term14591.getClass(), "outlinePaint", null);
        setField(term14591, term14591.getClass(), "outlineStroke", null);
        setFloatField(term14591, term14591.getClass(), "alpha", -2.08037478E9F);
        setField(term14591, term14591.getClass(), "label", null);
        setField(term14591, term14591.getClass(), "labelFont", null);
        setField(term14591, term14591.getClass(), "labelPaint", null);
        setField(term14591, term14591.getClass(), "labelAnchor", null);
        setField(term14591, term14591.getClass(), "labelTextAnchor", term14929);
        setField(term14737, term14737.getClass(), "unitType", null);
        setDoubleField(term14737, term14737.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term14737, term14737.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term14737, term14737.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term14737, term14737.getClass(), "bottom", -9.2166166374137201E18);
        setField(term14591, term14591.getClass(), "labelOffset", term14737);
        setField(term14591, term14591.getClass(), "labelOffsetType", term15051);
        setDoubleField(term14591, term14591.getClass(), "value", 6.2104638864123494E18);
        term14895 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term15007 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term14895, term14895.getClass(), "paint", null);
        setField(term14895, term14895.getClass(), "stroke", null);
        setField(term14895, term14895.getClass(), "outlinePaint", null);
        setField(term14895, term14895.getClass(), "outlineStroke", null);
        setFloatField(term14895, term14895.getClass(), "alpha", -2.08037478E9F);
        setField(term14895, term14895.getClass(), "label", null);
        setField(term14895, term14895.getClass(), "labelFont", null);
        setField(term14895, term14895.getClass(), "labelPaint", null);
        setField(term14895, term14895.getClass(), "labelAnchor", null);
        setField(term14895, term14895.getClass(), "labelTextAnchor", term14929);
        setField(term15007, term15007.getClass(), "unitType", null);
        setDoubleField(term15007, term15007.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term15007, term15007.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term15007, term15007.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term15007, term15007.getClass(), "bottom", -9.2166166374137201E18);
        setField(term14895, term14895.getClass(), "labelOffset", term15007);
        setField(term14895, term14895.getClass(), "labelOffsetType", term15051);
        setDoubleField(term14895, term14895.getClass(), "value", -8.4217313029143921E18);
        term15245 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term15246 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        Object term15247 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term15248 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term15245, term15245.getClass(), "value", 6.2104638864123494E18);
        setField(term15245, term15245.getClass(), "paint", null);
        setField(term15245, term15245.getClass(), "stroke", null);
        setField(term15245, term15245.getClass(), "outlinePaint", null);
        setField(term15245, term15245.getClass(), "outlineStroke", null);
        setFloatField(term15245, term15245.getClass(), "alpha", -2.08037478E9F);
        setField(term15245, term15245.getClass(), "label", null);
        setField(term15245, term15245.getClass(), "labelFont", null);
        setField(term15245, term15245.getClass(), "labelPaint", null);
        setField(term15245, term15245.getClass(), "labelAnchor", null);
        setField(term15246, term15246.getClass(), "name", null);
        setField(term15245, term15245.getClass(), "labelTextAnchor", term15246);
        setField(term15247, term15247.getClass(), "unitType", null);
        setDoubleField(term15247, term15247.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term15247, term15247.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term15247, term15247.getClass(), "bottom", -9.2166166374137201E18);
        setDoubleField(term15247, term15247.getClass(), "right", -9.2166166374137201E18);
        setField(term15245, term15245.getClass(), "labelOffset", term15247);
        setField(term15248, term15248.getClass(), "name", null);
        setField(term15245, term15245.getClass(), "labelOffsetType", term15248);
        setField(term15245, term15245.getClass(), "listenerList", null);
        term15249 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term15250 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        Object term15251 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term15252 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term15249, term15249.getClass(), "value", -8.4217313029143921E18);
        setField(term15249, term15249.getClass(), "paint", null);
        setField(term15249, term15249.getClass(), "stroke", null);
        setField(term15249, term15249.getClass(), "outlinePaint", null);
        setField(term15249, term15249.getClass(), "outlineStroke", null);
        setFloatField(term15249, term15249.getClass(), "alpha", -2.08037478E9F);
        setField(term15249, term15249.getClass(), "label", null);
        setField(term15249, term15249.getClass(), "labelFont", null);
        setField(term15249, term15249.getClass(), "labelPaint", null);
        setField(term15249, term15249.getClass(), "labelAnchor", null);
        setField(term15250, term15250.getClass(), "name", null);
        setField(term15249, term15249.getClass(), "labelTextAnchor", term15250);
        setField(term15251, term15251.getClass(), "unitType", null);
        setDoubleField(term15251, term15251.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term15251, term15251.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term15251, term15251.getClass(), "bottom", -9.2166166374137201E18);
        setDoubleField(term15251, term15251.getClass(), "right", -9.2166166374137201E18);
        setField(term15249, term15249.getClass(), "labelOffset", term15251);
        setField(term15252, term15252.getClass(), "name", null);
        setField(term15249, term15249.getClass(), "labelOffsetType", term15252);
        setField(term15249, term15249.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14895;
        Object retValue = callMethod(klass, "equals", argTypes, term14591, args);
        assertTrue(recursiveEquals(term14591, term15245));
        assertTrue(recursiveEquals(term14895, term15249));
        assertTrue(recursiveEquals(retValue, false));
    }

};


