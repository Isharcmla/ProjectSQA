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

public class BasicMonthOfYearDateTimeField_add_1905304068477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185144;
     Object term185202;

    public BasicMonthOfYearDateTimeField_add_1905304068477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185144 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term185202 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term185280 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term185380 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term185496 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        Object term185616 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term185732 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        setField(term185496, term185496.getClass(), "iType", term185616);
        setField(term185380, term185380.getClass(), "iDurationField", term185496);
        setField(term185280, term185280.getClass(), "iYear", term185380);
        setField(term185280, term185280.getClass(), "iMonthOfYear", term185732);
        setField(term185202, term185202.getClass(), "iChronology", term185280);
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
        args[0] = term185202;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term185144, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


