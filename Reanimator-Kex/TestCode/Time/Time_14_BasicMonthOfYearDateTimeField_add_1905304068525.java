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

public class BasicMonthOfYearDateTimeField_add_1905304068525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222627;
     Object term222685;

    public BasicMonthOfYearDateTimeField_add_1905304068525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222627 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term222685 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term222769 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        Object term222873 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term222963 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        Object term223083 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term223179 = newInstance(Class.forName("org.joda.time.chrono.GJYearOfEraDateTimeField"));
        setField(term222963, term222963.getClass(), "iType", term223083);
        setField(term222873, term222873.getClass(), "iUnitField", term222963);
        setField(term222769, term222769.getClass(), "iYear", term222873);
        setField(term222769, term222769.getClass(), "iMonthOfYear", term223179);
        setField(term222685, term222685.getClass(), "iChronology", term222769);
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
        args[0] = term222685;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term222627, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


