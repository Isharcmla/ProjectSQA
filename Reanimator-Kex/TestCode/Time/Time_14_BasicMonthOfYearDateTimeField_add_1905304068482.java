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

public class BasicMonthOfYearDateTimeField_add_1905304068482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187709;
     Object term187767;

    public BasicMonthOfYearDateTimeField_add_1905304068482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187709 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term187767 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term187845 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term187929 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        Object term188033 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term188117 = newInstance(Class.forName("org.joda.time.field.ScaledDurationField"));
        setField(term188033, term188033.getClass(), "iUnitField", term188117);
        setField(term187929, term187929.getClass(), "iField", term188033);
        setField(term187845, term187845.getClass(), "iYear", term187929);
        setField(term187767, term187767.getClass(), "iChronology", term187845);
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
        args[0] = term187767;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term187709, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


