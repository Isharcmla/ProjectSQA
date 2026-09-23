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

public class TimeSeries_add_1505136783319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106607;
     Object term106725;

    public TimeSeries_add_1505136783319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term106643 = Class.forName((String) "java.lang.ApplicationShutdownHooks$1");
        term106607 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term106607, term106607.getClass(), "timePeriodClass", term106643);
        term106725 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term106755 = newInstance(Class.forName("org.jfree.data.time.Quarter"));
        setField(term106725, term106725.getClass(), "period", term106755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term106725;
        try {
            callMethod(klass, "add", argTypes, term106607, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


