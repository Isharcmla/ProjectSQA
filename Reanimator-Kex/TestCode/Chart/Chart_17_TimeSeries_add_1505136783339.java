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

public class TimeSeries_add_1505136783339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119851;
     Object term119969;

    public TimeSeries_add_1505136783339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term119887 = Class.forName((String) "org.jfree.data.KeyedObject");
        term119851 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term119851, term119851.getClass(), "timePeriodClass", term119887);
        term119969 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term119997 = newInstance(Class.forName("org.jfree.data.time.Month"));
        setField(term119969, term119969.getClass(), "period", term119997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term119969;
        try {
            callMethod(klass, "add", argTypes, term119851, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


