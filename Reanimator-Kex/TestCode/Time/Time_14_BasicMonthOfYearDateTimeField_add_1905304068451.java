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

public class BasicMonthOfYearDateTimeField_add_1905304068451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165846;
     Object term165904;

    public BasicMonthOfYearDateTimeField_add_1905304068451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165846 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term165904 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term165982 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term166066 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        Object term166168 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfYearDateTimeField"));
        setField(term166066, term166066.getClass(), "iField", term166168);
        setField(term165982, term165982.getClass(), "iYear", term166066);
        setField(term165904, term165904.getClass(), "iChronology", term165982);
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
        args[0] = term165904;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term165846, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


