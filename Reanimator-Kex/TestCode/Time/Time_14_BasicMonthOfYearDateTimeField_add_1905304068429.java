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

public class BasicMonthOfYearDateTimeField_add_1905304068429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151040;
     Object term151098;

    public BasicMonthOfYearDateTimeField_add_1905304068429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151040 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term151098 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term151176 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term151276 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term151392 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        Object term151512 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term151612 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term151698 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term151392, term151392.getClass(), "iType", term151512);
        setField(term151276, term151276.getClass(), "iDurationField", term151392);
        setField(term151176, term151176.getClass(), "iYear", term151276);
        setField(term151612, term151612.getClass(), "iChronology", term151698);
        setField(term151176, term151176.getClass(), "iMonthOfYear", term151612);
        setField(term151098, term151098.getClass(), "iChronology", term151176);
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
        args[0] = term151098;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term151040, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


