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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class TimeSeries_updateBoundsForAddedItem_1136906134135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22080;
     Object term22162;

    public TimeSeries_updateBoundsForAddedItem_1136906134135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22080 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Double term22208 = new Double(0.0);
        term22162 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term22162, term22162.getClass(), "value", term22208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term22162;
        callMethod(klass, "updateBoundsForAddedItem", argTypes, term22080, args);
    }

};


