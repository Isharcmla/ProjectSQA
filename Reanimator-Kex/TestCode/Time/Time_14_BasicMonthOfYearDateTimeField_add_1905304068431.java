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

public class BasicMonthOfYearDateTimeField_add_1905304068431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152862;
     Object term152920;

    public BasicMonthOfYearDateTimeField_add_1905304068431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152862 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term152920 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term153000 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        Object term153100 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term153212 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        setField(term153100, term153100.getClass(), "iDurationField", term153212);
        setField(term153000, term153000.getClass(), "iYear", term153100);
        setField(term152920, term152920.getClass(), "iChronology", term153000);
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
        args[0] = term152920;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term152862, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


