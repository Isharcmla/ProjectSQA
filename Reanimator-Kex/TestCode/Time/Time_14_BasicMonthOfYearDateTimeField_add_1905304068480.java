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

public class BasicMonthOfYearDateTimeField_add_1905304068480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186250;
     Object term186308;

    public BasicMonthOfYearDateTimeField_add_1905304068480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186250 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term186308 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term186392 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        Object term186496 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term186586 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        Object term186692 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term186586, term186586.getClass(), "iType", null);
        setField(term186496, term186496.getClass(), "iUnitField", term186586);
        setField(term186392, term186392.getClass(), "iYear", term186496);
        setField(term186392, term186392.getClass(), "iMonthOfYear", term186692);
        setField(term186308, term186308.getClass(), "iChronology", term186392);
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
        args[0] = term186308;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term186250, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


