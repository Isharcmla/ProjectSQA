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
import java.lang.Double;
import java.lang.Object;

public class ValueMarker_init_8181302766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term413;

    public ValueMarker_init_8181302766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Double(0.13238746331190498);
        term413 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term414 = newInstance(Class.forName("java.awt.Color"));
        Object term415 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term416 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term417 = newInstance(Class.forName("java.awt.Font"));
        Object term420 = newInstance(Class.forName("java.awt.Color"));
        Object term421 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term424 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        Object term427 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term428 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term431 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        Object term434 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term435 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term413, term413.getClass(), "value", 0.13238746331190498);
        setIntField(term414, term414.getClass(), "value", -8355712);
        setField(term414, term414.getClass(), "frgbvalue", null);
        setField(term414, term414.getClass(), "fvalue", null);
        setFloatField(term414, term414.getClass(), "falpha", 0.0F);
        setField(term414, term414.getClass(), "cs", null);
        setField(term413, term413.getClass(), "paint", term414);
        setFloatField(term415, term415.getClass(), "width", 0.5F);
        setIntField(term415, term415.getClass(), "join", 0);
        setIntField(term415, term415.getClass(), "cap", 2);
        setFloatField(term415, term415.getClass(), "miterlimit", 10.0F);
        setField(term415, term415.getClass(), "dash", null);
        setFloatField(term415, term415.getClass(), "dash_phase", 0.0F);
        setField(term413, term413.getClass(), "stroke", term415);
        setField(term413, term413.getClass(), "outlinePaint", term414);
        setFloatField(term416, term416.getClass(), "width", 0.5F);
        setIntField(term416, term416.getClass(), "join", 0);
        setIntField(term416, term416.getClass(), "cap", 2);
        setFloatField(term416, term416.getClass(), "miterlimit", 10.0F);
        setField(term416, term416.getClass(), "dash", null);
        setFloatField(term416, term416.getClass(), "dash_phase", 0.0F);
        setField(term413, term413.getClass(), "outlineStroke", term416);
        setFloatField(term413, term413.getClass(), "alpha", 0.8F);
        setField(term413, term413.getClass(), "label", null);
        setField(term417, term417.getClass(), "fRequestedAttributes", null);
        setField(term417, term417.getClass(), "name", "SansSerif");
        setIntField(term417, term417.getClass(), "style", 0);
        setIntField(term417, term417.getClass(), "size", 9);
        setFloatField(term417, term417.getClass(), "pointSize", 9.0F);
        setField(term417, term417.getClass(), "peer", null);
        setLongField(term417, term417.getClass(), "pData", 0L);
        setField(term417, term417.getClass(), "font2DHandle", null);
        setField(term417, term417.getClass(), "values", null);
        setBooleanField(term417, term417.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term417, term417.getClass(), "createdFont", false);
        setBooleanField(term417, term417.getClass(), "nonIdentityTx", false);
        setIntField(term417, term417.getClass(), "hash", 0);
        setIntField(term417, term417.getClass(), "fontSerializedDataVersion", 1);
        setField(term417, term417.getClass(), "flmref", null);
        setField(term413, term413.getClass(), "labelFont", term417);
        setIntField(term420, term420.getClass(), "value", -16777216);
        setField(term420, term420.getClass(), "frgbvalue", null);
        setField(term420, term420.getClass(), "fvalue", null);
        setFloatField(term420, term420.getClass(), "falpha", 0.0F);
        setField(term420, term420.getClass(), "cs", null);
        setField(term413, term413.getClass(), "labelPaint", term420);
        setField(term421, term421.getClass(), "name", "RectangleAnchor.TOP_LEFT");
        setField(term413, term413.getClass(), "labelAnchor", term421);
        setField(term424, term424.getClass(), "name", "TextAnchor.CENTER");
        setField(term413, term413.getClass(), "labelTextAnchor", term424);
        setField(term428, term428.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term427, term427.getClass(), "unitType", term428);
        setDoubleField(term427, term427.getClass(), "top", 3.0);
        setDoubleField(term427, term427.getClass(), "left", 3.0);
        setDoubleField(term427, term427.getClass(), "bottom", 3.0);
        setDoubleField(term427, term427.getClass(), "right", 3.0);
        setField(term413, term413.getClass(), "labelOffset", term427);
        setField(term431, term431.getClass(), "name", "CONTRACT");
        setField(term413, term413.getClass(), "labelOffsetType", term431);
        setField(term434, term434.getClass(), "listenerList", term435);
        setField(term413, term413.getClass(), "listenerList", term434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term413));
        assertTrue(recursiveEquals(term1, 0.13238746331190498));
    }

};


