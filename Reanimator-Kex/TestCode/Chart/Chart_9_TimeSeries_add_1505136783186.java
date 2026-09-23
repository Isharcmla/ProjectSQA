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

public class TimeSeries_add_1505136783186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40025;
     Object term40143;

    public TimeSeries_add_1505136783186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40061 = Class.forName((String) "java.lang.ref.Cleaner");
        term40025 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term40025, term40025.getClass(), "timePeriodClass", term40061);
        term40143 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term40171 = newInstance(Class.forName("org.jfree.data.time.Month"));
        setField(term40143, term40143.getClass(), "period", term40171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term40143;
        try {
            callMethod(klass, "add", argTypes, term40025, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


