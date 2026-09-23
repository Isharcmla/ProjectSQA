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
import org.jfree.data.general.SeriesException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TimeSeries_add_1298291569202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45871;
     Object term45989;

    public TimeSeries_add_1298291569202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45907 = Class.forName((String) "java.util.stream.SliceOps$SliceTask");
        term45871 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term45871, term45871.getClass(), "timePeriodClass", term45907);
        term45989 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term46015 = newInstance(Class.forName("org.jfree.data.time.Day"));
        setField(term45989, term45989.getClass(), "period", term46015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term45989;
        args[1] = false;
        try {
            callMethod(klass, "add", argTypes, term45871, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


