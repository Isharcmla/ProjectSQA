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

public class BasicMonthOfYearDateTimeField_add_1905304068371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104396;
     Object term104454;

    public BasicMonthOfYearDateTimeField_add_1905304068371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104396 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term104454 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term104532 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term104620 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        Object term104722 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfYearDateTimeField"));
        Object term104806 = newInstance(Class.forName("org.joda.time.field.MillisDurationField"));
        setField(term104722, term104722.getClass(), "iUnitField", term104806);
        setField(term104620, term104620.getClass(), "iField", term104722);
        setField(term104532, term104532.getClass(), "iYear", term104620);
        setField(term104454, term104454.getClass(), "iChronology", term104532);
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
        args[0] = term104454;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term104396, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


