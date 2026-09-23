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

public class BasicMonthOfYearDateTimeField_add_1905304068488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193467;
     Object term193525;

    public BasicMonthOfYearDateTimeField_add_1905304068488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193467 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term193525 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term193609 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        Object term193713 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term193799 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        Object term193919 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term194023 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term193799, term193799.getClass(), "iType", term193919);
        setField(term193713, term193713.getClass(), "iUnitField", term193799);
        setField(term193609, term193609.getClass(), "iYear", term193713);
        setField(term193609, term193609.getClass(), "iMonthOfYear", term194023);
        setField(term193525, term193525.getClass(), "iChronology", term193609);
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
        args[0] = term193525;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term193467, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


