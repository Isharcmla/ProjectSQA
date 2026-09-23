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

public class ValueMarker_equals_47806252359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11316;
     Object term11464;
     Object term11696;
     Object term11698;

    public ValueMarker_equals_47806252359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11316 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term11394 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term11316, term11316.getClass(), "paint", null);
        setField(term11316, term11316.getClass(), "stroke", null);
        setField(term11316, term11316.getClass(), "outlinePaint", null);
        setField(term11316, term11316.getClass(), "outlineStroke", null);
        setFloatField(term11316, term11316.getClass(), "alpha", -2.13804646E9F);
        setField(term11316, term11316.getClass(), "label", null);
        setField(term11316, term11316.getClass(), "labelFont", null);
        setField(term11316, term11316.getClass(), "labelPaint", null);
        setField(term11316, term11316.getClass(), "labelAnchor", null);
        setField(term11316, term11316.getClass(), "labelTextAnchor", null);
        setField(term11394, term11394.getClass(), "unitType", null);
        setDoubleField(term11394, term11394.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term11394, term11394.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term11394, term11394.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term11394, term11394.getClass(), "bottom", 6.0573414988133171E18);
        setField(term11316, term11316.getClass(), "labelOffset", term11394);
        term11464 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term11542 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setField(term11464, term11464.getClass(), "paint", null);
        setField(term11464, term11464.getClass(), "stroke", null);
        setField(term11464, term11464.getClass(), "outlinePaint", null);
        setField(term11464, term11464.getClass(), "outlineStroke", null);
        setFloatField(term11464, term11464.getClass(), "alpha", -2.13804646E9F);
        setField(term11464, term11464.getClass(), "label", null);
        setField(term11464, term11464.getClass(), "labelFont", null);
        setField(term11464, term11464.getClass(), "labelPaint", null);
        setField(term11464, term11464.getClass(), "labelAnchor", null);
        setField(term11464, term11464.getClass(), "labelTextAnchor", null);
        setField(term11542, term11542.getClass(), "unitType", null);
        setDoubleField(term11542, term11542.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term11542, term11542.getClass(), "right", -9.2166166374137201E18);
        setDoubleField(term11542, term11542.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term11542, term11542.getClass(), "bottom", -6.3230538768281764E18);
        setField(term11464, term11464.getClass(), "labelOffset", term11542);
        term11696 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term11697 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setDoubleField(term11696, term11696.getClass(), "value", 0.0);
        setField(term11696, term11696.getClass(), "paint", null);
        setField(term11696, term11696.getClass(), "stroke", null);
        setField(term11696, term11696.getClass(), "outlinePaint", null);
        setField(term11696, term11696.getClass(), "outlineStroke", null);
        setFloatField(term11696, term11696.getClass(), "alpha", -2.13804646E9F);
        setField(term11696, term11696.getClass(), "label", null);
        setField(term11696, term11696.getClass(), "labelFont", null);
        setField(term11696, term11696.getClass(), "labelPaint", null);
        setField(term11696, term11696.getClass(), "labelAnchor", null);
        setField(term11696, term11696.getClass(), "labelTextAnchor", null);
        setField(term11697, term11697.getClass(), "unitType", null);
        setDoubleField(term11697, term11697.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term11697, term11697.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term11697, term11697.getClass(), "bottom", 6.0573414988133171E18);
        setDoubleField(term11697, term11697.getClass(), "right", -9.2166166374137201E18);
        setField(term11696, term11696.getClass(), "labelOffset", term11697);
        setField(term11696, term11696.getClass(), "labelOffsetType", null);
        setField(term11696, term11696.getClass(), "listenerList", null);
        term11698 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term11699 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        setDoubleField(term11698, term11698.getClass(), "value", 0.0);
        setField(term11698, term11698.getClass(), "paint", null);
        setField(term11698, term11698.getClass(), "stroke", null);
        setField(term11698, term11698.getClass(), "outlinePaint", null);
        setField(term11698, term11698.getClass(), "outlineStroke", null);
        setFloatField(term11698, term11698.getClass(), "alpha", -2.13804646E9F);
        setField(term11698, term11698.getClass(), "label", null);
        setField(term11698, term11698.getClass(), "labelFont", null);
        setField(term11698, term11698.getClass(), "labelPaint", null);
        setField(term11698, term11698.getClass(), "labelAnchor", null);
        setField(term11698, term11698.getClass(), "labelTextAnchor", null);
        setField(term11699, term11699.getClass(), "unitType", null);
        setDoubleField(term11699, term11699.getClass(), "top", -9.2166166374137201E18);
        setDoubleField(term11699, term11699.getClass(), "left", -9.2166166374137201E18);
        setDoubleField(term11699, term11699.getClass(), "bottom", -6.3230538768281764E18);
        setDoubleField(term11699, term11699.getClass(), "right", -9.2166166374137201E18);
        setField(term11698, term11698.getClass(), "labelOffset", term11699);
        setField(term11698, term11698.getClass(), "labelOffsetType", null);
        setField(term11698, term11698.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11464;
        Object retValue = callMethod(klass, "equals", argTypes, term11316, args);
        assertTrue(recursiveEquals(term11316, term11696));
        assertTrue(recursiveEquals(term11464, term11698));
        assertTrue(recursiveEquals(retValue, false));
    }

};


