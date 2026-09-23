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

public class TimeSeries_add_1505136783254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74325;
     Object term74443;

    public TimeSeries_add_1505136783254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74361 = Class.forName((String) "java.util.stream.Nodes$IntSpinedNodeBuilder");
        term74325 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term74325, term74325.getClass(), "timePeriodClass", term74361);
        term74443 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        Object term74470 = newInstance(Class.forName("org.jfree.data.time.Hour"));
        setField(term74443, term74443.getClass(), "period", term74470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term74443;
        callMethod(klass, "add", argTypes, term74325, args);
    }

};


