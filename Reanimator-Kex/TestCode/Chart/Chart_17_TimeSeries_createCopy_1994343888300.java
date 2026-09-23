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

public class TimeSeries_createCopy_1994343888300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93055;
     Object term93139;

    public TimeSeries_createCopy_1994343888300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93055 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        term93139 = newInstance(Class.forName("org.jfree.data.time.Month"));
        setIntField(term93139, term93139.getClass(), "year", 0);
        setIntField(term93139, term93139.getClass(), "month", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        Object[] args = new Object[2];
        args[0] = term93139;
        args[1] = term93139;
        callMethod(klass, "createCopy", argTypes, term93055, args);
    }

};


