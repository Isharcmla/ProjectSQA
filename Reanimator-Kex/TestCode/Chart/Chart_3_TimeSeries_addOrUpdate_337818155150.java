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

public class TimeSeries_addOrUpdate_337818155150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24281;
     Object term24359;

    public TimeSeries_addOrUpdate_337818155150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24281 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        term24359 = newInstance(Class.forName("org.jfree.data.time.FixedMillisecond"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term24359;
        args[1] = null;
        callMethod(klass, "addOrUpdate", argTypes, term24281, args);
    }

};


