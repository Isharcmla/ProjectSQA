package org.jfree.data.time;

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
import java.lang.ClassCastException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class TimeSeries_hashCode_385992267465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230548;

    public TimeSeries_hashCode_385992267465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term230758 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term230758, term230758.getClass(), "period", null);
        setField(term230758, term230758.getClass(), "value", null);
        Object term230834 = newInstance(Class.forName("java.lang.Object"));
        Object term230916 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term230916, term230916.getClass(), "period", null);
        setField(term230916, term230916.getClass(), "value", null);
        ArrayList term230676 = new ArrayList();
        ((ArrayList) term230676).add(term230758);
        ((ArrayList) term230676).add("java.nio.ByteBufferAsDoubleBufferRL");
        ((ArrayList) term230676).add(term230834);
        ((ArrayList) term230676).add(term230916);
        term230548 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term230624 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term230548, term230548.getClass(), "key", term230624);
        setField(term230548, term230548.getClass(), "description", null);
        setField(term230548, term230548.getClass(), "domain", null);
        setField(term230548, term230548.getClass(), "range", null);
        setField(term230548, term230548.getClass(), "timePeriodClass", null);
        setField(term230548, term230548.getClass(), "data", term230676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term230548, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


