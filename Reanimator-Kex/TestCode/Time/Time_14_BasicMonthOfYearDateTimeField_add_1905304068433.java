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

public class BasicMonthOfYearDateTimeField_add_1905304068433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153698;
     Object term153756;

    public BasicMonthOfYearDateTimeField_add_1905304068433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153698 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term153756 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term153840 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        Object term153944 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term154034 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term153944, term153944.getClass(), "iUnitField", term154034);
        setField(term153840, term153840.getClass(), "iYear", term153944);
        setField(term153756, term153756.getClass(), "iChronology", term153840);
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
        args[0] = term153756;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term153698, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


