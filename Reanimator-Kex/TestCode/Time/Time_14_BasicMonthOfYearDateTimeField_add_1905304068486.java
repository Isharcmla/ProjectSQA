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

public class BasicMonthOfYearDateTimeField_add_1905304068486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192529;
     Object term192587;

    public BasicMonthOfYearDateTimeField_add_1905304068486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192529 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term192587 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term192671 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        Object term192775 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term192869 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term192975 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term192869, term192869.getClass(), "iType", null);
        setField(term192775, term192775.getClass(), "iUnitField", term192869);
        setField(term192671, term192671.getClass(), "iYear", term192775);
        setField(term192671, term192671.getClass(), "iMonthOfYear", term192975);
        setField(term192587, term192587.getClass(), "iChronology", term192671);
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
        args[0] = term192587;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term192529, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


