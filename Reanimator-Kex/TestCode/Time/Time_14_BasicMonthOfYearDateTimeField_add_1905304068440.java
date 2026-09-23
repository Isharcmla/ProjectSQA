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

public class BasicMonthOfYearDateTimeField_add_1905304068440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159748;
     Object term159806;

    public BasicMonthOfYearDateTimeField_add_1905304068440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159748 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term159806 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term159884 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
        Object term159968 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        Object term160072 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term160188 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDurationField"));
        setField(term160072, term160072.getClass(), "iUnitField", term160188);
        setField(term159968, term159968.getClass(), "iField", term160072);
        setField(term159884, term159884.getClass(), "iYear", term159968);
        setField(term159806, term159806.getClass(), "iChronology", term159884);
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
        args[0] = term159806;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term159748, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


