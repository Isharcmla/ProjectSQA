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

public class ValueMarker_equals_47806252336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6784;
     Object term6924;

    public ValueMarker_equals_47806252336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6784 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term6854 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term6784, term6784.getClass(), "paint", null);
        setField(term6784, term6784.getClass(), "stroke", term6854);
        term6924 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term6924, term6924.getClass(), "paint", null);
        setField(term6924, term6924.getClass(), "stroke", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6924;
        callMethod(klass, "equals", argTypes, term6784, args);
    }

};


