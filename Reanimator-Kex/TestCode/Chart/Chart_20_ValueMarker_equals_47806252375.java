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

public class ValueMarker_equals_47806252375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16879;
     Object term17153;
     Object term17435;
     Object term17440;

    public ValueMarker_equals_47806252375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16879 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term16957 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term17045 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term16879, term16879.getClass(), "paint", null);
        setField(term16879, term16879.getClass(), "stroke", null);
        setField(term16879, term16879.getClass(), "outlinePaint", null);
        setField(term16879, term16879.getClass(), "outlineStroke", null);
        setFloatField(term16879, term16879.getClass(), "alpha", -2.13490074E9F);
        setField(term16879, term16879.getClass(), "label", null);
        setField(term16879, term16879.getClass(), "labelFont", null);
        setField(term16879, term16879.getClass(), "labelPaint", null);
        setField(term16879, term16879.getClass(), "labelAnchor", null);
        setField(term16879, term16879.getClass(), "labelTextAnchor", null);
        setField(term16957, term16957.getClass(), "unitType", null);
        setDoubleField(term16957, term16957.getClass(), "left", -9.2143648290101002E18);
        setDoubleField(term16957, term16957.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term16957, term16957.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term16957, term16957.getClass(), "bottom", -9.2166166374137201E18);
        setField(term16879, term16879.getClass(), "labelOffset", term16957);
        setField(term17045, term17045.getClass(), "name", "");
        setField(term16879, term16879.getClass(), "labelOffsetType", term17045);
        setDoubleField(term16879, term16879.getClass(), "value", 9.007199258537834E15);
        term17153 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term17231 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term17319 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term17153, term17153.getClass(), "paint", null);
        setField(term17153, term17153.getClass(), "stroke", null);
        setField(term17153, term17153.getClass(), "outlinePaint", null);
        setField(term17153, term17153.getClass(), "outlineStroke", null);
        setFloatField(term17153, term17153.getClass(), "alpha", -2.13490074E9F);
        setField(term17153, term17153.getClass(), "label", null);
        setField(term17153, term17153.getClass(), "labelFont", null);
        setField(term17153, term17153.getClass(), "labelPaint", null);
        setField(term17153, term17153.getClass(), "labelAnchor", null);
        setField(term17153, term17153.getClass(), "labelTextAnchor", null);
        setField(term17231, term17231.getClass(), "unitType", null);
        setDoubleField(term17231, term17231.getClass(), "left", -9.2143648290101002E18);
        setDoubleField(term17231, term17231.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term17231, term17231.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term17231, term17231.getClass(), "bottom", -9.2166166374137201E18);
        setField(term17153, term17153.getClass(), "labelOffset", term17231);
        setField(term17319, term17319.getClass(), "name", "");
        setField(term17153, term17153.getClass(), "labelOffsetType", term17319);
        setDoubleField(term17153, term17153.getClass(), "value", 4.503599631167339E15);
        term17435 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term17436 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term17437 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term17435, term17435.getClass(), "value", 9.007199258537834E15);
        setField(term17435, term17435.getClass(), "paint", null);
        setField(term17435, term17435.getClass(), "stroke", null);
        setField(term17435, term17435.getClass(), "outlinePaint", null);
        setField(term17435, term17435.getClass(), "outlineStroke", null);
        setFloatField(term17435, term17435.getClass(), "alpha", -2.13490074E9F);
        setField(term17435, term17435.getClass(), "label", null);
        setField(term17435, term17435.getClass(), "labelFont", null);
        setField(term17435, term17435.getClass(), "labelPaint", null);
        setField(term17435, term17435.getClass(), "labelAnchor", null);
        setField(term17435, term17435.getClass(), "labelTextAnchor", null);
        setField(term17436, term17436.getClass(), "unitType", null);
        setDoubleField(term17436, term17436.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term17436, term17436.getClass(), "left", -9.2143648290101002E18);
        setDoubleField(term17436, term17436.getClass(), "bottom", -9.2166166374137201E18);
        setDoubleField(term17436, term17436.getClass(), "right", -9.2166166374137201E18);
        setField(term17435, term17435.getClass(), "labelOffset", term17436);
        setField(term17437, term17437.getClass(), "name", "");
        setField(term17435, term17435.getClass(), "labelOffsetType", term17437);
        setField(term17435, term17435.getClass(), "listenerList", null);
        term17440 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term17441 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term17442 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term17440, term17440.getClass(), "value", 4.503599631167339E15);
        setField(term17440, term17440.getClass(), "paint", null);
        setField(term17440, term17440.getClass(), "stroke", null);
        setField(term17440, term17440.getClass(), "outlinePaint", null);
        setField(term17440, term17440.getClass(), "outlineStroke", null);
        setFloatField(term17440, term17440.getClass(), "alpha", -2.13490074E9F);
        setField(term17440, term17440.getClass(), "label", null);
        setField(term17440, term17440.getClass(), "labelFont", null);
        setField(term17440, term17440.getClass(), "labelPaint", null);
        setField(term17440, term17440.getClass(), "labelAnchor", null);
        setField(term17440, term17440.getClass(), "labelTextAnchor", null);
        setField(term17441, term17441.getClass(), "unitType", null);
        setDoubleField(term17441, term17441.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term17441, term17441.getClass(), "left", -9.2143648290101002E18);
        setDoubleField(term17441, term17441.getClass(), "bottom", -9.2166166374137201E18);
        setDoubleField(term17441, term17441.getClass(), "right", -9.2166166374137201E18);
        setField(term17440, term17440.getClass(), "labelOffset", term17441);
        setField(term17442, term17442.getClass(), "name", "");
        setField(term17440, term17440.getClass(), "labelOffsetType", term17442);
        setField(term17440, term17440.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17153;
        Object retValue = callMethod(klass, "equals", argTypes, term16879, args);
        assertTrue(recursiveEquals(term16879, term17435));
        assertTrue(recursiveEquals(term17153, term17440));
        assertTrue(recursiveEquals(retValue, false));
    }

};


