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

public class BasicMonthOfYearDateTimeField_add_1905304068514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211911;
     Object term211969;

    public BasicMonthOfYearDateTimeField_add_1905304068514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211911 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term211969 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term212047 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term212131 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        Object term212235 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term212347 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        setField(term212235, term212235.getClass(), "iUnitField", term212347);
        setField(term212131, term212131.getClass(), "iField", term212235);
        setField(term212047, term212047.getClass(), "iYear", term212131);
        setField(term211969, term211969.getClass(), "iChronology", term212047);
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
        args[0] = term211969;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term211911, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


