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
import java.lang.String;
import java.lang.Object;

public class TimeSeries_add_1505136783258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76487;
     Object term76605;

    public TimeSeries_add_1505136783258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term76523 = Class.forName((String) "org.jfree.chart.renderer.xy.XYItemRenderer");
        term76487 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term76487, term76487.getClass(), "timePeriodClass", term76523);
        term76605 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term76634 = newInstance(Class.forName("org.jfree.data.time.Minute"));
        setField(term76605, term76605.getClass(), "period", term76634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term76605;
        callMethod(klass, "add", argTypes, term76487, args);
    }

};


