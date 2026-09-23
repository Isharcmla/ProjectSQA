package org.jfree.chart.axis;

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
import java.lang.NullPointerException;
import static org.jfree.chart.axis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Axis_setLabelInsets_201880264664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;

    public Axis_setLabelInsets_201880264664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term73 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        setField(term73, term73.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term72, term72.getClass(), "unitType", term73);
        setDoubleField(term72, term72.getClass(), "top", 1.0);
        setDoubleField(term72, term72.getClass(), "left", 1.0);
        setDoubleField(term72, term72.getClass(), "bottom", 1.0);
        setDoubleField(term72, term72.getClass(), "right", 1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.axis.Axis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.util.RectangleInsets");
        Object[] args = new Object[1];
        args[0] = term72;
        try {
            callMethod(klass, "setLabelInsets", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


