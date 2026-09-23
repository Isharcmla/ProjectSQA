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

public class PiePlot_setSimpleLabelOffset_1709721159194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;

    public PiePlot_setSimpleLabelOffset_1709721159194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term157 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        setField(term157, term157.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term156, term156.getClass(), "unitType", term157);
        setDoubleField(term156, term156.getClass(), "top", 1.0);
        setDoubleField(term156, term156.getClass(), "left", 1.0);
        setDoubleField(term156, term156.getClass(), "bottom", 1.0);
        setDoubleField(term156, term156.getClass(), "right", 1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.PiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.util.RectangleInsets");
        Object[] args = new Object[1];
        args[0] = term156;
        try {
            callMethod(klass, "setSimpleLabelOffset", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


