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

public class ValueMarker_equals_47806252326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4965;
     Object term5091;
     Object term5103;
     Object term5105;

    public ValueMarker_equals_47806252326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4965 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term5053 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term4965, term4965.getClass(), "paint", null);
        setField(term4965, term4965.getClass(), "stroke", null);
        setField(term4965, term4965.getClass(), "outlinePaint", null);
        setField(term4965, term4965.getClass(), "outlineStroke", null);
        setFloatField(term4965, term4965.getClass(), "alpha", -2.13490074E9F);
        setField(term4965, term4965.getClass(), "label", null);
        setField(term4965, term4965.getClass(), "labelFont", null);
        setField(term4965, term4965.getClass(), "labelPaint", null);
        setField(term4965, term4965.getClass(), "labelAnchor", null);
        setField(term4965, term4965.getClass(), "labelTextAnchor", null);
        setField(term4965, term4965.getClass(), "labelOffset", null);
        setField(term4965, term4965.getClass(), "labelOffsetType", term5053);
        term5091 = newInstance(Class.forName("java.lang.Object"));
        term5103 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term5104 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setDoubleField(term5103, term5103.getClass(), "value", 0.0);
        setField(term5103, term5103.getClass(), "paint", null);
        setField(term5103, term5103.getClass(), "stroke", null);
        setField(term5103, term5103.getClass(), "outlinePaint", null);
        setField(term5103, term5103.getClass(), "outlineStroke", null);
        setFloatField(term5103, term5103.getClass(), "alpha", -2.13490074E9F);
        setField(term5103, term5103.getClass(), "label", null);
        setField(term5103, term5103.getClass(), "labelFont", null);
        setField(term5103, term5103.getClass(), "labelPaint", null);
        setField(term5103, term5103.getClass(), "labelAnchor", null);
        setField(term5103, term5103.getClass(), "labelTextAnchor", null);
        setField(term5103, term5103.getClass(), "labelOffset", null);
        setField(term5104, term5104.getClass(), "name", null);
        setField(term5103, term5103.getClass(), "labelOffsetType", term5104);
        setField(term5103, term5103.getClass(), "listenerList", null);
        term5105 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5091;
        Object retValue = callMethod(klass, "equals", argTypes, term4965, args);
        assertTrue(recursiveEquals(term4965, term5103));
        assertTrue(recursiveEquals(term5091, term5105));
        assertTrue(recursiveEquals(retValue, false));
    }

};


