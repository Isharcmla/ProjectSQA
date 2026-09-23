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

public class BasicMonthOfYearDateTimeField_add_1905304068519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219268;
     Object term219326;

    public BasicMonthOfYearDateTimeField_add_1905304068519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219268 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term219326 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term219404 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term219504 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term219588 = newInstance(Class.forName("org.joda.time.field.MillisDurationField"));
        Object term219688 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term219768 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        setField(term219504, term219504.getClass(), "iDurationField", term219588);
        setField(term219404, term219404.getClass(), "iYear", term219504);
        setField(term219688, term219688.getClass(), "iChronology", term219768);
        setField(term219404, term219404.getClass(), "iMonthOfYear", term219688);
        setField(term219326, term219326.getClass(), "iChronology", term219404);
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
        args[0] = term219326;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term219268, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


