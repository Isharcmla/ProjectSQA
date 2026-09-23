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

public class BasicMonthOfYearDateTimeField_add_1905304068508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209067;
     Object term209125;

    public BasicMonthOfYearDateTimeField_add_1905304068508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209067 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term209125 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term209203 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term209291 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        Object term209393 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfYearDateTimeField"));
        Object term209505 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        setField(term209393, term209393.getClass(), "iUnitField", term209505);
        setField(term209291, term209291.getClass(), "iField", term209393);
        setField(term209203, term209203.getClass(), "iYear", term209291);
        setField(term209125, term209125.getClass(), "iChronology", term209203);
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
        args[0] = term209125;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term209067, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


