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

public class ValueMarker_equals_47806252324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4692;
     Object term4832;

    public ValueMarker_equals_47806252324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4692 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term4762 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term4692, term4692.getClass(), "paint", null);
        setField(term4692, term4692.getClass(), "stroke", null);
        setField(term4692, term4692.getClass(), "outlinePaint", null);
        setField(term4692, term4692.getClass(), "outlineStroke", term4762);
        term4832 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        setField(term4832, term4832.getClass(), "paint", null);
        setField(term4832, term4832.getClass(), "stroke", null);
        setField(term4832, term4832.getClass(), "outlinePaint", null);
        setField(term4832, term4832.getClass(), "outlineStroke", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4832;
        callMethod(klass, "equals", argTypes, term4692, args);
    }

};


