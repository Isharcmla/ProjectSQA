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

public class BasicMonthOfYearDateTimeField_add_1905304068506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208263;
     Object term208321;

    public BasicMonthOfYearDateTimeField_add_1905304068506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208263 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term208321 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term208403 = newInstance(Class.forName("org.joda.time.chrono.IslamicChronology"));
        Object term208503 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        Object term208589 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        setField(term208503, term208503.getClass(), "iDurationField", term208589);
        setField(term208403, term208403.getClass(), "iYear", term208503);
        setField(term208321, term208321.getClass(), "iChronology", term208403);
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
        args[0] = term208321;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term208263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


