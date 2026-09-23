package org.joda.time.chrono;

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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicMonthOfYearDateTimeField_getDifferenceAsLong_678434483345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90969;

    public BasicMonthOfYearDateTimeField_getDifferenceAsLong_678434483345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90969 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        Object term91051 = newInstance(Class.forName("org.joda.time.chrono.IslamicChronology"));
        setField(term90969, term90969.getClass(), "iChronology", term91051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = 9223372036854775806L;
        args[1] = -9223372036854775808L;
        callMethod(klass, "getDifferenceAsLong", argTypes, term90969, args);
    }

};


