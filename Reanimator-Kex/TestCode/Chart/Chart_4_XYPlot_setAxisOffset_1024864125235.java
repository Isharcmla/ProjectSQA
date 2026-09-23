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
import java.lang.NoClassDefFoundError;
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class XYPlot_setAxisOffset_1024864125235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;

    public XYPlot_setAxisOffset_1024864125235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term25 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        setField(term25, term25.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term24, term24.getClass(), "unitType", term25);
        setDoubleField(term24, term24.getClass(), "top", 1.0);
        setDoubleField(term24, term24.getClass(), "left", 1.0);
        setDoubleField(term24, term24.getClass(), "bottom", 1.0);
        setDoubleField(term24, term24.getClass(), "right", 1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.util.RectangleInsets");
        Object[] args = new Object[1];
        args[0] = term24;
        try {
            callMethod(klass, "setAxisOffset", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


