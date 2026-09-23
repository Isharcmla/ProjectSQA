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

public class TimeSeries_add_1298291569357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134268;
     Object term134386;

    public TimeSeries_add_1298291569357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term134304 = Class.forName((String) "java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet$UnmodifiableEntrySetSpliterator");
        term134268 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term134268, term134268.getClass(), "timePeriodClass", term134304);
        term134386 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term134416 = newInstance(Class.forName("org.jfree.data.time.Quarter"));
        setField(term134386, term134386.getClass(), "period", term134416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term134386;
        args[1] = false;
        try {
            callMethod(klass, "add", argTypes, term134268, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


