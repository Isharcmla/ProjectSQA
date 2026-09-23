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

public class TimeSeries_add_1505136783297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90420;
     Object term90538;

    public TimeSeries_add_1505136783297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term90456 = Class.forName((String) "org.jfree.data.resources.DataPackageResources_fr");
        term90420 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term90420, term90420.getClass(), "timePeriodClass", term90456);
        term90538 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term90564 = newInstance(Class.forName("org.jfree.data.time.Day"));
        setField(term90538, term90538.getClass(), "period", term90564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term90538;
        try {
            callMethod(klass, "add", argTypes, term90420, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


