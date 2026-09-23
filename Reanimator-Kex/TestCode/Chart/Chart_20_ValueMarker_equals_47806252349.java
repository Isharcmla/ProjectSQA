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

public class ValueMarker_equals_47806252349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9139;
     Object term9287;
     Object term9663;
     Object term9665;

    public ValueMarker_equals_47806252349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9139 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term9217 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term9139, term9139.getClass(), "paint", null);
        setField(term9139, term9139.getClass(), "stroke", null);
        setField(term9139, term9139.getClass(), "outlinePaint", null);
        setField(term9139, term9139.getClass(), "outlineStroke", null);
        setFloatField(term9139, term9139.getClass(), "alpha", -2.01326592E9F);
        setField(term9139, term9139.getClass(), "label", null);
        setField(term9139, term9139.getClass(), "labelFont", null);
        setField(term9139, term9139.getClass(), "labelPaint", null);
        setField(term9139, term9139.getClass(), "labelAnchor", null);
        setField(term9139, term9139.getClass(), "labelTextAnchor", null);
        setField(term9217, term9217.getClass(), "unitType", null);
        setDoubleField(term9217, term9217.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term9217, term9217.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term9217, term9217.getClass(), "top", 4.8053408045518029E18);
        setField(term9139, term9139.getClass(), "labelOffset", term9217);
        term9287 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term9365 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term9287, term9287.getClass(), "paint", null);
        setField(term9287, term9287.getClass(), "stroke", null);
        setField(term9287, term9287.getClass(), "outlinePaint", null);
        setField(term9287, term9287.getClass(), "outlineStroke", null);
        setFloatField(term9287, term9287.getClass(), "alpha", -2.01326592E9F);
        setField(term9287, term9287.getClass(), "label", null);
        setField(term9287, term9287.getClass(), "labelFont", null);
        setField(term9287, term9287.getClass(), "labelPaint", null);
        setField(term9287, term9287.getClass(), "labelAnchor", null);
        setField(term9287, term9287.getClass(), "labelTextAnchor", null);
        setField(term9365, term9365.getClass(), "unitType", null);
        setDoubleField(term9365, term9365.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term9365, term9365.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term9365, term9365.getClass(), "top", -9.1242928429051412E18);
        setField(term9287, term9287.getClass(), "labelOffset", term9365);
        term9663 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term9664 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setDoubleField(term9663, term9663.getClass(), "value", 0.0);
        setField(term9663, term9663.getClass(), "paint", null);
        setField(term9663, term9663.getClass(), "stroke", null);
        setField(term9663, term9663.getClass(), "outlinePaint", null);
        setField(term9663, term9663.getClass(), "outlineStroke", null);
        setFloatField(term9663, term9663.getClass(), "alpha", -2.01326592E9F);
        setField(term9663, term9663.getClass(), "label", null);
        setField(term9663, term9663.getClass(), "labelFont", null);
        setField(term9663, term9663.getClass(), "labelPaint", null);
        setField(term9663, term9663.getClass(), "labelAnchor", null);
        setField(term9663, term9663.getClass(), "labelTextAnchor", null);
        setField(term9664, term9664.getClass(), "unitType", null);
        setDoubleField(term9664, term9664.getClass(), "top", 4.8053408045518029E18);
        setDoubleField(term9664, term9664.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term9664, term9664.getClass(), "bottom", 0.0);
        setDoubleField(term9664, term9664.getClass(), "right", -9.2166166374137201E18);
        setField(term9663, term9663.getClass(), "labelOffset", term9664);
        setField(term9663, term9663.getClass(), "labelOffsetType", null);
        setField(term9663, term9663.getClass(), "listenerList", null);
        term9665 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term9666 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setDoubleField(term9665, term9665.getClass(), "value", 0.0);
        setField(term9665, term9665.getClass(), "paint", null);
        setField(term9665, term9665.getClass(), "stroke", null);
        setField(term9665, term9665.getClass(), "outlinePaint", null);
        setField(term9665, term9665.getClass(), "outlineStroke", null);
        setFloatField(term9665, term9665.getClass(), "alpha", -2.01326592E9F);
        setField(term9665, term9665.getClass(), "label", null);
        setField(term9665, term9665.getClass(), "labelFont", null);
        setField(term9665, term9665.getClass(), "labelPaint", null);
        setField(term9665, term9665.getClass(), "labelAnchor", null);
        setField(term9665, term9665.getClass(), "labelTextAnchor", null);
        setField(term9666, term9666.getClass(), "unitType", null);
        setDoubleField(term9666, term9666.getClass(), "top", -9.1242928429051412E18);
        setDoubleField(term9666, term9666.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term9666, term9666.getClass(), "bottom", 0.0);
        setDoubleField(term9666, term9666.getClass(), "right", -9.2166166374137201E18);
        setField(term9665, term9665.getClass(), "labelOffset", term9666);
        setField(term9665, term9665.getClass(), "labelOffsetType", null);
        setField(term9665, term9665.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9287;
        Object retValue = callMethod(klass, "equals", argTypes, term9139, args);
        assertTrue(recursiveEquals(term9139, term9663));
        assertTrue(recursiveEquals(term9287, term9665));
        assertTrue(recursiveEquals(retValue, false));
    }

};


