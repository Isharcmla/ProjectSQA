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
import java.lang.Object;

public class ValueMarker_equals_47806252345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8778;
     Object term8848;

    public ValueMarker_equals_47806252345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8778 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term8778, term8778.getClass(), "paint", null);
        term8848 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term8918 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term8848, term8848.getClass(), "paint", term8918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8848;
        callMethod(klass, "equals", argTypes, term8778, args);
    }

};


