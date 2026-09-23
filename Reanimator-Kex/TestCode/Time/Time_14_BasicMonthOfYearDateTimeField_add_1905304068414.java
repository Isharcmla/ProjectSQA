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
import java.lang.NullPointerException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicMonthOfYearDateTimeField_add_1905304068414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138119;
     Object term138177;

    public BasicMonthOfYearDateTimeField_add_1905304068414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138119 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term138177 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term138259 = newInstance(Class.forName("org.joda.time.chrono.IslamicChronology"));
        Object term138359 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term138453 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term138359, term138359.getClass(), "iDurationField", term138453);
        setField(term138259, term138259.getClass(), "iYear", term138359);
        setField(term138177, term138177.getClass(), "iChronology", term138259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term138177;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term138119, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


