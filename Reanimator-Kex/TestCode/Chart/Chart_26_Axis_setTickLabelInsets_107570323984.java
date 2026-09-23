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

public class Axis_setTickLabelInsets_107570323984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211;

    public Axis_setTickLabelInsets_107570323984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term212 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        setField(term212, term212.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term211, term211.getClass(), "unitType", term212);
        setDoubleField(term211, term211.getClass(), "top", 1.0);
        setDoubleField(term211, term211.getClass(), "left", 1.0);
        setDoubleField(term211, term211.getClass(), "bottom", 1.0);
        setDoubleField(term211, term211.getClass(), "right", 1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.axis.Axis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.util.RectangleInsets");
        Object[] args = new Object[1];
        args[0] = term211;
        try {
            callMethod(klass, "setTickLabelInsets", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


