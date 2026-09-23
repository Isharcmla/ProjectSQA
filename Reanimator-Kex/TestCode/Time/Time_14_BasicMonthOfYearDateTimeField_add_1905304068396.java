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

public class BasicMonthOfYearDateTimeField_add_1905304068396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125961;
     Object term126019;

    public BasicMonthOfYearDateTimeField_add_1905304068396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125961 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term126019 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term126097 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term126197 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term126313 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        Object term126433 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term126513 = newInstance(Class.forName("org.joda.time.field.SkipDateTimeField"));
        setField(term126313, term126313.getClass(), "iType", term126433);
        setField(term126197, term126197.getClass(), "iDurationField", term126313);
        setField(term126097, term126097.getClass(), "iYear", term126197);
        setField(term126097, term126097.getClass(), "iMonthOfYear", term126513);
        setField(term126019, term126019.getClass(), "iChronology", term126097);
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
        args[0] = term126019;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term125961, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


