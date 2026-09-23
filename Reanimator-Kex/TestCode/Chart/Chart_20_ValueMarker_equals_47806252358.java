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

public class ValueMarker_equals_47806252358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10845;
     Object term10993;
     Object term11615;
     Object term11617;

    public ValueMarker_equals_47806252358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10845 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term10923 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term10845, term10845.getClass(), "paint", null);
        setField(term10845, term10845.getClass(), "stroke", null);
        setField(term10845, term10845.getClass(), "outlinePaint", null);
        setField(term10845, term10845.getClass(), "outlineStroke", null);
        setFloatField(term10845, term10845.getClass(), "alpha", -2.1390295E9F);
        setField(term10845, term10845.getClass(), "label", null);
        setField(term10845, term10845.getClass(), "labelFont", null);
        setField(term10845, term10845.getClass(), "labelPaint", null);
        setField(term10845, term10845.getClass(), "labelAnchor", null);
        setField(term10845, term10845.getClass(), "labelTextAnchor", null);
        setField(term10923, term10923.getClass(), "unitType", null);
        setDoubleField(term10923, term10923.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term10923, term10923.getClass(), "right", 4.9130776883500155E18);
        setField(term10845, term10845.getClass(), "labelOffset", term10923);
        term10993 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term11071 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term10993, term10993.getClass(), "paint", null);
        setField(term10993, term10993.getClass(), "stroke", null);
        setField(term10993, term10993.getClass(), "outlinePaint", null);
        setField(term10993, term10993.getClass(), "outlineStroke", null);
        setFloatField(term10993, term10993.getClass(), "alpha", -2.1390295E9F);
        setField(term10993, term10993.getClass(), "label", null);
        setField(term10993, term10993.getClass(), "labelFont", null);
        setField(term10993, term10993.getClass(), "labelPaint", null);
        setField(term10993, term10993.getClass(), "labelAnchor", null);
        setField(term10993, term10993.getClass(), "labelTextAnchor", null);
        setField(term11071, term11071.getClass(), "unitType", null);
        setDoubleField(term11071, term11071.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term11071, term11071.getClass(), "right", -4.3147979481321308E18);
        setField(term10993, term10993.getClass(), "labelOffset", term11071);
        term11615 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term11616 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setDoubleField(term11615, term11615.getClass(), "value", 0.0);
        setField(term11615, term11615.getClass(), "paint", null);
        setField(term11615, term11615.getClass(), "stroke", null);
        setField(term11615, term11615.getClass(), "outlinePaint", null);
        setField(term11615, term11615.getClass(), "outlineStroke", null);
        setFloatField(term11615, term11615.getClass(), "alpha", -2.1390295E9F);
        setField(term11615, term11615.getClass(), "label", null);
        setField(term11615, term11615.getClass(), "labelFont", null);
        setField(term11615, term11615.getClass(), "labelPaint", null);
        setField(term11615, term11615.getClass(), "labelAnchor", null);
        setField(term11615, term11615.getClass(), "labelTextAnchor", null);
        setField(term11616, term11616.getClass(), "unitType", null);
        setDoubleField(term11616, term11616.getClass(), "top", 0.0);
        setDoubleField(term11616, term11616.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term11616, term11616.getClass(), "bottom", 0.0);
        setDoubleField(term11616, term11616.getClass(), "right", 4.9130776883500155E18);
        setField(term11615, term11615.getClass(), "labelOffset", term11616);
        setField(term11615, term11615.getClass(), "labelOffsetType", null);
        setField(term11615, term11615.getClass(), "listenerList", null);
        term11617 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term11618 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setDoubleField(term11617, term11617.getClass(), "value", 0.0);
        setField(term11617, term11617.getClass(), "paint", null);
        setField(term11617, term11617.getClass(), "stroke", null);
        setField(term11617, term11617.getClass(), "outlinePaint", null);
        setField(term11617, term11617.getClass(), "outlineStroke", null);
        setFloatField(term11617, term11617.getClass(), "alpha", -2.1390295E9F);
        setField(term11617, term11617.getClass(), "label", null);
        setField(term11617, term11617.getClass(), "labelFont", null);
        setField(term11617, term11617.getClass(), "labelPaint", null);
        setField(term11617, term11617.getClass(), "labelAnchor", null);
        setField(term11617, term11617.getClass(), "labelTextAnchor", null);
        setField(term11618, term11618.getClass(), "unitType", null);
        setDoubleField(term11618, term11618.getClass(), "top", 0.0);
        setDoubleField(term11618, term11618.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term11618, term11618.getClass(), "bottom", 0.0);
        setDoubleField(term11618, term11618.getClass(), "right", -4.3147979481321308E18);
        setField(term11617, term11617.getClass(), "labelOffset", term11618);
        setField(term11617, term11617.getClass(), "labelOffsetType", null);
        setField(term11617, term11617.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10993;
        Object retValue = callMethod(klass, "equals", argTypes, term10845, args);
        assertTrue(recursiveEquals(term10845, term11615));
        assertTrue(recursiveEquals(term10993, term11617));
        assertTrue(recursiveEquals(retValue, false));
    }

};


